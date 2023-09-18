package utils;

public class Alignment
{
    public static String alignRight(String s, int width)
    {
        return String.format("%" + width + "s", s);
    }
}
