package X;

import android.view.MenuItem;

public final class W86 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener A00;
    public final /* synthetic */ C14732U5u A01;

    public W86(MenuItem.OnActionExpandListener onActionExpandListener, C14732U5u u5u) {
        this.A01 = u5u;
        this.A00 = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.A00.onMenuItemActionCollapse(this.A01.A00(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.A00.onMenuItemActionExpand(this.A01.A00(menuItem));
    }
}
