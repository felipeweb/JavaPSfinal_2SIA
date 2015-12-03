package br.com.fiap.dao;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.modelo.Orcamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {
    Connection connection = null;
    public void inserir(Orcamento orcamento){
        
        String sql = "INSERT  INTO poo_orcamento VALUES(?, ?, ?, ?, ?, ?, ?)";
        try{
            connection = Conexao.getInstance().getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            p.setDouble(1, orcamento.getNumeroOrcamento());
            p.setString(2, orcamento.getCliente());
            p.setInt(3, orcamento.getQtdPequena());
            p.setInt(4, orcamento.getQtdMedia());
            p.setInt(5, orcamento.getQtdGrande());
            p.setString(6, orcamento.getRegiao());
            p.setDouble(7, orcamento.getTotal());
            
            p.execute(); 
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        finally{
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public Orcamento pesquisar(int numeroOrcamento){
        String sql = "SELECT * FROM poo_orcamento WHERE NUMEROORCAMENTO = ?";
        Orcamento orcamento = null;
        try{
            connection = Conexao.getInstance().getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            p.setInt(1, numeroOrcamento);
            ResultSet rs = p.executeQuery();
            
            
            while(rs.next()){
                String cliente = rs.getString("cliente");
                int qtdPequena = rs.getInt("qtdPequena");
                int qtdMedia = rs.getInt("qtdMedia");
                int qtdGrande = rs.getInt("qtdGrande");
                String regiao = rs.getString("regiao");
                Double total = rs.getDouble("total");
                
                total = (double) qtdPequena*20000 + qtdGrande*30000 + qtdGrande*50000;
                
                orcamento = new Orcamento(numeroOrcamento, cliente, qtdPequena, qtdMedia, qtdGrande, regiao, total);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        finally{
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return orcamento;
    }
    
    public void excluir(int numeroOrcamento){
        String sql = "DELETE FROM poo_orcamento WHERE NUMEROORCAMENTO = ?";
     try{
            connection = Conexao.getInstance().getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            p.setInt(1,numeroOrcamento);
            p.execute();
        }
     catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        finally{
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void alterar(Orcamento orcamento){
        String sql = "UPDATE poo_orcamento SET cliente=?, qtdPequena=?, qtdMedia=?, qtdGrande=?, regiao=?, total=? WHERE NUMEROORCAMENTO=?";
        
        try{
            connection = Conexao.getInstance().getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            
            p.setString(1, orcamento.getCliente());
            p.setInt(2, orcamento.getQtdPequena());
            p.setInt(3, orcamento.getQtdMedia());
            p.setInt(4, orcamento.getQtdGrande());
            p.setString(5, orcamento.getRegiao());
            p.setDouble(6, orcamento.getTotal());
            p.setDouble(7, orcamento.getNumeroOrcamento());
            
            p.execute(); //pode se usar o executeUpdate, nunca diferença é que o Update retorna o número de linha
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        finally{
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    

}
