package X;

import android.os.IBinder;
import android.os.IInterface;
import com.xiaomi.market.IMarketDownloadService;

public final class QQQ extends C12149Snx {
    /* JADX WARNING: type inference failed for: r2v1, types: [com.xiaomi.market.IMarketDownloadService$Stub$Proxy, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object ADs(IBinder iBinder) {
        0qQ.A0B(iBinder, 0);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.market.IMarketDownloadService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof IMarketDownloadService)) {
            return queryLocalInterface;
        }
        ? obj = new Object();
        int A03 = AnonymousClass0fD.A03(-295278860);
        obj.A00 = iBinder;
        AnonymousClass0fD.A0A(202321257, A03);
        return obj;
    }
}
