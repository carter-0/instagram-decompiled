package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Pog  reason: case insensitive filesystem */
public final class C74077Pog extends 0Yg implements 0sP {
    public static final C74077Pog A00 = new C74077Pog();

    public C74077Pog() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Set A12 = C66581MXm.A12(obj);
        Set set = O4R.A00;
        boolean z = false;
        if (!(A12 instanceof Collection) || !A12.isEmpty()) {
            Iterator it = A12.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (set.contains(it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
