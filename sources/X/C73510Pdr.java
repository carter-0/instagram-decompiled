package X;

import java.util.Iterator;

/* renamed from: X.Pdr  reason: case insensitive filesystem */
public final /* synthetic */ class C73510Pdr implements 0sP {
    public final Object invoke(Object obj) {
        boolean z;
        Iterator it = ((NHP) obj).A04.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C66580MXl.A0a(it).A1S()) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
