package com.baldurtech;

import com.baldurtech.unit.TestCase;

public class ContactRepositoryTest extends TestCase {
    public void test_根据id删除指定Contact() {
    
        DatabaseManagerMock databaseManagerMock = new DatabaseManagerMock();
        ContactRepository contactRepository = new ContactRepository(databaseManagerMock);
        
        contactRepository.deleteContactById(1L);
        assertEquals("DELETE FROM contact WHERE id=1", databaseManagerMock.executeUpdateParam);
    }
    
    public void test_更新指定Contact() {
        
        DatabaseManagerMock databaseManagerMock = new DatabaseManagerMock();
        ContactRepository contactRepository = new ContactRepository(databaseManagerMock);
        
        Contact contact = new Contact();
        contact.setId(1L);
        contact.setName("Tom Hanks");
        contact.setMobile("13900001111");
        contact.setEmail("tom@baldurtech.com");

        contactRepository.updateContact(contact);
        assertEquals("UPDATE contact SET email='tom@baldurtech.com', home_address=NULL, job=NULL, job_level=NULL, memo=NULL, mobile='13900001111', name='Tom Hanks', office_address=NULL, vpmn=NULL WHERE id=1", databaseManagerMock.executeUpdateParam);
    }
}




    
