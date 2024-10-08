package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Np  reason: invalid class name and case insensitive filesystem */
public final class C354848Np extends 0Yg implements 0sP {
    public static final C354848Np A00 = new C354848Np();

    public C354848Np() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List<C361278fx> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C361278fx r2 : list) {
                int i = r2.A00;
                if (i == 3 || i == 2) {
                    arrayList.add(r2.A00());
                }
            }
        }
        return arrayList;
    }
}
