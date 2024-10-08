package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UNK extends AnonymousClass0T0 implements XAQ {
    public final Integer A00;
    public final Integer A01;

    public final UNK F6g() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNK) {
                UNK unk = (UNK) obj;
                if (!0qQ.A0K(this.A00, unk.A00) || !0qQ.A0K(this.A01, unk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer ByA() {
        return this.A00;
    }

    public final Integer Byh() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardPhotoAnimation", C16835V7q.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public UNK(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
