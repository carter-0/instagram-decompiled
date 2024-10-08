package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.NOj  reason: case insensitive filesystem */
public final class C68587NOj extends C232222tE {
    public final UserSession A00;
    public final 0sL A01;
    public final 0sL A02;
    public final 0sK A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67967Mxr(DbU.A09(layoutInflater, viewGroup, R.layout.direct_giphy_sticker_tray_item, false), this.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r25, C249703kE r26) {
        ImageView.ScaleType scaleType;
        int A012;
        C68195N5k n5k = (C68195N5k) r25;
        C67967Mxr mxr = (C67967Mxr) r26;
        boolean A1U = AnonymousClass7TF.A1U(0, n5k, mxr);
        C68137N2b n2b = n5k.A02;
        C61064Jw2 jw2 = n5k.A01;
        0sL r6 = this.A02;
        0sL r5 = this.A01;
        0qQ.A0B(n2b, 0);
        DbZ.A0t(A1U ? 1 : 0, jw2, r6, r5);
        ? r4 = mxr.A01;
        Context context = r4.getContext();
        DirectAnimatedMedia directAnimatedMedia = n2b.A01;
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        0qQ.A0A(context);
        UserSession userSession = mxr.A00;
        String str = directAnimatedMedia.A05;
        C321076tX A013 = C321066tW.A01(context, 0.4f, C69826Nsn.A00(gifUrlImpl), context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large));
        int A032 = AnonymousClass7TF.A03(context, R.attr.stickerLoadingStartColor);
        int A033 = AnonymousClass7TF.A03(context, R.attr.stickerLoadingEndColor);
        Integer num = AnonymousClass05K.A01;
        r4.setImageDrawable(new C321016tR(context, userSession, A013, gifUrlImpl, num, str, (float) JTR.A08(context), A032, A033));
        boolean z = directAnimatedMedia.A06;
        if (z) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        r4.setScaleType(scaleType);
        RoundedCornerFrameLayout roundedCornerFrameLayout = mxr.A02;
        if (z) {
            A012 = 0;
        } else {
            A012 = DbY.A01(context);
        }
        roundedCornerFrameLayout.setCornerRadius(A012);
        r4.setVisibility(0);
        2eS.A04(r4, num);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(roundedCornerFrameLayout);
        A0m.A04 = new C61684KHs(A1U ? 1 : 0, r5, r6, n2b, jw2, mxr);
        A0m.A00();
        C61077JwF jwF = n5k.A00;
        if (jwF != null && !jwF.A02) {
            this.A03.invoke(jwF.A01, AnonymousClass7TE.A1I(str), C69480NmO.REGULAR);
            jwF.A02 = A1U;
        }
    }

    public final Class modelClass() {
        return C68195N5k.class;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        C67967Mxr mxr = (C67967Mxr) r3;
        0qQ.A0B(mxr, 0);
        ? r1 = mxr.A01;
        r1.setImageDrawable((Drawable) null);
        r1.setOnTouchListener((View.OnTouchListener) null);
        r1.setVisibility(4);
    }

    public C68587NOj(UserSession userSession, 0sL r2, 0sL r3, 0sK r4) {
        this.A00 = userSession;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
    }
}
