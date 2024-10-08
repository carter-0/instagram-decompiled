package X;

/* renamed from: X.WEt  reason: case insensitive filesystem */
public final class C18966WEt implements X24 {
    public final /* synthetic */ C3034368u A00;
    public final /* synthetic */ C277014uI A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ C277014uI A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0sP A05;

    public C18966WEt(C3034368u r1, C277014uI r2, C277014uI r3, C277014uI r4, C62320sa r5, 0sP r6) {
        this.A03 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final boolean D0Q(Integer num) {
        C277014uI r3;
        int A032 = C51967G9n.A03(num, 0);
        if (A032 == 0) {
            C277014uI r32 = this.A03;
            if (r32 == null) {
                return false;
            }
            C307886Rw.A03((C307786Rm) this.A04.invoke(), this.A00.A02, AnonymousClass6Tm.A01, r32);
        } else if (A032 == 2) {
            C277014uI r33 = this.A02;
            if (r33 == null) {
                return false;
            }
            C307886Rw.A03((C307786Rm) this.A04.invoke(), this.A00.A02, AnonymousClass6Tm.A01, r33);
        } else if (A032 != 1 || (r3 = this.A01) == null) {
            return false;
        } else {
            try {
                C307886Rw.A03((C307786Rm) this.A04.invoke(), this.A00.A02, AnonymousClass6Tm.A01, r3);
            } catch (Throwable th) {
                this.A05.invoke(th);
            }
        }
        return true;
    }
}
