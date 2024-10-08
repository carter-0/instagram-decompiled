package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UN7 extends AnonymousClass0T0 implements XAN {
    public final Integer A00;
    public final Integer A01;

    public final UN7 F4o() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UN7) {
                UN7 un7 = (UN7) obj;
                if (!0qQ.A0K(this.A00, un7.A00) || !0qQ.A0K(this.A01, un7.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer B1R() {
        return this.A00;
    }

    public final Integer Byd() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGNativeSmartTextOverlayTimestamp", V7U.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public UN7(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
