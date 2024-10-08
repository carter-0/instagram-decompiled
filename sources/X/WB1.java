package X;

import android.view.View;

public final class WB1 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public WB1(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public static void A00(View view, Object obj, int i, int i2) {
        AnonymousClass0fU.A00(new WB1(obj, i, i2), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03b7, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0203, code lost:
        if (r0 == r1) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02c8, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02e8, code lost:
        if (r5 < 0) goto L_0x029b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0388;
                case 1: goto L_0x0320;
                case 2: goto L_0x0309;
                case 3: goto L_0x02ee;
                case 4: goto L_0x025a;
                case 5: goto L_0x0234;
                case 6: goto L_0x01d4;
                case 7: goto L_0x01ae;
                case 8: goto L_0x0171;
                case 9: goto L_0x011b;
                case 10: goto L_0x0104;
                case 11: goto L_0x00f3;
                case 12: goto L_0x00e3;
                case 13: goto L_0x00c9;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -1724358646(0xffffffff9938600a, float:-9.531972E-24)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r10.A02
            X.U9w r0 = (X.C14801U9w) r0
            X.UbP r2 = r0.A00
            int r1 = r10.A01
            X.VjZ r0 = r2.A03
            X.0eM r0 = r0.A04
            java.lang.Object r7 = X.C13989Tnp.A0h(r0, r1)
            X.VSD r7 = (X.VSD) r7
            X.UXr r0 = r2.A05
            java.lang.String r1 = r0.A05
            r1.getClass()
            r0 = 683(0x2ab, float:9.57E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008d
            int r0 = r2.A00
            if (r0 != 0) goto L_0x0053
            com.instagram.common.session.UserSession r6 = r2.A01
            java.lang.String r5 = r2.A06
            java.util.HashMap r3 = r2.A07
            X.0wc r1 = X.AnonymousClass0kN.A01(r2, r6)
            java.lang.String r0 = "instagram_landing_page_quality_survey_click"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0053
            if (r3 == 0) goto L_0x0053
            X.VI2.A00(r1, r6, r5, r3)
            r1.Cgf()
        L_0x0053:
            com.instagram.common.session.UserSession r9 = r2.A01
            java.lang.String r8 = r2.A06
            X.VjZ r0 = r2.A03
            X.UNc r0 = r0.A03
            java.lang.String r6 = r0.A03
            r6.getClass()
            X.XAm r0 = r7.A01
            java.lang.String r5 = r0.getId()
            r5.getClass()
            java.util.HashMap r3 = r2.A07
            X.0wc r1 = X.AnonymousClass0kN.A01(r2, r9)
            java.lang.String r0 = "instagram_landing_page_quality_survey_question_response"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x008d
            if (r3 == 0) goto L_0x008d
            X.VI2.A00(r1, r9, r8, r3)
            java.lang.String r0 = "question_id"
            r1.AAJ(r0, r6)
            java.lang.String r0 = "response"
            r1.AAJ(r0, r5)
            r1.Cgf()
        L_0x008d:
            X.XAm r3 = r7.A01
            java.lang.String r1 = r3.BW8()
            java.lang.String r0 = "thank_you_screen"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0293
            X.7Pu r6 = r2.A04
            com.instagram.common.session.UserSession r0 = r2.A01
            X.7Pr r5 = new X.7Pr
            r5.<init>(r0)
            com.instagram.common.session.UserSession r1 = r2.A01
            X.UXr r0 = r2.A05
            X.UYq r3 = new X.UYq
            r3.<init>()
            android.os.Bundle r2 = X.DbY.A09(r1)
            java.lang.String r1 = X.DDj.A00(r0)     // Catch:{ IOException -> 0x00c2 }
            java.lang.String r0 = "ARG_SERIALIZED_SURVEY_DATA"
            r2.putSerializable(r0, r1)     // Catch:{ IOException -> 0x00c2 }
            r3.setArguments(r2)
            r6.A0E(r3, r5)
            goto L_0x02c5
        L_0x00c2:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00c9:
            r0 = -659550492(0xffffffffd8b00ee4, float:-1.54862401E15)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r10.A02
            X.IaN r0 = (X.C57417IaN) r0
            androidx.viewpager.widget.ViewPager r1 = r0.A02
            r1.getClass()
            int r0 = r10.A01
            r1.setCurrentItem(r0)
            r0 = 1999090366(0x7727b2be, float:3.4013238E33)
            goto L_0x03b7
        L_0x00e3:
            java.lang.Object r3 = r10.A02
            X.TzX r3 = (X.C14625TzX) r3
            int r2 = r10.A01
            X.Vgn r1 = r3.A0A
            r0 = 1
            r1.A00(r0)
            r3.A08(r2, r0)
            return
        L_0x00f3:
            java.lang.Object r0 = r10.A02
            X.TzI r0 = (X.C14611TzI) r0
            int r2 = r10.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r1 = r0.A05
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r1.mImageViewPager
            r0.A0K(r2)
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A05(r11, r1)
            return
        L_0x0104:
            java.lang.Object r0 = r10.A02
            X.TzI r0 = (X.C14611TzI) r0
            int r3 = r10.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = r0.A05
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r2.mImageViewPager
            int r0 = r1.A08
            if (r0 == r3) goto L_0x0117
            r0 = 0
            r1.A0L(r3, r0)
            return
        L_0x0117:
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A0B(r2)
            return
        L_0x011b:
            r0 = 416773525(0x18d77595, float:5.5694925E-24)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r10.A02
            X.VWB r0 = (X.VWB) r0
            X.X1V r0 = r0.A02
            if (r0 == 0) goto L_0x016c
            int r1 = r10.A01
            X.WZs r0 = (X.C19444WZs) r0
            X.UbE r6 = r0.A00
            java.util.List r0 = r6.A0A
            if (r0 == 0) goto L_0x016c
            int r0 = r0.size()
            if (r0 <= r1) goto L_0x016c
            java.util.List r0 = r6.A0A
            X.1Xj r0 = X.DbZ.A0T(r0, r1)
            com.instagram.common.session.UserSession r4 = r6.A01
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            com.instagram.util.fragment.IgFragmentFactoryImpl r1 = com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            java.lang.String r0 = r0.getId()
            X.F3W r1 = r1.A03(r0)
            java.lang.String r0 = "story_sticker"
            r1.A0E = r0
            r0 = 1
            r1.A0N = r0
            android.os.Bundle r2 = r1.A00()
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            r0 = 192(0xc0, float:2.69E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.6W8 r0 = X.DbV.A0Y(r1, r2, r4, r3, r0)
            X.DbT.A1L(r6, r0)
        L_0x016c:
            r0 = -1847929717(0xffffffff91dad48b, float:-3.4525325E-28)
            goto L_0x03b7
        L_0x0171:
            r0 = 642903705(0x2651ee99, float:7.28348E-16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r10.A02
            X.UaE r0 = (X.C15307UaE) r0
            X.0eM r1 = r0.A04
            X.U8y r3 = X.C13990Tnq.A0T(r1)
            android.content.Context r0 = r11.getContext()
            X.0qQ.A07(r0)
            X.U8y r0 = X.C13990Tnq.A0T(r1)
            int r2 = r10.A01
            com.instagram.leadgen.organic.model.LeadGenFormData r0 = r0.A06
            java.util.ArrayList r0 = r0.A06
            java.lang.Object r0 = X.00k.A0O(r0, r2)
            com.instagram.leadgen.organic.model.LeadFormCustomQuestion r0 = (com.instagram.leadgen.organic.model.LeadFormCustomQuestion) r0
            if (r0 == 0) goto L_0x01ac
            X.Uwe r0 = r0.A00
        L_0x019d:
            X.Uwe r1 = X.C16534Uwe.MULTIPLE_CHOICE
            if (r0 == r1) goto L_0x01a3
            X.Uwe r1 = X.C16534Uwe.SHORT_ANSWER
        L_0x01a3:
            r0 = 0
            r3.A04(r1, r2, r0)
            r0 = 1979637832(0x75fee048, float:6.4618768E32)
            goto L_0x02c8
        L_0x01ac:
            r0 = 0
            goto L_0x019d
        L_0x01ae:
            r0 = -1609457966(0xffffffffa0119ed2, float:-1.2334527E-19)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r10.A02
            X.U9r r3 = (X.C14797U9r) r3
            X.U8p r2 = r3.A01
            java.util.ArrayList r1 = r2.A0D
            int r0 = r10.A01
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            com.instagram.leadgen.core.api.LeadForm r0 = (com.instagram.leadgen.core.api.LeadForm) r0
            r2.A01 = r0
            int r1 = r1.size()
            r0 = 0
            r3.notifyItemRangeChanged(r0, r1)
            r0 = -2041499944(0xffffffff86512ed8, float:-3.9342946E-35)
            goto L_0x03b7
        L_0x01d4:
            r0 = 292882397(0x117507dd, float:1.9329515E-28)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r10.A02
            X.UaN r0 = (X.C15315UaN) r0
            X.U8w r3 = r0.A02()
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r11)
            X.U8w r1 = r0.A02()
            int r2 = r10.A01
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x0210
            X.UnY r1 = (X.C16045UnY) r1
            com.instagram.leadgen.organic.model.LeadGenFormData r0 = r1.A04
            java.util.ArrayList r0 = r0.A06
            java.lang.Object r0 = X.00k.A0O(r0, r2)
            com.instagram.leadgen.organic.model.LeadFormCustomQuestion r0 = (com.instagram.leadgen.organic.model.LeadFormCustomQuestion) r0
            if (r0 == 0) goto L_0x020e
            X.Uwe r0 = r0.A00
        L_0x0201:
            X.Uwe r1 = X.C16534Uwe.MULTIPLE_CHOICE
            if (r0 != r1) goto L_0x0231
        L_0x0205:
            r0 = 0
            r3.A0A(r4, r1, r2, r0)
            r0 = -218406224(0xfffffffff2fb62b0, float:-9.9584055E30)
            goto L_0x03b7
        L_0x020e:
            r0 = 0
            goto L_0x0201
        L_0x0210:
            X.UnZ r1 = (X.C16046UnZ) r1
            com.instagram.business.promote.model.PromoteData r0 = r1.A02
            java.util.List r0 = r0.A1t
            X.0qQ.A06(r0)
            java.lang.Object r0 = X.00k.A0O(r0, r2)
            X.GSY r0 = (X.GSY) r0
            r1 = 1
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0231
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r1) goto L_0x0231
            X.Uwe r1 = X.C16534Uwe.MULTIPLE_CHOICE
            goto L_0x0205
        L_0x0231:
            X.Uwe r1 = X.C16534Uwe.SHORT_ANSWER
            goto L_0x0205
        L_0x0234:
            r0 = -354873154(0xffffffffead910be, float:-1.3120798E26)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r10.A02
            X.U9q r3 = (X.C14796U9q) r3
            X.U8o r2 = r3.A01
            java.util.ArrayList r1 = r2.A0D
            int r0 = r10.A01
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            com.instagram.leadgen.core.api.LeadForm r0 = (com.instagram.leadgen.core.api.LeadForm) r0
            r2.A01 = r0
            int r1 = r1.size()
            r0 = 0
            r3.notifyItemRangeChanged(r0, r1)
            r0 = 1427198668(0x551152cc, float:9.9865497E12)
            goto L_0x03b7
        L_0x025a:
            r0 = -1533051804(0xffffffffa49f7c64, float:-6.9165984E-17)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r10.A02
            X.Ums r0 = (X.C16011Ums) r0
            int r3 = r10.A01
            X.0eM r0 = r0.A07
            java.lang.Object r2 = r0.getValue()
            X.JgX r2 = (X.C60152JgX) r2
            X.VSn r0 = r2.A00
            if (r0 == 0) goto L_0x0291
            java.util.List r0 = r0.A01
            int r0 = r0.size()
        L_0x0279:
            if (r3 >= r0) goto L_0x028d
            X.VSn r0 = r2.A00
            if (r0 == 0) goto L_0x028d
            java.util.List r0 = r0.A01
            X.VSn r1 = new X.VSn
            r1.<init>(r0, r3)
            r2.A00 = r1
            X.05G r0 = r2.A03
            r0.Epw(r1)
        L_0x028d:
            r0 = 873691708(0x34137a3c, float:1.373491E-7)
            goto L_0x02c8
        L_0x0291:
            r0 = 0
            goto L_0x0279
        L_0x0293:
            java.lang.String r1 = r3.BW8()
            r5 = 0
            if (r1 != 0) goto L_0x02cc
        L_0x029a:
            r5 = -1
        L_0x029b:
            r1 = 0
        L_0x029c:
            r0 = 0
            X.02V.A07(r1, r0)
            com.instagram.common.session.UserSession r3 = r2.A01
            X.UXr r1 = r2.A05
            java.util.HashMap r0 = r2.A07
            X.UbP r3 = X.C15371UbP.A00(r3, r1, r0, r5)
            X.7Pu r0 = r2.A04
            r3.A04 = r0
            com.instagram.common.session.UserSession r0 = r2.A01
            X.7Pr r1 = new X.7Pr
            r1.<init>(r0)
            X.UXr r0 = r2.A05
            java.lang.String r0 = r0.A03
            r1.A0d = r0
            r0 = 0
            r1.A1C = r0
            r1.A0T = r3
            X.7Pu r0 = r2.A04
            r0.A0F(r3, r1)
        L_0x02c5:
            r0 = -1770995867(0xffffffff9670bf65, float:-1.9447439E-25)
        L_0x02c8:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x02cc:
            X.VjL r0 = r2.A02
            int r0 = r0.A00()
            if (r5 >= r0) goto L_0x029a
            X.VjL r0 = r2.A02
            X.VjZ r0 = r0.A01(r5)
            X.UNc r0 = r0.A03
            java.lang.String r0 = r0.A03
            r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02eb
            r1 = 1
            if (r5 >= 0) goto L_0x029c
            goto L_0x029b
        L_0x02eb:
            int r5 = r5 + 1
            goto L_0x02cc
        L_0x02ee:
            r0 = 408392977(0x18579511, float:2.7863358E-24)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r10.A02
            X.U9p r0 = (X.C14795U9p) r0
            X.0sP r1 = r0.A01
            int r0 = r10.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r0)
            r0 = -40829788(0xfffffffffd90fca4, float:-2.4090077E37)
            goto L_0x03b7
        L_0x0309:
            r0 = 1997385765(0x770db025, float:2.8737754E33)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r10.A02
            X.UAG r0 = (X.UAG) r0
            X.30x r1 = r0.A03
            int r0 = r10.A01
            X.C2357130x.A01(r1, r0)
            r0 = 744052700(0x2c5957dc, float:3.0886326E-12)
            goto L_0x03b7
        L_0x0320:
            r0 = 1950524496(0x7442a450, float:6.1684463E31)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r10.A02
            X.UZK r4 = (X.UZK) r4
            X.WGU r6 = r4.A00
            if (r6 != 0) goto L_0x0339
            java.lang.String r3 = "logger"
        L_0x0331:
            X.0qQ.A0F(r3)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0339:
            X.UzE r2 = X.C16678UzE.AD_PREVIEW_TEMPLATE_SELECTION
            java.util.List r0 = r4.A01
            java.lang.String r3 = "listOfPreviewInfo"
            if (r0 == 0) goto L_0x0331
            int r1 = r10.A01
            java.lang.Object r0 = r0.get(r1)
            X.VXm r0 = (X.C17485VXm) r0
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x037a
            r6.A0F(r2, r0)
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x0331
            java.lang.Object r0 = r0.get(r1)
            X.VXm r0 = (X.C17485VXm) r0
            java.lang.String r3 = r0.A03
            if (r3 == 0) goto L_0x0376
            X.Vl8 r1 = X.C13990Tnq.A0N()
            X.0eM r2 = r4.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            r4.requireActivity()
            X.R8Q r1 = r1.A00(r0, r3)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.Dbc.A0S(r1, r0, r2)
        L_0x0376:
            r0 = -616243583(0xffffffffdb44de81, float:-5.5413741E16)
            goto L_0x03b7
        L_0x037a:
            java.lang.String r0 = "the webview preview title cannot be null"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 475158026(0x1c52560a, float:6.9594374E-22)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r1
        L_0x0388:
            r0 = -148782948(0xfffffffff721c09c, float:-3.280728E33)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r10.A02
            X.UA1 r4 = (X.UA1) r4
            int r3 = r10.A01
            r4.A00 = r3
            java.util.List r2 = r4.A06
            int r1 = r2.size()
            r0 = 0
            r4.notifyItemRangeChanged(r0, r1)
            com.instagram.business.promote.model.PromoteData r1 = r4.A04
            java.lang.Object r0 = r2.get(r3)
            com.instagram.leadgen.core.api.LeadForm r0 = (com.instagram.leadgen.core.api.LeadForm) r0
            r1.A16 = r0
            X.WGU r2 = r4.A03
            X.UzE r1 = X.C16678UzE.LEAD_FORM_LIST
            java.lang.String r0 = "lead_form_radio_button"
            r2.A0F(r1, r0)
            r0 = -1646012602(0xffffffff9de3d746, float:-6.0308987E-21)
        L_0x03b7:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WB1.onClick(android.view.View):void");
    }
}
