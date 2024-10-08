package X;

/* renamed from: X.GRr  reason: case insensitive filesystem */
public final class C52414GRr extends AnonymousClass0T0 implements JQI {
    public final int A00;
    public final C53401GnY A01;
    public final C61073JwB A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52414GRr) {
                C52414GRr gRr = (C52414GRr) obj;
                if (this.A00 != gRr.A00 || !0qQ.A0K(this.A03, gRr.A03) || !0qQ.A0K(this.A01, gRr.A01) || !0qQ.A0K(this.A02, gRr.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C53401GnY Arn() {
        return this.A01;
    }

    public final boolean BB2() {
        return AnonymousClass7TF.A1V(this.A02);
    }

    public final int BbP() {
        return this.A00;
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C52414GRr(C53401GnY gnY, C61073JwB jwB, Integer num, int i) {
        this.A00 = i;
        this.A03 = num;
        this.A01 = gnY;
        this.A02 = jwB;
    }
}
