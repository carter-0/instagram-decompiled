package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.fbpay.w3c.client.W3CClient$IsReadyToPayCallbackWithConnection;
import org.chromium.IsReadyToPayService;

public final class SVU implements ServiceConnection {
    public final /* synthetic */ C13623Tdp A00;
    public final /* synthetic */ 2Fg A01;

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, org.chromium.IsReadyToPayService$Stub$Proxy] */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IsReadyToPayService isReadyToPayService;
        0qQ.A0B(iBinder, 1);
        try {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("org.chromium.IsReadyToPayService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IsReadyToPayService)) {
                ? obj = new Object();
                int A03 = AnonymousClass0fD.A03(586524218);
                obj.A00 = iBinder;
                AnonymousClass0fD.A0A(1489811786, A03);
                isReadyToPayService = obj;
            } else {
                isReadyToPayService = (IsReadyToPayService) queryLocalInterface;
            }
            isReadyToPayService.CaP(new W3CClient$IsReadyToPayCallbackWithConnection(this, this.A00, this.A01));
        } catch (RemoteException unused) {
            this.A00.DLl(false);
            2Fg r1 = this.A01;
            2Fg.A02(r1.A04, this, r1);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public SVU(C13623Tdp tdp, 2Fg r2) {
        this.A01 = r2;
        this.A00 = tdp;
    }
}
