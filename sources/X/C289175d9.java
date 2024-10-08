package X;

/* renamed from: X.5d9  reason: invalid class name and case insensitive filesystem */
public final class C289175d9 implements C268094ck {
    public final C289145d6 A00;
    public final C267964cX A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C289175d9) {
                C289175d9 r5 = (C289175d9) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaceableResult(result=");
        sb.append(this.A00);
        sb.append(", placeable=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public final boolean CeH() {
        return this.A01.A0M().COx();
    }

    public C289175d9(C289145d6 r1, C267964cX r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
