package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JpQ  reason: case insensitive filesystem */
public final class C60679JpQ extends C249703kE {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Activity A05;
    public final ViewGroup A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final IgImageView A0A;
    public final C71662eb A0B;
    public final C64970Ll9 A0C;

    public C60679JpQ(Activity activity, View view, C64970Ll9 ll9) {
        super(view);
        this.A05 = activity;
        Resources resources = activity.getResources();
        this.A06 = DbU.A0C(view, R.id.row_search_user_container);
        this.A09 = DbU.A0G(view, R.id.row_search_user_username);
        this.A08 = DbU.A0G(view, R.id.row_search_user_fullname);
        this.A07 = DbU.A0G(view, R.id.row_search_user_secondary_subtitle);
        this.A0A = DbT.A0b(view, R.id.row_search_user_imageview);
        this.A0B = DbY.A0T(view, R.id.overflow_button_stub);
        this.A04 = AnonymousClass7TE.A09(activity);
        this.A02 = AnonymousClass7TF.A03(activity, R.attr.avatarInnerStroke);
        this.A00 = activity.getColor(2Yu.A04(activity));
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A03 = resources.getDimensionPixelSize(R.dimen.circular_avatar_stroke_width);
        this.A0C = ll9;
    }
}
