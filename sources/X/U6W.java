package X;

import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public final class U6W extends WDV implements C20940X5i {
    public static Method A01;
    public C20940X5i A00;

    public final void A01() {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A01;
            if (method != null) {
                try {
                    method.invoke(this.A09, new Object[]{false});
                } catch (Exception unused) {
                }
            }
        } else {
            C16750V4j.A00(this.A09);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                A01 = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public final void DM2(MenuItem menuItem, C18932WDk wDk) {
        C20940X5i x5i = this.A00;
        if (x5i != null) {
            x5i.DM2(menuItem, wDk);
        }
    }

    public final void DM3(MenuItem menuItem, C18932WDk wDk) {
        C20940X5i x5i = this.A00;
        if (x5i != null) {
            x5i.DM3(menuItem, wDk);
        }
    }
}
