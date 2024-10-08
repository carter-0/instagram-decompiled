package X;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* renamed from: X.HpJ  reason: case insensitive filesystem */
public final class C55898HpJ {
    public final I4O A00(C286575Wy r5) {
        I4O i4o;
        if (0fL.A02()) {
            0fL.A01(368819642, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
        }
        View view = (View) r5.AJO(AndroidCompositionLocals_androidKt.A03);
        WeakHashMap weakHashMap = I4O.A0O;
        synchronized (weakHashMap) {
            Object obj = weakHashMap.get(view);
            if (obj == null) {
                obj = new I4O(view);
                weakHashMap.put(view, obj);
            }
            i4o = (I4O) obj;
        }
        boolean A1V = C51971G9r.A1V(r5, i4o, view);
        Object ECw = r5.ECw();
        if (A1V || ECw == AnonymousClass5XT.A00) {
            ECw = J6U.A00(r5, i4o, view, 23);
        }
        C286645Xf.A03(r5, i4o, (0sP) ECw);
        if (0fL.A02()) {
            0fL.A00(-1346871104);
        }
        return i4o;
    }
}
