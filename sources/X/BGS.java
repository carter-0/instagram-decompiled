package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BGS extends AnonymousClass0T0 implements DTQ {
    public final int A00;
    public final int A01;
    public final String A02;

    public BGS(int i, int i2, String str) {
        0qQ.A0B(str, 3);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public final BGS F96() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGS) {
                BGS bgs = (BGS) obj;
                if (!(this.A00 == bgs.A00 && this.A01 == bgs.A01 && 0qQ.A0K(this.A02, bgs.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int B1Q() {
        return this.A00;
    }

    public final int Byb() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSingleTokenTranscriptionData", C44358Cde.A00(this));
    }

    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }
}
