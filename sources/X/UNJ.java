package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UNJ extends AnonymousClass0T0 implements C21035XAo {
    public final Float A00;
    public final Float A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    public final UNJ F6i() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNJ) {
                UNJ unj = (UNJ) obj;
                if (!0qQ.A0K(this.A04, unj.A04) || !0qQ.A0K(this.A00, unj.A00) || !0qQ.A0K(this.A01, unj.A01) || !0qQ.A0K(this.A02, unj.A02) || !0qQ.A0K(this.A05, unj.A05) || !0qQ.A0K(this.A03, unj.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ah8() {
        return this.A04;
    }

    public final Float AhA() {
        return this.A00;
    }

    public final Float ArU() {
        return this.A01;
    }

    public final Integer BCu() {
        return this.A02;
    }

    public final Integer CGY() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardPhoto", C16834V7p.A00(this));
    }

    public final String getUrl() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public UNJ(Float f, Float f2, Integer num, Integer num2, String str, String str2) {
        this.A04 = str;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = num;
        this.A05 = str2;
        this.A03 = num2;
    }
}
