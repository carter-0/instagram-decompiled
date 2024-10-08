package X;

/* renamed from: X.715  reason: invalid class name */
public abstract class AnonymousClass715 {
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (r56 == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36330866363876155L) == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cb, code lost:
        if (r16 != false) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x023d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r36, android.os.Parcelable r37, androidx.fragment.app.FragmentActivity r38, X.AnonymousClass0iw r39, com.instagram.common.session.UserSession r40, X.2el r41, X.1Xj r42, X.C322496vv r43, X.C14029ToV r44, X.AnonymousClass713 r45, X.AnonymousClass714 r46, X.C323326xJ r47, X.C3250370u r48, com.instagram.profile.intf.UserDetailEntryInfo r49, com.instagram.user.model.User r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.util.List r55, boolean r56, boolean r57, boolean r58) {
        /*
            r0 = 0
            r6 = r48
            X.0qQ.A0B(r6, r0)
            r7 = 3
            r8 = r40
            r3 = r50
            boolean r1 = X.2R8.A04(r8, r3)
            r14 = r44
            if (r1 == 0) goto L_0x0074
            r16 = r56
        L_0x0015:
            X.716 r1 = new X.716
            r1.<init>()
            r9 = r55
            java.util.List r1 = X.00k.A0g(r9, r1)
            java.util.ArrayList r5 = X.00k.A0U(r1)
            android.widget.LinearLayout r4 = r6.A04
            X.C3250270t.A06(r4, r6)
            java.lang.String r2 = r8.A06
            java.lang.String r1 = r3.getId()
            boolean r11 = X.0qQ.A0K(r2, r1)
            if (r11 != 0) goto L_0x009c
            X.2f1 r1 = X.AnonymousClass2f1.A00(r8)
            boolean r1 = r1.A0Q(r3)
            if (r1 == 0) goto L_0x009c
            boolean r1 = r3.A2A()
            if (r1 == 0) goto L_0x009c
            boolean r1 = r3.A2L()
            if (r1 != 0) goto L_0x009c
            boolean r1 = r3.A1x()
            if (r1 != 0) goto L_0x009c
            r1 = 10
            int r1 = X.0Yv.A1E(r9, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator r10 = r9.iterator()
        L_0x0060:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0093
            java.lang.Object r1 = r10.next()
            X.70x r1 = (X.C3250670x) r1
            X.70y r1 = r1.Aiv()
            r2.add(r1)
            goto L_0x0060
        L_0x0074:
            X.4Cl r1 = r3.A03
            java.lang.Boolean r1 = r1.BAl()
            if (r1 == 0) goto L_0x0082
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x008c
        L_0x0082:
            java.util.List r1 = r14.A00
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0090
        L_0x008c:
            r16 = 1
            if (r56 != 0) goto L_0x0015
        L_0x0090:
            r16 = 0
            goto L_0x0015
        L_0x0093:
            java.util.List r2 = X.00k.A0a(r2)
            X.70y r1 = X.C3250770y.MESSAGE
            r2.contains(r1)
        L_0x009c:
            int r1 = r9.size()
            r35 = 0
            if (r1 <= r7) goto L_0x00a6
            r35 = 1
        L_0x00a6:
            if (r11 == 0) goto L_0x00b6
            X.0Tu r9 = X.0Tu.A05
            r1 = 36330866363876155(0x8112bb0000433b, double:3.0391244089473066E-306)
            boolean r1 = X.182.A06(r9, r8, r1)
            r15 = 1
            if (r1 != 0) goto L_0x00b7
        L_0x00b6:
            r15 = 0
        L_0x00b7:
            X.2eb r1 = r6.A06
            android.view.View r2 = r1.A01()
            r1 = 8
            r2.setVisibility(r1)
            int r2 = r5.size()
            r12 = 1
            if (r2 > r7) goto L_0x00cd
            r12 = 0
            r10 = 0
            if (r16 == 0) goto L_0x00ce
        L_0x00cd:
            r10 = 1
        L_0x00ce:
            java.util.List r9 = X.00k.A0d(r5, r7)
            int r2 = r9.size()
            r13 = 0
            int r30 = X.C3250470v.A00(r13, r2, r10, r0)
            java.util.Iterator r11 = r9.iterator()
        L_0x00df:
            boolean r2 = r11.hasNext()
            r22 = r47
            r20 = r39
            r17 = r36
            if (r2 == 0) goto L_0x0169
            java.lang.Object r10 = r11.next()
            X.70x r10 = (X.C3250670x) r10
            r21 = r42
            r29 = r54
            r28 = r53
            r27 = r52
            r25 = r49
            r18 = r17
            r19 = r20
            r20 = r8
            r23 = r6
            r24 = r10
            r26 = r3
            android.view.View r9 = X.C3250270t.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r2 = r10 instanceof X.AnonymousClass717
            if (r2 == 0) goto L_0x011a
            X.6rM r2 = r22.Bgg()
            r2.Eu8(r9)
        L_0x0116:
            r4.addView(r9)
            goto L_0x00df
        L_0x011a:
            boolean r2 = r10 instanceof X.AnonymousClass718
            if (r2 == 0) goto L_0x0126
            X.6rM r2 = r22.Bgg()
            r2.EuT(r9)
            goto L_0x0116
        L_0x0126:
            boolean r2 = r10 instanceof X.AnonymousClass719
            if (r2 == 0) goto L_0x0139
            X.6rM r2 = r22.Bgg()
            r2.Euv(r9)
            X.6rM r2 = r22.Bgg()
            r2.EC2(r9, r3)
            goto L_0x0116
        L_0x0139:
            boolean r2 = r10 instanceof X.AnonymousClass71A
            if (r2 == 0) goto L_0x0145
            X.6rM r2 = r22.Bgg()
            r2.EuS(r9)
            goto L_0x0116
        L_0x0145:
            boolean r2 = r10 instanceof X.AnonymousClass71B
            if (r2 == 0) goto L_0x0151
            X.6rM r2 = r22.Bgg()
            r2.EvE(r9)
            goto L_0x0116
        L_0x0151:
            boolean r2 = r10 instanceof X.C318626pG
            if (r2 == 0) goto L_0x015d
            X.710 r2 = r22.BhL()
            r2.Euj(r9)
            goto L_0x0116
        L_0x015d:
            boolean r2 = r10 instanceof X.C318746pS
            if (r2 == 0) goto L_0x0116
            X.6rM r2 = r22.Bgg()
            r2.EvL(r9)
            goto L_0x0116
        L_0x0169:
            r2 = r43
            if (r12 == 0) goto L_0x02ae
            X.71F r27 = r22.BwV()
            java.lang.String r28 = r3.getId()
            X.6rz r23 = new X.6rz
            r24 = r20
            r25 = r8
            r26 = r3
            r23.<init>(r24, r25, r26, r27, r28)
            X.Dej r9 = new X.Dej
            r24 = r9
            r25 = r17
            r26 = r8
            r27 = r22
            r28 = r3
            r29 = r23
            r24.<init>(r25, r26, r27, r28, r29)
            r5.add(r9)
            int r9 = r5.size()
            java.util.List r28 = r5.subList(r7, r9)
            java.util.Map r5 = r6.A07
            java.lang.String r7 = "overflow_menu"
            java.lang.Object r9 = r5.get(r7)
            java.util.Queue r9 = (java.util.Queue) r9
            if (r9 == 0) goto L_0x029f
            boolean r5 = r9.isEmpty()
            if (r5 != 0) goto L_0x029f
            java.lang.Object r11 = r9.poll()
            android.view.View r11 = (android.view.View) r11
        L_0x01b4:
            if (r11 == 0) goto L_0x02bd
            r5 = 2131429310(0x7f0b07be, float:1.848029E38)
            android.view.View r10 = r11.requireViewById(r5)
            X.0qQ.A07(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r10.setTag(r7)
            X.Dek r5 = new X.Dek
            r23 = r5
            r24 = r17
            r25 = r11
            r23.<init>(r24, r25, r26, r27, r28)
            X.AnonymousClass0fU.A00(r5, r11)
            X.1QG r5 = X.1QE.A0E()
            X.1QG r7 = X.1QG.A03
            if (r5 == r7) goto L_0x020e
            android.content.Context r12 = r10.getContext()
            X.1QE.A0F(r11)
            r7 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r9 = new int[]{r7}
            int[] r7 = new int[r0]
            int[][] r9 = new int[][]{r9, r7}
            X.0qQ.A0A(r12)
            int r7 = X.1QE.A07(r12, r5)
            int r7 = r12.getColor(r7)
            int r5 = X.1QE.A07(r12, r5)
            int r5 = r12.getColor(r5)
            int[] r7 = new int[]{r7, r5}
            android.content.res.ColorStateList r5 = new android.content.res.ColorStateList
            r5.<init>(r9, r7)
            r10.setImageTintList(r5)
        L_0x020e:
            r4.addView(r11)
        L_0x0211:
            android.widget.LinearLayout r4 = r6.A03
            X.71F r27 = r22.BwV()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r35)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r15)
            if (r56 == 0) goto L_0x029b
            X.6vv r5 = X.C322496vv.Open
            if (r2 == r5) goto L_0x022b
            if (r58 == 0) goto L_0x029b
            X.6vv r5 = X.C322496vv.Loading
            if (r2 != r5) goto L_0x029b
        L_0x022b:
            java.util.List r2 = r14.A00
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x029b
            int r1 = r4.getChildCount()
            r30 = r57
            if (r1 != 0) goto L_0x0250
            boolean r34 = r7.booleanValue()
            r31 = r17
            r32 = r13
            r33 = r4
            r36 = r30
            android.view.View r1 = X.C14033ToZ.A00(r31, r32, r33, r34, r35, r36)
            r4.addView(r1)
        L_0x0250:
            java.lang.String r28 = r3.getId()
            X.6rz r23 = new X.6rz
            r24 = r20
            r25 = r8
            r26 = r3
            r23.<init>(r24, r25, r26, r27, r28)
            boolean r36 = r6.booleanValue()
            X.Toa r27 = new X.Toa
            r33 = r41
            r35 = r51
            r31 = r27
            r32 = r8
            r34 = r23
            r31.<init>(r32, r33, r34, r35, r36)
            r1 = 0
            android.view.View r0 = r4.getChildAt(r0)
            java.lang.Object r0 = r0.getTag()
            r0.getClass()
            X.Tqg r0 = (X.C14144Tqg) r0
            boolean r31 = r7.booleanValue()
            X.ToZ r16 = X.C14148Tqk.A00
            r28 = r46
            r26 = r45
            r19 = r38
            r18 = r37
            r22 = r8
            r24 = r14
            r25 = r0
            r29 = r3
            r21 = r13
            r16.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x029b:
            r4.setVisibility(r1)
            return
        L_0x029f:
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r17)
            r9 = 2131628357(0x7f0e1145, float:1.8884004E38)
            android.view.ViewGroup r5 = r6.A02
            android.view.View r11 = r10.inflate(r9, r5, r0)
            goto L_0x01b4
        L_0x02ae:
            if (r16 == 0) goto L_0x0211
            r7 = r17
            r9 = r2
            r10 = r22
            r11 = r6
            r12 = r3
            com.instagram.follow.chaining.FollowChainingButton r11 = X.C3250270t.A03(r7, r8, r9, r10, r11, r12)
            goto L_0x020e
        L_0x02bd:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass715.A00(android.content.Context, android.os.Parcelable, androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.2el, X.1Xj, X.6vv, X.ToV, X.713, X.714, X.6xJ, X.70u, com.instagram.profile.intf.UserDetailEntryInfo, com.instagram.user.model.User, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean):void");
    }
}
