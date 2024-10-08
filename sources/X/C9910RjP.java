package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.RjP  reason: case insensitive filesystem */
public abstract class C9910RjP {
    public static volatile boolean A00 = true;

    public static Drawable A00(Context context, Context context2, Resources.Theme theme, int i) {
        try {
            if (A00) {
                Context context3 = context2;
                if (theme != null) {
                    context3 = new C251383n1(context2, theme);
                }
                return C323656xt.A00(context3, i);
            }
        } catch (NoClassDefFoundError unused) {
            A00 = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return context2.getDrawable(i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return context2.getResources().getDrawable(i, theme);
    }
}
