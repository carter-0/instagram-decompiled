package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.feed.widget.IgProgressImageView;

public final class PBT implements C328007Db, C328017Dc {
    public C328087Dj A00;
    public final TextView A01;
    public final TextView A02;
    public final ConstraintLayout A03;
    public final RoundedCornerImageView A04;
    public final IgProgressImageView A05;

    public final View BJd() {
        return this.A03;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public PBT(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.message_content_ar_effect_bubble_container);
        this.A03 = constraintLayout;
        IgProgressImageView igProgressImageView = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.message_content_ar_effect_video_thumbnail);
        this.A05 = igProgressImageView;
        this.A04 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.message_content_ar_effect_icon);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.message_content_ar_effect_title);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.message_content_ar_effect_creator);
        0nA.A0f(igProgressImageView, (int) (((float) 0nA.A09(AnonymousClass7TE.A0S(constraintLayout))) / 2.5f));
        igProgressImageView.setEnableProgressBar(false);
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
