package X;

import android.util.SparseBooleanArray;
import android.view.View;
import com.facebook.react.bridge.ReactSoftExceptionLogger;

public final class USa extends C19062WIs {
    public final /* synthetic */ C18592Vuj A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public USa(C18592Vuj vuj, int i) {
        super(vuj, i);
        this.A00 = vuj;
    }

    public final void AT8() {
        W0R w0r = this.A00.A0L;
        int i = this.A00;
        synchronized (w0r) {
            SparseBooleanArray sparseBooleanArray = w0r.A04;
            if (!sparseBooleanArray.get(i)) {
                String A0c = 002.A0c("View with tag ", " is not registered as a root view", i);
                0qQ.A0B(A0c, 0);
                ReactSoftExceptionLogger.logSoftException("SoftAssertions", new RuntimeException(A0c));
            }
            w0r.A07((View) w0r.A03.get(i));
            sparseBooleanArray.delete(i);
        }
    }
}
