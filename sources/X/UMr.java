package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UMr extends AnonymousClass0T0 implements C257673xm {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final UMr F1M() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UMr) {
                UMr uMr = (UMr) obj;
                if (!0qQ.A0K(this.A01, uMr.A01) || !0qQ.A0K(this.A02, uMr.A02) || !0qQ.A0K(this.A03, uMr.A03) || !0qQ.A0K(this.A00, uMr.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AYR() {
        return this.A01;
    }

    public final String AYS() {
        return this.A02;
    }

    public final String B3n() {
        return this.A03;
    }

    public final Integer B3r() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClickToWhatsAppFallbackWrapper", V77.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public UMr(Integer num, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = num;
    }
}
