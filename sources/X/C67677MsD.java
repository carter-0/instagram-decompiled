package X;

import android.view.ScaleGestureDetector;
import com.instagram.common.session.UserSession;

/* renamed from: X.MsD  reason: case insensitive filesystem */
public final class C67677MsD extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public float A00;
    public final /* synthetic */ C380729Zh A01;

    public C67677MsD(C380729Zh r1) {
        this.A01 = r1;
    }

    private boolean A00() {
        C70666OFn oFn;
        C342687p0 r1;
        C380729Zh r12 = this.A01;
        if (!(r12.A03 == null || (oFn = r12.A04) == null)) {
            C340607lX r13 = oFn.A04;
            if (r13.isConnected()) {
                try {
                    r1 = r13.AlD();
                } catch (C352928Fp unused) {
                }
                if (oFn.A03 || r1 == null || !AnonymousClass7TE.A1a(r1.A01(C342687p0.A0f))) {
                    return false;
                }
                return true;
            }
            r1 = null;
            if (oFn.A03) {
            }
        }
        return false;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C68292N9f n9f;
        C380729Zh r2 = this.A01;
        O9Y o9y = r2.A07;
        if (o9y != null) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            OA4 oa4 = o9y.A00.A0B.A00;
            if (oa4 != null) {
                C69099Nee nee = oa4.A00;
                if (C69099Nee.A00(nee, scaleFactor)) {
                    return true;
                }
                UserSession userSession = nee.A02;
                0Tu r4 = 0Tu.A05;
                if (!182.A06(r4, userSession, 36316774576165502L)) {
                    return true;
                }
                if (182.A06(r4, userSession, 36317487540737209L) && (n9f = (C68292N9f) nee.A01) != null && !n9f.A04) {
                    nee.A0J(new C68292N9f(n9f.A00, n9f.A01, n9f.A03, n9f.A02, true));
                    nee.A03.A00(PKR.A00);
                }
            }
        }
        if (!A00()) {
            return false;
        }
        C70666OFn oFn = r2.A04;
        int i = oFn.A01;
        int i2 = oFn.A02;
        oFn.A04.Er9(new C341957no(), Math.min(i, Math.max(i2, ((int) (((scaleGestureDetector.getCurrentSpan() - this.A00) / AnonymousClass7TE.A02(r2.A03)) * ((float) (i - i2)))) + oFn.A00)));
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        OA4 oa4;
        C68292N9f n9f;
        C68292N9f n9f2;
        O9Y o9y = this.A01.A07;
        if (!(o9y == null || (oa4 = o9y.A00.A0B.A00) == null)) {
            C69099Nee nee = oa4.A00;
            if (182.A06(0Tu.A05, nee.A02, 36317487540737209L) && (n9f2 = (C68292N9f) nee.A01) != null && n9f2.A04) {
                nee.A03.A00(new PK1(JTR.A0H(nee.A07)));
            }
            C68292N9f n9f3 = (C68292N9f) nee.A01;
            if (n9f3 != null) {
                n9f = new C68292N9f(n9f3.A00, n9f3.A01, n9f3.A03, n9f3.A02, false);
            } else {
                n9f = null;
            }
            nee.A0J(n9f);
        }
        A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030 A[SYNTHETIC, Splitter:B:13:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScaleBegin(android.view.ScaleGestureDetector r6) {
        /*
            r5 = this;
            boolean r0 = r5.A00()
            if (r0 == 0) goto L_0x0065
            float r0 = r6.getCurrentSpan()
            r5.A00 = r0
            X.9Zh r2 = r5.A01
            android.view.View r0 = r2.A03
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x001a
            r0 = 1
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x001a:
            X.OFn r4 = r2.A04
            X.7lX r1 = r4.A04
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x0029
            X.7p0 r3 = r1.AlD()     // Catch:{ 8Fp -> 0x0029 }
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x0035
            X.7p3 r2 = r1.Bt2()     // Catch:{ 8Fp -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            r1 = 0
            if (r3 == 0) goto L_0x0064
            if (r2 == 0) goto L_0x0064
            X.7p4 r0 = X.C342717p3.A11
            java.lang.Object r0 = r2.A02(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0064
            int r0 = r0.intValue()
            r4.A00 = r0
            X.7p1 r0 = X.C342687p0.A0j
            java.lang.Object r0 = r3.A01(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r4.A01 = r0
            X.7p1 r0 = X.C342687p0.A0l
            java.lang.Object r0 = r3.A01(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r4.A02 = r0
            r1 = 1
        L_0x0064:
            return r1
        L_0x0065:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67677MsD.onScaleBegin(android.view.ScaleGestureDetector):boolean");
    }
}
