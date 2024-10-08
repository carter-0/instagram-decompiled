package X;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

public final class W88 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] A02 = {MenuItem.class};
    public Object A00;
    public Method A01;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            Method method = this.A01;
            if (method.getReturnType() == Boolean.TYPE) {
                return AnonymousClass7TE.A1a(method.invoke(this.A00, new Object[]{menuItem}));
            }
            method.invoke(this.A00, new Object[]{menuItem});
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public W88(Object obj, String str) {
        this.A00 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.A01 = cls.getMethod(str, A02);
        } catch (Exception e) {
            InflateException inflateException = new InflateException(002.A0u("Couldn't resolve menu item onClick handler ", str, " in class ", cls.getName()));
            inflateException.initCause(e);
            throw inflateException;
        }
    }
}
