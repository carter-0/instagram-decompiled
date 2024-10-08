package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.List;

/* renamed from: X.WDa  reason: case insensitive filesystem */
public final class C18923WDa implements C20940X5i {
    public final /* synthetic */ C14734U5w A00;

    public C18923WDa(C14734U5w u5w) {
        this.A00 = u5w;
    }

    public final void DM2(MenuItem menuItem, C18932WDk wDk) {
        C14734U5w u5w = this.A00;
        Handler handler = u5w.A0I;
        VUG vug = null;
        handler.removeCallbacksAndMessages((Object) null);
        List list = u5w.A0M;
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (wDk != ((VUG) list.get(i)).A01) {
                i++;
            } else if (i != -1) {
                int i2 = i + 1;
                if (i2 < list.size()) {
                    vug = (VUG) list.get(i2);
                }
                handler.postAtTime(new C20314Wp9(menuItem, this, vug, wDk), wDk, SystemClock.uptimeMillis() + 200);
                return;
            } else {
                return;
            }
        }
    }

    public final void DM3(MenuItem menuItem, C18932WDk wDk) {
        this.A00.A0I.removeCallbacksAndMessages(wDk);
    }
}
