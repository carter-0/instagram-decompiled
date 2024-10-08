package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Tv0  reason: case insensitive filesystem */
public final class C14371Tv0 extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C231672s5 A02 = new Object();
    public final WW4 A03;
    public final XBt A04;
    public final X41 A05;
    public final X9Q A06;
    public final boolean A07;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2s5, java.lang.Object] */
    public C14371Tv0(AnonymousClass0iw r2, UserSession userSession, WW4 ww4, XBt xBt, X41 x41, X9Q x9q, boolean z) {
        DbW.A1N(x9q, 3, userSession);
        this.A00 = r2;
        this.A03 = ww4;
        this.A06 = x9q;
        this.A05 = x41;
        this.A01 = userSession;
        this.A04 = xBt;
        this.A07 = z;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r26, C249703kE r27) {
        HAS has = (HAS) r26;
        C14904UEj uEj = (C14904UEj) r27;
        boolean A1Z = AnonymousClass7TG.A1Z(has, uEj);
        1Xj r12 = has.A01;
        C296905qq r8 = has.A02;
        C296995qz B9n = this.A04.B9n(has);
        UserSession userSession = this.A01;
        boolean A052 = 1sd.A00(userSession).A05(r12);
        X41 x41 = this.A05;
        FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = uEj.A00;
        HAS has2 = has;
        C296995qz r21 = B9n;
        x41.ECL(fixedAspectRatioVideoLayout, r21, r8, has2, A1Z);
        AnonymousClass0iw r9 = this.A00;
        fixedAspectRatioVideoLayout.setVideoSource(r12, r9);
        float f = r8.A00;
        fixedAspectRatioVideoLayout.setAspectRatio(f);
        fixedAspectRatioVideoLayout.setEnableTouchOverlay(A1Z);
        int i = B9n.A01;
        C246673ez.A04(fixedAspectRatioVideoLayout, userSession, r12, i);
        IgImageButton igImageButton = uEj.A01;
        igImageButton.A0E = new C14340TuN(A1Z ? 1 : 0, r21, this, has2, r12);
        C231672s5 r10 = this.A02;
        X9Q x9q = this.A06;
        boolean CcR = x9q.CcR(r12);
        int i2 = B9n.A00;
        int i3 = i2;
        C70281O0l.A00(r9, r10, this.A03, r12, igImageButton, f, i, i3, CcR, A052, this.A07);
        if (A052) {
            fixedAspectRatioVideoLayout.setOnClickListener((View.OnClickListener) null);
            fixedAspectRatioVideoLayout.setOnTouchListener((View.OnTouchListener) null);
            return;
        }
        WB4.A00(fixedAspectRatioVideoLayout, B9n, has, this, 32);
        fixedAspectRatioVideoLayout.setOnTouchListener(new C18900WBt(5, this, has, B9n));
        x9q.E6t(uEj, r12);
    }

    public final Class modelClass() {
        return HAS.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C14904UEj(2Su.A00(layoutInflater, (ViewGroup.LayoutParams) null, viewGroup, R.layout.layout_grid_item_video));
    }
}
