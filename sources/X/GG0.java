package X;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import com.instagram.api.schemas.ReelsMediaInteractivityType;
import com.instagram.common.session.UserSession;

public final class GG0 extends C52129GFx {
    public final C62320sa A00;
    public final Activity A01;
    public final Context A02;
    public final C267324bN A03;
    public final JSx A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final AnonymousClass3W1 A07;
    public final S6e A08;
    public final JTB A09;
    public final C55571Hjr A0A;
    public final C52046GCs A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0065, code lost:
        if (X.182.A06(r3, r10, 36325119697629807L) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x007f, code lost:
        if (X.182.A06(r3, r10, 36325119697695344L) == false) goto L_0x0081;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GG0(android.app.Activity r14, android.content.Context r15, X.C267324bN r16, X.JSx r17, X.AnonymousClass0iw r18, com.instagram.common.session.UserSession r19, X.AnonymousClass3W1 r20, X.S6e r21, X.JTB r22, X.C55571Hjr r23, X.C52046GCs r24, java.lang.String r25, X.C62320sa r26, boolean r27) {
        /*
            r13 = this;
            r0 = 3
            r8 = r16
            r9 = r17
            r10 = r19
            r11 = r22
            X.C51974G9v.A0d(r0, r10, r11, r8, r9)
            r0 = 7
            r2 = r23
            X.0qQ.A0B(r2, r0)
            r0 = 11
            r3 = r20
            r1 = r24
            X.DbW.A1P(r1, r0, r3)
            r0 = 13
            r4 = r18
            X.0qQ.A0B(r4, r0)
            r7 = 0
            r5 = r13
            r6 = r15
            r12 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.A02 = r15
            r13.A01 = r14
            r13.A06 = r10
            r13.A09 = r11
            r13.A03 = r8
            r13.A04 = r9
            r13.A0A = r2
            r0 = r25
            r13.A0C = r0
            r0 = r26
            r13.A00 = r0
            r0 = r27
            r13.A0G = r0
            r13.A0B = r1
            r13.A07 = r3
            r13.A05 = r4
            r0 = r21
            r13.A08 = r0
            X.0Tu r3 = X.0Tu.A06
            r0 = 36325119697760881(0x810d8100023271, double:3.03549019415604E-306)
            boolean r0 = X.182.A06(r3, r10, r0)
            r2 = 1
            if (r0 == 0) goto L_0x0067
            r0 = 36325119697629807(0x810d810000326f, double:3.0354901940731485E-306)
            boolean r1 = X.182.A06(r3, r10, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            r13.A0E = r0
            r0 = 36325119697760881(0x810d8100023271, double:3.03549019415604E-306)
            boolean r0 = X.182.A06(r3, r10, r0)
            if (r0 == 0) goto L_0x0081
            r0 = 36325119697695344(0x810d8100013270, double:3.0354901941145944E-306)
            boolean r1 = X.182.A06(r3, r10, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            r13.A0D = r0
            boolean r0 = r8.A0I()
            if (r0 == 0) goto L_0x0098
            r0 = 36326884929189932(0x810f1c0000382c, double:3.0366065336197886E-306)
            boolean r0 = X.182.A06(r3, r10, r0)
            if (r0 == 0) goto L_0x0098
        L_0x0095:
            r13.A0F = r2
            return
        L_0x0098:
            r2 = 0
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GG0.<init>(android.app.Activity, android.content.Context, X.4bN, X.JSx, X.0iw, com.instagram.common.session.UserSession, X.3W1, X.S6e, X.JTB, X.Hjr, X.GCs, java.lang.String, X.0sa, boolean):void");
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C52058GDe BzC = this.A04.BzC(this.A03);
        if ((this.A0E && BzC.A0J == null) || this.A0F) {
            A03(motionEvent, ReelsMediaInteractivityType.SINGLE_TAP);
        }
        return super.onSingleTapConfirmed(motionEvent);
    }

    public final void A01(MotionEvent motionEvent) {
        if (this.A0D) {
            A03(motionEvent, ReelsMediaInteractivityType.LONG_PRESS_RELEASE);
        }
        super.A01(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b4, code lost:
        if (r15 != com.instagram.api.schemas.ReelsMediaInteractivityType.LONG_PRESS_RELEASE) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.view.MotionEvent r30, com.instagram.api.schemas.ReelsMediaInteractivityType r31) {
        /*
            r29 = this;
            r7 = r29
            X.4bN r6 = r7.A03
            X.1Xj r2 = r6.A02
            if (r2 == 0) goto L_0x00cd
            float r1 = r30.getX()
            float r0 = r30.getY()
            android.graphics.PointF r13 = new android.graphics.PointF
            r13.<init>(r1, r0)
            X.1Xy r0 = r2.A0C
            X.DU9 r16 = r0.Bl9()
            if (r16 == 0) goto L_0x00cd
            com.instagram.common.session.UserSession r5 = r7.A06
            r3 = 0
            X.0Tu r2 = X.C51965G9l.A0Z(r5, r3)
            r0 = 36325119698416249(0x810d81000c3279, double:3.0354901945704976E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r1 = r16.BCo()
            if (r1 == 0) goto L_0x00e8
            r10 = 38
            r8 = 2
            java.lang.String r9 = " "
            java.lang.String[] r0 = new java.lang.String[]{r9}
            r4 = 0
            java.util.List r0 = X.00l.A0R(r1, r0, r3)
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.util.Iterator r12 = r0.iterator()
        L_0x004f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.String r1 = X.AnonymousClass7TE.A18(r12)
            int r11 = r2.length()
            int r0 = r1.length()
            int r11 = r11 + r0
            int r0 = r11 + 1
            if (r0 <= r10) goto L_0x00da
            int r4 = r4 + 1
            if (r4 != r8) goto L_0x00ce
            java.lang.String r0 = "..."
            r2.append(r0)
            r3.append(r2)
        L_0x0072:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x007d
            if (r4 >= r8) goto L_0x007d
            r3.append(r2)
        L_0x007d:
            java.lang.String r4 = X.DbT.A10(r3)
        L_0x0081:
            android.view.View r14 = r7.A00
            if (r14 == 0) goto L_0x00cd
            r0 = 15
            X.IwK r26 = X.C58711IwK.A00(r7, r0)
            X.GFs r11 = X.C52124GFs.A00
            if (r4 != 0) goto L_0x0098
            android.content.Context r1 = r7.A02
            r0 = 2131963536(0x7f132e90, float:1.9563828E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r1, r0)
        L_0x0098:
            X.GCs r10 = r7.A0B
            X.3OA r21 = r6.A06()
            X.3W1 r9 = r7.A07
            X.0iw r8 = r7.A05
            X.Hjr r3 = r7.A0A
            android.app.Activity r12 = r7.A01
            X.S6e r2 = r7.A08
            boolean r1 = r7.A0E
            boolean r0 = r7.A0D
            r15 = r31
            if (r0 == 0) goto L_0x00b6
            com.instagram.api.schemas.ReelsMediaInteractivityType r0 = com.instagram.api.schemas.ReelsMediaInteractivityType.LONG_PRESS_RELEASE
            r28 = 1
            if (r15 == r0) goto L_0x00b8
        L_0x00b6:
            r28 = 0
        L_0x00b8:
            r19 = r5
            r20 = r9
            r22 = r2
            r23 = r3
            r24 = r10
            r25 = r4
            r27 = r1
            r17 = r6
            r18 = r8
            r11.A02(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x00cd:
            return
        L_0x00ce:
            r3.append(r2)
            java.lang.String r0 = "\n"
            r3.append(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
        L_0x00da:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x00e3
            r2.append(r9)
        L_0x00e3:
            r2.append(r1)
            goto L_0x004f
        L_0x00e8:
            java.lang.String r4 = r7.A0C
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GG0.A03(android.view.MotionEvent, com.instagram.api.schemas.ReelsMediaInteractivityType):void");
    }
}
