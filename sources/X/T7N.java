package X;

import java.util.concurrent.TimeUnit;

public final class T7N implements AnonymousClass0lh {
    public final C367968rr A00;

    public final void onSessionWillEnd() {
        ((C367958rq) this.A00).A00.clear();
    }

    public T7N() {
        C367658rM r3 = new C367658rM();
        r3.A02(30, TimeUnit.MINUTES);
        r3.A01(20);
        this.A00 = r3.A00();
    }
}
