package X;

/* renamed from: X.9L0  reason: invalid class name */
public final class AnonymousClass9L0 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9L0(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02a8, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a9, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        r0 = "clientInfra";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fd, code lost:
        if (X.2El.A0C(r8) == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a1, code lost:
        if (r0 == false) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02a3, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x036e;
                case 1: goto L_0x0350;
                case 2: goto L_0x0346;
                case 3: goto L_0x033a;
                case 4: goto L_0x0325;
                case 5: goto L_0x0312;
                case 6: goto L_0x02f6;
                case 7: goto L_0x02da;
                case 8: goto L_0x0378;
                case 9: goto L_0x02d0;
                case 10: goto L_0x02c5;
                case 11: goto L_0x02ab;
                case 12: goto L_0x0281;
                case 13: goto L_0x0277;
                case 14: goto L_0x026d;
                case 15: goto L_0x0263;
                case 16: goto L_0x0242;
                case 17: goto L_0x0238;
                case 18: goto L_0x0227;
                case 19: goto L_0x021d;
                case 20: goto L_0x0212;
                case 21: goto L_0x0207;
                case 22: goto L_0x01fd;
                case 23: goto L_0x01f3;
                case 24: goto L_0x01db;
                case 25: goto L_0x01d0;
                case 26: goto L_0x01b8;
                case 27: goto L_0x01aa;
                case 28: goto L_0x01a0;
                case 29: goto L_0x0196;
                case 30: goto L_0x0182;
                case 31: goto L_0x0178;
                case 32: goto L_0x0164;
                case 33: goto L_0x015a;
                case 34: goto L_0x014e;
                case 35: goto L_0x0142;
                case 36: goto L_0x0136;
                case 37: goto L_0x012d;
                case 38: goto L_0x0122;
                case 39: goto L_0x010e;
                case 40: goto L_0x00b3;
                case 41: goto L_0x0093;
                case 42: goto L_0x0088;
                case 43: goto L_0x0367;
                case 44: goto L_0x0360;
                case 45: goto L_0x0043;
                case 46: goto L_0x0022;
                case 47: goto L_0x0017;
                case 48: goto L_0x0067;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            X.7TI r0 = (X.AnonymousClass7TI) r0
            java.lang.String r4 = r0.A0H
            if (r4 != 0) goto L_0x0042
            java.lang.String r0 = "threadViewerSessionId"
        L_0x000f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0017:
            java.lang.Object r0 = r13.A01
            X.7TI r0 = (X.AnonymousClass7TI) r0
            androidx.recyclerview.widget.RecyclerView r4 = r0.A04
            if (r4 != 0) goto L_0x0042
            java.lang.String r0 = "messageRecyclerView"
            goto L_0x000f
        L_0x0022:
            java.lang.Object r1 = r13.A01
            X.7TI r1 = (X.AnonymousClass7TI) r1
            X.7Zg r0 = r1.A08
            if (r0 == 0) goto L_0x0064
            X.7S7 r4 = r0.C6l()
            X.4DH r3 = r1.A0U
            android.content.Context r2 = r3.requireContext()
            com.instagram.common.session.UserSession r1 = r1.A0d
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            boolean r0 = X.C70104NxK.A00(r0, r2, r3, r1, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x0042:
            return r4
        L_0x0043:
            java.lang.Object r1 = r13.A01
            X.7TI r1 = (X.AnonymousClass7TI) r1
            com.instagram.common.session.UserSession r0 = r1.A0d
            X.9HW r2 = X.AnonymousClass9HV.A00(r0)
            X.7Zg r0 = r1.A08
            if (r0 == 0) goto L_0x0064
            X.7S7 r0 = r0.C6l()
            X.3t3 r1 = r0.CBU()
            r0 = 42
            boolean r0 = r2.A00(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0064:
            java.lang.String r0 = "clientInfra"
            goto L_0x000f
        L_0x0067:
            java.lang.Object r3 = r13.A01
            X.7TI r3 = (X.AnonymousClass7TI) r3
            X.4DH r2 = r3.A0U
            android.content.Context r1 = r2.requireContext()
            r0 = 0
            X.6ST r4 = new X.6ST
            r4.<init>(r1, r0)
            android.content.Context r1 = r2.requireContext()
            r0 = 2131965491(0x7f133633, float:1.9567793E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A00(r0)
            r3.A0D = r4
            return r4
        L_0x0088:
            java.lang.Object r0 = r13.A01
            X.7TI r0 = (X.AnonymousClass7TI) r0
            X.7Wl r0 = r0.A0t
            java.lang.String r4 = r0.B20()
            return r4
        L_0x0093:
            java.lang.Object r0 = r13.A01
            X.7WU r0 = (X.AnonymousClass7WU) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            X.4DH r0 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            android.content.Context r2 = r0.getApplicationContext()
            X.0qQ.A07(r2)
            r0 = 7
            X.9M3 r1 = new X.9M3
            r1.<init>(r0, r3, r2)
            java.lang.Class<X.7Ox> r0 = X.C330957Ox.class
            java.lang.Object r4 = r3.A01(r0, r1)
            return r4
        L_0x00b3:
            java.lang.Object r2 = r13.A01
            X.7UW r2 = (X.AnonymousClass7UW) r2
            X.0eK r0 = r2.A07
            java.lang.Object r1 = r0.get()
            X.7Zg r1 = (X.C333517Zg) r1
            X.4DH r0 = r2.A03
            android.content.Context r6 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r8 = r2.A06
            X.0iw r7 = r2.A04
            X.0sa r0 = r2.A0E
            java.lang.Object r9 = r0.invoke()
            X.7L7 r9 = (X.AnonymousClass7L7) r9
            X.7S7 r2 = r1.C6l()
            X.3t2 r10 = r2.C6c()
            X.0qQ.A07(r10)
            boolean r0 = r2.CdE()
            if (r0 == 0) goto L_0x010c
            java.util.List r11 = r2.BRZ()
        L_0x00ea:
            boolean r0 = r2.CdE()
            if (r0 == 0) goto L_0x010a
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.0oI.A0C(r0)
            if (r0 == 0) goto L_0x00ff
            boolean r1 = X.2El.A0C(r8)
            r0 = 1
            if (r1 != 0) goto L_0x0100
        L_0x00ff:
            r0 = 0
        L_0x0100:
            int r12 = r2.C68(r0)
        L_0x0104:
            X.OI2 r4 = new X.OI2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L_0x010a:
            r12 = -1
            goto L_0x0104
        L_0x010c:
            r11 = 0
            goto L_0x00ea
        L_0x010e:
            java.lang.Object r1 = r13.A01
            X.7UW r1 = (X.AnonymousClass7UW) r1
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.0oI.A0C(r0)
            if (r0 == 0) goto L_0x02a9
            com.instagram.common.session.UserSession r0 = r1.A06
            boolean r0 = X.2El.A0B(r0)
            goto L_0x02a1
        L_0x0122:
            java.lang.Object r0 = r13.A01
            X.77U r0 = (X.AnonymousClass77U) r0
            X.0sa r0 = r0.A06
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x012d:
            java.lang.Object r0 = r13.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x0136:
            java.lang.Object r0 = r13.A01
            X.7HB r0 = (X.AnonymousClass7HB) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.OJV r4 = new X.OJV
            r4.<init>(r0)
            return r4
        L_0x0142:
            java.lang.Object r0 = r13.A01
            X.7H8 r0 = (X.AnonymousClass7H8) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.OJV r4 = new X.OJV
            r4.<init>(r0)
            return r4
        L_0x014e:
            java.lang.Object r0 = r13.A01
            X.7H6 r0 = (X.AnonymousClass7H6) r0
            com.instagram.common.session.UserSession r0 = r0.A0w
            X.OJV r4 = new X.OJV
            r4.<init>(r0)
            return r4
        L_0x015a:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3HH r4 = new X.3HH
            r4.<init>(r0)
            return r4
        L_0x0164:
            java.lang.Object r0 = r13.A01
            X.65F r0 = (X.AnonymousClass65F) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            java.lang.Class<X.65G> r2 = X.AnonymousClass65G.class
            r1 = 18
            X.Plf r0 = new X.Plf
            r0.<init>(r3, r1)
            java.lang.Object r4 = r3.A01(r2, r0)
            return r4
        L_0x0178:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.65E r4 = new X.65E
            r4.<init>(r0)
            return r4
        L_0x0182:
            java.lang.Object r3 = r13.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325665159328886(0x810e00000d3476, double:3.035835146248044E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0196:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.7QY r4 = new X.7QY
            r4.<init>(r0)
            return r4
        L_0x01a0:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.43Q r4 = new X.43Q
            r4.<init>(r0)
            return r4
        L_0x01aa:
            java.lang.Object r0 = r13.A01
            X.7IQ r0 = (X.AnonymousClass7IQ) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.0iw r0 = r0.A00
            X.ONz r4 = new X.ONz
            r4.<init>(r0, r1)
            return r4
        L_0x01b8:
            java.lang.Object r0 = r13.A01
            X.7IQ r0 = (X.AnonymousClass7IQ) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 29
            X.PhW r1 = new X.PhW
            r1.<init>(r2, r0)
            java.lang.Class<X.OyH> r0 = X.C72196OyH.class
            java.lang.Object r4 = r2.A01(r0, r1)
            return r4
        L_0x01d0:
            java.lang.Object r0 = r13.A01
            X.7IQ r0 = (X.AnonymousClass7IQ) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.OyR r4 = X.C69869NtX.A00(r0)
            return r4
        L_0x01db:
            java.lang.Object r0 = r13.A01
            X.7IQ r0 = (X.AnonymousClass7IQ) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 28
            X.PhW r1 = new X.PhW
            r1.<init>(r2, r0)
            java.lang.Class<X.OyG> r0 = X.C72195OyG.class
            java.lang.Object r4 = r2.A01(r0, r1)
            return r4
        L_0x01f3:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6ud r4 = new X.6ud
            r4.<init>(r0)
            return r4
        L_0x01fd:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6gx r4 = new X.6gx
            r4.<init>(r0)
            return r4
        L_0x0207:
            java.lang.Object r0 = r13.A01
            X.2KB r0 = (X.2KB) r0
            X.0sa r0 = r0.A02
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x0212:
            java.lang.Object r0 = r13.A01
            X.2K6 r0 = (X.2K6) r0
            X.0sa r0 = r0.A07
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x021d:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository r4 = new com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository
            r4.<init>(r0)
            return r4
        L_0x0227:
            java.lang.Object r0 = r13.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r0 = r0.getApplicationContext()
            X.0qQ.A07(r0)
            X.7NF r4 = new X.7NF
            r4.<init>(r0)
            return r4
        L_0x0238:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.7Pk r4 = new X.7Pk
            r4.<init>(r0)
            return r4
        L_0x0242:
            java.lang.Object r0 = r13.A01
            X.7Ep r0 = (X.C328387Ep) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36886514873008850(0x830c17000202d2, double:3.390518763539781E-306)
            java.lang.String r2 = X.182.A04(r2, r3, r0)
            r1 = 0
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = X.00l.A0R(r2, r0, r1)
            java.util.Set r4 = X.00k.A0k(r0)
            return r4
        L_0x0263:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.65B r4 = new X.65B
            r4.<init>(r0)
            return r4
        L_0x026d:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.5yD r4 = new X.5yD
            r4.<init>(r0)
            return r4
        L_0x0277:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8x3 r4 = new X.8x3
            r4.<init>(r0)
            return r4
        L_0x0281:
            java.lang.Object r0 = r13.A01
            X.7N8 r0 = (X.AnonymousClass7N8) r0
            X.9HC r1 = r0.A03
            X.0eM r0 = r1.A1M
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x02a3
            X.0eM r0 = r1.A1N
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L_0x02a1:
            if (r0 == 0) goto L_0x02a9
        L_0x02a3:
            r0 = 1
        L_0x02a4:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x02a9:
            r0 = 0
            goto L_0x02a4
        L_0x02ab:
            java.lang.Object r2 = r13.A01
            X.5D0 r2 = (X.AnonymousClass5D0) r2
            X.0eM r0 = r2.A01
            java.lang.Object r1 = r0.getValue()
            X.5D7 r1 = (X.AnonymousClass5D7) r1
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            X.0vD r0 = (X.C62710vD) r0
            X.5D8 r4 = new X.5D8
            r4.<init>(r0, r1)
            return r4
        L_0x02c5:
            java.lang.Object r0 = r13.A01
            X.5D0 r0 = (X.AnonymousClass5D0) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.5D7 r4 = X.AnonymousClass5D5.A00(r0)
            return r4
        L_0x02d0:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.5D0 r4 = new X.5D0
            r4.<init>(r0)
            return r4
        L_0x02da:
            java.lang.Object r0 = r13.A01
            X.7Sq r0 = (X.C331857Sq) r0
            X.0sa r0 = r0.A0I
            java.lang.Object r0 = r0.invoke()
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165245(0x7f07003d, float:1.7944702E38)
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x02f6:
            java.lang.Object r0 = r13.A01
            X.7Sq r0 = (X.C331857Sq) r0
            X.0sa r0 = r0.A0I
            java.lang.Object r0 = r0.invoke()
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165251(0x7f070043, float:1.7944714E38)
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0312:
            java.lang.Object r0 = r13.A01
            X.7Ru r0 = (X.C331647Ru) r0
            X.7Rs r0 = r0.A00
            X.0sa r0 = r0.A02
            java.lang.Object r0 = r0.invoke()
            X.07g r0 = (X.AnonymousClass07g) r0
            X.07f r4 = r0.getViewModelStore()
            return r4
        L_0x0325:
            java.lang.Object r0 = r13.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r0 = r0.invoke()
            X.7SD r0 = (X.AnonymousClass7SD) r0
            X.3t3 r0 = r0.A0P
            if (r0 == 0) goto L_0x0338
            java.lang.String r4 = X.C300965yF.A07(r0)
            return r4
        L_0x0338:
            r4 = 0
            return r4
        L_0x033a:
            java.lang.Object r0 = r13.A01
            X.9BB r0 = (X.AnonymousClass9BB) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.9BC r4 = new X.9BC
            r4.<init>(r0)
            return r4
        L_0x0346:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.9BB r4 = new X.9BB
            r4.<init>(r0)
            return r4
        L_0x0350:
            X.AnonymousClass9B9.A00()
            java.lang.Object r1 = r13.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.9BB r4 = X.AnonymousClass9BA.A00(r1)
            return r4
        L_0x0360:
            java.lang.Object r0 = r13.A01
            X.7TI r0 = (X.AnonymousClass7TI) r0
            X.7ST r4 = r0.A0s
            return r4
        L_0x0367:
            java.lang.Object r0 = r13.A01
            X.7TI r0 = (X.AnonymousClass7TI) r0
            X.7SQ r4 = r0.A0m
            return r4
        L_0x036e:
            java.lang.Object r0 = r13.A01
            X.0lg r0 = (X.0lg) r0
            X.3K8 r4 = new X.3K8
            r4.<init>(r0)
            return r4
        L_0x0378:
            java.lang.Object r0 = r13.A01
            X.7Sq r0 = (X.C331857Sq) r0
            X.2YM r4 = r0.A07
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9L0.invoke():java.lang.Object");
    }
}
