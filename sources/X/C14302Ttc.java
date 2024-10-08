package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ttc  reason: case insensitive filesystem */
public abstract class C14302Ttc {
    public static final List A00(List list) {
        C14015ToH toH;
        List<AnonymousClass5Hc> list2 = list;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
        for (AnonymousClass5Hc r0 : list2) {
            0qQ.A0B(r0, 0);
            C255783ui r4 = new C255783ui(AnonymousClass3WT.AVATAR, r0.CGt(), r0.CHS(), r0.CHZ(), r0.CGX(), r0.BCt(), r0.Bof(), r0.CUa(), r0.CcV(), r0.CTN(), r0.AyE(), r0.Ad0(), r0.getId());
            C21042XAv CEt = r0.CEt();
            C14015ToH toH2 = null;
            if (CEt != null) {
                toH = CEt.F0k();
            } else {
                toH = null;
            }
            r4.A0D = toH;
            C21042XAv Ady = r0.Ady();
            if (Ady != null) {
                C14015ToH F0k = Ady.F0k();
                String AeW = r0.AeW();
                toH2 = new C14015ToH(F0k.A00, F0k.A01, F0k.A02, F0k.A03, F0k.A04, AeW, F0k.A06, r0.B2z(), F0k.A08, F0k.A09);
            }
            r4.A0C = toH2;
            String userId = r0.getUserId();
            if (userId != null) {
                r4.A1n = userId;
            }
            arrayList.add(r4);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.DDv] */
    public static final List A01(List list) {
        DDv dDv;
        C270044g6 r0;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            XB0 xb0 = (XB0) it.next();
            0qQ.A0B(xb0, 0);
            C255783ui r5 = new C255783ui(AnonymousClass3WT.BLOKS, xb0.CGt(), xb0.CHS(), xb0.CHZ(), xb0.CGX(), xb0.BCt(), xb0.Bof(), xb0.CUa(), xb0.CcV(), xb0.CTN(), xb0.AyE(), xb0.Ad0(), xb0.getId());
            DU3 AgP = xb0.AgP();
            if (AgP != null) {
                ? obj = new Object();
                obj.A0A = new HashMap();
                obj.A0B = new HashMap();
                obj.A0C = new HashMap();
                obj.A09 = AgP.getId();
                C257593xe AgG = AgP.AgG();
                obj.A03 = AgG;
                if (AgG != null) {
                    r0 = Ci1.A00(AgG);
                } else {
                    r0 = null;
                }
                obj.A02 = r0;
                obj.A07 = AgP.AgQ();
                dDv = obj;
            } else {
                dDv = null;
            }
            r5.A1E = dDv;
            A0r.add(r5);
        }
        return A0r;
    }
}
