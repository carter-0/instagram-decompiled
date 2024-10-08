package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class IY7 implements C233402vf {
    public C251373n0 A00;
    public final C15940UlA A01;
    public final UserSession A02;

    public final float AuH() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int Bdr() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer CNL(C251373n0 r11, 1PW r12, int i) {
        Integer num;
        int intValue;
        0qQ.A0B(r11, 0);
        Object BTb = r11.BTb();
        C376509Ig r8 = (C376509Ig) BTb;
        UserSession userSession = this.A02;
        Object A05 = C296885qo.A05(userSession, (C295795ov) null, (C295745oq) r8.A02, true);
        C233472vm r0 = (C233472vm) r8.A04;
        if (r0 != null) {
            num = Integer.valueOf(r0.A09());
        } else {
            num = null;
        }
        if (num != null && (intValue = num.intValue()) >= 0) {
            C15940UlA ulA = this.A01;
            if (intValue <= ulA.A05()) {
                Number number = (Number) r8.A03;
                if (number == null) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("page index is null, model type: ");
                    0wb.A03("SearchGridAdsSponsoredContentInjector", AnonymousClass7TF.A0i(BTb.getClass(), A1A));
                }
                if (A05 == null) {
                    return AnonymousClass05K.A1F;
                }
                if (C233832wY.A01(userSession) && 182.A06(0Tu.A05, userSession, 36319772463668851L)) {
                    return AnonymousClass05K.A03;
                }
                ulA.A08(intValue, DbX.A02(number), A05);
                this.A00 = r11;
                return AnonymousClass05K.A00;
            }
        }
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        A1A2.append("Attempted to inject an Ad section out of bounds at target position: ");
        A1A2.append(num);
        A1A2.append(", current grid section size is ");
        A1A2.append(this.A01.A05());
        0wb.A03("SearchGridAdsSponsoredContentInjector", A1A2.toString());
        return AnonymousClass05K.A0C;
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
        throw AnonymousClass7TE.A1B("Ad Pod is not supported for Search Grid Ads.");
    }

    public final /* bridge */ /* synthetic */ boolean CVS(Object obj) {
        C376509Ig r3 = (C376509Ig) obj;
        0qQ.A0B(r3, 0);
        return AnonymousClass7TF.A1V(this.A01.A07(((C295745oq) r3.A02).A00()));
    }

    public final C251373n0 Coa() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ void E5F(Object obj) {
        throw AnonymousClass7TE.A1B("HP Push-Up is not supported for Search Grid Ads");
    }

    public IY7(UserSession userSession, C15940UlA ulA) {
        this.A01 = ulA;
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
