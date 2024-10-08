package X;

import java.util.Comparator;

/* renamed from: X.6Jb  reason: invalid class name and case insensitive filesystem */
public final class C305666Jb implements Comparator {
    public final /* synthetic */ Comparator A00;
    public final /* synthetic */ Comparator A01;

    public C305666Jb(Comparator comparator, Comparator comparator2) {
        this.A01 = comparator;
        this.A00 = comparator2;
    }

    public final int compare(Object obj, Object obj2) {
        int compare = this.A01.compare(obj, obj2);
        if (compare == 0) {
            return this.A00.compare(((AnonymousClass5SX) obj).A04, ((AnonymousClass5SX) obj2).A04);
        }
        return compare;
    }
}
