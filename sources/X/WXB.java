package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class WXB implements AnonymousClass3V3 {
    public AnonymousClass3W1 A00;
    public final View A01;
    public final AnonymousClass3TS A02;
    public final AnonymousClass3V4 A03;
    public final IgProgressImageView A04;
    public final MediaActionsView A05;
    public final MediaFrameLayout A06;

    public final C256043v8 B5X() {
        return null;
    }

    public final C247233fz BQv() {
        return null;
    }

    public final C258253yi BRL() {
        return null;
    }

    public final AnonymousClass3TS Adf() {
        return this.A02;
    }

    public final AnonymousClass3TN B5Y() {
        return this.A05;
    }

    public final View BG1() {
        return this.A04;
    }

    public final View BQB() {
        return this.A06;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A00;
    }

    public final C242423Ua C5r() {
        return this.A06;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        return this.A05.getWidth();
    }

    public final void EEI(int i) {
        this.A04.A06(i);
    }

    public WXB(View view) {
        this.A04 = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.fixed_media_header_image);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.fixed_media_header_overlay);
        this.A06 = (MediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.fixed_media_header_container);
        this.A03 = new AnonymousClass3V4(DbU.A0D(view, R.id.fixed_media_header_play_button_stub));
        this.A05 = (MediaActionsView) AnonymousClass7TF.A0F(view, R.id.fixed_media_header_media_actions);
        this.A02 = new AnonymousClass3TS(DbU.A0D(view, R.id.fixed_media_header_audio_icon_stub));
    }

    public final void Epi(AnonymousClass0iw r2, ImageUrl imageUrl, boolean z) {
        AnonymousClass7TG.A1N(imageUrl, r2);
        this.A04.A09(r2, imageUrl, z);
    }
}
