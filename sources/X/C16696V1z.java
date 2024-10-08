package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V1z  reason: case insensitive filesystem */
public final class C16696V1z extends IllegalArgumentException {
    public final List A00;

    public final String toString() {
        String A05 = 0mp.A05("|", this.A00);
        if (A05 == null) {
            return "";
        }
        return A05;
    }

    public C16696V1z(C16519UwO uwO, String str) {
        super(str);
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        arrayList.add(new C17798VgB(uwO, str));
    }

    public C16696V1z() {
        this.A00 = new ArrayList();
    }
}
