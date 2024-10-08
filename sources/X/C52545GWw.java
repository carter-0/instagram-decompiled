package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.GWw  reason: case insensitive filesystem */
public final class C52545GWw implements C233402vf {
    public C251373n0 A00;
    public final GWW A01;
    public final UserSession A02;
    public final GT0 A03;

    public final float AuH() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int Bdr() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer CNL(C251373n0 r10, 1PW r11, int i) {
        Integer num;
        Number A14;
        AnonymousClass7TF.A1B(r10, 0, r11);
        C376509Ig r3 = (C376509Ig) r10.BTb();
        UserSession userSession = this.A02;
        Object A05 = C296885qo.A05(userSession, (C295795ov) null, (C295745oq) r3.A02, true);
        C233472vm r0 = (C233472vm) r3.A04;
        if (r0 != null) {
            int A09 = r0.A09();
            num = Integer.valueOf(A09);
            if (num != null && A09 >= 0) {
                GWW gww = this.A01;
                if (A09 <= gww.A01.A03.size()) {
                    if (A05 == null) {
                        return AnonymousClass05K.A1F;
                    }
                    if (C233832wY.A01(userSession) && 182.A06(0Tu.A05, userSession, 36319772463603314L)) {
                        return AnonymousClass05K.A03;
                    }
                    String str = this.A03.A05;
                    if (str == null) {
                        str = "";
                    }
                    gww.A06(str, A05, A09);
                    this.A00 = r10;
                    return AnonymousClass05K.A00;
                }
            }
        } else {
            num = null;
        }
        long A012 = 182.A01(0Tu.A05, userSession, 36597377675365157L);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Attempted to inject an ad section out of bounds at target position: ");
        A1A.append(num);
        A1A.append(", current grid section size is ");
        GWW gww2 = this.A01;
        A1A.append(gww2.A01.A03.size());
        0wb.A04("explore_grid_acp", A1A.toString(), (int) A012);
        String str2 = this.A03.A05;
        if (str2 == null) {
            str2 = "";
        }
        Long A0n = C51971G9r.A0n(0, str2);
        if (A0n == null || (A14 = C51966G9m.A14(A0n, gww2.A05)) == null || A14.intValue() <= 0) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A01;
    }

    public final void Dpi() {
        this.A00 = null;
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
        throw AnonymousClass7TE.A1B("Ad Pod is not supported for Explore Grid Ads.");
    }

    public final /* bridge */ /* synthetic */ boolean CVS(Object obj) {
        C376509Ig r4 = (C376509Ig) obj;
        0qQ.A0B(r4, 0);
        GWW gww = this.A01;
        1Xj A002 = ((C295745oq) r4.A02).A00();
        if (A002 == null || gww.A01.A04(A002) == null) {
            return false;
        }
        return true;
    }

    public final C251373n0 Coa() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ void E5F(Object obj) {
        throw AnonymousClass7TE.A1B("HP Push-Up is not supported for Explore Grid Ads");
    }

    public C52545GWw(UserSession userSession, GWW gww, GT0 gt0) {
        this.A01 = gww;
        this.A03 = gt0;
        this.A02 = userSession;
    }

    public final List BYj() {
        List emptyList = Collections.emptyList();
        0qQ.A07(emptyList);
        return emptyList;
    }

    public final List BYp() {
        List emptyList = Collections.emptyList();
        0qQ.A07(emptyList);
        return emptyList;
    }

    public final int Bdq() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ Object BTe(int i) {
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean FIZ(Object obj, String str, Map map) {
        return false;
    }
}
