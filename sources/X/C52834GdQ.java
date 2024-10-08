package X;

import android.app.Activity;
import android.os.Handler;
import android.view.GestureDetector;
import com.instagram.common.session.UserSession;

/* renamed from: X.GdQ  reason: case insensitive filesystem */
public final class C52834GdQ extends GestureDetector.SimpleOnGestureListener {
    public final GestureDetector A00;
    public final Activity A01;
    public final Handler A02;
    public final UserSession A03;
    public final S6e A04;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r0 == false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onFling(android.view.MotionEvent r10, android.view.MotionEvent r11, float r12, float r13) {
        /*
            r9 = this;
            r4 = 1
            X.0qQ.A0B(r11, r4)
            float r0 = java.lang.Math.abs(r13)
            double r2 = (double) r0
            com.instagram.common.session.UserSession r6 = r9.A03
            X.0Tu r5 = X.C51968G9o.A0b(r6)
            r0 = 37166009873531295(0x840a4a003b019f, double:3.5672725273062085E-306)
            double r7 = X.182.A00(r5, r6, r0)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a3
            r2 = 0
            if (r10 == 0) goto L_0x00a1
            float r1 = r10.getRawY()
        L_0x0023:
            float r0 = r11.getRawY()
            float r1 = r1 - r0
            r7 = 0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            boolean r3 = X.AnonymousClass7TF.A1R(r0)
            if (r10 == 0) goto L_0x009f
            float r1 = r10.getRawY()
        L_0x0035:
            float r0 = r11.getRawY()
            float r1 = r1 - r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            r7 = 1
        L_0x003f:
            java.lang.String r2 = "caption_swipe"
            if (r3 == 0) goto L_0x005e
            X.37E r1 = X.AnonymousClass37D.A00
            android.app.Activity r0 = r9.A01
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x0052
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            r1.A0T(r0)
        L_0x0052:
            X.S6e r3 = r9.A04
            if (r3 == 0) goto L_0x005d
            java.lang.String r1 = "full"
            java.lang.String r0 = "expand"
            r3.A02(r1, r0, r2)
        L_0x005d:
            return r4
        L_0x005e:
            if (r7 == 0) goto L_0x00a3
            r0 = 36321584941901369(0x810a4a00242639, double:3.0332548003171655E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0077
            r0 = 36321584940394027(0x810a4a000d262b, double:3.0332547993639163E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            r5 = 1
            if (r0 != 0) goto L_0x0078
        L_0x0077:
            r5 = 0
        L_0x0078:
            X.37E r1 = X.AnonymousClass37D.A00
            android.app.Activity r0 = r9.A01
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x00a3
            java.lang.String r3 = "dismiss"
            if (r5 == 0) goto L_0x0095
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r1.A0U(r0, r4)
            X.S6e r1 = r9.A04
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "collapsed"
        L_0x0091:
            r1.A02(r0, r3, r2)
            return r4
        L_0x0095:
            r1.A0B()
            X.S6e r1 = r9.A04
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "secondary_cta"
            goto L_0x0091
        L_0x009f:
            r1 = 0
            goto L_0x0035
        L_0x00a1:
            r1 = 0
            goto L_0x0023
        L_0x00a3:
            boolean r0 = super.onFling(r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52834GdQ.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public C52834GdQ(Activity activity, UserSession userSession, S6e s6e) {
        this.A01 = activity;
        this.A03 = userSession;
        this.A04 = s6e;
        Handler A0D = AnonymousClass7TF.A0D();
        this.A02 = A0D;
        this.A00 = new GestureDetector(activity.getApplicationContext(), new C226372gh(this), A0D);
    }
}
