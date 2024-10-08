package X;

import android.content.Context;
import android.view.GestureDetector;

/* renamed from: X.Hol  reason: case insensitive filesystem */
public final class C55864Hol {
    public final int A00;
    public final GestureDetector A01;
    public final JQG A02;
    public final AnonymousClass3V2 A03;
    public final 1Xj A04;
    public final AnonymousClass3W1 A05;
    public final C253913rc A06;
    public final C52840GdW A07;

    public C55864Hol(Context context, JQG jqg, AnonymousClass3V2 r6, 1Xj r7, AnonymousClass3W1 r8, int i) {
        AnonymousClass7TG.A1Q(jqg, r6);
        AnonymousClass7TG.A1S(r7, r8);
        this.A02 = jqg;
        this.A03 = r6;
        this.A00 = i;
        this.A04 = r7;
        this.A05 = r8;
        C52840GdW gdW = new C52840GdW(this);
        this.A07 = gdW;
        GestureDetector gestureDetector = new GestureDetector(context, gdW);
        gestureDetector.setIsLongpressEnabled(false);
        this.A01 = gestureDetector;
        C253913rc r1 = new C253913rc(context);
        r1.A01.add(gdW);
        this.A06 = r1;
    }
}
