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
        assertEquals("UPDATE contact SET email=?, home_address=?, job=?, job_level=?, memo=?, mobile=?, name=?, office_address=?, vpmn=? WHERE id=?", databaseManagerMock.executeUpdateParam);
        assertEquals(new Object[]{"tom@baldurtech.com", null, null, null, null, "13900001111", "Tom Hanks", null, null, 1L}, 
            databaseManagerMock.executeUpdateParam2);
    }
}




    
