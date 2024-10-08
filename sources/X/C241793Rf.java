package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;

/* renamed from: X.3Rf  reason: invalid class name and case insensitive filesystem */
public final class C241793Rf implements ServiceConnection {
    public final /* synthetic */ C241783Re A00;

    public C241793Rf(C241783Re r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, com.facebook.push.fbns.ipc.IFbnsAIDLService$Stub$Proxy] */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IFbnsAIDLService iFbnsAIDLService;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            0KC.A0C("FbnsAIDLClientManager", "This operation should be run on UI thread");
        }
        C241783Re r3 = this.A00;
        if (iBinder == null) {
            iFbnsAIDLService = null;
        } else {
            IFbnsAIDLService queryLocalInterface = iBinder.queryLocalInterface("com.facebook.push.fbns.ipc.IFbnsAIDLService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFbnsAIDLService)) {
                ? obj = new Object();
                int A03 = AnonymousClass0fD.A03(502217712);
                obj.A00 = iBinder;
                AnonymousClass0fD.A0A(1131072382, A03);
                iFbnsAIDLService = obj;
            } else {
                iFbnsAIDLService = queryLocalInterface;
            }
        }
        synchronized (r3) {
            r3.A01 = iFbnsAIDLService;
            r3.A02 = AnonymousClass05K.A0C;
            r3.notifyAll();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            0KC.A0C("FbnsAIDLClientManager", "This operation should be run on UI thread");
        }
        C241783Re r1 = this.A00;
        synchronized (r1) {
            r1.A01 = null;
            r1.A02 = AnonymousClass05K.A00;
        }
    }
}
