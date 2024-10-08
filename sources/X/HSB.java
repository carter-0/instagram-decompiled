package X;

public abstract class HSB {
    public static final long A00(long j, long j2, long j3) {
        if (j2 > 0) {
            long j4 = j - j2;
            if (0 <= j4 && j4 < 2001) {
                return j2;
            }
        }
        if (j3 <= 0) {
            return -1;
        }
        long j5 = j - j3;
        if (0 > j5 || j5 >= 2001) {
            return -1;
        }
        return j3;
    }
}
