package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.QuU  reason: case insensitive filesystem */
public final class C8432QuU extends C3024063e {
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            try {
                ((C13634Te0) pair.first).DfS((AnonymousClass63X) pair.second);
            } catch (RuntimeException e) {
                throw e;
            }
        } else if (i != 2) {
            Log.wtf("BasePendingResult", 002.A0O("Don't know how to handle message: ", i), new Exception());
        } else {
            ((BasePendingResult) message.obj).A08(Status.A0A);
        }
    }

    public C8432QuU() {
        super(Looper.getMainLooper());
    }
}
