package X;

public final class MP8 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    public static Object A00(Object obj, MP8 mp8) {
        0qQ.A0B(obj, 0);
        return mp8.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MP8(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v88, types: [X.K8K, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x033a, code lost:
        r1.updateUi(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x053d, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0544, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0632, code lost:
        if (r1 != null) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0892, code lost:
        if (r1 != null) goto L_0x0894;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0894, code lost:
        r1.onClick(r13.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x08a3, code lost:
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x08a5, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x094b, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r0.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r3 = r18
            r13 = r19
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x08f2;
                case 1: goto L_0x08e0;
                case 2: goto L_0x0962;
                case 3: goto L_0x0962;
                case 4: goto L_0x08cf;
                case 5: goto L_0x089b;
                case 6: goto L_0x08a8;
                case 7: goto L_0x0886;
                case 8: goto L_0x094c;
                case 9: goto L_0x092d;
                case 10: goto L_0x0865;
                case 11: goto L_0x07e6;
                case 12: goto L_0x07d9;
                case 13: goto L_0x07c4;
                case 14: goto L_0x07b1;
                case 15: goto L_0x0798;
                case 16: goto L_0x0779;
                case 17: goto L_0x074f;
                case 18: goto L_0x0746;
                case 19: goto L_0x0738;
                case 20: goto L_0x072c;
                case 21: goto L_0x06c4;
                case 22: goto L_0x0652;
                case 23: goto L_0x064a;
                case 24: goto L_0x0009;
                case 25: goto L_0x0009;
                case 26: goto L_0x063f;
                case 27: goto L_0x062e;
                case 28: goto L_0x0613;
                case 29: goto L_0x060c;
                case 30: goto L_0x05f3;
                case 31: goto L_0x05af;
                case 32: goto L_0x0920;
                case 33: goto L_0x059a;
                case 34: goto L_0x058e;
                case 35: goto L_0x0574;
                case 36: goto L_0x055a;
                case 37: goto L_0x054c;
                case 38: goto L_0x0529;
                case 39: goto L_0x08ff;
                case 40: goto L_0x051b;
                case 41: goto L_0x04c9;
                case 42: goto L_0x04ac;
                case 43: goto L_0x033f;
                case 44: goto L_0x01c8;
                case 45: goto L_0x01a6;
                case 46: goto L_0x01db;
                case 47: goto L_0x01c8;
                case 48: goto L_0x01a6;
                case 49: goto L_0x0015;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r3.A01
            X.VPq r0 = (X.C17289VPq) r0
            X.UbS r0 = r0.A00
        L_0x000f:
            r0.A05()
        L_0x0012:
            X.0gF r13 = X.C60340gF.A00
        L_0x0014:
            return r13
        L_0x0015:
            X.Jua r13 = (X.C60978Jua) r13
            java.lang.Object r1 = r3.A01
            X.K8K r1 = (X.K8K) r1
            X.JXP r2 = r13.A00
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.List r6 = r13.A06
            boolean r3 = X.AnonymousClass7TE.A1b(r6)
            if (r3 != 0) goto L_0x0031
            java.util.List r3 = r13.A0A
            boolean r3 = X.AnonymousClass7TE.A1b(r3)
            if (r3 == 0) goto L_0x0042
        L_0x0031:
            android.content.Context r4 = r1.requireContext()
            r3 = 2131963906(0x7f133002, float:1.9564579E38)
            java.lang.String r5 = r4.getString(r3)
            r4 = 0
            java.lang.String r3 = "IN_THIS_ROOM_KEY"
            X.C64813LiY.A00(r3, r5, r4, r0)
        L_0x0042:
            com.instagram.user.model.User r8 = r13.A02
            if (r8 == 0) goto L_0x0054
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            java.lang.String r10 = r13.A03
            r11 = 0
            X.WSZ r7 = new X.WSZ
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12)
            r0.add(r7)
        L_0x0054:
            java.util.List r3 = r13.A0A
            java.util.Iterator r5 = r3.iterator()
        L_0x005a:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x006a
            com.instagram.user.model.User r4 = X.JTP.A0d(r5)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.JTU.A1H(r4, r3, r0)
            goto L_0x005a
        L_0x006a:
            java.util.Iterator r5 = r6.iterator()
        L_0x006e:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x007e
            com.instagram.user.model.User r4 = X.JTP.A0d(r5)
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            X.JTU.A1H(r4, r3, r0)
            goto L_0x006e
        L_0x007e:
            java.util.List r3 = r13.A07
            java.util.Iterator r6 = r3.iterator()
        L_0x0084:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x00b7
            java.lang.Object r5 = r6.next()
            X.L7H r5 = (X.L7H) r5
            X.0eM r3 = r1.A01
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r3)
            r11 = 0
            X.0qQ.A0B(r3, r11)
            com.instagram.user.model.User r8 = r5.A00
            if (r8 != 0) goto L_0x00aa
            X.17i r4 = X.17h.A00(r3)
            java.lang.String r3 = r5.A01
            com.instagram.user.model.User r8 = r4.A02(r3)
            if (r8 == 0) goto L_0x0084
        L_0x00aa:
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            r10 = 0
            X.WSZ r7 = new X.WSZ
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12)
            r0.add(r7)
            goto L_0x0084
        L_0x00b7:
            java.util.List r3 = r13.A08
            java.util.Iterator r5 = r3.iterator()
        L_0x00bd:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x00cd
            com.instagram.user.model.User r4 = X.JTP.A0d(r5)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            X.JTU.A1H(r4, r3, r0)
            goto L_0x00bd
        L_0x00cd:
            X.6go r4 = r1.A00
            r6 = 0
            if (r4 != 0) goto L_0x00d6
            java.lang.String r8 = "viewMode"
            goto L_0x053d
        L_0x00d6:
            X.6go r3 = X.C313666go.BROADCASTER
            r12 = 0
            if (r4 != r3) goto L_0x0106
            java.lang.String r7 = r13.A04
            if (r7 == 0) goto L_0x0106
            java.lang.String r5 = r13.A05
            if (r5 == 0) goto L_0x0106
            android.content.Context r4 = r1.requireContext()
            r3 = 2131963905(0x7f133001, float:1.9564577E38)
            java.lang.String r4 = r4.getString(r3)
            java.lang.String r3 = "EARNINGS_TITLE_KEY"
            X.C64813LiY.A00(r3, r4, r6, r0)
            android.content.Context r4 = r1.requireContext()
            r3 = 2131963900(0x7f132ffc, float:1.9564566E38)
            java.lang.String r4 = X.DbW.A0h(r4, r5, r3)
            X.Li0 r3 = new X.Li0
            r3.<init>(r7, r4)
            r0.add(r3)
        L_0x0106:
            java.util.List r5 = r13.A0B
            boolean r3 = X.AnonymousClass7TE.A1b(r5)
            if (r3 != 0) goto L_0x0116
            java.util.List r3 = r13.A09
            boolean r3 = X.AnonymousClass7TE.A1b(r3)
            if (r3 == 0) goto L_0x012e
        L_0x0116:
            android.content.Context r4 = r1.requireContext()
            r3 = 2131963984(0x7f133050, float:1.9564737E38)
            java.lang.String r4 = r4.getString(r3)
            X.4Yx r3 = r13.A01
            if (r3 == 0) goto L_0x0129
            java.lang.String r6 = X.Dba.A0Y(r1, r3)
        L_0x0129:
            java.lang.String r3 = "VIEWING_LIST_KEY"
            X.C64813LiY.A00(r3, r4, r6, r0)
        L_0x012e:
            java.util.List r3 = r13.A09
            java.util.Iterator r6 = r3.iterator()
        L_0x0134:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x016b
            com.instagram.user.model.User r8 = X.JTP.A0d(r6)
            java.lang.String r4 = r8.getId()
            X.0eM r3 = r1.A01
            java.lang.String r3 = X.DbU.A0u(r3)
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x0168
            java.lang.Integer r9 = X.AnonymousClass05K.A02
        L_0x0150:
            r10 = 0
            boolean r3 = r13.A0C
            if (r3 == 0) goto L_0x015e
            java.lang.Integer r4 = r8.A0M()
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r11 = 1
            if (r4 == r3) goto L_0x015f
        L_0x015e:
            r11 = 0
        L_0x015f:
            X.WSZ r7 = new X.WSZ
            r7.<init>(r8, r9, r10, r11, r12)
            r0.add(r7)
            goto L_0x0134
        L_0x0168:
            java.lang.Integer r9 = X.AnonymousClass05K.A03
            goto L_0x0150
        L_0x016b:
            java.util.Iterator r5 = r5.iterator()
        L_0x016f:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x033a
            com.instagram.user.model.User r8 = X.JTP.A0d(r5)
            java.lang.String r4 = r8.getId()
            X.0eM r3 = r1.A01
            java.lang.String r3 = X.DbU.A0u(r3)
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x01a3
            java.lang.Integer r9 = X.AnonymousClass05K.A1F
        L_0x018b:
            r10 = 0
            boolean r3 = r13.A0C
            if (r3 == 0) goto L_0x0199
            java.lang.Integer r4 = r8.A0M()
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r11 = 1
            if (r4 == r3) goto L_0x019a
        L_0x0199:
            r11 = 0
        L_0x019a:
            X.WSZ r7 = new X.WSZ
            r7.<init>(r8, r9, r10, r11, r12)
            r0.add(r7)
            goto L_0x016f
        L_0x01a3:
            java.lang.Integer r9 = X.AnonymousClass05K.A0j
            goto L_0x018b
        L_0x01a6:
            X.OID r4 = X.DbV.A0L(r13)
            r0 = 2131626121(0x7f0e0889, float:1.887947E38)
            X.DbX.A1N(r4, r0)
            X.72b r2 = new X.72b
            r2.<init>()
            java.lang.Object r0 = r3.A01
            android.content.Context r1 = X.DbT.A07(r0)
            r0 = 2130970208(0x7f040660, float:1.754912E38)
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            r2.A00 = r0
            r4.A05 = r2
            goto L_0x0012
        L_0x01c8:
            java.lang.Object r1 = A00(r13, r3)
            X.MYR r1 = (X.MYR) r1
            X.2t9 r0 = r1.getAdapter()
            int r0 = r0.A02(r13)
            r1.notifyItemChanged(r0)
            goto L_0x0012
        L_0x01db:
            X.Jua r13 = (X.C60978Jua) r13
            java.lang.Object r1 = r3.A01
            X.K8L r1 = (X.K8L) r1
            X.JXP r2 = r13.A00
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.List r6 = r13.A06
            boolean r3 = X.AnonymousClass7TE.A1b(r6)
            if (r3 != 0) goto L_0x01f7
            java.util.List r3 = r13.A0A
            boolean r3 = X.AnonymousClass7TE.A1b(r3)
            if (r3 == 0) goto L_0x0208
        L_0x01f7:
            android.content.Context r4 = r1.requireContext()
            r3 = 2131963906(0x7f133002, float:1.9564579E38)
            java.lang.String r5 = r4.getString(r3)
            r4 = 0
            java.lang.String r3 = "IN_THIS_ROOM_KEY"
            X.C64813LiY.A00(r3, r5, r4, r0)
        L_0x0208:
            com.instagram.user.model.User r8 = r13.A02
            if (r8 == 0) goto L_0x021a
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            java.lang.String r10 = r13.A03
            r11 = 0
            X.WSZ r7 = new X.WSZ
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12)
            r0.add(r7)
        L_0x021a:
            java.util.List r3 = r13.A0A
            java.util.Iterator r5 = r3.iterator()
        L_0x0220:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0230
            com.instagram.user.model.User r4 = X.JTP.A0d(r5)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.JTU.A1H(r4, r3, r0)
            goto L_0x0220
        L_0x0230:
            java.util.Iterator r5 = r6.iterator()
        L_0x0234:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0244
            com.instagram.user.model.User r4 = X.JTP.A0d(r5)
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            X.JTU.A1H(r4, r3, r0)
            goto L_0x0234
        L_0x0244:
            java.util.List r3 = r13.A07
            java.util.Iterator r6 = r3.iterator()
        L_0x024a:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x027d
            java.lang.Object r5 = r6.next()
            X.L7H r5 = (X.L7H) r5
            X.0eM r3 = r1.A02
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r3)
            r11 = 0
            X.0qQ.A0B(r3, r11)
            com.instagram.user.model.User r8 = r5.A00
            if (r8 != 0) goto L_0x0270
            X.17i r4 = X.17h.A00(r3)
            java.lang.String r3 = r5.A01
            com.instagram.user.model.User r8 = r4.A02(r3)
            if (r8 == 0) goto L_0x024a
        L_0x0270:
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            r10 = 0
            X.WSZ r7 = new X.WSZ
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12)
            r0.add(r7)
            goto L_0x024a
        L_0x027d:
            java.util.List r3 = r13.A08
            java.util.Iterator r5 = r3.iterator()
        L_0x0283:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0293
            com.instagram.user.model.User r4 = X.JTP.A0d(r5)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            X.JTU.A1H(r4, r3, r0)
            goto L_0x0283
        L_0x0293:
            X.6go r4 = r1.A00
            java.lang.String r8 = "viewMode"
            r6 = 0
            if (r4 == 0) goto L_0x053d
            X.6go r3 = X.C313666go.BROADCASTER
            r11 = 0
            if (r4 != r3) goto L_0x02ca
            java.lang.String r7 = r13.A04
            if (r7 == 0) goto L_0x02ca
            java.lang.String r5 = r13.A05
            if (r5 == 0) goto L_0x02ca
            android.content.Context r4 = r1.requireContext()
            r3 = 2131963905(0x7f133001, float:1.9564577E38)
            java.lang.String r4 = r4.getString(r3)
            java.lang.String r3 = "EARNINGS_TITLE_KEY"
            X.C64813LiY.A00(r3, r4, r6, r0)
            android.content.Context r4 = r1.requireContext()
            r3 = 2131963900(0x7f132ffc, float:1.9564566E38)
            java.lang.String r4 = X.DbW.A0h(r4, r5, r3)
            X.Li0 r3 = new X.Li0
            r3.<init>(r7, r4)
            r0.add(r3)
        L_0x02ca:
            java.util.List r3 = r13.A0B
            boolean r3 = X.AnonymousClass7TE.A1b(r3)
            if (r3 != 0) goto L_0x02da
            java.util.List r3 = r13.A09
            boolean r3 = X.AnonymousClass7TE.A1b(r3)
            if (r3 == 0) goto L_0x02fd
        L_0x02da:
            android.content.Context r4 = r1.requireContext()
            r3 = 2131963984(0x7f133050, float:1.9564737E38)
            java.lang.String r5 = r4.getString(r3)
            X.6go r4 = r1.A00
            if (r4 == 0) goto L_0x053d
            X.6go r3 = X.C313666go.VIEWER
            if (r4 != r3) goto L_0x02f8
            android.content.Context r4 = r1.requireContext()
            r3 = 2131963908(0x7f133004, float:1.9564583E38)
            java.lang.String r6 = r4.getString(r3)
        L_0x02f8:
            java.lang.String r3 = "VIEWING_LIST_KEY"
            X.C64813LiY.A00(r3, r5, r6, r0)
        L_0x02fd:
            java.util.List r3 = r13.A09
            java.util.Iterator r5 = r3.iterator()
        L_0x0303:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x033a
            com.instagram.user.model.User r7 = X.JTP.A0d(r5)
            java.lang.String r4 = r7.getId()
            X.0eM r3 = r1.A02
            java.lang.String r3 = X.DbU.A0u(r3)
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x0337
            java.lang.Integer r8 = X.AnonymousClass05K.A02
        L_0x031f:
            r9 = 0
            boolean r3 = r13.A0C
            if (r3 == 0) goto L_0x032d
            java.lang.Integer r4 = r7.A0M()
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r10 = 1
            if (r4 == r3) goto L_0x032e
        L_0x032d:
            r10 = 0
        L_0x032e:
            X.WSZ r6 = new X.WSZ
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r6)
            goto L_0x0303
        L_0x0337:
            java.lang.Integer r8 = X.AnonymousClass05K.A03
            goto L_0x031f
        L_0x033a:
            r1.updateUi(r2, r0)
            goto L_0x0012
        L_0x033f:
            X.JtD r13 = (X.C60893JtD) r13
            java.lang.Integer r2 = r13.A00
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            r5 = 0
            r4 = 1
            java.lang.Object r3 = r3.A01
            X.LEJ r3 = (X.LEJ) r3
            X.0eM r1 = r3.A0A
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            if (r2 == r6) goto L_0x04a0
            r0.setClickable(r4)
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            X.AnonymousClass7TG.A1A(r0, r4)
        L_0x035d:
            X.0eM r0 = r3.A07
            java.lang.Object r1 = r0.getValue()
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            boolean r0 = X.AnonymousClass7TF.A1W(r2, r6)
            android.view.View r1 = (android.view.View) r1
            android.view.View[] r1 = new android.view.View[]{r1}
            if (r0 == 0) goto L_0x049b
            r0 = 0
            X.C294975nL.A04(r0, r1, r4)
        L_0x0375:
            X.0eM r0 = r3.A09
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            boolean r10 = X.AnonymousClass7TF.A1W(r2, r6)
            if (r0 == 0) goto L_0x03b4
            r9 = 1065353216(0x3f800000, float:1.0)
            X.5nL r8 = X.JTP.A0c(r0, r4)
            float r7 = X.AnonymousClass7TE.A02(r0)
            if (r10 == 0) goto L_0x0498
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            float r0 = X.AnonymousClass7TE.A01(r1, r0)
        L_0x0398:
            r8.A0R(r7, r0)
            r1 = 0
            if (r10 == 0) goto L_0x03a0
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x03a0:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.A0P(r1, r0)
            if (r10 != 0) goto L_0x03a8
            r9 = 0
        L_0x03a8:
            r8.A0Q(r9, r0)
            r0 = 200(0xc8, double:9.9E-322)
            X.5nL r0 = r8.A0C(r0)
            r0.A0H()
        L_0x03b4:
            X.0eM r0 = r3.A08
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            boolean r8 = X.AnonymousClass7TF.A1W(r2, r6)
            if (r0 == 0) goto L_0x03f3
            r7 = 1065353216(0x3f800000, float:1.0)
            X.5nL r6 = X.JTP.A0c(r0, r4)
            float r2 = X.AnonymousClass7TE.A02(r0)
            if (r8 == 0) goto L_0x0495
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            float r0 = X.AnonymousClass7TE.A01(r1, r0)
        L_0x03d7:
            r6.A0R(r2, r0)
            r1 = 0
            if (r8 == 0) goto L_0x03df
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x03df:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.A0P(r1, r0)
            if (r8 != 0) goto L_0x03e7
            r7 = 0
        L_0x03e7:
            r6.A0Q(r7, r0)
            r0 = 200(0xc8, double:9.9E-322)
            X.5nL r0 = r6.A0C(r0)
            r0.A0H()
        L_0x03f3:
            android.view.View r2 = r3.A00
            if (r2 == 0) goto L_0x0402
            boolean r0 = r13.A06
            r1 = r0 ^ 1
            r0 = 0
            if (r1 == 0) goto L_0x03ff
            r0 = 4
        L_0x03ff:
            r2.setVisibility(r0)
        L_0x0402:
            X.LGO r7 = r3.A03
            if (r7 == 0) goto L_0x0451
            boolean r0 = r13.A07
            r7.A02(r0)
            android.view.View r6 = r7.A00
            if (r6 == 0) goto L_0x0451
            X.4DH r8 = r7.A04
            android.content.res.Resources r1 = X.DbV.A05(r8)
            r0 = 2131165600(0x7f0701a0, float:1.7945422E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = X.DbV.A05(r8)
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 - r0
            int r0 = r2 / 2
            int r0 = -r0
            float r2 = (float) r0
            X.8Yd r1 = X.C357488Yc.A03
            com.instagram.common.session.UserSession r0 = r7.A06
            X.8Yc r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0493
            X.W0T r0 = r0.A00()
            if (r0 == 0) goto L_0x0493
            boolean r0 = r0.A0I()
            if (r0 != r4) goto L_0x0493
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            float r0 = X.AnonymousClass7TE.A01(r1, r0)
        L_0x044d:
            float r2 = r2 + r0
            r6.setTranslationY(r2)
        L_0x0451:
            X.0eM r0 = r3.A04
            android.view.View r2 = X.AnonymousClass7TE.A0c(r0)
            boolean r0 = r13.A02
            r1 = r0 ^ 1
            r0 = 0
            if (r1 == 0) goto L_0x045f
            r0 = 4
        L_0x045f:
            r2.setVisibility(r0)
            X.0eM r0 = r3.A06
            android.view.View r2 = X.AnonymousClass7TE.A0c(r0)
            boolean r0 = r13.A04
            r1 = r0 ^ 1
            r0 = 0
            if (r1 == 0) goto L_0x0470
            r0 = 4
        L_0x0470:
            r2.setVisibility(r0)
            X.0eM r0 = r3.A05
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            boolean r0 = r13.A03
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0480
            r5 = 4
        L_0x0480:
            r1.setVisibility(r5)
            android.view.View r1 = r3.A01
            boolean r0 = r13.A05
            X.JTU.A0m(r1, r0, r4)
            android.view.View r1 = r3.A02
            boolean r0 = r13.A01
            X.JTU.A0m(r1, r0, r4)
            goto L_0x0012
        L_0x0493:
            r0 = 0
            goto L_0x044d
        L_0x0495:
            r0 = 0
            goto L_0x03d7
        L_0x0498:
            r0 = 0
            goto L_0x0398
        L_0x049b:
            X.C294975nL.A05(r1, r4)
            goto L_0x0375
        L_0x04a0:
            r0.setClickable(r5)
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            X.AnonymousClass7TE.A1U(r0, r4)
            goto L_0x035d
        L_0x04ac:
            X.OID r13 = (X.OID) r13
            r4 = 0
            X.0qQ.A0B(r13, r4)
            r0 = 2131626121(0x7f0e0889, float:1.887947E38)
            X.DbX.A1N(r13, r0)
            java.lang.Object r0 = r3.A01
            android.content.Context r3 = X.DbT.A08(r0)
            r2 = 3
            r1 = 1
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>((android.content.Context) r3, (int) r2, (int) r1, (boolean) r4)
            r13.A01 = r0
            goto L_0x0012
        L_0x04c9:
            X.JwK r13 = (X.C61082JwK) r13
            java.lang.Object r7 = r3.A01
            X.Kch r7 = (X.C62247Kch) r7
            android.view.View r1 = r7.A02
            boolean r3 = r13.A01
            r2 = 8
            int r0 = X.DbW.A01(r3)
            r1.setVisibility(r0)
            X.M0V r0 = r7.A00
            java.lang.Object r6 = r13.A00
            X.M0V r6 = (X.M0V) r6
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x0012
            if (r6 == 0) goto L_0x04fa
            X.LEV r4 = X.C63562KzB.A01
            X.0eM r0 = r7.A05
            java.lang.Object r8 = r0.getValue()
            X.JpY r8 = (X.C60687JpY) r8
            r9 = 1
            X.4DH r5 = r7.A04
            r4.A00(r5, r6, r7, r8, r9)
        L_0x04fa:
            X.JlV r1 = r7.A07
            X.M0V r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x0509
            r1.A00 = r6
            r1.A01()
        L_0x0509:
            X.0eM r0 = r7.A04
            android.view.View r0 = X.JTR.A0W(r0)
            if (r6 == 0) goto L_0x0514
            if (r3 == 0) goto L_0x0514
            r2 = 0
        L_0x0514:
            r0.setVisibility(r2)
            r7.A00 = r6
            goto L_0x0012
        L_0x051b:
            X.JTb r13 = (X.C59671JTb) r13
            java.lang.Object r0 = r3.A01
            X.M0b r0 = (X.C65809M0b) r0
            X.0qQ.A0A(r13)
            X.C65809M0b.A01(r13, r0)
            goto L_0x0012
        L_0x0529:
            X.Jvq r13 = (X.C61052Jvq) r13
            if (r13 == 0) goto L_0x0012
            java.lang.Object r1 = r13.A01
            X.X1q r1 = (X.C20864X1q) r1
            if (r1 == 0) goto L_0x0012
            java.lang.Object r0 = r3.A01
            com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment r0 = (com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment) r0
            X.LdG r0 = r0.A04
            if (r0 != 0) goto L_0x0545
            java.lang.String r8 = "igLiveQuestionsController"
        L_0x053d:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0545:
            X.MXE r0 = r0.A00
            r0.CJ5(r1)
            goto L_0x0012
        L_0x054c:
            X.Jvc r13 = (X.C61038Jvc) r13
            java.lang.Object r0 = A00(r13, r3)
            X.M0i r0 = (X.C65816M0i) r0
            if (r0 == 0) goto L_0x0012
            r0.A03 = r13
            goto L_0x0012
        L_0x055a:
            X.XAh r13 = (X.C21028XAh) r13
            java.lang.Object r0 = r3.A01
            X.K6W r0 = (X.K6W) r0
            X.LB2 r1 = r0.overlayBurnInView
            if (r1 == 0) goto L_0x0012
            if (r13 == 0) goto L_0x0012
            int r0 = r13.C3N()
            r1.A01 = r0
            int r0 = r13.C3K()
            r1.A00 = r0
            goto L_0x0012
        L_0x0574:
            X.4ch r13 = (X.C268064ch) r13
            java.lang.Object r3 = A00(r13, r3)
            X.5Oz r3 = (X.C284945Oz) r3
            long r0 = r13.Bwh()
            long r1 = X.C289155d7.A01(r0)
            X.5bF r0 = new X.5bF
            r0.<init>(r1)
            r3.Epw(r0)
            goto L_0x0012
        L_0x058e:
            boolean r1 = X.AnonymousClass7TE.A1a(r13)
            java.lang.Object r0 = r3.A01
            X.E6D r0 = (X.E6D) r0
            r0.A00 = r1
            goto L_0x0012
        L_0x059a:
            java.lang.Object r0 = A00(r13, r3)
            X.E6D r0 = (X.E6D) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.DkI r0 = (X.C46729DkI) r0
            X.05G r0 = r0.A04
            r0.Epw(r13)
            goto L_0x0012
        L_0x05af:
            X.L2N r13 = (X.L2N) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            boolean r0 = r13 instanceof X.KXC
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r3.A01
            X.36g r0 = (X.C2370836g) r0
            com.instagram.user.model.User r5 = r0.A00
            X.KXC r13 = (X.KXC) r13
            java.lang.Object r4 = r13.A00
            X.Jvm r4 = (X.C61048Jvm) r4
            java.lang.Object r0 = r4.A03
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x05d1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x096d
            X.0eP r0 = X.JTO.A1A(r3)
            java.lang.Object r2 = r0.A00
            java.lang.String r1 = X.DbS.A0q(r2)
            boolean r1 = X.DbV.A1Z(r5, r1)
            if (r1 == 0) goto L_0x05ef
            com.instagram.user.model.FollowStatus r0 = r5.B6o()
            X.0eP r0 = X.AnonymousClass7TE.A1L(r2, r0)
        L_0x05ef:
            r11.add(r0)
            goto L_0x05d1
        L_0x05f3:
            java.lang.Object r3 = r3.A01
            X.UtQ r3 = (X.C16351UtQ) r3
            android.content.Context r2 = r3.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.0qQ.A0C(r2, r0)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            r1 = 29
            X.MP8 r0 = new X.MP8
            r0.<init>(r3, r1)
            X.C17113VIj.A00(r2, r0)
            goto L_0x0012
        L_0x060c:
            java.lang.Object r0 = r3.A01
            X.UtQ r0 = (X.C16351UtQ) r0
            X.V2e r1 = r0.A02
            goto L_0x0634
        L_0x0613:
            java.lang.Object r0 = r3.A01
            X.UtP r0 = (X.C16350UtP) r0
            X.ViT r5 = r0.A02
            X.VYs r0 = r0.A01
            com.instagram.user.model.UpcomingEvent r4 = r0.A01
            java.lang.String r3 = r0.A02
            X.1Xj r2 = r0.A00
            r0 = 0
            X.VYs r1 = new X.VYs
            r1.<init>(r2, r4, r3, r0)
            X.UtS r0 = X.C16353UtS.A00
            r5.A00(r0, r1)
            goto L_0x0012
        L_0x062e:
            java.lang.Object r1 = r3.A01
            X.V2e r1 = (X.C16701V2e) r1
            if (r1 == 0) goto L_0x0012
        L_0x0634:
            boolean r0 = r1 instanceof X.C16347UtM
            if (r0 == 0) goto L_0x0012
            X.UtM r1 = (X.C16347UtM) r1
            r1.A00()
            goto L_0x0012
        L_0x063f:
            java.lang.Object r0 = r3.A01
            X.VPp r0 = (X.C17288VPp) r0
            X.UbS r0 = r0.A00
            r0.A06()
            goto L_0x0012
        L_0x064a:
            java.lang.Object r0 = r3.A01
            X.VPn r0 = (X.C17286VPn) r0
            X.UbS r0 = r0.A00
            goto L_0x000f
        L_0x0652:
            java.util.List r0 = X.JTQ.A0i(r13)
            java.lang.Object r4 = r3.A01
            com.instagram.ui.widget.gallery.GalleryView r4 = (com.instagram.ui.widget.gallery.GalleryView) r4
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r0.iterator()
        L_0x0662:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x06a9
            java.lang.Object r5 = r6.next()
            X.8Xf r5 = (X.C357268Xf) r5
            java.lang.Integer r2 = r5.CAp()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r1 = "Required value was null."
            if (r2 != r0) goto L_0x0693
            com.instagram.ui.widget.mediapicker.Folder r0 = r5.ACT()
            if (r0 == 0) goto L_0x0990
            java.lang.String r1 = r5.getName()
            java.util.List r0 = r0.A01()
            java.util.List r0 = X.C64151LQo.A01(r0)
            X.LR6 r2 = new X.LR6
            r2.<init>((java.lang.String) r1, (java.util.List) r0)
        L_0x068f:
            r3.add(r2)
            goto L_0x0662
        L_0x0693:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x0662
            X.Lzo r0 = r5.ACa()
            if (r0 == 0) goto L_0x0995
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = r0.A01
            X.LR6 r2 = new X.LR6
            r2.<init>((java.lang.String) r1, (java.lang.String) r0)
            goto L_0x068f
        L_0x06a9:
            X.JeM r0 = r4.A0C
            if (r0 == 0) goto L_0x06b0
            r0.A03(r3)
        L_0x06b0:
            X.MT3 r1 = r4.A0E
            if (r1 == 0) goto L_0x06bd
            X.JeM r0 = r4.A0C
            if (r0 == 0) goto L_0x06c2
            X.LR6 r0 = r0.A00
        L_0x06ba:
            r1.DHS(r0, r3)
        L_0x06bd:
            com.instagram.ui.widget.gallery.GalleryView.A07(r4)
            goto L_0x0012
        L_0x06c2:
            r0 = 0
            goto L_0x06ba
        L_0x06c4:
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r1 = r3.A01
            com.instagram.ui.widget.gallery.GalleryView r1 = (com.instagram.ui.widget.gallery.GalleryView) r1
            X.JeM r4 = r1.A0C
            if (r4 == 0) goto L_0x0012
            X.JhD r0 = r1.A0D
            if (r0 == 0) goto L_0x06e0
            X.0Ud r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.LR6 r0 = (X.LR6) r0
            if (r0 == 0) goto L_0x06e0
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x06fe
        L_0x06e0:
            X.JhD r0 = r1.A0D
            r3 = 1
            if (r0 == 0) goto L_0x0012
            X.0Ud r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.LR6 r0 = (X.LR6) r0
            if (r0 == 0) goto L_0x0012
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r1)
            java.lang.String r1 = r0.A01
            r0 = 2131962528(0x7f132aa0, float:1.9561784E38)
            boolean r0 = X.JTT.A1Z(r2, r1, r0)
            if (r0 != r3) goto L_0x0012
        L_0x06fe:
            if (r13 != 0) goto L_0x0702
            X.0sn r13 = X.0sn.A00
        L_0x0702:
            r3 = 0
            X.0qQ.A0B(r13, r3)
            X.LR6 r0 = r4.A00
            if (r0 == 0) goto L_0x0724
            java.util.List r2 = r0.A02
            r2.clear()
            java.util.Iterator r1 = r13.iterator()
        L_0x0713:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0724
            java.lang.Object r0 = r1.next()
            X.0qQ.A0B(r0, r3)
            r2.add(r0)
            goto L_0x0713
        L_0x0724:
            r0 = -1340503922(0xffffffffb019888e, float:-5.585513E-10)
            X.0fE.A00(r4, r0)
            goto L_0x0012
        L_0x072c:
            java.lang.Object r0 = r3.A01
            com.instagram.ui.widget.gallery.GalleryView r0 = (com.instagram.ui.widget.gallery.GalleryView) r0
            com.instagram.ui.widget.gallery.GalleryView.A07(r0)
            com.instagram.ui.widget.gallery.GalleryView.A08(r0)
            goto L_0x0012
        L_0x0738:
            X.Juv r13 = (X.C60999Juv) r13
            java.lang.Object r0 = r3.A01
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r0 = (com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView) r0
            X.0qQ.A0A(r13)
            r0.setGeneratedVideoTimelineBitmaps(r13)
            goto L_0x0012
        L_0x0746:
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            X.C63138Ks6.A00(r0)
            goto L_0x0012
        L_0x074f:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            java.lang.Object r0 = A00(r13, r3)
            X.ALH r0 = (X.ALH) r0
            X.ACy r3 = r0.A03
            int r0 = X.C39877ACy.A00(r13, r3)
            r0 = r0 | 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r2 = r3.A00
            r2.put(r13, r0)
            int r1 = X.C39877ACy.A00(r13, r3)
            r0 = 2
            if (r1 != r0) goto L_0x0012
            X.0sP r0 = r3.A01
            r0.invoke(r13)
            r2.remove(r13)
            goto L_0x0012
        L_0x0779:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            r2 = 0
            X.0qQ.A0B(r13, r2)
            java.lang.Object r1 = r3.A01
            X.ALH r1 = (X.ALH) r1
            X.A95 r0 = r1.A04
            X.A5k[] r0 = r0.A05
            r0 = r0[r2]
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            r0.incrementAndGet()
            r13.recycle()
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A07
            r0.incrementAndGet()
            goto L_0x0012
        L_0x0798:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            java.lang.Object r0 = A00(r13, r3)
            X.ALH r0 = (X.ALH) r0
            X.A95 r0 = r0.A04
            r1 = 1
            X.A5k[] r0 = r0.A05
            r0 = r0[r1]
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            r0.incrementAndGet()
            r13.recycle()
            goto L_0x0012
        L_0x07b1:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L_0x0012
            java.lang.Object r1 = r3.A01
            X.LZP r1 = (X.LZP) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0012
            X.MUw r0 = r1.A0B
            r0.D6S(r13)
            goto L_0x0012
        L_0x07c4:
            java.lang.Object r0 = r3.A01
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x0012
            java.util.ArrayList r0 = r0.A3E()
            if (r0 == 0) goto L_0x0012
            java.util.Collection r0 = X.0u4.A00(r0)
            r0.remove(r13)
            goto L_0x0012
        L_0x07d9:
            com.instagram.user.model.Product r13 = (com.instagram.user.model.Product) r13
            java.lang.Object r0 = A00(r13, r3)
            com.instagram.tagging.activity.TaggingActivity r0 = (com.instagram.tagging.activity.TaggingActivity) r0
            com.instagram.tagging.activity.TaggingActivity.A0M(r0, r13)
            goto L_0x0012
        L_0x07e6:
            X.VR1 r13 = (X.VR1) r13
            java.lang.Object r1 = A00(r13, r3)
            X.Urh r1 = (X.C16279Urh) r1
            X.0eM r0 = r1.A05
            java.lang.Object r4 = r0.getValue()
            X.Vi8 r4 = (X.C17917Vi8) r4
            if (r4 == 0) goto L_0x0012
            X.Vzv r0 = r1.A04
            X.Vl7 r0 = r0.A01
            if (r0 == 0) goto L_0x084d
            boolean r3 = r0.A0J
        L_0x0800:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r2 = r13.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x084f
            android.content.Context r1 = r4.A05
            int r0 = r4.A03
            X.9Y4 r3 = new X.9Y4
            r3.<init>(r1, r0)
            int r1 = r13.A00
            if (r1 == 0) goto L_0x0844
            r0 = 1
            if (r1 == r0) goto L_0x083b
            r0 = 2
            if (r1 != r0) goto L_0x0012
            X.AnonymousClass9Y4.A02(r3)
            android.content.Context r1 = r3.A00
            r0 = 2131951902(0x7f13011e, float:1.9540232E38)
        L_0x0825:
            java.lang.String r0 = r1.getString(r0)
            r3.A0B(r0)
            android.app.NotificationManager r2 = r4.A04
            if (r2 == 0) goto L_0x0012
            int r1 = r4.A02
            android.app.Notification r0 = r3.A03()
            r2.notify(r1, r0)
            goto L_0x0012
        L_0x083b:
            X.AnonymousClass9Y4.A02(r3)
            android.content.Context r1 = r3.A00
            r0 = 2131951899(0x7f13011b, float:1.9540226E38)
            goto L_0x0825
        L_0x0844:
            X.AnonymousClass9Y4.A02(r3)
            android.content.Context r1 = r3.A00
            r0 = 2131951900(0x7f13011c, float:1.9540228E38)
            goto L_0x0825
        L_0x084d:
            r3 = 0
            goto L_0x0800
        L_0x084f:
            int r1 = r13.A00
            r0 = 4
            if (r1 == r0) goto L_0x0860
            r0 = 3
            if (r1 != r0) goto L_0x085d
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 == r0) goto L_0x0860
            goto L_0x0012
        L_0x085d:
            r0 = 7
            if (r1 != r0) goto L_0x0012
        L_0x0860:
            r4.A00(r3)
            goto L_0x0012
        L_0x0865:
            X.VR1 r13 = (X.VR1) r13
            java.lang.Object r0 = A00(r13, r3)
            X.W0T r0 = (X.W0T) r0
            X.05G r1 = r0.A00
            java.lang.Object r12 = r1.getValue()
            X.V4Y r12 = (X.V4Y) r12
            r14 = 0
            r15 = r14
            r16 = r14
            r17 = r14
            X.V4Y r0 = r12.A01(r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0012
            r1.Epw(r0)
            goto L_0x0012
        L_0x0886:
            X.2WA r13 = (X.AnonymousClass2WA) r13
            java.lang.Object r2 = A00(r13, r3)
            X.GaK r2 = (X.C52646GaK) r2
            android.view.animation.OvershootInterpolator r0 = X.C52646GaK.A0u
            android.view.View$OnClickListener r1 = r2.A01
            if (r1 == 0) goto L_0x08a3
        L_0x0894:
            android.view.View r0 = r13.A00
            r1.onClick(r0)
            goto L_0x0012
        L_0x089b:
            X.2WA r13 = (X.AnonymousClass2WA) r13
            java.lang.Object r2 = A00(r13, r3)
            X.GaK r2 = (X.C52646GaK) r2
        L_0x08a3:
            android.view.View$OnClickListener r1 = r2.A00
            if (r1 == 0) goto L_0x0012
            goto L_0x0894
        L_0x08a8:
            X.Hlx r13 = (X.C55700Hlx) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            X.02Z r2 = r13.A01
            android.view.View r1 = r13.A00
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r13.A02
            r2.A0Y(r1, r0)
            java.lang.Object r1 = r3.A01
            X.GaK r1 = (X.C52646GaK) r1
            android.view.animation.OvershootInterpolator r0 = X.C52646GaK.A0u
            java.lang.String r2 = r1.A06
            if (r2 == 0) goto L_0x0012
            r0 = 16
            X.04x r1 = new X.04x
            r1.<init>(r0, r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r13.A02
            r0.addAction(r1)
            goto L_0x0012
        L_0x08cf:
            java.lang.Object r1 = r3.A01
            X.GaK r1 = (X.C52646GaK) r1
            android.view.animation.OvershootInterpolator r0 = X.C52646GaK.A0u
            X.GZG r0 = r1.A04
            X.0sa r0 = r0.A0A
            if (r0 == 0) goto L_0x0012
            r0.invoke()
            goto L_0x0012
        L_0x08e0:
            X.Hk7 r13 = (X.C55587Hk7) r13
            java.lang.Object r1 = A00(r13, r3)
            X.2Wa r1 = (X.2Wa) r1
            java.lang.String r0 = r13.A01
            X.0qQ.A06(r0)
            r1.A01(r0)
            goto L_0x0012
        L_0x08f2:
            java.lang.Object r0 = r3.A01
            X.Gu1 r0 = (X.C53772Gu1) r0
            X.0sP r1 = r0.A01
            java.util.List r0 = r0.A00
            r1.invoke(r0)
            goto L_0x0012
        L_0x08ff:
            boolean r5 = X.AnonymousClass7TE.A1a(r13)
            java.lang.Object r0 = r3.A01
            X.M0a r0 = (X.C65808M0a) r0
            X.Kcv r0 = r0.A0A
            X.0eM r0 = r0.A07
            X.2YL r4 = X.DbS.A0H(r0)
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 11
            X.MGB r0 = new X.MGB
            r0.<init>(r4, r2, r1, r5)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r0 = 1
            goto L_0x0947
        L_0x0920:
            com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
            java.lang.Object r0 = A00(r13, r3)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = X.DbV.A1a(r13, r0)
            goto L_0x0947
        L_0x092d:
            com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r2 = r3.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.0qQ.A0B(r2, r0)
            X.1as r1 = X.1as.A04
            X.0qQ.A07(r1)
            com.instagram.model.direct.DirectShareTarget r0 = X.AnonymousClass6UD.A00(r13, r0)
            boolean r0 = r1.A0I(r2, r0)
        L_0x0947:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            return r13
        L_0x094c:
            r1 = 0
            X.0qQ.A0B(r13, r1)
            java.lang.Object r0 = r3.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.0qQ.A0B(r0, r1)
            X.6W7 r0 = X.AnonymousClass6W6.A00(r0)
            java.util.Map r0 = r0.A00
            java.lang.Object r13 = r0.get(r13)
            return r13
        L_0x0962:
            java.lang.Object r1 = r3.A01
            X.GaK r1 = (X.C52646GaK) r1
            android.view.animation.OvershootInterpolator r0 = X.C52646GaK.A0u
            X.GZG r0 = r1.A04
            java.lang.String r13 = r0.A01
            return r13
        L_0x096d:
            int r12 = r4.A01
            java.lang.Object r6 = r4.A04
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r7 = r4.A02
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.String r10 = r4.A08
            java.lang.Object r8 = r4.A05
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r5 = r4.A06
            com.instagram.api.schemas.GraphGuardianContent r5 = (com.instagram.api.schemas.GraphGuardianContent) r5
            java.lang.Object r9 = r4.A07
            java.lang.Integer r9 = (java.lang.Integer) r9
            X.Jvm r4 = new X.Jvm
            r4.<init>((com.instagram.api.schemas.GraphGuardianContent) r5, (X.1Xj) r6, (java.lang.Integer) r7, (java.lang.Integer) r8, (java.lang.Integer) r9, (java.lang.String) r10, (java.util.List) r11, (int) r12)
            X.KXC r13 = new X.KXC
            r13.<init>(r4)
            return r13
        L_0x0990:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0995:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MP8.invoke(java.lang.Object):java.lang.Object");
    }
}
