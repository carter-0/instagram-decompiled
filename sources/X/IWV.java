package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

public final class IWV implements C230922qa {
    public final int A00;
    public final Object A01;

    public IWV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DVk(C300555xO r2) {
        C230882qT r0;
        switch (this.A00) {
            case 0:
                r0 = (C230882qT) ((C66633Ma2) this.A01).A2V.getValue();
                break;
            case 1:
                r0 = ((C46656Dib) this.A01).A0o;
                break;
            case 2:
                r0 = ((H15) this.A01).A08;
                break;
            default:
                r0 = ((ESS) this.A01).A01;
                if (r0 == null) {
                    return;
                }
                break;
        }
        r0.A02 = r2;
    }

    public final void Ds7(C300555xO r6) {
        String str;
        C230882qT r1;
        C231002qi r0;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r6, 0);
                if (!"Discover channels you can join.".equals(r6.A02) || ((C66633Ma2) this.A01).A1F) {
                    C66633Ma2 ma2 = (C66633Ma2) this.A01;
                    r1 = (C230882qT) ma2.A2V.getValue();
                    r0 = (2bu) ma2.A2U.getValue();
                    break;
                } else {
                    return;
                }
            case 1:
                C46656Dib dib = (C46656Dib) this.A01;
                r1 = dib.A0o;
                r0 = dib.A0n;
                break;
            case 2:
                H15 h15 = (H15) this.A01;
                h15.A08.A01(h15.A07, r6);
                UserSession userSession = h15.A05;
                String moduleName = h15.getModuleName();
                SavedCollection savedCollection = h15.A0C;
                if (savedCollection != null) {
                    str = I35.A01(savedCollection.A01(h15.A05));
                } else {
                    str = null;
                }
                0qQ.A0B(userSession, 0);
                I34.A01(userSession, AnonymousClass05K.A0N, moduleName, (String) null, str);
                return;
            default:
                0qQ.A0B(r6, 0);
                ESS ess = (ESS) this.A01;
                r1 = ess.A01;
                if (r1 != null) {
                    r0 = ess.A00;
                    break;
                } else {
                    return;
                }
        }
        r1.A01(r0, r6);
    }
}
