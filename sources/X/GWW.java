package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class GWW extends GX4 implements XBt {
    public final UserSession A00;
    public final GWV A01;
    public final C231802sQ A02;
    public final C3253572b A03;
    public final C229122ms A04;
    public final Map A05 = AnonymousClass7TE.A1H();
    public final JO6 A06;

    public GWW(UserSession userSession, JO6 jo6, C231802sQ r4, C3253572b r5, C229122ms r6, 0sP r7) {
        AnonymousClass7TG.A0w(1, userSession, jo6, r6);
        this.A00 = userSession;
        this.A02 = r4;
        this.A06 = jo6;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = new GWV(r7, userSession);
    }

    public final void A07(String str, List list) {
        Long A0n;
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        for (Object next : list) {
            Class<?> cls = null;
            if (!(next instanceof C297005r0)) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(AnonymousClass000.A00(484));
                if (next != null) {
                    cls = next.getClass();
                }
                throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(cls, A1A));
            }
            for (C296935qt r7 : ((C297005r0) next).A02) {
                if (!(str == null || (A0n = 00y.A0n(10, str)) == null || !(r7 instanceof C296975qx))) {
                    C296975qx r72 = (C296975qx) r7;
                    if (r72.BaJ() == -1) {
                        r72.EfJ(A0n.longValue());
                    }
                }
            }
            A0q.add(next);
        }
        ArrayList A062 = this.A01.A06(this.A02, A0q);
        if (DbT.A1b(A062)) {
            this.A06.DBB(A062, str);
        }
        A04();
    }

    public final void Eab(AnonymousClass07Z r3, C66626MZn mZn) {
        0qQ.A0B(mZn, 0);
        this.A00.add(new GX5(this, mZn));
    }

    public final void A05() {
        GWV gwv = this.A01;
        gwv.A03.clear();
        gwv.A05.clear();
        GWV.A00(gwv);
        this.A05.clear();
        A04();
    }

    public final void A06(String str, Object obj, int i) {
        if (obj instanceof C297005r0) {
            GWV gwv = this.A01;
            C297005r0 r6 = (C297005r0) obj;
            C231802sQ r0 = this.A02;
            AnonymousClass7TG.A1O(r6, r0);
            ArrayList A1C = AnonymousClass7TE.A1C();
            LinkedHashSet A0y = DbS.A0y();
            if (GWV.A02(gwv, r6, r0, A0y, i)) {
                gwv.A03.add(i, r6);
                gwv.A05.addAll(A0y);
            } else {
                GWV.A01(r6, A1C);
            }
            GWV.A00(gwv);
            if (DbT.A1b(A1C)) {
                this.A06.DBB(A1C, str);
            }
            A04();
            return;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(AnonymousClass000.A00(484));
        throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(obj.getClass(), A1A));
    }

    public final /* bridge */ /* synthetic */ C296995qz B9n(C232262tL r2) {
        C296935qt r22 = (C296935qt) r2;
        0qQ.A0B(r22, 0);
        return this.A01.A03(r22);
    }

    public final /* bridge */ /* synthetic */ C296995qz B9o(Object obj) {
        C296935qt r2 = (C296935qt) obj;
        0qQ.A0B(r2, 0);
        return this.A01.A03(r2);
    }
}
