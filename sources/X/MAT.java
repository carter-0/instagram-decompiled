package X;

import java.util.Comparator;

public final class MAT implements Comparator {
    public static final MAT A00 = new MAT();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass3Q2 r6 = (AnonymousClass3Q2) obj;
        AnonymousClass3Q2 r7 = (AnonymousClass3Q2) obj2;
        AnonymousClass7TG.A1N(r6, r7);
        long j = r6.A0g;
        long j2 = r7.A0g;
        if (j > j2) {
            return -1;
        }
        return C51970G9q.A1U((j > j2 ? 1 : (j == j2 ? 0 : -1))) ? 1 : 0;
    }
}
