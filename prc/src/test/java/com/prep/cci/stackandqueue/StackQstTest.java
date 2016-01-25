package com.prep.cci.stackandqueue;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.prep.cci.stackandqueue.StackQst.StackArrayDevideImpl;
import com.prep.cci.stackandqueue.StackQst.StackArrayDevideImplSE;
import com.prep.cci.stackandqueue.StackQst.StackOfStack;

public class StackQstTest {
	StackQst testClass = new StackQst();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Ignore
	public void testStackArrayDevideImpl() {
		StackArrayDevideImpl stack = new StackArrayDevideImpl(10, 3);
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 5; j++) {
				stack.push(j, i);
			}
		}
	}

	@Test
	@Ignore
	public void testStackArrayDevideImplSE() {
		StackArrayDevideImplSE stack = new StackArrayDevideImplSE(20, 3);
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 19; j++) {
				stack.push(j, i);
			}
		}
		System.out.println("test finished");
	}

	@Test
	@Ignore
	public void testStackArrayDevideImplSEMInElem() {
		StackArrayDevideImplSE stack = new StackArrayDevideImplSE(20, 1);
		Random ran = new Random();
		for (int j = 1; j < 18; j++) {
			int item = ran.nextInt(50);
			System.out.println("Inserting element:" + item);
			stack.push(item, 0);
			System.out.println("MIn:" + stack.getMin(0).getItem());
		}

		for (int j = 1; j < 18; j++) {
			stack.pop(0);
			System.out.println("MIn:" + stack.getMin(0).getItem());
		}

		System.out.println("test finished");
	}

	@Test
	public void testStackOfStack() {
		StackOfStack stack = new StackOfStack();
		Random ran = new Random();
		for (int j = 1; j < 18; j++) {
			int item = ran.nextInt(50);
			System.out.println("Inserting element:" + item);
			stack.push(item);
		}
        System.out.println(stack.popAt(0));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
		System.out.println("test finished");
	}

}
