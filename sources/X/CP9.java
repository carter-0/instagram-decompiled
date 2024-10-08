package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.util.ArrayList;
import java.util.List;

public final class CP9 extends 17P implements DS6 {
    public List A00;

    public final DS6 E8i(1E9 r4) {
        List<C46234DRp> list = this.A00;
        if (list == null) {
            list = A0o(-463255253, C43895CHm.class);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C46234DRp dRp : list) {
            dRp.E70(r4);
            A0r.add(dRp);
        }
        this.A00 = A0r;
        return this;
    }

    public final BH1 FAR(1E9 r6) {
        ClipsACRMidCardSubType clipsACRMidCardSubType = (ClipsACRMidCardSubType) A0N(346870402, DMP.A00);
        List<C46234DRp> list = this.A00;
        if (list == null) {
            list = A0o(-463255253, C43895CHm.class);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C46234DRp F0A : list) {
            A0r.add(F0A.F0A(r6));
        }
        return new BH1(clipsACRMidCardSubType, A0U(), A0Y(), A0r);
    }
}
