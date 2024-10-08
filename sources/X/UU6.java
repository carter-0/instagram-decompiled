package X;

import android.content.Context;
import android.os.Build;
import android.view.SurfaceView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class UU6 extends C14709U2u {
    public UU6(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT < 30) {
            if (!C16711V2u.A01) {
                try {
                    Method method = Class.class.getMethod("getDeclaredField", new Class[]{String.class});
                    C16711V2u.A01 = true;
                    Object invoke = method.invoke(SurfaceView.class, new Object[]{"mRtHandlingPositionUpdates"});
                    0qQ.A0C(invoke, "null cannot be cast to non-null type java.lang.reflect.Field");
                    Field field = (Field) invoke;
                    C16711V2u.A00 = field;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                } catch (Exception e) {
                    0KC.A0F("SafeSurfaceView", "Failed to get inner field", e);
                }
            }
            try {
                Field field2 = C16711V2u.A00;
                if (field2 != null) {
                    field2.setBoolean(this, true);
                }
            } catch (IllegalAccessException e2) {
                0KC.A0F("SafeSurfaceView", "Failed to set inner field", e2);
            }
        }
    }
}
