package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.J0s  reason: case insensitive filesystem */
public final class C58955J0s extends 0Yg implements 0sP {
    public static final C58955J0s A00 = new C58955J0s();

    public C58955J0s() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        List list = (List) obj;
        ArrayList A0m = C51970G9q.A0m(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            C286015Tp r2 = C56494HzQ.A05;
            Object obj3 = null;
            if (!AnonymousClass7TF.A1Y(obj2, false) && obj2 != null) {
                obj3 = r2.EIl(obj2);
            }
            0qQ.A0A(obj3);
            A0m.add(obj3);
        }
        return new C286155Ud(A0m);
    }
}
