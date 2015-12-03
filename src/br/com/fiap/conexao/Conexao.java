/*  
    
    No seu banco de dados será necessário conter uma tabela
    chamada poo_orcamento, contendo as seguintes colunas:

    numeroOrcamento (number);
    cliente (varchar2);
    qtdPequena (number);
    qtdMedia (number);
    qtdGrande (number);
    regiao (varchar2);
    total (number);

    -
    Obs.: verifique abaixo as alterações necessárias nas informações
    de login de conexão com o banco.

    Obs 2.: o programa gera automaticamente o número do cliente,
    insira apenas as informações de compra.

    Obs 3.: clique em "editar" para realizar pesquisa.

    
*/

package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static Conexao conexao;
    private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static String login = "OPS$RMxxxxx"; //substituir xxxxx pelo seu RM
    private static String senha = "xxx"; //substituir xxx pela sua senha
    
    private Conexao() {        
    }
    
    public static Conexao getInstance() {
        if(conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        return DriverManager.getConnection(url, login, senha);
    }
}
