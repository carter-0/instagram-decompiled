package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.WqI  reason: case insensitive filesystem */
public final class C20377WqI implements Comparator {
    public static final C20377WqI A00 = new C20377WqI();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        int i3 = ((C17426VVf) entry.getValue()).A01;
        int i4 = ((C17426VVf) entry2.getValue()).A01;
        C17426VVf vVf = (C17426VVf) entry.getValue();
        if (i3 == i4) {
            i = vVf.A02;
            i2 = ((C17426VVf) entry2.getValue()).A02;
        } else {
            i = vVf.A01;
            i2 = ((C17426VVf) entry2.getValue()).A01;
        }
        return i - i2;
    }
}
