package model.dao;

import java.sql.Connection;
import java.sql.CallableStatement;
import model.AdminBean;
import model.DBConnection;

public class AdminLoginDAO {

    AdminBean ab = null;

    public AdminBean login(int adminId, String password) {
        try {
            Connection con = DBConnection.getCon();

            // Using CallableStatement to call the procedure
            CallableStatement cs = con.prepareCall("{call sms_proc_retrieve_admin(?,?,?,?,?)}");

            // Setting input parameters
            cs.setInt(1, adminId);
            cs.setString(2, password);

            // Registering output parameters
            cs.registerOutParameter(3, java.sql.Types.VARCHAR); // first_name
            cs.registerOutParameter(4, java.sql.Types.VARCHAR); // last_name
            cs.registerOutParameter(5, java.sql.Types.VARCHAR); // email
            cs.registerOutParameter(6, java.sql.Types.VARCHAR); // phone_number

            // Executing the procedure
            cs.execute();

            // Retrieving output parameters
            String firstName = cs.getString(3);
            String lastName = cs.getString(4);
            String email = cs.getString(5);
            String phoneNumber = cs.getString(6);

            if (firstName != null && lastName != null) {
                ab = new AdminBean();
                ab.setAdminId(adminId);
                ab.setPassword(password);
                ab.setFirstName(firstName);
                ab.setLastName(lastName);
                ab.setEmail(email);
                ab.setPhoneNumber(phoneNumber);
                return ab;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ab;
    }
}
