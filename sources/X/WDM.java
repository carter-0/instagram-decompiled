package X;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

public final class WDM implements AnonymousClass2X5 {
    public final /* synthetic */ Toolbar A00;

    public WDM(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    public final boolean DRK(MenuItem menuItem, C18932WDk wDk) {
        AnonymousClass2X5 r0 = this.A00.A0D;
        if (r0 == null || !r0.DRK(menuItem, wDk)) {
            return false;
        }
        return true;
    }

    public final void DRM(C18932WDk wDk) {
        Toolbar toolbar = this.A00;
        WDU wdu = toolbar.A0E.A04;
        if (wdu == null || !wdu.A03()) {
            toolbar.A0e.A00(wDk);
        }
        AnonymousClass2X5 r0 = toolbar.A0D;
        if (r0 != null) {
            r0.DRM(wDk);
        }
    }
}
