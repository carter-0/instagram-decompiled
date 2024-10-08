package X;

import android.view.View;

/* renamed from: X.LXi  reason: case insensitive filesystem */
public final class C64256LXi implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C64256LXi(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A00 = i;
        this.A04 = obj4;
        this.A05 = str;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
        this.A06 = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x0032;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -677377772(0xffffffffd7a00914, float:-3.51921701E14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A04
            X.3kF r3 = (X.C249713kF) r3
            java.lang.Object r4 = r15.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r5 = r15.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r6 = r15.A06
            java.lang.Object r0 = r15.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
            java.lang.String r7 = r0.getModuleName()
            java.lang.String r10 = r15.A05
            java.lang.String r8 = "tags"
            r9 = 0
            r11 = r9
            r3.A1C(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -688680390(0xffffffffd6f3923a, float:-1.33904682E14)
        L_0x002e:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0032:
            r0 = -1811711415(0xffffffff94037a49, float:-6.637926E-27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A03
            X.4qU r3 = (X.C275524qU) r3
            java.lang.String r0 = r3.B1U()
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = r3.B1V()
            if (r0 == 0) goto L_0x0091
            java.lang.String r1 = r3.B1U()
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L_0x0214
            java.lang.String r7 = r3.B1V()
            if (r7 == 0) goto L_0x021c
            java.lang.Object r6 = r15.A04
            X.4qU r6 = (X.C275524qU) r6
            java.lang.String r5 = r15.A05
            java.lang.Object r4 = r15.A02
            X.6ap r3 = X.DbS.A0a()
            r0 = 5000(0x1388, float:7.006E-42)
            r3.A01 = r0
            r3.A0D = r1
            r3.A02()
            r1 = 1
            r3.A0L = r1
            r3.A0R = r1
            java.lang.String r0 = r6.getText()
            r3.A0D(r0)
            r3.A0J = r1
            X.IVV r0 = new X.IVV
            r0.<init>(r6, r4, r5, r1)
            r3.A0A = r0
            java.lang.Integer r0 = X.C14091Tpi.A05(r7)
            if (r0 == 0) goto L_0x008e
            int r0 = r0.intValue()
            r3.A07(r0)
        L_0x008e:
            X.DbY.A1N(r3)
        L_0x0091:
            java.lang.Object r1 = r15.A01
            X.2pz r1 = (X.C230662pz) r1
            java.lang.String r0 = r15.A06
            r1.A01(r0)
            java.lang.Object r1 = r15.A02
            X.JR4 r1 = (X.JR4) r1
            java.lang.String r0 = r15.A05
            r1.Ck7(r0)
            r0 = 1279479594(0x4c434f2a, float:5.1199144E7)
            goto L_0x002e
        L_0x00a7:
            r0 = 528526780(0x1f80adbc, float:5.449753E-20)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A04
            X.K0X r5 = (X.K0X) r5
            java.lang.Integer r0 = r5.A03
            java.lang.String r14 = "shareType"
            if (r0 == 0) goto L_0x0169
            int r6 = r0.intValue()
            java.lang.String r2 = "externalShareBottomSheetController"
            java.lang.String r1 = "Required value was null."
            r4 = 1
            r0 = 0
            if (r6 == r0) goto L_0x019f
            if (r6 == r4) goto L_0x019f
            r0 = 2
            if (r6 != r0) goto L_0x0147
            X.OTD r12 = r5.A02
            if (r12 == 0) goto L_0x01fc
            android.content.Context r13 = r5.requireContext()
            java.lang.Object r11 = r15.A01
            X.2Ep r11 = (X.AnonymousClass2Ep) r11
            java.lang.Object r10 = r15.A02
            if (r10 == 0) goto L_0x0209
            java.lang.Object r0 = r15.A03
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r0)
            X.1a8 r9 = r5.A06
            r0 = 30
            X.Phg r8 = new X.Phg
            r8.<init>(r0, r11, r5)
            r0 = 16
            X.Ple r7 = new X.Ple
            r7.<init>(r5, r0)
            r0 = 4
            X.0qQ.A0B(r9, r0)
            X.4fh r6 = X.C318146oT.A00
            r1 = 8
            X.Oxd r0 = new X.Oxd
            r0.<init>(r1, r13, r10, r12)
            X.1aU r6 = X.1aU.A07(r0, r6)
            r0 = 45
            X.PqR r1 = new X.PqR
            r1.<init>((int) r0, (java.lang.Object) r11, (java.lang.Object) r12)
            r10 = 68
            X.Owf r0 = new X.Owf
            r0.<init>((int) r10, (X.0sP) r1)
            X.1aU r6 = r6.A0M(r0)
            if (r2 == 0) goto L_0x0138
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0138
            X.1aU r2 = X.OTD.A00(r11, r12, r2)
            if (r2 == 0) goto L_0x0138
            r0 = 13
            X.PmD r1 = new X.PmD
            r1.<init>(r2, r0)
            X.Owf r0 = new X.Owf
            r0.<init>((int) r10, (X.0sP) r1)
            X.1aU r1 = r6.A0K(r0)
            X.4fh r0 = X.C318146oT.A01
            X.1aU r6 = r1.A0P(r0)
        L_0x0138:
            r0 = 10
            X.PU7 r1 = new X.PU7
            r1.<init>(r8, r0)
            X.M4C r0 = new X.M4C
            r0.<init>(r7)
        L_0x0144:
            r9.A03(r6, r1, r0)
        L_0x0147:
            java.lang.String r6 = r15.A06
            java.lang.Integer r1 = r5.A03
            if (r1 == 0) goto L_0x0169
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0198
            java.lang.Object r0 = r15.A03
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.text.Editable r0 = r0.getText()
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 > 0) goto L_0x0163
            r4 = 0
        L_0x0163:
            X.0wc r1 = r5.A00
            if (r1 != 0) goto L_0x0171
            java.lang.String r14 = "logger"
        L_0x0169:
            X.0qQ.A0F(r14)
        L_0x016c:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0171:
            java.lang.String r0 = "direct_external_share_sheet_share_click"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "thread_id"
            r2.AAJ(r0, r6)
            java.lang.Integer r0 = r5.A03
            if (r0 == 0) goto L_0x0169
            java.lang.String r1 = X.C63257Ku2.A00(r0)
            java.lang.String r0 = "share_type"
            java.lang.Boolean r1 = X.JTP.A0g(r2, r0, r1, r4)
            java.lang.String r0 = "has_additional_text"
            r2.A7p(r0, r1)
            r2.Cgf()
        L_0x0198:
            r0 = -1438512101(0xffffffffaa420c1b, float:-1.7234861E-13)
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x019f:
            java.lang.String r6 = r15.A05
            if (r6 == 0) goto L_0x0201
            X.OTD r10 = r5.A02
            if (r10 == 0) goto L_0x01fc
            java.lang.Object r1 = r15.A01
            java.lang.Object r0 = r15.A03
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r0)
            X.1a8 r9 = r5.A06
            r0 = 29
            X.Phg r8 = new X.Phg
            r8.<init>(r0, r1, r5)
            r0 = 15
            X.Ple r7 = new X.Ple
            r7.<init>(r5, r0)
            r0 = 3
            X.0qQ.A0B(r9, r0)
            java.lang.String[] r0 = new java.lang.String[]{r6}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            if (r2 == 0) goto L_0x01d2
            r0.add(r2)
        L_0x01d2:
            X.1aU r6 = X.1aU.A08(r0)
            r0 = 46
            X.PqR r2 = new X.PqR
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r10)
            r1 = 68
            X.Owf r0 = new X.Owf
            r0.<init>((int) r1, (X.0sP) r2)
            X.1aU r1 = r6.A0K(r0)
            X.4fh r0 = X.C318146oT.A01
            X.1aU r6 = r1.A0P(r0)
            r0 = 11
            X.PU7 r1 = new X.PU7
            r1.<init>(r8, r0)
            X.M4D r0 = new X.M4D
            r0.<init>(r7)
            goto L_0x0144
        L_0x01fc:
            X.0qQ.A0F(r2)
            goto L_0x016c
        L_0x0201:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r1)
            r0 = -69598942(0xfffffffffbda0122, float:-2.2638874E36)
            goto L_0x0210
        L_0x0209:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r1)
            r0 = 514588503(0x1eabff57, float:1.8210935E-20)
        L_0x0210:
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r1
        L_0x0214:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = -1138039872(0xffffffffbc2ae3c0, float:-0.010430276)
            goto L_0x0223
        L_0x021c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = -63919120(0xfffffffffc30abf0, float:-3.6693262E36)
        L_0x0223:
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64256LXi.onClick(android.view.View):void");
    }
}
