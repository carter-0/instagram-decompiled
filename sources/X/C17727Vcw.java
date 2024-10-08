package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Vcw  reason: case insensitive filesystem */
public final class C17727Vcw {
    public C71662eb A00;
    public final Context A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final IgImageView A0D;
    public final View A0E;

    public C17727Vcw(View view) {
        this.A0E = view;
        this.A01 = view.getContext();
        View A0H = JTP.A0H(DbU.A0D(view, R.id.fundraiser_sticker_header_avatar_container_top_left_stub), R.layout.profile_header_user_avatar);
        IgImageView A0b = DbT.A0b(A0H, R.id.row_profile_header_imageview);
        this.A0D = A0b;
        A0b.setVisibility(0);
        DbX.A1B(A0H, R.id.reel_ring);
        this.A0A = DbU.A0G(view, R.id.fundraiser_sticker_header_full_name);
        this.A05 = DbU.A0G(view, R.id.fundraiser_sticker_header_business_category);
        C71662eb A0T = DbY.A0T(view, R.id.fundraiser_sticker_header_metrics);
        this.A00 = A0T;
        View requireViewById = A0T.A01().requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_post_count_container);
        this.A04 = requireViewById;
        View requireViewById2 = this.A00.A01().requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_followers_container);
        this.A02 = requireViewById2;
        View requireViewById3 = this.A00.A01().requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_following_container);
        this.A03 = requireViewById3;
        this.A0C = DbU.A0G(requireViewById, R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_count);
        this.A0B = DbU.A0G(requireViewById, R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_label);
        this.A07 = DbU.A0G(requireViewById2, R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_count);
        this.A06 = DbU.A0G(requireViewById2, R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_label);
        this.A09 = DbU.A0G(requireViewById3, R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_count);
        this.A08 = DbU.A0G(requireViewById3, R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_label);
    }
}
