package X;

import java.util.Comparator;

/* renamed from: X.4Tw  reason: invalid class name and case insensitive filesystem */
public final class C265444Tw implements Comparator {
    public static final C265444Tw A00 = new Object();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass4U2 r5 = (AnonymousClass4U2) obj;
        AnonymousClass4U2 r6 = (AnonymousClass4U2) obj2;
        int compare = Double.compare(r5.A00, r6.A00);
        if (compare == 0) {
            return Double.compare(r5.A03.A03.A03, r6.A03.A03.A03);
        }
        return compare;
    }
}
