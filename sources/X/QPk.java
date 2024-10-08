package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class QPk extends AnonymousClass0T0 implements C13899TjM {
    public final C13896TjJ A00;
    public final C13897TjK A01;
    public final C13898TjL A02;

    public final QPk F4k() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPk) {
                QPk qPk = (QPk) obj;
                if (!0qQ.A0K(this.A00, qPk.A00) || !0qQ.A0K(this.A01, qPk.A01) || !0qQ.A0K(this.A02, qPk.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C13896TjJ Ae9() {
        return this.A00;
    }

    public final C13897TjK Bb0() {
        return this.A01;
    }

    public final C13898TjL Bk3() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGMetaPaymentsSDKSetupPayloadDict", C9772RgU.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public QPk(C13896TjJ tjJ, C13897TjK tjK, C13898TjL tjL) {
        this.A00 = tjJ;
        this.A01 = tjK;
        this.A02 = tjL;
    }
}
