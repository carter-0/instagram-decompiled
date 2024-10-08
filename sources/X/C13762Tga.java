package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* renamed from: X.Tga  reason: case insensitive filesystem */
public interface C13762Tga {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, C10648Rvh rvh, CancellationSignal cancellationSignal, Executor executor, C13683Tez tez);

    void onGetCredential(Context context, C10339Rqc rqc, CancellationSignal cancellationSignal, Executor executor, C13683Tez tez);
}
