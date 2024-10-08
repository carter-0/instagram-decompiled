package X;

import java.util.Collections;
import java.util.List;

public final class Swj implements C296765qb {
    public final List A00;

    public final int B2N() {
        return 1;
    }

    public final int BW7(long j) {
        return j < 0 ? 0 : -1;
    }

    public final List Atg(long j) {
        if (j >= 0) {
            return this.A00;
        }
        return Collections.emptyList();
    }

    public Swj(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public final long B2M(int i) {
        C256703wD.A03(AnonymousClass7TF.A1Q(i));
        return 0;
    }
}
