package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;

/* renamed from: X.KGl  reason: case insensitive filesystem */
public final class C61661KGl extends C232232tF {
    public final int A00;
    public final int A01;
    public final AnonymousClass4DH A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r12, C249703kE r13) {
        C64780Lhw lhw = (C64780Lhw) r12;
        C60695Jpg jpg = (C60695Jpg) r13;
        AnonymousClass7TF.A1H(lhw, jpg);
        int i = this.A01;
        int i2 = this.A00;
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = lhw.A00;
        User A012 = r0.A01(userSession);
        boolean A1W = C51970G9q.A1W(i, i2);
        C262794Ga r7 = jpg.A01;
        AnonymousClass0Ud r5 = lhw.A01.A04;
        String str = ((C61028JvS) r5.getValue()).A01;
        AnonymousClass0eM r10 = r7.A0F;
        int dimensionPixelSize = AnonymousClass7TE.A0c(r10).getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material);
        C262794Ga.A02(userSession, r7, A1W);
        r7.A03(A012, str, A1W);
        AnonymousClass0eM r2 = r7.A0E;
        float f = (float) dimensionPixelSize;
        JTQ.A0A(r2).setTextSize(0, f);
        AnonymousClass0eM r8 = r7.A07;
        JTQ.A0A(r8).setTextSize(0, f);
        AnonymousClass0eM r9 = r7.A04;
        ((IgdsButton) AnonymousClass7TE.A14(r9)).setSize(C273024lp.MEDIUM);
        if (A1W) {
            int A03 = JTP.A03(AnonymousClass7TE.A0c(r10).getResources());
            ViewGroup.LayoutParams layoutParams = AnonymousClass7TH.A06(r2).getLayoutParams();
            String A002 = AnonymousClass000.A00(18);
            0qQ.A0C(layoutParams, A002);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            ViewGroup.LayoutParams layoutParams2 = AnonymousClass7TH.A06(r9).getLayoutParams();
            0qQ.A0C(layoutParams2, A002);
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = A03;
            ViewGroup.LayoutParams layoutParams3 = AnonymousClass7TH.A06(r8).getLayoutParams();
            0qQ.A0C(layoutParams3, A002);
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = A03;
        } else {
            AnonymousClass0eM r22 = r7.A0B;
            JTR.A0Z(r22).setImageDrawable(C262794Ga.A01(r7, A012, DbX.A07(r7.A09)));
            JTS.A1W(r22, 0);
        }
        JTS.A10(jpg, new MGG(jpg, A012, (AnonymousClass4D7) null, A1W), r5);
    }

    public final Class modelClass() {
        return C64780Lhw.class;
    }

    public C61661KGl(AnonymousClass4DH r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = this.A01;
        int i2 = this.A00;
        View inflate = layoutInflater.inflate(R.layout.share_open_carousel_card_preview_layout, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout");
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate;
        JTQ.A0w(igFrameLayout, i, i2);
        igFrameLayout.setTag(new C60695Jpg(igFrameLayout));
        Object tag = igFrameLayout.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.fragment.sharepreview.ShareOpenCarouselCardPreviewViewBinder.Companion.Holder");
        return (C249703kE) tag;
    }
}
