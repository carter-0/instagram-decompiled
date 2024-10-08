package X;

import android.content.Context;

public final class NS1 extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ OGG A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NS1(Context context, OGG ogg) {
        super(470, 3, false, false);
        this.A01 = ogg;
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        if (r5.equals(".jpg") == false) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r3 = r19
            X.OGG r2 = r3.A01
            java.util.ArrayList r0 = r2.A03
            java.util.Iterator r7 = r0.iterator()
        L_0x000a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = X.AnonymousClass7TE.A18(r7)
            if (r0 == 0) goto L_0x000a
            r9 = 0
            android.net.Uri r4 = X.DbT.A09(r0)
            X.OOC r1 = new X.OOC     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            r1.<init>()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            android.content.Context r0 = r3.A00     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            r1.A02(r0, r4, r9, r9)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            X.Ni4 r0 = r1.A00()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            java.lang.String r10 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            r0 = 0
            X.2kK r4 = new X.2kK     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            r4.<init>((java.lang.String) r10)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            int r13 = X.C364678lo.A00(r4)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            long r17 = X.C364678lo.A02(r4)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            X.0qQ.A0A(r10)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            r11 = 0
            r5 = 46
            int r4 = X.C66581MXm.A04(r10)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            int r4 = r4 + -1
            int r4 = X.00l.A05(r10, r5, r4)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            java.lang.String r5 = X.C66580MXl.A0z(r10, r4)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            int r6 = r5.hashCode()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            r4 = 1475827(0x1684f3, float:2.068074E-39)
            if (r6 == r4) goto L_0x008a
            r4 = 1478659(0x169003, float:2.072043E-39)
            if (r6 == r4) goto L_0x006c
            r4 = 3268712(0x31e068, float:4.580441E-39)
            if (r6 != r4) goto L_0x0092
            java.lang.String r4 = "jpeg"
            boolean r4 = r5.equals(r4)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            if (r4 == 0) goto L_0x0092
            goto L_0x0094
        L_0x006c:
            java.lang.String r4 = ".mp4"
            boolean r4 = r5.equals(r4)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            if (r4 == 0) goto L_0x0092
            android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            r5.<init>()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            r5.setDataSource(r10)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            r4 = 9
            java.lang.String r4 = r5.extractMetadata(r4)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            if (r4 == 0) goto L_0x0088
            long r0 = java.lang.Long.parseLong(r4)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
        L_0x0088:
            r12 = 3
            goto L_0x0095
        L_0x008a:
            java.lang.String r4 = ".jpg"
            boolean r4 = r5.equals(r4)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            if (r4 != 0) goto L_0x0094
        L_0x0092:
            r12 = 0
            goto L_0x0095
        L_0x0094:
            r12 = 1
        L_0x0095:
            int r14 = (int) r0     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            long r15 = X.AnonymousClass7TG.A0I()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            com.instagram.common.gallery.Medium r8 = new com.instagram.common.gallery.Medium     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r8.A0G     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            java.lang.String r0 = r2.A02     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            r1.A03 = r0     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00a7 }
            goto L_0x000a
        L_0x00a7:
            r4 = move-exception
            java.lang.String r1 = "StellaRequestHandler"
            java.lang.String r0 = "cannot retrieve media info based on uri"
            goto L_0x00b2
        L_0x00ad:
            r4 = move-exception
            java.lang.String r1 = "StellaRequestHandler"
            java.lang.String r0 = "cannot create medium object based on uri"
        L_0x00b2:
            X.0KC.A0F(r1, r0, r4)
            goto L_0x000a
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NS1.run():void");
    }
}
