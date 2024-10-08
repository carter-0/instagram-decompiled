package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2vs  reason: invalid class name and case insensitive filesystem */
public final class C233532vs {
    public boolean A00;
    public final Set A01 = new HashSet();

    public final boolean A00(String str) {
        if (!this.A00 || !this.A01.contains(str)) {
            return false;
        }
        return true;
    }

    public C233532vs(boolean z) {
        this.A00 = z;
    }
}
