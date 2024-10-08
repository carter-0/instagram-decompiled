package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BHP extends AnonymousClass0T0 implements DUT {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final BHP FBR(1E9 r1) {
        return this;
    }

    public final BHP FBS(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHP) {
                BHP bhp = (BHP) obj;
                if (!0qQ.A0K(this.A01, bhp.A01) || !0qQ.A0K(this.A03, bhp.A03) || !0qQ.A0K(this.A00, bhp.A00) || !0qQ.A0K(this.A02, bhp.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List BRk() {
        return this.A03;
    }

    public final Integer Bzh() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStorySubscriptionShoutoutMentionTappableData", C44447Cf5.A00(this));
    }

    public final String getId() {
        return this.A01;
    }

    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A01)) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }

    public BHP(Integer num, String str, String str2, List list) {
        AnonymousClass7TG.A1O(str, list);
        this.A01 = str;
        this.A03 = list;
        this.A00 = num;
        this.A02 = str2;
    }

    public final DUT E98(1E9 r1) {
        return this;
    }
}
