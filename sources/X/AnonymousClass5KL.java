package X;

import androidx.datastore.migrations.SharedPreferencesMigration;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.5KL  reason: invalid class name */
public abstract class AnonymousClass5KL {
    public static final Set A00 = new LinkedHashSet();

    public static final SharedPreferencesMigration A00(Set set, C62320sa r6) {
        if (set != A00) {
            return new SharedPreferencesMigration(set, r6, new C376959Jz((Object) set, (AnonymousClass4D7) null, 0, 42), new C376949Jy(0, (AnonymousClass4D7) null));
        }
        return new SharedPreferencesMigration(AnonymousClass5KM.A00, r6, new C376959Jz((Object) set, (AnonymousClass4D7) null, 0, 42), new C376949Jy(0, (AnonymousClass4D7) null));
    }
}
