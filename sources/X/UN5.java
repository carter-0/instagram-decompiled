package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UN5 extends AnonymousClass0T0 implements C21022XAb {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;

    public final UN5 F4l() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UN5) {
                UN5 un5 = (UN5) obj;
                if (!0qQ.A0K(this.A00, un5.A00) || !0qQ.A0K(this.A01, un5.A01) || !0qQ.A0K(this.A02, un5.A02) || !0qQ.A0K(this.A03, un5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer AhM() {
        return this.A00;
    }

    public final Integer AhN() {
        return this.A01;
    }

    public final Integer C8Q() {
        return this.A02;
    }

    public final Integer C8R() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGNativeSmartTextOverlayCoorninates", V7P.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public UN5(Integer num, Integer num2, Integer num3, Integer num4) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = num3;
        this.A03 = num4;
    }
}
