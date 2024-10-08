package X;

/* renamed from: X.Ozc  reason: case insensitive filesystem */
public final class C72267Ozc implements C250603lj {
    public final C229322nC A00 = new C229322nC(1.0f);
    public final O91 A01;

    public final void ATF(AnonymousClass30Y r23, C252093oY r24) {
        AnonymousClass30Y r8 = r23;
        C252093oY r6 = r24;
        boolean A1Z = AnonymousClass7TG.A1Z(r8, r6);
        if (r6.CEk(r8) == AnonymousClass05K.A0C || r6.CFe(r8) <= 0.5f) {
            C229322nC r5 = this.A00;
            String str = r8.A05;
            long A002 = r5.A00(str, r6.BlK());
            if (A002 >= 500) {
                O91 o91 = this.A01;
                Object obj = r8.A03;
                0qQ.A06(obj);
                C68151N2r n2r = (C68151N2r) obj;
                0qQ.A0B(n2r, A1Z ? 1 : 0);
                C71144Ody ody = o91.A00;
                String str2 = n2r.A04;
                int i = n2r.A01;
                int i2 = n2r.A02;
                int i3 = n2r.A03;
                int i4 = n2r.A00;
                C71144Ody.A06(ody, Boolean.valueOf(A1Z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf((long) ((double) A002)), "INTERACTION_CARD_VIEW", "IMPRESSION", str2, (String) null, (String) null);
            }
            r5.A01.remove(str);
            return;
        }
        this.A00.A01(r8.A05, r6.CFe(r8), r6.BlK());
    }

    public C72267Ozc(O91 o91) {
        this.A01 = o91;
    }
}
