package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.3N1  reason: invalid class name */
public final class AnonymousClass3N1 extends C249703kE implements AnonymousClass3N2 {
    public UserSession A00;
    public IgImageView A01;
    public final AnonymousClass3N5 A02;
    public final RecyclerReelAvatarView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3N1(View view) {
        super(view);
        0qQ.A0B(view, 1);
        RecyclerReelAvatarView requireViewById = view.requireViewById(R.id.avatar_view);
        0qQ.A07(requireViewById);
        this.A03 = requireViewById;
        this.A02 = new AnonymousClass3N5(view);
    }

    public final void CI9(float f) {
    }

    public final boolean EtJ() {
        return true;
    }

    public final View AeH() {
        View A002 = this.A02.A02.A00();
        0qQ.A07(A002);
        return A002;
    }

    public final View AeY() {
        UserSession userSession;
        RecyclerReelAvatarView recyclerReelAvatarView = this.A03;
        AnonymousClass3NU r0 = ((AnonymousClass3N9) recyclerReelAvatarView.getHolder().A03.getValue()).A09;
        if (r0 == null || !r0.A04 || (userSession = this.A00) == null || !182.A06(0Tu.A05, userSession, 36325699518280853L)) {
            return recyclerReelAvatarView.getHolder().A00();
        }
        return ((C240913Nc) ((C240933Nf) recyclerReelAvatarView.getHolder().A04.getValue()).A01.getValue()).A00();
    }

    public final View BkN() {
        View view = this.itemView;
        0qQ.A06(view);
        return view;
    }

    public final String Bkc() {
        return this.A02.A02.A01;
    }

    public final GradientSpinner Bkt() {
        return this.A03.getHolder().A02();
    }

    public final void Ei5(AnonymousClass6VJ r2) {
        this.A02.A01 = r2;
    }

    public final RectF AeG() {
        return 0nA.A0F(AeY());
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(AeY());
    }

    public final void CLE() {
        AeY().setVisibility(4);
    }

    public final void Eu3(AnonymousClass0iw r3) {
        AeY().setVisibility(0);
    }
}
