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
    
        db.executeUpdate("UPDATE contact SET email='tom@baldurtech.com', home_address=NULL, job=NULL, job_level=NULL, memo=NULL, mobile='13900001111', name='Tom Hanks', office_address=NULL, vpmn=NULL WHERE id=1");  
    
    }
}