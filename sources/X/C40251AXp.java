package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.AXp  reason: case insensitive filesystem */
public final class C40251AXp implements AnonymousClass1MK {
    public final List A00;
    public final Map A01 = AnonymousClass7TE.A1H();
    public final 0sP A02;

    public C40251AXp(String str, List list, 0sP r6) {
        0qQ.A0B(str, 2);
        this.A00 = list;
        this.A02 = r6;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1OO A0J = 1NK.A00().A0J((ImageUrl) it.next(), str);
            A0J.A02(this);
            A0J.A01();
        }
        if (this.A00.size() == 0) {
            this.A02.invoke(0sn.A00);
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        AnonymousClass7TG.A1N(r5, r6);
        Map map = this.A01;
        map.put(r5.BGK(), r6.A01);
        int size = map.size();
        List<Object> list = this.A00;
        if (size == list.size()) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object obj : list) {
                Object obj2 = map.get(obj);
                if (obj2 != null) {
                    A1C.add(obj2);
                }
            }
            this.A02.invoke(A1C);
        }
    }
}
