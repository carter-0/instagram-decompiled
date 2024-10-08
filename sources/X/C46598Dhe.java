package X;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.Dhe  reason: case insensitive filesystem */
public final class C46598Dhe implements View.OnTouchListener {
    public C46599Dhf A00;
    public final C307786Rm A01;
    public final C276544tV A02;
    public final C276544tV A03;
    public final float A04;

    public C46598Dhe(C307786Rm r2, C276544tV r3, C276544tV r4) {
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = r4;
        this.A00 = (C46599Dhf) C307476Qg.A06(r2, r3);
        this.A04 = (float) ViewConfiguration.get(r2.A00).getScaledTouchSlop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        if (r4.A00 != false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r1 = r10.getAction()
            r6 = 0
            if (r1 == 0) goto L_0x0015
            r5 = 1
            if (r1 == r5) goto L_0x0043
            r0 = 3
            if (r1 == r0) goto L_0x009c
            r0 = 4
            if (r1 == r0) goto L_0x009c
        L_0x0010:
            X.Dhf r0 = r8.A00
            boolean r0 = r0.A00
            return r0
        L_0x0015:
            X.4tV r3 = r8.A03
            X.4uI r2 = r3.A08()
            if (r2 != 0) goto L_0x001e
            return r6
        L_0x001e:
            X.6Tl r1 = X.DbS.A0P()
            X.4tV r0 = r8.A02
            r1.A03(r0, r6)
            X.6Tm r1 = r1.A00()
            X.6Rm r0 = r8.A01
            java.lang.Object r2 = X.C307886Rw.A03(r0, r3, r1, r2)
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto L_0x00b4
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x00b4
            java.lang.String r1 = "bk.components.FoaTouchExtension"
            java.lang.String r0 = "Got non-boolean result while evaluating touch down expression"
            X.1Kn.A02(r1, r0)
            X.Dhf r4 = r8.A00
            goto L_0x0098
        L_0x0043:
            X.Dhf r4 = r8.A00
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0010
            float r7 = r10.getX()
            float r3 = r10.getY()
            float r2 = r8.A04
            X.0qQ.A0B(r9, r6)
            float r1 = -r2
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a2
            int r1 = r9.getRight()
            int r0 = r9.getLeft()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a2
            int r1 = r9.getBottom()
            int r0 = r9.getTop()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a2
            X.4tV r3 = r8.A03
            r0 = 38
            X.4uI r2 = r3.A0A(r0)
            if (r2 == 0) goto L_0x0098
            X.6Tl r1 = X.DbS.A0P()
            X.4tV r0 = r8.A02
            r1.A03(r0, r6)
        L_0x0090:
            X.6Rm r0 = r8.A01
            r1.A03(r0, r5)
            X.DbT.A1R(r0, r3, r1, r2)
        L_0x0098:
            r4.A00 = r6
            goto L_0x0010
        L_0x009c:
            X.Dhf r4 = r8.A00
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0010
        L_0x00a2:
            X.4tV r3 = r8.A03
            X.4uI r2 = r3.A09()
            if (r2 == 0) goto L_0x0098
            X.6Tl r1 = X.DbS.A0P()
            X.4tV r0 = r8.A02
            r1.A03(r0, r6)
            goto L_0x0090
        L_0x00b4:
            X.Dhf r1 = r8.A00
            boolean r0 = X.Q0A.A01(r2)
            r1.A00 = r0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46598Dhe.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
