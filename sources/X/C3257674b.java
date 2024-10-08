package X;

/* renamed from: X.74b  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3257674b implements AnonymousClass7B2 {
    public final /* synthetic */ C327367Am A00;

    public /* synthetic */ C3257674b(C327367Am r1) {
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r1.equals(r7.getId()) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (r15.getId().equals(r7.getId()) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r1.equals(r15.getId()) == false) goto L_0x003f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence AXW(android.content.Context r17, com.instagram.common.session.UserSession r18, X.AnonymousClass9HC r19, X.AnonymousClass7LQ r20, X.17i r21) {
        /*
            r16 = this;
            r0 = r18
            java.lang.String r1 = r0.A06
            r6 = r20
            X.3su r5 = r6.A0e
            X.7SD r2 = r6.A0G
            boolean r12 = r2.A0r
            com.instagram.user.model.User r0 = r6.A0K
            if (r0 == 0) goto L_0x0163
            java.util.Map r2 = r2.A0f
            java.lang.String r0 = r0.getId()
            java.lang.Object r4 = r2.get(r0)
            X.9Is r4 = (X.C376629Is) r4
        L_0x001c:
            java.lang.String r0 = r5.A1u
            r2 = r21
            com.instagram.user.model.User r15 = r2.A02(r0)
            X.3tI r0 = r5.A0P()
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = r0.A0U
            com.instagram.user.model.User r7 = r2.A02(r0)
        L_0x0030:
            r3 = 1
            r2 = 0
            if (r15 == 0) goto L_0x003f
            java.lang.String r0 = r15.getId()
            boolean r0 = r1.equals(r0)
            r14 = 1
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r14 = 0
        L_0x0040:
            if (r7 == 0) goto L_0x004d
            java.lang.String r0 = r7.getId()
            boolean r0 = r1.equals(r0)
            r13 = 1
            if (r0 != 0) goto L_0x004e
        L_0x004d:
            r13 = 0
        L_0x004e:
            if (r15 == 0) goto L_0x0061
            if (r7 == 0) goto L_0x0061
            java.lang.String r1 = r15.getId()
            java.lang.String r0 = r7.getId()
            boolean r0 = r1.equals(r0)
            r11 = 1
            if (r0 != 0) goto L_0x0062
        L_0x0061:
            r11 = 0
        L_0x0062:
            java.lang.String r8 = ""
            r10 = r8
            if (r7 == 0) goto L_0x015d
            java.lang.String r9 = X.AnonymousClass50n.A08(r7)
        L_0x006b:
            if (r15 == 0) goto L_0x0071
            java.lang.String r8 = X.AnonymousClass50n.A08(r15)
        L_0x0071:
            r7 = r17
            if (r14 == 0) goto L_0x00c1
            if (r13 == 0) goto L_0x00b4
            r0 = 2131959774(0x7f131fde, float:1.9556198E38)
            if (r12 == 0) goto L_0x007f
            r0 = 2131959754(0x7f131fca, float:1.9556157E38)
        L_0x007f:
            java.lang.String r1 = r7.getString(r0)
        L_0x0083:
            boolean r0 = r6.A0Z
            if (r0 != 0) goto L_0x00a4
            int r4 = r5.A01
            r0 = 0
            if (r4 <= 0) goto L_0x008d
            r0 = 1
        L_0x008d:
            r4 = 2
            if (r0 == 0) goto L_0x00a5
            r5 = 2131964456(0x7f133228, float:1.9565694E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r1
            r0 = 2131959745(0x7f131fc1, float:1.955614E38)
        L_0x009a:
            java.lang.String r0 = r7.getString(r0)
            r4[r3] = r0
            java.lang.String r10 = r7.getString(r5, r4)
        L_0x00a4:
            return r10
        L_0x00a5:
            X.7LQ r0 = r6.A0E
            if (r0 == 0) goto L_0x0166
            r5 = 2131964456(0x7f133228, float:1.9565694E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r1
            r0 = 2131959755(0x7f131fcb, float:1.955616E38)
            goto L_0x009a
        L_0x00b4:
            r1 = 2131959772(0x7f131fdc, float:1.9556194E38)
            if (r12 == 0) goto L_0x00bc
            r1 = 2131959753(0x7f131fc9, float:1.9556155E38)
        L_0x00bc:
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            goto L_0x00d4
        L_0x00c1:
            if (r13 == 0) goto L_0x00e1
            if (r12 == 0) goto L_0x00d9
            X.0qQ.A0B(r7, r2)
            X.0qQ.A0B(r8, r3)
            if (r4 != 0) goto L_0x013d
            r1 = 2131959751(0x7f131fc7, float:1.9556151E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
        L_0x00d4:
            java.lang.String r1 = r7.getString(r1, r0)
            goto L_0x0083
        L_0x00d9:
            r1 = 2131959773(0x7f131fdd, float:1.9556196E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            goto L_0x00d4
        L_0x00e1:
            if (r12 == 0) goto L_0x00fd
            X.0qQ.A0B(r7, r2)
            X.0qQ.A0B(r8, r3)
            if (r4 != 0) goto L_0x0105
            if (r11 == 0) goto L_0x00f5
            r1 = 2131959752(0x7f131fc8, float:1.9556153E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            goto L_0x00d4
        L_0x00f5:
            r1 = 2131959750(0x7f131fc6, float:1.955615E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r9}
            goto L_0x00d4
        L_0x00fd:
            r1 = 2131959771(0x7f131fdb, float:1.9556192E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r9}
            goto L_0x00d4
        L_0x0105:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r8)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r1 = r1.append(r0)
            java.lang.String r0 = r4.A03
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            X.0qQ.A07(r0)
            r1 = 2131959752(0x7f131fc8, float:1.9556153E38)
            if (r11 != 0) goto L_0x0158
            r1 = 2131959750(0x7f131fc6, float:1.955615E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r9}
        L_0x0129:
            java.lang.String r0 = r7.getString(r1, r0)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            int r0 = r8.length()
            int r0 = r0 + 1
            X.C66866Me1.A00(r7, r1, r4, r0)
            goto L_0x0083
        L_0x013d:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r8)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r1 = r1.append(r0)
            java.lang.String r0 = r4.A03
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            X.0qQ.A07(r0)
            r1 = 2131959751(0x7f131fc7, float:1.9556151E38)
        L_0x0158:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            goto L_0x0129
        L_0x015d:
            r9 = r8
            goto L_0x006b
        L_0x0160:
            r7 = 0
            goto L_0x0030
        L_0x0163:
            r4 = 0
            goto L_0x001c
        L_0x0166:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3257674b.AXW(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.17i):java.lang.CharSequence");
    }
}
