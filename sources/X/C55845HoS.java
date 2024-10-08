package X;

import android.content.Context;
import android.view.GestureDetector;

/* renamed from: X.HoS  reason: case insensitive filesystem */
public final class C55845HoS {
    public final int A00;
    public final GestureDetector A01;
    public final AnonymousClass4GJ A02;
    public final C55778HnD A03;
    public final 1Xj A04;
    public final AnonymousClass3W1 A05;
    public final C253913rc A06;

    public C55845HoS(Context context, AnonymousClass4GJ r5, C55778HnD hnD, 1Xj r7, AnonymousClass3W1 r8, int i) {
        HFn hFn = new HFn(this);
        GestureDetector gestureDetector = new GestureDetector(context, hFn);
        this.A01 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        C253913rc r0 = new C253913rc(context);
        this.A06 = r0;
        r0.A01.add(hFn);
        this.A02 = r5;
        this.A03 = hnD;
        this.A00 = i;
        this.A04 = r7;
        this.A05 = r8;
    }
}
