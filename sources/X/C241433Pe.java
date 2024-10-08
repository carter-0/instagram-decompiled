package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.3Pe  reason: invalid class name and case insensitive filesystem */
public final class C241433Pe implements Comparator {
    public static final C241433Pe A00 = new C241433Pe();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        0qQ.A0A(entry);
        AnonymousClass4HX r3 = (AnonymousClass4HX) entry.getValue();
        0qQ.A0A(entry2);
        AnonymousClass4HX r2 = (AnonymousClass4HX) entry2.getValue();
        int i3 = r3.A02 - r2.A02;
        if (i3 != 0) {
            return i3;
        }
        if (0mk.A02(C60960kU.A00)) {
            i = r2.A01;
            i2 = r3.A01;
        } else {
            i = r3.A01;
            i2 = r2.A01;
        }
        return i - i2;
    }
}
