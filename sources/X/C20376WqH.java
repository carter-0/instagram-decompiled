package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.WqH  reason: case insensitive filesystem */
public final class C20376WqH implements Comparator {
    public static final C20376WqH A00 = new C20376WqH();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        int i3 = ((C17425VVe) entry.getValue()).A01;
        int i4 = ((C17425VVe) entry2.getValue()).A01;
        C17425VVe vVe = (C17425VVe) entry.getValue();
        if (i3 == i4) {
            i = vVe.A02;
            i2 = ((C17425VVe) entry2.getValue()).A02;
        } else {
            i = vVe.A01;
            i2 = ((C17425VVe) entry2.getValue()).A01;
        }
        return i - i2;
    }
}
