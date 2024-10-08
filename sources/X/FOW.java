package X;

import android.view.View;

public final class FOW implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public FOW(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A03 = obj7;
        this.A07 = obj5;
        this.A02 = obj6;
        this.A04 = obj2;
        this.A01 = obj;
        this.A05 = obj3;
        this.A06 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02f0, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02f3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x02ae;
                case 1: goto L_0x026b;
                case 2: goto L_0x006a;
                case 3: goto L_0x01e2;
                case 4: goto L_0x014e;
                case 5: goto L_0x00a1;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = 2057523043(0x7aa34f63, float:4.2397727E35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A05
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r7 = r0.A07
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.1Xj r4 = r2.A1e(r7)
            java.lang.Object r6 = r0.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            X.2EG r10 = X.2EG.A3M
            java.lang.Object r9 = r0.A02
            X.4DU r9 = (X.AnonymousClass4DU) r9
            java.lang.Object r8 = r0.A03
            X.4gz r8 = (X.C270594gz) r8
            if (r8 != 0) goto L_0x003d
            java.lang.Object r3 = r0.A06
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            if (r3 == 0) goto L_0x0096
            X.GlN r2 = r3.A06()
            X.4jb r8 = new X.4jb
            r8.<init>(r7, r4, r2)
            java.lang.String r2 = r3.A1L
            r8.A04 = r2
        L_0x003d:
            X.Q03 r5 = new X.Q03
            r5.<init>(r6, r7, r8, r9, r10)
            r5.A01(r4)
            java.lang.Object r2 = r0.A04
            com.instagram.model.androidlink.AndroidLink r2 = (com.instagram.model.androidlink.AndroidLink) r2
            r5.A0L = r2
            java.lang.Object r2 = r0.A06
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            if (r2 == 0) goto L_0x005b
            int r0 = r2.A03
            r5.A09 = r0
            int r0 = r2.getPosition()
            r5.A0B = r0
        L_0x005b:
            X.Q02 r0 = new X.Q02
            r0.<init>(r5)
            r0.A02()
            r0 = 805917398(0x300952d6, float:4.9958027E-10)
        L_0x0066:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x006a:
            r1 = -1999628458(0xffffffff88d01756, float:-1.2524031E-33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.OZ1 r2 = X.OZ1.A00
            java.lang.Object r6 = r0.A07
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r8 = r0.A06
            X.N4P r8 = (X.N4P) r8
            java.lang.Object r7 = r0.A05
            com.instagram.direct.capabilities.Capabilities r7 = (com.instagram.direct.capabilities.Capabilities) r7
            java.lang.Object r9 = r0.A04
            X.N9q r9 = (X.C68303N9q) r9
            java.lang.Object r3 = r0.A03
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.Object r5 = r0.A02
            X.0iw r5 = (X.AnonymousClass0iw) r5
            r2.A01(r3, r4, r5, r6, r7, r8, r9)
            r0 = -145760342(0xfffffffff74fdfaa, float:-4.2161793E33)
            goto L_0x0066
        L_0x0096:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 2020578500(0x786f94c4, float:1.9437129E34)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x00a1:
            r1 = 95622919(0x5b31707, float:1.6841538E-35)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r11 = r0.A05
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            boolean r1 = r11.A1z()
            r6 = r1 ^ 1
            java.lang.Object r2 = r0.A06
            X.F12 r2 = (X.F12) r2
            java.lang.Object r1 = r0.A03
            android.content.Context r1 = (android.content.Context) r1
            X.C49789F6x.A00(r1, r2, r6)
            java.lang.Object r4 = r0.A04
            X.FnK r4 = (X.C51028FnK) r4
            com.instagram.user.model.User r5 = r4.A05
            r5.A1A(r6)
            com.instagram.profile.fragment.UserDetailTabController r5 = r4.A04
            if (r5 == 0) goto L_0x00cd
            r5.A0F()
        L_0x00cd:
            X.F24 r10 = new X.F24
            r10.<init>(r0, r6)
            java.lang.Object r7 = r0.A02
            X.30l r7 = (X.C2355930l) r7
            java.lang.Object r5 = r0.A07
            X.07i r5 = (X.AnonymousClass07i) r5
            X.2lw r9 = new X.2lw
            r9.<init>(r1, r5)
            java.lang.Object r8 = r0.A01
            X.0iw r8 = (X.AnonymousClass0iw) r8
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            if (r6 == 0) goto L_0x0111
            r7.A02(r8, r9, r10, r11, r12)
            java.lang.String r15 = "add_close_friend"
            r0 = 2
            X.0qQ.A0B(r8, r0)
            com.instagram.common.session.UserSession r13 = r4.A02
            X.6rY r14 = X.DbV.A0e(r11)
            java.lang.String r16 = r11.getId()
            java.lang.String r17 = "following_sheet"
            r12 = r8
            X.C319976rX.A06(r12, r13, r14, r15, r16, r17)
            android.view.View r2 = r2.A00
            r0 = 2131952455(0x7f130347, float:1.9541353E38)
        L_0x0105:
            java.lang.String r0 = X.DbY.A0b(r1, r11, r0)
            X.2eQ.A07(r2, r0)
            r0 = -682712309(0xffffffffd74ea30b, float:-2.2719966E14)
            goto L_0x02f0
        L_0x0111:
            r0 = 2
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0q(r8, r0)
            X.DbU.A1V(r11, r5)
            X.FAl r13 = X.C49274EsH.A00
            com.instagram.common.session.UserSession r0 = r7.A01
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            r14 = r8
            r15 = r0
            r16 = r12
            r18 = r5
            X.1OC r6 = r13.A01(r14, r15, r16, r17, r18)
            r5 = 3
            X.EDb r0 = new X.EDb
            r0.<init>((int) r5, (java.lang.Object) r11, (java.lang.Object) r7, (java.lang.Object) r10)
            r6.A00 = r0
            r9.schedule(r6)
            java.lang.String r15 = "remove_close_friend"
            com.instagram.common.session.UserSession r13 = r4.A02
            X.6rY r14 = X.DbV.A0e(r11)
            java.lang.String r16 = r11.getId()
            java.lang.String r17 = "following_sheet"
            r12 = r8
            X.C319976rX.A06(r12, r13, r14, r15, r16, r17)
            android.view.View r2 = r2.A00
            r0 = 2131972140(0x7f13502c, float:1.958128E38)
            goto L_0x0105
        L_0x014e:
            r1 = 1490380486(0x58d566c6, float:1.87709908E15)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r9 = r0.A03
            X.0r1 r9 = (X.0r1) r9
            boolean r1 = r9.A00
            r2 = r1 ^ 1
            r9.A00 = r2
            java.lang.Object r8 = r0.A07
            X.DmO r8 = (X.C46847DmO) r8
            java.util.HashMap r1 = r8.A02
            java.lang.Object r7 = r0.A02
            java.lang.Number r7 = (java.lang.Number) r7
            X.DbU.A1Y(r7, r1, r2)
            java.lang.Object r2 = r0.A04
            android.view.View r2 = (android.view.View) r2
            boolean r1 = r9.A00
            r2.setSelected(r1)
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r0.A05
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r2 = r9.A00
            r1 = 2130970277(0x7f0406a5, float:1.754926E38)
            if (r2 == 0) goto L_0x0187
            r1 = 2130970312(0x7f0406c8, float:1.754933E38)
        L_0x0187:
            int r1 = X.2Yu.A0H(r5, r1)
            X.DbT.A17(r5, r4, r1)
            X.E2t r6 = r8.A0A
            long r4 = r7.longValue()
            boolean r2 = r9.A00
            boolean r1 = r6.A05
            if (r1 == 0) goto L_0x01db
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.util.HashMap r1 = r6.A0B
            r1.put(r7, r2)
        L_0x01a3:
            X.0eM r1 = r6.A0D
            java.lang.Object r2 = r1.getValue()
            X.Dgy r2 = (X.C46556Dgy) r2
            java.lang.String r1 = java.lang.String.valueOf(r4)
            r2.A03(r1)
            boolean r1 = r9.A00
            if (r1 == 0) goto L_0x01d8
            java.lang.String r2 = "select"
        L_0x01b8:
            java.lang.Object r0 = r0.A06
            X.G8x r0 = (X.C51954G8x) r0
            java.lang.String r1 = r0.getName()
            if (r1 == 0) goto L_0x01cb
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x01d0
            java.util.HashMap r0 = r6.A0C
            r0.put(r7, r1)
        L_0x01cb:
            r0 = -578392419(0xffffffffdd866e9d, float:-1.21085656E18)
            goto L_0x02f0
        L_0x01d0:
            java.lang.String r0 = r7.toString()
            r6.A01(r2, r1, r0)
            goto L_0x01cb
        L_0x01d8:
            java.lang.String r2 = "unselect"
            goto L_0x01b8
        L_0x01db:
            r1 = 1
            r6.A06 = r1
            X.C47447E2t.A00(r6, r4, r2)
            goto L_0x01a3
        L_0x01e2:
            r1 = -340329341(0xffffffffebb6fc83, float:-4.424339E26)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A07
            X.0lg r8 = (X.0lg) r8
            java.lang.Object r7 = r0.A06
            X.2eb r7 = (X.C71662eb) r7
            java.lang.Object r2 = r0.A05
            X.2eb r2 = (X.C71662eb) r2
            java.lang.Object r5 = r0.A02
            X.5Gi r5 = (X.C283155Gi) r5
            java.lang.Object r1 = r0.A04
            X.FBa r1 = (X.C49876FBa) r1
            java.lang.Object r4 = r0.A03
            X.F3R r4 = (X.F3R) r4
            java.lang.Object r6 = r0.A01
            X.F36 r6 = (X.F36) r6
            r0 = 1
            r1.A05 = r0
            r7.A02()
            java.lang.String r10 = r4.A01
            java.lang.String r4 = ""
            if (r10 != 0) goto L_0x0212
            r10 = r4
        L_0x0212:
            java.lang.String r0 = r6.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.Map r16 = java.util.Collections.singletonMap(r10, r0)
            X.0qQ.A07(r16)
            X.F1Q r7 = X.C49285EsU.A00
            java.lang.String r9 = r1.A02
            if (r9 != 0) goto L_0x022a
            r9 = r4
        L_0x022a:
            int r0 = r5.A00
            java.lang.String r12 = java.lang.String.valueOf(r0)
            java.lang.String r13 = r5.A09
            X.0qQ.A07(r13)
            java.lang.String r14 = r1.A00
            if (r14 != 0) goto L_0x023a
            r14 = r4
        L_0x023a:
            java.lang.String r15 = r1.A03
            java.lang.String r11 = "activity_feed"
            r7.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 0
            r2.A03(r0)
            android.view.View r1 = r2.A01()
            r0 = 2131430592(0x7f0b0cc0, float:1.848289E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r1, r0)
            r0 = 2131968353(0x7f134161, float:1.9573598E38)
            r1.setText(r0)
            android.view.View r1 = r2.A01()
            r0 = 2131430342(0x7f0b0bc6, float:1.8482382E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 62
            X.FP3.A00(r1, r0, r2)
            r0 = -90666780(0xfffffffffa9888e4, float:-3.960028E35)
            goto L_0x02f0
        L_0x026b:
            r1 = 1677104264(0x63f69488, float:9.0972037E21)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A07
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r7 = r0.A04
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r5 = r0.A01
            X.0iw r5 = (X.AnonymousClass0iw) r5
            java.lang.Object r9 = r0.A03
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r4 = r0.A06
            X.Dfd r4 = (X.C46475Dfd) r4
            java.lang.Object r8 = r0.A05
            X.HPj r8 = (X.C54704HPj) r8
            X.FC1.A01(r4, r5, r6, r7, r8, r9)
            X.LQz r5 = X.C64158LQz.A00
            java.lang.Object r4 = r0.A02
            android.content.Context r4 = (android.content.Context) r4
            X.0qQ.A0A(r4)
            X.KYX r8 = (X.KYX) r8
            X.Ki8 r2 = r8.A00()
            java.lang.String r1 = r8.A00
            if (r1 == 0) goto L_0x02a6
            int r0 = r1.length()
            if (r0 > 0) goto L_0x02a7
        L_0x02a6:
            r1 = 0
        L_0x02a7:
            r5.A01(r4, r6, r2, r1)
            r0 = -159405625(0xfffffffff67fa9c7, float:-1.2963664E33)
            goto L_0x02f0
        L_0x02ae:
            r1 = 1628780117(0x61153655, float:1.7203E20)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A07
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r7 = r0.A04
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r5 = r0.A01
            X.0iw r5 = (X.AnonymousClass0iw) r5
            java.lang.Object r9 = r0.A03
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r4 = r0.A06
            X.Dfd r4 = (X.C46475Dfd) r4
            java.lang.Object r8 = r0.A05
            X.HPj r8 = (X.C54704HPj) r8
            X.F5Y.A01(r4, r5, r6, r7, r8, r9)
            X.LQz r5 = X.C64158LQz.A00
            java.lang.Object r4 = r0.A02
            android.content.Context r4 = (android.content.Context) r4
            X.0qQ.A0A(r4)
            X.KYX r8 = (X.KYX) r8
            X.Ki8 r2 = r8.A00()
            java.lang.String r1 = r8.A00
            if (r1 == 0) goto L_0x02e9
            int r0 = r1.length()
            if (r0 > 0) goto L_0x02ea
        L_0x02e9:
            r1 = 0
        L_0x02ea:
            r5.A01(r4, r6, r2, r1)
            r0 = -808122241(0xffffffffcfd5087f, float:-7.1482076E9)
        L_0x02f0:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FOW.onClick(android.view.View):void");
    }
}
