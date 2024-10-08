package X;

/* renamed from: X.Hsm  reason: case insensitive filesystem */
public final class C56099Hsm {
    public final float A00;
    public final long A01;
    public final AnonymousClass5b8 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56099Hsm) {
                C56099Hsm hsm = (C56099Hsm) obj;
                if (Float.compare(this.A00, hsm.A00) == 0) {
                    long j = this.A01;
                    long j2 = hsm.A01;
                    long j3 = C285605Ry.A01;
                    if (j != j2 || !0qQ.A0K(this.A02, hsm.A02)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A002 = G9w.A00(this.A00);
        long j = this.A01;
        long j2 = C285605Ry.A01;
        return AnonymousClass7TE.A0N(this.A02, C51972G9s.A07(j, A002));
    }

    public C56099Hsm(AnonymousClass5b8 r1, float f, long j) {
        this.A00 = f;
        this.A01 = j;
        this.A02 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Scale(scale=");
        A1A.append(this.A00);
        A1A.append(C273654mx.A00(453));
        long j = this.A01;
        long j2 = C285605Ry.A01;
        A1A.append(002.A0K(C273654mx.A00(514), ')', j));
        A1A.append(", animationSpec=");
        A1A.append(this.A02);
        return C51967G9n.A0r(A1A, ')');
    }
}
