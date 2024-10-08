package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.95z  reason: invalid class name and case insensitive filesystem */
public final class C3735495z {
    public final AnonymousClass96O A00;
    public final String A01;

    public static String A00(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass964 r1 = (AnonymousClass964) ((AnonymousClass965) it.next());
            sb.append(r1.A00);
            sb.append('/');
            sb.append(r1.A01);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public C3735495z(AnonymousClass96O r2, Set set) {
        this.A01 = A00(set);
        this.A00 = r2;
    }
}
