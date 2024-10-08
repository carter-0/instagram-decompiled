package X;

/* renamed from: X.8E5  reason: invalid class name */
public final class AnonymousClass8E5 {
    public AnonymousClass80Y A00;
    public final AnonymousClass0eM A01;

    public final AnonymousClass8Zl A00() {
        int ordinal;
        if (!2CC.A00(AnonymousClass05K.A15) || (ordinal = this.A00.ordinal()) == 0) {
            return (AnonymousClass8Zl) this.A01.getValue();
        }
        if (ordinal == 1) {
            return new C40345Aae();
        }
        throw new RuntimeException();
    }

    public AnonymousClass8E5(AnonymousClass80U r3, C62320sa r4) {
        this.A01 = AnonymousClass0eN.A01(new C377269Le(r4, 25));
        if (2CC.A00(AnonymousClass05K.A15)) {
            ((AnonymousClass80T) r3).A00.A01.add(new C40373Ab6(this));
        }
        this.A00 = ((AnonymousClass80T) r3).A00.A00;
    }
}
