package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.common.util.concurrent.ListenableFuture;

public final class Pz7 implements Runnable {
    public final /* synthetic */ AnonymousClass5AD A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ ListenableFuture A02;

    public Pz7(AnonymousClass5AD r1, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, ListenableFuture listenableFuture) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A02 = listenableFuture;
        this.A00 = r1;
    }

    public final void run() {
        try {
            this.A02.get();
            this.A00.A06((Object) null);
        } catch (Exception e) {
            this.A00.A07(e);
        }
    }
}
