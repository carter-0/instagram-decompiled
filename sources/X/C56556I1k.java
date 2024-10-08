package X;

/* renamed from: X.I1k  reason: case insensitive filesystem */
public final class C56556I1k {
    public final C54726HQf A00;
    public final C56146HtY A01;
    public final Integer A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56556I1k) {
                C56556I1k i1k = (C56556I1k) obj;
                if (this.A02 != i1k.A02 || !0qQ.A0K(this.A01, i1k.A01) || !0qQ.A0K(this.A03, i1k.A03) || !0qQ.A0K(this.A00, i1k.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "SUCCESS";
                break;
            case 2:
                str = "FAILED";
                break;
            default:
                str = "LOADING";
                break;
        }
        return ((((C51968G9o.A0F(str, intValue) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C56556I1k(C54726HQf hQf, C56146HtY htY, Integer num, String str) {
        this.A02 = num;
        this.A01 = htY;
        this.A03 = str;
        this.A00 = hQf;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImagineGeneratedImageWithStatus(imageStatus=");
        switch (this.A02.intValue()) {
            case 1:
                str = "SUCCESS";
                break;
            case 2:
                str = "FAILED";
                break;
            default:
                str = "LOADING";
                break;
        }
        A1A.append(str);
        A1A.append(", image=");
        A1A.append(this.A01);
        A1A.append(", prompt=");
        A1A.append(this.A03);
        A1A.append(", imagineError=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public C56556I1k() {
        this((C54726HQf) null, (C56146HtY) null, AnonymousClass05K.A00, (String) null);
    }
}
