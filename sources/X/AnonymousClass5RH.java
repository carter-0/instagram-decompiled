package X;

import java.util.Comparator;

/* renamed from: X.5RH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5RH implements Comparator {
    public final int compare(Object obj, Object obj2) {
        AnonymousClass5SJ r4 = ((AnonymousClass5R6) obj).A0U.A0J;
        float f = r4.A02;
        AnonymousClass5SJ r2 = ((AnonymousClass5R6) obj2).A0U.A0J;
        float f2 = r2.A02;
        if (f == f2) {
            return 0qQ.A00(r4.A03, r2.A03);
        }
        return Float.compare(f, f2);
    }
}
