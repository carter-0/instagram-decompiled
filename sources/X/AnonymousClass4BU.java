package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.4BU  reason: invalid class name */
public final class AnonymousClass4BU implements Handler.Callback {
    public final /* synthetic */ C2596742q A00;

    public AnonymousClass4BU(C2596742q r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        0qQ.A0B(message, 0);
        if (message.what != 1) {
            return false;
        }
        Object obj = message.obj;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.presence.DirectThreadActivityController.ActivityInvalidationData");
        C70574OBw oBw = (C70574OBw) obj;
        C2596742q r4 = this.A00;
        C299305uu r3 = oBw.A00;
        C299305uu r2 = oBw.A01;
        C2596942s r0 = r4.A02;
        String str = r2.A01;
        if (str != null) {
            r0.A02.remove(str);
        }
        C2596742q.A00(r4, r3, r2, 0);
        return true;
    }
}
