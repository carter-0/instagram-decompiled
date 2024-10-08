package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class IYB implements C233402vf {
    public int A00 = -1;
    public C251373n0 A01;
    public final UserSession A02;
    public final HashSet A03 = AnonymousClass7TE.A1F();
    public final Map A04 = AnonymousClass7TE.A1E();
    public final C229352nF A05;
    public final GD6 A06;
    public final C54575HJk A07;
    public final String A08;

    public final float AuH() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int Bdr() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer CNL(C251373n0 r8, 1PW r9, int i) {
        AnonymousClass7TF.A1B(r8, 0, r9);
        Object BTb = r8.BTb();
        C267324bN r5 = (C267324bN) ((C376489Ie) BTb).A03;
        if (i < 0 || i > this.A07.A0A()) {
            return AnonymousClass05K.A0j;
        }
        if (r9.A02 >= i) {
            return AnonymousClass05K.A0u;
        }
        if (!0qQ.A0K(r5.A06().A0c, this.A08)) {
            return AnonymousClass05K.A02;
        }
        UserSession userSession = this.A02;
        boolean CcK = r5.CcK();
        if (C233832wY.A01(userSession) && CcK && 182.A06(0Tu.A05, userSession, 36319772464455293L)) {
            return AnonymousClass05K.A03;
        }
        this.A06.A08(r5, (String) null, i, false);
        this.A03.add(C51966G9m.A1B(r5));
        int i2 = this.A00;
        if (i2 < i) {
            i2 = i;
        }
        this.A00 = i2;
        this.A04.put(Integer.valueOf(i), BTb);
        this.A01 = r8;
        return AnonymousClass05K.A00;
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
        if (!182.A06(0Tu.A05, this.A02, 36320730241245989L)) {
            throw AnonymousClass7TE.A1B("Ad Pod is not supported for Profile Reels Ads");
        }
    }

    public final /* bridge */ /* synthetic */ Object BTe(int i) {
        return C51968G9o.A10(this.A04, i);
    }

    public final List BYj() {
        List A0I = this.A07.A0I();
        ArrayList A0r = AnonymousClass7TG.A0r(A0I);
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            A0r.add(C51971G9r.A0u(it));
        }
        return A0r;
    }

    public final List BYp() {
        List A0K = this.A07.A0K(C295365o2.ORGANIC);
        ArrayList A0r = AnonymousClass7TG.A0r(A0K);
        Iterator it = A0K.iterator();
        while (it.hasNext()) {
            A0r.add(C51971G9r.A0u(it));
        }
        return A0r;
    }

    public final C251373n0 Coa() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ void E5F(Object obj) {
        throw AnonymousClass7TE.A1B("HP Push-Up is not supported for Profile Reels Ads");
    }

    public IYB(C229352nF r2, UserSession userSession, GD6 gd6, C54575HJk hJk, String str) {
        this.A02 = userSession;
        this.A06 = gd6;
        this.A07 = hJk;
        this.A05 = r2;
        this.A08 = str;
    }

    public final int Bdq() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ boolean CVS(Object obj) {
        C267324bN A0Y = C51972G9s.A0Y(obj);
        if (!GDZ.A00(A0Y)) {
            return false;
        }
        A0Y.A06();
        return this.A03.contains(C51966G9m.A1B(A0Y));
    }

    public final /* bridge */ /* synthetic */ boolean FIZ(Object obj, String str, Map map) {
        return false;
    }
}
