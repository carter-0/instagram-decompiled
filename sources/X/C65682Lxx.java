package X;

import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.user.model.Product;

/* renamed from: X.Lxx  reason: case insensitive filesystem */
public final class C65682Lxx implements C66465MSt {
    public final /* synthetic */ TaggingActivity A00;
    public final /* synthetic */ TagsInteractiveLayout A01;

    public final void Dx3(Product product) {
        0qQ.A0B(product, 0);
        TaggingActivity taggingActivity = this.A00;
        TagsInteractiveLayout.A01(this.A01, product, false);
        TaggingActivity.A0M(taggingActivity, product);
    }

    public C65682Lxx(TaggingActivity taggingActivity, TagsInteractiveLayout tagsInteractiveLayout) {
        this.A00 = taggingActivity;
        this.A01 = tagsInteractiveLayout;
    }
}
