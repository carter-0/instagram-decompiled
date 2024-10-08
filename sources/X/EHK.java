package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class EHK extends C232232tF {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public EHK(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = r2;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        boolean A04 = DcE.A04(this.A01);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        int i2 = R.layout.avatar_background_customization_grid_item;
        if (A04) {
            i2 = R.layout.avatar_background_customization_v2_grid_item;
        }
        return new C46931Dnl(DbT.A0D(layoutInflater, viewGroup, i2, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C47247DtY dtY = (C47247DtY) r5;
        C46931Dnl dnl = (C46931Dnl) r6;
        AnonymousClass7TG.A1N(dtY, dnl);
        IgImageView igImageView = dnl.A01;
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = dtY.A00;
        igImageView.setUrl(DbS.A0V(avatarCoinFlipBackgroundOptionResponse.A01), this.A00);
        igImageView.setContentDescription(avatarCoinFlipBackgroundOptionResponse.A00);
        dnl.A00.setSelected(dtY.A02);
        AnonymousClass3NG r2 = new AnonymousClass3NG(igImageView);
        r2.A04 = new C47794EHf(dtY, 0);
        r2.A00();
    }

    public final Class modelClass() {
        return C47247DtY.class;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final /* bridge */ /* synthetic */ void unbind(C249703kE r4) {
        C46931Dnl dnl = (C46931Dnl) r4;
        0qQ.A0B(dnl, 0);
        dnl.A01.setImageDrawable((Drawable) null);
        dnl.A00.setSelected(false);
    }
}
