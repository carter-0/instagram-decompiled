package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.GdS  reason: case insensitive filesystem */
public final class C52836GdS extends GestureDetector.SimpleOnGestureListener {
    public boolean A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C255783ui A03;
    public final /* synthetic */ C309726Zj A04;
    public final /* synthetic */ AnonymousClass6PI A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r4.getRawX() > (r2 * 0.75f)) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onDown(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            float r1 = r4.getRawX()
            float r2 = r3.A01
            r0 = 1048576000(0x3e800000, float:0.25)
            float r0 = r0 * r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001d
            float r1 = r4.getRawX()
            r0 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 * r0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r3.A00 = r0
            if (r0 == 0) goto L_0x002b
            X.6Zj r1 = r3.A04
            float r0 = r4.getRawX()
            r1.DA9(r0)
        L_0x002b:
            boolean r0 = r3.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52836GdS.onDown(android.view.MotionEvent):boolean");
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A00) {
            this.A04.DP2(motionEvent.getRawX(), motionEvent.getRawY());
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        int[] iArr = {0, 0};
        this.A05.A04.getLocationOnScreen(iArr);
        C255783ui r4 = this.A03;
        r4.A03 = motionEvent.getRawX() - ((float) iArr[0]);
        r4.A04 = motionEvent.getRawY() - ((float) iArr[1]);
        C309726Zj r2 = this.A04;
        Context context = this.A02;
        0qQ.A0A(context);
        r2.DZx(context, r4, AnonymousClass05K.A01);
        return true;
    }

    public C52836GdS(Context context, C255783ui r2, C309726Zj r3, AnonymousClass6PI r4, float f) {
        this.A01 = f;
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = r2;
        this.A02 = context;
    }
}
