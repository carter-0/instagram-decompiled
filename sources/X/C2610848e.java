package X;

import java.util.Comparator;

/* renamed from: X.48e  reason: invalid class name and case insensitive filesystem */
public final class C2610848e implements Comparator {
    public static final C2610848e A00 = new C2610848e();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        long j2;
        C254703su r10 = (C254703su) obj;
        C254703su r11 = (C254703su) obj2;
        Long l = r10.A1P;
        long C7c = r10.C7c();
        Long l2 = r11.A1P;
        long C7c2 = r11.C7c();
        if (l != null) {
            j = l.longValue();
        } else {
            j = C7c;
            C7c = 0;
        }
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = C7c2;
            C7c2 = 0;
        }
        if (j < j2) {
            return -1;
        }
        if (j <= j2) {
            if (C7c < C7c2) {
                return -1;
            }
            if (C7c > C7c2) {
                return 1;
            }
            return 0;
        }
        return 1;
    }
}
