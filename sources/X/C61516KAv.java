package X;

import java.io.File;

/* renamed from: X.KAv  reason: case insensitive filesystem */
public final class C61516KAv extends C18594Vul {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ File A04;

    public final void A03(Exception exc) {
        0qQ.A0B(exc, 0);
        0KC.A0F("VideoFrameSaver", "bitmap capture error", exc);
        0wb.A07("bitmap_capture_error", exc);
    }

    public C61516KAv(File file, int i, int i2, int i3, long j) {
        this.A04 = file;
        this.A01 = i;
        this.A03 = j;
        this.A02 = i2;
        this.A00 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.1zE.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A04(java.lang.Object r10) {
        /*
            r9 = this;
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            java.lang.String r5 = "VideoFrameSaver"
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.io.File r0 = r9.A04     // Catch:{ IOException -> 0x0044 }
            java.io.FileOutputStream r6 = X.JTO.A0t(r0)     // Catch:{ IOException -> 0x0044 }
            int r2 = r9.A01     // Catch:{ IOException -> 0x0044 }
            long r0 = r9.A03     // Catch:{ IOException -> 0x0044 }
            int r8 = r9.A02     // Catch:{ IOException -> 0x0044 }
            int r7 = r9.A00     // Catch:{ IOException -> 0x0044 }
            java.lang.String r4 = "saving bitmap on frame %s, ptsUs %s, %s X %s"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003d }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x003d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x003d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x003d }
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r2, r1, r0}     // Catch:{ all -> 0x003d }
            X.0KC.A0O(r5, r4, r0)     // Catch:{ all -> 0x003d }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x003d }
            r0 = 100
            X.0fO.A02(r1, r10, r6, r0)     // Catch:{ all -> 0x003d }
            r10.recycle()     // Catch:{ all -> 0x003d }
            r6.close()     // Catch:{ IOException -> 0x0044 }
            return
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            X.1zE.A00(r6, r1)     // Catch:{ IOException -> 0x0044 }
            throw r0     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r1 = move-exception
            java.lang.String r0 = "bitmap disk save error"
            X.0KC.A0F(r5, r0, r1)
            java.lang.String r0 = "bitmap_disk_save_error"
            X.0wb.A07(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61516KAv.A04(java.lang.Object):void");
    }
}
