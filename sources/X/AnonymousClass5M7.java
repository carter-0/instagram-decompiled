package X;

import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.5M7  reason: invalid class name */
public final class AnonymousClass5M7 {
    public WeakReference A00;
    public boolean A01;
    public boolean A02;
    public final C17723Vcs A03;
    public final boolean A04;
    public final boolean A05;

    public static final long A00() {
        if (AnonymousClass4NZ.A00.A02) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime();
    }

    public static final long A01(AnonymousClass5M7 r1, String str) {
        AnonymousClass4MM r0;
        int A08;
        C257433xO r02 = (C257433xO) r1.A00.get();
        if (r02 != null) {
            A08 = r02.getCurrentPositionMs();
        } else if (!str.equals(AnonymousClass4NZ.A02)) {
            return 0;
        } else {
            WeakReference weakReference = AnonymousClass4NZ.A03;
            if (weakReference == null || (r0 = (AnonymousClass4MM) weakReference.get()) == null) {
                return -1;
            }
            A08 = (int) r0.A09.A0I.A08();
        }
        return (long) A08;
    }

    public static final void A02(AnonymousClass5M7 r8, String str, int i, long j, long j2) {
        r8.A03.A06.add(new C17479VXg(str, i, j2, j));
    }

    public AnonymousClass5M7(C257433xO r2, C17723Vcs vcs, boolean z, boolean z2) {
        this.A03 = vcs;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = new WeakReference(r2);
    }
}
