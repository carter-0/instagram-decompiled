package X;

/* renamed from: X.9M6  reason: invalid class name */
public final class AnonymousClass9M6 extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9M6(AnonymousClass9J2 r2, C243613Zn r3, int i, int i2) {
        super(1);
        this.A00 = i2;
        if (5 - i2 != 0) {
            this.A03 = r3;
            this.A02 = r2;
        } else {
            this.A02 = r3;
            this.A03 = r2;
        }
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r1 >= r3.A01) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r1 <= r3.A01) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r3 = r18
            r11 = r19
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x01b3;
                case 1: goto L_0x019f;
                case 2: goto L_0x0240;
                case 3: goto L_0x006a;
                case 4: goto L_0x0259;
                case 5: goto L_0x0271;
                case 6: goto L_0x0287;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.5j0 r11 = (X.C292475j0) r11
            r4 = 0
            X.0qQ.A0B(r11, r4)
            java.lang.Object r1 = r3.A02
            java.lang.Integer r0 = r11.A01
            r5 = 1
            if (r1 != r0) goto L_0x0068
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0043
            java.lang.Object r0 = r3.A03
            X.2xg r0 = (X.C234332xg) r0
            X.2xf r0 = r0.A04
            java.lang.Object r2 = r11.A02
            X.2xS r1 = r0.A00
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.2rR r0 = r1.A0D
            int[] r0 = r0.getModelIndex(r2)
            if (r0 == 0) goto L_0x003e
            r1 = r0[r4]
            r0 = r0[r5]
            int r1 = r1 + r0
            int r1 = r1 - r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x003e
            int r0 = r3.A01
            if (r1 >= r0) goto L_0x0068
        L_0x003e:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r5)
        L_0x0042:
            return r15
        L_0x0043:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0068
            java.lang.Object r0 = r3.A03
            X.2xg r0 = (X.C234332xg) r0
            X.2xf r0 = r0.A04
            java.lang.Object r2 = r11.A02
            X.2xS r1 = r0.A00
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.2rR r0 = r1.A0D
            int[] r0 = r0.getModelIndex(r2)
            if (r0 == 0) goto L_0x003e
            r1 = r0[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x003e
            int r0 = r3.A01
            if (r1 <= r0) goto L_0x0068
            goto L_0x003e
        L_0x0068:
            r5 = 0
            goto L_0x003e
        L_0x006a:
            android.content.Context r11 = (android.content.Context) r11
            r5 = 0
            X.0qQ.A0B(r11, r5)
            java.lang.Object r0 = r3.A03
            X.3gf r0 = (X.C247633gf) r0
            java.lang.Object r4 = r3.A02
            X.1Xj r4 = (X.1Xj) r4
            int r12 = r3.A01
            boolean r1 = r4.CcK()
            X.0Pl r0 = r0.A01
            if (r1 == 0) goto L_0x0173
            android.util.LruCache r8 = r0.A06
            java.lang.Object r15 = r8.get(r4)
            if (r15 != 0) goto L_0x0042
            com.instagram.common.session.UserSession r7 = r0.A0K
            r9 = 1
            r0 = 4
            X.0qQ.A0B(r7, r0)
            boolean r0 = r4.CcK()
            java.lang.String r15 = ""
            if (r0 == 0) goto L_0x00b9
            X.1Xy r0 = r4.A0C
            java.util.List r1 = r0.BxO()
            if (r1 == 0) goto L_0x00b9
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b9
            java.lang.Object r2 = r1.get(r5)
            X.3yf r2 = (X.C258223yf) r2
            com.instagram.api.schemas.SocialContextType r13 = r2.BxW()
            com.instagram.api.schemas.SocialContextType r14 = com.instagram.api.schemas.SocialContextType.FOLLOWED_BY
            if (r13 == r14) goto L_0x00bd
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.FOLLOWER_COUNT
            if (r13 == r0) goto L_0x00bd
        L_0x00b9:
            r8.put(r4, r15)
            return r15
        L_0x00bd:
            int r10 = r2.getSocialContextUsersCount()
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.FOLLOWER_COUNT
            if (r13 != r0) goto L_0x00e9
            android.content.res.Resources r2 = r11.getResources()
            X.0qQ.A07(r2)
            r1 = 2131820716(0x7f1100ac, float:1.9274155E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.String r0 = X.C253673rC.A04(r2, r0, r12, r9, r5)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            android.text.Spanned r0 = X.0bC.A02(r2, r0, r1, r10)
            r6.append(r0)
        L_0x00e7:
            r15 = r6
            goto L_0x00b9
        L_0x00e9:
            java.util.List r0 = r2.BxQ()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b9
            if (r10 < r9) goto L_0x00b9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r0 = r2.BxQ()
            java.util.Iterator r3 = r0.iterator()
        L_0x0102:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x011c
            java.lang.Object r0 = r3.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r2 = r0.getUsername()
            r0 = 64
            java.lang.String r0 = X.002.A0D(r2, r0)
            r1.add(r0)
            goto L_0x0102
        L_0x011c:
            if (r10 != r9) goto L_0x0146
            android.content.res.Resources r0 = r11.getResources()
            X.0qQ.A07(r0)
            X.C243483Yy.A03(r0, r6, r13, r1, r9)
        L_0x0128:
            X.3q3 r1 = new X.3q3
            r1.<init>(r6, r7)
            java.lang.String r0 = "sans-serif-medium"
            r1.A0F = r0
            r0 = -1
            r1.A01 = r0
            r1.A0Q = r9
            X.3q4 r0 = new X.3q4
            r0.<init>(r7, r4, r5)
            r1.A03(r0)
            android.text.SpannableStringBuilder r6 = r1.A00()
            X.0qQ.A07(r6)
            goto L_0x00e7
        L_0x0146:
            android.content.res.Resources r3 = r11.getResources()
            X.0qQ.A07(r3)
            if (r13 != r14) goto L_0x0128
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0128
            int r10 = r10 - r9
            r2 = 2131820718(0x7f1100ae, float:1.9274159E38)
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.String r0 = X.C253673rC.A04(r3, r0, r12, r9, r5)
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            android.text.Spanned r0 = X.0bC.A02(r3, r0, r2, r10)
            r6.append(r0)
            goto L_0x0128
        L_0x0173:
            android.util.LruCache r3 = r0.A0G
            java.lang.Object r15 = r3.get(r4)
            if (r15 != 0) goto L_0x0042
            com.instagram.common.session.UserSession r2 = r0.A0K
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.1Xy r0 = r4.A0C
            java.util.List r1 = r0.BxO()
            java.lang.String r15 = ""
            if (r1 == 0) goto L_0x019b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x019b
            java.lang.Object r0 = r1.get(r5)
            X.3yf r0 = (X.C258223yf) r0
            android.text.SpannableStringBuilder r15 = X.C270624h2.A00(r11, r0, r2, r4)
        L_0x019b:
            r3.put(r4, r15)
            return r15
        L_0x019f:
            java.lang.Number r11 = (java.lang.Number) r11
            int r4 = r11.intValue()
            java.lang.Object r0 = r3.A03
            com.instagram.api.tigon.IGTigonQuickPerformanceLogger r0 = (com.instagram.api.tigon.IGTigonQuickPerformanceLogger) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = r0.logger
            java.lang.Object r0 = r3.A02
            int r1 = r0.hashCode()
            goto L_0x0252
        L_0x01b3:
            X.5Pk r11 = (X.C285035Pk) r11
            java.lang.Object r7 = r3.A03
            X.5Xd r7 = (X.C286625Xd) r7
            int r0 = r7.A00
            int r6 = r3.A01
            if (r0 != r6) goto L_0x029c
            java.lang.Object r8 = r3.A02
            X.0vu r8 = (X.0vu) r8
            X.0vu r0 = r7.A02
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 == 0) goto L_0x029c
            boolean r0 = r11 instanceof X.AnonymousClass5Wn
            if (r0 == 0) goto L_0x029c
            long[] r5 = r8.A03
            int r0 = r5.length
            int r4 = r0 + -2
            if (r4 < 0) goto L_0x029c
            r3 = 0
        L_0x01d7:
            r16 = r5[r3]
            r9 = -1
            long r9 = r9 ^ r16
            r0 = 7
            long r9 = r9 << r0
            long r9 = r9 & r16
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x023b
            int r0 = r3 - r4
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r2 = 8 - r0
            r9 = 0
        L_0x01f4:
            if (r9 >= r2) goto L_0x0237
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r16
            r12 = 128(0x80, double:6.32E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0230
            int r10 = r3 << 3
            int r10 = r10 + r9
            java.lang.Object[] r0 = r8.A04
            r1 = r0[r10]
            int[] r0 = r8.A02
            r0 = r0[r10]
            if (r0 == r6) goto L_0x0230
            r13 = r11
            X.5Wn r13 = (X.AnonymousClass5Wn) r13
            X.5Wr r12 = r13.A0C
            r12.A02(r1, r7)
            boolean r0 = r1 instanceof X.AnonymousClass5TY
            if (r0 == 0) goto L_0x022d
            X.0vr r0 = r12.A00
            boolean r0 = r0.A04(r1)
            if (r0 != 0) goto L_0x0226
            X.5Wr r0 = r13.A0B
            r0.A00(r1)
        L_0x0226:
            X.0vr r0 = r7.A03
            if (r0 == 0) goto L_0x022d
            r0.A07(r1)
        L_0x022d:
            r8.A05(r10)
        L_0x0230:
            r0 = 8
            long r16 = r16 >> r0
            int r9 = r9 + 1
            goto L_0x01f4
        L_0x0237:
            r0 = 8
            if (r2 != r0) goto L_0x029c
        L_0x023b:
            if (r3 == r4) goto L_0x029c
            int r3 = r3 + 1
            goto L_0x01d7
        L_0x0240:
            java.lang.Number r11 = (java.lang.Number) r11
            int r4 = r11.intValue()
            java.lang.Object r0 = r3.A03
            com.instagram.common.api.base.CacheBehaviorLogger r0 = (com.instagram.common.api.base.CacheBehaviorLogger) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = r0.logger
            java.lang.Object r0 = r3.A02
            X.1QS r0 = (X.1QS) r0
            int r1 = r0.A04
        L_0x0252:
            int r0 = r3.A01
            short r0 = (short) r0
            r2.markerEnd(r4, r1, r0)
            goto L_0x029c
        L_0x0259:
            java.lang.Object r0 = r3.A03
            X.9J2 r0 = (X.AnonymousClass9J2) r0
            java.lang.Object r0 = r0.A01
            X.9Ib r0 = (X.C376459Ib) r0
            java.lang.Object r2 = r0.A00
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r3.A02
            int r0 = r3.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r1, r0)
            goto L_0x029c
        L_0x0271:
            java.lang.Object r0 = r3.A02
            X.3Zn r0 = (X.C243613Zn) r0
            X.0eM r0 = r0.A08
            java.lang.Object r2 = r0.getValue()
            X.3aX r2 = (X.C244033aX) r2
            java.lang.Object r1 = r3.A03
            X.9J2 r1 = (X.AnonymousClass9J2) r1
            int r0 = r3.A01
            r2.A02(r1, r0)
            goto L_0x029c
        L_0x0287:
            java.lang.Object r0 = r3.A03
            X.3Zn r0 = (X.C243613Zn) r0
            X.0eM r0 = r0.A08
            java.lang.Object r2 = r0.getValue()
            X.3aX r2 = (X.C244033aX) r2
            java.lang.Object r1 = r3.A02
            X.9J2 r1 = (X.AnonymousClass9J2) r1
            int r0 = r3.A01
            r2.A01(r1, r0)
        L_0x029c:
            X.0gF r15 = X.C60340gF.A00
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9M6.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9M6(int i, int i2, Object obj, Object obj2) {
        super(1);
        this.A00 = i2;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = obj2;
    }
}
