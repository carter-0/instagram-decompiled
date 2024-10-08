package X;

/* renamed from: X.Kw0  reason: case insensitive filesystem */
public abstract class C63379Kw0 {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r1 == X.JTP.A08(r7)) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0122, code lost:
        if (r7 == null) goto L_0x0124;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass1QX A00(X.1ut r32, com.instagram.pendingmedia.model.constants.ShareType r33, X.LP8 r34, java.lang.String r35, boolean r36) {
        /*
            r0 = 0
            r15 = r33
            r3 = r34
            X.AnonymousClass7TF.A1C(r3, r0, r15)
            X.3Q2 r11 = r3.A0D
            com.instagram.common.session.UserSession r14 = r3.A0C
            X.9Ua r4 = X.AnonymousClass9T6.A00(r14)
            X.51W r0 = r11.A1P
            if (r0 == 0) goto L_0x0155
            X.0eM r0 = r0.A06
            java.util.List r6 = X.JTO.A15(r0)
            if (r6 == 0) goto L_0x0155
            java.util.Iterator r12 = r6.iterator()
            r5 = 0
        L_0x0021:
            boolean r0 = r12.hasNext()
            java.lang.String r2 = "VIDEO"
            if (r0 == 0) goto L_0x007b
            X.51M r7 = X.JTO.A0g(r12)
            X.GTT r0 = r7.A0B
            r8 = -1
            if (r0 == 0) goto L_0x0079
            int r1 = r0.A01
        L_0x0034:
            r10 = 1
            if (r1 == r8) goto L_0x003e
            int r0 = X.JTP.A08(r7)
            r9 = 1
            if (r1 != r0) goto L_0x003f
        L_0x003e:
            r9 = 0
        L_0x003f:
            if (r1 != r8) goto L_0x0077
            X.51R r0 = r7.A0F
            int r0 = r0.A04
            float r1 = (float) r0
            float r0 = r7.A00
            float r0 = java.lang.Math.abs(r0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r8 = (int) r0
            int r0 = X.JTP.A08(r7)
            if (r8 <= r0) goto L_0x0077
        L_0x0059:
            int r0 = X.JTP.A08(r7)
            int r5 = r5 + r0
            if (r9 != 0) goto L_0x0062
            if (r10 == 0) goto L_0x0067
        L_0x0062:
            java.lang.String r0 = "TRIM"
            X.C61015JvF.A00(r4, r2, r0)
        L_0x0067:
            java.lang.String r0 = r7.A0L
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = r7.A0M
            if (r0 == 0) goto L_0x0021
        L_0x006f:
            java.lang.String r1 = "TRANSITION"
            java.lang.String r0 = "ADD"
            X.C61015JvF.A00(r4, r1, r0)
            goto L_0x0021
        L_0x0077:
            r10 = 0
            goto L_0x0059
        L_0x0079:
            r1 = -1
            goto L_0x0034
        L_0x007b:
            com.instagram.music.common.model.MusicOverlayStickerModel r7 = r11.A1J
            if (r7 == 0) goto L_0x0097
            java.lang.Integer r0 = r7.A0K
            int r1 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = r7.A0N
            int r0 = X.AnonymousClass7TG.A0A(r0)
            int r0 = r0 + r1
            if (r1 > 0) goto L_0x0090
            if (r0 >= r5) goto L_0x0097
        L_0x0090:
            java.lang.String r1 = "AUDIO"
            java.lang.String r0 = "TRIM"
            X.C61015JvF.A00(r4, r1, r0)
        L_0x0097:
            java.util.List r0 = r11.A4W
            if (r0 == 0) goto L_0x00c4
            java.util.Iterator r8 = r0.iterator()
        L_0x009f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r7 = r8.next()
            com.instagram.music.common.model.MusicOverlayStickerModel r7 = (com.instagram.music.common.model.MusicOverlayStickerModel) r7
            java.lang.Integer r0 = r7.A0K
            int r1 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = r7.A0N
            int r0 = X.AnonymousClass7TG.A0A(r0)
            int r0 = r0 + r1
            if (r1 > 0) goto L_0x00bc
            if (r0 >= r5) goto L_0x009f
        L_0x00bc:
            java.lang.String r1 = "AUDIO"
            java.lang.String r0 = "TRIM"
            X.C61015JvF.A00(r4, r1, r0)
            goto L_0x009f
        L_0x00c4:
            java.util.HashSet r7 = X.AnonymousClass7TE.A1F()
            java.util.Iterator r8 = r6.iterator()
        L_0x00cc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f6
            X.51M r1 = X.JTO.A0g(r8)
            java.lang.String r0 = r1.A0I
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = r1.A0I
            r7.add(r0)
            X.GTT r5 = r1.A0B
            if (r5 == 0) goto L_0x00cc
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x01cd
            int r1 = r1.A09
        L_0x00ed:
            int r0 = r5.A00
            if (r1 != r0) goto L_0x00cc
        L_0x00f1:
            java.lang.String r0 = "SPLIT"
            X.C61015JvF.A00(r4, r2, r0)
        L_0x00f6:
            java.util.Iterator r9 = r6.iterator()
        L_0x00fa:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0134
            X.51M r8 = X.JTO.A0g(r9)
            X.51S r0 = r8.A0E
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0124
            java.util.Iterator r5 = r0.iterator()
        L_0x010e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r7 = r5.next()
            r0 = r7
            com.instagram.feed.media.CameraToolInfo r0 = (com.instagram.feed.media.CameraToolInfo) r0
            com.instagram.api.schemas.CameraTool r1 = r0.A00
            com.instagram.api.schemas.CameraTool r0 = com.instagram.api.schemas.CameraTool.SPEED_SELECTOR
            if (r1 != r0) goto L_0x010e
            r5 = 1
            if (r7 != 0) goto L_0x0125
        L_0x0124:
            r5 = 0
        L_0x0125:
            float r1 = r8.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00fa
            if (r5 != 0) goto L_0x00fa
            java.lang.String r0 = "SPEED"
            X.C61015JvF.A00(r4, r2, r0)
        L_0x0134:
            java.util.Iterator r1 = r6.iterator()
        L_0x0138:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014b
            X.51M r0 = X.JTO.A0g(r1)
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = "SWAP"
            X.C61015JvF.A00(r4, r2, r0)
        L_0x014b:
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x01b5
        L_0x0155:
            android.content.Context r13 = r3.A0B
            r34 = r32
            r0 = r34
            java.lang.Object r18 = r0.AEc(r11)
            long r1 = r11.A0g
            java.lang.String r12 = r11.A3t
            java.lang.String r10 = r3.A0J
            boolean r29 = r11.A12()
            java.lang.String r9 = r11.A3v
            java.lang.String r23 = r11.A0I()
            X.28D r8 = r11.A0i
            com.instagram.common.gallery.metadata.MediaUploadMetadata r7 = r11.A13
            java.util.List r6 = r11.A4R
            boolean r5 = r11.A5S
            boolean r4 = r11.A5B
            X.3QF r0 = r11.A1T
            int r0 = r0.A00()
            java.lang.String r24 = java.lang.String.valueOf(r0)
            java.lang.String r3 = r11.A3s
            boolean r0 = r11.A5y
            r21 = r35
            r32 = r36
            r16 = r14
            r17 = r15
            r19 = r12
            r20 = r10
            r22 = r9
            r25 = r3
            r26 = r6
            r27 = r1
            r30 = r5
            r31 = r4
            r33 = r0
            r15 = r7
            r14 = r8
            r12 = r34
            X.1QX r3 = r12.AEQ(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33)
            X.1QS r2 = r3.A02
            java.lang.String r1 = r11.A0H()
            java.lang.String r0 = "retry_context"
            r2.A01(r0, r1)
            return r3
        L_0x01b5:
            java.util.Iterator r1 = r6.iterator()
        L_0x01b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0155
            X.51M r0 = X.JTO.A0g(r1)
            boolean r0 = r0.A0P
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = "SLIP"
            X.C61015JvF.A00(r4, r2, r0)
            goto L_0x0155
        L_0x01cd:
            int r1 = r1.A08
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63379Kw0.A00(X.1ut, com.instagram.pendingmedia.model.constants.ShareType, X.LP8, java.lang.String, boolean):X.1QX");
    }
}
