package X;

import android.content.Context;

/* renamed from: X.VAw  reason: case insensitive filesystem */
public abstract class C16919VAw {
    public static final boolean A00(Context context) {
        if ((context.getApplicationContext().getApplicationInfo().flags & 4194304) == 0 || Pxf.A0G(context).getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
