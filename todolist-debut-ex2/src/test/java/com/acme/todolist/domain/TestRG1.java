package com.acme.todolist.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;

import com.acme.todolist.domain.TodoItem;

import org.junit.Test;
import junit.framework.TestCase;

public class TestRG1 extends TestCase {

private static final String LATE = "[LATE!] ";

	@Test
	public void testRG1Late() throws Exception {
		 
		assertEquals(true, this.createTestItem().minusSeconds(86400).finalContent().contains(LATE));
	    
	}
  
	@Test
	public void testRG1NotLate() throws Exception {
		assertEquals(true, ! this.createTestItem().plusSeconds(86400).finalContent().contains(LATE));
	}
  
	public TodoItem createTestItem(){
		Instant time = Instant.now();
		TodoItem testTodoItem = new TodoItem("0f8-06eb17ba8d34",time,"Faire les courses");
		return testTodoItem;
	}
  
}