package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.user.model.Product;
import java.util.List;

public abstract class V97 {
    public static final Object A00(C307896Rx r13, AnonymousClass6Tm r14) {
        String str;
        Object A03 = r14.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A03;
        Object A032 = r14.A03(1);
        0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) A032;
        Object A033 = r14.A03(2);
        0qQ.A0C(A033, Pxd.A00(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION));
        List list = (List) A033;
        List list2 = r14.A00;
        C276544tV r5 = (C276544tV) list2.get(3);
        C276544tV r6 = (C276544tV) list2.get(4);
        FragmentActivity A04 = C308206Td.A04(r13);
        0qQ.A0C(A04, "null cannot be cast to non-null type com.instagram.tagging.activity.TaggingActivity");
        Intent intent = new Intent();
        0qQ.A0B(list, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        Product A01 = C18132Vm8.A01((C276544tV) list.get(0));
        W2E w2e = new W2E(A01);
        w2e.A0D = new TaggingFeedSessionInformation(str2, str3);
        intent.putExtra("selected_product", w2e.A03(A01.A0H));
        if (r6 != null) {
            str = r6.A0D();
        } else {
            str = null;
        }
        intent.putExtra("tagging_info_id", str);
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = null;
        if (r5 != null) {
            String A0D = r5.A0D();
            String A0F = r5.A0F();
            String A0H = r5.A0H();
            if (!(A0D == null || A0F == null)) {
                productCollectionFeedTaggingMeta = new ProductCollectionFeedTaggingMeta(V81.A00(A0F), A0D, A0H, (String) null, (String) null, false);
            }
        }
        intent.putExtra(AnonymousClass000.A00(1873), productCollectionFeedTaggingMeta);
        A04.onActivityResult(18, -1, intent);
        return null;
    }
}
