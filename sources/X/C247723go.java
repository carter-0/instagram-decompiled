package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3go  reason: invalid class name and case insensitive filesystem */
public final class C247723go {
    public final UserSession A00;
    public final C2364033p A01;
    public final 0Pl A02;

    public C247723go(UserSession userSession, 0Pl r3, C2364033p r4) {
        0qQ.A0B(r4, 2);
        this.A00 = userSession;
        this.A01 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0251, code lost:
        if (r2.length() != 0) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r2.A01.A01(r10) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02cd, code lost:
        if (X.AnonymousClass3WP.A08(r2.A00, r10) != false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass9IP A00(android.content.Context r25, X.1Xj r26, X.AnonymousClass3W1 r27) {
        /*
            r24 = this;
            r9 = 0
            r11 = r25
            X.0qQ.A0B(r11, r9)
            r12 = 1
            r10 = r26
            X.0qQ.A0B(r10, r12)
            r8 = 2
            r13 = r27
            X.0qQ.A0B(r13, r8)
            r0 = 1
            boolean r23 = com.facebook.systrace.Systrace.A0E(r0)
            if (r23 == 0) goto L_0x0022
            r1 = -1283797952(0xffffffffb37acc40, float:-5.8393425E-8)
            java.lang.String r0 = "LabelBelowCommentUseCase#getUiState"
            X.0fS.A01(r0, r1)
        L_0x0022:
            X.3gp r0 = r10.A1T()
            r22 = 1
            r2 = r24
            if (r0 == 0) goto L_0x02c5
            boolean r0 = r0.A0h
            if (r0 != r12) goto L_0x02c5
        L_0x0030:
            r21 = 1
        L_0x0032:
            boolean r20 = r10.A4d()
            X.0Pl r7 = r2.A02
            boolean r0 = r13.A2a
            if (r0 == 0) goto L_0x0046
            X.33p r0 = r2.A01
            boolean r0 = r0.A01(r10)
            r19 = 1
            if (r0 == 0) goto L_0x0048
        L_0x0046:
            r19 = 0
        L_0x0048:
            X.33p r3 = r2.A01
            java.lang.Integer r1 = r3.A00(r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r18 = 0
            if (r1 != r0) goto L_0x0056
            r18 = 1
        L_0x0056:
            java.lang.Integer r1 = r3.A00(r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r17 = 0
            if (r1 != r0) goto L_0x0062
            r17 = 1
        L_0x0062:
            X.1i7 r0 = r10.A1X()
            java.util.List r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x006c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02c2
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.3gp r0 = (X.C247733gp) r0
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x006c
        L_0x007d:
            X.3gp r1 = (X.C247733gp) r1
            if (r1 == 0) goto L_0x02ba
            boolean r6 = r1.A0h
        L_0x0083:
            com.instagram.common.session.UserSession r14 = r2.A00
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            X.1sy r1 = r13.A0o
            X.1sy r0 = X.1sy.A03
            if (r1 != r0) goto L_0x00be
            X.1Xy r0 = r10.A0C
            java.lang.String r0 = r0.BIH()
            if (r0 == 0) goto L_0x00be
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00be
            X.1Xy r0 = r10.A0C
            java.lang.String r3 = r0.BIH()
        L_0x00a4:
            X.AnonymousClass539.A00(r5, r3)
        L_0x00a7:
            if (r21 != 0) goto L_0x00ad
            if (r20 != 0) goto L_0x00ad
            r22 = 0
        L_0x00ad:
            r2 = 3
            X.9IP r1 = new X.9IP
            r0 = r22
            r1.<init>((int) r2, (java.lang.Object) r5, (boolean) r0)
            if (r23 == 0) goto L_0x00bd
            r0 = -1867494400(0xffffffff90b04c00, float:-6.9536856E-29)
            X.0fS.A00(r0)
        L_0x00bd:
            return r1
        L_0x00be:
            X.1sy r0 = r13.A0o
            boolean r0 = X.1sx.A0O(r10, r0)
            if (r0 != 0) goto L_0x0147
            long r3 = r10.A1A()
            r2 = 0
            r15 = 0
            if (r18 == 0) goto L_0x02a3
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x02a3
            double r0 = (double) r3
            java.lang.String r4 = X.1G0.A03(r11, r0)
        L_0x00d8:
            if (r19 == 0) goto L_0x012c
            java.lang.String r0 = r10.A2f()
            if (r0 == 0) goto L_0x012c
            int r0 = r0.length()
            if (r0 == 0) goto L_0x012c
            android.util.LruCache r3 = r7.A05
            java.lang.Object r2 = r3.get(r10)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 != 0) goto L_0x012c
            X.1Xy r0 = r10.A0C
            X.3dh r0 = r0.B2s()
            if (r0 == 0) goto L_0x02a0
            java.lang.Boolean r1 = r0.CSs()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            boolean r0 = X.0qQ.A0K(r1, r0)
        L_0x0104:
            com.instagram.common.session.UserSession r1 = r7.A0K
            if (r0 == 0) goto L_0x0255
            java.lang.String r0 = r10.A2f()
            r0.getClass()
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r0)
            r0 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r0 = X.2Yu.A0F(r11, r0)
            X.9oy r15 = new X.9oy
            r15.<init>(r1, r10, r0)
            int r1 = r2.length()
            r0 = 33
            r2.setSpan(r15, r9, r1, r0)
        L_0x0129:
            r3.put(r10, r2)
        L_0x012c:
            if (r4 == 0) goto L_0x024b
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0244
            if (r2 == 0) goto L_0x0244
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0244
            r5.append(r4)
            java.lang.String r0 = "  •  "
            r5.append(r0)
        L_0x0144:
            r5.append(r2)
        L_0x0147:
            if (r6 == 0) goto L_0x01a7
            X.3W8 r0 = r13.A3b
            java.lang.Object r1 = r0.A00
            X.3W9 r1 = (X.AnonymousClass3W9) r1
            X.0qQ.A0B(r1, r8)
            java.lang.String r2 = r10.BpP()
            int r0 = r1.A00
            java.lang.String r6 = X.002.A0O(r2, r0)
            android.util.LruCache r4 = r7.A0I
            java.lang.Object r3 = r4.get(r6)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 != 0) goto L_0x01a4
            com.instagram.common.session.UserSession r2 = r7.A0K
            r0 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r7 = X.2Yu.A0F(r11, r0)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            int r13 = r1.ordinal()
            if (r13 == r9) goto L_0x023f
            r0 = 3
            if (r13 == r0) goto L_0x023a
            if (r13 == r12) goto L_0x023a
            if (r13 != r8) goto L_0x018b
            r0 = 2131965496(0x7f133638, float:1.9567804E38)
        L_0x0184:
            java.lang.String r0 = r11.getString(r0)
            r3.append(r0)
        L_0x018b:
            X.3W9 r0 = X.AnonymousClass3W9.Loading
            if (r1 == r0) goto L_0x01a1
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r2)
            X.538 r2 = new X.538
            r2.<init>(r0, r10, r1, r7)
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r2, r9, r1, r0)
        L_0x01a1:
            r4.put(r6, r3)
        L_0x01a4:
            X.AnonymousClass539.A00(r5, r3)
        L_0x01a7:
            boolean r0 = r10.A6K()
            if (r0 == 0) goto L_0x01b8
            X.1Xy r0 = r10.A0C
            java.lang.String r0 = r0.Axm()
            if (r0 == 0) goto L_0x02d1
            X.AnonymousClass539.A00(r5, r0)
        L_0x01b8:
            boolean r0 = X.C231122qu.A0N(r14, r10)
            if (r0 == 0) goto L_0x01cc
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131952216(0x7f130258, float:1.9540868E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            X.AnonymousClass539.A00(r5, r0)
        L_0x01cc:
            boolean r0 = r10.A4d()
            if (r0 == 0) goto L_0x0200
            r0 = 2131965658(0x7f1336da, float:1.9568132E38)
            java.lang.String r0 = r11.getString(r0)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            boolean r0 = r10.A4d()
            if (r0 == 0) goto L_0x01fd
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r14)
            r0 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r0 = X.2Yu.A0F(r11, r0)
            X.5qQ r2 = new X.5qQ
            r2.<init>(r1, r10, r0)
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r2, r9, r1, r0)
        L_0x01fd:
            X.AnonymousClass539.A00(r5, r3)
        L_0x0200:
            boolean r0 = r10.A5u()
            if (r0 == 0) goto L_0x00a7
            r0 = 2131971236(0x7f134ca4, float:1.9579446E38)
            java.lang.String r0 = r11.getString(r0)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36323500495350984(0x810c0800062cc8, double:3.0344662040320166E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x00a4
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r14)
            r0 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r0 = X.2Yu.A0F(r11, r0)
            X.ELN r2 = new X.ELN
            r2.<init>(r1, r10, r0)
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r2, r9, r1, r0)
            goto L_0x00a4
        L_0x023a:
            r0 = 2131973006(0x7f13538e, float:1.9583036E38)
            goto L_0x0184
        L_0x023f:
            r0 = 2131973013(0x7f135395, float:1.958305E38)
            goto L_0x0184
        L_0x0244:
            if (r1 == 0) goto L_0x024b
            r5.append(r4)
            goto L_0x0147
        L_0x024b:
            if (r2 == 0) goto L_0x0147
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0144
            goto L_0x0147
        L_0x0255:
            r0 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r15 = X.2Yu.A0F(r11, r0)
            java.lang.String r2 = r10.A2f()
            r2.getClass()
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r2)
            X.3q3 r2 = new X.3q3
            r2.<init>(r0, r1)
            r2.A0L = r12
            r2.A0M = r12
            r2.A01 = r15
            r2.A03 = r15
            X.3q6 r0 = new X.3q6
            r0.<init>(r1, r10, r9)
            r2.A02(r0)
            X.3q4 r0 = new X.3q4
            r0.<init>(r1, r10, r9)
            r2.A03(r0)
            android.text.SpannableStringBuilder r2 = r2.A00()
            int r1 = r2.length()
            int r1 = r1 - r12
        L_0x028e:
            if (r1 < 0) goto L_0x0129
            char r15 = r2.charAt(r1)
            r0 = 64
            if (r15 != r0) goto L_0x029d
            int r0 = r1 + 1
            r2.delete(r1, r0)
        L_0x029d:
            int r1 = r1 + -1
            goto L_0x028e
        L_0x02a0:
            r0 = 0
            goto L_0x0104
        L_0x02a3:
            if (r17 == 0) goto L_0x02b7
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x02b7
            android.content.res.Resources r15 = r11.getResources()
            X.0qQ.A07(r15)
            double r0 = (double) r3
            java.lang.String r4 = X.1G0.A09(r15, r0)
            goto L_0x00d8
        L_0x02b7:
            r4 = r2
            goto L_0x00d8
        L_0x02ba:
            com.instagram.common.session.UserSession r0 = r2.A00
            boolean r6 = X.AnonymousClass3WP.A08(r0, r10)
            goto L_0x0083
        L_0x02c2:
            r1 = 0
            goto L_0x007d
        L_0x02c5:
            com.instagram.common.session.UserSession r0 = r2.A00
            boolean r0 = X.AnonymousClass3WP.A08(r0, r10)
            r21 = 0
            if (r0 == 0) goto L_0x0032
            goto L_0x0030
        L_0x02d1:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247723go.A00(android.content.Context, X.1Xj, X.3W1):X.9IP");
    }
}
