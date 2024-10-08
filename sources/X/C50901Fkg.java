package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Fkg  reason: case insensitive filesystem */
public final class C50901Fkg implements XC0 {
    public View A00;
    public FrameLayout A01 = ((FrameLayout) AnonymousClass7TF.A0F(this.A00, R.id.reel_preview_frame_layout));
    public FrameLayout A02 = ((FrameLayout) this.A00.findViewById(R.id.reel_preview_container));
    public TextView A03 = AnonymousClass7TG.A0R(this.A00, R.id.reel_preview_subtitle);
    public TextView A04 = AnonymousClass7TG.A0R(this.A00, R.id.reel_preview_username);
    public CircularImageView A05 = DbX.A0a(this.A00, R.id.reel_preview_profile_picture);
    public IgProgressImageView A06;

    public C50901Fkg(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A06 = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.preview_image);
    }

    public final /* synthetic */ void Eui(boolean z) {
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A06);
    }

    public final RectF Beu() {
        return 0nA.A0F(this.A06);
    }

    public final void CLk() {
        this.A06.setVisibility(8);
    }

    public final void Ev3() {
        this.A06.setVisibility(0);
    }
}
