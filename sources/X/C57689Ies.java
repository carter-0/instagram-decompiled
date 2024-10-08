package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ies  reason: case insensitive filesystem */
public final class C57689Ies implements JRF {
    public String A00;
    public final AnonymousClass07V A01;
    public final UserSession A02;
    public final Set A03 = C51972G9s.A0u();
    public final JRO A04;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass371 r12, X.C267324bN r13, X.C57689Ies r14, java.lang.String r15, X.AnonymousClass4D7 r16) {
        /*
            r3 = r13
            r2 = r14
            r6 = 25
            r7 = r16
            boolean r0 = X.C66131MDj.A01(r6, r7)
            if (r0 == 0) goto L_0x00d7
            r5 = r7
            X.MDj r5 = (X.C66131MDj) r5
            int r4 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x00d7
            int r4 = r4 - r1
            r5.A00 = r4
        L_0x001a:
            java.lang.Object r1 = r5.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 != r4) goto L_0x00de
            java.lang.Object r3 = r5.A02
            X.4bN r3 = (X.C267324bN) r3
            java.lang.Object r2 = r5.A01
            X.Ies r2 = (X.C57689Ies) r2
            X.0eS.A00(r1)
        L_0x0030:
            X.JRO r1 = r2.A04
            r0 = 0
            r1.ESN(r3, r0)
        L_0x0036:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0039:
            X.0eS.A00(r1)
            java.lang.String r0 = r14.A00
            boolean r0 = X.C51969G9p.A1Y(r13, r0)
            if (r0 != 0) goto L_0x004a
            java.util.Set r0 = r14.A03
            r0.remove(r15)
            goto L_0x0036
        L_0x004a:
            java.lang.Object r0 = r12.FH3()
            X.BAg r0 = (X.C42006BAg) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x005a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r1 = r7.next()
            X.1bK r1 = (X.1bK) r1
            com.instagram.common.session.UserSession r0 = r14.A02
            X.1E5 r0 = X.1E4.A00(r0)
            X.3gp r0 = X.C335827db.A00(r0, r1)
            r10.add(r0)
            goto L_0x005a
        L_0x0074:
            java.util.Iterator r7 = r10.iterator()
        L_0x0078:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r1 = r7.next()
            X.3gp r1 = (X.C247733gp) r1
            X.1Xj r0 = r13.A02
            r1.A02(r0)
            goto L_0x0078
        L_0x008a:
            X.JRO r7 = r14.A04
            r1 = 20
            X.JwJ r0 = new X.JwJ
            r0.<init>((java.util.List) r10, (int) r1, (java.lang.String) r15)
            r7.ESM(r0, r13)
            r7.ESN(r13, r4)
            com.instagram.common.session.UserSession r9 = r14.A02
            r8 = 0
            X.0Tu r7 = X.0Tu.A05
            r0 = 36605138680485052(0x820c2e000114bc, double:3.212575326376746E-306)
            long r0 = X.182.A01(r7, r9, r0)
            r11 = 0
            int r7 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x00cd
            java.lang.Object r0 = X.00k.A0J(r10)
            X.3gp r0 = (X.C247733gp) r0
            if (r0 == 0) goto L_0x00c5
            java.lang.String r1 = r0.A0d
            if (r1 == 0) goto L_0x00c5
            int r0 = r1.length()
            int r0 = java.lang.Character.codePointCount(r1, r8, r0)
            long r0 = (long) r0
            r11 = 200(0xc8, double:9.9E-322)
            long r11 = r11 * r0
        L_0x00c5:
            r13 = 4000(0xfa0, double:1.9763E-320)
            r15 = 7000(0x1b58, double:3.4585E-320)
            long r0 = X.C229632nm.A06(r11, r13, r15)
        L_0x00cd:
            X.C51966G9m.A1P(r2, r3, r5, r4)
            java.lang.Object r0 = X.C241603Pv.A01(r5, r0)
            if (r0 != r6) goto L_0x0030
            return r6
        L_0x00d7:
            X.MDj r5 = new X.MDj
            r5.<init>(r14, r7, r6)
            goto L_0x001a
        L_0x00de:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57689Ies.A00(X.371, X.4bN, X.Ies, java.lang.String, X.4D7):java.lang.Object");
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dxm(C267324bN r2, Integer num, int i) {
        0qQ.A0B(r2, 0);
        if (!C51969G9p.A1Y(r2, this.A00)) {
            this.A00 = r2.getId();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DaS(X.C267324bN r25, int r26, int r27, boolean r28) {
        /*
            r24 = this;
            r2 = r27
            r3 = 0
            r9 = r25
            X.0qQ.A0B(r9, r3)
            X.1Xj r0 = r9.A02
            if (r0 == 0) goto L_0x00b6
            java.lang.String r7 = r0.A2n()
            if (r7 == 0) goto L_0x00b6
            boolean r0 = r9.CcK()
            if (r0 != 0) goto L_0x00b6
            r10 = r24
            java.util.Set r8 = r10.A03
            boolean r0 = r8.contains(r7)
            if (r0 != 0) goto L_0x00b6
            X.1Xj r0 = r9.A02
            if (r0 == 0) goto L_0x00b6
            com.instagram.common.session.UserSession r13 = r10.A02
            r15 = 0
            boolean r20 = r0.CcK()
            boolean r21 = r0.CeS()
            boolean r22 = r0.A51()
            boolean r23 = r0.A4L()
            java.util.List r18 = X.C51965G9l.A0w(r0)
            X.3WR r14 = r0.CEL()
            java.lang.String r16 = X.C51973G9u.A0k(r0)
            java.lang.String r17 = X.C51966G9m.A1D(r0)
            r19 = r3
            boolean r1 = X.AnonymousClass3WP.A09(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r0)
            if (r0 == 0) goto L_0x005b
            boolean r0 = X.2R8.A04(r13, r0)
            if (r0 != 0) goto L_0x00b6
        L_0x005b:
            if (r1 != 0) goto L_0x00b6
            X.0Tu r6 = X.0Tu.A05
            r0 = 36605138680681662(0x820c2e000414be, double:3.212575326501083E-306)
            int r0 = X.DbS.A04(r6, r13, r0)
            if (r0 != 0) goto L_0x00e7
            r0 = 36605138680616125(0x820c2e000314bd, double:3.212575326459637E-306)
            int r0 = X.DbS.A04(r6, r13, r0)
            if (r0 == 0) goto L_0x00d5
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0077:
            int r1 = r0.intValue()
            r0 = 1
            r4 = r26
            if (r1 == r0) goto L_0x00c7
            if (r1 == r3) goto L_0x00b7
            r0 = 2
            if (r1 != r0) goto L_0x00ea
            double r4 = (double) r4
            double r2 = (double) r2
            r0 = 37168088633967057(0x840c2e000201d1, double:3.568587143776281E-306)
            double r0 = X.182.A00(r6, r13, r0)
            double r2 = r2 * r0
            r0 = 4656510908468559872(0x409f400000000000, double:2000.0)
            double r1 = java.lang.Math.min(r2, r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00b6
        L_0x009e:
            r8.add(r7)
            X.07V r0 = r10.A01
            X.0xx r1 = X.C71772f0.A00(r0)
            r8 = 48
            X.MGk r0 = new X.MGk
            r3 = r0
            r4 = r9
            r5 = r10
            r6 = r7
            r7 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r0, r1)
        L_0x00b6:
            return
        L_0x00b7:
            r0 = 36605138680616125(0x820c2e000314bd, double:3.212575326459637E-306)
            int r1 = X.DbS.A04(r6, r13, r0)
            int r0 = r2 + -2000
            int r2 = java.lang.Math.min(r1, r0)
            goto L_0x00d2
        L_0x00c7:
            r0 = 36605138680681662(0x820c2e000414be, double:3.212575326501083E-306)
            int r0 = X.DbS.A04(r6, r13, r0)
            int r2 = r27 - r0
        L_0x00d2:
            if (r4 < r2) goto L_0x00b6
            goto L_0x009e
        L_0x00d5:
            r0 = 37168088633967057(0x840c2e000201d1, double:3.568587143776281E-306)
            double r11 = X.182.A00(r6, r13, r0)
            r4 = 0
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00e7
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0077
        L_0x00e7:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0077
        L_0x00ea:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57689Ies.DaS(X.4bN, int, int, boolean):void");
    }

    public final void Dzs() {
    }

    public C57689Ies(AnonymousClass07V r2, JRO jro, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = jro;
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
