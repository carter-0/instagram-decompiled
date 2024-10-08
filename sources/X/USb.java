package X;

import android.view.View;
import com.facebook.react.bridge.ReactSoftExceptionLogger;

public final class USb extends C19062WIs {
    public final int A00;
    public final /* synthetic */ C18592Vuj A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public USb(C18592Vuj vuj, int i, int i2) {
        super(vuj, i);
        this.A01 = vuj;
        this.A00 = i2;
    }

    public final void AT8() {
        try {
            W0R w0r = this.A01.A0L;
            int i = this.A00;
            int i2 = this.A00;
            synchronized (w0r) {
                View view = (View) w0r.A03.get(i);
                if (view != null) {
                    view.sendAccessibilityEvent(i2);
                } else {
                    throw new RuntimeException(002.A0O("Could not find view with tag ", i));
                }
            }
        } catch (C20556WuW e) {
            ReactSoftExceptionLogger.logSoftException("UIViewOperationQueue", e);
        }
    }
}
