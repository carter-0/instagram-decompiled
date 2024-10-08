package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BFK extends AnonymousClass0T0 implements C46320DUx {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Integer A09;
    public final Integer A0A;

    public final BFK F5N() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFK) {
                BFK bfk = (BFK) obj;
                if (!0qQ.A0K(this.A09, bfk.A09) || !0qQ.A0K(this.A00, bfk.A00) || !0qQ.A0K(this.A0A, bfk.A0A) || !0qQ.A0K(this.A01, bfk.A01) || !0qQ.A0K(this.A02, bfk.A02) || !0qQ.A0K(this.A03, bfk.A03) || !0qQ.A0K(this.A04, bfk.A04) || !0qQ.A0K(this.A05, bfk.A05) || !0qQ.A0K(this.A06, bfk.A06) || !0qQ.A0K(this.A07, bfk.A07) || !0qQ.A0K(this.A08, bfk.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer AZv() {
        return this.A09;
    }

    public final Boolean AxU() {
        return this.A00;
    }

    public final Integer AyA() {
        return this.A0A;
    }

    public final Boolean BDN() {
        return this.A01;
    }

    public final Boolean Bv5() {
        return this.A04;
    }

    public final Boolean BvE() {
        return this.A05;
    }

    public final Boolean BvF() {
        return this.A06;
    }

    public final Boolean Bvd() {
        return this.A07;
    }

    public final Boolean Bw5() {
        return this.A08;
    }

    public final Boolean CR8() {
        return this.A02;
    }

    public final Boolean CV2() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTLikerConfigDict", C44203CZq.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((((((AnonymousClass7TG.A0C(this.A09) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A08);
    }

    public BFK(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, Integer num2) {
        this.A09 = num;
        this.A00 = bool;
        this.A0A = num2;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
        this.A04 = bool5;
        this.A05 = bool6;
        this.A06 = bool7;
        this.A07 = bool8;
        this.A08 = bool9;
    }
}
