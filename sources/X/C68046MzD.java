package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.MzD  reason: case insensitive filesystem */
public final class C68046MzD extends C249703kE {
    public C68177N3s A00;
    public C3R A01;
    public C72979PRm A02;
    public AnonymousClass3WR A03;
    public final View A04;
    public final 0xG A05 = DbS.A0O("story_template_discovery_surface");
    public final UserSession A06;
    public final IgTextView A07;
    public final CircularImageView A08;
    public final IgImageView A09;
    public final SimpleVideoLayout A0A;
    public final 0sP A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68046MzD(View view, UserSession userSession, 0sP r4) {
        super(view);
        0qQ.A0B(userSession, 3);
        this.A04 = view;
        this.A0B = r4;
        this.A06 = userSession;
        this.A09 = DbX.A0b(view, R.id.story_template_discovery_item_image);
        this.A08 = DbX.A0a(view, R.id.user_profile_picture);
        this.A07 = DbX.A0Z(view, R.id.user_profile_name);
        this.A0A = (SimpleVideoLayout) AnonymousClass7TF.A0F(view, R.id.story_template_discovery_item_video_player);
    }

    public final void A00() {
        this.A02 = new C72979PRm(AnonymousClass7TE.A0S(this.A04), this.A06, new O9F(this), this.A0A);
    }
}
