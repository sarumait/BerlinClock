package com.sa.berlinclock;

public class BerlinClock 
{
	public String showTime(int hour, int minutes, int seconds)
	{		
		String secondsLamp = "O";
		if(seconds % 2 == 0)
			secondsLamp = "Y";
		
		String fiveHourRow;
		int howManyFiveHours = hour /5;
		switch(howManyFiveHours)
		{
			case 0:
				fiveHourRow = "OOOO";
				break;
			case 1:
				fiveHourRow = "ROOO";
				break;
			case 2:
				fiveHourRow = "RROO";
				break;
			case 3:
				fiveHourRow = "RRRO";
				break;
			default:
				fiveHourRow = "RRRR";
				break;
		}
		
		String oneHourRow;
		int howManyOneHours = hour % 5;
		switch(howManyOneHours)
		{
			case 0:
				oneHourRow = "OOOO";
				break;
			case 1:
				oneHourRow = "ROOO";
				break;
			case 2:
				oneHourRow = "RROO";
				break;
			case 3:
				oneHourRow = "RRRO";
				break;
			default:
				oneHourRow = "RRRR";
				break;
		}
		
		String fiveMinutes;
		int howManyFiveMinutes = (minutes % 15) / 5;
		switch(howManyFiveMinutes)
		{
			case 0:
				fiveMinutes = "OO";
				break;
			case 1:
				fiveMinutes = "YO";
				break;
			default:
				fiveMinutes = "YY";
				break;
		}
		
		
		String fiveMinuteRow;
		int howManyFifteenMinutes = minutes / 15;
		switch (howManyFifteenMinutes) 
		{
			case 0:
				fiveMinuteRow = fiveMinutes + "OOOOOOOOO";
				break;
			case 1:
				fiveMinuteRow = "YYR" + fiveMinutes + "OOOOOO";
				break;
			case 2:
				fiveMinuteRow = "YYRYYR" + fiveMinutes + "OOO";
				break;
			default:
				fiveMinuteRow = "YYRYYRYYR" + fiveMinutes;
				break;
		}
		
		String oneMinuteRow;
		int howManyOneMinutes = minutes % 5;
		switch (howManyOneMinutes) 
		{
			case 0:
				oneMinuteRow = "OOOO";
				break;
			case 1:
				oneMinuteRow = "YOOO";
				break;
			case 2:
				oneMinuteRow = "YYOO";
				break;
			case 3:
				oneMinuteRow = "YYYO";
				break;
			default:
				oneMinuteRow= "YYYY";
				break;
		}
		
		return secondsLamp + " " + fiveHourRow + " " + oneHourRow + " " + fiveMinuteRow + " " + oneMinuteRow;
	}
}
