package X;

import android.os.SystemClock;

public abstract class PyL {
    public static void A00(PyF pyF, long j) {
        Object obj = pyF.A03;
        synchronized (obj) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = 0;
            while (!pyF.A02 && j2 >= 0 && j2 < j) {
                obj.wait(j - j2);
                j2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            }
        }
    }
}
