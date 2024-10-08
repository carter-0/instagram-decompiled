package X;

import com.facebook.rsys.callmanager.callclient.gen.CallClient;
import com.facebook.rsys.callmanager.callclient.gen.SetupCallback;

/* renamed from: X.NCd  reason: case insensitive filesystem */
public final class C68364NCd extends SetupCallback {
    public final 0sP A00;
    public final /* synthetic */ C71143Odx A01;

    public final void onSetup(CallClient callClient) {
        0qQ.A0B(callClient, 0);
        if (callClient instanceof NCZ) {
            this.A00.invoke(callClient);
            return;
        }
        throw DbT.A0m();
    }

    public C68364NCd(C71143Odx odx, 0sP r2) {
        this.A01 = odx;
        this.A00 = r2;
    }
}
