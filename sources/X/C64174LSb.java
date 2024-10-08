package X;

import com.instagram.model.shopping.CompoundProductId;
import com.instagram.model.shopping.ProductTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LSb  reason: case insensitive filesystem */
public abstract class C64174LSb {
    public static ShoppingTaggingFeedArguments A00(ClipInfo clipInfo, C16581Uxb uxb, ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, ShoppingTaggingFeedHeader shoppingTaggingFeedHeader, TaggingFeedMultiSelectState taggingFeedMultiSelectState, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z) {
        String str9 = str7;
        if (str7 == null) {
            str9 = AnonymousClass7TG.A0j();
        }
        return new ShoppingTaggingFeedArguments(clipInfo, uxb, shoppingTaggingFeedClientState, shoppingTaggingFeedHeader, taggingFeedMultiSelectState, num, l, str3, str8, str9, str6, str5, str4, str, str2, list, z, false, false);
    }

    public static void A04(ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, List list, List list2) {
        ArrayList arrayList;
        String str;
        String str2;
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductTag productTag = (ProductTag) it.next();
            String str3 = JTO.A0q(productTag).A0H;
            User user = JTO.A0q(productTag).A0B;
            if (user == null || (str2 = AnonymousClass3ZA.A00(user)) == null) {
                str2 = "";
            }
            A0p.add(new CompoundProductId(str3, str2));
        }
        if (list2 != null) {
            arrayList = AnonymousClass7TF.A0p(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ProductTag productTag2 = (ProductTag) it2.next();
                String str4 = JTO.A0q(productTag2).A0H;
                User user2 = JTO.A0q(productTag2).A0B;
                if (user2 == null || (str = AnonymousClass3ZA.A00(user2)) == null) {
                    str = "";
                }
                arrayList.add(new CompoundProductId(str4, str));
            }
        } else {
            arrayList = 0sn.A00;
        }
        List<CompoundProductId> A0b = JTU.A0b(A0p, arrayList);
        shoppingTaggingFeedClientState.A05 = A0b;
        List list3 = shoppingTaggingFeedClientState.A04;
        ArrayList A0p2 = AnonymousClass7TF.A0p(A0b);
        for (CompoundProductId compoundProductId : A0b) {
            A0p2.add(compoundProductId.A00);
        }
        shoppingTaggingFeedClientState.A04 = JTU.A0b(list3, A0p2);
        List list4 = shoppingTaggingFeedClientState.A06;
        List<CompoundProductId> list5 = shoppingTaggingFeedClientState.A05;
        ArrayList A0p3 = AnonymousClass7TF.A0p(list5);
        for (CompoundProductId compoundProductId2 : list5) {
            A0p3.add(compoundProductId2.A00);
        }
        ArrayList A0S = 00k.A0S(00k.A0W(A0p3), list4);
        0qQ.A0B(A0S, 0);
        shoppingTaggingFeedClientState.A06 = A0S;
    }

    public static ShoppingTaggingFeedArguments A01(ClipInfo clipInfo, C16581Uxb uxb, ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, TaggingFeedMultiSelectState taggingFeedMultiSelectState, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z) {
        return new ShoppingTaggingFeedArguments(clipInfo, uxb, shoppingTaggingFeedClientState, (ShoppingTaggingFeedHeader) null, taggingFeedMultiSelectState, num, l, str3, str7, AnonymousClass7TG.A0j(), str6, str5, str4, str, str2, list, true, false, z);
    }

    public static String A02(ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, TaggingFeedMultiSelectState taggingFeedMultiSelectState) {
        A03(shoppingTaggingFeedClientState, C64032LJw.A00(taggingFeedMultiSelectState));
        ProductCollection productCollection = (ProductCollection) 00k.A0A(taggingFeedMultiSelectState.A02.values());
        if (productCollection != null) {
            return productCollection.Aoi();
        }
        return null;
    }

    public static void A03(ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, List list) {
        String str;
        String str2;
        String A00;
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it = list.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Product product = (Product) it.next();
            String str3 = product.A0H;
            User user = product.A0B;
            if (!(user == null || (A00 = AnonymousClass3ZA.A00(user)) == null)) {
                str = A00;
            }
            A0p.add(new CompoundProductId(str3, str));
        }
        List A0W = 00k.A0W(A0p);
        0qQ.A0B(A0W, 0);
        shoppingTaggingFeedClientState.A05 = A0W;
        ArrayList A0p2 = AnonymousClass7TF.A0p(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            User user2 = ((Product) it2.next()).A0B;
            if (user2 == null || (str2 = AnonymousClass3ZA.A00(user2)) == null) {
                str2 = str;
            }
            A0p2.add(str2);
        }
        List A0W2 = 00k.A0W(A0p2);
        0qQ.A0B(A0W2, 0);
        shoppingTaggingFeedClientState.A04 = A0W2;
    }
}
