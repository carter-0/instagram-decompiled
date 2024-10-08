package X;

import android.os.Build;
import android.view.inputmethod.InputConnection;

/* renamed from: X.HRo  reason: case insensitive filesystem */
public abstract class C54756HRo {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.Gg0, X.IGt] */
    public static final C52949Gg0 A00(InputConnection inputConnection, 0sP r3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return new C52948Gfz(inputConnection, r3);
        }
        return new C56898IGt(inputConnection, r3);
    }
}
