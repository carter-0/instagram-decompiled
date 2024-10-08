package X;

import androidx.work.multiprocess.RemoteCallback;
import com.google.common.util.concurrent.ListenableFuture;

public final class TJS implements Runnable {
    public final /* synthetic */ SHS A00;
    public final /* synthetic */ RemoteCallback A01;
    public final /* synthetic */ C13513Tbe A02;
    public final /* synthetic */ ListenableFuture A03;

    public TJS(SHS shs, RemoteCallback remoteCallback, C13513Tbe tbe, ListenableFuture listenableFuture) {
        this.A00 = shs;
        this.A03 = listenableFuture;
        this.A01 = remoteCallback;
        this.A02 = tbe;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        X.AnonymousClass389.A00();
        android.util.Log.e(X.SHS.A04, "Unable to bind to service", r2);
        X.TL7.A00(r6.A01, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        androidx.work.multiprocess.RemoteCallback.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035 A[ExcHandler: InterruptedException | ExecutionException (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r6.A03     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            java.lang.Object r5 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            androidx.work.multiprocess.IListenableWorkerImpl r5 = (androidx.work.multiprocess.IListenableWorkerImpl) r5     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            androidx.work.multiprocess.RemoteCallback r4 = r6.A01     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            android.os.IBinder r3 = r5.asBinder()     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            r0 = -1341687036(0xffffffffb0077b04, float:-4.928753E-10)
            int r2 = X.AnonymousClass0fD.A03(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            r4.A00 = r3     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            android.os.IBinder$DeathRecipient r1 = r4.A01     // Catch:{ RemoteException -> 0x001e, InterruptedException | ExecutionException -> 0x0035 }
            r0 = 0
            r3.linkToDeath(r1, r0)     // Catch:{ RemoteException -> 0x001e, InterruptedException | ExecutionException -> 0x0035 }
            goto L_0x0022
        L_0x001e:
            r0 = move-exception
            androidx.work.multiprocess.RemoteCallback.A00(r4, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
        L_0x0022:
            r0 = -2147220116(0xffffffff8004056c, float:-3.69287E-40)
            X.AnonymousClass0fD.A0A(r0, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            X.SHS r0 = r6.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            java.util.concurrent.Executor r1 = r0.A03     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            X.TEw r0 = new X.TEw     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            r0.<init>(r5, r6)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            r1.execute(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            return
        L_0x0035:
            r2 = move-exception
            X.AnonymousClass389.A00()
            java.lang.String r1 = X.SHS.A04
            java.lang.String r0 = "Unable to bind to service"
            android.util.Log.e(r1, r0, r2)
            androidx.work.multiprocess.RemoteCallback r0 = r6.A01
            X.TL7.A00(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TJS.run():void");
    }
}
