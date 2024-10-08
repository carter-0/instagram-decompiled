package X;

import android.content.Context;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.U5q  reason: case insensitive filesystem */
public final class C14730U5q extends V4T implements AnonymousClass2X5 {
    public Context A00;
    public X8B A01;
    public C18932WDk A02;
    public ActionBarContextView A03;
    public WeakReference A04;
    public boolean A05;

    public final boolean DRK(MenuItem menuItem, C18932WDk wDk) {
        return this.A01.CtM(menuItem, this);
    }

    public final void DRM(C18932WDk wDk) {
        A01();
        WDU wdu = this.A03.A02;
        if (wdu != null) {
            wdu.A04();
        }
    }
}
