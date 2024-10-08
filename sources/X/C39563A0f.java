package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.A0f  reason: case insensitive filesystem */
public abstract class C39563A0f {
    public static final AnonymousClass51W A00(AnonymousClass3QS r11, List list, List list2, Map map) {
        AnonymousClass51I r7;
        AnonymousClass9IV r6;
        C357618Yx r0;
        0qQ.A0B(list, 0);
        01N A1H = 0jo.A1H();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AnonymousClass55O r5 = (AnonymousClass55O) it.next();
                if (!(r5 instanceof C388649oA) || ((r0 = ((C388649oA) r5).A00) != null && ((double) r0.A00) > 0.0d)) {
                    A1H.add(r5);
                }
            }
        }
        01N A1I = 0jo.A1I(A1H);
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            A0p.add(new AnonymousClass9IE((AnonymousClass51N) it2.next()));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0p);
        0qQ.A07(copyOf);
        AnonymousClass3QS r8 = r11;
        if (r11 != null) {
            r7 = r11.A00(AnonymousClass51J.AUDIO_TRACK);
        } else {
            r7 = null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (next instanceof AnonymousClass51M) {
                A1C.add(next);
            }
        }
        if (map != null) {
            Set<Object> keySet = map.keySet();
            ArrayList A0p2 = AnonymousClass7TF.A0p(keySet);
            for (Object indexOf : keySet) {
                AnonymousClass7TF.A1M(A0p2, A1C.indexOf(indexOf));
            }
            Collection<List> values = map.values();
            ArrayList A0p3 = AnonymousClass7TF.A0p(values);
            for (List jwI : values) {
                A0p3.add(new C61080JwI(jwI, 32));
            }
            r6 = new AnonymousClass9IV((List) A0p2, (List) A0p3, 9);
        } else {
            r6 = null;
        }
        return new AnonymousClass51W(r6, r7, r8, copyOf, A1I);
    }
}
