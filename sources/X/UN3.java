package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UN3 extends AnonymousClass0T0 implements XAV {
    public final Float A00;
    public final Float A01;
    public final Integer A02;

    public final UN3 F3y() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UN3) {
                UN3 un3 = (UN3) obj;
                if (!0qQ.A0K(this.A00, un3.A00) || !0qQ.A0K(this.A02, un3.A02) || !0qQ.A0K(this.A01, un3.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Float Aed() {
        return this.A00;
    }

    public final Integer BoI() {
        return this.A02;
    }

    public final Float BpJ() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsRrCoreRatingInfoDict", V7L.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public UN3(Float f, Float f2, Integer num) {
        this.A00 = f;
        this.A02 = num;
        this.A01 = f2;
    }
}
