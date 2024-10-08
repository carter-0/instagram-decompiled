package X;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SO9 {
    public static final File A03 = AnonymousClass7TE.A0t("/proc/self/fd");
    public static final boolean A04 = AnonymousClass7TF.A1T(Build.VERSION.SDK_INT, 29);
    public static volatile SO9 A05;
    public int A00;
    public boolean A01 = true;
    public final AtomicBoolean A02 = JTQ.A0k();

    public final boolean A01(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z && ((!A04 || this.A02.get()) && !z2 && i >= 0 && i2 >= 0)) {
            synchronized (this) {
                boolean z4 = true;
                int i3 = this.A00 + 1;
                this.A00 = i3;
                if (i3 >= 50) {
                    this.A00 = 0;
                    int length = A03.list().length;
                    if (((long) length) >= 20000) {
                        z4 = false;
                    }
                    this.A01 = z4;
                    if (!z4 && Log.isLoggable("Downsampler", 5)) {
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                        A1A.append(length);
                        Log.w("Downsampler", Pxg.A0u(", limit ", A1A, 20000));
                    }
                }
                z3 = this.A01;
            }
            if (z3) {
                return true;
            }
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    public static SO9 A00() {
        if (A05 == null) {
            synchronized (SO9.class) {
                if (A05 == null) {
                    A05 = new SO9();
                }
            }
        }
        return A05;
    }
}
