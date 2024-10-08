package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.36G  reason: invalid class name */
public final class AnonymousClass36G extends Handler {
    public final /* synthetic */ AnonymousClass36D A00;

    public final void handleMessage(Message message) {
        0qQ.A0B(message, 0);
        if (message.what == 0) {
            AnonymousClass36F r1 = this.A00.A01;
            Object obj = message.obj;
            obj.getClass();
            r1.DQv((1Xj) obj);
        }
    }

    public AnonymousClass36G(AnonymousClass36D r1) {
        this.A00 = r1;
    }
}
