package X;

import com.instagram.tagging.model.Tag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.KxQ  reason: case insensitive filesystem */
public abstract class C63461KxQ {
    public static final ArrayList A00(List list, List list2) {
        Map map;
        if (list != null) {
            List A0X = 00k.A0X(list);
            LinkedHashMap A0x = DbS.A0x(JTT.A08(A0X));
            for (Object next : A0X) {
                A0x.put(((Tag) next).getId(), next);
            }
            map = 0Yt.A03(A0x);
        } else {
            map = AnonymousClass7TE.A1E();
        }
        if (list2 != null) {
            Iterator it = 00k.A0X(list2).iterator();
            while (it.hasNext()) {
                map.remove(JTU.A0Y(it));
            }
        }
        return Dba.A0e(map);
    }
}
