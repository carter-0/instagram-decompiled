package X;

/* renamed from: X.GlL  reason: case insensitive filesystem */
public final class C53273GlL extends AnonymousClass0T0 {
    public final int A00;
    public final C304836Fk A01;
    public final boolean A02;
    public final boolean A03 = true;

    public C53273GlL(C304836Fk r2, int i, boolean z) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53273GlL) {
                C53273GlL glL = (C53273GlL) obj;
                if (!(this.A00 == glL.A00 && 0qQ.A0K(this.A01, glL.A01) && this.A03 == glL.A03 && this.A02 == glL.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A01, this.A00 * 31)));
    }
}
