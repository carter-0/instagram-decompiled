package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Tv1  reason: case insensitive filesystem */
public final class C14372Tv1 extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C231672s5 A02 = new Object();
    public final WW4 A03;
    public final XBt A04;
    public final X41 A05;
    public final X9Q A06;
    public final boolean A07;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2s5, java.lang.Object] */
    public C14372Tv1(AnonymousClass0iw r2, UserSession userSession, WW4 ww4, XBt xBt, X41 x41, X9Q x9q, boolean z) {
        DbW.A1N(x9q, 3, userSession);
        this.A00 = r2;
        this.A03 = ww4;
        this.A06 = x9q;
        this.A05 = x41;
        this.A01 = userSession;
        this.A04 = xBt;
        this.A07 = z;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C14905UEk(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_grid_item_igtv, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r26, C249703kE r27) {
        HAR har = (HAR) r26;
        C14905UEk uEk = (C14905UEk) r27;
        boolean A1Z = AnonymousClass7TG.A1Z(har, uEk);
        1Xj r12 = har.A01.A00;
        C296905qq r7 = har.A02;
        C296995qz B9n = this.A04.B9n(har);
        UserSession userSession = this.A01;
        boolean A052 = 1sd.A00(userSession).A05(r12);
        X41 x41 = this.A05;
        FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = uEk.A02;
        x41.ECL(fixedAspectRatioVideoLayout, B9n, r7, har, A1Z);
        AnonymousClass0iw r9 = this.A00;
        fixedAspectRatioVideoLayout.setVideoSource(r12, r9);
        float f = r7.A00;
        fixedAspectRatioVideoLayout.setAspectRatio(f);
        fixedAspectRatioVideoLayout.setEnableTouchOverlay(A1Z);
        int i = B9n.A01;
        C246673ez.A04(fixedAspectRatioVideoLayout, userSession, r12, i);
        IgImageButton igImageButton = uEk.A03;
        igImageButton.A0E = new WTO(B9n, this, har);
        C231672s5 r10 = this.A02;
        X9Q x9q = this.A06;
        boolean CcR = x9q.CcR(r12);
        C70281O0l.A00(r9, r10, (WW4) null, r12, igImageButton, f, i, B9n.A00, CcR, A052, this.A07);
        IgSimpleImageView igSimpleImageView = uEk.A00;
        igSimpleImageView.setImageResource(R.drawable.instagram_play_pano_filled_24);
        DbU.A14(igSimpleImageView.getContext(), igSimpleImageView, R.color.design_dark_default_color_on_background);
        uEk.A01.setText(2131976604);
        if (A052) {
            fixedAspectRatioVideoLayout.setOnClickListener((View.OnClickListener) null);
            fixedAspectRatioVideoLayout.setOnTouchListener((View.OnTouchListener) null);
            return;
        }
        WB4 wb4 = new WB4(30, B9n, har, this);
        C18900WBt wBt = new C18900WBt(3, this, har, B9n);
        AnonymousClass0fU.A00(wb4, fixedAspectRatioVideoLayout);
        fixedAspectRatioVideoLayout.setOnTouchListener(wBt);
        x9q.E6t(uEk, r12);
    }

    public final Class modelClass() {
        return HAR.class;
    }
}
