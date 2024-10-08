package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.NPq  reason: case insensitive filesystem */
public final class C68620NPq extends C232232tF {
    public final UserSession A00;
    public final C329207Hz A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r19, C249703kE r20) {
        int A012;
        C71957Oti oti = (C71957Oti) r19;
        C67939MxP mxP = (C67939MxP) r20;
        AnonymousClass7TG.A1N(oti, mxP);
        UserSession userSession = this.A00;
        C68137N2b n2b = oti.A00;
        C329207Hz r2 = this.A01;
        AnonymousClass7TF.A1C(userSession, 0, r2);
        IgImageView igImageView = mxP.A00;
        Context context = igImageView.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size);
        DirectAnimatedMedia directAnimatedMedia = n2b.A01;
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        0qQ.A0A(context);
        C321076tX A002 = C321066tW.A00(C69826Nsn.A00(gifUrlImpl), 0, dimensionPixelSize, -1);
        int A03 = AnonymousClass7TF.A03(context, R.attr.stickerLoadingStartColor);
        int A032 = AnonymousClass7TF.A03(context, R.attr.stickerLoadingEndColor);
        C321016tR r8 = new C321016tR(context, userSession, A002, gifUrlImpl, AnonymousClass05K.A01, directAnimatedMedia.A05, (float) JTR.A08(context), A03, A032);
        RoundedCornerFrameLayout roundedCornerFrameLayout = mxP.A01;
        if (directAnimatedMedia.A06) {
            A012 = 0;
        } else {
            A012 = DbY.A01(context);
        }
        roundedCornerFrameLayout.setCornerRadius(A012);
        igImageView.setImageDrawable(r8);
        C68642NQw.A00(AnonymousClass7TE.A0m(roundedCornerFrameLayout), n2b, r2, 1);
    }

    public final Class modelClass() {
        return C71957Oti.class;
    }

    public C68620NPq(UserSession userSession, C329207Hz r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C67939MxP(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_star_tab_item, false));
    }
}
