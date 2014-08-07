package com.baldurtech;

import com.baldurtech.unit.TestCase;

public class ContactRepositoryTest extends TestCase {
    public void test_根据id删除指定Contact() {
    
        DatabaseManagerMock databaseManagerMock = new DatabaseManagerMock();
        ContactRepository contactRepository = new ContactRepository(databaseManagerMock);
        
        contactRepository.deleteContactById(1L);
        assertEquals("DELETE FROM contact WHERE id=1", databaseManagerMock.executeUpdateParam);
    }
}


    
