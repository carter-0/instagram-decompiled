package X;

import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.util.List;

public final class ULE extends AnonymousClass0T0 {
    public final C61062Jw0 A00;
    public final ShoppingTaggingFeedHeader A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final boolean A05;

    public ULE(C61062Jw0 jw0, ShoppingTaggingFeedHeader shoppingTaggingFeedHeader, String str, List list, List list2, boolean z) {
        0qQ.A0B(shoppingTaggingFeedHeader, 2);
        this.A04 = list;
        this.A01 = shoppingTaggingFeedHeader;
        this.A00 = jw0;
        this.A03 = list2;
        this.A05 = z;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ULE) {
                ULE ule = (ULE) obj;
                if (!0qQ.A0K(this.A04, ule.A04) || !0qQ.A0K(this.A01, ule.A01) || !0qQ.A0K(this.A00, ule.A00) || !0qQ.A0K(this.A03, ule.A03) || this.A05 != ule.A05 || !0qQ.A0K(this.A02, ule.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A04))))) + AnonymousClass7TG.A0E(this.A02);
    }

    public static final ULE A00(C61062Jw0 jw0, ShoppingTaggingFeedHeader shoppingTaggingFeedHeader, String str, List list, List list2, boolean z) {
        C51974G9v.A1O(list, shoppingTaggingFeedHeader, jw0, list2);
        return new ULE(jw0, shoppingTaggingFeedHeader, str, list, list2, z);
    }
}
