package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public final class H3C extends C270664h6 implements JRF {
    public C55565Hjl A00;
    public int A01;
    public boolean A02;
    public final LinkedHashMap A03 = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final Set A0B = DbS.A0y();
    public final Set A0C = DbS.A0y();
    public final Set A0D = DbS.A0y();

    public H3C(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0eO r2 = 0eO.A02;
        this.A06 = AnonymousClass0eN.A00(r2, new C58674Ivj(userSession, 47));
        this.A0A = AnonymousClass0eN.A00(r2, new C58703IwC(userSession, 1));
        this.A09 = AnonymousClass0eN.A00(r2, new C58703IwC(userSession, 0));
        this.A04 = AnonymousClass0eN.A00(r2, new C58674Ivj(userSession, 45));
        this.A05 = AnonymousClass0eN.A00(r2, new C58674Ivj(userSession, 46));
        this.A08 = AnonymousClass0eN.A00(r2, new C58674Ivj(userSession, 49));
        this.A07 = AnonymousClass0eN.A00(r2, new C58674Ivj(userSession, 48));
    }

    public final void D3r(H3D h3d) {
        0qQ.A0B(h3d, 0);
        this.A02 = false;
    }

    public final void D3s() {
        this.A02 = false;
    }

    public final void D3t(C52228GJt gJt) {
        0qQ.A0B(gJt, 0);
        this.A02 = true;
    }

    public final void D3u(C52263GLe gLe) {
        0qQ.A0B(gLe, 0);
        boolean z = gLe.A0D;
        boolean z2 = gLe.A0F;
        boolean z3 = gLe.A0B;
        if (gLe.A0C) {
            this.A0D.clear();
            this.A0C.clear();
            this.A0B.clear();
            this.A03.clear();
        }
        if (!z && !z2 && !z3) {
            Set set = this.A0B;
            List list = gLe.A09;
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                1Xj A0n = C51968G9o.A0n(it);
                if (A0n != null) {
                    C51971G9r.A1M(A0n, A1C);
                }
            }
            set.addAll(A1C);
        }
    }

    public final void DaS(C267324bN r6, int i, int i2, boolean z) {
        0qQ.A0B(r6, 0);
        if (r6.A01 == C295365o2.ORGANIC) {
            String A1A = G9t.A1A(r6);
            if (00k.A0u(this.A0B, A1A) && A1A != null) {
                LinkedHashMap linkedHashMap = this.A03;
                if (!linkedHashMap.containsKey(A1A)) {
                    linkedHashMap.put(A1A, new C53387GnJ(A1A));
                    int size = linkedHashMap.size();
                    if (size > 1) {
                        Collection values = linkedHashMap.values();
                        0qQ.A07(values);
                        C53387GnJ gnJ = (C53387GnJ) 00k.A0F(values, size - 2);
                        if (gnJ != null && gnJ.A01 < DbX.A07(this.A04)) {
                            A01(this, AnonymousClass05K.A0N, gnJ.A02);
                        }
                    }
                }
                C53387GnJ gnJ2 = (C53387GnJ) linkedHashMap.get(A1A);
                if (gnJ2 != null) {
                    gnJ2.A01 = (int) (((((double) i) / ((double) i2)) + ((double) gnJ2.A00)) * 100.0d);
                }
            }
        }
    }

    public final void DxZ(C267324bN r4, int i, int i2) {
        0qQ.A0B(r4, 0);
        if (r4.A01 == C295365o2.ORGANIC) {
            String A1A = G9t.A1A(r4);
            if (00k.A0u(this.A0B, A1A) && A1A != null) {
                LinkedHashMap linkedHashMap = this.A03;
                Object obj = linkedHashMap.get(A1A);
                if (obj == null) {
                    obj = new C53387GnJ(A1A);
                    linkedHashMap.put(A1A, obj);
                }
                ((C53387GnJ) obj).A00 = i2;
            }
        }
    }

    public static final void A00(H3C h3c) {
        C295365o2 r1;
        C295365o2 r2;
        String str;
        1Xj r0;
        if (h3c.A01 < DbX.A07(h3c.A06)) {
            C55565Hjl hjl = h3c.A00;
            if (hjl != null) {
                int A072 = DbX.A07(h3c.A05);
                Set keySet = h3c.A03.keySet();
                0qQ.A07(keySet);
                GBE gbe = hjl.A00;
                C52012GBj A073 = C52050GCw.A07(gbe);
                int A062 = A073.A06() + A072 + 1;
                int A082 = A073.A08();
                int A0C2 = gbe.A0C();
                while (true) {
                    int i = A062 - 1;
                    C267324bN A0C3 = A073.A0C(i);
                    r1 = null;
                    if (A0C3 != null) {
                        r2 = A0C3.A01;
                    } else {
                        r2 = null;
                    }
                    if (r2 == C295365o2.ORGANIC) {
                        C267324bN A0C4 = A073.A0C(i);
                        if (A0C4 == null || (r0 = A0C4.A02) == null) {
                            str = null;
                        } else {
                            str = r0.getId();
                        }
                        if (!00k.A0u(keySet, str)) {
                            break;
                        }
                    }
                    if (A062 >= A082) {
                        break;
                    }
                    A062++;
                }
                int i2 = A082 - A062;
                C267324bN A042 = C52012GBj.A04(A073);
                if (A042 != null) {
                    r1 = A042.A01;
                }
                if (r1 == C295365o2.GHOST) {
                    i2--;
                }
                if (i2 > A0C2) {
                    List A0J = gbe.A0q.A0J(A062, A082);
                    C52196GIn gIn = gbe.A0E;
                    if (gIn != null) {
                        Iterator it = A0J.iterator();
                        while (it.hasNext()) {
                            1Xj A0n = C51968G9o.A0n(it);
                            if (A0n != null) {
                                gIn.A09.EE4(A0n, gIn.A0A);
                                List list = gIn.A00;
                                if (list != null) {
                                    list.remove(A0n);
                                }
                            }
                        }
                    }
                    ArrayList A0r = AnonymousClass7TG.A0r(A0J);
                    Iterator it2 = A0J.iterator();
                    while (it2.hasNext()) {
                        A0r.add(C51969G9p.A0u(C51968G9o.A0n(it2)));
                    }
                    GBE.A05(gbe, 00k.A0X(A0r), false, true);
                }
            }
            h3c.A01++;
        }
    }

    public static final void A01(H3C h3c, Integer num, String str) {
        String str2;
        if (G9t.A1b(h3c.A09) && !h3c.A02) {
            AnonymousClass0eM r1 = h3c.A07;
            if (!((Set) r1.getValue()).isEmpty()) {
                Set set = (Set) r1.getValue();
                if (3 - num.intValue() != 0) {
                    str2 = "NOT_INTERESTED";
                } else {
                    str2 = "SKIP_SCROLL";
                }
                if (!set.contains(str2)) {
                    return;
                }
            }
            if (str != null && h3c.A0B.contains(str)) {
                Set set2 = h3c.A0C;
                if (!set2.contains(str)) {
                    set2.add(str);
                    11Z.A04(new C57789IgU(h3c), 17);
                }
            }
        }
    }

    public static final void A02(H3C h3c, Integer num, String str) {
        String str2;
        if (G9t.A1b(h3c.A0A) && !h3c.A02) {
            AnonymousClass0eM r1 = h3c.A08;
            if (!((Set) r1.getValue()).isEmpty()) {
                Set set = (Set) r1.getValue();
                switch (num.intValue()) {
                    case 0:
                        str2 = "FOLLOW";
                        break;
                    case 1:
                        str2 = "RESHARE";
                        break;
                    default:
                        str2 = "INTERESTED";
                        break;
                }
                if (!set.contains(str2)) {
                    return;
                }
            }
            if (str != null && h3c.A0B.contains(str)) {
                Set set2 = h3c.A0D;
                if (!set2.contains(str)) {
                    set2.add(str);
                    11Z.A04(new C57790IgV(h3c), 17);
                }
            }
        }
    }

    public final void Dzs() {
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void Dxm(C267324bN r1, Integer num, int i) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
