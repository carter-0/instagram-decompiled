package X;

import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VHg  reason: case insensitive filesystem */
public abstract class C17084VHg {
    public static final ULE A00(ULE ule) {
        List list = ule.A04;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            DbV.A1U(next, arrayList, 0qQ.A0K(((C68169N3k) next).A03, "spinner/default") ? 1 : 0);
        }
        ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = ule.A01;
        return ULE.A00(ule.A00, shoppingTaggingFeedHeader, ule.A02, arrayList, ule.A03, ule.A05);
    }
}
