package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Qzl  reason: case insensitive filesystem */
public final class C8678Qzl extends Qzu<String, List<String>> {
    public final Map A00;

    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A00;
    }

    public final boolean containsKey(Object obj) {
        if (obj == null || !super.containsKey(obj)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map) || !entrySet().equals(((Map) obj).entrySet())) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.get(obj);
    }

    public C8678Qzl(Map map) {
        this.A00 = map;
    }

    public final Set entrySet() {
        return C281945Ae.A03(new C12609Szt(1), super.entrySet());
    }

    public final int hashCode() {
        return C281945Ae.A00(entrySet());
    }

    public final boolean isEmpty() {
        if (super.isEmpty() || (super.size() == 1 && super.containsKey((Object) null))) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        return C281945Ae.A03(new C12609Szt(0), super.keySet());
    }

    public final int size() {
        return super.size() - (super.containsKey((Object) null) ? 1 : 0);
    }
}
