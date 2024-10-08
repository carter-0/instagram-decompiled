package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UNO extends AnonymousClass0T0 implements XAX {
    public final Float A00;
    public final String A01;
    public final String A02;

    public final UNO F6l() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNO) {
                UNO uno = (UNO) obj;
                if (!0qQ.A0K(this.A01, uno.A01) || !0qQ.A0K(this.A00, uno.A00) || !0qQ.A0K(this.A02, uno.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ah8() {
        return this.A01;
    }

    public final Float Ah9() {
        return this.A00;
    }

    public final String C75() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardThumbnail", C16842V7x.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }

    public UNO(Float f, String str, String str2) {
        this.A01 = str;
        this.A00 = f;
        this.A02 = str2;
    }
}
