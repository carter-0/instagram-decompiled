package X;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.95j  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3734395j implements C3734495k {
    public final String A00;

    public C3734395j(String str) {
        this.A00 = str;
    }

    public final Object get() {
        String str = this.A00;
        String A002 = Pxd.A00(464);
        String A003 = Pxd.A00(465);
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new RuntimeException(String.format("Class %s is not an instance of %s", new Object[]{str, Pxd.A00(685)}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(String.format(A003, new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(String.format(A003, new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(String.format(A002, new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(String.format(A002, new Object[]{str}), e4);
        }
    }
}
