package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6LD  reason: invalid class name */
public abstract class AnonymousClass6LD {
    public static final ArrayList A00(List list) {
        AnonymousClass6LE r3 = AnonymousClass6LE.A00;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (Object invoke : list) {
            arrayList.add(r3.invoke(invoke));
        }
        return new ArrayList(arrayList);
    }
}
