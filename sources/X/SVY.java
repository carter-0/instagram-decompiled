package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.FBPaymentService;
import com.fbpay.w3c.client.W3CClient$FBPayServiceAddCardCallback;
import com.fbpay.w3c.ipc.BaseFBPaymentServiceImpl$handler$1;

public final class SVY implements ServiceConnection {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass2Fj A01;
    public final /* synthetic */ CardDetails A02;
    public final /* synthetic */ 2Fg A03;

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        0qQ.A0B(iBinder, 1);
        try {
            FBPaymentService A002 = BaseFBPaymentServiceImpl$handler$1.A00(iBinder);
            CardDetails cardDetails = this.A02;
            2Fg r3 = this.A03;
            Context context = this.A00;
            0qQ.A0A(context);
            A002.A80(cardDetails, new W3CClient$FBPayServiceAddCardCallback(context, this, this.A01, r3));
        } catch (RemoteException e) {
            SEH.A00(this.A01, e);
            2Fg.A02(this.A00, this, this.A03);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public SVY(Context context, AnonymousClass2Fj r2, CardDetails cardDetails, 2Fg r4) {
        this.A02 = cardDetails;
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
    }
}
