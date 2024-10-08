package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.O2o  reason: case insensitive filesystem */
public abstract class C70336O2o {
    public static final void A00(View view, AnonymousClass0iw r8, ImageUrl imageUrl, ImageUrl imageUrl2, String str, C62320sa r12, int i, boolean z, boolean z2) {
        AnonymousClass59G r0;
        String valueOf;
        AnonymousClass7TG.A1O(r8, str);
        View A0F = AnonymousClass7TF.A0F(view, R.id.product_picture);
        View A0F2 = AnonymousClass7TF.A0F(view, R.id.profile_picture);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.username);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.available_items);
        if (imageUrl2 == null) {
            r0 = new AnonymousClass59G(A0F, imageUrl, A0F2);
        }
        IgImageView igImageView = (IgImageView) r0.A00;
        ImageUrl imageUrl3 = (ImageUrl) r0.A01;
        ((View) r0.A02).setVisibility(8);
        igImageView.setVisibility(0);
        if (imageUrl3 != null) {
            igImageView.setUrl(imageUrl3, r8);
        }
        A0R.setText(str);
        if (z2) {
            if (z) {
                valueOf = view.getContext().getString(2131973745);
            } else {
                valueOf = String.valueOf(i);
            }
            0qQ.A0A(valueOf);
            A0R2.setText(DbV.A0v(DbU.A05(view), valueOf, R.plurals.shop_selector_product_count_label, i));
        } else {
            A0R2.setVisibility(8);
        }
        C71396Ojv.A00(view, 59, r12);
    }
}
