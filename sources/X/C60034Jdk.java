package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jdk  reason: case insensitive filesystem */
public final class C60034Jdk extends ScaleGestureDetector.SimpleOnScaleGestureListener implements View.OnTouchListener {
    public boolean A00;
    public final AnonymousClass4DH A01;
    public final C340307l3 A02;
    public final AnonymousClass0eM A03;
    public final GestureDetector A04;
    public final ScaleGestureDetector A05;
    public final AnonymousClass82X A06;

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        C60180Jgz jgz = (C60180Jgz) this.A03.getValue();
        float currentSpan = scaleGestureDetector.getCurrentSpan();
        int width = this.A01.requireView().getWidth();
        jgz.A04.Epw(new C53351Gmb(jgz.A01 + ((currentSpan - jgz.A00) / ((float) width)), 4));
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        C60180Jgz jgz = (C60180Jgz) this.A03.getValue();
        float currentSpan = scaleGestureDetector.getCurrentSpan();
        C66184MGv.A02(jgz, C318116oQ.A00(jgz), 14);
        jgz.A00 = currentSpan;
        jgz.A01 = ((C53351Gmb) jgz.A04.getValue()).A00;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r0 != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            r1 = 1
            X.0qQ.A0B(r5, r1)
            int r0 = r5.getActionMasked()
            r2 = 0
            if (r0 != 0) goto L_0x0032
            r3.A00 = r2
        L_0x000d:
            android.view.ScaleGestureDetector r0 = r3.A05
            boolean r1 = r0.onTouchEvent(r5)
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0024
            android.view.GestureDetector r0 = r3.A04
            boolean r0 = r0.onTouchEvent(r5)
            if (r0 != 0) goto L_0x0023
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            X.82X r0 = r3.A06
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.A0A(r5)
            if (r0 != 0) goto L_0x0030
            if (r1 == 0) goto L_0x0031
        L_0x0030:
            r2 = 1
        L_0x0031:
            return r2
        L_0x0032:
            int r0 = r5.getPointerCount()
            if (r0 <= r1) goto L_0x000d
            r3.A00 = r1
            goto L_0x000d
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60034Jdk.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C60034Jdk(GestureDetector gestureDetector, AnonymousClass4DH r11, C340307l3 r12, AnonymousClass82X r13, UserSession userSession) {
        C51972G9s.A1C(userSession, gestureDetector);
        this.A01 = r11;
        this.A02 = r12;
        this.A04 = gestureDetector;
        this.A06 = r13;
        C66292MMb A012 = C66292MMb.A01(userSession, 29);
        AnonymousClass0eM A002 = C66292MMb.A00(C66292MMb.A01(r11, 26), 0eO.A02, 27);
        this.A03 = DbS.A0I(C66292MMb.A01(A002, 28), A012, new C20614Wvv(37, (Object) null, A002), DbS.A0z(C60180Jgz.class));
        this.A05 = new ScaleGestureDetector(r11.requireContext(), this);
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r11.getViewLifecycleOwner();
        AnonymousClass0xx A003 = AnonymousClass07a.A00(viewLifecycleOwner);
        C59845JaL jaL = new C59845JaL(viewLifecycleOwner, r5, this, (AnonymousClass4D7) null, 35);
        19B r1 = 19B.A00;
        AnonymousClass07Z A0I = JTP.A0I(r11, r1, jaL, A003);
        1Eo.A05(r1, new C59845JaL(A0I, r5, this, (AnonymousClass4D7) null, 36), AnonymousClass07a.A00(A0I));
    }
}
