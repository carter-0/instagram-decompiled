package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.8dP  reason: invalid class name and case insensitive filesystem */
public abstract class C359738dP {
    public static final String A00() {
        StringBuilder sb = new StringBuilder();
        if (1Kq.A00.Ez2()) {
            String lowerCase = 1Kq.A00.C5w().name().toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            List singletonList = Collections.singletonList(lowerCase);
            0qQ.A07(singletonList);
            sb.append(002.A0T(00k.A0P("_", "", "", singletonList, (0sP) null), "XMDS", '_'));
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public static final ArrayList A01(0sL r3) {
        ArrayList arrayList = new ArrayList();
        if (1Kq.A00.Ez2()) {
            String lowerCase = 1Kq.A00.C5w().name().toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            List singletonList = Collections.singletonList(lowerCase);
            0qQ.A07(singletonList);
            arrayList.add(r3.invoke(singletonList, "XMDS"));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
