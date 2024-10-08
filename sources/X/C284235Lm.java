package X;

import androidx.datastore.preferences.core.Preferences;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5Lm  reason: invalid class name and case insensitive filesystem */
public final class C284235Lm extends Preferences {
    public final Map A00;
    public final AtomicBoolean A01;

    public C284235Lm(Map map, boolean z) {
        0qQ.A0B(map, 1);
        this.A00 = map;
        this.A01 = new AtomicBoolean(z);
    }

    public final void A00() {
        if (!(!this.A01.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C284235Lm) {
            return 0qQ.A0K(this.A00, ((C284235Lm) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return 00k.A0P(",\n", "{\n", "\n}", this.A00.entrySet(), C51808G2s.A00);
    }

    public final void A01(AnonymousClass5Ka r3, Object obj) {
        A00();
        if (obj == null) {
            A00();
            this.A00.remove(r3);
            return;
        }
        boolean z = obj instanceof Set;
        Map map = this.A00;
        if (z) {
            obj = Collections.unmodifiableSet(00k.A0k((Iterable) obj));
            0qQ.A07(obj);
        }
        map.put(r3, obj);
    }

    public C284235Lm() {
        this(new LinkedHashMap(), true);
    }
}
