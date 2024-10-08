package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4RZ  reason: invalid class name */
public final class AnonymousClass4RZ {
    public static final AnonymousClass4RZ A01 = new AnonymousClass4RZ(new ArrayList());
    public final List A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass4RZ) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass4RZ(List list) {
        this.A00 = AnonymousClass4R7.A00(list.toArray(new C264724Ra[0]));
    }
}
