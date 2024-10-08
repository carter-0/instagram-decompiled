package X;

/* renamed from: X.Ac7  reason: case insensitive filesystem */
public final class C40436Ac7 implements B26 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8QZ A01;

    public final void DBC() {
    }

    public C40436Ac7(AnonymousClass8QZ r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void Du0() {
        AnonymousClass8QZ r4 = this.A01;
        r4.A06.CLA();
        int i = this.A00;
        C328787Gf r2 = r4.A0R;
        if (i == r2.Brp()) {
            int i2 = i + 1;
            if (i == r2.getCount() - 1) {
                i2 = i - 1;
            }
            AnonymousClass8QZ.A05(r4, i2);
        }
        r2.removeItem(i);
    }
}
