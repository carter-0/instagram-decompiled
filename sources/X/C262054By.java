package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* renamed from: X.4By  reason: invalid class name and case insensitive filesystem */
public final class C262054By extends Handler {
    public final /* synthetic */ C2598243f A00;

    public final void handleMessage(Message message) {
        0qQ.A0B(message, 0);
        if (message.what == 1) {
            C2598243f r2 = this.A00;
            Object obj = message.obj;
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.realtime.shared.RealtimeSyncMessage>");
            r2.A02((List) obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C262054By(Looper looper, C2598243f r2) {
        super(looper);
        this.A00 = r2;
    }
}
