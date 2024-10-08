package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.PBh  reason: case insensitive filesystem */
public final class C72576PBh implements C328007Db, C328017Dc, C3263976p {
    public C240913Nc A00;
    public C328087Dj A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final C71662eb A04;
    public final C71662eb A05;
    public final C71662eb A06;
    public final C71662eb A07;
    public final IgProgressImageView A08;
    public final RoundedCornerMediaFrameLayout A09;
    public final ImageView A0A;

    public final ImageView Afl() {
        return this.A0A;
    }

    public final View BJd() {
        return this.A02;
    }

    public final C328087Dj BY0() {
        return this.A01;
    }

    public C72576PBh(View view) {
        this.A02 = (LinearLayout) view.requireViewById(R.id.live_viewer_invite_container);
        View findViewById = view.findViewById(R.id.placeholder_title_stub);
        findViewById.getClass();
        this.A07 = new C71662eb((ViewStub) findViewById);
        View findViewById2 = view.findViewById(R.id.placeholder_message_stub);
        findViewById2.getClass();
        this.A06 = new C71662eb((ViewStub) findViewById2);
        this.A09 = (RoundedCornerMediaFrameLayout) view.requireViewById(R.id.preview_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) view.requireViewById(R.id.preview_image);
        this.A08 = igProgressImageView;
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        igProgressImageView.setEnableProgressBar(false);
        this.A04 = DbY.A0T(view, R.id.active_live_header_stub);
        this.A05 = DbY.A0T(view, R.id.expired_live_header_stub);
        this.A0A = DbU.A0F(view, R.id.doubletap_heart);
        this.A03 = DbU.A0G(view, R.id.watch_live_video_button);
    }

    public final void EeT(C328087Dj r1) {
        this.A01 = r1;
    }
}
