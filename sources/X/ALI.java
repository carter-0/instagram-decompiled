package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.util.List;

public final class ALI implements Handler.Callback {
    public static volatile Handler A00;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.1zE.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C41807B1m r13, X.C39669A4j r14, X.C39670A4k r15, byte[] r16) {
        /*
            r4 = r13
            boolean r0 = A0A()
            r3 = r15
            r9 = r16
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r13 instanceof X.Slp
            if (r0 == 0) goto L_0x00e5
            X.Slp r4 = (X.Slp) r4
            java.lang.String r8 = "Orientation"
            r10 = 0
            X.0qQ.A0B(r9, r10)
            X.S3Y r11 = r4.A00     // Catch:{ Exception -> 0x00c9 }
            long r5 = r11.A08     // Catch:{ Exception -> 0x00c9 }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b1
            int r7 = r9.length     // Catch:{ Exception -> 0x00c9 }
            long r0 = (long) r7     // Catch:{ Exception -> 0x00c9 }
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b1
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeByteArray(r9, r10, r7)     // Catch:{ Exception -> 0x00c9 }
            if (r13 == 0) goto L_0x00aa
            java.lang.String r7 = r11.A0D     // Catch:{ Exception -> 0x00c9 }
            X.0qQ.A0B(r7, r10)     // Catch:{ Exception -> 0x00c9 }
            r10 = 1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00c9 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x00c9 }
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00a3 }
            r11 = 90
            X.0fO.A02(r12, r13, r2, r11)     // Catch:{ all -> 0x00a3 }
            r2.close()     // Catch:{ Exception -> 0x00c9 }
            int r1 = r13.getWidth()     // Catch:{ Exception -> 0x00c9 }
            int r14 = r13.getHeight()     // Catch:{ Exception -> 0x00c9 }
            java.io.File r0 = X.AnonymousClass7TE.A0t(r7)     // Catch:{ Exception -> 0x00c9 }
            long r15 = r0.length()     // Catch:{ Exception -> 0x00c9 }
        L_0x0051:
            int r0 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0083
            java.io.File r0 = X.AnonymousClass7TE.A0t(r7)     // Catch:{ Exception -> 0x00c9 }
            r0.delete()     // Catch:{ Exception -> 0x00c9 }
            float r0 = (float) r1     // Catch:{ Exception -> 0x00c9 }
            r2 = 1064514355(0x3f733333, float:0.95)
            float r0 = r0 * r2
            int r1 = (int) r0     // Catch:{ Exception -> 0x00c9 }
            float r0 = (float) r14     // Catch:{ Exception -> 0x00c9 }
            float r0 = r0 * r2
            int r14 = (int) r0     // Catch:{ Exception -> 0x00c9 }
            android.graphics.Bitmap r0 = X.0fO.A00(r13, r1, r14, r10)     // Catch:{ Exception -> 0x00c9 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x00c9 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00c9 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x00c9 }
            X.0fO.A02(r12, r0, r2, r11)     // Catch:{ all -> 0x00a3 }
            r2.close()     // Catch:{ Exception -> 0x00c9 }
            r0.recycle()     // Catch:{ Exception -> 0x00c9 }
            java.io.File r0 = X.AnonymousClass7TE.A0t(r7)     // Catch:{ Exception -> 0x00c9 }
            long r15 = r0.length()     // Catch:{ Exception -> 0x00c9 }
            goto L_0x0051
        L_0x0083:
            java.nio.charset.Charset r0 = X.C369128tt.A04     // Catch:{ Exception -> 0x00c9 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x00c9 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x00c9 }
            X.8tt r0 = new X.8tt     // Catch:{ Exception -> 0x00c9 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00c9 }
            int r0 = r0.A02(r8, r10)     // Catch:{ Exception -> 0x00c9 }
            X.2kK r1 = new X.2kK     // Catch:{ Exception -> 0x00c9 }
            r1.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00c9 }
            r1.A0P(r8, r0)     // Catch:{ Exception -> 0x00c9 }
            r1.A0O()     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00d3
        L_0x00a3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            X.1zE.A00(r2, r0)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00b0
        L_0x00aa:
            java.lang.String r0 = "unable to decode jpeg"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x00c9 }
        L_0x00b0:
            throw r1     // Catch:{ Exception -> 0x00c9 }
        L_0x00b1:
            java.lang.String r0 = r11.A0D     // Catch:{ Exception -> 0x00c9 }
            X.0qQ.A0B(r0, r10)     // Catch:{ Exception -> 0x00c9 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00c9 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00c9 }
            r2.write(r9)     // Catch:{ all -> 0x00c2 }
            r2.close()     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00d3
        L_0x00c2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ Exception -> 0x00c9 }
            throw r0     // Catch:{ Exception -> 0x00c9 }
        L_0x00c9:
            r1 = move-exception
            X.S3Y r0 = r4.A00
            X.S4B r0 = r0.A02
            if (r0 == 0) goto L_0x00d3
            r0.A01(r1)
        L_0x00d3:
            if (r3 == 0) goto L_0x00f8
            X.7tt r0 = r3.A00
            X.7r2 r1 = r0.A06
            java.lang.String r0 = "Lite-Controller-Thread"
            android.os.Handler r1 = r1.BAM(r0)
            java.lang.Runnable r0 = r3.A01
            r1.post(r0)
            return
        L_0x00e5:
            java.lang.String r0 = "Callback instance must be either PhotoJpegCallback or PhotoJpegInfoCallback"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x00ec:
            android.os.Handler r2 = A00()
            java.lang.Object[] r1 = new java.lang.Object[]{r13, r9, r14, r15}
            r0 = 6
            X.AnonymousClass7TE.A1S(r2, r1, r0)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALI.A02(X.B1m, X.A4j, X.A4k, byte[]):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Handler$Callback, java.lang.Object] */
    public static synchronized Handler A00() {
        Handler handler;
        synchronized (ALI.class) {
            if (A00 == null) {
                A00 = new Handler(Looper.getMainLooper(), new Object());
            }
            handler = A00;
        }
        return handler;
    }

    public static Object[] A0B(Message message) {
        Object obj = message.obj;
        obj.getClass();
        return (Object[]) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        r4.sendMessage(r4.obtainMessage(r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            int r0 = r9.what
            r7 = 3
            r6 = 2
            r4 = 1
            r5 = 0
            switch(r0) {
                case 1: goto L_0x009a;
                case 2: goto L_0x00a2;
                case 3: goto L_0x00aa;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00d2;
                case 6: goto L_0x00ea;
                case 7: goto L_0x000a;
                case 8: goto L_0x0102;
                case 9: goto L_0x0126;
                case 10: goto L_0x0136;
                case 11: goto L_0x015a;
                case 12: goto L_0x017e;
                case 13: goto L_0x001f;
                case 14: goto L_0x018e;
                case 15: goto L_0x0042;
                case 16: goto L_0x0065;
                case 17: goto L_0x007c;
                default: goto L_0x0009;
            }
        L_0x0009:
            return r5
        L_0x000a:
            r1 = 0
            boolean r0 = A0A()
            if (r0 == 0) goto L_0x0019
            r1.getClass()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0019:
            android.os.Handler r4 = A00()
            r0 = 7
            goto L_0x0092
        L_0x001f:
            java.lang.Object[] r0 = A0B(r9)
            r3 = r0[r5]
            r0 = r0[r4]
            java.lang.Number r0 = (java.lang.Number) r0
            double r1 = r0.doubleValue()
            boolean r0 = A0A()
            if (r0 != 0) goto L_0x0009
            android.os.Handler r4 = A00()
            java.lang.Double r0 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r0}
            r0 = 13
            goto L_0x0092
        L_0x0042:
            java.lang.Object[] r0 = A0B(r9)
            r3 = 0
            r2 = r0[r4]
            r1 = r0[r6]
            boolean r0 = A0A()
            if (r0 == 0) goto L_0x005a
            if (r2 == 0) goto L_0x0009
            java.lang.String r0 = "onPostViewReady"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x005a:
            android.os.Handler r4 = A00()
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1}
            r0 = 15
            goto L_0x0092
        L_0x0065:
            java.lang.Object[] r0 = A0B(r9)
            r1 = r0[r5]
            boolean r0 = A0A()
            if (r0 != 0) goto L_0x0009
            android.os.Handler r4 = A00()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0 = 16
            goto L_0x0092
        L_0x007c:
            java.lang.Object[] r0 = A0B(r9)
            r1 = r0[r5]
            boolean r0 = A0A()
            if (r0 != 0) goto L_0x0009
            android.os.Handler r4 = A00()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0 = 17
        L_0x0092:
            android.os.Message r0 = r4.obtainMessage(r0, r1)
            r4.sendMessage(r0)
            return r5
        L_0x009a:
            java.lang.Object r0 = r9.obj
            java.util.List r0 = (java.util.List) r0
            A08(r0)
            return r5
        L_0x00a2:
            java.lang.Object r0 = r9.obj
            java.util.List r0 = (java.util.List) r0
            A09(r0)
            return r5
        L_0x00aa:
            java.lang.Object[] r0 = A0B(r9)
            r1 = r0[r5]
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0 = r0[r4]
            java.util.List r0 = (java.util.List) r0
            A07(r1, r0)
            return r5
        L_0x00ba:
            java.lang.Object[] r0 = A0B(r9)
            r3 = r0[r5]
            java.util.List r3 = (java.util.List) r3
            r2 = r0[r4]
            java.lang.String r2 = (java.lang.String) r2
            r1 = r0[r6]
            java.lang.String r1 = (java.lang.String) r1
            r0 = r0[r7]
            X.7lS r0 = (X.C340557lS) r0
            A06(r0, r2, r1, r3)
            return r5
        L_0x00d2:
            java.lang.Object[] r0 = A0B(r9)
            r3 = r0[r5]
            X.B1m r3 = (X.C41807B1m) r3
            r2 = r0[r4]
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r1 = r0[r6]
            X.A4j r1 = (X.C39669A4j) r1
            r0 = r0[r7]
            X.A4k r0 = (X.C39670A4k) r0
            A01(r2, r3, r1, r0)
            return r5
        L_0x00ea:
            java.lang.Object[] r0 = A0B(r9)
            r3 = r0[r5]
            X.B1m r3 = (X.C41807B1m) r3
            r2 = r0[r4]
            byte[] r2 = (byte[]) r2
            r1 = r0[r6]
            X.A4j r1 = (X.C39669A4j) r1
            r0 = r0[r7]
            X.A4k r0 = (X.C39670A4k) r0
            A02(r3, r1, r0, r2)
            return r5
        L_0x0102:
            java.lang.Object[] r0 = A0B(r9)
            r3 = r0[r5]
            X.B1m r3 = (X.C41807B1m) r3
            r1 = r0[r4]
            java.lang.Exception r1 = (java.lang.Exception) r1
            boolean r0 = A0A()
            if (r0 == 0) goto L_0x0118
            r3.D0v()
            return r5
        L_0x0118:
            android.os.Handler r2 = A00()
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            r0 = 8
            X.AnonymousClass7TE.A1S(r2, r1, r0)
            return r5
        L_0x0126:
            java.lang.Object[] r0 = A0B(r9)
            r1 = r0[r5]
            X.B1m r1 = (X.C41807B1m) r1
            r0 = r0[r4]
            java.lang.Exception r0 = (java.lang.Exception) r0
            A03(r1, r0)
            return r5
        L_0x0136:
            java.lang.Object[] r0 = A0B(r9)
            r3 = r0[r5]
            X.B2M r3 = (X.B2M) r3
            r1 = r0[r4]
            X.A9S r1 = (X.A9S) r1
            boolean r0 = A0A()
            if (r0 == 0) goto L_0x014c
            r3.Dbz(r1)
            return r5
        L_0x014c:
            android.os.Handler r2 = A00()
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            r0 = 10
            X.AnonymousClass7TE.A1S(r2, r1, r0)
            return r5
        L_0x015a:
            java.lang.Object[] r0 = A0B(r9)
            r3 = r0[r5]
            X.B2M r3 = (X.B2M) r3
            r1 = r0[r4]
            X.A9S r1 = (X.A9S) r1
            boolean r0 = A0A()
            if (r0 == 0) goto L_0x0170
            r3.Dc2(r1)
            return r5
        L_0x0170:
            android.os.Handler r2 = A00()
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            r0 = 11
            X.AnonymousClass7TE.A1S(r2, r1, r0)
            return r5
        L_0x017e:
            java.lang.Object[] r0 = A0B(r9)
            r1 = r0[r5]
            X.B2M r1 = (X.B2M) r1
            r0 = r0[r4]
            java.lang.Exception r0 = (java.lang.Exception) r0
            A04(r1, r0)
            return r5
        L_0x018e:
            java.lang.Object[] r0 = A0B(r9)
            r2 = r0[r5]
            X.A3F r2 = (X.A3F) r2
            r1 = r0[r4]
            java.io.File r1 = (java.io.File) r1
            r0 = r0[r6]
            java.lang.Exception r0 = (java.lang.Exception) r0
            A05(r2, r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALI.handleMessage(android.os.Message):boolean");
    }

    public static void A01(Bitmap bitmap, C41807B1m b1m, C39669A4j a4j, C39670A4k a4k) {
        if (A0A()) {
            if (b1m instanceof B3L) {
                ((B3L) b1m).CyH(bitmap);
            } else if (b1m instanceof C40091AQw) {
                ((C40091AQw) b1m).A00(bitmap, a4j);
            } else {
                throw AnonymousClass7TE.A15("Callback instance must be either PhotoBitmapCallback or PhotoBitmapInfoCallback");
            }
            if (a4k != null) {
                a4k.A00.A06.BAM("Lite-Controller-Thread").post(a4k.A01);
                return;
            }
            return;
        }
        AnonymousClass7TE.A1S(A00(), new Object[]{b1m, bitmap, a4j, a4k}, 5);
    }

    public static void A03(C41807B1m b1m, Exception exc) {
        if (A0A()) {
            b1m.D0x(exc);
        } else {
            AnonymousClass7TE.A1S(A00(), new Object[]{b1m, exc}, 9);
        }
    }

    public static void A04(B2M b2m, Exception exc) {
        if (A0A()) {
            b2m.Dc0(exc);
        } else {
            AnonymousClass7TE.A1S(A00(), new Object[]{b2m, exc}, 12);
        }
    }

    public static void A05(A3F a3f, File file, Exception exc) {
        if (!A0A()) {
            AnonymousClass7TE.A1S(A00(), new Object[]{a3f, file, exc}, 14);
        } else if (exc == null) {
            0qQ.A0B(file, 0);
        }
    }

    public static void A06(C340557lS r3, String str, String str2, List list) {
        if (!A0A()) {
            AnonymousClass7TE.A1S(A00(), new Object[]{list, str, str2, r3}, 4);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ((C41825B2g) list.get(i)).D0C(str, str2);
        }
        if (r3 != null) {
            r3.D08(0, str, str2);
        }
    }

    public static void A07(Exception exc, List list) {
        if (!A0A()) {
            AnonymousClass7TE.A1S(A00(), new Object[]{exc, list}, 3);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ((C41825B2g) list.get(i)).D07(exc);
        }
    }

    public static void A08(List list) {
        if (A0A()) {
            list.getClass();
            for (int i = 0; i < list.size(); i++) {
                ((C41825B2g) list.get(i)).D0B();
            }
            return;
        }
        AnonymousClass7TE.A1S(A00(), list, 1);
    }

    public static void A09(List list) {
        if (A0A()) {
            list.getClass();
            for (int i = 0; i < list.size(); i++) {
                ((C41825B2g) list.get(i)).D0G();
            }
            return;
        }
        AnonymousClass7TE.A1S(A00(), list, 2);
    }

    public static boolean A0A() {
        return AnonymousClass7TF.A1W(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
