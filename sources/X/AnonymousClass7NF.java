package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7NF  reason: invalid class name */
public final class AnonymousClass7NF {
    public final Context A00;
    public final Map A01 = new LinkedHashMap();
    public final CopyOnWriteArraySet A02 = new CopyOnWriteArraySet();

    public static final AnonymousClass9IE A00(C376699Iz r6, AnonymousClass7NF r7) {
        AnonymousClass9IE r1;
        Map map = r7.A01;
        synchronized (map) {
            r1 = null;
            if (A01(r6, r7)) {
                ArrayList arrayList = new ArrayList();
                for (C69357Njw njw : (List) r6.A00) {
                    C71532dv r0 = (C71532dv) map.get(Integer.valueOf(njw.A00));
                    if (r0 != null) {
                        arrayList.add(new 0eP(njw, new AnonymousClass61R(r0)));
                    }
                }
                r1 = new AnonymousClass9IE(0Yt.A08(arrayList));
            }
        }
        return r1;
    }

    public static final boolean A01(C376699Iz r3, AnonymousClass7NF r4) {
        List<C69357Njw> list = (List) r3.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C69357Njw njw : list) {
                if (!r4.A01.containsKey(Integer.valueOf(njw.A00))) {
                    return false;
                }
            }
        }
        return true;
    }

    public AnonymousClass7NF(Context context) {
        this.A00 = context;
    }

    public final void A02(0sP r6, C69357Njw[] njwArr) {
        C376699Iz r2 = new C376699Iz(r6, 03t.A0J(njwArr));
        AnonymousClass9IE A002 = A00(r2, this);
        if (A002 != null) {
            ((0sP) r2.A01).invoke(A002);
            return;
        }
        this.A02.add(r2);
        for (C69357Njw njw : (List) r2.A00) {
            Drawable drawable = this.A00.getDrawable(njw.A00);
            0qQ.A0C(drawable, "null cannot be cast to non-null type com.facebook.keyframes.network.KeyframesNetworkDrawableBase<*, *, *>");
            C226472gs r22 = (C226472gs) drawable;
            C17792Vg4 vg4 = new C17792Vg4(this, njw);
            if (r22.A00 == null) {
                r22.A02.add(vg4);
                r22.A02();
            } else if (((AnonymousClass2h1) r22.A00).A00() != null) {
                vg4.A00(((AnonymousClass2h1) r22.A00).A00());
            }
        }
    }
}
