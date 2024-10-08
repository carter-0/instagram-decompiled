package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JEa  reason: case insensitive filesystem */
public final class C59296JEa extends 0Yg implements 0sL {
    public static final C59296JEa A00 = new C59296JEa();

    public C59296JEa() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass6HK r6 = (AnonymousClass6HK) obj;
        List list = (List) obj2;
        AnonymousClass7TG.A1N(r6, list);
        ArrayList A0m = C51970G9q.A0m(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0m.add(C56494HzQ.A00(C56494HzQ.A01, r6, list.get(i)));
        }
        return A0m;
    }
}
