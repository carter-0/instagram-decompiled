package X;

import java.util.Map;

/* renamed from: X.4tF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C276384tF implements 0sP {
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        0qQ.A0B(entry, 0);
        Object value = entry.getValue();
        StringBuilder sb = new StringBuilder();
        C255563uL.A00(sb, (String) entry.getKey());
        sb.append(':');
        sb.append(value);
        String obj2 = sb.toString();
        0qQ.A07(obj2);
        return obj2;
    }
}
