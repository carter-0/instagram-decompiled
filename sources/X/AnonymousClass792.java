package X;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.792  reason: invalid class name */
public final class AnonymousClass792 {
    public final Map A00 = new LinkedHashMap();
    public final Map A01 = new LinkedHashMap();
    public final Map A02 = new LinkedHashMap();
    public final Set A03 = new LinkedHashSet();

    public final void A00(Activity activity, AnonymousClass79A r9) {
        List<AnonymousClass799> list = (List) this.A02.get(r9);
        if (list != null) {
            for (AnonymousClass799 r4 : list) {
                View view = (View) this.A01.get(r4);
                Map map = this.A00;
                if (!0qQ.A0K(map.get(r4), true) && view != null && view.getVisibility() == 0 && r4.A01()) {
                    map.put(r4, true);
                    view.postDelayed(new C51505FvD(activity, view, r4, r4.A00), 500);
                    return;
                }
            }
        }
    }

    public final void A01(View view, AnonymousClass799 r5, AnonymousClass79A r6) {
        Set set = this.A03;
        Integer valueOf = Integer.valueOf(r5.A00);
        if (!set.contains(valueOf)) {
            set.add(valueOf);
            if (!r5.A00()) {
                this.A01.put(r5, view);
                Map map = this.A02;
                Object obj = map.get(r6);
                if (obj == null) {
                    obj = new ArrayList();
                    map.put(r6, obj);
                }
                ((List) obj).add(r5);
            }
        }
    }
}
