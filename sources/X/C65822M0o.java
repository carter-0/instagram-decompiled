package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.M0o  reason: case insensitive filesystem */
public final class C65822M0o implements C13824Thu {
    public static final long A02 = TimeUnit.MILLISECONDS.toMicros(15);
    public int A00;
    public final List A01;

    public final boolean Cqr() {
        return true;
    }

    public final void DKn(long j) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.1zE.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CyD(long r8, int r10, android.graphics.Bitmap r11) {
        /*
            r7 = this;
            int r0 = r7.A00
            int r0 = r0 + 1
            r7.A00 = r0
            java.util.List r0 = r7.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x000c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r4 = r3.next()
            r0 = r4
            X.JtF r0 = (X.C60895JtF) r0
            long r0 = r0.A04
            long r0 = r0 - r8
            long r5 = java.lang.Math.abs(r0)
            long r1 = A02
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x000c
        L_0x0026:
            X.JtF r4 = (X.C60895JtF) r4
            java.lang.String r2 = "PtsCaptureDecision"
            if (r4 == 0) goto L_0x0085
            java.lang.String r1 = r4.A06
            java.lang.String r0 = "compare.png"
            java.lang.String r3 = X.002.A0R(r1, r0)
            goto L_0x0037
        L_0x0035:
            r4 = 0
            goto L_0x0026
        L_0x0037:
            java.io.File r0 = X.AnonymousClass7TE.A0t(r3)     // Catch:{ all -> 0x0064 }
            java.io.FileOutputStream r5 = X.JTO.A0t(r0)     // Catch:{ all -> 0x0064 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x005d }
            r0 = 100
            X.0fO.A01(r1, r11, r0)     // Catch:{ all -> 0x005d }
            boolean r0 = r11.compress(r1, r0, r5)     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0057
            java.lang.String r1 = "bitmap_compress_error"
            java.lang.String r0 = "path:"
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x005d }
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x005d }
        L_0x0057:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x005d }
            r5.close()     // Catch:{ all -> 0x0064 }
            goto L_0x0069
        L_0x005d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            X.1zE.A00(r5, r1)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            X.0eQ r1 = X.JTO.A1B(r0)
        L_0x0069:
            boolean r0 = r1 instanceof X.0eQ
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0075
            r4.A05 = r3
            r4.A01 = r10
            r4.A03 = r8
        L_0x0075:
            java.lang.Throwable r1 = X.0eR.A00(r1)
            if (r1 == 0) goto L_0x0085
            java.lang.String r0 = "bitmap io error"
            X.0KC.A0G(r2, r0, r1)
            java.lang.String r0 = "compare_img_save_err"
            X.0wb.A07(r0, r1)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65822M0o.CyD(long, int, android.graphics.Bitmap):void");
    }

    public final boolean ErY(int i, long j) {
        Iterator it = this.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Math.abs(((C60895JtF) next).A04 - j) < A02) {
                if (next == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C65822M0o(List list) {
        this.A01 = list;
    }

    public final /* synthetic */ Long AVQ(List list) {
        return null;
    }
}
