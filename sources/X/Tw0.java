package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class Tw0 extends C232222tE {
    public final AnonymousClass0iw A00;
    public final XC4 A01;
    public final XAH A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b9, code lost:
        if (r2 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r22, X.C249703kE r23) {
        /*
            r21 = this;
            r1 = r22
            X.Nfv r1 = (X.C69172Nfv) r1
            r13 = 0
            r0 = r23
            X.AnonymousClass7TF.A1H(r1, r0)
            X.Mg0 r10 = r1.A00
            android.content.Context r2 = X.JTQ.A06(r0)
            X.Nfh r9 = r1.A00
            r1 = r21
            X.XC4 r8 = r1.A01
            X.XAH r3 = r1.A02
            android.view.View r0 = r0.itemView
            java.lang.Object r7 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.ui.PlaceRowViewBinder.Holder"
            X.0qQ.A0C(r7, r0)
            X.VbU r7 = (X.C17638VbU) r7
            boolean r6 = r10.A0F
            boolean r12 = r1.A03
            r15 = 0
            X.0iw r1 = r1.A00
            r0 = 3
            X.C51973G9u.A0r(r0, r8, r3, r7)
            r0 = 7
            X.0qQ.A0B(r1, r0)
            X.Vl0 r1 = r9.A00
            android.view.ViewGroup r11 = r7.A01
            r3.ECK(r11, r9, r10)
            r1.A00()
            com.instagram.model.venue.Venue r0 = r1.A00()
            java.lang.String r3 = r0.A03()
            java.lang.String r0 = "facebook_events"
            boolean r0 = r0.equals(r3)
            r14 = 2131238506(0x7f081e6a, float:1.8093293E38)
            if (r0 == 0) goto L_0x0054
            r14 = 2131239877(0x7f0823c5, float:1.8096073E38)
        L_0x0054:
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r7.A05
            r4 = 38
            r5.setStrokeAlpha(r4)
            r3 = 8
            r5.setVisibility(r13)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.setScaleType(r0)
            X.UXL r0 = r1.A00
            if (r0 == 0) goto L_0x0076
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0076
            X.1Xj r0 = X.DbZ.A0T(r0, r13)
            if (r0 == 0) goto L_0x0076
            r0.A1p()
        L_0x0076:
            r5.A09()
            android.content.Context r0 = r5.getContext()
            X.DbU.A13(r0, r5, r14)
            android.content.Context r0 = r11.getContext()
            int r0 = X.AnonymousClass7TG.A02(r0)
            r5.setPadding(r0, r0, r0, r0)
            r0 = 2130970004(0x7f040594, float:1.7548706E38)
            int r0 = X.2Yu.A0H(r2, r0)
            X.DbU.A14(r2, r5, r0)
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r0 = r7.A06
            r0.setVisibility(r3)
            android.content.res.Resources r2 = X.DbU.A05(r5)
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbX.A0G(r5)
            X.C13990Tnq.A0n(r2, r0)
            r0 = 52
            X.WB4.A00(r11, r8, r9, r10, r0)
            com.instagram.common.ui.base.IgTextView r2 = r7.A03
            java.lang.String r0 = r1.A01()
            r2.setText(r0)
            boolean r0 = r10.A0J
            if (r0 == 0) goto L_0x00fc
            java.lang.String r2 = r10.A09
        L_0x00b9:
            if (r2 == 0) goto L_0x00f6
        L_0x00bb:
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00f6
            com.instagram.common.ui.base.IgTextView r1 = r7.A04
            r1.setVisibility(r13)
            r1.setText(r2)
        L_0x00c9:
            if (r12 == 0) goto L_0x00da
            r5.setStrokeAlpha(r4)
            X.C67434Mnp.A01(r11)
            r0 = 2132018053(0x7f140385, float:1.9674402E38)
            r1.setTextAppearance(r0)
            X.C67434Mnp.A04(r5)
        L_0x00da:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r7.A00
            if (r0 != 0) goto L_0x00e8
            android.view.ViewStub r0 = r7.A02
            com.instagram.common.ui.base.IgSimpleImageView r0 = X.C13989Tnp.A0U(r0)
            r7.A00 = r0
            if (r0 == 0) goto L_0x00f5
        L_0x00e8:
            r20 = r6
            r19 = r8
            r18 = r10
            r17 = r9
            r16 = r0
            X.C67429Mnk.A00(r15, r16, r17, r18, r19, r20)
        L_0x00f5:
            return
        L_0x00f6:
            com.instagram.common.ui.base.IgTextView r1 = r7.A04
            r1.setVisibility(r3)
            goto L_0x00c9
        L_0x00fc:
            java.lang.String r2 = r1.A02
            if (r2 != 0) goto L_0x00bb
            java.lang.String r2 = r1.A03
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Tw0.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C69172Nfv.class;
    }

    public Tw0(AnonymousClass0iw r1, XC4 xc4, XAH xah, boolean z) {
        this.A00 = r1;
        this.A01 = xc4;
        this.A02 = xah;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.row_place, false);
        A0A.setTag(new C17638VbU(A0A));
        C249703kE r1 = new C249703kE(A0A);
        if (A0A.getTag() instanceof C17638VbU) {
            return r1;
        }
        throw DbT.A0m();
    }
}
