package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5lI  reason: invalid class name and case insensitive filesystem */
public abstract class C293755lI {
    public static final 02m A00 = 02m.A0p;
    public static final AtomicInteger A01 = new AtomicInteger(0);

    public static final void A02(String str, String str2, int i, boolean z) {
        02m r2 = A00;
        if (r2 != null) {
            int andIncrement = A01.getAndIncrement();
            r2.markerStart(i, andIncrement);
            if (str2 != null) {
                r2.markerAnnotate(i, andIncrement, str, str2);
            }
            short s = 3;
            if (z) {
                s = 2;
            }
            r2.markerEnd(i, andIncrement, s);
        }
    }

    public static final void A00(String str) {
        A02("Animation Type", str, 38797313, true);
    }

    public static final void A01(String str) {
        A02("Font Type", str, 38797314, true);
    }

    public static final void A03(String str, boolean z) {
        A02("File Accessed", str, 38797321, z);
    }
}
