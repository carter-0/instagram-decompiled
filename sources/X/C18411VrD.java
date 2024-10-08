package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.VrD  reason: case insensitive filesystem */
public abstract class C18411VrD {
    public static final Runnable A00;
    public static final Runnable A01;
    public static final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public static final AtomicInteger A03 = new AtomicInteger(0);
    public static final AtomicInteger A04 = new AtomicInteger(0);
    public static final AtomicInteger A05 = new AtomicInteger(0);
    public static final AnonymousClass0eM A06;

    static {
        0t0 A012 = AnonymousClass0eN.A01(C20625WwJ.A00);
        A06 = A012;
        C20361Wq0 wq0 = C20361Wq0.A00;
        A00 = wq0;
        C20362Wq1 wq1 = C20362Wq1.A00;
        A01 = wq1;
        ((Handler) A012.getValue()).post(wq0);
        ((Handler) A06.getValue()).post(wq1);
    }

    public static final void A00(VQi vQi, int i) {
        int i2 = vQi.A00;
        float f = ((float) i2) * 0.5f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        int i3 = (int) f;
        WHU whu = vQi.A01;
        int i4 = whu.A00;
        int A032 = C229632nm.A03(i4 + i, i3, i2);
        if (A032 != i4 && A032 != whu.A00) {
            whu.A00 = C229632nm.A03(A032, 1, whu.A04);
            WHU.A00(whu).A02(whu.A00);
        }
    }
}
