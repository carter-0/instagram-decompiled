package X;

import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4x5  reason: invalid class name and case insensitive filesystem */
public final class C278544x5 {
    public static final C278544x5 A05 = new C278544x5(2);
    public static final C278544x5 A06 = new C278544x5(3);
    public static final List A07 = Arrays.asList(new String[]{"SM-N770F", "SM-A515F"});
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02 = false;
    public final int A03;
    public final Object A04 = new Object();

    public static void A00(C278544x5 r7, boolean z) {
        if (!A07.contains(Build.MODEL)) {
            Object obj = r7.A04;
            synchronized (obj) {
                if (r7.A00 == 0) {
                    Thread thread = new Thread(new C278554x6(r7));
                    thread.setDaemon(true);
                    thread.start();
                    r7.A00 = 1;
                }
                if (z) {
                    long j = 500;
                    while (r7.A00 != 2 && j > 0) {
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            obj.wait(j);
                            j -= System.currentTimeMillis() - currentTimeMillis;
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public C278544x5(int i) {
        this.A03 = i;
        if (A07.contains(Build.MODEL) && i == 2) {
            this.A02 = true;
        }
    }
}
