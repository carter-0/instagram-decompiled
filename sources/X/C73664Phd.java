package X;

/* renamed from: X.Phd  reason: case insensitive filesystem */
public final class C73664Phd extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73664Phd(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        return r1.A2A((com.instagram.common.session.UserSession) r3.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011f, code lost:
        if (X.AnonymousClass48O.A01(r6) != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02a3, code lost:
        r2.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02a8, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r26 = this;
            r3 = r26
            int r0 = r3.A00
            switch(r0) {
                case 1: goto L_0x0299;
                case 2: goto L_0x0007;
                case 3: goto L_0x0007;
                case 4: goto L_0x0007;
                case 5: goto L_0x0007;
                case 6: goto L_0x0007;
                case 7: goto L_0x0007;
                case 8: goto L_0x0039;
                case 9: goto L_0x0007;
                case 10: goto L_0x0039;
                case 11: goto L_0x0007;
                case 12: goto L_0x0039;
                case 13: goto L_0x0026;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x0026;
                case 17: goto L_0x0026;
                case 18: goto L_0x0007;
                case 19: goto L_0x0007;
                case 20: goto L_0x028a;
                case 21: goto L_0x027c;
                case 22: goto L_0x026e;
                case 23: goto L_0x0007;
                case 24: goto L_0x022c;
                case 25: goto L_0x01ff;
                case 26: goto L_0x0007;
                case 27: goto L_0x01db;
                case 28: goto L_0x01c7;
                case 29: goto L_0x01ab;
                case 30: goto L_0x0180;
                case 31: goto L_0x007a;
                case 32: goto L_0x0007;
                case 33: goto L_0x006d;
                case 34: goto L_0x0059;
                case 35: goto L_0x0060;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r4 = r0.invoke()
            if (r4 != 0) goto L_0x0025
        L_0x0013:
            java.lang.Object r0 = r3.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0056
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0056
            X.2YQ r4 = r1.getDefaultViewModelCreationExtras()
        L_0x0025:
            return r4
        L_0x0026:
            java.lang.Object r0 = r3.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0032
            java.lang.Object r4 = r0.invoke()
            if (r4 != 0) goto L_0x0025
        L_0x0032:
            java.lang.Object r0 = r3.A02
            X.2YQ r4 = X.JTU.A08(r0)
            return r4
        L_0x0039:
            java.lang.Object r0 = r3.A01
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x004d
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x004d
            X.2YM r4 = r1.getDefaultViewModelProviderFactory()
            if (r4 != 0) goto L_0x0025
        L_0x004d:
            java.lang.Object r0 = r3.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r4 = r0.getDefaultViewModelProviderFactory()
            return r4
        L_0x0056:
            X.2YP r4 = X.AnonymousClass2YP.A00
            return r4
        L_0x0059:
            java.lang.Object r0 = r3.A01
            X.7FN r0 = (X.AnonymousClass7FN) r0
            X.1Xj r1 = r0.A02
            goto L_0x0071
        L_0x0060:
            java.lang.Object r0 = r3.A01
            X.7FJ r0 = (X.AnonymousClass7FJ) r0
            X.1Xj r1 = r0.A01
            if (r1 != 0) goto L_0x0071
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x006d:
            java.lang.Object r1 = r3.A01
            X.1Xj r1 = (X.1Xj) r1
        L_0x0071:
            java.lang.Object r0 = r3.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.user.model.User r4 = r1.A2A(r0)
            return r4
        L_0x007a:
            java.lang.Object r5 = r3.A02
            X.E3P r5 = (X.E3P) r5
            X.0eM r0 = r5.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r9 = r5.requireActivity()
            java.lang.Object r0 = r3.A01
            X.2Ep r0 = (X.AnonymousClass2Ep) r0
            r10 = 0
            X.DbY.A1S(r1, r0)
            boolean r2 = r0.CUJ()
            if (r2 != 0) goto L_0x00bb
            java.lang.String r2 = r1.A06
            boolean r2 = r0.Ce4(r2)
            if (r2 != 0) goto L_0x00bb
            X.8ab r2 = X.DbS.A0X(r9)
            r0 = 2131963166(0x7f132d1e, float:1.9563078E38)
            r2.A09(r0)
            r0 = 2131963165(0x7f132d1d, float:1.9563076E38)
            r2.A08(r0)
            r1 = 2131968772(0x7f134304, float:1.9574448E38)
            X.8ae r0 = X.C358278ae.DEFAULT
            r2.A0R(r10, r0, r1)
            X.DbT.A1V(r2)
            goto L_0x02a6
        L_0x00bb:
            com.instagram.model.direct.DirectThreadKey r2 = r0.BJy()
            X.3t3 r11 = X.C66647MaG.A08(r2)
            if (r11 == 0) goto L_0x02a6
            int r2 = r0.C6a()
            r4 = 29
            if (r2 != r4) goto L_0x0171
            X.3Te r2 = X.C66580MXl.A0b(r0)
            if (r2 == 0) goto L_0x017b
            int r8 = r2.A02
        L_0x00d5:
            java.lang.String r12 = r0.C6k()
            java.lang.String r13 = ""
            java.lang.String r3 = r1.A06
            boolean r20 = r0.Ce4(r3)
            r2 = r0
            X.3U9 r2 = (X.AnonymousClass3U9) r2
            X.3S9 r2 = r2.A01
            X.3Te r6 = r2.A0s
            if (r6 == 0) goto L_0x016e
            java.util.List r6 = r6.A0E
            if (r6 == 0) goto L_0x016e
            boolean r21 = r6.contains(r3)
        L_0x00f2:
            boolean r22 = r0.CUJ()
            r23 = 0
            java.lang.String r14 = r0.BA0()
            int r7 = r0.C6a()
            X.3Te r6 = r2.A0s
            r15 = 0
            if (r7 != r4) goto L_0x0109
            if (r6 == 0) goto L_0x0109
            java.lang.String r15 = r6.A07
        L_0x0109:
            int r7 = r0.C6a()
            X.3Te r6 = r2.A0s
            boolean r24 = X.C66651MaK.A03(r6, r7)
            int r6 = r0.C6a()
            if (r6 == r4) goto L_0x0121
            boolean r6 = X.AnonymousClass48O.A01(r6)
            r25 = 0
            if (r6 == 0) goto L_0x0123
        L_0x0121:
            r25 = 1
        L_0x0123:
            int r18 = r0.AdN()
            int r19 = r0.C6a()
            int r6 = r0.C6a()
            X.3Te r2 = r2.A0s
            java.lang.String r16 = X.C329997La.A00(r2, r3, r6)
            r17 = r8
            android.os.Bundle r8 = X.C69933NuZ.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            int r2 = r0.C6a()
            if (r2 != r4) goto L_0x0158
            X.6gx r7 = X.C313746gw.A00(r1)
            int r6 = r0.AdN()
            java.lang.String r4 = X.C300965yF.A07(r11)
            java.lang.String r2 = r0.C6k()
            boolean r0 = r0.Ce4(r3)
            r7.A0R(r4, r2, r6, r0)
        L_0x0158:
            X.6Yo r2 = X.DbS.A0M(r9, r1)
            X.NJ7 r0 = new X.NJ7
            r0.<init>()
            X.Dba.A0w(r8, r0, r2)
            X.OJb r0 = new X.OJb
            r0.<init>(r5, r1)
            r0.A00(r11)
            goto L_0x02a6
        L_0x016e:
            r21 = 0
            goto L_0x00f2
        L_0x0171:
            java.util.List r2 = r0.BRZ()
            int r8 = r2.size()
            goto L_0x00d5
        L_0x017b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0180:
            X.7fL r4 = X.C336887fL.A00
            java.lang.Object r0 = r3.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            android.content.Context r5 = X.C243803a8.A00(r0)
            android.content.Context r1 = X.C243803a8.A00(r0)
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r10 = X.2Yu.A0F(r1, r0)
            java.lang.Object r1 = r3.A02
            X.Guw r1 = (X.C53829Guw) r1
            com.instagram.common.session.UserSession r7 = r1.A00
            com.instagram.user.model.User r8 = r1.A02
            r0 = 41
            X.PhW r9 = new X.PhW
            r9.<init>(r1, r0)
            r6 = 0
            r11 = 0
            android.text.SpannableStringBuilder r4 = r4.A01(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L_0x01ab:
            java.lang.Object r0 = r3.A02
            X.Guw r0 = (X.C53829Guw) r0
            java.lang.Long r1 = r0.A03
            if (r1 == 0) goto L_0x01fd
            java.lang.Object r0 = r3.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            long r1 = r1.longValue()
            X.2V1 r0 = r0.A05
            android.content.Context r0 = r0.A0C
            X.0qQ.A07(r0)
            java.lang.String r4 = X.1G0.A07(r0, r1)
            return r4
        L_0x01c7:
            java.lang.Object r0 = r3.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            android.content.Context r1 = X.C243803a8.A00(r0)
            java.lang.Object r0 = r3.A02
            X.Gw7 r0 = (X.C53901Gw7) r0
            X.7L2 r0 = r0.A05
            X.HoR r4 = new X.HoR
            r4.<init>(r1, r0)
            return r4
        L_0x01db:
            java.lang.Object r0 = r3.A02
            X.Gw7 r0 = (X.C53901Gw7) r0
            X.OLz r0 = r0.A02
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r0 = r3.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            android.content.Context r2 = X.C243803a8.A00(r0)
            java.lang.String r1 = "reply_bubble_tag"
            java.lang.String r0 = "reaction_pill_tag"
            java.util.List r0 = X.C66581MXm.A11(r1, r0)
            X.JmD r4 = new X.JmD
            r4.<init>(r2, r0)
            return r4
        L_0x01fd:
            r4 = 0
            return r4
        L_0x01ff:
            java.lang.Object r0 = r3.A02
            X.K6q r0 = (X.C61419K6q) r0
            X.0eM r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            X.JjH r1 = (X.C60314JjH) r1
            java.lang.Object r0 = r3.A01
            X.MQX r0 = (X.MQX) r0
            X.Jyv r0 = (X.C61202Jyv) r0
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.L87 r1 = r1.A0A
            java.util.Map r0 = r1.A02
            java.lang.Object r0 = r0.remove(r3)
            X.4Co r0 = (X.C262204Co) r0
            X.C51970G9q.A1S(r0)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = r1.A00
            r0.A0M(r3, r2)
            goto L_0x02a6
        L_0x022c:
            java.lang.Object r0 = r3.A02
            X.K6q r0 = (X.C61419K6q) r0
            X.0eM r0 = r0.A07
            java.lang.Object r7 = r0.getValue()
            X.JjH r7 = (X.C60314JjH) r7
            java.lang.Object r0 = r3.A01
            X.MQX r0 = (X.MQX) r0
            X.Jyt r0 = (X.C61200Jyt) r0
            X.JwM r6 = r0.A00
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.L6X r5 = r7.A0B
            X.6oS r4 = X.C318116oQ.A00(r7)
            r3 = 1
            java.util.Map r0 = r5.A02
            java.lang.Object r0 = r0.remove(r6)
            X.4Co r0 = (X.C262204Co) r0
            X.C51970G9q.A1S(r0)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r2 = r5.A00
            java.lang.Object r1 = r6.A01
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r6.A02
            java.util.Set r0 = (java.util.Set) r0
            r2.A0R(r1, r0, r3)
            X.LDm r0 = r5.A01
            r0.A00(r4)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = r7.A05
            r0.A0D()
            goto L_0x02a6
        L_0x026e:
            java.lang.Object r2 = r3.A01
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r3.A02
            X.68J r1 = (X.AnonymousClass68J) r1
            X.NAX r0 = new X.NAX
            r0.<init>(r1)
            goto L_0x02a3
        L_0x027c:
            java.lang.Object r1 = r3.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r3.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.OyD r4 = new X.OyD
            r4.<init>(r0, r1)
            return r4
        L_0x028a:
            java.lang.Object r1 = r3.A02
            X.9BB r1 = (X.AnonymousClass9BB) r1
            r0 = 0
            r1.A00 = r0
            java.lang.Object r0 = r3.A01
            X.JPK r0 = (X.JPK) r0
            r0.DED()
            goto L_0x02a6
        L_0x0299:
            java.lang.Object r2 = r3.A01
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r3.A02
            X.GnF r0 = (X.C53383GnF) r0
            java.lang.String r0 = r0.A03
        L_0x02a3:
            r2.invoke(r0)
        L_0x02a6:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73664Phd.invoke():java.lang.Object");
    }
}
