package X;

/* renamed from: X.VjG  reason: case insensitive filesystem */
public final class C17978VjG {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17978VjG)) {
            return false;
        }
        C17978VjG vjG = (C17978VjG) obj;
        return this.A01.equals(vjG.A01) && this.A02.equals(vjG.A02) && this.A00 == vjG.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)) + this.A00;
    }

    public C17978VjG(String str, String str2, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
