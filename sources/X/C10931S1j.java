package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.S1j  reason: case insensitive filesystem */
public abstract class C10931S1j {
    public final C13711TfY A00;
    public final C10403Rrf A01;
    public final Context A02;

    public final void A00() {
        ConnectivityManager connectivityManager;
        Object systemService = this.A02.getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager) || (connectivityManager = (ConnectivityManager) systemService) == null) {
            this.A00.DEY(new QQ8());
        } else {
            connectivityManager.requestNetwork(new NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), new C7356Q6l(connectivityManager, this, new AtomicBoolean(false)), this.A01.A00);
        }
    }

    public C10931S1j(Context context, C13711TfY tfY, C10403Rrf rrf) {
        this.A02 = context;
        this.A00 = tfY;
        this.A01 = rrf;
    }
}
