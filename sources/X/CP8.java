package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.util.ArrayList;
import java.util.List;

public final class CP8 extends 17P implements DS5 {
    public AnonymousClass3HY A00;

    public final DS5 E8h(1E9 r3) {
        AnonymousClass3HY r0 = this.A00;
        if (r0 == null && (r0 = (AnonymousClass3HY) A05(580362274, C44024CRg.class)) == null) {
            r0 = null;
        } else {
            r0.E9v(r3);
        }
        this.A00 = r0;
        return this;
    }

    public final BH0 FAQ(1E9 r9) {
        AnonymousClass3HX FEq;
        String A0j = A0j(501281532);
        ClipsACRMidCardSubType clipsACRMidCardSubType = (ClipsACRMidCardSubType) A0N(346870402, DMO.A00);
        List<C46232DRn> A0o = A0o(-724653039, COQ.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        for (C46232DRn F9E : A0o) {
            A0r.add(F9E.F9E());
        }
        AnonymousClass3HY r0 = this.A00;
        if (r0 == null && (r0 = (AnonymousClass3HY) A05(580362274, C44024CRg.class)) == null) {
            FEq = null;
        } else {
            FEq = r0.FEq(r9);
        }
        return new BH0(clipsACRMidCardSubType, FEq, A0j, A0U(), A0Y(), A0r);
    }
}
