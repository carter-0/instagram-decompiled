package X;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.9QF  reason: invalid class name */
public final class AnonymousClass9QF implements C3495480u {
    public final /* synthetic */ C353498Hw A00;

    public AnonymousClass9QF(C353498Hw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        int A0M = AnonymousClass7TE.A0M(obj);
        C353498Hw r5 = this.A00;
        List list = r5.A23;
        C3495880y r0 = (C3495880y) 00k.A0O(list, A0M);
        Integer num = null;
        if (r0 != null) {
            num = Integer.valueOf(r0.A01);
        }
        Object obj2 = r5.A1F.A08.A00;
        AnonymousClass80N r6 = AnonymousClass80N.A00;
        if (obj2 == r6 && r5.A0I != 00k.A0O(list, A0M) && num != null && r5.A0J.A00 <= num.intValue()) {
            C353498Hw.A0t(r5, A0M);
            C3495880y r02 = r5.A0I;
            if (r02 != null) {
                int i = r02.A00;
                if (Integer.valueOf(i) != null) {
                    C3503684j r4 = r5.A1R;
                    Context context = r5.A11;
                    r4.A04(context.getString(i), 1000);
                    AnonymousClass8E8 A002 = r5.A1O.A00();
                    C358088aL r42 = C358088aL.A0E;
                    String format = String.format(Locale.getDefault(), context.getString(2131961073), new Object[]{context.getString(i)});
                    0qQ.A07(format);
                    AnonymousClass8EA r03 = A002.A00;
                    if (r03 != null) {
                        LinkedHashMap linkedHashMap = r03.A0D;
                        linkedHashMap.values();
                        AnonymousClass8EL r04 = (AnonymousClass8EL) linkedHashMap.get(r6);
                        if (r04 == null) {
                            0kD.A00("CameraToolMenu", "no adapter available for given destination");
                            return;
                        }
                        Iterator A0s = AnonymousClass7TF.A0s(r04.A0I);
                        while (A0s.hasNext()) {
                            Map.Entry entry = (Map.Entry) A0s.next();
                            Object key = entry.getKey();
                            View view = (View) entry.getValue();
                            if (key == r42 && view != null) {
                                view.announceForAccessibility(format);
                            }
                        }
                    }
                }
            }
        }
    }
}
