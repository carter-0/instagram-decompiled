package X;

import android.os.IBinder;
import android.os.IInterface;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService;

public final class QQP extends C12149Snx {
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService$Stub$Proxy] */
    public final /* bridge */ /* synthetic */ Object ADs(IBinder iBinder) {
        0qQ.A0B(iBinder, 0);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof IGalaxyStoreDownloadService)) {
            return queryLocalInterface;
        }
        ? obj = new Object();
        int A03 = AnonymousClass0fD.A03(-995180281);
        obj.A00 = iBinder;
        AnonymousClass0fD.A0A(-2134208954, A03);
        return obj;
    }
}
