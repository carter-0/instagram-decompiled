package X;

import android.os.RemoteException;
import android.util.Log;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.RemoteWorkManagerImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import java.util.List;

public final class TL7 implements Runnable {
    public static final String A01 = AnonymousClass389.A01("ListenableCallbackRbl");
    public final C10519RtY A00;

    public final void run() {
        byte[] bArr;
        try {
            C10519RtY rtY = this.A00;
            Object obj = rtY.A01.get();
            IWorkManagerImplCallback iWorkManagerImplCallback = rtY.A00;
            if (7 - ((QGB) rtY).A00 != 0) {
                bArr = RemoteWorkManagerImpl.A01;
            } else {
                bArr = S83.A01(new ParcelableWorkInfos((List) obj));
            }
            iWorkManagerImplCallback.Doo(bArr);
        } catch (RemoteException e) {
            AnonymousClass389.A00();
            Log.e(A01, "Unable to notify successful operation", e);
        } catch (Throwable th) {
            A00(this.A00.A00, th);
        }
    }

    public TL7(C10519RtY rtY) {
        this.A00 = rtY;
    }

    public static void A00(IWorkManagerImplCallback iWorkManagerImplCallback, Throwable th) {
        try {
            iWorkManagerImplCallback.DEc(th.getMessage());
        } catch (RemoteException e) {
            AnonymousClass389.A00();
            Log.e(A01, "Unable to notify failures in operation", e);
        }
    }
}
