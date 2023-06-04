package telran.binary.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.additional1.NumberConverter;
class BinaryTest {
	@Test
	void toBinaryStr() {
		assertEquals("1010", NumberConverter.toBinaryStr(10));
		assertEquals("101", NumberConverter.toBinaryStr(5));
		assertEquals("0", NumberConverter.toBinaryStr(0));
		assertEquals("1100100", NumberConverter.toBinaryStr(100));


	}
	@Test
	void toBinaryString() {
		assertEquals("1010", Integer.toBinaryString(10));
		assertEquals("101", Integer.toBinaryString(5));
		assertEquals("0", NumberConverter.toBinaryStr(0));
		assertEquals("1100100", NumberConverter.toBinaryStr(100));
	}

}
