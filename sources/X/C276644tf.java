package X;

import java.util.ArrayList;

/* renamed from: X.4tf  reason: invalid class name and case insensitive filesystem */
public final class C276644tf implements C276634te {
    public final C276484tP A00;
    public final C276634te A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C377179Kv(this, 5));

    public final S5V AgN() {
        ArrayList arrayList = new ArrayList();
        C276634te r5 = this.A01;
        String C9p = r5.C9p();
        AnonymousClass0eM r1 = this.A02;
        C39702A5s a5s = (C39702A5s) r1.getValue();
        String str = null;
        if (a5s != null) {
            arrayList.addAll(a5s.A02);
        }
        if (!(C9p == null || C9p.length() == 0)) {
            arrayList.add(C9p);
        }
        C39702A5s a5s2 = (C39702A5s) r1.getValue();
        if (a5s2 != null) {
            str = a5s2.A01;
        }
        return new S5V(r5.BaS(), 002.A0T(str, 00k.A0P(":", "", "", arrayList, (0sP) null), '|'));
    }

    public final String BOB() {
        String str;
        C39702A5s a5s = (C39702A5s) this.A02.getValue();
        if (a5s != null && (str = a5s.A00) != null) {
            return str;
        }
        C276634te BaS = this.A01.BaS();
        if (BaS != null) {
            return BaS.BOB();
        }
        return null;
    }

    public final C276634te BaS() {
        return this.A01.BaS();
    }

    public final String C9p() {
        return this.A01.C9p();
    }

    public final C276634te ClQ(C276634te r4) {
        return new C276644tf(this.A00, this.A01.ClQ(r4));
    }

    public C276644tf(C276484tP r3, C276634te r4) {
        this.A01 = r4;
        this.A00 = r3;
    }
}
