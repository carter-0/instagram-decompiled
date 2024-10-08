package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class HAI extends GX4 implements XBt {
    public C16672Uz8 A00;
    public final C17797VgA A01 = new C17797VgA();
    public final C3253572b A02;
    public final C229122ms A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final Map A05 = AnonymousClass7TE.A1E();
    public final Map A06 = AnonymousClass7TE.A1E();
    public final JO7 A07;
    public final C231802sQ A08 = new ITC(this);
    public final Map A09;

    public static GWV A00(C16672Uz8 uz8, HAI hai) {
        GWV gwv = (GWV) hai.A09.get(uz8);
        if (gwv != null) {
            return gwv;
        }
        throw C51973G9u.A0g(uz8, "Unsupported DiscoveryTabType: ", AnonymousClass7TE.A1A());
    }

    public static void A02(HAI hai, List list) {
        C16672Uz8 uz8 = hai.A00;
        for (Object next : hai.A04) {
            if (!(next instanceof C232262tL)) {
                if (next instanceof C298695ts) {
                    next = new C19280WSo(hai.A01, uz8);
                }
            }
            list.add(next);
        }
    }

    public final void A07(C16672Uz8 uz8, boolean z) {
        if (this.A00 != uz8) {
            this.A00 = uz8;
            if (z) {
                this.A07.DqJ(uz8);
            }
            A04();
        }
    }

    public final void A08(List list) {
        List list2 = this.A04;
        list2.clear();
        for (Object next : list) {
            boolean z = next instanceof C232262tL;
            C298695ts r3 = next;
            if (!z) {
                if (next instanceof C297005r0) {
                    list2.addAll(((C297005r0) next).A02);
                } else if (next instanceof C298695ts) {
                    C298695ts r32 = (C298695ts) next;
                    C17797VgA vgA = this.A01;
                    List list3 = r32.A02;
                    0qQ.A0B(list3, 0);
                    List list4 = vgA.A01;
                    list4.clear();
                    list4.addAll(list3);
                    r3 = r32;
                }
            }
            list2.add(r3);
        }
        A04();
    }

    public final boolean A09(UserSession userSession, String str) {
        User A2A;
        for (C296935qt r1 : A00(this.A00, this).A02) {
            if ((r1 instanceof C296965qw) && (A2A = ((C296965qw) r1).BPf().A2A(userSession)) != null && A2A.getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ C296995qz B9n(C232262tL r2) {
        return A00(this.A00, this).A03((C296935qt) r2);
    }

    public final /* bridge */ /* synthetic */ C296995qz B9o(Object obj) {
        return A00(this.A00, this).A03((C296935qt) obj);
    }

    public final void Eab(AnonymousClass07Z r3, C66626MZn mZn) {
        this.A00.add(new IRK(this, mZn));
    }

    public HAI(C16672Uz8 uz8, JO7 jo7, C3253572b r4, C229122ms r5, Map map) {
        this.A09 = map;
        this.A00 = uz8;
        this.A03 = r5;
        this.A02 = r4;
        this.A07 = jo7;
    }

    public static HAI A01(UserSession userSession, C16672Uz8 uz8, JO7 jo7, C3253572b r9, C229122ms r10, List list) {
        HashMap A1E = AnonymousClass7TE.A1E();
        for (Object next : list) {
            0qQ.A0B(userSession, 1);
            A1E.put(next, new GWV(J39.A00, userSession));
        }
        return new HAI(uz8, jo7, r9, r10, A1E);
    }

    public final void A05(C16672Uz8 uz8) {
        GWV A002 = A00(uz8, this);
        A002.A03.clear();
        A002.A05.clear();
        GWV.A00(A002);
        A04();
    }

    public final void A06(C16672Uz8 uz8, List list) {
        GWV A002 = A00(uz8, this);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (next instanceof C297005r0) {
                A1C.add(next);
            } else {
                throw DbW.A0c(AnonymousClass000.A00(484), next.getClass().toString());
            }
        }
        A002.A06(this.A08, A1C);
        A04();
    }
}
