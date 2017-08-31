package br.com.training.test;

import java.util.Collections;

import org.junit.Test;

public class TestPart1 {
	
	@Test
	public void TestPart1Vazio() {
		Part1 teste01 = new Part1();
		assert(teste01.vazio() == Collections.emptyList());
	}
	

}
