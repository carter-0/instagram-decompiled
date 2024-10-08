package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.637  reason: invalid class name */
public final class AnonymousClass637 {
    public final List A00;

    public AnonymousClass637(String str) {
        ArrayList arrayList;
        0qQ.A0B(str, 2);
        try {
            String[] split = str.split("\\.");
            0qQ.A07(split);
            arrayList = new ArrayList(r3);
            for (String parseInt : split) {
                arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
            }
        } catch (NumberFormatException unused) {
            arrayList = 0sn.A00;
        }
        this.A00 = arrayList;
    }
}
