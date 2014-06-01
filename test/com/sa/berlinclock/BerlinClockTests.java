package com.sa.berlinclock.test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sa.berlinclock.BerlinClock;

public class BerlinClockTests 
{
	private BerlinClock _clock;

	@Before
	public void setUp()
	{
		_clock = new BerlinClock();
	}
	
	@Test
	public void test_00_00_00()
	{
		assertEquals("Y OOOO OOOO OOOOOOOOOOO OOOO", _clock.showTime(0, 0, 0));
	}
	
	@Test
	public void test_13_17_01()
	{
		assertEquals("O RROO RRRO YYROOOOOOOO YYOO", _clock.showTime(13, 17, 1));
	}
	
	@Test
	public void test_23_59_59()
	{
		assertEquals("O RRRR RRRO YYRYYRYYRYY YYYY", _clock.showTime(23, 59, 59));
	}
	
	/*
	 * This is weird, shouldn't this produce the same result as the test case for 00:00:00??
	 */
	@Test
	public void test_24_00_00()
	{
		assertEquals("Y RRRR RRRR OOOOOOOOOOO OOOO", _clock.showTime(24, 00, 00));
	}
}
