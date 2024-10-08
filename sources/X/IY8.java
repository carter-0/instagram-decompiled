package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class IY8 implements C233402vf {
    public int A00 = -1;
    public C251373n0 A01;
    public final HashSet A02 = AnonymousClass7TE.A1F();
    public final UserSession A03;
    public final HDB A04;

    public final float AuH() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int Bdr() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer CNL(C251373n0 r6, 1PW r7, int i) {
        0qQ.A0B(r6, 0);
        if (i >= 0) {
            HDB hdb = this.A04;
            if (i <= hdb.BQW().size()) {
                UserSession userSession = this.A03;
                if (C233832wY.A01(userSession) && 182.A06(0Tu.A05, userSession, 36319772464062073L)) {
                    return AnonymousClass05K.A03;
                }
                HashSet hashSet = this.A02;
                AnonymousClass3OA r1 = (AnonymousClass3OA) r6.BTb();
                hashSet.add(r1.A0S);
                int i2 = this.A00;
                if (i2 < i) {
                    i2 = i;
                }
                this.A00 = i2;
                this.A01 = r6;
                hdb.A0C(0sr.A1M(new 1Xj[]{r1.A0K}), i);
                return AnonymousClass05K.A00;
            }
        }
        return AnonymousClass05K.A0C;
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
        throw AnonymousClass7TE.A1B("Ad Pod is not supported for for IAA.");
    }

    public final List BYj() {
        List BQW = this.A04.BQW();
        0qQ.A07(BQW);
        ArrayList A0r = AnonymousClass7TG.A0r(BQW);
        Iterator it = BQW.iterator();
        while (it.hasNext()) {
            String A0v = C51971G9r.A0v(it);
            if (A0v != null) {
                A0r.add(A0v);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return 00k.A0U(A0r);
    }

    public final List BYp() {
        List BQW = this.A04.BQW();
        ArrayList A15 = DbV.A15(BQW);
        for (Object next : BQW) {
            DbV.A1U(next, A15, C51966G9m.A1Y(next) ? 1 : 0);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A15);
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            String A0v = C51971G9r.A0v(it);
            if (A0v != null) {
                A0r.add(A0v);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return 00k.A0U(A0r);
    }

    public final C251373n0 Coa() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ void E5F(Object obj) {
        throw AnonymousClass7TE.A1B("HP Push-Up is not supported for IAA.");
    }

    public IY8(UserSession userSession, HDB hdb) {
        this.A03 = userSession;
        this.A04 = hdb;
    }

    public final int Bdq() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ boolean CVS(Object obj) {
        return this.A02.contains(C51969G9p.A0m(obj).A0S);
    }

    public final /* bridge */ /* synthetic */ Object BTe(int i) {
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean FIZ(Object obj, String str, Map map) {
        return false;
    }
}
