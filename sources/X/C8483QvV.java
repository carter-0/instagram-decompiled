package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: X.QvV  reason: case insensitive filesystem */
public final class C8483QvV extends C8492Qve {
    public Future A00;
    public volatile String A01;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054 A[Catch:{ Exception -> 0x0062 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055 A[Catch:{ Exception -> 0x0062 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.C8483QvV r7) {
        /*
            java.lang.String r6 = "0"
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r1.toLowerCase(r0)
            X.SFa r0 = X.C11381SQt.A00(r7)     // Catch:{ Exception -> 0x0062 }
            android.content.Context r1 = r0.A01     // Catch:{ Exception -> 0x0062 }
            java.lang.String r4 = "Failed to close clientId writing stream"
            X.AnonymousClass3Qk.A04(r5)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "ClientId should be saved from worker thread"
            X.AnonymousClass3Qk.A05(r0)     // Catch:{ Exception -> 0x0062 }
            r3 = 0
            r2 = 0
            java.lang.String r0 = "Storing clientId"
            r7.A0E(r0, r5)     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x0039 }
            java.lang.String r0 = "gaClientId"
            java.io.FileOutputStream r2 = r1.openFileOutput(r0, r3)     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x0039 }
            byte[] r0 = r5.getBytes()     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x0039 }
            r2.write(r0)     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x0039 }
            r2.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0051
        L_0x0034:
            r0 = move-exception
            r7.A0H(r4, r0)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0051
        L_0x0039:
            r1 = move-exception
            java.lang.String r0 = "Error writing to clientId file"
            r7.A0H(r0, r1)     // Catch:{ all -> 0x0056 }
            goto L_0x0046
        L_0x0040:
            r1 = move-exception
            java.lang.String r0 = "Error creating clientId file"
            r7.A0H(r0, r1)     // Catch:{ all -> 0x0056 }
        L_0x0046:
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0052
        L_0x004c:
            r0 = move-exception
            r7.A0H(r4, r0)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0052
        L_0x0051:
            r3 = 1
        L_0x0052:
            if (r3 != 0) goto L_0x0055
            return r6
        L_0x0055:
            return r5
        L_0x0056:
            r1 = move-exception
            if (r2 == 0) goto L_0x0061
            r2.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x0061
        L_0x005d:
            r0 = move-exception
            r7.A0H(r4, r0)     // Catch:{ Exception -> 0x0062 }
        L_0x0061:
            throw r1     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            java.lang.String r0 = "Error saving clientId file"
            r7.A0H(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8483QvV.A00(X.QvV):java.lang.String");
    }

    public final String A0K() {
        String str;
        FutureTask futureTask;
        A0J();
        synchronized (this) {
            if (this.A01 == null) {
                C11200SFa A002 = C11381SQt.A00(this);
                TN6 tn6 = new TN6(this);
                if (Thread.currentThread() instanceof C13229TQv) {
                    FutureTask futureTask2 = new FutureTask(tn6);
                    futureTask2.run();
                    futureTask = futureTask2;
                } else {
                    futureTask = A002.A02.submit(tn6);
                }
                this.A00 = futureTask;
            }
            Future future = this.A00;
            if (future != null) {
                try {
                    this.A01 = (String) future.get();
                } catch (InterruptedException e) {
                    A0G("ClientId loading or generation was interrupted", e);
                    this.A01 = "0";
                } catch (ExecutionException e2) {
                    A0H("Failed to load or generate client id", e2);
                    this.A01 = "0";
                }
                if (this.A01 == null) {
                    this.A01 = "0";
                }
                A0E("Loaded clientId", this.A01);
                this.A00 = null;
            }
            str = this.A01;
        }
        return str;
    }
}
