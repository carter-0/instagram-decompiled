package X;

public final class MYK extends 0Yg implements 0sP {
    public final int A00;
    public final String A01;

    public static String A00(Object obj, MYK myk) {
        0qQ.A0B(obj, 0);
        return myk.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MYK(String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [X.O5o] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r14.put(r0, r1);
        r14.put("threadPriority", java.lang.Integer.valueOf(android.os.Process.getThreadPriority(android.os.Process.myTid())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b3, code lost:
        if (r0 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        X.C285645Sc.A03(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022b, code lost:
        if (r0 <= 0) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0293, code lost:
        if (X.00l.A0d(r0, r2, true) != true) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02a0, code lost:
        r0 = X.0qQ.A0K(r1, r3.A01);
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02a7, code lost:
        if (r0 != false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a9, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02ae, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02c1, code lost:
        return java.lang.Boolean.valueOf(X.0qQ.A0K(r1, r3.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        r1 = java.lang.Boolean.valueOf(r2);
        r0 = "wasInterrupted";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r3 = r20
            r14 = r21
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0017;
                case 1: goto L_0x0025;
                case 2: goto L_0x0038;
                case 3: goto L_0x0038;
                case 4: goto L_0x0038;
                case 5: goto L_0x0055;
                case 6: goto L_0x0066;
                case 7: goto L_0x015e;
                case 8: goto L_0x0168;
                case 9: goto L_0x0172;
                case 10: goto L_0x0172;
                case 11: goto L_0x0193;
                case 12: goto L_0x01b2;
                case 13: goto L_0x01c0;
                case 14: goto L_0x0009;
                case 15: goto L_0x007d;
                case 16: goto L_0x0088;
                case 17: goto L_0x0098;
                case 18: goto L_0x0088;
                case 19: goto L_0x0009;
                case 20: goto L_0x00ad;
                case 21: goto L_0x00ad;
                case 22: goto L_0x01ce;
                case 23: goto L_0x01da;
                case 24: goto L_0x01e4;
                case 25: goto L_0x0296;
                case 26: goto L_0x0009;
                case 27: goto L_0x0009;
                case 28: goto L_0x00b7;
                case 29: goto L_0x01ec;
                case 30: goto L_0x01f6;
                case 31: goto L_0x0204;
                case 32: goto L_0x0210;
                case 33: goto L_0x021a;
                case 34: goto L_0x0245;
                case 35: goto L_0x025a;
                case 36: goto L_0x0272;
                case 37: goto L_0x00c2;
                case 38: goto L_0x00cc;
                case 39: goto L_0x02af;
                case 40: goto L_0x02af;
                case 41: goto L_0x00b7;
                case 42: goto L_0x00d7;
                case 43: goto L_0x01b2;
                case 44: goto L_0x02c2;
                case 45: goto L_0x00f1;
                case 46: goto L_0x0117;
                case 47: goto L_0x012b;
                case 48: goto L_0x013c;
                case 49: goto L_0x012b;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.5SW r14 = (X.AnonymousClass5SW) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
        L_0x000f:
            java.lang.String r0 = r3.A01
        L_0x0011:
            X.C285645Sc.A03(r14, r0)
        L_0x0014:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0017:
            java.util.Map r14 = (java.util.Map) r14
            r2 = 0
            X.0qQ.A0B(r14, r2)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "name"
            r14.put(r0, r1)
            goto L_0x0031
        L_0x0025:
            java.util.Map r14 = (java.util.Map) r14
            java.lang.String r1 = A00(r14, r3)
            java.lang.String r0 = "name"
            r14.put(r0, r1)
            r2 = 1
        L_0x0031:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "wasInterrupted"
            goto L_0x0040
        L_0x0038:
            java.util.Map r14 = (java.util.Map) r14
            java.lang.String r1 = A00(r14, r3)
            java.lang.String r0 = "name"
        L_0x0040:
            r14.put(r0, r1)
            int r0 = android.os.Process.myTid()
            int r0 = android.os.Process.getThreadPriority(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "threadPriority"
            r14.put(r0, r1)
            goto L_0x0014
        L_0x0055:
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.0wj r2 = X.0wj.A01
            java.lang.String r1 = r3.A01
            r0 = 817896479(0x30c01c1f, float:1.3977831E-9)
            X.AnonymousClass7TG.A1I(r2, r1, r14, r0)
            goto L_0x0014
        L_0x0066:
            X.LEz r14 = (X.C63953LEz) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.Nmr r0 = X.C69509Nmr.A02
            r14.A00(r0)
            X.KhH r1 = X.C62525KhH.MODEL_OUTPUT
            java.lang.String r0 = r3.A01
            java.util.LinkedHashMap r0 = X.C66582MXn.A0y(r1, r0)
            r14.A01(r0)
            goto L_0x0014
        L_0x007d:
            X.5SW r14 = (X.AnonymousClass5SW) r14
            java.lang.String r0 = A00(r14, r3)
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = ""
            goto L_0x0011
        L_0x0088:
            X.5SW r14 = (X.AnonymousClass5SW) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.String r0 = r3.A01
            X.C285645Sc.A03(r14, r0)
            X.C285645Sc.A02(r14, r1)
            goto L_0x0014
        L_0x0098:
            X.5SW r14 = (X.AnonymousClass5SW) r14
            java.lang.String r0 = A00(r14, r3)
            X.C285645Sc.A03(r14, r0)
            X.5Sb r1 = X.AnonymousClass5SZ.A0H
            X.ON4 r0 = new X.ON4
            r0.<init>()
            r14.ENH(r1, r0)
            goto L_0x0014
        L_0x00ad:
            X.5SW r14 = (X.AnonymousClass5SW) r14
            java.lang.String r0 = A00(r14, r3)
            if (r0 == 0) goto L_0x0014
            goto L_0x0011
        L_0x00b7:
            X.5SW r14 = (X.AnonymousClass5SW) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.C285645Sc.A02(r14, r0)
            goto L_0x000f
        L_0x00c2:
            X.3sc r14 = (X.C254523sc) r14
            java.lang.String r0 = A00(r14, r3)
            r14.A5f = r0
            goto L_0x0014
        L_0x00cc:
            java.util.AbstractMap r14 = (java.util.AbstractMap) r14
            java.lang.String r0 = A00(r14, r3)
            r14.remove(r0)
            goto L_0x0014
        L_0x00d7:
            X.5Lm r14 = (X.C284235Lm) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.String r0 = r3.A01
            X.0qQ.A0B(r0, r1)
            X.5Ka r1 = new X.5Ka
            r1.<init>(r0)
            r14.A00()
            java.util.Map r0 = r14.A00
            r0.remove(r1)
            goto L_0x0014
        L_0x00f1:
            java.util.List r4 = X.JTQ.A0i(r14)
            java.lang.String r3 = r3.A01
            java.util.Iterator r2 = r4.iterator()
        L_0x00fb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.L9x r0 = (X.C63868L9x) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x00fb
            if (r1 == 0) goto L_0x0014
            r4.remove(r1)
            goto L_0x0014
        L_0x0117:
            X.ONr r2 = X.C66581MXm.A0h(r14)
            java.lang.String r1 = "share_screen_opened"
            java.lang.String r0 = "action"
            r2.A03(r0, r1)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "share_type"
            r2.A03(r0, r1)
            goto L_0x0014
        L_0x012b:
            X.N4R r14 = (X.N4R) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r1 = r14.A02
            com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator r1 = (com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator) r1
            java.lang.String r0 = r3.A01
            r1.handleMqttMessage(r0)
            goto L_0x0014
        L_0x013c:
            X.NCZ r4 = X.C66581MXm.A0j(r14)
            X.NDB r1 = r4.A03
            java.lang.String r0 = r3.A01
            long r2 = java.lang.Long.parseLong(r0)
            com.facebook.rsys.livevideo.gen.LiveVideoApi r1 = r1.A00
            if (r1 == 0) goto L_0x0153
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.updateBroadcastId(r0)
        L_0x0153:
            X.OU3 r0 = r4.A01
            com.facebook.rsys.callmanager.gen.CallApi r0 = r0.A02
            if (r0 == 0) goto L_0x0014
            r0.finishSetup()
            goto L_0x0014
        L_0x015e:
            X.S6Z r14 = (X.S6Z) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.String r1 = r14.A01
            goto L_0x02b7
        L_0x0168:
            X.S6V r14 = (X.S6V) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.String r1 = r14.A02
            goto L_0x02b7
        L_0x0172:
            X.SUj r14 = (X.SUj) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r2 = r14.A01
            boolean r0 = X.SUj.A0V(r14)
            r1 = 0
            if (r0 == 0) goto L_0x018e
            boolean r0 = r2 instanceof X.C7791QXc
            if (r0 == 0) goto L_0x0188
            r1 = r2
            X.QXc r1 = (X.C7791QXc) r1
        L_0x0188:
            X.O5o r0 = new X.O5o
            r0.<init>(r1)
            r1 = r0
        L_0x018e:
            X.SUj r4 = X.SUj.A06(r14, r1)
            return r4
        L_0x0193:
            android.content.Context r14 = (android.content.Context) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            r0 = 0
            com.instagram.igds.components.search.IgdsInlineSearchBox r4 = new com.instagram.igds.components.search.IgdsInlineSearchBox
            r4.<init>(r14, r0, r1)
            java.lang.String r0 = r3.A01
            r4.A02()
            r4.setHint((java.lang.String) r0)
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            int r0 = X.AnonymousClass7TF.A03(r14, r0)
            r4.setSearchGlyphColor(r0)
            return r4
        L_0x01b2:
            X.WSc r14 = (X.C19269WSc) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            com.instagram.model.reels.Reel r0 = r14.A01
            java.lang.String r1 = r0.getId()
            goto L_0x02b7
        L_0x01c0:
            X.3BT r14 = (X.AnonymousClass3BT) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            com.instagram.model.reels.Reel r0 = r14.A03
            java.lang.String r1 = r0.getId()
            goto L_0x02b7
        L_0x01ce:
            X.54u r14 = (X.C2809354u) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.String r1 = r14.getId()
            goto L_0x02b7
        L_0x01da:
            X.8ve r14 = (X.C369988ve) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.String r1 = r14.A07
            goto L_0x02b7
        L_0x01e4:
            X.Jud r14 = (X.C60981Jud) r14
            if (r14 == 0) goto L_0x02a9
            java.lang.String r1 = r14.A04
            goto L_0x02a0
        L_0x01ec:
            X.2XX r14 = (X.2XX) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.String r1 = r14.A01
            goto L_0x02b7
        L_0x01f6:
            X.3ui r14 = (X.C255783ui) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            com.instagram.user.model.Product r0 = r14.A0I()
            java.lang.String r1 = r0.A0H
            goto L_0x02b7
        L_0x0204:
            X.1Xj r14 = (X.1Xj) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.String r1 = r14.A2n()
            goto L_0x02b7
        L_0x0210:
            X.N2q r14 = (X.C68150N2q) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.String r1 = r14.A03
            goto L_0x02b7
        L_0x021a:
            X.GqG r14 = (X.C53545GqG) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.String r5 = r3.A01
            int r0 = r5.length()
            r7 = 1
            if (r0 == 0) goto L_0x022d
            r7 = 0
            r11 = 1
            if (r0 > 0) goto L_0x022e
        L_0x022d:
            r11 = 0
        L_0x022e:
            java.util.List r6 = r14.A01
            boolean r8 = r14.A08
            boolean r9 = r14.A09
            boolean r10 = r14.A07
            boolean r12 = r14.A02
            boolean r13 = r14.A04
            boolean r14 = r14.A03
            X.0qQ.A0B(r6, r1)
            X.GqG r4 = new X.GqG
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r4
        L_0x0245:
            X.GqI r14 = (X.C53547GqI) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.String r15 = r3.A01
            r16 = 0
            r17 = 0
            r18 = 503(0x1f7, float:7.05E-43)
            r19 = r0
            X.GqI r4 = X.C53547GqI.A00(r14, r15, r16, r17, r18, r19)
            return r4
        L_0x025a:
            X.N8q r14 = (X.C68279N8q) r14
            java.lang.String r3 = A00(r14, r3)
            int r0 = r3.length()
            boolean r2 = X.AnonymousClass7TF.A1R(r0)
            X.N4t r1 = r14.A00
            boolean r0 = r14.A02
            X.N8q r4 = new X.N8q
            r4.<init>(r1, r3, r2, r0)
            return r4
        L_0x0272:
            X.N4t r14 = (X.N4t) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            com.instagram.user.model.User r4 = r14.A02()
            java.lang.String r0 = r4.getUsername()
            java.lang.String r2 = r3.A01
            r1 = 1
            boolean r0 = X.00l.A0d(r0, r2, r1)
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = r4.getFullName()
            if (r0 == 0) goto L_0x02a9
            boolean r0 = X.00l.A0d(r0, r2, r1)
            if (r0 != r1) goto L_0x02a9
            goto L_0x02aa
        L_0x0296:
            com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal r14 = (com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal) r14
            if (r14 == 0) goto L_0x02a9
            long r0 = r14.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L_0x02a0:
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            r1 = 1
            if (r0 != 0) goto L_0x02aa
        L_0x02a9:
            r1 = 0
        L_0x02aa:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L_0x02af:
            X.Jva r14 = (X.C61036Jva) r14
            com.instagram.user.model.User r0 = r14.A02
            java.lang.String r1 = r0.getId()
        L_0x02b7:
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x02c2:
            X.JvV r14 = (X.C61031JvV) r14
            java.lang.String r2 = A00(r14, r3)
            boolean r3 = r14.A06
            boolean r4 = r14.A04
            boolean r5 = r14.A05
            boolean r6 = r14.A03
            X.JvQ r1 = r14.A01
            X.JvP r0 = r14.A00
            boolean r7 = r14.A07
            X.JvV r4 = X.C61031JvV.A00(r0, r1, r2, r3, r4, r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MYK.invoke(java.lang.Object):java.lang.Object");
    }
}
