package X;

public final class BE8 extends AnonymousClass0T0 implements DU5 {
    public final C42053BFg A00;
    public final DS4 A01;
    public final YCC A02;
    public final 1Xj A03;
    public final Integer A04;

    public final BE8 F1X(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BE8) {
                BE8 be8 = (BE8) obj;
                if (!0qQ.A0K(this.A02, be8.A02) || !0qQ.A0K(this.A01, be8.A01) || !0qQ.A0K(this.A03, be8.A03) || !0qQ.A0K(this.A00, be8.A00) || !0qQ.A0K(this.A04, be8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final YCC AZ7() {
        return this.A02;
    }

    public final DS4 Ag5() {
        return this.A01;
    }

    public final 1Xj BPf() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ DV1 BVn() {
        return this.A00;
    }

    public final Integer CAf() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public BE8(YCC ycc, C42053BFg bFg, DS4 ds4, 1Xj r4, Integer num) {
        this.A02 = ycc;
        this.A01 = ds4;
        this.A03 = r4;
        this.A00 = bFg;
        this.A04 = num;
    }

    public final DU5 E7B(1E9 r1) {
        return this;
    }
}
