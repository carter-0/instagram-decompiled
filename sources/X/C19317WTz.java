package X;

/* renamed from: X.WTz  reason: case insensitive filesystem */
public final class C19317WTz implements C250603lj {
    public final C313376gL A00;

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        boolean A1U = AnonymousClass7TF.A1U(0, r6, r7);
        float CFe = r7.CFe(r6);
        int A0A = C51968G9o.A0A(r6, r7);
        if (A0A == 0 || A0A == A1U) {
            C313376gL r3 = this.A00;
            Object obj = r6.A03;
            0qQ.A06(obj);
            C305866Jw r2 = (C305866Jw) obj;
            0qQ.A0B(r2, 0);
            if (!r3.A00) {
                r3.A01(r2);
                r3.A02.put(r2, Float.valueOf(CFe));
                return;
            }
            return;
        }
        C313376gL r22 = this.A00;
        Object obj2 = r6.A03;
        0qQ.A06(obj2);
        C305866Jw r1 = (C305866Jw) obj2;
        0qQ.A0B(r1, 0);
        if (!r22.A00) {
            r22.A02(r1, "scroll", false);
            r22.A02.remove(r1);
        }
    }

    public C19317WTz(C313376gL r1) {
        this.A00 = r1;
    }
}
