package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.K1h  reason: case insensitive filesystem */
public final class C61294K1h extends 1XP implements C336537em {
    public C317866ny A00;
    public Boolean A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;

    public final List A00() {
        C318046oG r0;
        List list = this.A08;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C317966o8 A0a = JTO.A0a(it);
            C317876nz r02 = C317876nz.A1e;
            String str = A0a.A0S;
            0qQ.A07(str);
            C317866ny r1 = this.A00;
            if (!(r1 == C317866ny.DIRECT || r1 == C317866ny.COMMENTS)) {
                A0a.A0S = A0a.A0a;
                A0a.A0Z = this.A07;
            }
            List A1I = AnonymousClass7TE.A1I(A0a);
            if (A0a.A04() == AnonymousClass05K.A0N) {
                r0 = C318046oG.AVATAR_ANIMATED;
            } else {
                r0 = C318046oG.AVATAR_STATIC;
            }
            C317876nz r2 = new C317876nz(r0, str, A1I);
            List A16 = JTR.A16(A0a.A0j);
            0qQ.A0B(A16, 0);
            r2.A0P = A16;
            A0r.add(r2);
        }
        return A0r;
    }

    public final Object B3J() {
        return null;
    }

    public final String BjE() {
        return null;
    }

    public final Integer BlQ() {
        return null;
    }

    public final String BnF() {
        return null;
    }

    public final List Bqo() {
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CKA() {
        return false;
    }

    public final String getNextMaxId() {
        return null;
    }

    public final List getItems() {
        return A00();
    }
}
