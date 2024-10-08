package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.3LV  reason: invalid class name */
public final class AnonymousClass3LV {
    public int A00;
    public LinkedList A01 = new LinkedList();

    public static final boolean A01(AnonymousClass0iw r4, Map map) {
        if (map.get("instance_id") == null || map.get("module") == null) {
            return false;
        }
        if (0qQ.A0K(map.get("instance_id"), String.valueOf(System.identityHashCode(r4))) || 0qQ.A0K(map.get("module"), r4.getModuleName())) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.A01.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            StringBuilder sb = new StringBuilder();
            sb.append(next);
            sb.append("\n");
            stringBuffer.append(sb.toString());
        }
        String obj = stringBuffer.toString();
        0qQ.A07(obj);
        return obj;
    }

    public static final void A00(AnonymousClass0iw r2, String str, Map map) {
        0jB E4x;
        r2.getModuleName();
        map.put("instance_id", String.valueOf(System.identityHashCode(r2)));
        map.put("module", r2.getModuleName());
        if (str != null) {
            map.put("source_module", str);
        }
        if ((r2 instanceof AnonymousClass0j6) && (E4x = ((AnonymousClass0j6) r2).E4x()) != null) {
            map.putAll(E4x.A02());
        }
    }
}
