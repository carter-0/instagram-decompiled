package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.user.model.Product;
import java.util.Collections;

/* renamed from: X.Lxp  reason: case insensitive filesystem */
public final class C65674Lxp implements X6x {
    public final /* synthetic */ TaggingActivity A00;
    public final /* synthetic */ TagsInteractiveLayout A01;
    public final /* synthetic */ Product A02;

    public final void DoS(ProductGroup productGroup) {
        ProductGroup productGroup2 = productGroup;
        if (productGroup == null || Collections.unmodifiableList(productGroup.A02).isEmpty()) {
            TaggingActivity taggingActivity = this.A00;
            Product product = this.A02;
            TagsInteractiveLayout.A01(this.A01, product, false);
            TaggingActivity.A0M(taggingActivity, product);
            return;
        }
        C249713kF r3 = C249713kF.A00;
        FragmentActivity fragmentActivity = this.A00;
        r3.A0e(fragmentActivity, fragmentActivity.getSupportFragmentManager(), AnonymousClass7TE.A0l(fragmentActivity.A0o), productGroup2, new C65682Lxx(fragmentActivity, this.A01), AnonymousClass7TF.A0e(fragmentActivity.getResources(), ((ProductVariantDimension) Collections.unmodifiableList(productGroup.A02).get(0)).A03, 2131955112), false);
    }

    public C65674Lxp(TaggingActivity taggingActivity, TagsInteractiveLayout tagsInteractiveLayout, Product product) {
        this.A00 = taggingActivity;
        this.A02 = product;
        this.A01 = tagsInteractiveLayout;
    }

    public final void DED() {
        this.A01.AVW();
    }
}
