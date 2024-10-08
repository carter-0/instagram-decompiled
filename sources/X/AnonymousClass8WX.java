package X;

/* renamed from: X.8WX  reason: invalid class name */
public final class AnonymousClass8WX {
    public AnonymousClass80Y A00;
    public boolean A01;
    public final AnonymousClass0eM A02;

    public final AnonymousClass8XA A00() {
        int ordinal;
        if (!2CC.A00(AnonymousClass05K.A0j) || (ordinal = this.A00.ordinal()) == 0 || ordinal == 1) {
            return (AnonymousClass8XA) this.A02.getValue();
        }
        throw new RuntimeException();
    }

    public AnonymousClass8WX(AnonymousClass80U r3, C62320sa r4) {
        this.A02 = AnonymousClass0eN.A01(new C377429Lu(9, r4, this));
        if (2CC.A00(AnonymousClass05K.A0j)) {
            ((AnonymousClass80T) r3).A00.A01.add(new C40372Ab5(this));
        }
        this.A00 = ((AnonymousClass80T) r3).A00.A00;
    }
}
