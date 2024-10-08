package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.Fed  reason: case insensitive filesystem */
public final class C50568Fed implements G7C {
    public final Dd4 A00;
    public final Set A01;

    public C50568Fed(Dd4 dd4) {
        this.A00 = dd4;
        Set<C46518DgL> A07 = 0sc.A07(new C46518DgL[]{C46518DgL.A0L, C46518DgL.A0M, C46518DgL.A08, C46518DgL.A0l, C46518DgL.A0t, C46518DgL.A1u, C46518DgL.A2U, C46518DgL.A0j, C46518DgL.A2T, C46518DgL.A0o, C46518DgL.A2Y, C46518DgL.A37});
        ArrayList A0p = AnonymousClass7TF.A0p(A07);
        for (C46518DgL dgL : A07) {
            A0p.add(dgL.A00);
        }
        this.A01 = 00k.A0k(A0p);
    }

    public final boolean AFM(C48087EVf eVf, C283155Gi r4, int i) {
        AnonymousClass7TG.A1N(r4, eVf);
        if (eVf != C48087EVf.END_IMAGE || r4.A07() == null) {
            return false;
        }
        return true;
    }

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r7, int i) {
        Boolean bool;
        AnonymousClass7TG.A1N(r7, eVf);
        C47179Dru A002 = C47179Dru.A00(jv7, eVf, i);
        Set set = this.A01;
        String A06 = r7.A06();
        if (A06 == null) {
            A06 = "";
        }
        if (set.contains(A06) || (((bool = r7.A04.A0J) != null && bool.booleanValue()) || r7.A08() != null || r7.A00 == 822)) {
            Dd4 dd4 = this.A00;
            String A07 = r7.A07();
            if (A07 != null) {
                dd4.DPt(A002, r7, A07, i);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        this.A00.D4k(A002, r7, i);
    }
}
