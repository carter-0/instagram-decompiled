package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BID extends AnonymousClass0T0 implements DT5 {
    public final String A00;
    public final String A01;

    public final BID FDJ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BID) {
                BID bid = (BID) obj;
                if (!0qQ.A0K(this.A00, bid.A00) || !0qQ.A0K(this.A01, bid.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTVisualRepliesCommentInfo", C44577ChB.A00(this));
    }

    public final String getCommentId() {
        return this.A00;
    }

    public final String getCommenterUsername() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public BID(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
