package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GcG  reason: case insensitive filesystem */
public final class C52763GcG implements C233402vf {
    public int A00 = -1;
    public C251373n0 A01;
    public final HDB A02;
    public final HashSet A03 = AnonymousClass7TE.A1F();
    public final Set A04 = AnonymousClass7TE.A1F();
    public final int A05;
    public final UserSession A06;
    public final 1Xj A07;

    public final float AuH() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int Bdr() {
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r5.A07.CcK() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer CNL(X.C251373n0 r6, X.1PW r7, int r8) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            int r0 = r5.A05
            if (r8 != r0) goto L_0x0011
            X.1Xj r0 = r5.A07
            boolean r0 = r0.CcK()
            r4 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0011:
            r4 = 0
            if (r8 < 0) goto L_0x0020
            X.HDB r0 = r5.A02
            java.util.List r0 = r0.BQW()
            int r0 = r0.size()
            if (r8 <= r0) goto L_0x0023
        L_0x0020:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            return r0
        L_0x0023:
            com.instagram.common.session.UserSession r3 = r5.A06
            boolean r0 = X.C233832wY.A01(r3)
            if (r0 == 0) goto L_0x003b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319772463406703(0x8108a400011e6f, double:3.0321085816188736E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            return r0
        L_0x003b:
            java.util.HashSet r3 = r5.A03
            java.lang.Object r1 = r6.BTb()
            r2 = r1
            X.3OA r2 = (X.AnonymousClass3OA) r2
            java.lang.String r0 = r2.A0S
            r3.add(r0)
            int r0 = r5.A00
            if (r0 >= r8) goto L_0x004e
            r0 = r8
        L_0x004e:
            r5.A00 = r0
            r5.A01 = r6
            java.util.Set r0 = r5.A04
            r0.add(r1)
            if (r4 != 0) goto L_0x0068
            X.HDB r1 = r5.A02
            X.1Xj r0 = r2.A0K
            X.1Xj[] r0 = new X.1Xj[]{r0}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            r1.A0C(r0, r8)
        L_0x0068:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52763GcG.CNL(X.3n0, X.1PW, int):java.lang.Integer");
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
        throw AnonymousClass7TE.A1B("Ad Pod is not supported for Search Ads.");
    }

    public final /* bridge */ /* synthetic */ Object BTe(int i) {
        HDB hdb = this.A02;
        if (hdb.BQW().size() > i) {
            for (Object next : this.A04) {
                if (0qQ.A0K(((AnonymousClass3OA) next).A0K, hdb.BQW().get(i))) {
                    return next;
                }
            }
        }
        return null;
    }

    public final List BYj() {
        List<1Xj> BQW = this.A02.BQW();
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
        List BQW = this.A02.BQW();
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
        throw AnonymousClass7TE.A1B("HP Push-Up is not supported for IAA.");
    }

    public C52763GcG(UserSession userSession, 1Xj r3, HDB hdb, int i) {
        this.A06 = userSession;
        this.A02 = hdb;
        this.A05 = i;
        this.A07 = r3;
    }

    public final int Bdq() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ boolean CVS(Object obj) {
        return this.A03.contains(C51969G9p.A0m(obj).A0S);
    }

    public final /* bridge */ /* synthetic */ boolean FIZ(Object obj, String str, Map map) {
        return false;
    }
}
