package X;

import android.app.Activity;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.api.schemas.ReelsMediaInteractivityType;
import com.instagram.common.session.UserSession;

public final class GZC extends C52129GFx {
    public final C267324bN A00;
    public final C52046GCs A01;
    public final C62320sa A02;
    public final Activity A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final S6e A06;
    public final GFO A07;
    public final String A08;
    public final boolean A09;

    public final void A01(MotionEvent motionEvent) {
        super.A01(motionEvent);
        A03(motionEvent, ReelsMediaInteractivityType.LONG_PRESS_RELEASE);
        GFO gfo = this.A07;
        if (GFN.A00(gfo.A0D)) {
            return;
        }
        if (!1KU.A0D(this.A05) || !gfo.A05) {
            C52643GaH gaH = gfo.A04;
            if (gaH != null) {
                gaH.A01();
            }
            gfo.A05 = false;
        }
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        super.onLongPress(motionEvent);
        GFO gfo = this.A07;
        if (GFN.A00(gfo.A0D)) {
            gfo.A08();
            return;
        }
        C52643GaH gaH = gfo.A04;
        if (gaH != null) {
            gaH.A00();
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean z = false;
        0qQ.A0B(motionEvent, 0);
        A03(motionEvent, ReelsMediaInteractivityType.SINGLE_TAP);
        GFO gfo = this.A07;
        if (gfo.A0D.A0E()) {
            UserSession userSession = this.A05;
            if (1KU.A07(userSession) && 1KU.A0D(userSession)) {
                boolean z2 = gfo.A05;
                C52643GaH gaH = gfo.A04;
                if (!z2) {
                    if (gaH != null) {
                        gaH.A00();
                    }
                    z = true;
                } else if (gaH != null) {
                    gaH.A01();
                }
                gfo.A05 = z;
            }
        }
        return super.onSingleTapConfirmed(motionEvent);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GZC(android.app.Activity r13, X.C14065TpD r14, X.C267324bN r15, X.JSx r16, X.AnonymousClass0iw r17, com.instagram.common.session.UserSession r18, X.S6e r19, X.JTB r20, X.GFO r21, X.C52046GCs r22, X.HnY r23, java.lang.String r24, X.C62320sa r25, boolean r26) {
        /*
            r12 = this;
            r8 = r16
            r10 = r20
            r0 = r21
            X.AnonymousClass7TG.A1U(r10, r8, r0)
            r1 = r22
            r2 = r18
            r3 = r17
            X.C51974G9v.A1Q(r1, r2, r3, r15)
            android.content.Context r5 = r0.A06
            com.instagram.common.session.UserSession r9 = r0.A0H
            X.4bN r7 = r0.A0D
            r4 = r12
            r6 = r14
            r11 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12.A07 = r0
            r0 = r26
            r12.A09 = r0
            r0 = r24
            r12.A08 = r0
            r0 = r25
            r12.A02 = r0
            r12.A01 = r1
            r12.A05 = r2
            r12.A04 = r3
            r12.A00 = r15
            r12.A03 = r13
            r0 = r19
            r12.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GZC.<init>(android.app.Activity, X.TpD, X.4bN, X.JSx, X.0iw, com.instagram.common.session.UserSession, X.S6e, X.JTB, X.GFO, X.GCs, X.HnY, java.lang.String, X.0sa, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [X.Hjr, java.lang.Object] */
    public final void A03(MotionEvent motionEvent, ReelsMediaInteractivityType reelsMediaInteractivityType) {
        DU9 Bl9;
        GFO gfo = this.A07;
        int A092 = C51970G9q.A09(gfo.A0A);
        1Xj r2 = (1Xj) gfo.A09.A00;
        if (r2 != null && (Bl9 = r2.A0C.Bl9()) != null) {
            String BMq = r2.A0C.BMq();
            if (BMq == null) {
                BMq = this.A08;
            }
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            View view = this.A00;
            if (view != null) {
                GL8 gl8 = new GL8(A092, 46, this, view);
                ? obj = new Object();
                C52124GFs gFs = C52124GFs.A00;
                C267324bN r12 = this.A00;
                C52046GCs gCs = this.A01;
                AnonymousClass3OA A062 = gfo.A0D.A06();
                AnonymousClass3W1 r15 = gfo.A0I;
                UserSession userSession = this.A05;
                AnonymousClass0iw r13 = this.A04;
                gFs.A02(this.A03, pointF, view, reelsMediaInteractivityType, Bl9, r12, r13, userSession, r15, A062, this.A06, obj, gCs, BMq, gl8, false, false);
                gfo.A08();
            }
        }
    }
}
