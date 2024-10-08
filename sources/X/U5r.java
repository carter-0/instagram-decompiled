package X;

import android.content.Context;
import android.view.MenuItem;
import java.lang.ref.WeakReference;

public final class U5r extends V4T implements AnonymousClass2X5 {
    public X8B A00;
    public WeakReference A01;
    public final Context A02;
    public final C18932WDk A03;
    public final /* synthetic */ U5n A04;

    public U5r(Context context, U5n u5n, X8B x8b) {
        this.A04 = u5n;
        this.A02 = context;
        this.A00 = x8b;
        C18932WDk wDk = new C18932WDk(context);
        wDk.A00 = 1;
        this.A03 = wDk;
        wDk.A03 = this;
    }

    public final boolean DRK(MenuItem menuItem, C18932WDk wDk) {
        X8B x8b = this.A00;
        if (x8b != null) {
            return x8b.CtM(menuItem, this);
        }
        return false;
    }

    public final void DRM(C18932WDk wDk) {
        if (this.A00 != null) {
            A01();
            WDU wdu = this.A04.A09.A02;
            if (wdu != null) {
                wdu.A04();
            }
        }
    }
}
