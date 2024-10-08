package X;

/* renamed from: X.4EB  reason: invalid class name */
public final class AnonymousClass4EB extends AnonymousClass0T0 {
    public final AnonymousClass9J8 A00;
    public final 1Xg A01;
    public final AnonymousClass3PG A02;
    public final C233462vl A03;

    public AnonymousClass4EB(AnonymousClass9J8 r2, 1Xg r3, AnonymousClass3PG r4, C233462vl r5) {
        0qQ.A0B(r5, 3);
        0qQ.A0B(r2, 4);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4EB) {
                AnonymousClass4EB r5 = (AnonymousClass4EB) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A02 != r5.A02 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SponsoredFeedItem(feedItem=");
        sb.append(this.A01);
        sb.append(", deliveryDataType=");
        sb.append(this.A02);
        sb.append(AnonymousClass000.A00(2017));
        sb.append(this.A03);
        sb.append(", requestData=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
