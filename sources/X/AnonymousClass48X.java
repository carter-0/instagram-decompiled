package X;

import java.util.Comparator;

/* renamed from: X.48X  reason: invalid class name */
public final class AnonymousClass48X implements Comparator {
    public static final AnonymousClass48X A00 = new AnonymousClass48X();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int length = str.length() - str2.length();
        if (length == 0) {
            return str.compareTo(str2);
        }
        return length;
    }
}
