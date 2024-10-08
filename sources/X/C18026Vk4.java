package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Vk4  reason: case insensitive filesystem */
public final class C18026Vk4 {
    public HashMap A00 = new HashMap();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18026Vk4) {
            return this.A00.equals(((C18026Vk4) obj).A00);
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.V3O, java.lang.Object] */
    public final WM1 A00() {
        WM1 wm1 = new WM1();
        Iterator A0s = AnonymousClass7TF.A0s(this.A00);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Object key = A1J.getKey();
            Object value = A1J.getValue();
            ? obj = new Object();
            obj.A00 = key;
            obj.A01 = value;
            wm1.A00.add(obj);
        }
        return wm1;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
