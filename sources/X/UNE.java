package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UNE extends AnonymousClass0T0 implements XAP {
    public final Integer A00;
    public final Integer A01;

    public final UNE F6b() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNE) {
                UNE une = (UNE) obj;
                if (!0qQ.A0K(this.A00, une.A00) || !0qQ.A0K(this.A01, une.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer BNi() {
        return this.A00;
    }

    public final Integer CAf() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoAppBadge", C16826V7h.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public UNE(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
