package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Map;

/* renamed from: X.5EC  reason: invalid class name */
public final class AnonymousClass5EC {
    public final int A00;
    public final AnonymousClass5ED[] A01;

    public final JsonSerializer A00(C268894eF r4) {
        AnonymousClass5ED r2 = this.A01[(r4.hashCode() - 1) & this.A00];
        if (r2 == null) {
            return null;
        }
        do {
            if (!r2.A04 && r4.equals(r2.A00)) {
                return r2.A01;
            }
            r2 = r2.A02;
        } while (r2 != null);
        return null;
    }

    public final JsonSerializer A01(Class cls) {
        AnonymousClass5ED r2 = this.A01[cls.getName().hashCode() & this.A00];
        if (r2 == null) {
            return null;
        }
        do {
            if (r2.A03 == cls && !r2.A04) {
                return r2.A01;
            }
            r2 = r2.A02;
        } while (r2 != null);
        return null;
    }

    public AnonymousClass5EC(Map map) {
        int size = map.size();
        int i = 8;
        while (i < (size > 64 ? (size >> 2) + size : size + size)) {
            i += i;
        }
        this.A00 = i - 1;
        AnonymousClass5ED[] r6 = new AnonymousClass5ED[i];
        for (Map.Entry entry : map.entrySet()) {
            AnonymousClass5EE r4 = (AnonymousClass5EE) entry.getKey();
            int hashCode = r4.hashCode() & this.A00;
            r6[hashCode] = new AnonymousClass5ED((JsonSerializer) entry.getValue(), r6[hashCode], r4);
        }
        this.A01 = r6;
    }
}
