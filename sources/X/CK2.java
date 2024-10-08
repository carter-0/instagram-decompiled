package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CK2 extends 17P implements C46237DRs {
    public List A00;

    public final C46237DRs E7N(1E9 r4) {
        List A0o = A0o(1939383089, ImmutablePandoMediaDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41848B3p.A1T(r4, A0r, it);
        }
        this.A00 = A0r;
        return this;
    }

    public final C53442Goa F33(1E9 r12) {
        ClipsACRMidCardSubType clipsACRMidCardSubType = (ClipsACRMidCardSubType) A0N(346870402, C46050DKh.A00);
        String A0h = A0h(-815905284);
        String A0j = A0j(-1850778673);
        String A0j2 = A0j(-574529157);
        List A0o = A0o(1939383089, ImmutablePandoMediaDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41848B3p.A1T(r12, A0r, it);
        }
        ArrayList A0p = AnonymousClass7TF.A0p(A0r);
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            C41848B3p.A1V(r12, A0p, it2);
        }
        List<C46232DRn> A0o2 = A0o(-724653039, COQ.class);
        ArrayList A0p2 = AnonymousClass7TF.A0p(A0o2);
        for (C46232DRn F9E : A0o2) {
            A0p2.add(F9E.F9E());
        }
        return new C53442Goa(clipsACRMidCardSubType, A0h, A0j, A0j2, A0h(-2060497896), A0S(), A0p, A0p2);
    }
}
