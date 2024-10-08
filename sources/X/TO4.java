package X;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class TO4 implements Executor {
    public final int A00;
    public final Object A01;

    public TO4(Handler handler, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = handler;
        } else {
            this.A01 = handler;
        }
    }

    public final void execute(Runnable runnable) {
        Handler handler;
        switch (this.A00) {
            case 0:
            case 2:
                handler = (Handler) this.A01;
                break;
            case 1:
                if (C18773W0w.A02()) {
                    runnable.run();
                    return;
                } else {
                    C18773W0w.A01(runnable);
                    return;
                }
            default:
                handler = AnonymousClass7TF.A0D();
                break;
        }
        handler.post(runnable);
    }

    public TO4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
