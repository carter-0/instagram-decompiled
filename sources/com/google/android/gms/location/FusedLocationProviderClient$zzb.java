package com.google.android.gms.location;

import X.AnonymousClass0fD;
import X.C12592Syr;
import X.C13485TbC;
import X.C365498nD;
import X.C8367QpP;
import X.C9697RfF;
import X.RR1;
import X.SxY;
import com.google.android.gms.internal.location.zzac;
import com.google.android.gms.internal.location.zzah;

public final class FusedLocationProviderClient$zzb extends zzah {
    public final C365498nD A00;
    public final C13485TbC A01;

    public FusedLocationProviderClient$zzb(C13485TbC tbC, C365498nD r4) {
        int A03 = AnonymousClass0fD.A03(1744802708);
        this.A00 = r4;
        AnonymousClass0fD.A0A(1560599061, A03);
        int A032 = AnonymousClass0fD.A03(1020269424);
        this.A01 = tbC;
        AnonymousClass0fD.A0A(904708280, A032);
    }

    public final void A6u() {
        int A03 = AnonymousClass0fD.A03(-1559989382);
        C12592Syr syr = (C12592Syr) this.A01;
        C8367QpP qpP = syr.A00;
        SxY sxY = syr.A02;
        RR1 rr1 = syr.A01;
        sxY.A00 = false;
        qpP.A01(rr1);
        AnonymousClass0fD.A0A(252527792, A03);
    }

    public final void FP4(zzac zzac) {
        int A03 = AnonymousClass0fD.A03(2113736705);
        C9697RfF.A00(zzac.A00, this.A00, (Object) null);
        AnonymousClass0fD.A0A(1153961194, A03);
    }
}
