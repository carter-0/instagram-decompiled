package X;

import android.os.Bundle;
import java.util.LinkedHashSet;
import java.util.Set;

public final class AQ0 implements AnonymousClass08X {
    public final Set A00 = new LinkedHashSet();

    public final void A00(String str) {
        this.A00.add(str);
    }

    public AQ0(08Y r2) {
        r2.A03(this, "androidx.savedstate.Restarter");
    }

    public final Bundle EKB() {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putStringArrayList("classes_to_restore", AnonymousClass7TE.A1D(this.A00));
        return A0a;
    }
}
