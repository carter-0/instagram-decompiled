package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Lpv  reason: case insensitive filesystem */
public final class C65251Lpv implements MSE {
    public final /* synthetic */ K5Y A00;

    public C65251Lpv(K5Y k5y) {
        this.A00 = k5y;
    }

    public final void DZP() {
        K5Y k5y = this.A00;
        CallerContext callerContext = K5Y.A0E;
        PR9 pr9 = k5y.A04;
        if (pr9 != null) {
            pr9.A0F = false;
            AnonymousClass0eM r2 = k5y.A0C;
            if (C363558jv.A00(AnonymousClass7TE.A0l(r2))) {
                PR9 pr92 = k5y.A04;
                0qQ.A0A(pr92);
                pr92.A0D = true;
            }
            k5y.A06 = true;
            PR9 pr93 = k5y.A04;
            0qQ.A0A(pr93);
            pr93.A06 = null;
            FGF fgf = k5y.A05;
            if (fgf != null) {
                List list = k5y.A0B;
                C62136Kan kan = k5y.A00;
                if (kan != null) {
                    int position = kan.getPosition(fgf);
                    AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
                    FGF fgf2 = new FGF(JTT.A0R(r2).A02(k5y.requireContext(), k5y.requireActivity()));
                    fgf2.A01 = R.style.igds_body_1;
                    list.set(position, fgf2);
                    C62136Kan kan2 = k5y.A00;
                    if (kan2 != null) {
                        kan2.setItems(list);
                        return;
                    }
                }
                0qQ.A0F("adapter");
                throw AnonymousClass00P.createAndThrow();
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
