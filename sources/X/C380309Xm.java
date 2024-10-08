package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.9Xm  reason: invalid class name and case insensitive filesystem */
public final class C380309Xm extends GestureDetector.SimpleOnGestureListener {
    public boolean A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ C255783ui A05;
    public final /* synthetic */ C309796Zq A06;
    public final /* synthetic */ Integer A07;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r5.getRawX() > (r3 * (1.0f - r2))) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onDown(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            float r1 = r5.getRawX()
            float r3 = r4.A02
            float r2 = r4.A01
            float r0 = r3 * r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001f
            float r1 = r5.getRawX()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r2
            float r3 = r3 * r0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r4.A00 = r0
            if (r0 == 0) goto L_0x002d
            X.6Zq r1 = r4.A06
            float r0 = r5.getRawX()
            r1.DA9(r0)
        L_0x002d:
            boolean r0 = r4.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380309Xm.onDown(android.view.MotionEvent):boolean");
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A00) {
            this.A06.DP2(motionEvent.getRawX(), motionEvent.getRawY());
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        int[] iArr = {0, 0};
        this.A04.getLocationOnScreen(iArr);
        C255783ui r4 = this.A05;
        r4.A03 = motionEvent.getRawX() - ((float) iArr[0]);
        r4.A04 = motionEvent.getRawY() - ((float) iArr[1]);
        this.A06.DZx(this.A03, r4, this.A07);
        return true;
    }

    public C380309Xm(Context context, View view, C255783ui r3, C309796Zq r4, Integer num, float f, float f2) {
        this.A02 = f;
        this.A01 = f2;
        this.A06 = r4;
        this.A04 = view;
        this.A05 = r3;
        this.A03 = context;
        this.A07 = num;
    }
}
