package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class OIL {
    public C66819MdB A00;
    public String A01;
    public final Context A02;
    public final View A03;
    public final 1a8 A04 = C66580MXl.A0O();
    public final C252063oV A05;
    public final C252063oV A06;
    public final C252063oV A07;
    public final C252063oV A08;
    public final C252063oV A09;
    public final C69226Nhg A0A;
    public final C68957Nbg A0B;
    public final AnonymousClass7EA A0C;
    public final IgdsMediaButton A0D;
    public final RoundedCornerFrameLayout A0E;
    public final SpinnerImageView A0F;
    public final AnonymousClass0eM A0G = AnonymousClass1YB.A00(new C67570Mq4(this, 9));

    public OIL(View view, C332937Xa r8, AnonymousClass0eK r9) {
        0qQ.A0B(view, 1);
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A02 = A0S;
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.media_viewer_container);
        this.A03 = A0G2;
        this.A0E = (RoundedCornerFrameLayout) AnonymousClass7TF.A0F(A0G2, R.id.media_container);
        SpinnerImageView spinnerImageView = (SpinnerImageView) AnonymousClass7TF.A0G(A0G2, R.id.loading_progress_bar);
        this.A0F = spinnerImageView;
        this.A06 = C66581MXm.A0T(A0G2, R.id.media_image_stub);
        this.A05 = C66581MXm.A0T(A0G2, R.id.hd_icon_stub);
        C252063oV A0T = C66581MXm.A0T(A0G2, R.id.media_video_stub);
        this.A07 = A0T;
        this.A09 = C66581MXm.A0T(view, R.id.zero_rating_data_banner);
        this.A0D = (IgdsMediaButton) AnonymousClass7TF.A0F(A0G2, R.id.edit_with_ai_button);
        this.A0A = new C69226Nhg(A0S, A0G2, A0T, spinnerImageView, r9);
        this.A0C = new AnonymousClass7EA(DbY.A0T(A0G2, R.id.direct_reactions_pill_stub), r8);
        this.A0B = new C68957Nbg(DbY.A0T(A0G2, R.id.card_reactions_pill_stub), (AnonymousClass7H7) r8);
        this.A08 = DbU.A0Z(A0G2, R.id.privacy_overlay_stub);
    }
}
