package X;

import android.os.Bundle;
import android.os.RemoteException;

public final class TL5 implements Runnable {
    public final Bundle A00;
    public final C13555TcR A01;
    public final String A02;
    public final /* synthetic */ Q5Y A03;

    public TL5(Bundle bundle, Q5Y q5y, C13555TcR tcR, String str) {
        this.A03 = q5y;
        this.A02 = str;
        this.A01 = tcR;
        this.A00 = bundle;
    }

    private void A00(int i) {
        String str;
        Q5Y q5y = this.A03;
        synchronized (q5y.A03) {
            try {
                this.A01.CfG(i);
                str = this.A02;
            } catch (RemoteException e) {
                str = this.A02;
                0KC.A0O("GcmTaskService", "Error reporting result of operation to scheduler for %s", new Object[]{str, e});
            } catch (Throwable th) {
                Q5Y.A02(q5y, this.A02);
                throw th;
            }
            Q5Y.A02(q5y, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        X.0KC.A0F("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", r2);
        A00(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r3 = this;
            X.Q5Y r2 = r3.A03     // Catch:{ RejectedExecutionException -> 0x001b }
            monitor-enter(r2)     // Catch:{ RejectedExecutionException -> 0x001b }
            java.util.concurrent.ExecutorService r0 = r2.A01     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0013
            r1 = 2
            X.TOI r0 = new X.TOI     // Catch:{ all -> 0x0018 }
            r0.<init>()     // Catch:{ all -> 0x0018 }
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)     // Catch:{ all -> 0x0018 }
            r2.A01 = r0     // Catch:{ all -> 0x0018 }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ RejectedExecutionException -> 0x001b }
            r0.execute(r3)     // Catch:{ RejectedExecutionException -> 0x001b }
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ RejectedExecutionException -> 0x001b }
            throw r0     // Catch:{ RejectedExecutionException -> 0x001b }
        L_0x001b:
            r2 = move-exception
            java.lang.String r1 = "GcmTaskService"
            java.lang.String r0 = "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay."
            X.0KC.A0F(r1, r0, r2)
            r0 = 1
            r3.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TL5.A01():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:65|66|67|68|80|81) */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019f, code lost:
        X.0KC.A0H("GooglePlayUploadService", "Misunderstood job extras: %s", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b1, code lost:
        if (r0 == false) goto L_0x01b3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0186 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x018d */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019e A[ExcHandler: 3yS | NumberFormatException (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:59:0x0173] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            X.Q5Y r9 = r13.A03
            java.lang.String r1 = r13.A02
            android.os.Bundle r0 = r13.A00
            X.RrK r10 = new X.RrK
            r10.<init>(r1, r0)
            boolean r0 = r9 instanceof com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat
            if (r0 == 0) goto L_0x010a
            com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat r9 = (com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat) r9
            long r11 = android.os.SystemClock.uptimeMillis()
            java.lang.String r3 = r10.A01
            r0 = 1
            X.2QW r1 = X.AnonymousClass2QW.A00(r9, r0)
            java.lang.String r0 = "[0-9]+"
            boolean r0 = r3.matches(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0056
            int r6 = java.lang.Integer.parseInt(r3)
        L_0x0029:
            java.lang.Class r4 = r9.getClass()
            android.util.SparseArray r0 = r1.A02
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L_0x007b
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x007b
            X.Sm9 r7 = new X.Sm9
            r7.<init>()
            android.os.Bundle r1 = r10.A00
            if (r1 != 0) goto L_0x0046
            android.os.Bundle r1 = android.os.Bundle.EMPTY
        L_0x0046:
            X.4xe r0 = r9.A00()
            boolean r0 = r0.A01(r1, r7, r6)
            if (r0 == 0) goto L_0x01b3
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r11
            goto L_0x0058
        L_0x0056:
            r6 = 0
            goto L_0x0029
        L_0x0058:
            long r2 = com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.A01     // Catch:{ TimeoutException -> 0x01a8 }
            long r2 = r2 - r0
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ TimeoutException -> 0x01a8 }
            long r4 = r4 + r2
        L_0x0060:
            java.util.concurrent.CountDownLatch r1 = r7.A00     // Catch:{ InterruptedException -> 0x0074 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0074 }
            boolean r0 = r1.await(r2, r0)     // Catch:{ InterruptedException -> 0x0074 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r7.A01     // Catch:{ InterruptedException -> 0x0074 }
            goto L_0x01b0
        L_0x006e:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ InterruptedException -> 0x0074 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x0074 }
            throw r0     // Catch:{ InterruptedException -> 0x0074 }
        L_0x0074:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ TimeoutException -> 0x01a8 }
            long r2 = r4 - r0
            goto L_0x0060
        L_0x007b:
            java.lang.Object[] r5 = new java.lang.Object[]{r3}
            java.lang.String r1 = "GcmTaskServiceCompat"
            java.lang.String r0 = "Invalid GCM task id, cancelling: %s"
            X.0KC.A0O(r1, r0, r5)
            X.SSK r7 = X.SSK.A01(r9)     // Catch:{ IllegalArgumentException -> 0x00cb }
            android.content.Context r6 = r7.A00     // Catch:{ IllegalArgumentException -> 0x00cb }
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ IllegalArgumentException -> 0x00cb }
            r5.<init>(r6, r4)     // Catch:{ IllegalArgumentException -> 0x00cb }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalArgumentException -> 0x00cb }
            if (r0 != 0) goto L_0x00c4
            int r1 = r3.length()     // Catch:{ IllegalArgumentException -> 0x00cb }
            r0 = 100
            if (r1 > r0) goto L_0x00bd
            java.lang.String r0 = r5.getClassName()     // Catch:{ IllegalArgumentException -> 0x00cb }
            X.SSK.A02(r7, r0)     // Catch:{ IllegalArgumentException -> 0x00cb }
            java.lang.String r0 = "CANCEL_TASK"
            android.content.Intent r1 = X.SSK.A00(r5, r7, r0)     // Catch:{ IllegalArgumentException -> 0x00cb }
            if (r1 == 0) goto L_0x00d4
            java.lang.String r0 = "tag"
            r1.putExtra(r0, r3)     // Catch:{ IllegalArgumentException -> 0x00cb }
            java.lang.String r0 = "component"
            r1.putExtra(r0, r5)     // Catch:{ IllegalArgumentException -> 0x00cb }
            r6.sendBroadcast(r1)     // Catch:{ IllegalArgumentException -> 0x00cb }
            goto L_0x00d4
        L_0x00bd:
            java.lang.String r0 = "Tag is larger than max permissible tag length (100)"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IllegalArgumentException -> 0x00cb }
            goto L_0x00ca
        L_0x00c4:
            java.lang.String r0 = "Must provide a valid tag."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IllegalArgumentException -> 0x00cb }
        L_0x00ca:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00cb }
        L_0x00cb:
            r1 = move-exception
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r9, r4)
            X.RV0.A00(r0, r9, r1)
        L_0x00d4:
            android.content.Intent r1 = X.C66580MXl.A0A(r9, r4)
            java.lang.String r0 = "com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-"
            java.lang.String r0 = X.002.A0R(r0, r3)
            android.content.Intent r1 = r1.setAction(r0)
            java.lang.String r0 = r9.getPackageName()
            android.content.Intent r0 = r1.setPackage(r0)
            X.0Sy r1 = new X.0Sy
            r1.<init>()
            r1.A0A(r0)
            r1.A08()
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            android.app.PendingIntent r1 = r1.A03(r9, r2, r0)
            if (r1 == 0) goto L_0x01b3
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r9.getSystemService(r0)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            r0.cancel(r1)
            goto L_0x01b3
        L_0x010a:
            com.facebook.analytics2.logger.GooglePlayUploadService r9 = (com.facebook.analytics2.logger.GooglePlayUploadService) r9
            r6 = 2
            android.os.Bundle r5 = r10.A00     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            java.lang.String r2 = "GooglePlayUploadService"
            r1 = 0
            if (r5 != 0) goto L_0x011f
            r0 = 453(0x1c5, float:6.35E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            X.0KC.A0C(r2, r0)     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            goto L_0x01a6
        L_0x011f:
            java.lang.String r0 = "__VERSION_CODE"
            int r1 = r5.getInt(r0, r1)     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            int r0 = com.facebook.common.build.BuildConstants.A01()     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            r8 = 1
            if (r0 == r1) goto L_0x013e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            java.lang.String r0 = "Job with old build ID: %d, cancelling job, expected: %d"
            X.0KC.A0O(r2, r0, r1)     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            goto L_0x01a6
        L_0x013e:
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            java.lang.String r2 = r10.A01     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            java.lang.String r1 = "-"
            r0 = 3
            java.lang.String[] r0 = r2.split(r1, r0)     // Catch:{ RuntimeException -> 0x0193, 3yS | NumberFormatException -> 0x019e }
            r0 = r0[r6]     // Catch:{ RuntimeException -> 0x0193, 3yS | NumberFormatException -> 0x019e }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x0193, 3yS | NumberFormatException -> 0x019e }
            X.1uw r2 = new X.1uw     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            r2.<init>(r5)     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            java.lang.String r0 = "action"
            java.lang.String r1 = r5.getString(r0)     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            X.SkW r6 = new X.SkW     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            r6.<init>()     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            X.3n9 r0 = r9.A00     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            r0.A04(r2, r6, r1, r7)     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ TimeoutException -> 0x018d, 3yS | NumberFormatException -> 0x019e }
            long r0 = r0 - r3
            long r2 = com.facebook.analytics2.logger.GooglePlayUploadService.A02     // Catch:{ TimeoutException -> 0x018d, 3yS | NumberFormatException -> 0x019e }
            long r2 = r2 - r0
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ TimeoutException -> 0x018d, 3yS | NumberFormatException -> 0x019e }
            long r4 = r4 + r2
        L_0x0173:
            java.util.concurrent.CountDownLatch r1 = r6.A00     // Catch:{ InterruptedException -> 0x0186 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0186 }
            boolean r0 = r1.await(r2, r0)     // Catch:{ InterruptedException -> 0x0186 }
            if (r0 == 0) goto L_0x0180
            boolean r8 = r6.A01     // Catch:{ InterruptedException -> 0x0186 }
            goto L_0x01b4
        L_0x0180:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ InterruptedException -> 0x0186 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x0186 }
            throw r0     // Catch:{ InterruptedException -> 0x0186 }
        L_0x0186:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ TimeoutException -> 0x018d, 3yS | NumberFormatException -> 0x019e }
            long r2 = r4 - r0
            goto L_0x0173
        L_0x018d:
            X.3n9 r0 = r9.A00     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            r0.A03(r7)     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            goto L_0x01b4
        L_0x0193:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            X.3yS r0 = new X.3yS     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            r0.<init>(r1)     // Catch:{ 3yS | NumberFormatException -> 0x019e }
            throw r0     // Catch:{ 3yS | NumberFormatException -> 0x019e }
        L_0x019e:
            r2 = move-exception
            java.lang.String r1 = "GooglePlayUploadService"
            java.lang.String r0 = "Misunderstood job extras: %s"
            X.0KC.A0H(r1, r0, r2)
        L_0x01a6:
            r8 = 2
            goto L_0x01b4
        L_0x01a8:
            X.4xe r0 = r9.A00()
            boolean r0 = r0.A00(r6)
        L_0x01b0:
            r8 = 1
            if (r0 != 0) goto L_0x01b4
        L_0x01b3:
            r8 = 0
        L_0x01b4:
            r13.A00(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TL5.run():void");
    }
}
