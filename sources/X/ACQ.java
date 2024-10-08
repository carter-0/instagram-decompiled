package X;

import android.os.Process;

public abstract class ACQ {
    public static final int[] A00 = {8224, 8224, 8224};

    public static final C381659c7 A00() {
        try {
            long[] jArr = new long[3];
            Class.forName("android.os.Process").getMethod("readProcFile", new Class[]{String.class, int[].class, String[].class, long[].class, float[].class}).invoke((Object) null, new Object[]{002.A0c("/proc/", "/schedstat", Process.myPid()), A00, null, jArr, null});
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            if (j == 0 && j2 == 0 && j3 == 0) {
                return null;
            }
            return new C381659c7(j, j2, j3, 0);
        } catch (Exception e) {
            0KC.A0G("SchedStatsCollector", "There was a problem accessing the schedstat data.", e);
            return null;
        }
    }
}
