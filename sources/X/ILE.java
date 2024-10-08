package X;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ILE implements 21a {
    public final Map A00 = new ConcurrentHashMap();

    public final void E5M(AnonymousClass41T r2, String str) {
        0qQ.A0B(str, 0);
        this.A00.put(str, r2);
    }

    public final void ED4(String str) {
        0qQ.A0B(str, 0);
        this.A00.remove(str);
    }

    public final AnonymousClass41T AX7(String str) {
        return (AnonymousClass41T) this.A00.get(str);
    }

    public final Collection values() {
        return this.A00.values();
    }
}
