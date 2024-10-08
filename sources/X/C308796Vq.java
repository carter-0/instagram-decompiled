package X;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.6Vq  reason: invalid class name and case insensitive filesystem */
public final class C308796Vq implements C233432vi {
    public 1PW A00 = 1PW.A0K;
    public WeakReference A01;
    public final C228812mN A02;
    public final C233402vf A03;
    public final C252343ox A04;
    public final Set A05 = new LinkedHashSet();
    public final boolean A06;
    public final C249863kU A07;
    public final boolean A08;
    public final boolean A09;

    public final String B4s() {
        return "";
    }

    public final void CJE(C376459Ib r1, List list) {
    }

    public final void Crv(int i) {
    }

    public final /* synthetic */ void Dpb() {
    }

    public final /* synthetic */ void Dpe() {
    }

    public final /* synthetic */ void Dpg(String str) {
    }

    public final /* synthetic */ void Dpk() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095 A[Catch:{ all -> 0x0105, all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2 A[Catch:{ all -> 0x0105, all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00eb A[Catch:{ all -> 0x0105, all -> 0x010a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(X.C252093oY r19, int r20) {
        /*
            r18 = this;
            java.lang.String r0 = "BaseGapRuleEnforcerAction.maybeValidateGapRules"
            X.0lp r5 = X.0lq.A00(r0)
            r3 = r18
            X.3kU r1 = r3.A07     // Catch:{ all -> 0x0105 }
            java.util.LinkedList r0 = r1.A02     // Catch:{ all -> 0x0105 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0105 }
            r2 = 0
            r7 = r19
            r11 = r20
            if (r0 == 0) goto L_0x003d
            X.2vf r4 = r3.A03     // Catch:{ all -> 0x0105 }
            java.util.List r1 = r4.BYj()     // Catch:{ all -> 0x0105 }
            boolean r0 = r3.A06     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x008c
            X.3n0 r0 = r4.Coa()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x008c
            java.lang.Object r4 = r0.BTb()     // Catch:{ all -> 0x0105 }
            if (r4 == 0) goto L_0x008c
            X.3ox r0 = r3.A04     // Catch:{ all -> 0x0105 }
            boolean r0 = r0.A0J(r7, r4, r1, r11)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x008c
            X.2mN r1 = r3.A02     // Catch:{ all -> 0x0105 }
            java.util.Set r0 = r3.A05     // Catch:{ all -> 0x0105 }
            X.C266924aZ.A00(r1, r4, r0)     // Catch:{ all -> 0x0105 }
            goto L_0x008c
        L_0x003d:
            X.3ox r6 = r3.A04     // Catch:{ all -> 0x0105 }
            boolean r0 = r6.A06     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x008c
            X.3n0 r0 = r1.A00()     // Catch:{ all -> 0x0105 }
            java.lang.Object r9 = r0.BTb()     // Catch:{ all -> 0x0105 }
            X.2vf r0 = r3.A03     // Catch:{ all -> 0x0105 }
            java.util.List r10 = r0.BYj()     // Catch:{ all -> 0x0105 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0105 }
            X.1PW r8 = new X.1PW     // Catch:{ all -> 0x0105 }
            r8.<init>(r0)     // Catch:{ all -> 0x0105 }
            X.1PW r1 = r3.A00     // Catch:{ all -> 0x0105 }
            X.1PW r0 = X.1PW.A0K     // Catch:{ all -> 0x0105 }
            if (r1 == r0) goto L_0x0062
            int r0 = r1.A05     // Catch:{ all -> 0x0105 }
            r8.A05 = r0     // Catch:{ all -> 0x0105 }
        L_0x0062:
            r6.A0F(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0105 }
            boolean r0 = r3.A06     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0076
            java.lang.Integer r1 = r8.A0C     // Catch:{ all -> 0x0105 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0105 }
            if (r1 != r0) goto L_0x0076
            X.2mN r1 = r3.A02     // Catch:{ all -> 0x0105 }
            java.util.Set r0 = r3.A05     // Catch:{ all -> 0x0105 }
            X.C266924aZ.A00(r1, r9, r0)     // Catch:{ all -> 0x0105 }
        L_0x0076:
            java.util.Set r0 = r3.A05     // Catch:{ all -> 0x0105 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0105 }
        L_0x007c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0105 }
            X.2vz r0 = (X.C233602vz) r0     // Catch:{ all -> 0x0105 }
            r0.DKi(r8)     // Catch:{ all -> 0x0105 }
            goto L_0x007c
        L_0x008c:
            r8 = r2
        L_0x008d:
            X.2vf r1 = r3.A03     // Catch:{ all -> 0x0105 }
            X.3n0 r0 = r1.Coa()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0099
            java.lang.Object r2 = r0.BTb()     // Catch:{ all -> 0x0105 }
        L_0x0099:
            boolean r0 = r3.A09     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0101
            if (r2 == 0) goto L_0x0101
            X.3ox r12 = r3.A04     // Catch:{ all -> 0x0105 }
            java.util.List r4 = r1.BYj()     // Catch:{ all -> 0x0105 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0105 }
            X.1PW r13 = new X.1PW     // Catch:{ all -> 0x0105 }
            r13.<init>(r0)     // Catch:{ all -> 0x0105 }
            X.1PW r1 = r3.A00     // Catch:{ all -> 0x0105 }
            X.1PW r0 = X.1PW.A0K     // Catch:{ all -> 0x0105 }
            if (r1 == r0) goto L_0x00b6
            int r0 = r1.A05     // Catch:{ all -> 0x0105 }
            r13.A05 = r0     // Catch:{ all -> 0x0105 }
        L_0x00b6:
            int r14 = r12.A05(r4)     // Catch:{ all -> 0x0105 }
            int r15 = r12.A06(r4)     // Catch:{ all -> 0x0105 }
            X.2vm r4 = r12.A09(r2)     // Catch:{ all -> 0x0105 }
            r4.getClass()     // Catch:{ all -> 0x0105 }
            r2 = 1
            int r1 = r12.A01(r11, r2)     // Catch:{ all -> 0x0105 }
            r12.A03(r4, r14, r15, r11)     // Catch:{ all -> 0x0105 }
            r0 = -1
            if (r14 != r0) goto L_0x00e9
            if (r15 != r0) goto L_0x00e9
            boolean r0 = r12.A0K(r4)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = "highest_position_rule_and_consumed_media_gap_did_meet"
            r13.A01(r0)     // Catch:{ all -> 0x0105 }
            r13.A0H = r2     // Catch:{ all -> 0x0105 }
            r17 = r11
            r16 = r1
            r12.A0G(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0105 }
            X.C252343ox.A00(r12, r13, r4, r1)     // Catch:{ all -> 0x0105 }
        L_0x00e9:
            if (r8 != 0) goto L_0x0101
            java.util.Set r0 = r3.A05     // Catch:{ all -> 0x0105 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0105 }
        L_0x00f1:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0101
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0105 }
            X.2vz r0 = (X.C233602vz) r0     // Catch:{ all -> 0x0105 }
            r0.DJI(r13)     // Catch:{ all -> 0x0105 }
            goto L_0x00f1
        L_0x0101:
            r5.close()
            return
        L_0x0105:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x010a }
            throw r1
        L_0x010a:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308796Vq.A00(X.3oY, int):void");
    }

    public final void A7t(C233602vz r2) {
        if (r2 != null) {
            this.A05.add(r2);
        }
    }

    public final 1PW AGd(List list) {
        int i;
        C252343ox r4 = this.A04;
        1PW A082 = r4.A08(list);
        1PW r1 = this.A00;
        if (!(r1 == 1PW.A0K || (i = r1.A05) == -1)) {
            boolean z = r4.A06;
            int i2 = A082.A05;
            if (z) {
                i2 += i;
            }
            A082.A05 = i2;
        }
        return A082;
    }

    public final C233612w1 AMC() {
        return new C308806Vr(this);
    }

    public final AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final void ATF(AnonymousClass30Y r4, C252093oY r5) {
        this.A01 = new WeakReference(r5);
        if (r5.CEk(r4) == AnonymousClass05K.A00) {
            C252343ox r1 = this.A04;
            r1.A04 = this.A02;
            r1.ATF(r4, r5);
            A00(r5, r1.A04(r4.A04));
            for (C233602vz D6E : this.A05) {
                D6E.D6E(r4.A03);
            }
        }
    }

    public final Set Bsw() {
        return new HashSet();
    }

    public final void CNn() {
        this.A04.A0B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Crm(int r3) {
        /*
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.A01
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r0.get()
            X.3oY r1 = (X.C252093oY) r1
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0013
        L_0x0010:
            r2.A00(r1, r3)
        L_0x0013:
            return
        L_0x0014:
            r1 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308796Vq.Crm(int):void");
    }

    public final void EBI() {
        this.A04.A0C();
    }

    public final void EDQ(C233602vz r2) {
        this.A05.remove(r2);
    }

    public final void EIr() {
        this.A04.A06 = true;
    }

    public final void EIs(1PW r6) {
        this.A00 = r6;
        C252343ox r4 = this.A04;
        int i = r6.A05;
        if (i != -1) {
            r4.A03 = i;
        }
        r4.A05.BtU().A03(i, r6.A04, r4.A00);
    }

    public final void EO6(C233452vk r2) {
        this.A04.A05 = r2;
    }

    public C308796Vq(C228812mN r2, C233402vf r3, C249863kU r4, C252343ox r5, boolean z, boolean z2, boolean z3) {
        this.A07 = r4;
        this.A03 = r3;
        this.A04 = r5;
        this.A02 = r2;
        this.A09 = z;
        this.A06 = z2;
        this.A08 = z3;
    }
}
