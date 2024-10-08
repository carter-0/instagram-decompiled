package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;

public final class Pz2 implements Runnable {
    public final /* synthetic */ AnonymousClass5AD A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ Runnable A02;

    public Pz2(AnonymousClass5AD r1, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, Runnable runnable) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A00 = r1;
        this.A02 = runnable;
    }

    public final void run() {
        AnonymousClass5AD r1 = this.A00;
        if (!r1.isCancelled()) {
            try {
                this.A02.run();
                r1.A06((Object) null);
            } catch (Exception e) {
                r1.A07(e);
            }
        }
    }
}
