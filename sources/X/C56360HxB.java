package X;

import java.util.Iterator;
import java.util.regex.Matcher;

/* renamed from: X.HxB  reason: case insensitive filesystem */
public abstract class C56360HxB {
    public static final C286025Tq A01(String str, long j) {
        String str2 = str;
        0qQ.A0B(str2, 0);
        C303876Bd A0L = C51972G9s.A0L(str2);
        Matcher A09 = 0mp.A09(str2);
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                int start = A09.start(1);
                int end = A09.end(1);
                A0L.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, j, 0, 0), start, end);
                A0L.A0A("wall_user_mention", group, start, end);
            }
        }
        return A0L.A02();
    }

    public static final int A00(String str, 0sP r5, int i) {
        Object obj;
        Iterator it = new 2HZ(i - 1, 0, -1).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C51971G9r.A1a(Character.valueOf(str.charAt(AnonymousClass7TE.A0M(obj))), r5)) {
                break;
            }
        }
        return DbX.A02((Number) obj);
    }
}
