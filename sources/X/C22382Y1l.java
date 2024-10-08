package X;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;

/* renamed from: X.Y1l  reason: case insensitive filesystem */
public final class C22382Y1l implements Runnable {
    public final /* synthetic */ Y7C A00;

    public C22382Y1l(Y7C y7c) {
        this.A00 = y7c;
    }

    public final void run() {
        CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.A00.A01;
        webSocketDelegate.didClose();
        webSocketDelegate.close();
    }
}
