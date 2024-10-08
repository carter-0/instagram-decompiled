package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Set;

/* renamed from: X.Soz  reason: case insensitive filesystem */
public final class C12204Soz implements AnonymousClass5IP {
    public final String A00;
    public final Set A01;

    public final ImmutableMap AET() {
        ImmutableMap of;
        Set set = this.A01;
        if (set.isEmpty()) {
            of = RegularImmutableMap.A02;
        } else {
            of = ImmutableMap.of(this.A00, C66581MXm.A0w(", ", set));
        }
        0qQ.A07(of);
        return of;
    }

    public C12204Soz(String str, Set set) {
        this.A00 = str;
        this.A01 = set;
    }
}
