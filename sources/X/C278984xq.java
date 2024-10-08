package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4xq  reason: invalid class name and case insensitive filesystem */
public final class C278984xq {
    public C376439Hz A00;
    public final List A01 = new ArrayList();
    public final C278974xp A02;

    public C278984xq(C278974xp r2) {
        0qQ.A0B(r2, 2);
        this.A02 = r2;
    }

    private final C376439Hz A00(C376439Hz r17) {
        C376439Hz r5 = r17;
        if (r17 == null) {
            return null;
        }
        long j = r5.A01;
        long j2 = r5.A03;
        if (j - j2 >= 1) {
            return new C376439Hz(1, r5.A04, r5.A02, j2, j);
        }
        return null;
    }

    public final synchronized List A01() {
        ArrayList A0U;
        A0U = 00k.A0U(this.A01);
        C376439Hz A002 = A00(this.A00);
        if (A002 != null) {
            A0U.add(A002);
        }
        return 00k.A0a(A0U);
    }

    public final synchronized void A02(boolean z, boolean z2) {
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long uptimeMillis = SystemClock.uptimeMillis() / 1000;
            if (z) {
                C376439Hz r5 = this.A00;
                C376439Hz r8 = new C376439Hz(0, currentTimeMillis, uptimeMillis, currentTimeMillis, uptimeMillis);
                if (r5 != null) {
                    if (uptimeMillis - r5.A01 <= 15) {
                        r8 = new C376439Hz(0, r5.A04, r5.A03, currentTimeMillis, uptimeMillis);
                    } else {
                        C376439Hz A002 = A00(r5);
                        if (A002 != null) {
                            this.A01.add(A002);
                        }
                    }
                }
                this.A00 = r8;
            } else {
                C376439Hz r14 = this.A00;
                this.A00 = null;
                if (r14 != null) {
                    if (z2) {
                        r14 = new C376439Hz(0, r14.A04, r14.A03, currentTimeMillis, uptimeMillis);
                    }
                    C376439Hz A003 = A00(r14);
                    if (A003 != null) {
                        this.A01.add(A003);
                    }
                }
            }
        }
    }
}
