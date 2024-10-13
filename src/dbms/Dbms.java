package dbms;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dbms {
    Connection con;
    Statement st;
    ResultSet rs;
    Dbms() 
    {
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=dbms;user=dbms;password=dbms"); 

            st=con.createStatement();
             System.out.println("dbms connected");
            
        } catch (Exception e) {
            System.out.println(e);
        }
            
           

    
}
    
    public int train_info(String t_code, String t_name, String froms, String tos, String departure, String arrival, String total_time, String total_stops, int ticket_price, String pub_time, String pub_date)
    {
          
   
    int   status=0;
      
             
        try {
            String sql="insert into train_info values('"+t_code+"','"+t_name+"','"+froms+"','"+tos+"','"+departure+"','"+arrival+"','"+total_time+"','"+total_stops+"','"+ticket_price+"','"+pub_time+"','"+pub_date+"') ";
            status=st.executeUpdate(sql);
            status=1;
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
       
        
        return status;
    }
    
      public int updatetrain(String t_code, String attribute, String update_ans) {
       int s=0;
    try {
        String sql = "UPDATE train_info SET " + attribute + " = '" + update_ans + "' WHERE t_code = '" + t_code + "'";

//        String sql= "Update train_info set '"+attribute+"'='"+update_ans+"' where t_code='"+t_code+"'";
        s= st.executeUpdate(sql);
        
    } catch (SQLException ex) {
        System.out.println(ex);    }
      return s;
  }
      
                 public int deletetrain(String t_code){
int s=0;
        try {
            String sql="delete from train_info where t_code='"+t_code+"' ";
            System.out.println(sql);
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
     return s;

}
       
        public  ResultSet displaytrain() 
  {
    try {
        String sql= "select * from train_info";
        rs= st.executeQuery(sql);
    } catch (SQLException ex) {
        System.out.println(ex);    }
      return rs;
  }

    
           public  ResultSet searchtrains(String froms, String tos) 
  {
    try {
        String sql= "select * from train_info where (froms='"+froms+"') AND (tos='"+tos+"')";
        rs= st.executeQuery(sql);
    } catch (SQLException ex) {
        System.out.println(ex);    }
      return rs;
  }
        
        /////////////////////////////////////////////////////////////////////////
      
 
    public static void main(String[] args)
    {
     
    }
       
    }
    

