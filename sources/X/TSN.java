package X;

import java.util.ArrayList;

public final class TSN extends ArrayList {
    public final int A00;

    public TSN(int i) {
        long j;
        this.A00 = i;
        if (i != 0) {
            AnonymousClass7TF.A1M(this, 60);
            AnonymousClass7TF.A1M(this, 120);
            AnonymousClass7TF.A1M(this, 240);
            AnonymousClass7TF.A1M(this, 480);
            j = 900;
        } else {
            AnonymousClass7TE.A1Y(this, 86400000);
            AnonymousClass7TE.A1Y(this, 43200000);
            AnonymousClass7TE.A1Y(this, 3600000);
            AnonymousClass7TE.A1Y(this, 1800000);
            j = 900000L;
        }
        add(j);
    }
}
