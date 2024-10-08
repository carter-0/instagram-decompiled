package X;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/* renamed from: X.5eV  reason: invalid class name and case insensitive filesystem */
public final class C289945eV implements BiConsumer {
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        String str = (String) obj;
        0qQ.A0B(str, 0);
        0qQ.A0B(obj2, 1);
        if (obj2 instanceof Boolean) {
            AnonymousClass2Tw.A01.markerAnnotate(688602968, str, ((Boolean) obj2).booleanValue());
        } else if (obj2 instanceof String) {
            AnonymousClass2Tw.A01.markerAnnotate(688602968, str, (String) obj2);
        } else if (obj2 instanceof Integer) {
            AnonymousClass2Tw.A01.markerAnnotate(688602968, str, ((Number) obj2).intValue());
        } else if (obj2 instanceof List) {
            02m r4 = AnonymousClass2Tw.A01;
            Iterable<Object> iterable = (Iterable) obj2;
            ArrayList arrayList = new ArrayList(0Yv.A1E(iterable, 10));
            for (Object valueOf : iterable) {
                arrayList.add(String.valueOf(valueOf));
            }
            r4.markerAnnotate(688602968, str, (String[]) arrayList.toArray(new String[0]));
        }
    }
}
