package X;

/* renamed from: X.WKj  reason: case insensitive filesystem */
public final class C19079WKj implements C20883X2n {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public C19079WKj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, long j) {
        this.A0B = str;
        this.A07 = str2;
        this.A0A = str3;
        this.A09 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A06 = str7;
        this.A0C = str8;
        this.A05 = str9;
        this.A02 = str10;
        this.A08 = str11;
        this.A00 = i;
        this.A01 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r1.contains(X.C16529UwZ.SUCCESS_DASH_AUDIO) != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        if (r20 != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0158, code lost:
        if (r24 != false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (r1.contains(X.C16529UwZ.SUCCESS_DASH_VIDEO) != false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r26
            java.util.Set r1 = (java.util.Set) r1
            r9 = 0
            X.0qQ.A0B(r1, r9)
            X.UwZ r0 = X.C16529UwZ.SUCCESS
            boolean r24 = r1.contains(r0)
            X.UwZ r0 = X.C16529UwZ.FAIL
            boolean r23 = r1.contains(r0)
            X.UwZ r0 = X.C16529UwZ.HAS_AUDIO
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0026
            X.UwZ r0 = X.C16529UwZ.SUCCESS_DASH_AUDIO
            boolean r0 = r1.contains(r0)
            r22 = 0
            if (r0 == 0) goto L_0x0028
        L_0x0026:
            r22 = 1
        L_0x0028:
            X.UwZ r0 = X.C16529UwZ.HAS_VIDEO
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x003a
            X.UwZ r0 = X.C16529UwZ.SUCCESS_DASH_VIDEO
            boolean r0 = r1.contains(r0)
            r21 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003a:
            r21 = 1
        L_0x003c:
            X.UwZ r0 = X.C16529UwZ.FAIL_DASH_AUDIO
            boolean r20 = r1.contains(r0)
            X.UwZ r0 = X.C16529UwZ.FAIL_DASH_VIDEO
            boolean r19 = r1.contains(r0)
            boolean r0 = X.W14.A04
            r3 = r25
            java.lang.String r6 = r3.A0B
            java.lang.String r5 = r3.A07
            java.lang.String r1 = r3.A0A
            java.lang.String r0 = r3.A09
            java.lang.String r12 = r3.A03
            java.lang.String r10 = r3.A04
            java.lang.String r13 = r3.A06
            java.lang.String r11 = r3.A0C
            java.lang.String r15 = r3.A05
            java.lang.String r8 = r3.A02
            java.lang.String r2 = r3.A08
            android.util.ArrayMap r4 = new android.util.ArrayMap
            r4.<init>()
            r7 = -1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)
            r14 = r16
            java.lang.String r0 = X.C41847B3o.A1E(r0)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x0076 }
            java.lang.Integer r14 = X.Pxf.A0Z(r0)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x0076 }
        L_0x0076:
            int r14 = X.AnonymousClass7TE.A0M(r14)
            X.92A r0 = X.AnonymousClass92A.A00
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.Object r9 = r0.invoke(r5)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x0084 }
        L_0x0084:
            r0 = r16
            java.lang.String r13 = X.C41847B3o.A1E(r13)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x008e }
            java.lang.Integer r0 = X.Pxf.A0Z(r13)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x008e }
        L_0x008e:
            int r13 = X.AnonymousClass7TE.A0M(r0)
            r0 = r16
            java.lang.String r11 = X.C41847B3o.A1E(r11)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x009c }
            java.lang.Integer r0 = X.Pxf.A0Z(r11)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x009c }
        L_0x009c:
            int r11 = X.AnonymousClass7TE.A0M(r0)
            X.92B r0 = X.AnonymousClass92B.A00
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r17 = java.lang.Float.valueOf(r18)
            java.lang.Object r17 = r0.invoke(r15)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x00ac }
        L_0x00ac:
            float r17 = X.AnonymousClass7TE.A04(r17)
            r0 = r16
            java.lang.String r8 = X.C41847B3o.A1E(r8)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x00ba }
            java.lang.Integer r0 = X.Pxf.A0Z(r8)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x00ba }
        L_0x00ba:
            int r8 = X.AnonymousClass7TE.A0M(r0)
            java.lang.String r0 = X.C41847B3o.A1E(r2)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x00c6 }
            java.lang.Integer r16 = X.Pxf.A0Z(r0)     // Catch:{ IllegalArgumentException | NumberFormatException -> 0x00c6 }
        L_0x00c6:
            int r2 = X.AnonymousClass7TE.A0M(r16)
            java.lang.String r15 = "FAIL"
            java.lang.String r0 = "SUCCESS"
            if (r21 != 0) goto L_0x015a
            if (r19 != 0) goto L_0x0158
            if (r24 != 0) goto L_0x015a
            if (r23 != 0) goto L_0x015b
            if (r22 != 0) goto L_0x0156
            if (r20 == 0) goto L_0x012b
        L_0x00da:
            java.lang.String r0 = "STATUS_AUDIO"
            r4.put(r0, r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            if (r14 == r7) goto L_0x00ec
            if (r1 == 0) goto L_0x00ec
            java.lang.String r0 = "PREFETCH_BYTES_AUDIO"
            r4.put(r0, r1)
        L_0x00ec:
            int r0 = r12.length()
            if (r0 <= 0) goto L_0x00f7
            java.lang.String r0 = "CODEC_AUDIO"
            r4.put(r0, r12)
        L_0x00f7:
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x0102
            java.lang.String r0 = "CONTAINER_MIME_TYPE_AUDIO"
            r4.put(r0, r10)
        L_0x0102:
            java.lang.Float r1 = java.lang.Float.valueOf(r17)
            int r0 = (r17 > r18 ? 1 : (r17 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0111
            if (r1 == 0) goto L_0x0111
            java.lang.String r0 = "FRAME_RATE_BYTES_AUDIO"
            r4.put(r0, r1)
        L_0x0111:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            if (r8 == r7) goto L_0x011e
            if (r1 == 0) goto L_0x011e
            java.lang.String r0 = "AVERAGE_BIT_RATE_AUDIO"
            r4.put(r0, r1)
        L_0x011e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r2 == r7) goto L_0x012b
            if (r1 == 0) goto L_0x012b
            java.lang.String r0 = "PEAK_BIT_RATE_AUDIO"
            r4.put(r0, r1)
        L_0x012b:
            X.W14.A01(r4, r6, r5)
            if (r24 != 0) goto L_0x0134
            if (r22 == 0) goto L_0x0144
            if (r21 == 0) goto L_0x0144
        L_0x0134:
            X.W00 r1 = X.W14.A00
            int r2 = r3.A00
            r5 = 2
        L_0x0139:
            long r3 = r3.A01
            X.92C r0 = new X.92C
            r0.<init>(r1, r2, r3, r5)
            r1.A03(r0)
        L_0x0143:
            return
        L_0x0144:
            if (r23 != 0) goto L_0x0150
            if (r22 == 0) goto L_0x014a
            if (r19 != 0) goto L_0x0150
        L_0x014a:
            if (r20 == 0) goto L_0x0143
            if (r21 != 0) goto L_0x0150
            if (r19 == 0) goto L_0x0143
        L_0x0150:
            X.W00 r1 = X.W14.A00
            int r2 = r3.A00
            r5 = 3
            goto L_0x0139
        L_0x0156:
            r15 = r0
            goto L_0x00da
        L_0x0158:
            if (r24 == 0) goto L_0x015b
        L_0x015a:
            r15 = r0
        L_0x015b:
            java.lang.String r0 = "STATUS_VIDEO"
            r4.put(r0, r15)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x016b
            java.lang.String r0 = "QUALITY_LABEL"
            r4.put(r0, r1)
        L_0x016b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            if (r14 == r7) goto L_0x0178
            if (r1 == 0) goto L_0x0178
            java.lang.String r0 = "PREFETCH_BYTES_VIDEO"
            r4.put(r0, r1)
        L_0x0178:
            int r0 = r12.length()
            if (r0 <= 0) goto L_0x0183
            java.lang.String r0 = "CODEC_VIDEO"
            r4.put(r0, r12)
        L_0x0183:
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x018e
            java.lang.String r0 = "CONTAINER_MIME_TYPE_VIDEO"
            r4.put(r0, r10)
        L_0x018e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            if (r13 == r7) goto L_0x019b
            if (r1 == 0) goto L_0x019b
            java.lang.String r0 = "HEIGHT_VIDEO"
            r4.put(r0, r1)
        L_0x019b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            if (r11 == r7) goto L_0x01a8
            if (r1 == 0) goto L_0x01a8
            java.lang.String r0 = "WIDTH_VIDEO"
            r4.put(r0, r1)
        L_0x01a8:
            java.lang.Float r1 = java.lang.Float.valueOf(r17)
            int r0 = (r17 > r18 ? 1 : (r17 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x01b7
            if (r1 == 0) goto L_0x01b7
            java.lang.String r0 = "FRAME_RATE_VIDEO"
            r4.put(r0, r1)
        L_0x01b7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            if (r8 == r7) goto L_0x01c4
            if (r1 == 0) goto L_0x01c4
            java.lang.String r0 = "AVERAGE_BIT_RATE_VIDEO"
            r4.put(r0, r1)
        L_0x01c4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r2 == r7) goto L_0x01d1
            if (r1 == 0) goto L_0x01d1
            java.lang.String r0 = "PEAK_BIT_RATE_VIDEO"
            r4.put(r0, r1)
        L_0x01d1:
            java.lang.String r0 = "IS_FOLLOWUP_PREFETCH"
            r4.put(r0, r9)
            goto L_0x012b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19079WKj.accept(java.lang.Object):void");
    }
}
