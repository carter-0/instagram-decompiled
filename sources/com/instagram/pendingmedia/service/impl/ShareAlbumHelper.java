package com.instagram.pendingmedia.service.impl;

import X.0qQ;

public final class ShareAlbumHelper {
    public final MediaUploader A00;

    public ShareAlbumHelper(MediaUploader mediaUploader) {
        0qQ.A0B(mediaUploader, 1);
        this.A00 = mediaUploader;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.55U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.55U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.55U} */
    /* JADX WARNING: type inference failed for: r12v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014e, code lost:
        if (r3 != null) goto L_0x0150;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0106 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0123 A[EDGE_INSN: B:77:0x0123->B:54:0x0123 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0145 A[EDGE_INSN: B:78:0x0145->B:64:0x0145 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.LP8 r16, X.AnonymousClass4D7 r17) {
        /*
            r15 = this;
            r11 = r16
            r3 = 12
            r4 = r17
            boolean r0 = X.ME1.A02(r3, r4)
            if (r0 == 0) goto L_0x016b
            r12 = r4
            X.ME1 r12 = (X.ME1) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x016b
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r12.A06
            X.1Hj r4 = X.1Hj.A02
            int r0 = r12.A00
            r3 = 0
            r8 = 3
            r7 = 2
            r5 = 6
            r6 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 == r6) goto L_0x0107
            if (r0 == r7) goto L_0x00c0
            if (r0 != r8) goto L_0x0172
            java.lang.Object r2 = r12.A02
            java.lang.Object r11 = r12.A01
            X.LP8 r11 = (X.LP8) r11
            X.0eS.A00(r1)
        L_0x0036:
            boolean r0 = r1 instanceof X.C62012KVl
            if (r0 == 0) goto L_0x004d
            X.3QD r0 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r2 == r0) goto L_0x004d
            X.37k r3 = r11.A0E
            X.3Q2 r5 = r11.A0D
            java.lang.String r7 = X.LP8.A00(r11, r2)
            r4 = 0
            java.lang.String r6 = "ALBUM_STATE_MACHINE_ERROR"
            r8 = r4
            r3.Cji(r4, r5, r6, r7, r8)
        L_0x004d:
            return r1
        L_0x004e:
            X.0eS.A00(r1)
            X.KVl r1 = X.C62012KVl.A00
            X.3QD r2 = r11.A06
            X.3QD r0 = r11.A05
            if (r0 == 0) goto L_0x0036
            int r0 = r0.ordinal()
            if (r0 == r7) goto L_0x0077
            if (r0 != r5) goto L_0x0036
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r9 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            com.instagram.pendingmedia.service.igapi.ConfigureMediaStep r10 = new com.instagram.pendingmedia.service.igapi.ConfigureMediaStep
            r10.<init>()
            r12.A01 = r11
            r12.A02 = r2
            r12.A00 = r8
            r13 = 0
            java.lang.Object r1 = r9.A01(r10, r11, r12, r13)
            if (r1 != r4) goto L_0x0036
            return r4
        L_0x0077:
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            if (r2 != r0) goto L_0x0036
            com.instagram.common.session.UserSession r5 = r11.A0C
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.0oI.A09(r0)
            X.0Tu r8 = X.0Tu.A05
            if (r0 == 0) goto L_0x00db
            r0 = 36328031685589888(0x81102700023b80, double:3.037331746984738E-306)
            boolean r0 = X.DbY.A1Z(r8, r5, r0)
        L_0x0090:
            if (r0 != 0) goto L_0x00f0
            java.util.List r0 = r11.A0K
            java.util.List r0 = X.00k.A0a(r0)
            java.util.Iterator r10 = r0.iterator()
            r0 = r15
        L_0x009d:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0125
            X.3Q2 r9 = X.JTO.A0m(r10)
            com.instagram.pendingmedia.service.impl.MediaUploader r8 = r0.A00
            java.lang.String r6 = r11.A0I
            android.content.Context r5 = r11.A0B
            X.1Cn r1 = new X.1Cn
            r1.<init>(r5)
            X.ME1.A00(r0, r11, r2, r3, r12)
            r12.A05 = r10
            r12.A00 = r7
            java.lang.Object r1 = r8.A01(r9, r1, r6, r12)
            if (r1 != r4) goto L_0x00d5
            return r4
        L_0x00c0:
            java.lang.Object r10 = r12.A05
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r3 = r12.A04
            X.55U r3 = (X.AnonymousClass55U) r3
            java.lang.Object r2 = r12.A03
            java.lang.Object r11 = r12.A02
            X.LP8 r11 = (X.LP8) r11
            java.lang.Object r0 = r12.A01
            com.instagram.pendingmedia.service.impl.ShareAlbumHelper r0 = (com.instagram.pendingmedia.service.impl.ShareAlbumHelper) r0
            X.0eS.A00(r1)
        L_0x00d5:
            X.55U r1 = (X.AnonymousClass55U) r1
            if (r1 == 0) goto L_0x009d
            r3 = r1
            goto L_0x009d
        L_0x00db:
            r0 = 36318084541323113(0x81071b00021769, double:3.0310411328964946E-306)
            boolean r0 = X.182.A06(r8, r5, r0)
            if (r0 != 0) goto L_0x00f0
            r0 = 36330436867211904(0x81125700014280, double:3.03885279352739E-306)
            boolean r0 = X.182.A06(r8, r5, r0)
            goto L_0x0090
        L_0x00f0:
            com.instagram.pendingmedia.service.impl.MediaUploader r0 = r15.A00
            X.3jv r5 = r0.A00
            r12.A01 = r11
            r12.A02 = r2
            r12.A00 = r6
            r1 = 0
            X.JTw r0 = new X.JTw
            r0.<init>((X.LP8) r11, (X.AnonymousClass4D7) r1, (X.C249523jv) r5)
            java.lang.Object r1 = X.19E.A00(r12, r0)
            if (r1 != r4) goto L_0x0110
            return r4
        L_0x0107:
            java.lang.Object r2 = r12.A02
            java.lang.Object r11 = r12.A01
            X.LP8 r11 = (X.LP8) r11
            X.0eS.A00(r1)
        L_0x0110:
            java.util.List r1 = (java.util.List) r1
            java.util.ListIterator r1 = X.C51968G9o.A18(r1)
        L_0x0116:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r0 = r1.previous()
            if (r0 == 0) goto L_0x0116
            r3 = r0
        L_0x0123:
            X.55U r3 = (X.AnonymousClass55U) r3
        L_0x0125:
            java.util.List r0 = r11.A0K
            java.util.List r0 = X.00k.A0a(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x012f:
            r1 = 1
        L_0x0130:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0145
            X.3Q2 r0 = X.JTO.A0m(r4)
            if (r1 == 0) goto L_0x0143
            boolean r0 = r0.A14()
            if (r0 != 0) goto L_0x0143
            goto L_0x012f
        L_0x0143:
            r1 = 0
            goto L_0x0130
        L_0x0145:
            if (r1 == 0) goto L_0x0157
            X.3Q2 r1 = r11.A0D
            X.3QD r0 = X.AnonymousClass3QD.UPLOADED
            r1.A0b(r0)
            if (r3 == 0) goto L_0x0167
        L_0x0150:
            X.KVk r1 = new X.KVk
            r1.<init>(r3)
            goto L_0x0036
        L_0x0157:
            if (r3 == 0) goto L_0x0167
            X.3Q2 r0 = r11.A0D
            boolean r0 = r0.A5u
            if (r0 == 0) goto L_0x0150
            X.55S r1 = r3.A01
            java.lang.String r0 = r3.A03
            r11.A02(r1, r0)
            goto L_0x0150
        L_0x0167:
            X.KVm r1 = X.C62013KVm.A00
            goto L_0x0036
        L_0x016b:
            X.ME1 r12 = new X.ME1
            r12.<init>(r15, r4, r3)
            goto L_0x001a
        L_0x0172:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.ShareAlbumHelper.A00(X.LP8, X.4D7):java.lang.Object");
    }
}
