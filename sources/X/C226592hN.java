package X;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: X.2hN  reason: invalid class name and case insensitive filesystem */
public abstract class C226592hN {
    public static final C226602hO A00(View view) {
        WeakHashMap weakHashMap = C226602hO.A01;
        Object obj = weakHashMap.get(view);
        if (obj == null) {
            obj = new C226602hO(view);
            weakHashMap.put(view, obj);
        }
        return (C226602hO) obj;
    }
}
