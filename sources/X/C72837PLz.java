package X;

import android.view.View;
import java.util.List;

/* renamed from: X.PLz  reason: case insensitive filesystem */
public final class C72837PLz implements C74361Ptb {
    public final C70977OTy A00;

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        N9X n9x = (N9X) pry;
        0qQ.A0B(n9x, 0);
        C70977OTy oTy = this.A00;
        if (n9x.A06) {
            oTy.A01 = n9x.A00;
            View A0B = C66581MXm.A0B(oTy.A08);
            boolean z = n9x.A09;
            int i = 8;
            A0B.setVisibility(DbW.A01(z ? 1 : 0));
            C66581MXm.A0B(oTy.A07).setVisibility(DbW.A01(z));
            boolean z2 = !z;
            C66581MXm.A0B(oTy.A0D).setVisibility(DbW.A01(z2 ? 1 : 0));
            C66581MXm.A0B(oTy.A0C).setVisibility(DbW.A01(z2));
            View A0B2 = C66581MXm.A0B(oTy.A03);
            if (n9x.A07) {
                i = 0;
            }
            A0B2.setVisibility(i);
            DbW.A1R(oTy.A06, 0);
            AnonymousClass0eM r1 = oTy.A05;
            ((C47816EIn) ((C70795OLq) r1.getValue()).A08.getValue()).A0I(n9x.A02, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, n9x.A03);
            boolean z3 = n9x.A08;
            boolean z4 = n9x.A05;
            String str = n9x.A01;
            0qQ.A0B(str, 2);
            ((C47816EIn) ((C70795OLq) r1.getValue()).A08.getValue()).A0H(str, z3, z4);
        }
    }

    public C72837PLz(C70977OTy oTy) {
        this.A00 = oTy;
    }
}
