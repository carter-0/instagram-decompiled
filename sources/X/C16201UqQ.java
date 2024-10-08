package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UqQ  reason: case insensitive filesystem */
public final class C16201UqQ extends AnonymousClass9V1 {
    public final ArrayList A00(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66942Mfb mfb = (C66942Mfb) it.next();
            if (mfb.A01 == 0) {
                arrayList.add(mfb);
            }
        }
        return arrayList;
    }
}
