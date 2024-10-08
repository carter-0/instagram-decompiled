package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* renamed from: X.3QE  reason: invalid class name */
public abstract class AnonymousClass3QE {
    public static final void A00(Context context) {
        View view;
        try {
            Object systemService = context.getSystemService("input_method");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager != null) {
                0sC A00 = 0pe.A00(inputMethodManager.getClass().getDeclaredFields());
                while (A00.hasNext()) {
                    Field field = (Field) A00.next();
                    try {
                        if (!field.isAccessible()) {
                            field.setAccessible(true);
                        }
                        Object obj = field.get(inputMethodManager);
                        if ((obj instanceof View) && (view = (View) obj) != null && view.getContext() == context) {
                            field.set(inputMethodManager, (Object) null);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
