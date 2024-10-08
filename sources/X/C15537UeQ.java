package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.UeQ  reason: case insensitive filesystem */
public final class C15537UeQ extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final XC4 A02;
    public final XAH A03;

    public C15537UeQ(Context context, AnonymousClass0iw r3, XC4 xc4, XAH xah) {
        0qQ.A0B(xah, 4);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = xc4;
        this.A03 = xah;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00cc, code lost:
        if (r1 != null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e8, code lost:
        if (r11 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r17, android.view.View r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r16 = this;
            r13 = r20
            r12 = r19
            r0 = -1118402907(0xffffffffbd5686a5, float:-0.0523745)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r5 = 1
            r3 = r18
            X.0qQ.A0B(r3, r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.model.PlaceSearchEntry"
            X.0qQ.A0C(r12, r0)
            X.Nfh r12 = (X.C69158Nfh) r12
            r0 = 17
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r13, r0)
            X.Mg0 r13 = (X.C66967Mg0) r13
            r4 = r16
            android.content.Context r1 = r4.A00
            X.XC4 r14 = r4.A02
            X.XAH r8 = r4.A03
            java.lang.Object r3 = r3.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.ui.PlaceRowViewBinder.Holder"
            X.0qQ.A0C(r3, r0)
            X.VbU r3 = (X.C17638VbU) r3
            boolean r15 = r13.A0F
            r10 = 0
            X.0iw r4 = r4.A01
            boolean r5 = X.DbW.A1S(r5, r1, r12)
            r0 = 3
            X.C51973G9u.A0r(r0, r14, r8, r3)
            r0 = 7
            X.0qQ.A0B(r4, r0)
            X.Vl0 r6 = r12.A00
            android.view.ViewGroup r7 = r3.A01
            r8.ECK(r7, r12, r13)
            r6.A00()
            com.instagram.model.venue.Venue r0 = r6.A00()
            java.lang.String r4 = r0.A03()
            java.lang.String r0 = "facebook_events"
            boolean r0 = r0.equals(r4)
            r9 = 2131238506(0x7f081e6a, float:1.8093293E38)
            if (r0 == 0) goto L_0x0067
            r9 = 2131239877(0x7f0823c5, float:1.8096073E38)
        L_0x0067:
            com.instagram.common.ui.widget.imageview.CircularImageView r8 = r3.A05
            r0 = 38
            r8.setStrokeAlpha(r0)
            r4 = 8
            r8.setVisibility(r5)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r8.setScaleType(r0)
            X.UXL r0 = r6.A00
            if (r0 == 0) goto L_0x0089
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0089
            X.1Xj r0 = X.DbZ.A0T(r0, r5)
            if (r0 == 0) goto L_0x0089
            r0.A1p()
        L_0x0089:
            r8.A09()
            android.content.Context r0 = r8.getContext()
            X.DbU.A13(r0, r8, r9)
            android.content.Context r0 = r7.getContext()
            int r0 = X.AnonymousClass7TG.A02(r0)
            r8.setPadding(r0, r0, r0, r0)
            r0 = 2130970004(0x7f040594, float:1.7548706E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbU.A14(r1, r8, r0)
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r0 = r3.A06
            r0.setVisibility(r4)
            android.content.res.Resources r1 = X.DbU.A05(r8)
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbX.A0G(r8)
            X.C13990Tnq.A0n(r1, r0)
            r0 = 52
            X.WB4.A00(r7, r14, r12, r13, r0)
            com.instagram.common.ui.base.IgTextView r1 = r3.A03
            java.lang.String r0 = r6.A01()
            r1.setText(r0)
            boolean r0 = r13.A0J
            if (r0 == 0) goto L_0x00fa
            java.lang.String r1 = r13.A09
        L_0x00cc:
            if (r1 == 0) goto L_0x00f4
        L_0x00ce:
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00f4
            com.instagram.common.ui.base.IgTextView r0 = r3.A04
            r0.setVisibility(r5)
            r0.setText(r1)
        L_0x00dc:
            com.instagram.common.ui.base.IgSimpleImageView r11 = r3.A00
            if (r11 != 0) goto L_0x00ea
            android.view.ViewStub r0 = r3.A02
            com.instagram.common.ui.base.IgSimpleImageView r11 = X.C13989Tnp.A0U(r0)
            r3.A00 = r11
            if (r11 == 0) goto L_0x00ed
        L_0x00ea:
            X.C67429Mnk.A00(r10, r11, r12, r13, r14, r15)
        L_0x00ed:
            r0 = 1703026312(0x65821e88, float:7.680886E22)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x00f4:
            com.instagram.common.ui.base.IgTextView r0 = r3.A04
            r0.setVisibility(r4)
            goto L_0x00dc
        L_0x00fa:
            java.lang.String r1 = r6.A02
            if (r1 != 0) goto L_0x00ce
            java.lang.String r1 = r6.A03
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15537UeQ.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1283162273);
        LayoutInflater from = LayoutInflater.from(this.A00);
        0qQ.A07(from);
        View A0A = DbU.A0A(from, viewGroup, R.layout.row_place, false);
        A0A.setTag(new C17638VbU(A0A));
        AnonymousClass0fD.A0A(1436907778, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
