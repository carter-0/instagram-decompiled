package X;

/* renamed from: X.PeD  reason: case insensitive filesystem */
public final class C73523PeD implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C73523PeD(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        if (r0 != null) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r22, X.AnonymousClass4D7 r23) {
        /*
            r21 = this;
            r7 = r21
            r9 = r22
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0034
            X.N9J r9 = (X.N9J) r9
            java.lang.Integer r1 = r9.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0021
            java.lang.Object r0 = r7.A02
            X.M0l r0 = (X.C65819M0l) r0
            X.OyC r0 = r0.A08
            X.OVd r0 = r0.A09
            X.Odx r1 = r0.A0Z
            r0 = 0
            r1.A08(r0)
        L_0x001e:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0021:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x001e
            java.lang.Object r0 = r7.A01
            X.DbS.A1U(r0)
            java.lang.Object r0 = r7.A02
            X.M0l r0 = (X.C65819M0l) r0
            X.4Co r0 = r0.A03
            X.C51970G9q.A1S(r0)
            goto L_0x001e
        L_0x0034:
            r3 = 27
            r4 = r23
            boolean r0 = X.MEA.A03(r3, r4)
            if (r0 == 0) goto L_0x005b
            r5 = r4
            X.MEA r5 = (X.MEA) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x004c:
            java.lang.Object r1 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 != r4) goto L_0x0189
            X.0eS.A00(r1)
            goto L_0x001e
        L_0x005b:
            X.MEA r5 = new X.MEA
            r5.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r4, (int) r3)
            goto L_0x004c
        L_0x0061:
            X.0eS.A00(r1)
            java.lang.Object r3 = r7.A01
            X.02o r3 = (X.02o) r3
            X.Jw8 r9 = (X.C61070Jw8) r9
            java.lang.Object r10 = r9.A02
            com.facebook.rsys.mediasync.gen.MediaSyncState r10 = (com.facebook.rsys.mediasync.gen.MediaSyncState) r10
            java.lang.Object r2 = r7.A02
            X.NfE r2 = (X.C69133NfE) r2
            java.lang.Object r7 = r9.A00
            com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r7 = (com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments) r7
            if (r7 == 0) goto L_0x008e
            java.lang.String r8 = r7.A04
            if (r8 == 0) goto L_0x008e
            java.lang.Integer r0 = r7.A03
            int r1 = r0.intValue()
            if (r1 == r4) goto L_0x00bc
            r0 = 2
            if (r1 == r0) goto L_0x00bc
            r0 = 5
            if (r1 == r0) goto L_0x00bc
            r0 = 9
            if (r1 == r0) goto L_0x00c2
        L_0x008e:
            r8 = 0
            if (r10 == 0) goto L_0x00b5
            com.facebook.rsys.mediasync.gen.MediaSyncContent r1 = r10.content
            if (r1 == 0) goto L_0x00b5
            X.Oe9 r0 = r2.A0A
            X.N36 r0 = r0.A0A(r1, r10)
        L_0x009b:
            java.lang.String r8 = r9.A03
            boolean r7 = r2.A04
            X.0sa r1 = r2.A0E
            java.lang.Object r1 = r1.invoke()
            java.lang.String r1 = (java.lang.String) r1
            X.N93 r2 = new X.N93
            r2.<init>(r0, r8, r1, r7)
        L_0x00ac:
            r5.A00 = r4
            java.lang.Object r0 = r3.emit(r2, r5)
            if (r0 != r6) goto L_0x001e
            return r6
        L_0x00b5:
            java.lang.Object r0 = r9.A01
            X.N36 r0 = (X.N36) r0
            if (r0 == 0) goto L_0x0176
            goto L_0x009b
        L_0x00bc:
            java.lang.Integer r1 = r7.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x008e
        L_0x00c2:
            java.lang.String r1 = r9.A03
            java.lang.Integer r0 = r7.A01
            int r7 = r0.intValue()
            r0 = 0
            if (r7 == r0) goto L_0x0126
            r0 = 2
            if (r7 == r0) goto L_0x0126
            if (r7 != r4) goto L_0x018e
            X.Oxo r0 = r2.A07
            r17 = 0
            java.util.HashMap r0 = r0.A00
            java.lang.Object r9 = r0.remove(r8)
            X.Put r9 = (X.C74438Put) r9
            if (r9 == 0) goto L_0x016b
            boolean r0 = r9 instanceof X.N54
            if (r0 == 0) goto L_0x011c
            r0 = r9
            X.N54 r0 = (X.N54) r0
            java.util.List r0 = r0.A09
            java.lang.Object r8 = X.00k.A0J(r0)
            X.MbR r8 = (X.C66720MbR) r8
        L_0x00ef:
            if (r8 == 0) goto L_0x0169
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.lang.String r7 = r9.Aqe()
            java.lang.Integer r0 = r9.Aqk()
            X.N50 r9 = new X.N50
            r9.<init>(r8, r0, r7)
            r11 = 0
            X.N36 r8 = new X.N36
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x010c:
            boolean r7 = r2.A04
            X.0sa r0 = r2.A0E
            java.lang.Object r0 = r0.invoke()
            java.lang.String r0 = (java.lang.String) r0
            X.N93 r2 = new X.N93
            r2.<init>(r8, r1, r0, r7)
            goto L_0x00ac
        L_0x011c:
            boolean r0 = r9 instanceof X.N53
            if (r0 == 0) goto L_0x0169
            r0 = r9
            X.N53 r0 = (X.N53) r0
            X.MbR r8 = r0.A00
            goto L_0x00ef
        L_0x0126:
            com.instagram.common.session.UserSession r0 = r2.A06
            X.1Xj r7 = X.DbV.A0U(r0, r8)
            if (r7 == 0) goto L_0x016b
            X.Oe9 r0 = r2.A0A
            android.content.Context r0 = r0.A00
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r7.A1n(r0)
            if (r0 == 0) goto L_0x0169
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            java.lang.String r11 = r7.getId()
            if (r11 == 0) goto L_0x0193
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            java.lang.String r9 = r0.A0A
            int r8 = r0.getHeight()
            int r7 = r0.getWidth()
            r14 = 0
            r20 = 0
            X.MbR r0 = new X.MbR
            r0.<init>(r9, r8, r7)
            X.N50 r12 = new X.N50
            r12.<init>(r0, r10, r11)
            X.N36 r8 = new X.N36
            r11 = r8
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x010c
        L_0x0169:
            r8 = 0
            goto L_0x010c
        L_0x016b:
            X.OWA r1 = r2.A0B
            X.PJs r0 = new X.PJs
            r0.<init>(r8)
            r1.A02(r0)
            r8 = 0
        L_0x0176:
            boolean r7 = r2.A04
            X.0sa r0 = r2.A0E
            java.lang.Object r1 = r0.invoke()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ""
            X.N93 r2 = new X.N93
            r2.<init>(r8, r0, r1, r7)
            goto L_0x00ac
        L_0x0189:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x018e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0193:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73523PeD.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
