package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.SVs  reason: case insensitive filesystem */
public final class C11454SVs implements Handler.Callback {
    public final /* synthetic */ C11271SIi A00;

    public C11454SVs(C11271SIi sIi) {
        this.A00 = sIi;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.A00.A02((QHP) message.obj);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.A00.A0D.A00((C11994SkD) message.obj);
            return false;
        }
    }
}
