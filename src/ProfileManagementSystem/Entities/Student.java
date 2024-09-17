/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProfileManagementSystem.Entities;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student {

    public final int id;
    public final String first_name;
    public final String last_name;
    public final String middle_name;
    public final int age;
    public final String strand;
    public final int level;
    public final int section;
    public final Date birthday;
    public final String school_id;
    public final String contact_info;
    public final String email;
    public final String g10school;
    public final String permanent_address;
    public final String residence;
    public final String province;
    public final String city;
    public final String barangay;
    public final String picture;
    public final int zipcode;
    

    public Student(
            int id,
            String first_name,
            String last_name,
            String middle_name,
            int age,
            String strand,
            int level,
            int section,
            Date birthday,
            String school_id,
            String contact_info,
            String email,
            String g10school,
            String permanent_address,
            String residence,
            String province,
            String city,
            String barangay,
            int zipcode,
            String picture
    ) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.age = age;
        this.strand = strand;
        this.level = level;
        this.section = section;
        this.birthday = birthday;
        this.school_id = school_id;
        this.contact_info = contact_info;
        this.email = email;
        this.g10school = g10school;
        this.permanent_address = permanent_address;
        this.residence = residence;
        this.province = province;
        this.city = city;
        this.barangay = barangay;
        this.zipcode= zipcode;
        this.picture = picture;
           
    }
    
    public static Student fromResultSet(ResultSet rs) throws SQLException {
        return new Student(
                rs.getInt("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("middle_name"),
                rs.getInt("age"),
                rs.getString("strand"),
                rs.getInt("level"),
                rs.getInt("section"),
                rs.getDate("birthday"),
                rs.getString("school_id"),
                rs.getString("contact_info"),
                rs.getString("email"),
                rs.getString("former_school"),
                rs.getString("permanent_address"),
                rs.getString("present_address"),
                rs.getString("province"),
                rs.getString("city"),
                rs.getString("barangay"),
                rs.getInt("zip_code"),
                rs.getString("picture")
        );
    }
}
