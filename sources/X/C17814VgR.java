package X;

import java.util.ArrayList;

/* renamed from: X.VgR  reason: case insensitive filesystem */
public final class C17814VgR {
    public C365408n3 A00 = null;
    public ArrayList A01 = new ArrayList();
    public ArrayList A02 = new ArrayList();

    public final boolean A00() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A01;
            if (i >= arrayList.size()) {
                return false;
            }
            C368848tQ r1 = (C368848tQ) arrayList.get(i);
            if (r1.A08 && r1.A05.isEnabled()) {
                return true;
            }
            i++;
        }
    }
}
