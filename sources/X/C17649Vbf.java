package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Vbf  reason: case insensitive filesystem */
public final class C17649Vbf {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgFrameLayout A04;
    public final RoundedCornerImageView A05;
    public final Runnable A06 = new C20085Wkj(this);

    public C17649Vbf(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.shopping_item_image);
        this.A05 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
        TextView A0G = DbU.A0G(view, R.id.shopping_item_name);
        this.A03 = A0G;
        C13988Tno.A16(A0G, true);
        this.A02 = DbU.A0G(view, R.id.shopping_item_details);
        this.A04 = (IgFrameLayout) view.requireViewById(R.id.shopping_item_add_button);
        this.A01 = DbU.A0F(view, R.id.shopping_item_delete_button);
    }
}
