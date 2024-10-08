package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.DmH  reason: case insensitive filesystem */
public final class C46841DmH extends 2Rw {
    public C47162Drd A00;
    public FYP A01 = new FYP(EWS.A06, AnonymousClass000.A00(3516));
    public boolean A02;
    public final E2Y A03;
    public final EGK A04 = new EGK((G5G) null);

    public C46841DmH(E2Y e2y) {
        0qQ.A0B(e2y, 1);
        this.A03 = e2y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r13, int r14) {
        /*
            r12 = this;
            r4 = 0
            X.0qQ.A0B(r13, r4)
            int r1 = r13.mItemViewType
            if (r1 == 0) goto L_0x0135
            r0 = 1
            if (r1 == r0) goto L_0x0115
            r0 = 2
            if (r1 == r0) goto L_0x001d
            r0 = 3
            if (r1 != r0) goto L_0x02a5
            X.FYP r0 = r12.A01
            X.Dnj r13 = (X.C46929Dnj) r13
            com.instagram.ui.widget.loadmore2.LoadMoreButton r1 = r13.A00
            X.EWS r0 = r0.A00
            r1.setState(r0)
        L_0x001c:
            return
        L_0x001d:
            X.Dp9 r13 = (X.C47017Dp9) r13
            X.Drd r2 = r12.A00
            if (r2 == 0) goto L_0x001c
            java.util.List r5 = r2.A07
            r6 = 1
            if (r5 == 0) goto L_0x00b6
            boolean r0 = X.AnonymousClass7TE.A1b(r5)
            if (r0 != r6) goto L_0x00b6
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L_0x0047
            int r3 = r0.intValue()
            X.0eM r0 = r13.A05
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.View r0 = r13.A00
            android.content.Context r0 = r0.getContext()
            X.DbT.A18(r0, r1, r3)
        L_0x0047:
            java.util.Iterator r11 = r5.iterator()
        L_0x004b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r5 = r11.next()
            X.ExL r5 = (X.ExL) r5
            if (r5 == 0) goto L_0x004b
            android.view.View r0 = r13.A00
            android.content.Context r10 = r0.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r10)
            r1 = 2131627880(0x7f0e0f68, float:1.8883037E38)
            r0 = 0
            android.view.View r7 = X.DbT.A0D(r3, r0, r1, r4)
            r0 = 2131443881(0x7f0b40a9, float:1.8509843E38)
            android.widget.TextView r1 = X.DbU.A0G(r7, r0)
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto L_0x02bf
            r1.setText(r0)
            r0 = 2131443880(0x7f0b40a8, float:1.850984E38)
            android.widget.TextView r9 = X.DbU.A0G(r7, r0)
            java.lang.String r3 = r5.A00
            if (r3 == 0) goto L_0x02bc
            java.lang.String r8 = r5.A01
            if (r8 == 0) goto L_0x02c2
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r10, r0)
            r1 = 32
            java.lang.String r0 = r10.getString(r0)
            java.lang.String r0 = X.002.A0T(r3, r0, r1)
            android.text.SpannableStringBuilder r3 = X.DbS.A0C(r0)
            X.E2Y r1 = r13.A01
            X.DjE r0 = new X.DjE
            r0.<init>(r8, r1, r6)
            X.AnonymousClass7AV.A05(r3, r0, r5)
            X.DbX.A1G(r9, r3)
            X.0eM r0 = r13.A04
            java.lang.Object r0 = r0.getValue()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r7)
            goto L_0x004b
        L_0x00b6:
            java.lang.String r5 = r2.A00
            r3 = 8
            if (r5 == 0) goto L_0x010f
            int r1 = r5.hashCode()
            r0 = -1609594047(0xffffffffa00f8b41, float:-1.2158646E-19)
            if (r1 == r0) goto L_0x00f1
            r0 = 270940796(0x10263a7c, float:3.2782782E-29)
            if (r1 != r0) goto L_0x010f
            java.lang.String r0 = "disabled"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x010f
            X.0eM r1 = r13.A02
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            r0.setEnabled(r4)
            X.DbW.A1R(r1, r4)
        L_0x00de:
            java.lang.String r2 = r2.A06
            if (r2 == 0) goto L_0x001c
            X.0eM r1 = r13.A03
            java.lang.Object r0 = r1.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            X.DbW.A1R(r1, r4)
            return
        L_0x00f1:
            java.lang.String r0 = "enabled"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x010f
            X.0eM r1 = r13.A02
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            r0.setEnabled(r6)
            X.DbW.A1R(r1, r4)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r1)
            r0 = 59
            X.FP3.A00(r1, r0, r13)
            goto L_0x00de
        L_0x010f:
            X.0eM r0 = r13.A02
            X.DbW.A1R(r0, r3)
            goto L_0x00de
        L_0x0115:
            X.Dnz r13 = (X.C46945Dnz) r13
            X.Drd r0 = r12.A00
            if (r0 == 0) goto L_0x001c
            java.lang.Integer r0 = r0.A03
            if (r0 == 0) goto L_0x001c
            int r2 = r0.intValue()
            X.0eM r0 = r13.A01
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.View r0 = r13.A00
            android.content.Context r0 = r0.getContext()
            X.DbT.A18(r0, r1, r2)
            return
        L_0x0135:
            X.Doy r13 = (X.C47006Doy) r13
            X.Drd r3 = r12.A00
            if (r3 == 0) goto L_0x001c
            java.lang.Integer r0 = r3.A04
            if (r0 == 0) goto L_0x014b
            int r1 = r0.intValue()
            android.widget.ImageView r0 = r13.A01
            r0.setImageResource(r1)
            r0.setVisibility(r4)
        L_0x014b:
            java.lang.Integer r0 = r3.A05
            if (r0 == 0) goto L_0x015e
            int r2 = r0.intValue()
            com.instagram.common.ui.base.IgTextView r1 = r13.A03
            android.view.View r0 = r13.A00
            android.content.Context r0 = r0.getContext()
            X.DbT.A18(r0, r1, r2)
        L_0x015e:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            com.instagram.api.schemas.UserMonetizationProductType r0 = r3.A01
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x02cc;
                case 3: goto L_0x0234;
                case 9: goto L_0x0172;
                case 10: goto L_0x01d6;
                case 11: goto L_0x01a4;
                case 15: goto L_0x0203;
                default: goto L_0x016c;
            }
        L_0x016c:
            com.instagram.common.ui.base.IgTextView r0 = r13.A02
            X.DbX.A1G(r0, r6)
            return
        L_0x0172:
            X.EaR r2 = r3.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.viewmodel.DescriptionArgs.FanSubscriptions"
            X.0qQ.A0C(r2, r0)
            X.ENC r2 = (X.ENC) r2
            android.view.View r0 = r13.A00
            android.content.Context r1 = r0.getContext()
            int r0 = r2.A02
            java.lang.String r10 = X.AnonymousClass7TE.A16(r1, r0)
            int r0 = r2.A01
            java.lang.String r9 = X.AnonymousClass7TE.A16(r1, r0)
            int r0 = r2.A00
            java.lang.String r7 = X.AnonymousClass7TE.A16(r1, r0)
            X.E2Y r6 = r13.A04
            java.lang.String r1 = r2.A04
            X.0qQ.A0B(r1, r4)
            r0 = 1
            X.DjE r8 = new X.DjE
            r8.<init>(r1, r6, r0)
            java.lang.String r1 = r2.A03
            goto L_0x0267
        L_0x01a4:
            X.EaR r2 = r3.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.viewmodel.DescriptionArgs.IncentivePlatform"
            X.0qQ.A0C(r2, r0)
            X.END r2 = (X.END) r2
            android.view.View r0 = r13.A00
            android.content.Context r1 = r0.getContext()
            int r0 = r2.A02
            java.lang.String r10 = X.AnonymousClass7TE.A16(r1, r0)
            int r0 = r2.A01
            java.lang.String r9 = X.AnonymousClass7TE.A16(r1, r0)
            int r0 = r2.A00
            java.lang.String r7 = X.AnonymousClass7TE.A16(r1, r0)
            X.E2Y r6 = r13.A04
            java.lang.String r1 = r2.A04
            X.0qQ.A0B(r1, r4)
            r0 = 1
            X.DjE r8 = new X.DjE
            r8.<init>(r1, r6, r0)
            java.lang.String r1 = r2.A03
            goto L_0x0267
        L_0x01d6:
            X.EaR r2 = r3.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.viewmodel.DescriptionArgs.IGTVAds"
            X.0qQ.A0C(r2, r0)
            X.EN9 r2 = (X.EN9) r2
            android.view.View r0 = r13.A00
            android.content.Context r1 = r0.getContext()
            int r0 = r2.A00
            java.lang.String r5 = X.AnonymousClass7TE.A16(r1, r0)
            int r0 = r2.A01
            android.text.SpannableStringBuilder r6 = X.DbW.A08(r1, r0)
            X.E2Y r3 = r13.A04
            java.lang.String r2 = r2.A02
            X.0qQ.A0B(r2, r4)
            r1 = 1
            X.DjE r0 = new X.DjE
            r0.<init>(r2, r3, r1)
            X.AnonymousClass7AV.A05(r6, r0, r5)
            goto L_0x016c
        L_0x0203:
            X.EaR r2 = r3.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.viewmodel.DescriptionArgs.Badges"
            X.0qQ.A0C(r2, r0)
            X.ENA r2 = (X.ENA) r2
            android.view.View r0 = r13.A00
            android.content.Context r1 = r0.getContext()
            int r0 = r2.A02
            java.lang.String r10 = X.AnonymousClass7TE.A16(r1, r0)
            int r0 = r2.A01
            java.lang.String r9 = X.AnonymousClass7TE.A16(r1, r0)
            int r0 = r2.A00
            java.lang.String r7 = X.AnonymousClass7TE.A16(r1, r0)
            X.E2Y r6 = r13.A04
            java.lang.String r1 = r2.A04
            X.0qQ.A0B(r1, r4)
            r0 = 1
            X.DjE r8 = new X.DjE
            r8.<init>(r1, r6, r0)
            java.lang.String r1 = r2.A03
            goto L_0x0267
        L_0x0234:
            X.EaR r3 = r3.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.viewmodel.DescriptionArgs.BrandedContent"
            X.0qQ.A0C(r3, r0)
            X.ENB r3 = (X.ENB) r3
            android.view.View r0 = r13.A00
            android.content.Context r2 = r0.getContext()
            int r0 = r3.A00
            java.lang.String r9 = X.AnonymousClass7TE.A16(r2, r0)
            int r0 = r3.A01
            java.lang.String r7 = X.AnonymousClass7TE.A16(r2, r0)
            int r0 = r3.A02
            r1 = 1
            java.lang.String r10 = X.DbV.A0u(r2, r9, r7, r0)
            X.0qQ.A07(r10)
            X.E2Y r6 = r13.A04
            java.lang.String r0 = r3.A03
            X.0qQ.A0B(r0, r4)
            X.DjE r8 = new X.DjE
            r8.<init>(r0, r6, r1)
            java.lang.String r1 = r3.A04
        L_0x0267:
            X.0qQ.A0B(r1, r4)
            r0 = 1
            X.DjE r5 = new X.DjE
            r5.<init>(r1, r6, r0)
            android.text.SpannableStringBuilder r6 = X.DbS.A0C(r10)
            java.lang.String r1 = X.DbT.A10(r6)
            int r0 = r1.length()
            int r0 = r0 + -1
            int r4 = X.00l.A07(r1, r9, r0)
            int r3 = X.00l.A07(r1, r7, r0)
            r2 = -1
            if (r4 == r2) goto L_0x0295
            java.util.regex.Pattern r0 = X.0mp.A01
            int r1 = r9.length()
            int r1 = r1 + r4
            r0 = 33
            r6.setSpan(r8, r4, r1, r0)
        L_0x0295:
            if (r3 == r2) goto L_0x016c
            java.util.regex.Pattern r0 = X.0mp.A01
            int r1 = r7.length()
            int r1 = r1 + r3
            r0 = 33
            r6.setSpan(r5, r3, r1, r0)
            goto L_0x016c
        L_0x02a5:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "View type "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ".itemViewType is not supported"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x02bc:
            java.lang.String r0 = "explanation"
            goto L_0x02c4
        L_0x02bf:
            java.lang.String r0 = "title"
            goto L_0x02c4
        L_0x02c2:
            java.lang.String r0 = "learnMoreLink"
        L_0x02c4:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02cc:
            X.EaR r1 = r3.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.monetization.viewmodel.DescriptionArgs.Affiliate"
            X.0qQ.A0C(r1, r0)
            java.lang.String r0 = "getDescriptionLinkResId"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46841DmH.onBindViewHolder(X.3kE, int):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C47006Doy(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.monetization_product_tool_eligibility_header, false), this.A03);
        } else if (i == 1) {
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C46945Dnz(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.monetization_product_tool_tips, false));
        } else if (i == 2) {
            int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C47017Dp9(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.monetization_product_violations, false), this.A03);
        } else if (i == 3) {
            EGK egk = this.A04;
            LayoutInflater.from(viewGroup.getContext());
            return egk.A00(viewGroup);
        } else {
            throw AnonymousClass7TE.A0w(002.A0c("View type ", " is not supported", i));
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1574776582);
        C47162Drd drd = this.A00;
        int i = 1;
        if (drd == null || !drd.A09) {
            i = 2;
        }
        AnonymousClass0fD.A0A(-1724402029, A032);
        return i;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(508240540);
        C47162Drd drd = this.A00;
        int i2 = 1;
        if (drd != null && drd.A09) {
            i2 = 3;
        } else if (i == 0) {
            i2 = 0;
        } else if (drd == null || !drd.A08 || this.A02) {
            i2 = 2;
        }
        AnonymousClass0fD.A0A(1119482822, A032);
        return i2;
    }
}
