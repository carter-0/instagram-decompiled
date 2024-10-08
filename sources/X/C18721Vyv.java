package X;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.Vyv  reason: case insensitive filesystem */
public abstract class C18721Vyv {
    public static Method A00;
    public static Method A01;
    public static Method A02;
    public static boolean A03 = true;

    static {
        Class<AbsListView> cls = AbsListView.class;
        try {
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Float.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{cls2, View.class, cls3, cls4, cls4});
            A00 = declaredMethod;
            declaredMethod.setAccessible(true);
            Class<AdapterView> cls5 = AdapterView.class;
            Method declaredMethod2 = cls5.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls2});
            A02 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = cls5.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls2});
            A01 = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void A00(View view, U5Q u5q, int i) {
        try {
            Method method = A00;
            Integer valueOf = Integer.valueOf(i);
            Integer A0j = C51967G9n.A0j();
            method.invoke(u5q, new Object[]{valueOf, view, false, A0j, A0j});
            A02.invoke(u5q, new Object[]{valueOf});
            A01.invoke(u5q, new Object[]{valueOf});
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static boolean A01() {
        return A03;
    }
}
