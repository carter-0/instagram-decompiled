package X;

public abstract class O5G {
    public static final String[] A00 = {"-r4096", "-n3"};
    public static final String[] A01;
    public static final String[] A02;

    static {
        String[] strArr = {"-v", "threadtime,year,zone", "msys", "*:S"};
        A02 = strArr;
        A01 = (String[]) 0Yw.A0a(new String[]{"logcat", "-d"}, strArr);
    }
}
