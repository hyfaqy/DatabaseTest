package com.baldurtech;

import com.baldurtech.unit.TestCase;

public class ContactRepositoryTest extends TestCase {
    public void test_����idɾ��ָ��Contact() {
    
        DatabaseManagerMock databaseManagerMock = new DatabaseManagerMock();
        ContactRepository contactRepository = new ContactRepository(databaseManagerMock);
        
        contactRepository.deleteContactById(1L);
        assertEquals("DELETE FROM contact WHERE id=1", databaseManagerMock.executeUpdateParam);
    }
}


    
