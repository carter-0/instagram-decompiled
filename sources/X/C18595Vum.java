package X;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import java.util.LinkedHashMap;

/* renamed from: X.Vum  reason: case insensitive filesystem */
public final class C18595Vum {
    public final void A02(Activity activity, AnonymousClass4OA r9, C20882X2k x2k) {
        0qQ.A0B(r9, 1);
        C17965Viz viz = new C17965Viz(AnonymousClass4O9.LOCATION_FOREGROUND, r9);
        Integer A01 = A01(activity);
        C20882X2k x2k2 = x2k;
        if (A01 != AnonymousClass05K.A00) {
            x2k.DWn(A00(activity, viz.A01, false), A01);
        }
        T7I t7i = new T7I(4, viz, A01, x2k2, this);
        String[] A012 = viz.A01();
        C13990Tnq.A0k(activity, t7i, A012, A012.length);
    }

    public static final AnonymousClass4OB A00(Context context, AnonymousClass4OA r8, boolean z) {
        AnonymousClass4O9 r0;
        AnonymousClass4OB r02;
        if (z) {
            r0 = AnonymousClass4O9.LOCATION_BACKGROUND;
        } else {
            r0 = AnonymousClass4O9.LOCATION_FOREGROUND;
        }
        C17965Viz viz = new C17965Viz(r0, r8);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r4));
        for (String str : viz.A01()) {
            if (1DL.A07(context, str)) {
                r02 = AnonymousClass4OB.GRANTED;
            } else {
                r02 = AnonymousClass4OB.DENIED;
            }
            linkedHashMap.put(str, r02);
        }
        return viz.A00(linkedHashMap);
    }

    public final Integer A01(Context context) {
        Object systemService = context.getSystemService("location");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        if (((LocationManager) systemService).isLocationEnabled()) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A01;
    }
}
