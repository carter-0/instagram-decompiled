package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Jdc  reason: case insensitive filesystem */
public final class C60026Jdc extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C64285LYl A00;
    public final /* synthetic */ MVW A01;
    public final /* synthetic */ MVX A02;
    public final /* synthetic */ C60687JpY A03;

    public C60026Jdc(C64285LYl lYl, MVW mvw, MVX mvx, C60687JpY jpY) {
        this.A00 = lYl;
        this.A03 = jpY;
        this.A01 = mvw;
        this.A02 = mvx;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r2 == X.C62584KiH.A0H) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onDown(android.view.MotionEvent r6) {
        /*
            r5 = this;
            X.LYl r0 = r5.A00
            java.lang.Object r1 = r0.A00
            X.JpY r0 = r5.A03
            android.view.View r4 = r0.A04
            boolean r0 = X.0qQ.A0K(r1, r4)
            r3 = 1
            if (r0 != 0) goto L_0x002c
            X.MVW r1 = r5.A01
            X.KiH r0 = X.C62584KiH.A0A
            X.KiH r2 = r1.BNP()
            if (r2 == r0) goto L_0x0027
            X.KiH r0 = X.C62584KiH.A0G
            if (r2 == r0) goto L_0x0027
            X.KiH r0 = X.C62584KiH.A08
            if (r2 == r0) goto L_0x0027
            X.KiH r1 = X.C62584KiH.A0H
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 != r1) goto L_0x0029
        L_0x0027:
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0029:
            r4.setAlpha(r0)
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60026Jdc.onDown(android.view.MotionEvent):boolean");
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean A0K = 0qQ.A0K(this.A00.A00, this.A03.A04);
        MVX mvx = this.A02;
        if (A0K) {
            ((C65809M0b) mvx).A04();
            return true;
        }
        ((C65809M0b) mvx).A09.A00(this.A01);
        return true;
    }
}
