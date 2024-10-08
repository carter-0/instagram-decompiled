package com.google.android.gms.location;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C365498nD;
import X.C9698RfG;
import X.RKT;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzac;
import com.google.android.gms.internal.location.zzah;

public final class zzaf extends zzah {
    public final /* synthetic */ C365498nD A00;

    public zzaf(C365498nD r3) {
        this.A00 = r3;
        AnonymousClass0fD.A0A(605604755, AnonymousClass0fD.A03(-118217745));
    }

    public final void A6u() {
        AnonymousClass0fD.A0A(-335086217, AnonymousClass0fD.A03(1789207193));
    }

    public final void FP4(zzac zzac) {
        int i;
        int A03 = AnonymousClass0fD.A03(92142001);
        Status status = zzac.A00;
        if (status == null) {
            this.A00.A02(new RKT(new Status(8, "Got null status from location service")));
            i = 71105108;
        } else {
            int i2 = status.A00;
            C365498nD r1 = this.A00;
            if (i2 == 0) {
                r1.A01(AnonymousClass7TE.A0v());
                i = -201117324;
            } else {
                r1.A02(C9698RfG.A00(status));
                i = 1863563781;
            }
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
