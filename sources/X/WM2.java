package X;

import java.util.ArrayList;
import java.util.Iterator;

public final class WM2 implements XCM {
    public ArrayList A00;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof WM2) {
            return this.A00.equals(((WM2) obj).A00);
        }
        return false;
    }

    public static void A00(WM2 wm2, Object obj) {
        wm2.A00.add(obj);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final Iterator iterator() {
        return this.A00.iterator();
    }

    public final int size() {
        return this.A00.size();
    }

    public WM2(XCM xcm) {
        this.A00 = new ArrayList(xcm.size());
        for (Object A002 : xcm) {
            A00(this, A002);
        }
    }

    public WM2() {
        this.A00 = new ArrayList();
    }
}
