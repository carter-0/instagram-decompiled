package X;

import java.util.List;

/* renamed from: X.R7m  reason: case insensitive filesystem */
public final class C8748R7m extends 1XP {
    public List A00;

    public final boolean isOk() {
        List list;
        if (this.mStatusCode != 200 || (list = this.A00) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
