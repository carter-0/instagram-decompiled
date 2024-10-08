package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class UED extends C249703kE {
    public final Context A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final MediaFrameLayout A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UED(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A05 = JTR.A0i(view, R.id.image);
        TextView A0B = DbW.A0B(view, R.id.title);
        this.A04 = A0B;
        TextView A0B2 = DbW.A0B(view, R.id.subtitle);
        this.A03 = A0B2;
        TextView A0B3 = DbW.A0B(view, R.id.merchant_name);
        this.A02 = A0B3;
        this.A06 = JTR.A0i(view, R.id.primary_avatar);
        this.A07 = JTR.A0i(view, R.id.secondary_avatar);
        this.A01 = (ImageView) AnonymousClass7TE.A0b(view, R.id.share_button);
        this.A08 = (MediaFrameLayout) AnonymousClass7TE.A0b(view, R.id.video_container);
        Resources resources = view.getResources();
        0mq.A03(A0B, resources.getDimensionPixelSize(R.dimen.product_collection_header_content_tile_title_line_height));
        0mq.A03(A0B2, resources.getDimensionPixelSize(R.dimen.auth_edit_field_text_size));
        C13988Tno.A16(A0B3, true);
        0mq.A03(A0B3, resources.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
    }
}
