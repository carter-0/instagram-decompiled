package X;

/* renamed from: X.Lml  reason: case insensitive filesystem */
public final class C65067Lml implements C66507MUl {
    public final /* synthetic */ K5W A00;

    public C65067Lml(K5W k5w) {
        this.A00 = k5w;
    }

    public final int BrN() {
        AnonymousClass0eM r1 = this.A00.A0X;
        if (AnonymousClass7TE.A1b(C60295Jit.A01(r1).A01)) {
            return C60295Jit.A00(r1);
        }
        throw AnonymousClass7TE.A0z("segments not available");
    }

    public final int BrR(int i) {
        AnonymousClass0eM r2 = this.A00.A0X;
        if (AnonymousClass7TE.A1b(C60295Jit.A01(r2).A01)) {
            return C60295Jit.A01(r2).A01(i) + C60295Jit.A01(r2).A00(i);
        }
        throw AnonymousClass7TE.A0z("segments not available");
    }

    public final int BrU(int i) {
        AnonymousClass0eM r1 = this.A00.A0X;
        if (AnonymousClass7TE.A1b(C60295Jit.A01(r1).A01)) {
            return C60295Jit.A01(r1).A01(i);
        }
        throw AnonymousClass7TE.A0z("segments not available");
    }
}
