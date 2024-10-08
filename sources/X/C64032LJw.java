package X;

import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LJw  reason: case insensitive filesystem */
public abstract class C64032LJw {
    public static final List A00(TaggingFeedMultiSelectState taggingFeedMultiSelectState) {
        0qQ.A0B(taggingFeedMultiSelectState, 0);
        Collection values = taggingFeedMultiSelectState.A04.values();
        ArrayList A0r = AnonymousClass7TG.A0r(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            JTT.A1U(A0r, it);
        }
        return A0r;
    }

    public static final boolean A01(TaggingFeedMultiSelectState taggingFeedMultiSelectState, Product product, String str) {
        0qQ.A0B(taggingFeedMultiSelectState, 0);
        if (product != null && taggingFeedMultiSelectState.A04.containsKey(product.A0H)) {
            return true;
        }
        if (str == null || !taggingFeedMultiSelectState.A01.contains(str)) {
            return false;
        }
        return true;
    }
}
