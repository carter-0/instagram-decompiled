package X;

import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import java.util.ArrayList;
import java.util.List;

public final class Jv3 extends AnonymousClass0T0 {
    public final ProductCollectionFeedTaggingMeta A00;
    public final ArrayList A01;
    public final ArrayList A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Jv3) {
                Jv3 jv3 = (Jv3) obj;
                if (!0qQ.A0K(this.A01, jv3.A01) || !0qQ.A0K(this.A02, jv3.A02) || !0qQ.A0K(this.A04, jv3.A04) || !0qQ.A0K(this.A03, jv3.A03) || !0qQ.A0K(this.A00, jv3.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A03, (((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public Jv3(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, ArrayList arrayList, ArrayList arrayList2, List list, List list2) {
        C51972G9s.A1B(arrayList, list2);
        this.A01 = arrayList;
        this.A02 = arrayList2;
        this.A04 = list;
        this.A03 = list2;
        this.A00 = productCollectionFeedTaggingMeta;
    }

    public Jv3() {
        this((ProductCollectionFeedTaggingMeta) null, AnonymousClass7TE.A1C(), (ArrayList) null, (List) null, AnonymousClass7TE.A1C());
    }
}
