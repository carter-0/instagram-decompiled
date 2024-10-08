package X;

import java.util.List;

/* renamed from: X.4td  reason: invalid class name and case insensitive filesystem */
public final class C276624td implements C276634te {
    public final C276634te A00;
    public final List A01;

    public final S5V AgN() {
        S5V AgN;
        String str;
        C276634te r0 = this.A00;
        if (r0 == null || (AgN = r0.AgN()) == null) {
            return null;
        }
        String C9p = C9p();
        if (C9p == null || C9p.length() == 0) {
            str = AgN.A01;
        } else {
            str = 002.A0T(AgN.A01, C9p, ':');
        }
        return new S5V(AgN.A00, str);
    }

    public final String BOB() {
        C276634te r0 = this.A00;
        if (r0 != null) {
            return r0.BOB();
        }
        return null;
    }

    public final C276634te BaS() {
        return this.A00;
    }

    public final String C9p() {
        List list = this.A01;
        if (list != null) {
            return 00k.A0P(":", "", "", list, (0sP) null);
        }
        return null;
    }

    public final C276634te ClQ(C276634te r3) {
        return new C276624td(r3, this.A01);
    }

    public C276624td(C276634te r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }
}
