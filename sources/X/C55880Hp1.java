package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.Hp1  reason: case insensitive filesystem */
public final class C55880Hp1 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final CircularImageView A06;
    public final RoundedCornerImageView A07;
    public final IgdsRadioButton A08;
    public final C57456Ib0 A09;
    public final View A0A;

    public C55880Hp1(View view, View view2) {
        this.A0A = view;
        this.A00 = view2;
        this.A06 = DbX.A0a(view2, R.id.row_threads_in_stories_photo_profile_imageview);
        this.A05 = AnonymousClass7TG.A0R(view2, R.id.row_threads_in_stories_photo_profile_name);
        this.A03 = AnonymousClass7TG.A0R(view2, R.id.row_threads_in_stories_reposter_profile_name);
        this.A04 = AnonymousClass7TG.A0R(view2, R.id.row_threads_in_stories_timestamp);
        this.A01 = AnonymousClass7TG.A0R(view2, R.id.row_threads_in_stories_content_text);
        this.A02 = AnonymousClass7TG.A0R(view2, R.id.row_threads_in_stories_replies_and_likes);
        this.A07 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view2, R.id.row_threads_in_stories_media_image);
        this.A09 = new C57456Ib0(AnonymousClass7TF.A0G(view, R.id.row_threads_in_stories_video_view));
        this.A08 = (IgdsRadioButton) AnonymousClass7TF.A0F(view2, R.id.row_threads_in_stories_report_radio_button);
    }
}
