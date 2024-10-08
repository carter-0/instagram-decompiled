package X;

import android.os.Handler;
import android.os.Message;

public final class QJR extends C275194pk implements C275204pl {
    public final Handler A00 = new Q7l(C262444Ef.A00().A01.getLooper(), this);

    public final void start() {
    }

    public QJR(C275074pY[] r3) {
        super(r3);
    }

    public final void E4R(C274844pB r3) {
        Message obtain = Message.obtain();
        obtain.obj = r3;
        this.A00.sendMessage(obtain);
    }
}
