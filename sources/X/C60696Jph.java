package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jph  reason: case insensitive filesystem */
public final class C60696Jph extends C249703kE implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "ImmersiveCatchUpFilteredItemViewHolder";
    public final Context A00;
    public final TextView A01;
    public final CircularImageView A02;
    public final IgImageView A03;
    public final IgImageView A04;

    public final String getModuleName() {
        return "ImmersiveCatchUpExploreItemViewHolder";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60696Jph(View view, Context context) {
        super(view);
        AnonymousClass7TG.A1O(view, context);
        this.A00 = context;
        this.A04 = JTO.A0Y(view, R.id.explore_image_view_item);
        this.A02 = (CircularImageView) view.findViewById(R.id.profile_picture);
        this.A01 = AnonymousClass7TE.A0d(view, R.id.profile_attribution);
        this.A03 = JTO.A0Y(view, R.id.explore_content_type_icon);
    }
}
