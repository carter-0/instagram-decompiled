package X;

import android.view.View;

/* renamed from: X.Oib  reason: case insensitive filesystem */
public final class C71330Oib implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C71330Oib(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x014f, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0156, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x018b, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x018e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r24) {
        /*
            r23 = this;
            r7 = r23
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0105;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0057;
                case 4: goto L_0x0036;
                case 5: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            r0 = 1294562995(0x4d2976b3, float:1.77695536E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r7.A01
            X.4mT r1 = (X.C273374mT) r1
            com.instagram.common.session.UserSession r6 = r1.getSession()
            r1 = 2
            X.PdB r5 = new X.PdB
            r2 = r24
            r5.<init>(r1, r7, r2)
            r1 = 0
            X.0qQ.A0B(r6, r1)
            X.MoQ r4 = X.O4T.A00
            X.61K r3 = X.AnonymousClass61K.IGD_REVERB
            r2 = 33
            X.PqR r1 = new X.PqR
            r1.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r6)
            r4.A02(r6, r3, r1)
            r1 = -271810254(0xffffffffefcc8132, float:-1.2658226E29)
            goto L_0x018b
        L_0x0036:
            r0 = 1220231215(0x48bb402f, float:383489.47)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r7.A01
            X.NMJ r1 = (X.NMJ) r1
            java.lang.String r5 = r7.A02
            X.16V r4 = r1.A0G
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r2 = r1.A00
            boolean r6 = r1.A0I
            boolean r7 = r1.A0J
            boolean r8 = r1.A03
            X.Pul r3 = r1.A0F
            X.ORB.A01(r2, r3, r4, r5, r6, r7, r8)
            r1 = -2128072378(0xffffffff81283146, float:-3.089208E-38)
            goto L_0x018b
        L_0x0057:
            r0 = 175596777(0xa7764e9, float:1.19115965E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r7.A01
            X.PMS r1 = (X.PMS) r1
            X.O9u r2 = r1.A03()
            android.view.View r1 = r1.A03
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r1)
            java.lang.String r4 = r7.A02
            r14 = 1
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            X.Neh r1 = r2.A00
            com.instagram.common.session.UserSession r2 = r1.A06
            r1 = 34
            java.lang.String r1 = X.Pxd.A00(r1)
            java.lang.String r22 = X.SQU.A01(r5, r1)
            r7 = 0
            r9 = 0
            com.instagram.simplewebview.SimpleWebViewConfig r6 = new com.instagram.simplewebview.SimpleWebViewConfig
            r8 = r7
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r15 = r9
            r16 = r9
            r17 = r14
            r18 = r9
            r19 = r9
            r20 = r9
            r21 = r4
            r6.<init>((java.lang.String) r7, (java.lang.String) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (java.lang.String) r21, (java.lang.String) r22)
            r3.A02(r5, r2, r6)
            r1 = 1547337550(0x5c3a7f4e, float:2.09977275E17)
            goto L_0x018b
        L_0x00a0:
            r0 = 1087145666(0x40cc86c2, float:6.39145)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r7.A01
            X.NKE r2 = (X.NKE) r2
            X.0eM r1 = r2.A0Q
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            java.lang.String r5 = r2.A0N
            java.lang.String r6 = r7.A02
            r2 = 0
            r7 = 0
            r4 = r2
            X.C71110Ocp.A01(r1, r2, r3, r4, r5, r6, r7)
            r1 = -351369611(0xffffffffeb0e8675, float:-1.7230242E26)
            goto L_0x018b
        L_0x00c4:
            r0 = 1757199794(0x68bcbdb2, float:7.130433E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r7.A01
            X.NIz r8 = (X.C68461NIz) r8
            X.OSj r3 = r8.A00
            if (r3 != 0) goto L_0x00d6
            java.lang.String r5 = "logger"
            goto L_0x014f
        L_0x00d6:
            java.lang.String r2 = "boost_again"
            java.lang.String r1 = "ad_action_type"
            java.util.Map r2 = X.AnonymousClass7TF.A0w(r1, r2)
            java.lang.String r1 = "igd_campaign_card_action_button_click"
            X.C70936OSj.A00(r3, r1, r2)
            X.1Yh r6 = X.C18138VmE.A00()
            X.1Yg r5 = X.VA4.A00()
            java.lang.String r4 = r7.A02
            X.0eM r1 = r8.A04
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            java.lang.String r1 = "inbox_campaign_message_list"
            X.W29 r1 = r5.A00(r2, r3, r4, r1)
            r6.A0B(r1)
            r1 = 376863372(0x16767a8c, float:1.9910391E-25)
            goto L_0x018b
        L_0x0105:
            r0 = 1022947298(0x3cf8efe2, float:0.030387823)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r7.A01
            X.NJ4 r4 = (X.NJ4) r4
            X.Mtz r1 = r4.A02
            java.lang.String r5 = "viewModel"
            r3 = 0
            if (r1 == 0) goto L_0x014f
            X.0eM r1 = r1.A07
            java.lang.Object r8 = r1.getValue()
            X.2Ep r8 = (X.AnonymousClass2Ep) r8
            if (r8 == 0) goto L_0x0188
            java.lang.String r2 = r7.A02
            X.Mtz r7 = r4.A02
            if (r7 == 0) goto L_0x014f
            X.0eM r1 = r7.A07
            java.lang.Object r6 = r1.getValue()
            X.2Ep r6 = (X.AnonymousClass2Ep) r6
            r5 = 20
            X.PqQ r1 = new X.PqQ
            r1.<init>(r7, r5)
            X.C67746Mtz.A00(r6, r1)
            java.util.List r1 = r8.BRZ()
            java.util.ArrayList r10 = X.AnonymousClass48M.A01(r1)
            java.lang.String r1 = r8.C6C()
            X.3t1 r6 = X.C66662MaV.A00(r1, r10)
            java.lang.String r8 = r4.A09
            if (r8 != 0) goto L_0x0157
            java.lang.String r5 = "promptTitle"
        L_0x014f:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0157:
            java.lang.String r9 = r4.A06
            if (r9 != 0) goto L_0x015e
            java.lang.String r5 = "collectionId"
            goto L_0x014f
        L_0x015e:
            java.lang.String r1 = r4.A07
            if (r1 != 0) goto L_0x0165
            java.lang.String r5 = "collectionType"
            goto L_0x014f
        L_0x0165:
            com.instagram.direct.prompts.DirectPromptTypes r1 = X.AnonymousClass79B.A01(r1)
            int r1 = r1.A00
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            com.instagram.model.direct.DirectShareTarget r5 = new com.instagram.model.direct.DirectShareTarget
            r5.<init>((X.C254783t2) r6, (java.lang.Integer) r7, (java.lang.String) r8, (java.lang.String) r9, (java.util.List) r10)
            X.0eM r1 = r4.A0D
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.7Zi r1 = X.C333527Zh.A00(r1)
            r1.A0H(r5, r3, r2)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r4.A04
            if (r1 == 0) goto L_0x0188
            X.DbS.A1T(r1)
        L_0x0188:
            r1 = -1113003298(0xffffffffbda8eade, float:-0.08247922)
        L_0x018b:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71330Oib.onClick(android.view.View):void");
    }
}
