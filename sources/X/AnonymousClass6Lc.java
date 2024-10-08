package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.6Lc  reason: invalid class name */
public final class AnonymousClass6Lc extends GestureDetector.SimpleOnGestureListener {
    public boolean A00;
    public final /* synthetic */ C306166Lb A01;

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        String str;
        0qQ.A0B(motionEvent, 0);
        C306166Lb r2 = this.A01;
        r2.A03 = false;
        C309676Ze r1 = r2.A0C;
        C255783ui Bw8 = r1.Bw8();
        if (Bw8 == null || (str = Bw8.A1f) == null) {
            str = "interactive_media_tooltip_from_tap";
        }
        r1.D9X(C306166Lb.A00(motionEvent, r2, str));
        return super.onDoubleTap(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r10 != null) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onDown(android.view.MotionEvent r16) {
        /*
            r15 = this;
            r0 = 0
            r9 = r16
            X.0qQ.A0B(r9, r0)
            X.6Lb r2 = r15.A01
            int r7 = r2.A05
            int r6 = r2.A04
            X.3Hx r10 = r2.A09
            if (r10 == 0) goto L_0x0075
            java.lang.Float r0 = r10.A02
            if (r0 == 0) goto L_0x0075
            float r1 = r0.floatValue()
        L_0x0018:
            java.lang.Float r0 = r10.A03
            if (r0 == 0) goto L_0x0079
            float r0 = r0.floatValue()
        L_0x0020:
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>(r1, r0, r1, r0)
            float r1 = (float) r7
            float r0 = r8.left
            float r0 = r0 * r1
            int r5 = (int) r0
            float r0 = r8.right
            float r1 = r1 * r0
            int r4 = (int) r1
            float r3 = (float) r6
            float r0 = r8.top
            float r0 = r0 * r3
            int r1 = (int) r0
            float r0 = r8.bottom
            float r3 = r3 * r0
            int r0 = (int) r3
            int r7 = r7 - r4
            int r6 = r6 - r0
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r5, r1, r7, r6)
            float r0 = r9.getRawX()
            int r1 = (int) r0
            float r0 = r9.getRawY()
            int r0 = (int) r0
            boolean r0 = r3.contains(r1, r0)
            if (r0 == 0) goto L_0x0073
            X.6Yf r12 = r2.A0B
            com.instagram.common.session.UserSession r11 = r2.A0A
            int r13 = r2.A01
            int r14 = r2.A00
            boolean r0 = X.C56339Hwq.A00(r9, r10, r11, r12, r13, r14)
            if (r0 != 0) goto L_0x0062
            boolean r0 = X.C56339Hwq.A01(r10)
            if (r0 == 0) goto L_0x0073
        L_0x0062:
            r0 = 1
        L_0x0063:
            r15.A00 = r0
            if (r0 == 0) goto L_0x0070
            X.6Ze r1 = r2.A0C
            float r0 = r9.getRawX()
            r1.DA9(r0)
        L_0x0070:
            boolean r0 = r15.A00
            return r0
        L_0x0073:
            r0 = 0
            goto L_0x0063
        L_0x0075:
            r1 = 0
            if (r10 == 0) goto L_0x0079
            goto L_0x0018
        L_0x0079:
            r0 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Lc.onDown(android.view.MotionEvent):boolean");
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A00) {
            C306166Lb r4 = this.A01;
            C309676Ze r3 = r4.A0C;
            boolean CVf = r3.CVf();
            if (C56339Hwq.A01(r4.A09) || !CVf) {
                r4.A03 = !CVf;
                r3.DP2(motionEvent.getRawX(), motionEvent.getRawY());
                if (!CVf) {
                    r4.A07.postDelayed(new C57855IhY(motionEvent, r4), 400);
                    return;
                }
                return;
            }
            r4.A03 = false;
            r3.Dqb(motionEvent.getRawX(), motionEvent.getRawY());
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C306166Lb r3 = this.A01;
        r3.A03 = false;
        C309676Ze r2 = r3.A0C;
        boolean CVf = r2.CVf();
        if (C56339Hwq.A00(motionEvent, r3.A09, r3.A0A, r3.A0B, r3.A01, r3.A00) || CVf) {
            r2.DIX(C306166Lb.A00(motionEvent, r3, "interactive_media_tooltip_from_tap"), CVf);
            return true;
        }
        r2.Dqb(motionEvent.getRawX(), motionEvent.getRawY());
        return false;
    }

    public AnonymousClass6Lc(C306166Lb r1) {
        this.A01 = r1;
    }
}
