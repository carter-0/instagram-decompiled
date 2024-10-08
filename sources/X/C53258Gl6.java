package X;

/* renamed from: X.Gl6  reason: case insensitive filesystem */
public final class C53258Gl6 extends AnonymousClass0T0 {
    public final C61017JvH A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53258Gl6) {
                C53258Gl6 gl6 = (C53258Gl6) obj;
                if (this.A01 != gl6.A01 || !0qQ.A0K(this.A00, gl6.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51965G9l.A05(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public C53258Gl6(C61017JvH jvH, boolean z) {
        this.A01 = z;
        this.A00 = jvH;
    }
}
