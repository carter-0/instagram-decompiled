package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class HDB extends C231262rJ implements C231272rL, C231282rM, C231302rO, C231322rQ {
    public final /* synthetic */ void A8l(Object obj, int i) {
    }

    public final 1Xg A01(int i) {
        boolean z = this instanceof GAP;
        AnonymousClass2rW r1 = (AnonymousClass2rW) this.A00;
        int A03 = C51966G9m.A03(r1);
        if (z) {
            if (i < A03) {
                return 1Xi.A01((1Xj) r1.A01.get(i));
            }
            return null;
        } else if (i < A03) {
            return (1Xg) r1.A01.get(i);
        } else {
            return null;
        }
    }

    public final AnonymousClass2u0 A02() {
        if (this instanceof GAP) {
            return (AnonymousClass2u0) ((GAP) this).A0E.getValue();
        }
        return ((C52766GcJ) this).A07;
    }

    public final List A03() {
        if (this instanceof C52766GcJ) {
            return C51966G9m.A1J(((AnonymousClass2rW) this.A00).A01);
        }
        return 1Xg.A0A.A06(A04());
    }

    public final List A04() {
        if (!(this instanceof GAP)) {
            return 1Xi.A03(A03());
        }
        GAP gap = (GAP) this;
        if (gap.A0G) {
            if (!182.A06(0Tu.A05, gap.A05, 36330355262767694L)) {
                List distinctItems = gap.getDistinctItems(1Xj.class);
                0qQ.A0A(distinctItems);
                return distinctItems;
            }
        }
        return ((AnonymousClass2rW) gap.A00).A01;
    }

    public final void A05() {
        if (this instanceof GAP) {
            GAP gap = (GAP) this;
            ((AnonymousClass2rW) gap.A00).A04();
            GAP.A00(gap);
            return;
        }
        C52766GcJ gcJ = (C52766GcJ) this;
        ((AnonymousClass2rW) gcJ.A00).A04();
        C52766GcJ.A00(gcJ);
    }

    public final void A06() {
        if (this instanceof GAP) {
            ((GAP) this).A00 = true;
        } else {
            ((C52766GcJ) this).A02 = true;
        }
    }

    public final void A07(0xF r3) {
        AnonymousClass2s3 r0;
        if (this instanceof GAP) {
            GAP gap = (GAP) this;
            GTP gtp = (GTP) gap.A0F.getValue();
            if (gtp != null) {
                C252643pR r02 = gtp.A02;
                if (r02 == null) {
                    0qQ.A0F("mediaHeaderViewBinder");
                    throw AnonymousClass00P.createAndThrow();
                }
                r02.A00 = r3;
            }
            r0 = gap.A06;
        } else {
            r0 = ((C52766GcJ) this).A06;
        }
        if (r0 != null) {
            r0.A07(r3);
        }
    }

    public final void A08(C54620HLd hLd) {
        if (!(this instanceof GAP)) {
            ((C52766GcJ) this).A01 = hLd;
        }
    }

    public final void A09(User user) {
        User user2;
        if (this instanceof GAP) {
            GAP gap = (GAP) this;
            AnonymousClass2rW r6 = (AnonymousClass2rW) gap.A00;
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator A1G = AnonymousClass7TE.A1G(r6.A02);
            while (A1G.hasNext()) {
                Object next = A1G.next();
                1Xj r2 = (1Xj) next;
                0qQ.A0B(r2, 0);
                C51970G9q.A1Q(next, A1C2, A1C, C51966G9m.A1a(user.getId(), C51973G9u.A0j(gap.A05, r2)) ? 1 : 0);
            }
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                r6.A0C(it.next());
            }
            C51975G9x.A1C(r6, A1C2);
            GAP.A00(gap);
            return;
        }
        C52766GcJ gcJ = (C52766GcJ) this;
        AnonymousClass2rW r5 = (AnonymousClass2rW) gcJ.A00;
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        Iterator A1G2 = AnonymousClass7TE.A1G(r5.A02);
        while (A1G2.hasNext()) {
            Object next2 = A1G2.next();
            1Xg r0 = (1Xg) next2;
            0qQ.A0B(r0, 0);
            AnonymousClass1Xn r22 = r0.A05;
            1Xj A02 = 1Xi.A02(r22);
            if (A02 != null) {
                user2 = A02.A2A(gcJ.A05);
            } else {
                user2 = null;
            }
            if (!(r22 instanceof 1Xl) || user2 == null || !DbV.A1Z(user2, user.getId())) {
                A1C4.add(next2);
            } else {
                A1C3.add(next2);
            }
        }
        Iterator it2 = A1C3.iterator();
        while (it2.hasNext()) {
            r5.A0C(it2.next());
        }
        C51975G9x.A1C(r5, A1C4);
        C52766GcJ.A00(gcJ);
    }

    public final void A0A(String str) {
        Hashtag B6n;
        String str2;
        if (this instanceof GAP) {
            GAP gap = (GAP) this;
            AnonymousClass2rW r3 = (AnonymousClass2rW) gap.A00;
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator A1G = AnonymousClass7TE.A1G(r3.A02);
            while (A1G.hasNext()) {
                Object next = A1G.next();
                1Xj r0 = (1Xj) next;
                0qQ.A0B(r0, 0);
                Hashtag B6n2 = r0.A0C.B6n();
                if (B6n2 != null) {
                    str2 = B6n2.getId();
                } else {
                    str2 = null;
                }
                C51970G9q.A1Q(next, A1C2, A1C, str.equals(str2) ^ true ? 1 : 0);
            }
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                r3.A0C(it.next());
            }
            C51975G9x.A1C(r3, A1C2);
            GAP.A00(gap);
            return;
        }
        C52766GcJ gcJ = (C52766GcJ) this;
        AnonymousClass2rW r32 = (AnonymousClass2rW) gcJ.A00;
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        Iterator A1G2 = AnonymousClass7TE.A1G(r32.A02);
        while (A1G2.hasNext()) {
            Object next2 = A1G2.next();
            1Xg r02 = (1Xg) next2;
            0qQ.A0B(r02, 0);
            AnonymousClass1Xn r8 = r02.A05;
            if (r8 instanceof 1Xl) {
                1Xj A02 = 1Xi.A02(r8);
                String str3 = null;
                if (!(A02 == null || A02.A0C.B6n() == null)) {
                    1Xj A022 = 1Xi.A02(r8);
                    if (!(A022 == null || (B6n = A022.A0C.B6n()) == null)) {
                        str3 = B6n.getId();
                    }
                    if (str.equals(str3)) {
                        A1C3.add(next2);
                    }
                }
            }
            A1C4.add(next2);
        }
        Iterator it2 = A1C3.iterator();
        while (it2.hasNext()) {
            r32.A0C(it2.next());
        }
        C51975G9x.A1C(r32, A1C4);
        C52766GcJ.A00(gcJ);
    }

    public final void A0B(List list) {
        if (this instanceof GAP) {
            GAP gap = (GAP) this;
            ((AnonymousClass2rW) gap.A00).A0A(list);
            GAP.A00(gap);
            return;
        }
        C52766GcJ gcJ = (C52766GcJ) this;
        ((AnonymousClass2rW) gcJ.A00).A0A(1Xg.A0A.A06(list));
        C52766GcJ.A00(gcJ);
    }

    public final void A0C(List list, int i) {
        if (this instanceof GAP) {
            GAP gap = (GAP) this;
            AnonymousClass2rW r3 = (AnonymousClass2rW) gap.A00;
            for (Object A01 : list) {
                AnonymousClass2rW.A01(r3, A01, i, true);
            }
            GAP.A00(gap);
            return;
        }
        C52766GcJ gcJ = (C52766GcJ) this;
        AnonymousClass2rW r32 = (AnonymousClass2rW) gcJ.A00;
        for (Object A012 : 1Xg.A0A.A06(list)) {
            AnonymousClass2rW.A01(r32, A012, i, true);
        }
        C52766GcJ.A00(gcJ);
    }

    public final void A0D(boolean z) {
        if (this instanceof GAP) {
            ((GAP) this).A01 = z;
        } else {
            ((C52766GcJ) this).A03 = z;
        }
    }

    public final boolean A0E(1Xj r3) {
        boolean z = this instanceof GAP;
        AnonymousClass2rX r0 = this.A00;
        if (z) {
            return ((AnonymousClass2rW) r0).A0B(r3);
        }
        return ((AnonymousClass2rV) r0).A0E(r3);
    }

    public final boolean AJe(String str) {
        if (this instanceof GAP) {
            GAP gap = (GAP) this;
            0qQ.A0B(str, 0);
            UserSession userSession = gap.A05;
            0qQ.A0B(userSession, 0);
            List list = ((AnonymousClass2rW) gap.A00).A01;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (0qQ.A0K(C51973G9u.A0j(userSession, C51966G9m.A0t(it)), str)) {
                        return true;
                    }
                }
            }
            return false;
        }
        C52766GcJ gcJ = (C52766GcJ) this;
        0qQ.A0B(str, 0);
        UserSession userSession2 = gcJ.A05;
        Iterator it2 = ((AnonymousClass2rV) gcJ.A00).A01.iterator();
        while (it2.hasNext()) {
            User A2A = C51966G9m.A0t(it2).A2A(userSession2);
            A2A.getClass();
            if (A2A.getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void FK4() {
        if (this instanceof GAP) {
            GAP.A00((GAP) this);
        } else {
            C52766GcJ.A00((C52766GcJ) this);
        }
    }

    public final /* synthetic */ List CBH() {
        return AnonymousClass7TE.A1C();
    }

    public final /* synthetic */ int BJU(String str) {
        return -1;
    }

    public final /* synthetic */ Object EDl(int i) {
        return null;
    }
}
