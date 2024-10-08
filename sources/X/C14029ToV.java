package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ToV  reason: case insensitive filesystem */
public final class C14029ToV {
    public final List A00;

    public final boolean A00() {
        List list = this.A00;
        if (!(!list.isEmpty()) || !(list.get(0) instanceof PG7)) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        List list = this.A00;
        if (!(!list.isEmpty()) || !(list.get(0) instanceof AnonymousClass3UL)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C14029ToV(List list) {
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        if (list != null) {
            arrayList.addAll(00k.A0X(list));
        }
    }

    public C14029ToV() {
        this.A00 = new ArrayList();
    }
}
