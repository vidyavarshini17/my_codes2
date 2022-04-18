import java.sql.*; //step 1 import package

public class remove {
public static void main(String[] args) throws Exception {

    //Class.forName("com.mysql.jdbc.Driver"); //step 2 load and register driver class
    String url="jdbc:mysql://localhost:3306/SI";

    Connection conn=DriverManager.getConnection(url,"root","Vidya@2001"); //step 3 establish connection

    Statement s=conn.createStatement(); // step 4 create statement object

    String sql="delete from student where id=6";

    int r=s.executeUpdate(sql); //perform operation, r has the value of the number of rows affected

    ResultSet rs=s.executeQuery("select * from student");

    while(rs.next()){
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
    }

    if(r>=1){
        System.out.println("Data deletion Successful");
    }
    else{
        System.out.println("Data deletion Failed");
    }

    s.close(); //close statement object

    conn.close(); //close connection object
}
    
}
