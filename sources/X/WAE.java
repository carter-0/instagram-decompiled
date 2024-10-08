package X;

import android.view.View;

public final class WAE implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public WAE(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A07 = obj4;
        this.A04 = obj5;
        this.A05 = obj7;
        this.A06 = obj3;
        this.A03 = obj6;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
        r3.A13(r7, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0166, code lost:
        if (r12.A06 != false) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02b8 A[LOOP:3: B:118:0x02b2->B:120:0x02b8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x02d3;
                case 1: goto L_0x012d;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = 218714664(0xd095228, float:4.2315276E-31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A04
            X.X1a r3 = (X.C20848X1a) r3
            java.lang.Object r5 = r0.A07
            com.instagram.user.model.Product r5 = (com.instagram.user.model.Product) r5
            java.lang.Object r4 = r0.A06
            X.VkR r4 = (X.C18043VkR) r4
            X.Wc0 r3 = (X.C19576Wc0) r3
            int r2 = r3.A00
            switch(r2) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x006c;
                case 2: goto L_0x00ef;
                default: goto L_0x0021;
            }
        L_0x0021:
            r7 = 0
            X.0qQ.A0B(r5, r7)
            java.lang.Object r6 = r3.A01
            X.Uai r6 = (X.C15333Uai) r6
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            r2 = 1002(0x3ea, float:1.404E-42)
            r3.setResult(r2)
            X.0eM r2 = r6.A0A
            java.lang.Object r2 = r2.getValue()
            X.U8r r2 = (X.C14781U8r) r2
            r2.A01(r4, r5, r7)
        L_0x003d:
            java.lang.Object r7 = r0.A01
            X.Glc r7 = (X.C53290Glc) r7
            if (r7 == 0) goto L_0x0062
            java.lang.Object r6 = r0.A02
            X.JZA r6 = (X.JZA) r6
            if (r6 == 0) goto L_0x0062
            java.lang.Object r2 = r0.A05
            X.UEF r2 = (X.UEF) r2
            com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton r4 = r2.A08
            java.lang.Object r3 = r0.A03
            android.content.Context r3 = (android.content.Context) r3
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0069
            int r2 = r7.A02
        L_0x0059:
            java.lang.String r0 = r5.A0J
            java.lang.String r0 = X.DbW.A0h(r3, r0, r2)
            X.2eQ.A07(r4, r0)
        L_0x0062:
            r0 = -1017622619(0xffffffffc3584fa5, float:-216.31111)
        L_0x0065:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x0069:
            int r2 = r7.A01
            goto L_0x0059
        L_0x006c:
            r2 = 0
            X.0qQ.A0B(r5, r2)
            boolean r6 = r5.A0Q
            java.lang.Object r2 = r3.A01
            X.Uar r2 = (X.C15341Uar) r2
            if (r6 != 0) goto L_0x00e6
            X.Uxb r8 = r2.A06
            if (r8 != 0) goto L_0x0086
            java.lang.String r0 = "surface"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0086:
            X.Uxb r4 = X.C16581Uxb.SHOPPING_MANAGER
            X.3kF r3 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r7 = r2.requireActivity()
            X.0eM r2 = r2.A0M
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
            if (r8 != r4) goto L_0x00dc
            X.E5t r4 = new X.E5t
            r4.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r2 = "product"
            r3.putParcelable(r2, r5)
            r4.setArguments(r3)
            com.instagram.api.schemas.UntaggableReason r2 = r5.A06
            if (r2 == 0) goto L_0x003d
            X.7Pr r3 = new X.7Pr
            r3.<init>(r6)
            java.lang.String r2 = r2.A04
            r3.A0d = r2
            r3.A0T = r4
            X.7Pu r2 = r3.A00()
            r2.A02(r7, r4)
            goto L_0x003d
        L_0x00c0:
            r2 = 0
            X.0qQ.A0B(r5, r2)
            boolean r6 = r5.A0Q
            java.lang.Object r2 = r3.A01
            X.UAC r2 = (X.UAC) r2
            X.Vfu r2 = r2.A02
            if (r6 != 0) goto L_0x00e1
            X.3kF r3 = X.C249713kF.A00
            X.Uan r2 = r2.A00
            androidx.fragment.app.FragmentActivity r7 = r2.requireActivity()
            X.0eM r2 = r2.A0N
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
        L_0x00dc:
            r3.A13(r7, r6, r5)
            goto L_0x003d
        L_0x00e1:
            r2.A00(r4, r5)
            goto L_0x003d
        L_0x00e6:
            X.U8q r2 = X.C13990Tnq.A0X(r2)
            r2.A01(r4, r5)
            goto L_0x003d
        L_0x00ef:
            r2 = 0
            X.0qQ.A0B(r5, r2)
            r17 = 1
            com.instagram.api.schemas.ProductReviewStatus r10 = r5.A05
            com.instagram.api.schemas.ProductReviewStatus r2 = com.instagram.api.schemas.ProductReviewStatus.REJECTED
            if (r10 != r2) goto L_0x0116
            X.3kF r6 = X.C249713kF.A00
            java.lang.Object r13 = r3.A01
            X.Uaj r13 = (X.C15334Uaj) r13
            androidx.fragment.app.FragmentActivity r9 = r13.requireActivity()
            X.0eM r2 = r13.A0G
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r2)
            r7 = 0
            java.lang.String r15 = r5.A0H
            r8 = r7
            r12 = r7
            r14 = r7
            r16 = r7
            r6.A1K(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0116:
            java.lang.Object r6 = r3.A01
            X.Uaj r6 = (X.C15334Uaj) r6
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            r2 = 1002(0x3ea, float:1.404E-42)
            r3.setResult(r2)
            X.U8g r3 = X.C15334Uaj.A00(r6)
            r2 = 0
            r3.A00(r2, r4, r5)
            goto L_0x003d
        L_0x012d:
            r1 = 701547952(0x29d0c5b0, float:9.271349E-14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r11 = r0.A06
            X.VjZ r11 = (X.C17997VjZ) r11
            java.lang.Object r10 = r0.A05
            X.VjL r10 = (X.C17983VjL) r10
            java.lang.Object r12 = r0.A07
            X.ViI r12 = (X.C17927ViI) r12
            int r2 = r12.A01
            X.VjZ r2 = r10.A01(r2)
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x0151
            r0 = -292778620(0xffffffffee8c8d84, float:-2.1749492E28)
            goto L_0x0065
        L_0x0151:
            java.lang.Integer r3 = r12.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r3 != r2) goto L_0x0168
            X.BHk r2 = r10.A00
            java.lang.Integer r2 = r2.A05
            if (r2 == 0) goto L_0x0168
            int r2 = r2.intValue()
            if (r2 == 0) goto L_0x0168
            boolean r3 = r12.A06
            r2 = 1
            if (r3 == 0) goto L_0x0169
        L_0x0168:
            r2 = 0
        L_0x0169:
            r6 = 0
            if (r2 == 0) goto L_0x017d
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            r2 = 2131961755(0x7f13279b, float:1.9560216E38)
            java.lang.String r0 = "error_message_reel_preview"
            X.C59689JTv.A01(r3, r0, r2, r6)
            r0 = -1867008461(0xffffffff90b7b633, float:-7.2461495E-29)
            goto L_0x0065
        L_0x017d:
            boolean r2 = r11.A01
            if (r2 == 0) goto L_0x019a
            boolean r2 = r12.A05
            if (r2 != 0) goto L_0x019a
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            r2 = 2131961753(0x7f132799, float:1.9560212E38)
            r0 = 3068(0xbfc, float:4.299E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C59689JTv.A01(r3, r0, r2, r6)
            r0 = 265842930(0xfd870f2, float:2.134275E-29)
            goto L_0x0065
        L_0x019a:
            X.UNc r2 = r11.A03
            com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES r3 = r2.A00
            com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES r2 = com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES.MULTIPLE
            boolean r8 = X.AnonymousClass7TF.A1W(r3, r2)
            if (r8 == 0) goto L_0x01fa
            java.lang.Object r2 = r0.A02
            X.VSD r2 = (X.VSD) r2
            X.XAm r2 = r2.A01
            java.lang.Boolean r2 = r2.Bwb()
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            boolean r2 = X.0qQ.A0K(r2, r4)
            if (r2 != 0) goto L_0x01fa
            X.0eM r2 = r11.A04
            java.util.List r2 = X.JTO.A15(r2)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r2.iterator()
        L_0x01c9:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0213
            java.lang.Object r3 = r5.next()
            r2 = r3
            X.VSD r2 = (X.VSD) r2
            boolean r2 = r2.A00
            if (r2 == 0) goto L_0x01c9
            r7.add(r3)
            goto L_0x01c9
        L_0x01de:
            java.util.Iterator r3 = r7.iterator()
        L_0x01e2:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x021d
            java.lang.Object r2 = r3.next()
            X.VSD r2 = (X.VSD) r2
            X.XAm r2 = r2.A01
            java.lang.Boolean r2 = r2.Bwb()
            boolean r2 = X.0qQ.A0K(r2, r4)
            if (r2 == 0) goto L_0x01e2
        L_0x01fa:
            X.0eM r2 = r11.A04
            java.util.List r2 = X.JTO.A15(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x0204:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x021d
            java.lang.Object r2 = r3.next()
            X.VSD r2 = (X.VSD) r2
            r2.A00 = r6
            goto L_0x0204
        L_0x0213:
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L_0x01de
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x01de
        L_0x021d:
            java.lang.Object r7 = r0.A02
            X.VSD r7 = (X.VSD) r7
            boolean r2 = r7.A00
            r2 = r2 ^ 1
            r7.A00 = r2
            X.XAm r5 = r7.A01
            java.lang.String r2 = r5.BW8()
            java.lang.String r4 = "thank_you_screen"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0238
            r2 = 1
            r11.A02 = r2
        L_0x0238:
            if (r8 != 0) goto L_0x026e
            X.BHk r3 = r10.A00
            java.lang.Boolean r2 = r3.A04
            if (r2 == 0) goto L_0x025b
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x025b
            boolean r2 = r11.A02
            if (r2 == 0) goto L_0x0254
            java.lang.Boolean r2 = r3.A03
            if (r2 == 0) goto L_0x0254
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x025b
        L_0x0254:
            java.lang.Object r2 = r0.A03
            X.2p9 r2 = (X.C230202p9) r2
            r2.DFm(r10, r12)
        L_0x025b:
            boolean r2 = r11.A01
            if (r2 != 0) goto L_0x026e
            boolean r2 = r11.A02
            if (r2 != 0) goto L_0x026e
            int r2 = r12.A01
            int r2 = r2 + 1
            int r2 = X.W2c.A00(r10, r7, r2)
            r12.A00(r2)
        L_0x026e:
            java.lang.Object r9 = r0.A04
            X.UE4 r9 = (X.UE4) r9
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.2eb r2 = r9.A03
            android.view.View r3 = r2.A01()
            boolean r2 = r7.A00
            if (r2 != 0) goto L_0x0284
            boolean r2 = r11.A01()
            if (r2 == 0) goto L_0x0285
        L_0x0284:
            r6 = 1
        L_0x0285:
            r3.setActivated(r6)
            if (r8 != 0) goto L_0x02c2
            boolean r2 = r11.A02
            if (r2 == 0) goto L_0x029a
            X.BHk r2 = r10.A00
            java.lang.Boolean r2 = r2.A03
            if (r2 == 0) goto L_0x02a4
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x02a4
        L_0x029a:
            java.lang.String r2 = r5.BW8()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x02c2
        L_0x02a4:
            java.lang.Object r0 = r0.A03
            X.2p9 r0 = (X.C230202p9) r0
            r0.DFo(r10, r12)
        L_0x02ab:
            r3 = 2
            java.util.Set r0 = r12.A08
            java.util.Iterator r2 = r0.iterator()
        L_0x02b2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ce
            java.lang.Object r0 = r2.next()
            X.X4L r0 = (X.X4L) r0
            r0.DbF(r12, r3)
            goto L_0x02b2
        L_0x02c2:
            java.lang.Object r7 = r0.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r8 = r0.A03
            X.2p9 r8 = (X.C230202p9) r8
            X.W2c.A03(r7, r8, r9, r10, r11, r12)
            goto L_0x02ab
        L_0x02ce:
            r0 = -483790162(0xffffffffe329f2ae, float:-3.1349867E21)
            goto L_0x0065
        L_0x02d3:
            r1 = -333551501(0xffffffffec1e6873, float:-7.660141E26)
            r3 = r19
            int r1 = X.DbX.A03(r3, r1)
            r2 = 43
            X.Ing r8 = new X.Ing
            r8.<init>(r3, r2)
            java.lang.Object r3 = r0.A07
            X.HqX r3 = (X.C55966HqX) r3
            X.310 r2 = r3.A01
            X.JOB r4 = r2.BRC()
            java.lang.Object r5 = r0.A04
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r6 = r0.A05
            X.3W1 r6 = (X.AnonymousClass3W1) r6
            java.lang.Object r2 = r0.A06
            X.3ha r2 = (X.C248203ha) r2
            int r9 = r2.A01
            java.lang.Object r2 = r0.A03
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.String r7 = r2.getModuleName()
            r4.DNR(r5, r6, r7, r8, r9)
            X.0q2 r2 = r3.A02
            boolean r3 = r2.A0N(r5)
            java.lang.Object r5 = r0.A02
            android.content.Context r5 = (android.content.Context) r5
            r2 = 2131975946(0x7f135f0a, float:1.9588999E38)
            if (r3 == 0) goto L_0x0318
            r2 = 2131964944(0x7f133410, float:1.9566684E38)
        L_0x0318:
            java.lang.String r4 = X.C51967G9n.A0p(r5, r2)
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            r2 = 750(0x2ee, double:3.705E-321)
            X.2eQ.A06(r0, r2)
            X.C59689JTv.A09(r5, r4)
            r0 = 2035843314(0x795880f2, float:7.0259465E34)
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WAE.onClick(android.view.View):void");
    }
}
