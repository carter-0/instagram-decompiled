package X;

import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

public final class U5m extends C16747V4e {
    public ArrayList A00 = new ArrayList();
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Window.Callback A04;
    public final C20819Wzt A05;
    public final C20939X5h A06;
    public final Runnable A07 = new C19887WhI(this);
    public final C20825Wzz A08;

    public static Menu A00(U5m u5m) {
        if (!u5m.A03) {
            C20939X5h x5h = u5m.A06;
            ((WDZ) x5h).A09.setMenuCallbacks(new WDR(u5m), new WDK(u5m));
            u5m.A03 = true;
        }
        return ((WDZ) u5m.A06).A09.getMenu();
    }

    public U5m(Window.Callback callback, Toolbar toolbar, CharSequence charSequence) {
        C18924WDb wDb = new C18924WDb(this);
        this.A08 = wDb;
        WDZ wdz = new WDZ(toolbar, false);
        this.A06 = wdz;
        callback.getClass();
        this.A04 = callback;
        wdz.A07 = callback;
        toolbar.A0H = wDb;
        wdz.setWindowTitle(charSequence);
        this.A05 = new WDH(this);
    }
}
