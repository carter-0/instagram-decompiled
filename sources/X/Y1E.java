package X;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import java.io.Closeable;
import java.util.concurrent.ScheduledExecutorService;

public final class Y1E implements Closeable {
    public final /* synthetic */ CxxInspectorPackagerConnection.DelegateImpl A00;
    public final /* synthetic */ Xo0 A01;

    public Y1E(CxxInspectorPackagerConnection.DelegateImpl delegateImpl, Xo0 xo0) {
        this.A00 = delegateImpl;
        this.A01 = xo0;
    }

    public final void close() {
        Xo0 xo0 = this.A01;
        synchronized (xo0) {
            TAH A02 = TAH.A02("End of session");
            if (((long) A02.A05()) > 123) {
                throw AnonymousClass7TF.A0W("reason.size() > 123: ", "End of session");
            } else if (!xo0.A0D && !xo0.A0C) {
                xo0.A0C = true;
                xo0.A0H.add(new XZY(A02));
                ScheduledExecutorService scheduledExecutorService = xo0.A05;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.execute(xo0.A0F);
                }
            }
        }
    }
}
