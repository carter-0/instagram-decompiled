package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class UUG extends C19083WKn implements Handler.Callback, XBk {
    public final AnonymousClass4MX A00;
    public final Handler A01;

    public final boolean handleMessage(Message message) {
        0qQ.A0B(message, 0);
        if (message.what == 1) {
            this.A00.E06(new C284815Oa(C266464Yz.A1P, AnonymousClass5OZ.GROOT_INFRA, "Reused SurfaceView Surface Was Released"));
        }
        return true;
    }

    public UUG(Looper looper, AnonymousClass4MX r3) {
        super(r3);
        Handler handler;
        this.A00 = r3;
        if (looper != null) {
            handler = new Handler(looper, this);
        } else {
            handler = null;
        }
        this.A01 = handler;
    }
}
