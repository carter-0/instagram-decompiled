package X;

/* renamed from: X.Vw5  reason: case insensitive filesystem */
public final class C18651Vw5 {
    public final W08 A00;
    public final W08 A01;
    public final W08 A02;
    public final W08 A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18651Vw5) {
                C18651Vw5 vw5 = (C18651Vw5) obj;
                if (!0qQ.A0K(this.A02, vw5.A02) || !0qQ.A0K(this.A03, vw5.A03) || !0qQ.A0K(this.A00, vw5.A00) || !0qQ.A0K(this.A01, vw5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        W08 w08 = this.A02;
        if (w08.A00 <= 0.0f && w08.A01 <= 0.0f) {
            W08 w082 = this.A03;
            if (w082.A00 <= 0.0f && w082.A01 <= 0.0f) {
                W08 w083 = this.A00;
                if (w083.A00 > 0.0f || w083.A01 > 0.0f || this.A01.A00 > 0.0f) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A02))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComputedBorderRadius(topLeft=");
        sb.append(this.A02);
        sb.append(", topRight=");
        sb.append(this.A03);
        sb.append(", bottomLeft=");
        sb.append(this.A00);
        sb.append(", bottomRight=");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }

    public C18651Vw5(W08 w08, W08 w082, W08 w083, W08 w084) {
        this.A02 = w08;
        this.A03 = w082;
        this.A00 = w083;
        this.A01 = w084;
    }

    public C18651Vw5() {
        this(new W08(0.0f, 0.0f), new W08(0.0f, 0.0f), new W08(0.0f, 0.0f), new W08(0.0f, 0.0f));
    }
}
