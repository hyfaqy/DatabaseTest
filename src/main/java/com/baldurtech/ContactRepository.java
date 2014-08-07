package com.baldurtech;

public class ContactRepository {
    
    DatabaseManager db;
    
    public ContactRepository(DatabaseManager db) {
        this.db = db;
    }
    
    public void deleteContactById(Long id) {
    
        db.executeUpdate("DELETE FROM contact WHERE id=" + id);
    }
}