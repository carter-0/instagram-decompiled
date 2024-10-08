package X;

import android.view.MenuItem;

/* renamed from: X.Wp9  reason: case insensitive filesystem */
public final class C20314Wp9 implements Runnable {
    public final /* synthetic */ MenuItem A00;
    public final /* synthetic */ C18923WDa A01;
    public final /* synthetic */ VUG A02;
    public final /* synthetic */ C18932WDk A03;

    public C20314Wp9(MenuItem menuItem, C18923WDa wDa, VUG vug, C18932WDk wDk) {
        this.A01 = wDa;
        this.A02 = vug;
        this.A00 = menuItem;
        this.A03 = wDk;
    }

    public final void run() {
        VUG vug = this.A02;
        if (vug != null) {
            C14734U5w u5w = this.A01.A00;
            u5w.A0C = true;
            vug.A01.A0C(false);
            u5w.A0C = false;
        }
        MenuItem menuItem = this.A00;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.A03.A0I(menuItem, (X9H) null, 4);
        }
    }
}
