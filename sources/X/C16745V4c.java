package X;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.V4c  reason: case insensitive filesystem */
public abstract class C16745V4c {
    public static boolean A00 = true;
    public static Field A01;
    public static boolean A02;

    public float A00(View view) {
        if (A00) {
            try {
                return C18088VlI.A00(view);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
        return view.getAlpha();
    }

    public void A01(Matrix matrix, View view) {
        if (UFD.A00) {
            try {
                C18089VlJ.A00(matrix, view);
            } catch (NoSuchMethodError unused) {
                UFD.A00 = false;
            }
        }
    }

    public void A02(Matrix matrix, View view) {
        if (UFD.A01) {
            try {
                C18089VlJ.A01(matrix, view);
            } catch (NoSuchMethodError unused) {
                UFD.A01 = false;
            }
        }
    }

    public void A03(View view, float f) {
        if (A00) {
            try {
                C18088VlI.A01(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
        view.setAlpha(f);
    }

    public void A04(View view, int i) {
        if (!A02) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                A01 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            A02 = true;
        }
        Field field = A01;
        if (field != null) {
            try {
                A01.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void A05(View view, int i, int i2, int i3, int i4) {
        if (UFC.A00) {
            try {
                C16765V4y.A00(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                UFC.A00 = false;
            }
        }
    }
}
