package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vnb  reason: case insensitive filesystem */
public abstract class C18211Vnb {
    public static C295745oq A00(List list) {
        if (list != null && !list.isEmpty()) {
            C295745oq r2 = (C295745oq) list.get(0);
            0qQ.A0B(r2, 0);
            if (r2.A02 == C295755or.TRAY) {
                C295775ot r0 = r2.A01;
                0qQ.A0A(r0);
                if (r0.A0H != null) {
                    return r2;
                }
            }
        }
        return null;
    }

    public static C17694VcP A01(UserSession userSession, UY7 uy7) {
        List emptyList;
        List emptyList2;
        C16672Uz8 uz8;
        ImageUrl imageUrl;
        List list;
        C298705tt r0;
        C17694VcP vcP = new C17694VcP();
        List list2 = uy7.A06;
        if (list2 != null) {
            emptyList = C13991Tnr.A0o(userSession, list2);
        } else {
            emptyList = Collections.emptyList();
        }
        vcP.A08 = emptyList;
        List list3 = uy7.A07;
        if (list3 != null) {
            emptyList2 = C13991Tnr.A0o(userSession, list3);
        } else {
            emptyList2 = Collections.emptyList();
        }
        vcP.A07 = emptyList2;
        Iterator it = vcP.A08.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C298695ts) {
                C298695ts r1 = (C298695ts) next;
                if (r1 != null) {
                    uz8 = r1.A00;
                }
            }
        }
        uz8 = C16672Uz8.UNSPECIFIED;
        vcP.A01 = uz8;
        vcP.A02 = uy7.A00;
        vcP.A04 = uy7.A02;
        vcP.A0A = C13990Tnq.A1a(uy7.A03);
        vcP.A03 = uy7.A01;
        List list4 = uy7.A07;
        if (list4 != null && !list4.isEmpty()) {
            Iterator it2 = uy7.A07.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                1Xj A00 = C16940VBs.A00((C295745oq) it2.next());
                if (A00 != null) {
                    imageUrl = A00.A1Q();
                    break;
                }
            }
        }
        imageUrl = null;
        vcP.A00 = imageUrl;
        String str = null;
        if (imageUrl != null && !uy7.A07.isEmpty()) {
            Iterator it3 = uy7.A07.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                1Xj A002 = C16940VBs.A00((C295745oq) it3.next());
                if (A002 != null) {
                    User A2A = A002.A2A(userSession);
                    if (A2A != null) {
                        str = A2A.getUsername();
                    }
                }
            }
        }
        vcP.A06 = str;
        C295745oq A003 = A00(uy7.A06);
        if (A003 != null) {
            C295775ot r02 = A003.A01;
            0qQ.A0A(r02);
            list = r02.A0H;
        } else {
            list = null;
        }
        vcP.A09 = list;
        C295745oq A004 = A00(uy7.A06);
        if (A004 != null) {
            C295775ot r03 = A004.A01;
            0qQ.A0A(r03);
            r0 = r03.A0B;
        } else {
            r0 = null;
        }
        vcP.A05 = r0;
        return vcP;
    }
}
