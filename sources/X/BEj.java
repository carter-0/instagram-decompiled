package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FBTagType;
import java.util.List;

public final class BEj extends AnonymousClass0T0 implements DU8 {
    public final FBTagType A00;
    public final DUP A01;
    public final Boolean A02;
    public final String A03;
    public final List A04;

    public final BEj F2v() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEj) {
                BEj bEj = (BEj) obj;
                if (!0qQ.A0K(this.A02, bEj.A02) || this.A00 != bEj.A00 || !0qQ.A0K(this.A01, bEj.A01) || !0qQ.A0K(this.A04, bEj.A04) || !0qQ.A0K(this.A03, bEj.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean Ab9() {
        return this.A02;
    }

    public final FBTagType B4Z() {
        return this.A00;
    }

    public final DUP B4d() {
        return this.A01;
    }

    public final List Bdo() {
        return this.A04;
    }

    public final String C3u() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTFBUserTagInfoDict", CXW.A00(this));
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A07(this.A04, ((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31));
    }

    public BEj(FBTagType fBTagType, DUP dup, Boolean bool, String str, List list) {
        AnonymousClass7TG.A1R(list, str);
        this.A02 = bool;
        this.A00 = fBTagType;
        this.A01 = dup;
        this.A04 = list;
        this.A03 = str;
    }
}
