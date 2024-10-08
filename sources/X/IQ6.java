package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class IQ6 implements C74308Psi {
    public final /* synthetic */ C53002Ggt A00;

    public IQ6(C53002Ggt ggt) {
        this.A00 = ggt;
    }

    public final void Dfc(String str, List list) {
        ArrayList arrayList;
        Object value;
        0qQ.A0B(str, 0);
        05G r3 = this.A00.A03;
        if (str.equals(((JVH) r3.getValue()).A05)) {
            if (list != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C317486nL B0p = ((C317466nJ) it.next()).B0p();
                    if (B0p != null) {
                        arrayList.add(B0p);
                    }
                }
            } else {
                arrayList = 0sn.A00;
            }
            ArrayList A0U = 00k.A0U(arrayList);
            do {
                value = r3.getValue();
            } while (!r3.AIY(value, JVH.A00((JVH) value, (C317486nL) null, (String) null, (List) null, A0U, 27)));
        }
    }
}
