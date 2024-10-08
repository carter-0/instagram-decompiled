package X;

import android.view.TouchDelegate;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2zY  reason: invalid class name and case insensitive filesystem */
public final class C235222zY {
    public final Map A00 = new LinkedHashMap();
    public final Map A01 = new LinkedHashMap();
    public final Map A02 = new LinkedHashMap();

    public final void A00(String str) {
        Map map = this.A02;
        List<View> list = (List) map.get(str);
        if (list != null) {
            for (View touchDelegate : list) {
                touchDelegate.setTouchDelegate((TouchDelegate) null);
            }
        }
        map.remove(str);
    }
}
