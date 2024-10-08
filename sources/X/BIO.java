package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BIO extends AnonymousClass0T0 implements DUG {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public BIO(String str, List list, boolean z) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A02 = z;
        this.A00 = str;
    }

    public final BIO FE4(1E9 r1) {
        return this;
    }

    public final BIO FE5(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIO) {
                BIO bio = (BIO) obj;
                if (!0qQ.A0K(this.A01, bio.A01) || this.A02 != bio.A02 || !0qQ.A0K(this.A00, bio.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List AoF() {
        return this.A01;
    }

    public final boolean BUF() {
        return this.A02;
    }

    public final String BaN() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGetClipsSpinsResponse", C44737Ck5.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A01)) + AnonymousClass7TG.A0E(this.A00);
    }

    public final DUG E9h(1E9 r1) {
        return this;
    }
}
