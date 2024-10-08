package X;

/* renamed from: X.7LL  reason: invalid class name */
public final class AnonymousClass7LL implements 0mn {
    public int A00;

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean ACH(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            X.7So r8 = (X.C331837So) r8
            X.7So r9 = (X.C331837So) r9
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 1
            X.0qQ.A0B(r9, r0)
            r4 = 0
            int r1 = r8.getType()
            int r0 = r9.getType()
            r6 = 0
            if (r1 != r0) goto L_0x004c
            boolean r1 = r8 instanceof X.C330807Oi
            java.lang.String r3 = "Check failed."
            r0 = 1
            if (r1 == 0) goto L_0x004d
            boolean r0 = r9 instanceof X.C330807Oi
            if (r0 == 0) goto L_0x00ea
            X.7Oi r8 = (X.C330807Oi) r8
            com.instagram.direct.model.messaginguser.MessagingUser r0 = r8.A03
            java.lang.String r1 = r0.A03
            X.7Oi r9 = (X.C330807Oi) r9
            com.instagram.direct.model.messaginguser.MessagingUser r0 = r9.A03
            java.lang.String r0 = r0.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004c
            int r1 = r8.A00
            int r0 = r9.A00
            if (r1 != r0) goto L_0x004c
            boolean r1 = r8.A06
            boolean r0 = r9.A06
            if (r1 != r0) goto L_0x004c
            java.lang.Integer r1 = r8.A04
            java.lang.Integer r0 = r9.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
        L_0x0049:
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            r6 = 1
        L_0x004c:
            return r6
        L_0x004d:
            int r2 = r8.getType()
            r1 = 32
            if (r2 != r1) goto L_0x0091
            X.7Pc r8 = (X.C331007Pc) r8
            X.7Pc r9 = (X.C331007Pc) r9
            X.0qQ.A0B(r9, r4)
            boolean r1 = r9.A0A
            boolean r0 = r8.A0A
            if (r1 != r0) goto L_0x004c
            long r3 = r8.A02
            long r1 = r9.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004c
            java.util.Set r3 = r8.A05
            int r2 = r3.size()
            java.util.Set r1 = r9.A05
            int r0 = r1.size()
            if (r2 != r0) goto L_0x004c
            boolean r0 = r3.containsAll(r1)
            if (r0 == 0) goto L_0x004c
            java.util.Set r3 = r8.A06
            int r2 = r3.size()
            java.util.Set r1 = r9.A06
            int r0 = r1.size()
            if (r2 != r0) goto L_0x004c
            boolean r0 = r3.containsAll(r1)
            goto L_0x0049
        L_0x0091:
            boolean r1 = r8 instanceof X.AnonymousClass7LQ
            if (r1 == 0) goto L_0x00f6
            boolean r0 = r9 instanceof X.AnonymousClass7LQ
            if (r0 == 0) goto L_0x00f0
            X.7LQ r8 = (X.AnonymousClass7LQ) r8
            X.7SD r4 = r8.A0G
            X.0qQ.A07(r4)
            X.7LQ r9 = (X.AnonymousClass7LQ) r9
            X.7SD r3 = r9.A0G
            X.0qQ.A07(r3)
            X.3t3 r0 = r4.A0P
            r5 = 0
            if (r0 == 0) goto L_0x00e8
            X.3t0 r2 = X.C300965yF.A01(r0)
        L_0x00b0:
            X.3t3 r0 = r3.A0P
            if (r0 == 0) goto L_0x00b8
            X.3t0 r5 = X.C300965yF.A01(r0)
        L_0x00b8:
            int r1 = r8.A00
            int r0 = r9.A00
            if (r1 != r0) goto L_0x004c
            int r1 = r8.A01()
            int r0 = r9.A01()
            if (r1 != r0) goto L_0x004c
            if (r2 != r5) goto L_0x004c
            boolean r1 = r4.A1G
            boolean r0 = r3.A1G
            if (r1 != r0) goto L_0x004c
            boolean r1 = r4.A0r
            boolean r0 = r3.A0r
            if (r1 != r0) goto L_0x004c
            int r1 = r8.getType()
            r0 = 58
            if (r1 != r0) goto L_0x004b
            java.lang.String r1 = r4.A0X
            java.lang.String r0 = r3.A0X
            boolean r0 = X.2PP.A00(r1, r0)
            goto L_0x0049
        L_0x00e8:
            r2 = r5
            goto L_0x00b0
        L_0x00ea:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x00f0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x00f6:
            int r2 = r8.getType()
            r1 = 15
            if (r2 == r1) goto L_0x0142
            r1 = 158(0x9e, float:2.21E-43)
            if (r2 == r1) goto L_0x0142
            r1 = 34
            if (r2 == r1) goto L_0x0142
            r1 = 35
            if (r2 == r1) goto L_0x0139
            switch(r2) {
                case 55: goto L_0x0142;
                case 56: goto L_0x010e;
                case 57: goto L_0x0130;
                default: goto L_0x010d;
            }
        L_0x010d:
            return r0
        L_0x010e:
            X.7O6 r8 = (X.AnonymousClass7O6) r8
            X.7O6 r9 = (X.AnonymousClass7O6) r9
            X.0qQ.A0B(r9, r4)
            long r3 = r8.A00
            long r1 = r9.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x012e
            java.lang.String r1 = r8.A03
            java.lang.String r0 = r9.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x012e
            boolean r2 = r8.A09
            boolean r1 = r9.A09
            r0 = 1
            if (r2 == r1) goto L_0x010d
        L_0x012e:
            r0 = 0
            return r0
        L_0x0130:
            X.7F4 r8 = (X.AnonymousClass7F4) r8
            X.7F4 r9 = (X.AnonymousClass7F4) r9
            boolean r0 = r8.isContentSame(r9)
            return r0
        L_0x0139:
            X.7O9 r8 = (X.AnonymousClass7O9) r8
            X.7O9 r9 = (X.AnonymousClass7O9) r9
            boolean r0 = r8.isContentSame(r9)
            return r0
        L_0x0142:
            boolean r0 = r8.equals(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LL.ACH(java.lang.Object, java.lang.Object):boolean");
    }

    public final /* bridge */ /* synthetic */ boolean ACK(Object obj, Object obj2) {
        C331837So r4 = (C331837So) obj;
        C331837So r5 = (C331837So) obj2;
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        boolean z = false;
        if (this.A00 != 29) {
            z = true;
        }
        return C330757Ob.A00(r4, r5, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0096, code lost:
        if (r3 == 32) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c8, code lost:
        if (r3 == 32) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            X.7So r10 = (X.C331837So) r10
            X.7So r11 = (X.C331837So) r11
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            int r1 = r9.A00
            r0 = 29
            r5 = 0
            if (r1 == r0) goto L_0x0014
            r5 = 1
        L_0x0014:
            int r4 = r10.getType()
            int r3 = r11.getType()
            boolean r0 = X.C330757Ob.A00(r10, r11, r5)
            if (r0 == 0) goto L_0x0024
            r8 = 0
        L_0x0023:
            return r8
        L_0x0024:
            r0 = 55
            r1 = 1
            if (r4 == r0) goto L_0x0051
            r8 = -1
            if (r3 == r0) goto L_0x0023
            r0 = 158(0x9e, float:2.21E-43)
            if (r4 == r0) goto L_0x0051
            if (r3 == r0) goto L_0x0023
            r0 = 36
            if (r4 == r0) goto L_0x0023
            if (r3 == r0) goto L_0x0051
            r0 = 157(0x9d, float:2.2E-43)
            if (r4 == r0) goto L_0x0023
            if (r3 == r0) goto L_0x0051
            r0 = 2
            if (r4 == r0) goto L_0x0023
            if (r3 == r0) goto L_0x0051
            r0 = 168(0xa8, float:2.35E-43)
            if (r4 == r0) goto L_0x0023
            if (r3 == r0) goto L_0x0051
            r7 = 32
            if (r5 != 0) goto L_0x0053
            if (r4 == r7) goto L_0x0023
            if (r3 != r7) goto L_0x0053
        L_0x0051:
            r8 = 1
            return r8
        L_0x0053:
            boolean r2 = r10 instanceof X.AnonymousClass7LQ
            if (r2 == 0) goto L_0x0090
            boolean r0 = r11 instanceof X.AnonymousClass7LQ
            if (r0 == 0) goto L_0x0090
            X.7LQ r11 = (X.AnonymousClass7LQ) r11
            long r4 = r11.A07
            long r6 = r11.A08
            X.7LQ r10 = (X.AnonymousClass7LQ) r10
            long r2 = r10.A07
            long r0 = r10.A08
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x008d
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
        L_0x006d:
            if (r8 != 0) goto L_0x0023
            r8 = 0
            X.NaW r1 = X.C70862OPb.A00(r10)
            if (r1 == 0) goto L_0x0023
            X.NaW r2 = X.C70862OPb.A00(r11)
            if (r2 == 0) goto L_0x0023
            boolean r0 = X.C70862OPb.A01(r1)
            if (r0 == 0) goto L_0x012a
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "disappearing_mode_e2ee_attribution"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            goto L_0x0051
        L_0x008d:
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            goto L_0x006d
        L_0x0090:
            if (r4 == r3) goto L_0x0117
            if (r5 == 0) goto L_0x00df
            if (r4 == r7) goto L_0x00bd
            if (r3 != r7) goto L_0x00df
        L_0x0098:
            if (r2 == 0) goto L_0x00cb
            r2 = r11
            X.7Pc r2 = (X.C331007Pc) r2
            r0 = r10
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            r1 = -1
        L_0x00a1:
            java.lang.String r2 = r2.A03
            X.3su r0 = r0.A0e
            java.lang.String r0 = r0.A0g()
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x00bb
            long r4 = r10.C7Z()
            long r2 = r11.C7Z()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0117
        L_0x00bb:
            int r1 = -r1
        L_0x00bc:
            return r1
        L_0x00bd:
            boolean r0 = r11 instanceof X.AnonymousClass7LQ
            if (r0 == 0) goto L_0x00c8
            r2 = r10
            X.7Pc r2 = (X.C331007Pc) r2
            r0 = r11
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            goto L_0x00a1
        L_0x00c8:
            if (r3 != r7) goto L_0x00cb
            goto L_0x0098
        L_0x00cb:
            long r5 = r11.C7Z()
            long r2 = r10.C7Z()
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00dd
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00bc
            if (r4 != r7) goto L_0x00bc
        L_0x00dd:
            r1 = -1
            return r1
        L_0x00df:
            long r5 = r10.C7Z()
            long r1 = r11.C7Z()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0117
            r0 = 15
            if (r4 == r0) goto L_0x0051
            if (r3 == r0) goto L_0x0023
            r0 = 56
            if (r4 == r0) goto L_0x0051
            if (r3 == r0) goto L_0x0023
            r0 = 37
            if (r4 == r0) goto L_0x0051
            if (r3 == r0) goto L_0x0023
            r0 = 68
            if (r4 == r0) goto L_0x0051
            if (r3 == r0) goto L_0x0023
            r0 = 35
            if (r4 == r0) goto L_0x0051
            if (r3 == r0) goto L_0x0023
            r0 = 57
            if (r4 == r0) goto L_0x0051
            if (r3 == r0) goto L_0x0023
            r0 = 34
            if (r4 == r0) goto L_0x0023
            if (r3 != r0) goto L_0x0117
            goto L_0x0051
        L_0x0117:
            long r3 = r11.C7Z()
            long r1 = r10.C7Z()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x013a
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r8 = 0
            if (r0 <= 0) goto L_0x0023
            goto L_0x0051
        L_0x012a:
            java.lang.String r1 = r1.A02
            java.lang.String r0 = "disappearing_mode_e2ee_attribution"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            boolean r0 = X.C70862OPb.A01(r2)
            if (r0 == 0) goto L_0x0023
        L_0x013a:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LL.compare(java.lang.Object, java.lang.Object):int");
    }
}
