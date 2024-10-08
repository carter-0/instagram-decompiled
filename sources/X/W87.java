package X;

import android.view.MenuItem;

public final class W87 implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener A00;
    public final /* synthetic */ C14732U5u A01;

    public W87(MenuItem.OnMenuItemClickListener onMenuItemClickListener, C14732U5u u5u) {
        this.A01 = u5u;
        this.A00 = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.A00.onMenuItemClick(this.A01.A00(menuItem));
    }
}
