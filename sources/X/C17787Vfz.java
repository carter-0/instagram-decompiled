package X;

import android.content.Context;
import android.view.MenuItem;

/* renamed from: X.Vfz  reason: case insensitive filesystem */
public abstract class C17787Vfz {
    public 01r A00;
    public final Context A01;

    public final MenuItem A00(MenuItem menuItem) {
        if (!(menuItem instanceof 02O)) {
            return menuItem;
        }
        02O r3 = (02O) menuItem;
        01r r1 = this.A00;
        if (r1 == null) {
            r1 = new 01r(0);
            this.A00 = r1;
        }
        MenuItem menuItem2 = (MenuItem) r1.get(r3);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C14732U5u u5u = new C14732U5u(this.A01, r3);
        this.A00.put(r3, u5u);
        return u5u;
    }

    public C17787Vfz(Context context) {
        this.A01 = context;
    }
}
