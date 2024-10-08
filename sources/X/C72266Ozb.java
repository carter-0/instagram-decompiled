package X;

/* renamed from: X.Ozb  reason: case insensitive filesystem */
public final class C72266Ozb implements C250603lj {
    public final C229322nC A00 = new C229322nC(0.5f);
    public final OHU A01;

    public C72266Ozb(OHU ohu) {
        this.A01 = ohu;
    }

    public final void ATF(AnonymousClass30Y r14, C252093oY r15) {
        boolean A1Z = AnonymousClass7TG.A1Z(r14, r15);
        if (r15.CEk(r14) == AnonymousClass05K.A0C || r15.CFe(r14) <= 0.5f) {
            C229322nC r5 = this.A00;
            String str = r14.A05;
            long A002 = r5.A00(str, r15.BlK());
            if (A002 >= 250) {
                OHU ohu = this.A01;
                double d = (double) A002;
                Object obj = r14.A03;
                0qQ.A06(obj);
                C68199N5o n5o = (C68199N5o) obj;
                0qQ.A0B(n5o, A1Z ? 1 : 0);
                N4t n4t = n5o.A02;
                AnonymousClass4AB r2 = n4t.A05;
                C71144Ody ody = ohu.A03;
                if (r2 != null) {
                    ody.A0B(ohu.A02, n4t, (long) d, A1Z);
                } else {
                    ody.A08((long) d, N4t.A00(n4t), A1Z);
                }
            }
            r5.A01.remove(str);
            return;
        }
        this.A00.A01(r14.A05, r15.CFe(r14), r15.BlK());
    }
}
