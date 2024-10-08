package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UNF extends AnonymousClass0T0 implements C21024XAd {
    public final Float A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final UNF F6d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNF) {
                UNF unf = (UNF) obj;
                if (!0qQ.A0K(this.A00, unf.A00) || !0qQ.A0K(this.A01, unf.A01) || !0qQ.A0K(this.A02, unf.A02) || !0qQ.A0K(this.A03, unf.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Float AbH() {
        return this.A00;
    }

    public final Integer AgU() {
        return this.A01;
    }

    public final String AhG() {
        return this.A02;
    }

    public final String C8N() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardBackground", C16828V7j.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public UNF(Float f, Integer num, String str, String str2) {
        this.A00 = f;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
    }
}
