package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class AE2 {
    public C365798nh A00;
    public final UserSession A01;

    public static final Integer A00(C365798nh r4) {
        0v6 r0;
        List list;
        Integer num;
        if (r4 != null) {
            if (r4.A05.ordinal() != 0) {
                C349307zv r02 = r4.A03;
                r02.getClass();
                r0 = r02.A0U;
            } else {
                C352218Cl r03 = r4.A02;
                r03.getClass();
                r0 = r03.A0I;
            }
            if (r0 == null || (list = r0.A02) == null || (num = (Integer) 00k.A0J(list)) == null || 0nH.A01(num.intValue()) > 0.9f) {
                return null;
            }
            return num;
        }
        return null;
    }

    public final ArrayList A01(Context context) {
        ArrayList A0q = AnonymousClass7TF.A0q(context, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.product_sticker_text_size);
        int A012 = AnonymousClass8XF.A01(context);
        A0q.add(new C389739q7(context, A012, dimensionPixelSize, "product_item_text_sticker_vibrant"));
        A0q.add(new C389739q7(context, A012, dimensionPixelSize, "product_item_text_sticker_subtle"));
        A0q.add(new C389739q7(context, A012, dimensionPixelSize, "product_item_text_sticker_black_white"));
        Integer A002 = A00(this.A00);
        if (A002 != null) {
            int intValue = A002.intValue();
            C389739q7 r1 = new C389739q7(context, A012, dimensionPixelSize, "product_item_text_sticker_media_primary_color");
            C380069Wl r0 = r1.A04;
            r0.A02 = intValue;
            r0.invalidateSelf();
            A0q.add(r1);
            if (182.A06(0Tu.A05, this.A01, 36319866952621755L)) {
                A0q.add(new C69057Ndu(context, "product_item_list_cell_sticker_black_white"));
                A0q.add(new C69057Ndu(context, "product_item_list_cell_sticker_subtle"));
                A0q.add(new C389729q6(context));
            }
        }
        return A0q;
    }

    public final ArrayList A02(Context context, ProductCollection productCollection) {
        ArrayList A0q = AnonymousClass7TF.A0q(context, 0);
        A0q.add(new C389719q5(context, productCollection, "seller_collection_text_sticker_vibrant"));
        A0q.add(new C389719q5(context, productCollection, "seller_collection_text_sticker_subtle"));
        A0q.add(new C389719q5(context, productCollection, "seller_collection_text_sticker_black_white"));
        Integer A002 = A00(this.A00);
        if (A002 != null) {
            int intValue = A002.intValue();
            C389719q5 r1 = new C389719q5(context, productCollection, "seller_collection_text_sticker_media_primary_color");
            C380069Wl r0 = r1.A00;
            r0.A02 = intValue;
            r0.invalidateSelf();
            A0q.add(r1);
        }
        return A0q;
    }

    public final ArrayList A03(Context context, User user) {
        ArrayList A0q = AnonymousClass7TF.A0q(context, 0);
        A0q.add(new C389749q8(context, user, "storefront_text_sticker_vibrant"));
        A0q.add(new C389749q8(context, user, "storefront_text_sticker_subtle"));
        A0q.add(new C389749q8(context, user, "storefront_text_sticker_black_white"));
        Integer A002 = A00(this.A00);
        if (A002 != null) {
            int intValue = A002.intValue();
            C389749q8 r1 = new C389749q8(context, user, "storefront_text_sticker_media_primary_color");
            C380069Wl r0 = r1.A01;
            r0.A02 = intValue;
            r0.invalidateSelf();
            A0q.add(r1);
        }
        return A0q;
    }

    public final ArrayList A04(Context context, List list) {
        Context context2 = context;
        ArrayList A0q = AnonymousClass7TF.A0q(context, 0);
        List list2 = list;
        A0q.add(new C389709q4(context2, "multi_product_item_text_sticker_vibrant", list2, 0nA.A09(context), false));
        A0q.add(new C389709q4(context2, "multi_product_item_text_sticker_subtle", list2, 0nA.A09(context), false));
        A0q.add(new C389709q4(context2, "multi_product_item_text_sticker_black_white", list2, 0nA.A09(context), false));
        Integer A002 = A00(this.A00);
        if (A002 != null) {
            int intValue = A002.intValue();
            C389709q4 r8 = new C389709q4(context, "multi_product_item_text_sticker_media_primary_color", list2, 0nA.A09(context), false);
            C380069Wl r1 = r8.A00;
            r1.A02 = intValue;
            r1.invalidateSelf();
            A0q.add(r8);
        }
        return A0q;
    }

    public AE2(UserSession userSession, C365798nh r2) {
        this.A01 = userSession;
        this.A00 = r2;
    }
}
