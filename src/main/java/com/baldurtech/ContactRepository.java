package com.baldurtech;

public class ContactRepository {
    
    DatabaseManager db;
    
    public ContactRepository(DatabaseManager db) {
        this.db = db;
    }
    
    public void deleteContactById(Long id) {
    
        db.executeUpdate("DELETE FROM contact WHERE id=" + id);
    }
    
    public void updateContact(Contact contact) {
    
        String sql = "UPDATE contact SET email=?, home_address=?, job=?, job_level=?, memo=?, mobile=?, name=?, office_address=?, vpmn=? WHERE id=?";
        db.executeUpdate(sql, contact.getEmail()
                         , contact.getHomeAddress()
                         , contact.getJob()
                         , contact.getJobLevel()
                         , contact.getMemo()
                         , contact.getMobile()
                         , contact.getName()
                         , contact.getOfficeAddress()
                         , contact.getVpmn()
                         , contact.getId());
    }
}