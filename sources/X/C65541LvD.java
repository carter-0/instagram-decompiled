package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LvD  reason: case insensitive filesystem */
public final class C65541LvD implements MU6 {
    public final Context A00;
    public final UserSession A01;

    private final boolean A00(AnonymousClass3Q2 r5) {
        if ((!r5.A5V && !r5.A0x()) || r5.A33 != null) {
            return false;
        }
        UserSession userSession = this.A01;
        if ((!C64016LJd.A01(r5) || !C64016LJd.A00(userSession, r5)) && 182.A06(0Tu.A05, userSession, 36322212005095429L)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.1zE.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FIH(X.LP8 r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            X.3Q2 r5 = r13.A0D
            boolean r0 = r12.A00(r5)
            if (r0 == 0) goto L_0x0101
            boolean r0 = r12.A00(r5)
            if (r0 == 0) goto L_0x00fe
            com.instagram.pendingmedia.model.constants.ShareType r1 = r5.A0E()
            com.instagram.common.session.UserSession r4 = r13.A0C
            boolean r0 = r5.A12()
            boolean r11 = X.C63374Kvv.A00(r4, r1, r0)
            java.lang.String r0 = r5.A3V
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "Cover frame error: no rendered video"
        L_0x0022:
            if (r11 == 0) goto L_0x0030
            X.55S r2 = X.AnonymousClass55S.A0G
        L_0x0026:
            X.55U r1 = r13.A02(r2, r0)
            X.KVk r0 = new X.KVk
            r0.<init>(r1)
            return r0
        L_0x0030:
            X.55S r2 = X.AnonymousClass55S.A0F
            goto L_0x0026
        L_0x0033:
            com.instagram.common.session.UserSession r8 = r12.A01
            X.0Tu r7 = X.0Tu.A05
            r0 = 36322212004964356(0x810adc00032804, double:3.033651357523179E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x0056
            android.content.Context r0 = r12.A00     // Catch:{ all -> 0x0049 }
            android.graphics.Bitmap r6 = X.AIQ.A00(r0, r8, r5)     // Catch:{ all -> 0x0049 }
            goto L_0x004e
        L_0x0049:
            r0 = move-exception
            X.0eQ r6 = X.JTO.A1B(r0)
        L_0x004e:
            boolean r0 = r6 instanceof X.0eQ
            if (r0 == 0) goto L_0x0053
            r6 = 0
        L_0x0053:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            goto L_0x005c
        L_0x0056:
            android.content.Context r0 = r12.A00
            android.graphics.Bitmap r6 = X.AIQ.A00(r0, r8, r5)
        L_0x005c:
            if (r6 != 0) goto L_0x0061
            java.lang.String r0 = "Cover frame error: could not retrieve photo"
            goto L_0x0022
        L_0x0061:
            int r3 = r6.getWidth()
            int r2 = r6.getHeight()
            X.AnonymousClass457.A0E()     // Catch:{ all -> 0x00e4 }
            r0 = 36609382109157227(0x82100a0010176b, double:3.215258887755945E-306)
            int r9 = X.DbS.A04(r7, r8, r0)     // Catch:{ all -> 0x00e4 }
            if (r9 != 0) goto L_0x007b
            int r9 = X.LTE.A00(r3)     // Catch:{ all -> 0x00e4 }
        L_0x007b:
            java.io.File r10 = X.AnonymousClass457.A01()     // Catch:{ all -> 0x00e4 }
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00e4 }
            java.io.FileOutputStream r0 = X.JTO.A0t(r10)     // Catch:{ all -> 0x00e4 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00e4 }
            r7.<init>(r0)     // Catch:{ all -> 0x00e4 }
            X.0fO.A01(r8, r6, r9)     // Catch:{ all -> 0x00dd }
            boolean r0 = r6.compress(r8, r9, r7)     // Catch:{ all -> 0x00dd }
            r6 = 0
            r7.close()     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00c9
            java.lang.StringBuilder r7 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "file size "
            r7.append(r0)     // Catch:{ all -> 0x00e4 }
            long r0 = r10.length()     // Catch:{ all -> 0x00e4 }
            r7.append(r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = ", quality "
            r7.append(r0)     // Catch:{ all -> 0x00e4 }
            r7.append(r9)     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = ", format "
            r7.append(r0)     // Catch:{ all -> 0x00e4 }
            r7.append(r8)     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = ", file "
            r7.append(r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = r10.getCanonicalPath()     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r7)     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "bitmap_compress_error"
            X.0kD.A0C(r0, r1, r6)     // Catch:{ all -> 0x00e4 }
        L_0x00c9:
            java.lang.String r0 = r10.getCanonicalPath()     // Catch:{ all -> 0x00e4 }
            r5.A33 = r0     // Catch:{ all -> 0x00e4 }
            r5.A0C = r3     // Catch:{ all -> 0x00e4 }
            r5.A0B = r2     // Catch:{ all -> 0x00e4 }
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r4)     // Catch:{ all -> 0x00e4 }
            r0.A0A()     // Catch:{ all -> 0x00e4 }
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x00e4 }
            goto L_0x00e9
        L_0x00dd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00df }
        L_0x00df:
            r0 = move-exception
            X.1zE.A00(r7, r1)     // Catch:{ all -> 0x00e4 }
            throw r0     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            X.0eQ r0 = X.JTO.A1B(r0)
        L_0x00e9:
            java.lang.Throwable r1 = X.0eR.A00(r0)
            if (r1 == 0) goto L_0x00fe
            java.lang.String r0 = "Cover frame error: unable to compress and save bitmap: "
            if (r11 == 0) goto L_0x00fb
            X.55S r2 = X.AnonymousClass55S.A0G
        L_0x00f5:
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r1)
            goto L_0x0026
        L_0x00fb:
            X.55S r2 = X.AnonymousClass55S.A0F
            goto L_0x00f5
        L_0x00fe:
            X.KVm r0 = X.C62013KVm.A00
            return r0
        L_0x0101:
            X.KVl r0 = X.C62012KVl.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65541LvD.FIH(X.LP8, X.4D7):java.lang.Object");
    }

    public final String getName() {
        return "RenderCoverFrame";
    }

    public C65541LvD(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
