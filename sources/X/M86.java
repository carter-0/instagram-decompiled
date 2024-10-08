package X;

import android.widget.Space;
import java.util.Map;

public final class M86 implements Runnable {
    public final /* synthetic */ Space A00;
    public final /* synthetic */ C18014Vjq A01;

    public M86(Space space, C18014Vjq vjq) {
        this.A01 = vjq;
        this.A00 = space;
    }

    public final void run() {
        C18014Vjq vjq = this.A01;
        Map map = vjq.A06;
        Space space = this.A00;
        if (map.get(space) != null) {
            vjq.A01(space);
        }
    }
}
