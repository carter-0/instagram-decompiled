package X;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;

public final class Y2W implements Runnable {
    public final /* synthetic */ Y7C A00;
    public final /* synthetic */ Throwable A01;

    public Y2W(Y7C y7c, Throwable th) {
        this.A00 = y7c;
        this.A01 = th;
    }

    public final void run() {
        String message = this.A01.getMessage();
        CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.A00.A01;
        if (message == null) {
            message = "<Unknown error>";
        }
        webSocketDelegate.didFailWithError((Integer) null, message);
        webSocketDelegate.close();
    }
}
