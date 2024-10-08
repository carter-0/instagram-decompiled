package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;

/* renamed from: X.Q6p  reason: case insensitive filesystem */
public final class C7358Q6p extends AsyncTask {
    public Context A00;
    public Bitmap A01;
    public Uri A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0112 A[Catch:{ IOException -> 0x012d }] */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r13) {
        /*
            r12 = this;
            X.SOG r5 = X.SOG.A06     // Catch:{ IOException -> 0x012d }
            android.content.Context r7 = r12.A00     // Catch:{ IOException -> 0x012d }
            android.net.Uri r8 = r12.A02     // Catch:{ IOException -> 0x012d }
            boolean r2 = r12.A04     // Catch:{ IOException -> 0x012d }
            boolean r4 = r12.A05     // Catch:{ IOException -> 0x012d }
            java.lang.String r1 = r8.getScheme()     // Catch:{ IOException -> 0x012d }
            java.lang.String r0 = "http"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x012d }
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "https"
            boolean r1 = r0.equals(r1)     // Catch:{ IOException -> 0x012d }
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r0 == 0) goto L_0x0077
            java.util.Map r10 = r5.A02     // Catch:{ IOException -> 0x012d }
            java.lang.Object r11 = r10.get(r8)     // Catch:{ IOException -> 0x012d }
            java.io.File r11 = (java.io.File) r11     // Catch:{ IOException -> 0x012d }
            if (r11 != 0) goto L_0x0079
            X.Ni4 r11 = X.Pxk.A0E(r7, r8)     // Catch:{ IOException -> 0x012d }
            java.lang.String r0 = r8.toString()     // Catch:{ IOException -> 0x012d }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x012d }
            r1.<init>(r0)     // Catch:{ IOException -> 0x012d }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r0]     // Catch:{ all -> 0x0075 }
            java.io.InputStream r0 = r1.openStream()     // Catch:{ all -> 0x0075 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0075 }
            r6.<init>(r0)     // Catch:{ all -> 0x0075 }
            java.io.FileOutputStream r0 = X.JTO.A0t(r11)     // Catch:{ all -> 0x0075 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0075 }
            r3.<init>(r0)     // Catch:{ all -> 0x0075 }
        L_0x004f:
            int r1 = r6.read(r9)     // Catch:{ all -> 0x006d }
            r0 = -1
            if (r1 == r0) goto L_0x005b
            r0 = 0
            r3.write(r9, r0, r1)     // Catch:{ all -> 0x006d }
            goto L_0x004f
        L_0x005b:
            r3.flush()     // Catch:{ all -> 0x006d }
            r3.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            r6.close()     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            monitor-enter(r10)     // Catch:{ IOException -> 0x012d }
            r10.put(r8, r11)     // Catch:{ all -> 0x006a }
            monitor-exit(r10)     // Catch:{ all -> 0x006a }
            goto L_0x0079
        L_0x006a:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x006a }
            goto L_0x00cd
        L_0x006d:
            r0 = move-exception
            r3.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            r6.close()     // Catch:{ Exception -> 0x0076 }
            goto L_0x0076
        L_0x0075:
            r0 = move-exception
        L_0x0076:
            throw r0     // Catch:{ IOException -> 0x012d }
        L_0x0077:
            r6 = r8
            goto L_0x007d
        L_0x0079:
            android.net.Uri r6 = android.net.Uri.fromFile(r11)     // Catch:{ IOException -> 0x012d }
        L_0x007d:
            android.graphics.Bitmap r3 = X.SOG.A00(r7, r6)     // Catch:{ IOException -> 0x012d }
            if (r3 == 0) goto L_0x00cf
            java.lang.String r0 = r8.getPath()     // Catch:{ IOException -> 0x012d }
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = r8.getPath()     // Catch:{ IOException -> 0x012d }
            r8 = -1
            android.media.ExifInterface r9 = new android.media.ExifInterface     // Catch:{ IOException -> 0x00af }
            r9.<init>(r0)     // Catch:{ IOException -> 0x00af }
            java.lang.String r1 = "Orientation"
            r0 = 1
            int r1 = r9.getAttributeInt(r1, r0)     // Catch:{ IOException -> 0x012d }
            if (r1 == r0) goto L_0x00b4
            r0 = 3
            if (r1 == r0) goto L_0x00ac
            r0 = 6
            if (r1 == r0) goto L_0x00a9
            r0 = 8
            if (r1 != r0) goto L_0x00b5
            r8 = 270(0x10e, float:3.78E-43)
            goto L_0x00b5
        L_0x00a9:
            r8 = 90
            goto L_0x00b5
        L_0x00ac:
            r8 = 180(0xb4, float:2.52E-43)
            goto L_0x00b5
        L_0x00af:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException -> 0x012d }
            goto L_0x00b5
        L_0x00b4:
            r8 = 0
        L_0x00b5:
            if (r8 <= 0) goto L_0x00cf
            android.graphics.Matrix r1 = X.AnonymousClass7TE.A0U()     // Catch:{ all -> 0x00c9 }
            float r0 = (float) r8     // Catch:{ all -> 0x00c9 }
            r1.postRotate(r0)     // Catch:{ all -> 0x00c9 }
            android.graphics.Bitmap r0 = X.Pxk.A09(r3, r1)     // Catch:{ all -> 0x00c9 }
            if (r3 == r0) goto L_0x00ce
            r3.recycle()     // Catch:{ IOException -> 0x012d }
            goto L_0x00ce
        L_0x00c9:
            r0 = move-exception
            r3.recycle()     // Catch:{ IOException -> 0x012d }
        L_0x00cd:
            throw r0     // Catch:{ IOException -> 0x012d }
        L_0x00ce:
            r3 = r0
        L_0x00cf:
            if (r2 == 0) goto L_0x011c
            if (r3 == 0) goto L_0x011c
            int r1 = r3.getWidth()     // Catch:{ IOException -> 0x012d }
            int r0 = r3.getHeight()     // Catch:{ IOException -> 0x012d }
            if (r1 == r0) goto L_0x011c
            int r1 = r3.getWidth()     // Catch:{ IOException -> 0x012d }
            int r0 = r3.getHeight()     // Catch:{ IOException -> 0x012d }
            int r2 = java.lang.Math.min(r1, r0)     // Catch:{ IOException -> 0x012d }
            if (r1 <= r0) goto L_0x00ef
            int r1 = r1 - r0
            int r1 = r1 / 2
            goto L_0x00f3
        L_0x00ef:
            if (r1 >= r0) goto L_0x00f2
            goto L_0x00f5
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            r0 = 0
            goto L_0x00f9
        L_0x00f5:
            int r0 = r0 - r1
            int r0 = r0 / 2
            r1 = 0
        L_0x00f9:
            X.0fO.A03(r3)     // Catch:{ IOException -> 0x012d }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r1, r0, r2, r2)     // Catch:{ IOException -> 0x012d }
            X.Ni4 r0 = X.Pxk.A0E(r7, r6)     // Catch:{ IOException -> 0x012d }
            android.net.Uri r6 = android.net.Uri.fromFile(r0)     // Catch:{ IOException -> 0x012d }
            android.content.ContentResolver r0 = r7.getContentResolver()     // Catch:{ IOException -> 0x012d }
            java.io.OutputStream r2 = r0.openOutputStream(r6)     // Catch:{ IOException -> 0x012d }
            if (r2 == 0) goto L_0x011c
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x012d }
            r0 = 100
            X.0fO.A02(r1, r3, r2, r0)     // Catch:{ IOException -> 0x012d }
            r2.close()     // Catch:{ IOException -> 0x012d }
        L_0x011c:
            if (r4 == 0) goto L_0x0120
            r5.A00 = r6     // Catch:{ IOException -> 0x012d }
        L_0x0120:
            r12.A01 = r3     // Catch:{ IOException -> 0x012d }
            if (r3 != 0) goto L_0x012b
            java.lang.String r0 = "Failed to load bitmap"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ IOException -> 0x012d }
            return r0
        L_0x012b:
            r0 = 0
            return r0
        L_0x012d:
            r0 = move-exception
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7358Q6p.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        C13708TfS tfS;
        Throwable th = (Throwable) obj;
        SOG sog = SOG.A06;
        Context context = this.A00;
        Uri uri = this.A02;
        String str = this.A03;
        Bitmap bitmap = this.A01;
        synchronized (sog.A05) {
            tfS = (C13708TfS) sog.A03.remove(uri);
        }
        if (tfS != null) {
            if (th == null) {
                if (bitmap == null) {
                    th = new Throwable("Bitmap is null");
                } else {
                    tfS.CyG(context, bitmap, str);
                    return;
                }
            }
            tfS.DOI(str, th);
            return;
        }
        File file = (File) sog.A02.remove(uri);
        if (file != null) {
            file.delete();
        }
    }
}
