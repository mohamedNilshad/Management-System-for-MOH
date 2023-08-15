package dataValidation;

import com.moh.DBConnection.DatabaseMoh;
import com.moh.form.sphiProfile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Validation {

    private int NoY;
    private int NoD;
    private String DiseaseName;
    private String serialNum;

    //password Encryption
    public String PassEncrypt(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");

        byte[] messageDigest = md.digest(password.getBytes());
        BigInteger bigInt = new BigInteger(1, messageDigest);

        String Enpass = bigInt.toString(16);

        return Enpass;

    }

    // Function to check email id is
    // valid or not
    public boolean emailValid(String em) {

        char[] email = new char[em.length()];

        // Copy character by character into array
        for (int i = 0; i < em.length(); i++) {
            email[i] = em.charAt(i);
        }

        // Check the first character is an alphabet or not
        if (!isChar(email[0])) {
            // If it's not an alphabet email id is not valid
            return false;
        }

        // Variable to store position of At and Dot
        int At = -1, Dot = -1;

        // Traverse over the email id
        // string to find position of  Dot and At
        for (int i = 0; i < email.length; i++) {

            // If the character is '@'
            if (email[i] == '@') {
                At = i;
            } // If character is '.'
            else if (email[i] == '.') {
                Dot = i;
            }
        }

        // If At or Dot is not present
        if (At == -1 || Dot == -1) {
            return false;
        }

        // If Dot is present before At
        if (At > Dot) {
            return false;
        }

        // If Dot is present at the end
        return !(Dot >= (email.length - 1));

    }

    // Function to check the character
    // is an alphabet or not
    private boolean isChar(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }

    // Function to check the character
    // is an digit or not
    private boolean isDigit(final char c) {
        return (c >= '0' && c <= '9');
    }

    //CreateserialNumber
    public String getSerial(String d, int dInd) throws Exception {
        LocalDate currentYear = LocalDate.now();
        DatabaseMoh Db = new DatabaseMoh();
        
        ResultSet se, se1, se2;

        int cYear = currentYear.getYear();
        int DIndex = dInd;
        //DIndex++;
        //System.out.println(DIndex + " " + cYear );
        try {//NoOfYear

            se = Db.getCount("SELECT count(Serial_No) AS pCount FROM patient WHERE year = '" + cYear + "'");
            se.next();
            NoY = se.getInt("pCount");
            NoY++;

        } catch (Exception ex) {
            Logger.getLogger(sphiProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

         try {//nameOfDisease

            se2 = Db.getCount("SELECT shortName FROM disease WHERE d_ID = '" + DIndex + "'");
            se2.next();
            DiseaseName = se2.getString("shortName");
          

        } catch (Exception ex) {
            Logger.getLogger(sphiProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //DiseaseName = d;
         //DiseaseName ;


        try {//NoOfDisease

            se1 = Db.getCount("SELECT count(Serial_No) AS pDCount FROM patient WHERE year = '" + cYear + "' AND disease_ID = '" + DIndex + "'");
            se1.next();
            NoD = se1.getInt("pDCount");
            NoD++;

        } catch (Exception ex) {
            Logger.getLogger(sphiProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        serialNum = NoY + "/" + DiseaseName + "/" + NoD;

        return serialNum;

    }
}
