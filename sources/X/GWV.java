package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class GWV {
    public C52435GSn A00;
    public Integer A01;
    public List A02 = 0sn.A00;
    public List A03 = AnonymousClass7TE.A1C();
    public final Map A04 = AnonymousClass7TE.A1H();
    public final Set A05 = DbS.A0y();
    public final UserSession A06;
    public final Map A07 = AnonymousClass7TE.A1H();
    public final 0sP A08;

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.GWV r12, X.C297005r0 r13, X.C231802sQ r14, java.util.Set r15, int r16) {
        /*
            r6 = 0
            java.util.List r0 = r13.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x0007:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r4 = r3.next()
            X.5qt r4 = (X.C296935qt) r4
            java.lang.String r0 = r4.getKey()
            boolean r0 = r15.add(r0)
            r2 = r0 ^ 1
            java.util.Set r1 = r12.A05
            java.lang.String r0 = r4.getKey()
            boolean r5 = r1.contains(r0)
            if (r5 != 0) goto L_0x0031
            if (r2 != 0) goto L_0x0031
            boolean r0 = r14.Esp(r4)
            if (r0 != 0) goto L_0x0007
        L_0x0031:
            java.lang.String r1 = "FilteredSectionStore"
            if (r5 == 0) goto L_0x0078
            java.lang.String r0 = "Section was dropped because of previous page having duplicate"
        L_0x0037:
            X.0wb.A03(r1, r0)
            com.instagram.common.session.UserSession r3 = r12.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322439638034621(0x810b11000028bd, double:3.033795313593419E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0072
            if (r5 == 0) goto L_0x0073
            java.util.Map r1 = r12.A04
            java.lang.String r0 = r4.getKey()
            java.lang.Object r11 = r1.get(r0)
            java.lang.Integer r11 = (java.lang.Integer) r11
        L_0x0057:
            X.3VK r0 = X.AnonymousClass3VI.A00(r3)
            X.3VL r8 = X.AnonymousClass3VL.EXPLORE_GRID
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r12 = 0
            java.lang.String r15 = r4.getKey()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
            X.GXs r7 = new X.GXs
            r13 = r12
            r14 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.A07(r7)
        L_0x0072:
            return r6
        L_0x0073:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)
            goto L_0x0057
        L_0x0078:
            if (r2 == 0) goto L_0x007d
            java.lang.String r0 = "Section was dropped because duplicate within same section"
            goto L_0x0037
        L_0x007d:
            boolean r0 = r14.Esp(r4)
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "Section was dropped due to DiscoveryGridItemFilter"
            X.0wb.A03(r1, r0)
            return r6
        L_0x0089:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GWV.A02(X.GWV, X.5r0, X.2sQ, java.util.Set, int):boolean");
    }

    public final C296995qz A03(C296935qt r3) {
        0qQ.A0B(r3, 0);
        C296995qz r1 = (C296995qz) this.A07.get(r3.getKey());
        if (r1 == null) {
            return new C296995qz(-1, -1);
        }
        return r1;
    }

    public final ArrayList A06(C231802sQ r8, List list) {
        0qQ.A0B(r8, 1);
        C296935qt r0 = (C296935qt) 00k.A0L(this.A02);
        if (r0 != null) {
            A03(r0);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        LinkedHashSet A0y = DbS.A0y();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C297005r0 r2 = (C297005r0) next;
            A0y.clear();
            if (A02(this, r2, r8, A0y, i + this.A03.size())) {
                this.A03.add(r2);
                this.A05.addAll(A0y);
            } else {
                A01(r2, A1C);
            }
            i = i2;
        }
        A00(this);
        return A1C;
    }

    public static final void A00(GWV gwv) {
        ArrayList A1D = AnonymousClass7TE.A1D(gwv.A03);
        gwv.A08.invoke(A1D);
        Map map = gwv.A07;
        map.clear();
        Map map2 = gwv.A04;
        map2.clear();
        gwv.A01 = null;
        gwv.A00 = null;
        int size = A1D.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C297005r0 r9 = (C297005r0) A1D.get(i2);
            for (C296935qt r3 : r9.A02) {
                0qQ.A0B(r3, 0);
                Object obj = r9.A03.get(r3);
                0qQ.A0A(obj);
                C296995qz r0 = (C296995qz) obj;
                map.put(r3.getKey(), new C296995qz(r0.A01 + i, r0.A00));
                map2.put(r3.getKey(), Integer.valueOf(i2));
                if (r3 instanceof C52435GSn) {
                    C52435GSn gSn = (C52435GSn) r3;
                    gSn.A00.A0D(i2);
                    gwv.A01 = Integer.valueOf(i2);
                    gwv.A00 = gSn;
                }
            }
            i += r9.A00;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1D);
        Iterator it = A1D.iterator();
        while (it.hasNext()) {
            A0r.add(((C297005r0) it.next()).A02);
        }
        gwv.A02 = 0Yv.A1F(A0r);
    }

    public static final void A01(C297005r0 r3, List list) {
        1Xj BPf;
        for (C296935qt r1 : r3.A02) {
            if (r1 instanceof C296925qs) {
                C295825oy r2 = ((C296925qs) r1).A01;
                int i = r2.A00;
                if (i >= 0) {
                    if (i < r2.A02().size()) {
                        BPf = r2.A00().A02;
                        if (BPf == null) {
                        }
                    }
                }
            } else if (r1 instanceof C296965qw) {
                BPf = ((C296965qw) r1).BPf();
            }
            list.add(BPf);
        }
    }

    public final C296935qt A04(1Xj r4) {
        for (C296935qt r1 : this.A02) {
            if ((r1 instanceof C296965qw) && 0qQ.A0K(((C296965qw) r1).BPf(), r4)) {
                return r1;
            }
        }
        return null;
    }

    public final ArrayList A05() {
        1Xj r0;
        List list = this.A02;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if ((next instanceof C296985qy) && (r0 = ((C296985qy) next).A01) != null) {
                C51971G9r.A1M(r0, A1C);
            }
        }
        return A1C;
    }

    public GWV(0sP r2, UserSession userSession) {
        this.A06 = userSession;
        this.A08 = r2;
    }
}
