package X;

/* renamed from: X.8QS  reason: invalid class name */
public final class AnonymousClass8QS implements C352278Cs {
    public final /* synthetic */ AnonymousClass8QN A00;

    public AnonymousClass8QS(AnonymousClass8QN r1) {
        this.A00 = r1;
    }

    public final void Dxn(int i) {
        int i2;
        AnonymousClass8QN r3 = this.A00;
        if (r3.A05 != null) {
            AnonymousClass8QP r2 = r3.A0Y;
            if (r2.A00 == r2.A01.size() - 1) {
                r3.A05.dismiss();
                r3.A05 = null;
                i2 = 0;
            } else {
                i2 = r2.A00 + 1;
            }
            r3.A0c.A09(i2);
        }
        C378369Pn r1 = r3.A0O.A0B;
        if (r1 != null) {
            r1.A0N.remove(this);
            C378459Pw r0 = r1.A08;
            if (r0 != null) {
                r0.A0A.remove(this);
            }
        }
    }
}
