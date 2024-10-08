package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.UbJ  reason: case insensitive filesystem */
public final class C15366UbJ extends AnonymousClass4DH implements C268594df, C74387Pu3 {
    public static final String __redex_internal_original_name = "ClickToMessagingOnFeedBottomSheetFragment";
    public int A00;
    public IGCTMessagingAdsInfoDict A01;
    public OnFeedMessagesIntf A02;
    public ImageUrl A03;
    public C71089Obq A04;
    public VSA A05;
    public C52673Gal A06;
    public C17519VYx A07;
    public CharSequence A08;
    public String A09;
    public String A0A;
    public String A0B;
    public int A0C = -1;
    public XSH A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public final AnonymousClass0eM A0J = C227642jf.A02(this);

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r2 == 0) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r14, X.C15366UbJ r15, java.lang.String r16, boolean r17) {
        /*
            r0 = r15
            X.0eM r4 = r15.A0J
            X.1E8 r2 = X.DbX.A0d(r4)
            java.lang.String r1 = r15.A0A
            X.1Xj r2 = r2.A02(r1)
            if (r2 == 0) goto L_0x0029
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            boolean r1 = X.C247643gg.A05(r1, r2)
            if (r1 == 0) goto L_0x0029
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.user.model.User r1 = X.C247643gg.A00(r1, r2)
            if (r1 == 0) goto L_0x0029
            java.lang.String r1 = r1.getId()
            r15.A0H = r1
        L_0x0029:
            java.lang.String r5 = r15.A0E
            if (r5 == 0) goto L_0x004d
            X.XSH r2 = r15.A0D
            X.XSH r1 = X.XSH.PAGE_MOBILE_STORY
            r10 = r16
            if (r2 != r1) goto L_0x0066
            X.VYx r1 = r15.A07
            if (r1 == 0) goto L_0x004d
            X.6cn r5 = r1.A03
            X.3uh r6 = r1.A00
            r9 = 0
            X.LOD r8 = new X.LOD
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.3mM r7 = r1.A01
            r10 = 0
            r5.A01(r6, r7, r8, r9, r10)
        L_0x004d:
            com.instagram.api.schemas.OnFeedMessagesIntf r1 = r0.A02
            boolean r1 = X.AnonymousClass3ZN.A02(r1)
            if (r1 == 0) goto L_0x005c
            X.Obq r1 = r0.A04
            if (r1 == 0) goto L_0x005c
            r1.A03()
        L_0x005c:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            X.DbX.A10(r0, r1)
            return
        L_0x0066:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r1 = r15.A01
            if (r1 == 0) goto L_0x00a8
            com.instagram.api.schemas.PrivacyDisclosureInfo r1 = r1.A01
            if (r1 == 0) goto L_0x00a8
            java.lang.String r1 = r1.B43()
        L_0x0072:
            r3 = 1
            if (r1 == 0) goto L_0x007c
            int r2 = r1.length()
            r1 = 0
            if (r2 != 0) goto L_0x007d
        L_0x007c:
            r1 = 1
        L_0x007d:
            r16 = r1 ^ 1
            com.instagram.api.schemas.OnFeedMessagesIntf r1 = r15.A02
            if (r1 == 0) goto L_0x00a6
            java.lang.Boolean r1 = r1.BuX()
            boolean r15 = X.AnonymousClass7TF.A1Y(r1, r3)
        L_0x008b:
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r6 = r0.getModuleName()
            java.lang.String r7 = r0.A0A
            java.lang.String r8 = r0.A0F
            java.lang.String r9 = r0.A0G
            java.lang.String r11 = r0.A09
            int r13 = r0.A0C
            java.lang.String r12 = r0.A0H
            r3 = r14
            r14 = r17
            X.C70283O0n.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x004d
        L_0x00a6:
            r15 = 0
            goto L_0x008b
        L_0x00a8:
            r1 = 0
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15366UbJ.A00(android.content.Context, X.UbJ, java.lang.String, boolean):void");
    }

    public final int AqL() {
        return -2;
    }

    public final int C8P() {
        return 0;
    }

    public final float CMx() {
        return 0.95f;
    }

    public final boolean CPc() {
        return true;
    }

    public final float Cmb() {
        return 0.95f;
    }

    public final void D5L() {
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Dj2(String str, boolean z) {
        C52673Gal gal;
        String str2;
        0qQ.A0B(str, 0);
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = this.A01;
        if (!(iGCTMessagingAdsInfoDict == null || (gal = this.A06) == null)) {
            String str3 = this.A09;
            if (str3 == null) {
                str3 = "-1";
            }
            long A002 = C16947VBz.A00(iGCTMessagingAdsInfoDict);
            OnFeedMessagesIntf BTY = iGCTMessagingAdsInfoDict.BTY();
            if (BTY != null) {
                str2 = AnonymousClass3ZN.A00(BTY);
            } else {
                str2 = "";
            }
            gal.A07(str3, A002, str2);
        }
        A00(requireContext(), this, str, z);
        return true;
    }

    public final boolean Erf() {
        return true;
    }

    public final boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0473, code lost:
        if (r0.isEmpty() != false) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0169, code lost:
        if (r12 == 4) goto L_0x016b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            r23 = this;
            r2 = 0
            r3 = r24
            X.0qQ.A0B(r3, r2)
            r4 = r23
            r0 = r25
            super.onViewCreated(r3, r0)
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r1 = r4.A01
            X.Gal r9 = r4.A06
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r4.A02
            if (r0 == 0) goto L_0x0529
            if (r1 == 0) goto L_0x0529
            if (r9 == 0) goto L_0x0529
            X.0nA.A0N(r3)
            java.lang.String r8 = r4.A09
            if (r8 != 0) goto L_0x0022
            java.lang.String r8 = "-1"
        L_0x0022:
            long r5 = X.C16947VBz.A00(r1)
            java.lang.String r7 = X.AnonymousClass3ZN.A00(r0)
            X.0wc r1 = r9.A01
            java.lang.String r0 = "on_feed_messages_render"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0043
            X.C13990Tnq.A11(r1, r9, r8, r5)
            java.lang.String r0 = "message_destination"
            r1.AAJ(r0, r7)
            r1.Cgf()
        L_0x0043:
            X.VSA r0 = r4.A05
            if (r0 == 0) goto L_0x004c
            X.2el r0 = r0.A00
            X.Dba.A0z(r3, r0, r4)
        L_0x004c:
            X.VYx r0 = r4.A07
            if (r0 == 0) goto L_0x0057
            X.4mU r1 = r0.A02
            java.lang.String r0 = "tapped"
            r1.EHY(r0)
        L_0x0057:
            X.0eM r0 = r4.A0J
            r22 = r0
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r22)
            if (r7 == 0) goto L_0x00df
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r4.A02
            boolean r0 = X.AnonymousClass3ZN.A02(r0)
            if (r0 == 0) goto L_0x00df
            X.1E8 r1 = X.1E7.A00(r7)
            java.lang.String r0 = r4.A0A
            X.1Xj r0 = r1.A02(r0)
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r1 = r4.A01
            X.Gal r8 = r4.A06
            if (r0 == 0) goto L_0x00df
            if (r1 == 0) goto L_0x00df
            if (r8 == 0) goto L_0x00df
            com.instagram.user.model.User r0 = r0.A2A(r7)
            if (r0 == 0) goto L_0x00df
            r0.getId()
            java.lang.String r9 = r4.A09
            if (r9 != 0) goto L_0x008c
            java.lang.String r9 = "-1"
        L_0x008c:
            long r11 = X.C16947VBz.A00(r1)
            java.lang.String r6 = X.C51972G9s.A0n()
            X.0wc r1 = r8.A01
            java.lang.String r0 = "ctd_automated_responses_gql_mutation_sent"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x00a8
            X.C13990Tnq.A11(r1, r8, r9, r11)
            r1.Cgf()
        L_0x00a8:
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "ad_id"
            X.0Df r5 = X.C41845B3m.A03(r1, r9, r0)
            java.lang.String r0 = "client_mutation_id"
            X.0Df.A00(r5, r6, r0)
            java.lang.String r1 = r8.A02
            java.lang.String r0 = X.C21058XCk.A00()
            X.2IS r6 = X.JTQ.A0D(r5, r1, r0)
            java.lang.String r0 = "input"
            X.DbW.A18(r5, r6, r0)
            java.lang.Class<X.UJI> r1 = X.UJI.class
            java.lang.String r0 = "CTDAutomatedResponsesStateV2Mutation"
            r10 = 1
            X.3Fa r5 = new X.3Fa
            r5.<init>(r6, r1, r0, r10)
            X.8j4 r1 = X.C363088j4.A00(r7)
            X.WHx r7 = new X.WHx
            r7.<init>(r8, r9, r10, r11)
            X.WHh r0 = new X.WHh
            r0.<init>(r8, r9, r11)
            r1.ATL(r0, r7, r5)
        L_0x00df:
            r0 = 2131437248(0x7f0b26c0, float:1.849639E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r3, r0)
            r0 = 2131437247(0x7f0b26bf, float:1.8496387E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r3, r0)
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r4.A02
            if (r0 == 0) goto L_0x0396
            java.lang.String r5 = r0.BCi()
        L_0x00f5:
            r7.setVisibility(r2)
            r1 = 2131968784(0x7f134310, float:1.9574472E38)
            r9 = 1
            java.lang.String r0 = r4.A0B
            X.DbX.A1F(r7, r4, r0, r1)
            r0 = 15
            X.WB9.A00(r7, r0, r4)
            if (r5 == 0) goto L_0x0113
            r6.setVisibility(r2)
            r6.setText(r5)
            r0 = 14
            X.WB9.A00(r6, r0, r4)
        L_0x0113:
            r0 = 2131437243(0x7f0b26bb, float:1.849638E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r3, r0)
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r0 = r4.A01
            if (r0 == 0) goto L_0x0134
            com.instagram.api.schemas.PrivacyDisclosureInfo r0 = r0.A01
            if (r0 == 0) goto L_0x0134
            java.lang.String r1 = r0.B43()
            if (r1 == 0) goto L_0x0134
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0134
            r5.setText(r1)
            r5.setVisibility(r2)
        L_0x0134:
            com.instagram.api.schemas.OnFeedMessagesIntf r5 = r4.A02
            if (r5 == 0) goto L_0x014b
            r0 = 2131434043(0x7f0b1a3b, float:1.8489889E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r3, r0)
            java.lang.String r0 = r5.BE4()
            if (r0 == 0) goto L_0x014b
            r1.setText(r0)
            r1.setVisibility(r2)
        L_0x014b:
            X.1E8 r1 = X.DbX.A0d(r22)
            java.lang.String r0 = r4.A0A
            X.1Xj r1 = r1.A02(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r22)
            long r0 = X.AEO.A00(r0, r1)
            int r12 = (int) r0
            r11 = 4
            r21 = 3
            r0 = r21
            if (r12 == r0) goto L_0x016b
            r14 = 0
            r0 = 2131443988(0x7f0b4114, float:1.851006E38)
            if (r12 != r11) goto L_0x016f
        L_0x016b:
            r14 = 1
            r0 = 2131443986(0x7f0b4112, float:1.8510056E38)
        L_0x016f:
            android.view.View r20 = X.AnonymousClass7TE.A0b(r3, r0)
            r0 = 2131443991(0x7f0b4117, float:1.8510066E38)
            android.view.View r19 = X.AnonymousClass7TE.A0b(r3, r0)
            android.content.Context r18 = r20.getContext()
            r0 = 2131437257(0x7f0b26c9, float:1.8496408E38)
            if (r14 == 0) goto L_0x0186
            r0 = 2131437256(0x7f0b26c8, float:1.8496406E38)
        L_0x0186:
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r3, r0)
            r0 = 2131437252(0x7f0b26c4, float:1.8496397E38)
            if (r14 == 0) goto L_0x0192
            r0 = 2131437251(0x7f0b26c3, float:1.8496395E38)
        L_0x0192:
            com.instagram.common.ui.widget.imageview.IgImageView r8 = X.DbX.A0b(r3, r0)
            r0 = 2131434520(0x7f0b1c18, float:1.8490856E38)
            com.instagram.common.ui.widget.imageview.IgImageView r13 = X.DbX.A0b(r3, r0)
            r0 = 2131443997(0x7f0b411d, float:1.8510078E38)
            if (r14 == 0) goto L_0x01a5
            r0 = 2131443987(0x7f0b4113, float:1.8510058E38)
        L_0x01a5:
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x040e
            r0.setVisibility(r2)
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r7 = r4.A01
            com.instagram.common.typedurl.ImageUrl r6 = r4.A03
            com.instagram.api.schemas.OnFeedMessagesIntf r15 = r4.A02
            X.VSA r5 = r4.A05
            java.lang.String r1 = r4.A0B
            if (r15 == 0) goto L_0x0392
            com.instagram.api.schemas.GreetingAttachmentIntf r17 = r15.BFz()
        L_0x01be:
            if (r7 == 0) goto L_0x02c7
            if (r6 == 0) goto L_0x02c7
            if (r15 == 0) goto L_0x02c7
            if (r5 == 0) goto L_0x02c7
            if (r1 == 0) goto L_0x02c7
            java.lang.String r0 = r15.B9l()
            if (r0 == 0) goto L_0x02c7
            int r0 = r0.length()
            if (r0 == 0) goto L_0x02c7
            if (r14 == 0) goto L_0x0367
            java.lang.String r0 = r15.B9l()
            android.text.SpannableString r15 = new android.text.SpannableString
            r15.<init>(r0)
        L_0x01df:
            r4.A08 = r15
            if (r17 == 0) goto L_0x024d
            java.lang.String r0 = r17.getUrl()
            if (r0 == 0) goto L_0x024d
            r0 = r22
            X.0lg r15 = X.AnonymousClass7TF.A0L(r0, r2)
            X.0Tu r14 = X.0Tu.A05
            r0 = 36330011665383840(0x8111f4000041a0, double:3.038583894179172E-306)
            boolean r0 = X.182.A06(r14, r15, r0)
            if (r0 == 0) goto L_0x024d
            java.lang.String r0 = r17.getUrl()
            X.0qQ.A0A(r0)
            android.net.Uri r1 = X.DbT.A09(r0)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r16 = X.C253833rU.A00(r1, r0, r0)
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            java.lang.Integer r0 = r17.BCu()
            int r1 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = r17.CGY()
            int r0 = X.DbX.A01(r0)
            float r15 = (float) r0
            float r0 = (float) r1
            float r15 = r15 / r0
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131165226(0x7f07002a, float:1.7944663E38)
            int r1 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r1
            float r0 = r0 * r15
            int r0 = (int) r0
            r14.width = r0
            r14.height = r1
            android.view.ViewGroup$MarginLayoutParams r1 = X.DbX.A0G(r10)
            r0 = 2131240340(0x7f082594, float:1.8097012E38)
            r10.setBackgroundResource(r0)
            int r0 = X.AnonymousClass7TG.A04(r18)
            r1.bottomMargin = r0
            r13.setLayoutParams(r14)
            r0 = r16
            r13.setUrl(r0, r4)
        L_0x024d:
            java.lang.CharSequence r0 = r4.A08
            r10.setText(r0)
            r0 = 17
            X.WB9.A00(r10, r0, r4)
            if (r17 != 0) goto L_0x0293
            if (r12 != r11) goto L_0x0293
            r8.setVisibility(r11)
            r0 = 0
            r10.setAlpha(r0)
            r12 = 2
            int[] r0 = new int[r12]
            r0 = {0, 100} // fill-array
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofInt(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r11.setDuration(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r11.setStartDelay(r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r11.setInterpolator(r0)
            X.U0F r0 = new X.U0F
            r0.<init>(r12, r8, r10)
            r11.addListener(r0)
            X.W4K r1 = new X.W4K
            r0 = r21
            r1.<init>(r0, r8, r10)
            r11.addUpdateListener(r1)
            r11.start()
        L_0x0293:
            r8.setUrl(r6, r4)
            r0 = 16
            X.WB9.A00(r8, r0, r4)
            java.lang.String r6 = r4.A09
            if (r6 != 0) goto L_0x02a1
            java.lang.String r6 = "-1"
        L_0x02a1:
            X.Gal r0 = r5.A01
            X.WU6 r1 = new X.WU6
            r1.<init>(r0)
            int r0 = r10.getId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.30a r0 = X.AnonymousClass30Y.A00(r7, r6, r0)
            X.30Y r1 = X.DbU.A0a(r1, r0)
            X.2el r0 = r5.A00
            r0.A05(r10, r1)
            r0 = r20
            r0.setVisibility(r2)
            r0 = r19
            r0.setVisibility(r2)
        L_0x02c7:
            com.instagram.api.schemas.OnFeedMessagesIntf r1 = r4.A02
            if (r1 == 0) goto L_0x0450
            java.util.List r7 = X.AnonymousClass3ZO.A01(r1)
            if (r7 == 0) goto L_0x0450
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0450
            boolean r0 = X.AnonymousClass3ZN.A02(r1)
            if (r0 == 0) goto L_0x0399
            r0 = 2131434046(0x7f0b1a3e, float:1.8489895E38)
            android.view.ViewGroup r6 = X.DbX.A0I(r3, r0)
            int r10 = r7.size()
            r8 = 0
        L_0x02e9:
            if (r8 >= r10) goto L_0x044d
            java.lang.Object r0 = r7.get(r8)
            com.instagram.api.schemas.IceBreakerMessageIntf r0 = (com.instagram.api.schemas.IceBreakerMessageIntf) r0
            java.lang.String r13 = r0.getMessage()
            if (r13 != 0) goto L_0x02f9
            java.lang.String r13 = "null"
        L_0x02f9:
            java.lang.String r0 = "\""
            java.lang.String r1 = X.002.A0g(r0, r13, r0)
            android.view.LayoutInflater r5 = X.DbV.A0D(r6)
            r0 = 2131628077(0x7f0e102d, float:1.8883436E38)
            android.view.View r5 = r5.inflate(r0, r6, r2)
            java.lang.String r0 = X.C273654mx.A00(r9)
            X.0qQ.A0C(r5, r0)
            r0 = 2131434045(0x7f0b1a3d, float:1.8489893E38)
            android.widget.TextView r12 = X.AnonymousClass7TG.A0R(r5, r0)
            r12.setText(r1)
            long r0 = (long) r8
            X.W9k r11 = new X.W9k
            r11.<init>(r4, r13, r0)
            X.AnonymousClass0fU.A00(r11, r12)
            r11 = 2131434044(0x7f0b1a3c, float:1.848989E38)
            android.view.View r12 = r5.requireViewById(r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            r1 = 7
            X.WB5 r0 = new X.WB5
            r0.<init>((java.lang.Object) r11, (java.lang.Object) r4, (java.lang.String) r13, (int) r1)
            X.AnonymousClass0fU.A00(r0, r12)
            r5.setId(r8)
            r6.addView(r5)
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r13 = r4.A01
            if (r13 == 0) goto L_0x0364
            X.VSA r12 = r4.A05
            if (r12 == 0) goto L_0x0364
            java.lang.String r11 = r4.A09
            if (r11 != 0) goto L_0x034c
            java.lang.String r11 = "-1"
        L_0x034c:
            X.Gal r0 = r12.A01
            X.WU5 r1 = new X.WU5
            r1.<init>(r0)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            X.30a r0 = X.AnonymousClass30Y.A00(r13, r11, r0)
            X.30Y r1 = X.DbU.A0a(r1, r0)
            X.2el r0 = r12.A00
            r0.A05(r5, r1)
        L_0x0364:
            int r8 = r8 + 1
            goto L_0x02e9
        L_0x0367:
            r14 = 32
            java.lang.String r15 = r15.B9l()
            if (r15 != 0) goto L_0x0371
            java.lang.String r15 = "null"
        L_0x0371:
            java.lang.String r0 = "\""
            java.lang.String r0 = X.002.A0g(r0, r15, r0)
            java.lang.String r0 = X.002.A0T(r1, r0, r14)
            android.text.SpannableString r15 = new android.text.SpannableString
            r15.<init>(r0)
            android.text.style.StyleSpan r14 = new android.text.style.StyleSpan
            r14.<init>(r9)
            X.0eM r0 = X.0mp.A09
            int r1 = r1.length()
            r0 = 17
            r15.setSpan(r14, r2, r1, r0)
            goto L_0x01df
        L_0x0392:
            r17 = 0
            goto L_0x01be
        L_0x0396:
            r5 = 0
            goto L_0x00f5
        L_0x0399:
            r0 = 2131437249(0x7f0b26c1, float:1.8496391E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r3, r0)
            android.widget.RadioGroup r6 = (android.widget.RadioGroup) r6
            int r11 = r7.size()
            r10 = 0
        L_0x03a7:
            if (r10 >= r11) goto L_0x0413
            java.lang.Object r0 = r7.get(r10)
            com.instagram.api.schemas.IceBreakerMessageIntf r0 = (com.instagram.api.schemas.IceBreakerMessageIntf) r0
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L_0x03b7
            java.lang.String r1 = "null"
        L_0x03b7:
            java.lang.String r0 = "\""
            java.lang.String r12 = X.002.A0g(r0, r1, r0)
            android.view.LayoutInflater r5 = X.DbV.A0D(r6)
            r0 = 2131628076(0x7f0e102c, float:1.8883434E38)
            r1 = 0
            android.view.View r8 = r5.inflate(r0, r6, r2)
            r0 = 1634(0x662, float:2.29E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r8, r0)
            com.instagram.igds.components.button.IgdsRadioButton r8 = (com.instagram.igds.components.button.IgdsRadioButton) r8
            r8.setText(r12)
            r8.setId(r10)
            int r0 = r4.A00
            if (r10 != r0) goto L_0x03df
            r1 = 1
        L_0x03df:
            r8.setChecked(r1)
            r6.addView(r8)
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r13 = r4.A01
            if (r13 == 0) goto L_0x040b
            X.VSA r12 = r4.A05
            if (r12 == 0) goto L_0x040b
            java.lang.String r5 = r4.A09
            if (r5 != 0) goto L_0x03f3
            java.lang.String r5 = "-1"
        L_0x03f3:
            X.Gal r0 = r12.A01
            X.WU5 r1 = new X.WU5
            r1.<init>(r0)
            java.lang.String r0 = java.lang.String.valueOf(r10)
            X.30a r0 = X.AnonymousClass30Y.A00(r13, r5, r0)
            X.30Y r1 = X.DbU.A0a(r1, r0)
            X.2el r0 = r12.A00
            r0.A05(r8, r1)
        L_0x040b:
            int r10 = r10 + 1
            goto L_0x03a7
        L_0x040e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0413:
            r0 = 2131968783(0x7f13430f, float:1.957447E38)
            java.lang.String r10 = X.DbU.A0m(r4, r0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            android.view.LayoutInflater r1 = X.DbV.A0D(r6)
            r0 = 2131628076(0x7f0e102c, float:1.8883434E38)
            r5 = 0
            android.view.View r1 = r1.inflate(r0, r6, r2)
            r0 = 1634(0x662, float:2.29E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.instagram.igds.components.button.IgdsRadioButton r1 = (com.instagram.igds.components.button.IgdsRadioButton) r1
            r1.setText(r10)
            r1.setId(r8)
            int r0 = r4.A00
            if (r8 != r0) goto L_0x043f
            r5 = 1
        L_0x043f:
            r1.setChecked(r5)
            r6.addView(r1)
            X.FQV r0 = new X.FQV
            r0.<init>(r2, r4, r7)
            r6.setOnCheckedChangeListener(r0)
        L_0x044d:
            r6.setVisibility(r2)
        L_0x0450:
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r4.A02
            boolean r0 = X.AnonymousClass3ZN.A02(r0)
            if (r0 != 0) goto L_0x04aa
            r0 = 2131437244(0x7f0b26bc, float:1.8496381E38)
            X.Dbb.A0t(r3, r0, r2)
            r0 = 2131437246(0x7f0b26be, float:1.8496385E38)
            com.instagram.igds.components.button.IgdsButton r10 = X.JTR.A0n(r3, r0)
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r4.A02
            java.util.List r0 = X.AnonymousClass3ZO.A01(r0)
            if (r0 == 0) goto L_0x0475
            boolean r0 = r0.isEmpty()
            r17 = 0
            if (r0 == 0) goto L_0x0477
        L_0x0475:
            r17 = 1
        L_0x0477:
            r10.setVisibility(r2)
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r8 = r4.A01
            X.Gal r7 = r4.A06
            com.instagram.api.schemas.OnFeedMessagesIntf r6 = r4.A02
            if (r6 == 0) goto L_0x049b
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r3)
            int r1 = X.AnonymousClass3ZO.A00(r6)
            if (r1 != r9) goto L_0x052c
            r0 = 2131968779(0x7f13430b, float:1.9574462E38)
            if (r17 == 0) goto L_0x0494
            r0 = 2131968780(0x7f13430c, float:1.9574464E38)
        L_0x0494:
            java.lang.String r0 = X.C51967G9n.A0p(r5, r0)
            r10.setText((java.lang.String) r0)
        L_0x049b:
            X.FOB r0 = new X.FOB
            r11 = r0
            r12 = r2
            r13 = r7
            r14 = r6
            r15 = r8
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.AnonymousClass0fU.A00(r0, r10)
        L_0x04aa:
            r0 = 2131437250(0x7f0b26c2, float:1.8496393E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r3, r0)
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r0 = r4.A01
            if (r0 == 0) goto L_0x04e4
            com.instagram.api.schemas.PrivacyDisclosureInfo r0 = r0.A01
            if (r0 == 0) goto L_0x052a
            java.lang.String r1 = r0.Bfo()
        L_0x04bd:
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r4.A02
            boolean r0 = X.AnonymousClass3ZN.A02(r0)
            if (r0 == 0) goto L_0x04cd
            if (r1 == 0) goto L_0x04cd
            int r0 = r1.length()
            if (r0 != 0) goto L_0x04de
        L_0x04cd:
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r4.A02
            int r0 = X.AnonymousClass3ZO.A00(r0)
            if (r9 != r0) goto L_0x04e4
            r1 = 2131968785(0x7f134311, float:1.9574474E38)
            java.lang.String r0 = r4.A0B
            java.lang.String r1 = X.DbV.A0z(r4, r0, r1)
        L_0x04de:
            r5.setText(r1)
            r5.setVisibility(r2)
        L_0x04e4:
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r4.A02
            boolean r0 = X.AnonymousClass3ZN.A02(r0)
            if (r0 == 0) goto L_0x0529
            r0 = 2131437245(0x7f0b26bd, float:1.8496383E38)
            X.Dbb.A0t(r3, r0, r2)
            r0 = 2131440516(0x7f0b3384, float:1.8503018E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r3, r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131231606(0x7f080376, float:1.8079298E38)
            X.DbU.A11(r1, r2, r0)
            r0 = 2131440518(0x7f0b3386, float:1.8503022E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r3, r0)
            r0 = 2131968783(0x7f13430f, float:1.957447E38)
            r1.setHint(r0)
            r0 = 2131430564(0x7f0b0ca4, float:1.8482833E38)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = X.DbX.A0b(r3, r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            r0 = r22
            com.instagram.user.model.User r0 = X.DbX.A0l(r1, r0)
            X.DbU.A1S(r4, r2, r0)
            X.Obq r0 = r4.A04
            if (r0 == 0) goto L_0x0529
            r0.A04(r3)
        L_0x0529:
            return
        L_0x052a:
            r1 = 0
            goto L_0x04bd
        L_0x052c:
            r0 = 2
            if (r1 != r0) goto L_0x0539
            r0 = 2131968781(0x7f13430d, float:1.9574466E38)
            if (r17 == 0) goto L_0x0494
            r0 = 2131968782(0x7f13430e, float:1.9574468E38)
            goto L_0x0494
        L_0x0539:
            r0 = 968(0x3c8, float:1.356E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15366UbJ.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final String getModuleName() {
        if (AnonymousClass3ZN.A02(this.A02)) {
            return C66579MXk.A00(300);
        }
        return "click_to_messaging_on_feed_bottom_sheet";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0J);
    }

    public final void onBottomSheetClosed() {
        C52673Gal gal;
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = this.A01;
        if (iGCTMessagingAdsInfoDict != null && (gal = this.A06) != null) {
            String str = this.A09;
            if (str == null) {
                str = "-1";
            }
            long A002 = C16947VBz.A00(iGCTMessagingAdsInfoDict);
            0Aj A0e = AnonymousClass7TE.A0e(gal.A01, "on_feed_messages_dismiss");
            if (A0e.isSampled()) {
                C13990Tnq.A11(A0e, gal, str, A002);
                A0e.Cgf();
            }
        }
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float CoU() {
        return 0.95f;
    }

    public final void onCreate(Bundle bundle) {
        OnFeedMessagesIntf onFeedMessagesIntf;
        int A022 = AnonymousClass0fD.A02(-768118580);
        C15366UbJ.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = (IGCTMessagingAdsInfoDict) bundle2.getParcelable("click_to_messaging_ads_info");
            this.A01 = iGCTMessagingAdsInfoDict;
            if (iGCTMessagingAdsInfoDict != null) {
                onFeedMessagesIntf = iGCTMessagingAdsInfoDict.BTY();
            } else {
                onFeedMessagesIntf = null;
            }
            this.A02 = onFeedMessagesIntf;
            this.A0B = bundle2.getString("page_handle");
            this.A03 = (ImageUrl) bundle2.getParcelable("page_profile_pic_url");
            this.A09 = bundle2.getString("ad_id");
            this.A0A = bundle2.getString("media_id");
            this.A0F = bundle2.getString("reel_id");
            this.A0G = bundle2.getString("reel_item_id");
            this.A0E = bundle2.getString("direct_entry_point");
            XSH xsh = (XSH) bundle2.getSerializable("on_feed_messaging_surface");
            this.A0D = xsh;
            if (xsh != null) {
                this.A06 = new C52673Gal(xsh, this, AnonymousClass7TE.A0l(this.A0J));
            }
            C52673Gal gal = this.A06;
            if (gal != null) {
                this.A05 = new VSA(gal);
            }
            this.A0I = 182.A06(0Tu.A05, DbT.A0X(this.A0J), 36326730310367180L);
            this.A04 = new C71089Obq(requireContext(), this, this.A0I);
            this.A0C = bundle2.getInt("carousel_index");
        }
        AnonymousClass0fD.A09(692131683, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1350952583);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.on_feed_container_view, viewGroup, false);
        AnonymousClass0fD.A09(709607731, A022);
        return inflate;
    }

    public final void onPause() {
        C71089Obq obq;
        int A022 = AnonymousClass0fD.A02(-1685920131);
        C15366UbJ.super.onPause();
        if (AnonymousClass3ZN.A02(this.A02) && (obq = this.A04) != null) {
            obq.A03();
        }
        C17519VYx vYx = this.A07;
        if (vYx != null) {
            vYx.A02.EHd();
        }
        AnonymousClass0fD.A09(-346158735, A022);
    }
}
