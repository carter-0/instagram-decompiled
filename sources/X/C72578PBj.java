package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.PBj  reason: case insensitive filesystem */
public final class C72578PBj implements C328007Db, C328017Dc, C3263976p {
    public AnonymousClass77G A00;
    public C328087Dj A01;
    public final Drawable A02 = C328037De.A00();
    public final View A03;
    public final View A04;
    public final FrameLayout A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final CircularImageView A0C;
    public final C71662eb A0D;
    public final C71662eb A0E;
    public final C71662eb A0F;
    public final C71662eb A0G;
    public final AnonymousClass3V4 A0H;
    public final IgProgressImageView A0I;
    public final MediaActionsView A0J;
    public final RoundedCornerMediaFrameLayout A0K;

    public final ImageView Afl() {
        return this.A06;
    }

    public final View BJd() {
        return this.A05;
    }

    public final C328087Dj BY0() {
        return this.A01;
    }

    public C72578PBj(View view) {
        this.A05 = (FrameLayout) view.requireViewById(R.id.message_content_media_share_bubble_container);
        this.A04 = view.requireViewById(R.id.header);
        this.A03 = view.requireViewById(R.id.avatar_container);
        this.A0C = DbU.A0X(view, R.id.avatar);
        this.A0D = DbY.A0T(view, R.id.avatar_badge);
        this.A0F = DbY.A0T(view, R.id.facepile_stub);
        this.A0B = DbU.A0G(view, R.id.username);
        this.A0A = DbU.A0G(view, R.id.subtitle);
        this.A0K = (RoundedCornerMediaFrameLayout) view.requireViewById(R.id.media_container);
        this.A0I = (IgProgressImageView) view.requireViewById(R.id.image);
        this.A0H = new AnonymousClass3V4(DbS.A0F(view, R.id.zero_rating_video_play_button_stub));
        this.A09 = DbU.A0G(view, R.id.caption_title);
        this.A07 = DbU.A0G(view, R.id.caption_body);
        this.A08 = DbU.A0G(view, R.id.caption_subtitle);
        this.A0J = (MediaActionsView) view.requireViewById(R.id.video_indicator);
        this.A0E = DbY.A0T(view, R.id.content_attribution_stub);
        this.A0G = DbY.A0S(view, R.id.gradient_spinner_stub);
        this.A06 = DbU.A0F(view, R.id.doubletap_heart);
    }

    public final void EeT(C328087Dj r1) {
        this.A01 = r1;
    }
}
