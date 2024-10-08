package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class IZ3 implements C233432vi, C250603lj {
    public C61076JwE A00;
    public boolean A01;
    public final C233392ve A02;
    public final AnonymousClass1PN A03;
    public final AnonymousClass1PB A04;
    public final C228812mN A05;
    public final /* synthetic */ C233432vi A06 = new C233572vw();

    public final void A7t(C233602vz r2) {
        this.A06.A7t(r2);
    }

    public final 1PW AGd(List list) {
        0qQ.A0B(list, 0);
        return this.A06.AGd(list);
    }

    public final C233612w1 AMC() {
        return new IZ6(this, 0);
    }

    public final AnonymousClass4lJ AN3() {
        return this.A06.AN3();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b5, code lost:
        if (r8 == null) goto L_0x01b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r28, X.C252093oY r29) {
        /*
            r27 = this;
            r7 = 0
            r4 = r28
            r3 = r29
            boolean r6 = X.AnonymousClass7TF.A1U(r7, r4, r3)
            r5 = r27
            X.JwE r12 = r5.A00
            if (r12 == 0) goto L_0x0027
            java.lang.Object r2 = r4.A04
            r8 = r5
            boolean r0 = r5 instanceof X.HEX
            if (r0 == 0) goto L_0x0028
            r0 = r8
            X.HEX r0 = (X.HEX) r0
            int r1 = X.AnonymousClass7TE.A0M(r2)
            if (r1 < 0) goto L_0x0027
            X.2rI r0 = r0.A00
            int r0 = r0.B5I()
            if (r1 < r0) goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            X.1PN r10 = r5.A03
            X.2mN r11 = r5.A05
            boolean r1 = r5 instanceof X.HEW
            if (r1 == 0) goto L_0x01e9
            r0 = r2
            X.6YY r0 = (X.AnonymousClass6YY) r0
            X.0qQ.A0B(r0, r7)
            X.6Yf r0 = r0.A02
            int r5 = r0.A0I
        L_0x003a:
            if (r1 == 0) goto L_0x018a
            X.6YY r2 = (X.AnonymousClass6YY) r2
            X.0qQ.A0B(r2, r7)
            X.3mM r1 = r2.A00
        L_0x0043:
            X.1PM r10 = (X.AnonymousClass1PM) r10
            java.util.Map r0 = r10.A02
            java.lang.Object r8 = r0.get(r12)
            X.Hr0 r8 = (X.C55994Hr0) r8
            if (r8 == 0) goto L_0x0216
            java.util.LinkedList r10 = r10.A01
            java.lang.Object r9 = X.00k.A0L(r10)
            X.Hr0 r9 = (X.C55994Hr0) r9
            if (r9 == 0) goto L_0x01f5
            boolean r0 = X.2Ob.A00(r9, r8)
            if (r0 == 0) goto L_0x01f5
            java.lang.String r2 = r11.BEZ(r1)
            X.1Pi r1 = r11.BXm(r1)
            if (r1 == 0) goto L_0x01ef
            android.util.SparseArray r0 = r8.A03
            java.lang.Object r8 = r0.get(r5)
            X.Hqs r8 = (X.C55987Hqs) r8
            if (r8 != 0) goto L_0x007b
            X.Hqs r8 = new X.Hqs
            r8.<init>(r1, r2)
            r0.put(r5, r8)
        L_0x007b:
            long r11 = r3.B0M(r4)
            float r1 = r3.CFe(r4)
            int r0 = X.C51968G9o.A0A(r4, r3)
            if (r0 == r7) goto L_0x015a
            if (r0 == r6) goto L_0x015a
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x009b
            long r2 = r8.A01
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r8.A00
            long r4 = r4 - r0
            long r2 = r2 + r4
            r8.A01 = r2
        L_0x009b:
            r0 = 0
            r8.A00 = r0
            r8.A02 = r7
        L_0x00a1:
            java.util.Iterator r2 = r10.descendingIterator()
            r1 = 0
        L_0x00a6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r8 = r2.next()
            X.Hr0 r8 = (X.C55994Hr0) r8
            if (r1 != r6) goto L_0x0157
            if (r8 == 0) goto L_0x0027
            java.util.List r0 = r8.A06
            java.util.Iterator r14 = r0.iterator()
        L_0x00bc:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r6 = r14.next()
            X.Hnr r6 = (X.C55811Hnr) r6
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x00bc
            long r4 = r6.A02
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.0nE r0 = X.C61410nE.A00
            X.0qQ.A0B(r0, r7)
            long r2 = r9.A00
            r0 = 0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            long r0 = r9.A01
            if (r10 <= 0) goto L_0x00e4
            long r2 = X.C51966G9m.A07(r2)
            long r0 = r0 + r2
        L_0x00e4:
            long r1 = r11.toSeconds(r0)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00bc
            long r2 = r6.A01
            android.util.SparseArray r13 = r9.A03
            int r12 = r13.size()
            r10 = 0
            r5 = 0
        L_0x00f6:
            if (r10 >= r12) goto L_0x00bc
            int r0 = r13.keyAt(r10)
            java.lang.Object r0 = r13.get(r0)
            X.Hqs r0 = (X.C55987Hqs) r0
            X.1Pi r0 = r0.A03
            X.1Pi r11 = X.1Pi.A04
            if (r0 != r11) goto L_0x0154
            int r5 = r5 + 1
            long r0 = (long) r5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0154
            long r4 = r6.A03
            android.util.SparseArray r1 = r8.A03
            int r0 = r1.size()
            r10 = 0
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r12 = r1.get(r7)
            X.Hqs r12 = (X.C55987Hqs) r12
            X.1Pi r0 = r12.A03
            if (r0 != r11) goto L_0x00bc
            long r2 = r12.A00
            r0 = 0
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            long r0 = r12.A01
            if (r11 <= 0) goto L_0x0133
            long r2 = X.C51966G9m.A07(r2)
            long r0 = r0 + r2
        L_0x0133:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x00bc
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0150
            X.2rI r1 = r6.A04
            X.1Xg r0 = r1.A04(r7)
            if (r0 == 0) goto L_0x0150
            boolean r0 = X.AnonymousClass3VP.A00(r0)
            if (r0 == 0) goto L_0x0150
            java.lang.Object r0 = r1.EDl(r7)
            if (r0 == 0) goto L_0x0150
            r10 = 1
        L_0x0150:
            r6.A00 = r10
            goto L_0x00bc
        L_0x0154:
            int r10 = r10 + 1
            goto L_0x00f6
        L_0x0157:
            r1 = 1
            goto L_0x00a6
        L_0x015a:
            double r0 = (double) r1
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0175
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0175
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x00a1
            r8.A02 = r6
            long r0 = java.lang.System.currentTimeMillis()
        L_0x0171:
            r8.A00 = r0
            goto L_0x00a1
        L_0x0175:
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0185
            long r4 = r8.A01
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r8.A00
            long r2 = r2 - r0
            long r4 = r4 + r2
            r8.A01 = r4
        L_0x0185:
            r8.A02 = r7
            r0 = 0
            goto L_0x0171
        L_0x018a:
            X.HEX r8 = (X.HEX) r8
            int r2 = X.AnonymousClass7TE.A0M(r2)
            X.2ve r0 = r8.A01
            java.lang.Object r1 = r0.BTe(r2)
            if (r1 != 0) goto L_0x0043
            X.2rI r0 = r8.A00
            X.1Xg r9 = r0.A03(r2)
            X.0qQ.A0B(r9, r7)
            X.1Xj r0 = X.C51965G9l.A0o(r9)
            if (r0 == 0) goto L_0x01b7
            java.util.List r1 = r0.A0e
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x01e6
            java.lang.Object r8 = r1.get(r7)
        L_0x01b3:
            X.3PG r8 = (X.AnonymousClass3PG) r8
            if (r8 != 0) goto L_0x01b9
        L_0x01b7:
            X.3PG r8 = X.AnonymousClass3PG.NETWORK
        L_0x01b9:
            r14 = 0
            r22 = 16383(0x3fff, float:2.2957E-41)
            X.2vl r13 = new X.2vl
            r15 = r14
            r16 = r14
            r18 = r7
            r19 = r7
            r20 = r7
            r21 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r26 = r7
            r17 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.1FI r2 = X.1FI.A0F
            java.lang.String r1 = ""
            X.9J8 r0 = new X.9J8
            r0.<init>((X.1FI) r2, (java.lang.String) r1)
            X.4EB r1 = new X.4EB
            r1.<init>(r0, r9, r8, r13)
            goto L_0x0043
        L_0x01e6:
            X.3PG r8 = X.AnonymousClass3PG.NETWORK
            goto L_0x01b3
        L_0x01e9:
            int r5 = X.AnonymousClass7TE.A0M(r2)
            goto L_0x003a
        L_0x01ef:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x01f5:
            X.0wj r2 = X.0wj.A01
            r1 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r0 = "CROSS_SURFACE_DISCOVERY_BG_SURFACE_UPDATE"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "current_surface"
            r2.ABQ(r0, r1)
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "updating_surface"
            r2.ABQ(r0, r1)
            r2.report()
            return
        L_0x0216:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IZ3.ATF(X.30Y, X.3oY):void");
    }

    public final String B4s() {
        return this.A06.B4s();
    }

    public final Set Bsw() {
        return this.A06.Bsw();
    }

    public final void CNn() {
        this.A06.CNn();
    }

    public final void Crm(int i) {
        this.A06.Crm(i);
    }

    public final void Crv(int i) {
        this.A06.Crv(i);
    }

    public final void Dpe() {
        this.A01 = false;
        C61076JwE jwE = this.A00;
        if (jwE != null) {
            this.A03.Dpf(jwE);
        }
    }

    public final void Dpg(String str) {
        C55994Hr0 hr0;
        0qQ.A0B(str, 0);
        C61076JwE jwE = this.A00;
        if (jwE != null && this.A01) {
            this.A03.DwI(jwE);
        }
        AnonymousClass1PN r5 = this.A03;
        AnonymousClass1PB r1 = this.A04;
        List ANR = this.A02.ANR();
        boolean z = this.A01;
        AnonymousClass1PM r52 = (AnonymousClass1PM) r5;
        C61076JwE jwE2 = new C61076JwE(r1, str);
        C55994Hr0 hr02 = new C55994Hr0(jwE2, AnonymousClass7TE.A1D(ANR));
        Map map = r52.A02;
        map.put(jwE2, hr02);
        r52.A01.add(hr02);
        if (z && (hr0 = (C55994Hr0) map.get(jwE2)) != null) {
            hr0.A02 = true;
            hr0.A00 = System.currentTimeMillis();
        }
        this.A00 = jwE2;
    }

    public final void Dpk() {
        C55994Hr0 hr0;
        this.A01 = true;
        C61076JwE jwE = this.A00;
        if (jwE != null && (hr0 = (C55994Hr0) ((AnonymousClass1PM) this.A03).A02.get(jwE)) != null) {
            hr0.A02 = true;
            hr0.A00 = System.currentTimeMillis();
        }
    }

    public final void EBI() {
        this.A06.EBI();
    }

    public final void EDQ(C233602vz r2) {
        0qQ.A0B(r2, 0);
        this.A06.EDQ(r2);
    }

    public final void EIr() {
        this.A06.EIr();
    }

    public final void EIs(1PW r2) {
        0qQ.A0B(r2, 0);
        this.A06.EIs(r2);
    }

    public final void EO6(C233452vk r2) {
        0qQ.A0B(r2, 0);
        this.A06.EO6(r2);
    }

    public final void Dpb() {
        C61076JwE jwE = this.A00;
        if (jwE != null) {
            this.A03.DwI(jwE);
        }
    }

    public IZ3(C233392ve r2, AnonymousClass1PN r3, AnonymousClass1PB r4, C228812mN r5) {
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A02 = r2;
    }

    public final void CJE(C376459Ib r2, List list) {
        AnonymousClass7TG.A1N(r2, list);
        this.A06.CJE(r2, list);
    }
}
