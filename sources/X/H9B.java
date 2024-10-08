package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;

public final class H9B extends I22 {
    public ViewGroup A00;
    public final View A01;
    public final ViewGroup A02;
    public final IgImageView A03;
    public final ConstrainedTextureView A04;
    public final RoundedCornerLinearLayout A05;

    public H9B(View view, UserSession userSession) {
        super(userSession);
        ViewGroup A0I = DbX.A0I(view, R.id.auto_play_clips_preview);
        this.A02 = A0I;
        this.A00 = DbX.A0I(A0I, R.id.video_view_container);
        this.A04 = (ConstrainedTextureView) AnonymousClass7TF.A0F(A0I, R.id.video_texture_view);
        this.A03 = DbX.A0b(A0I, R.id.video_view_static_fallback);
        this.A05 = (RoundedCornerLinearLayout) AnonymousClass7TF.A0F(A0I, R.id.clip_thumbnail_layout);
        this.A01 = AnonymousClass7TF.A0G(A0I, R.id.preview_button_pill);
        A0I.setVisibility(0);
    }
}
