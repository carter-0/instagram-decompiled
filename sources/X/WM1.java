package X;

import java.util.HashSet;
import java.util.Iterator;

public final class WM1 implements XCM {
    public HashSet A00 = new HashSet();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof WM1) {
            return this.A00.equals(((WM1) obj).A00);
        }
        return false;
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
}
