package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GUj  reason: case insensitive filesystem */
public final class C52481GUj implements C233402vf {
    public int A00 = -1;
    public C251373n0 A01;
    public final UserSession A02;
    public final HDB A03;
    public final HashSet A04 = AnonymousClass7TE.A1F();
    public final Set A05 = AnonymousClass7TE.A1F();
    public final String A06;

    public C52481GUj(UserSession userSession, HDB hdb, String str) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = hdb;
        this.A06 = str;
    }

    public final float AuH() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int Bdr() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer CNL(C251373n0 r8, 1PW r9, int i) {
        0qQ.A0B(r8, 0);
        if (i >= 0) {
            HDB hdb = this.A03;
            if (i <= hdb.BQW().size()) {
                Object BTb = r8.BTb();
                AnonymousClass3OA r5 = (AnonymousClass3OA) BTb;
                if (!0qQ.A0K(r5.A0c, this.A06)) {
                    return AnonymousClass05K.A1I;
                }
                UserSession userSession = this.A02;
                if (C233832wY.A01(userSession) && 182.A06(0Tu.A05, userSession, 36319772463734388L)) {
                    return AnonymousClass05K.A03;
                }
                this.A04.add(r5.A0S);
                int i2 = this.A00;
                if (i2 < i) {
                    i2 = i;
                }
                this.A00 = i2;
                this.A01 = r8;
                this.A05.add(BTb);
                hdb.A0C(0sr.A1M(new 1Xj[]{r5.A0K}), i);
                return AnonymousClass05K.A00;
            }
        }
        return AnonymousClass05K.A0j;
    }

    public final void Dpi() {
    }

    public final void E5G(String str, List list, int i, int i2, int i3, int i4) {
    }

    public final C251373n0 FIa() {
        return null;
    }

    public final List AGf() {
        return 0sn.A00;
    }

    public final /* bridge */ /* synthetic */ void AHP(Object obj) {
        if (!182.A06(0Tu.A05, this.A02, 36315829686111826L)) {
            throw AnonymousClass7TE.A1B("Ad Pod is not supported for Profile Ads.");
        }
    }

    public final /* bridge */ /* synthetic */ Object BTe(int i) {
        HDB hdb = this.A03;
        if (hdb.BQW().size() > i) {
            for (Object next : this.A05) {
                if (0qQ.A0K(((AnonymousClass3OA) next).A0K, hdb.BQW().get(i))) {
                    return next;
                }
            }
        }
        return null;
    }

    public final List BYj() {
        List<1Xj> BQW = this.A03.BQW();
        ArrayList A15 = DbV.A15(BQW);
        for (1Xj id : BQW) {
            String id2 = id.getId();
            if (id2 != null) {
                A15.add(id2);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return A15;
    }

    public final List BYp() {
        List BQW = this.A03.BQW();
        ArrayList A15 = DbV.A15(BQW);
        for (Object next : BQW) {
            DbV.A1U(next, A15, C51966G9m.A1Y(next) ? 1 : 0);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            String A0v = C51971G9r.A0v(it);
            if (A0v != null) {
                A1C.add(A0v);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return A1C;
    }

    public final C251373n0 Coa() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ void E5F(Object obj) {
        GV8 gv8 = (GV8) obj;
        0qQ.A0B(gv8, 0);
        if (182.A06(0Tu.A05, this.A02, 36315829686505045L)) {
            C233472vm r0 = gv8.A00;
            if (r0 != null) {
                r0.A0C(false);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A1B("HP Push-Up is not supported for Profile Feed Ads");
    }

    public final int Bdq() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ boolean CVS(Object obj) {
        return this.A04.contains(C51969G9p.A0m(obj).A0S);
    }

    public final /* bridge */ /* synthetic */ boolean FIZ(Object obj, String str, Map map) {
        return false;
    }
}
