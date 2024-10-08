package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.List;
import java.util.concurrent.Future;

public final class PzE implements Runnable {
    public final /* synthetic */ AnonymousClass5AD A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ List A02;

    public PzE(AnonymousClass5AD r1, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, List list) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A02 = list;
        this.A00 = r1;
    }

    public final void run() {
        for (Object next : this.A02) {
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.A01;
            shortcutInfoCompatSaverImpl.A04.remove(next);
            Future future = (Future) shortcutInfoCompatSaverImpl.A03.remove(next);
            if (future != null) {
                future.cancel(false);
            }
        }
        this.A01.A03(this.A00);
    }
}
