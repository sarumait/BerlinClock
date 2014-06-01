package com.sa.berlinclock;

public class BerlinClock 
{
	public String showTime(int hour, int minutes, int seconds)
	{		
		String secondsLamp = getSecondsLamp(seconds);
		String fiveHourLightRow = getFiveHourLightRow(hour);
		String oneHourLightRow = getOneHourLightRow(hour);
		String fifteenMinuteLightRow = getFifteenMinuteLightRow(minutes);
		String oneMinuteLightRow = getOneMinuteLightRow(minutes);
		
		return secondsLamp + " " + fiveHourLightRow + " " + oneHourLightRow + " " + fifteenMinuteLightRow + " " + oneMinuteLightRow;
	}
	
	private String getSecondsLamp(int seconds) 
	{
		if(seconds % 2 == 0)
		{
			return "Y";
		}
		else
		{
			return "O";
		}
	}
	
	private String getFiveHourLightRow(int hour) 
	{
		int howManyFiveHourLightsShouldShow = hour /5;
		switch(howManyFiveHourLightsShouldShow)
		{
			case 0:
				return "OOOO";
			case 1:
				return "ROOO";
			case 2:
				return "RROO";
			case 3:
				return "RRRO";
			default:
				return "RRRR";
		}
	}

	private String getOneHourLightRow(int hour) 
	{
		int howManyOneHourLightShouldShow = hour % 5;
		switch(howManyOneHourLightShouldShow)
		{
			case 0:
				return "OOOO";
			case 1:
				return "ROOO";
			case 2:
				return "RROO";
			case 3:
				return "RRRO";
			default:
				return "RRRR";
		}
	}

	private String getFifteenMinuteLightRow(int minutes)
	{
		String tenMinuteLightSegment;
		int howManyFiveMinuteLightSegmentsShown = (minutes % 15) / 5;
		switch(howManyFiveMinuteLightSegmentsShown)
		{
			case 0:
				tenMinuteLightSegment = "OO";
				break;
			case 1:
				tenMinuteLightSegment = "YO";
				break;
			default:
				tenMinuteLightSegment = "YY";
				break;
		}
		
		
		int howManyFifteenMinuteSegmentsShown = minutes / 15;
		switch (howManyFifteenMinuteSegmentsShown) 
		{
			case 0:
				return tenMinuteLightSegment + "OOOOOOOOO";
			case 1:
				return "YYR" + tenMinuteLightSegment + "OOOOOO";
			case 2:
				return "YYRYYR" + tenMinuteLightSegment + "OOO";
			default:
				return "YYRYYRYYR" + tenMinuteLightSegment;
		}
	}

	private String getOneMinuteLightRow(int minutes) 
	{
		int howManyOneMinutes = minutes % 5;
		switch (howManyOneMinutes) 
		{
			case 0:
				return "OOOO";
			case 1:
				return "YOOO";
			case 2:
				return "YYOO";
			case 3:
				return "YYYO";
			default:
				return "YYYY";
		}
	}
}
