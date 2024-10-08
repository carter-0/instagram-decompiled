package X;

import android.content.Context;
import java.util.concurrent.Callable;

public final class TN5 implements Callable {
    public final /* synthetic */ Context A00;

    public TN5(Context context) {
        this.A00 = context;
    }

    public final /* synthetic */ Object call() {
        return Pxe.A0H(this.A00, "google_sdk_flags");
    }
}
