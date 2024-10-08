package X;

import android.webkit.WebViewFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.4lY  reason: invalid class name and case insensitive filesystem */
public final class C272864lY {
    public final Field A00;
    public final Field A01;
    public final Method A02;

    public static C272864lY A00() {
        Class<WebViewFactory> cls = WebViewFactory.class;
        Method declaredMethod = cls.getDeclaredMethod("getProvider", new Class[0]);
        declaredMethod.setAccessible(true);
        Field declaredField = cls.getDeclaredField("sProviderInstance");
        declaredField.setAccessible(true);
        Field declaredField2 = cls.getDeclaredField("sPackageInfo");
        declaredField2.setAccessible(true);
        return new C272864lY(declaredField, declaredField2, declaredMethod);
    }

    public C272864lY(Field field, Field field2, Method method) {
        this.A02 = method;
        this.A00 = field;
        this.A01 = field2;
    }
}
