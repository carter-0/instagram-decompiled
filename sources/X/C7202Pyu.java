package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.fbpay.w3c.AutofillKeyFetchService;
import com.fbpay.w3c.client.W3CClient$AutofillKeyFetchServiceCallbackImpl;

/* renamed from: X.Pyu  reason: case insensitive filesystem */
public final class C7202Pyu implements ServiceConnection {
    public final /* synthetic */ 2Fg A00;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, com.fbpay.w3c.AutofillKeyFetchService$Stub$Proxy] */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AutofillKeyFetchService autofillKeyFetchService;
        0qQ.A0B(iBinder, 1);
        2Fg r3 = this.A00;
        synchronized (r3) {
            r3.A02 = iBinder;
        }
        try {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.fbpay.w3c.AutofillKeyFetchService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AutofillKeyFetchService)) {
                ? obj = new Object();
                int A03 = AnonymousClass0fD.A03(-1993596670);
                obj.A00 = iBinder;
                AnonymousClass0fD.A0A(-1870038805, A03);
                autofillKeyFetchService = obj;
            } else {
                autofillKeyFetchService = (AutofillKeyFetchService) queryLocalInterface;
            }
            autofillKeyFetchService.BYd(new W3CClient$AutofillKeyFetchServiceCallbackImpl(r3));
        } catch (Exception e) {
            SEH.A00(r3.A05, e);
        }
    }

    public C7202Pyu(2Fg r1) {
        this.A00 = r1;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        2Fg r1 = this.A00;
        r1.A02 = null;
        r1.A00 = null;
    }
}
