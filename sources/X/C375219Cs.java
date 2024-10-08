package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9Cs  reason: invalid class name and case insensitive filesystem */
public final class C375219Cs {
    public static final C375219Cs A01 = new C375219Cs(Collections.unmodifiableMap(new HashMap()));
    public final Map A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C375219Cs)) {
            return false;
        }
        return this.A00.equals(((C375219Cs) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C375219Cs(Map map) {
        this.A00 = map;
    }
}
