package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BE2 extends AnonymousClass0T0 implements DT9 {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public BE2(String str, int i, boolean z) {
        0qQ.A0B(str, 3);
        this.A00 = i;
        this.A02 = z;
        this.A01 = str;
    }

    public final BE2 F1E() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BE2) {
                BE2 be2 = (BE2) obj;
                if (!(this.A00 == be2.A00 && this.A02 == be2.A02 && 0qQ.A0K(this.A01, be2.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int Alm() {
        return this.A00;
    }

    public final String BRi() {
        return this.A01;
    }

    public final boolean CQ7() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCarouselChildCommentMention", CVO.A00(this));
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A09(this.A02, this.A00 * 31));
    }
}
