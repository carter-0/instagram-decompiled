package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BHF extends AnonymousClass0T0 implements C46288DTr {
    public final String A00;
    public final List A01;

    public final BHF FB8(1E9 r1) {
        return this;
    }

    public final BHF FB9(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHF) {
                BHF bhf = (BHF) obj;
                if (!0qQ.A0K(this.A00, bhf.A00) || !0qQ.A0K(this.A01, bhf.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List Bjt() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryReactionStickerReactors", C44434Ces.A00(this));
    }

    public final String getEmoji() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public BHF(String str, List list) {
        AnonymousClass7TG.A1O(str, list);
        this.A00 = str;
        this.A01 = list;
    }

    public final C46288DTr E90(1E9 r1) {
        return this;
    }
}
