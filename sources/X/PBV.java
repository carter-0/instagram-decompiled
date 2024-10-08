package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

public final class PBV implements C328007Db, C328017Dc {
    public C328087Dj A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final ConstraintLayout A05;
    public final CircularImageView A06;
    public final C252063oV A07;
    public final IgProgressImageView A08;
    public final C2806852z A09;
    public final RoundedCornerMediaFrameLayout A0A;
    public final AnonymousClass0eM A0B;

    public PBV(View view) {
        0qQ.A0B(view, 1);
        this.A05 = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.share_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.preview_image);
        this.A08 = igProgressImageView;
        this.A01 = DbX.A0J(view, R.id.top_icon);
        this.A03 = C66582MXn.A0F(view);
        this.A06 = DbX.A0a(view, R.id.avatar);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.username);
        this.A09 = new C2806852z(JTR.A0X(view, R.id.music_attribution_view_stub));
        this.A0A = (RoundedCornerMediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.media_container);
        this.A07 = 2b1.A01(view.findViewById(R.id.reaction_stub), false, false);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.portrait_video_share_cta_button);
        this.A0B = C73916Plr.A00(view, this, 46);
        igProgressImageView.setEnableProgressBar(false);
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public final View BJd() {
        return this.A05;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
