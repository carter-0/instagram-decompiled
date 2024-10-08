package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JEf  reason: case insensitive filesystem */
public final class C59301JEf extends 0Yg implements 0sL {
    public static final C59301JEf A00 = new C59301JEf();

    public C59301JEf() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass6HK r7 = (AnonymousClass6HK) obj;
        C286155Ud r8 = (C286155Ud) obj2;
        AnonymousClass7TG.A1N(r7, r8);
        List list = r8.A01;
        ArrayList A0m = C51970G9q.A0m(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0m.add(C56494HzQ.A00(C56494HzQ.A05, r7, list.get(i)));
        }
        return A0m;
    }
}
