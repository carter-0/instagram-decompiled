package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7KI  reason: invalid class name */
public final class AnonymousClass7KI implements C329677Ju {
    public boolean A00;
    public final AnonymousClass7I3 A01;
    public final C329327Il A02;
    public final C329317Ik A03;
    public final C62320sa A04;
    public final C62320sa A05;
    public final UserSession A06;
    public final AnonymousClass7JZ A07;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (X.AnonymousClass78V.A00(r4, r5) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (r4 == 26) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013f, code lost:
        if (r2 == 26) goto L_0x0141;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Cnn(java.lang.String r12, boolean r13, boolean r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r0 = 4
            X.0qQ.A0B(r12, r0)
            r9 = 0
            if (r13 != 0) goto L_0x000a
            r11.A00 = r9
            return r9
        L_0x000a:
            X.0sa r6 = r11.A05
            java.lang.Object r5 = r6.invoke()
            X.2Er r5 = (X.2Er) r5
            r0 = 0
            if (r5 == 0) goto L_0x0047
            com.instagram.common.session.UserSession r4 = r11.A06
            X.7JZ r1 = r11.A07
            if (r1 == 0) goto L_0x0047
            X.75i r3 = r1.A01
            if (r3 == 0) goto L_0x0047
            X.7OS r2 = r3.A01()
            X.7OS r1 = X.AnonymousClass7OS.AI
            if (r2 != r1) goto L_0x0047
            int r1 = r12.length()
            if (r1 <= 0) goto L_0x0047
            java.lang.String r1 = r3.A05()
            boolean r1 = X.00l.A0d(r12, r1, r9)
            if (r1 == 0) goto L_0x0047
            boolean r1 = X.AnonymousClass78V.A00(r4, r5)
            if (r1 == 0) goto L_0x0047
        L_0x003d:
            X.7Il r2 = r11.A02
            X.7JT r1 = X.AnonymousClass7JT.WRITE_WITH_AI
            X.7JU r0 = X.AnonymousClass7JU.RIGHT_INSET
            r2.FMR(r0, r1, r9)
            return r9
        L_0x0047:
            java.lang.CharSequence r1 = X.00l.A0B(r12)
            java.lang.String r3 = r1.toString()
            java.lang.String r2 = "\\s+"
            X.11S r1 = new X.11S
            r1.<init>(r2)
            java.util.List r1 = r1.A03(r3)
            int r1 = r1.size()
            long r4 = (long) r1
            com.instagram.common.session.UserSession r7 = r11.A06
            X.0Tu r3 = X.0Tu.A05
            r1 = 36604988356760737(0x820c0b000314a1, double:3.212480261048184E-306)
            long r7 = X.182.A01(r3, r7, r1)
            r3 = 1
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x010b
            java.lang.Object r1 = r6.invoke()
            X.2Er r1 = (X.2Er) r1
            r8 = 0
            if (r1 == 0) goto L_0x007e
            boolean r9 = r1.CUG()
        L_0x007e:
            java.lang.Object r1 = r6.invoke()
            X.2Er r1 = (X.2Er) r1
            if (r1 == 0) goto L_0x008c
            java.lang.String r7 = r1.C6C()
            if (r7 != 0) goto L_0x008e
        L_0x008c:
            java.lang.String r7 = ""
        L_0x008e:
            java.lang.Object r1 = r6.invoke()
            X.2Er r1 = (X.2Er) r1
            if (r1 == 0) goto L_0x0109
            int r4 = r1.C6a()
            r1 = 24
            if (r4 == r1) goto L_0x00a3
            r2 = 26
            r1 = 0
            if (r4 != r2) goto L_0x00a4
        L_0x00a3:
            r1 = 1
        L_0x00a4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
        L_0x00a8:
            boolean r1 = r11.A00
            if (r1 != 0) goto L_0x00eb
            X.7I3 r1 = r11.A01
            if (r2 == 0) goto L_0x00b4
            boolean r8 = r2.booleanValue()
        L_0x00b4:
            X.0wc r1 = r1.A01
            X.1Ln r5 = X.1Ln.A0J(r1)
            X.XSV r4 = X.AnonymousClass7I3.A00(r8, r9)
            X.0Aj r1 = r5.A00
            boolean r1 = r1.isSampled()
            if (r1 == 0) goto L_0x00eb
            r1 = 24
            r5.A0Z(r1)
            java.lang.String r2 = "write_with_ai_icon"
            java.lang.String r1 = "selected_item"
            r5.A0R(r1, r2)
            r5.A0X(r3)
            java.lang.String r1 = "thread_type"
            r5.A0M(r4, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            java.lang.String r1 = "is_e2ee"
            r5.A0O(r1, r2)
            java.lang.String r1 = "thread_id"
            r5.A0R(r1, r7)
            r5.Cgf()
        L_0x00eb:
            r11.A00 = r3
            X.7JZ r1 = r11.A07
            if (r1 == 0) goto L_0x00f3
            X.7JU r0 = r1.A00
        L_0x00f3:
            X.7JU r5 = X.AnonymousClass7JU.RIGHT_INSET
            if (r0 != r5) goto L_0x010f
            X.7Il r4 = r11.A02
            X.7JT r2 = X.AnonymousClass7JT.WRITE_WITH_AI
            r4.FMR(r5, r2, r3)
            r1 = 15
            X.PmD r0 = new X.PmD
            r0.<init>(r11, r1)
            r4.ErS(r5, r2, r0, r3)
            return r3
        L_0x0109:
            r2 = 0
            goto L_0x00a8
        L_0x010b:
            r11.A00 = r9
            goto L_0x003d
        L_0x010f:
            java.lang.Object r0 = r6.invoke()
            X.2Er r0 = (X.2Er) r0
            if (r0 == 0) goto L_0x0166
            boolean r4 = r0.CUG()
        L_0x011b:
            java.lang.Object r0 = r6.invoke()
            X.2Er r0 = (X.2Er) r0
            if (r0 == 0) goto L_0x0129
            java.lang.String r8 = r0.C6C()
            if (r8 != 0) goto L_0x012b
        L_0x0129:
            java.lang.String r8 = ""
        L_0x012b:
            java.lang.Object r1 = r6.invoke()
            X.2Er r1 = (X.2Er) r1
            r0 = 0
            if (r1 == 0) goto L_0x0146
            int r2 = r1.C6a()
            r0 = 24
            if (r2 == r0) goto L_0x0141
            r1 = 26
            r0 = 0
            if (r2 != r1) goto L_0x0142
        L_0x0141:
            r0 = 1
        L_0x0142:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0146:
            X.7Ik r5 = r11.A03
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            if (r0 == 0) goto L_0x0164
            boolean r10 = r0.booleanValue()
        L_0x0152:
            X.7I3 r6 = r11.A01
            r0 = 33
            X.9La r9 = new X.9La
            r9.<init>(r11, r0)
            r5.FLY(r6, r7, r8, r9, r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            r5.Cmd(r0, r3)
            return r3
        L_0x0164:
            r10 = 0
            goto L_0x0152
        L_0x0166:
            r4 = 0
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KI.Cnn(java.lang.String, boolean, boolean, boolean, boolean):boolean");
    }

    public AnonymousClass7KI(UserSession userSession, AnonymousClass7I3 r2, C329327Il r3, C329317Ik r4, AnonymousClass7JZ r5, C62320sa r6, C62320sa r7) {
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = userSession;
        this.A04 = r6;
        this.A01 = r2;
        this.A05 = r7;
        this.A07 = r5;
    }
}
