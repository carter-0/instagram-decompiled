package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Vc  reason: invalid class name and case insensitive filesystem */
public final class C308656Vc extends AnonymousClass3CP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final UserSession A05;
    public final AnonymousClass4DU A06;
    public final AnonymousClass3BQ A07;
    public final C249863kU A08;
    public final boolean A09;
    public final C308816Vs A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final boolean A7L(C233632w4 r2, C233042ur r3, C233072uu r4) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        0qQ.A0B(r2, 2);
        if (this.A0C) {
            this.A00 = r2.A01;
        }
        return super.A7L(r2, r3, r4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C308656Vc(android.content.Context r21, X.AnonymousClass07i r22, com.instagram.common.session.UserSession r23, X.C233172vA r24, X.AnonymousClass4DU r25, X.AnonymousClass3BQ r26, X.AnonymousClass3CL r27, X.C270424gi r28, X.1PX r29, X.C233212vI r30, X.C249863kU r31, X.C228232l0 r32, X.C249763kK r33, java.lang.String r34, boolean r35, boolean r36, boolean r37) {
        /*
            r20 = this;
            r14 = r32
            r13 = r30
            r12 = r29
            r11 = r28
            r0 = r37
            r8 = r24
            r18 = r36
            r7 = r23
            r17 = r35
            r6 = r22
            r16 = r34
            r5 = r21
            r15 = r33
            r4 = r20
            r9 = r26
            r10 = r27
            r19 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.A05 = r7
            r4.A07 = r9
            r3 = r31
            r4.A08 = r3
            r1 = r25
            r4.A06 = r1
            r4.A0D = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310542582546596(0x81003f003c00a4, double:3.026271567797195E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r4.A09 = r0
            r0 = 36326949353830493(0x810f2b0002385d, double:3.0366472760218965E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r4.A0B = r0
            X.6Vd r0 = new X.6Vd
            r0.<init>(r4)
            r4.A0A = r0
            r3.A05(r0)
            r0 = 36310542581301400(0x81003f00290098, double:3.026271567009728E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r4.A04 = r0
            r0 = 36310542583005354(0x81003f004300aa, double:3.026271568087315E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r4.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308656Vc.<init>(android.content.Context, X.07i, com.instagram.common.session.UserSession, X.2vA, X.4DU, X.3BQ, X.3CL, X.4gi, X.1PX, X.2vI, X.3kU, X.2l0, X.3kK, java.lang.String, boolean, boolean, boolean):void");
    }

    public static final boolean A00(C308656Vc r9) {
        boolean z = false;
        if (!r9.A05.get() || r9.A04) {
            return false;
        }
        AnonymousClass3CL r0 = r9.A0G;
        int Azm = r0.Azm();
        r9.A01 = Azm;
        int Aa2 = r0.Aa2();
        int i = r9.A03;
        int i2 = r9.A00;
        int i3 = i2 - (r9.A01 - r9.A00);
        r9.A03 = i3;
        if (r9.A0D && r9.A0B && i2 > 0 && r9.A06) {
            r9.A01 = 1;
            Azm = 1;
            Aa2 = 0;
        }
        if (r9.A02 <= Aa2 && i2 >= Azm && r9.A03 == AnonymousClass05K.A00) {
            if (r9.A0K) {
                r9.Cn9(i3);
            } else {
                r9.A07(i3, false);
            }
            z = true;
        }
        if (r9.A03 != i) {
            C249863kU r6 = r9.A08;
            if (!r6.A02.isEmpty()) {
                String moduleName = AnonymousClass6KF.A00(r9.A06, ((C250973mM) r6.A00().BTb()).A0H, r9.A07).getModuleName();
                0wc A012 = AnonymousClass0kN.A01(new 0xG(moduleName), r9.A05);
                0Aj A002 = A012.A00(A012.A00, "inventory_based_request_status");
                A002.A8k("ads_pool_threshold_for_next_request", Integer.valueOf(Aa2));
                A002.A8k("earliest_request_position", Integer.valueOf(r9.A01));
                A002.A7p("is_request_sent", Boolean.valueOf(z));
                A002.A8k("num_items_in_pool", Integer.valueOf(r9.A02));
                A002.A8k("reel_position", Integer.valueOf(r9.A00));
                A002.Cgf();
            }
        }
        return true;
    }

    public final String A06() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.A06());
        sb.append(", numAdsInPool:");
        sb.append(this.A02);
        sb.append(", earliestRequestPosition:");
        sb.append(this.A01);
        sb.append(", currentIndex:");
        sb.append(this.A00);
        return sb.toString();
    }

    public final void A07(int i, boolean z) {
        if (!this.A0D || !this.A0B || i != 0) {
            super.A07(i, z);
        }
    }

    public final boolean D69(int i, int i2) {
        this.A00 = i;
        this.A04 = false;
        return A00(this);
    }

    public final void DsJ(int i) {
        if (this.A09) {
            this.A02 = i;
            A00(this);
        }
    }

    public final AnonymousClass4LO A05(boolean z) {
        AnonymousClass4LO A052 = super.A05(z);
        A052.A00 = this.A01;
        A052.A0I = true;
        A052.A02 = this.A00;
        if (!z) {
            A052.A03 = this.A02;
        }
        return A052;
    }

    public final void deactivate() {
        super.deactivate();
        C249863kU r0 = this.A08;
        r0.A00.remove(this.A0A);
    }
}
