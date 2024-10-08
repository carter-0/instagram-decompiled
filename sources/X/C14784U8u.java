package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import java.util.List;

/* renamed from: X.U8u  reason: case insensitive filesystem */
public final class C14784U8u extends 2YL {
    public final UserSession A00;
    public final C249513ju A01;
    public final AnonymousClass0r6 A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    public C14784U8u(UserSession userSession, TaggingFeedMultiSelectState taggingFeedMultiSelectState) {
        TaggingFeedMultiSelectState taggingFeedMultiSelectState2 = taggingFeedMultiSelectState;
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        if (taggingFeedMultiSelectState == null) {
            taggingFeedMultiSelectState2 = new TaggingFeedMultiSelectState((ProductCollectionFeedTaggingMeta) null, 0sn.A00, 0Yt.A0E(), 0Yt.A0E(), 0Yt.A0E());
        }
        02z r0 = new 02z(taggingFeedMultiSelectState2);
        this.A03 = r0;
        this.A04 = r0;
        1HR r02 = new 1HR(0);
        this.A01 = r02;
        this.A02 = 0u9.A04(r02);
    }

    public final ProductCollection A01() {
        TaggingFeedMultiSelectState taggingFeedMultiSelectState = (TaggingFeedMultiSelectState) this.A04.getValue();
        0qQ.A0B(taggingFeedMultiSelectState, 0);
        return (ProductCollection) 00k.A0A(taggingFeedMultiSelectState.A02.values());
    }

    public final void A02(C15035UKo uKo, Product product, List list) {
        this.A03.Epw(new C58768IxF(20, product, this, list, uKo).invoke(this.A04.getValue()));
    }

    public static TaggingFeedMultiSelectState A00(AnonymousClass0eM r0) {
        return (TaggingFeedMultiSelectState) ((C14784U8u) r0.getValue()).A04.getValue();
    }
}
