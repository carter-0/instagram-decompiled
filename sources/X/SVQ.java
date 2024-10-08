package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

public final class SVQ implements ServiceConnection {
    public final S2A A00;
    public final /* synthetic */ SF4 A01;

    public SVQ(SF4 sf4, S2A s2a) {
        this.A01 = sf4;
        this.A00 = s2a;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub$Proxy, java.lang.Object] */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGetInstallReferrerService iGetInstallReferrerService;
        Log.isLoggable("InstallReferrerClient", 2);
        SF4 sf4 = this.A01;
        if (iBinder == null) {
            iGetInstallReferrerService = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IGetInstallReferrerService)) {
                ? obj = new Object();
                int A03 = AnonymousClass0fD.A03(1802072860);
                obj.A00 = iBinder;
                AnonymousClass0fD.A0A(-2002729854, A03);
                iGetInstallReferrerService = obj;
            } else {
                iGetInstallReferrerService = (IGetInstallReferrerService) queryLocalInterface;
            }
        }
        sf4.A02 = iGetInstallReferrerService;
        sf4.A00 = 2;
        this.A00.A00(0);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Pxg.A1O("InstallReferrerClient", "Install Referrer service disconnected.");
        SF4 sf4 = this.A01;
        sf4.A02 = null;
        sf4.A00 = 0;
    }
}
