package X;

/* renamed from: X.HqR  reason: case insensitive filesystem */
public final class C55960HqR {
    public final int A00;
    public final C268064ch A01;
    public final AnonymousClass5SX A02;
    public final C56558I1m A03;

    public C55960HqR(C268064ch r1, AnonymousClass5SX r2, C56558I1m i1m, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A03 = i1m;
        this.A01 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ScrollCaptureCandidate(node=");
        A1A.append(this.A02);
        A1A.append(", depth=");
        A1A.append(this.A00);
        A1A.append(", viewportBoundsInWindow=");
        A1A.append(this.A03);
        A1A.append(AnonymousClass000.A00(2007));
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
