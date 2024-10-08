package X;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

public final class WDL implements AnonymousClass2X5 {
    public final /* synthetic */ ActionMenuView A00;

    public WDL(ActionMenuView actionMenuView) {
        this.A00 = actionMenuView;
    }

    public final boolean DRK(MenuItem menuItem, C18932WDk wDk) {
        C20821Wzv wzv = this.A00.A05;
        if (wzv == null) {
            return false;
        }
        Toolbar toolbar = ((WDX) wzv).A00;
        if (toolbar.A0e.A03(menuItem)) {
            return true;
        }
        C20825Wzz wzz = toolbar.A0H;
        if (wzz == null || !((C18924WDb) wzz).A00.A04.onMenuItemSelected(0, menuItem)) {
            return false;
        }
        return true;
    }

    public final void DRM(C18932WDk wDk) {
        AnonymousClass2X5 r0 = this.A00.A02;
        if (r0 != null) {
            r0.DRM(wDk);
        }
    }
}
