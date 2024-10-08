package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6OL  reason: invalid class name */
public final class AnonymousClass6OL {
    public static final AnonymousClass6OL A00 = new Object();

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.3zD, java.lang.Runnable] */
    public static final ListenableFuture A01(String str, boolean z) {
        if (!z) {
            return A00(str);
        }
        AnonymousClass6OM r2 = new AnonymousClass6OM(str);
        0nQ r3 = new 0nQ(0nY.A00(), 260801298, 3, false, false);
        ? obj = new Object();
        obj.A00 = new AnonymousClass6OO(r2, obj);
        r3.execute(obj);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.1K2] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.common.util.concurrent.ListenableFuture A00(java.lang.String r2) {
        /*
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x0025 }
            X.16F r2 = r0.A03(r2)     // Catch:{ IOException -> 0x0025 }
            r2.A1J()     // Catch:{ all -> 0x001e }
            X.4hR r0 = X.C276404tH.A00(r2)     // Catch:{ all -> 0x001e }
            X.3ew r1 = r0.A01()     // Catch:{ all -> 0x001e }
            r2.close()     // Catch:{ IOException -> 0x0025 }
            r0 = 0
            X.68u r0 = X.C3034368u.A03(r0, r1, r0)     // Catch:{ IOException -> 0x0025 }
            com.google.common.util.concurrent.ListenableFuture r0 = X.C255183ti.A03(r0)     // Catch:{ IOException -> 0x0025 }
            return r0
        L_0x001e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x0025 }
            throw r0     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            X.R1v r0 = new X.R1v
            r0.<init>()
            r0.setException(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OL.A00(java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }
}
