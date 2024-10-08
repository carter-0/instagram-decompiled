package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3sR  reason: invalid class name and case insensitive filesystem */
public abstract class C254413sR {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        Boolean Cby = 0eE.A00(userSession).A00().A03.Cby();
        if (Cby == null || !Cby.booleanValue() || !182.A06(0Tu.A05, userSession, 36311204003578325L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, 1Xj r13) {
        boolean z;
        boolean z2;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        String str;
        boolean z3;
        User BRo;
        String str2;
        0qQ.A0B(r13, 1);
        User A01 = AnonymousClass0t1.A01.A01(userSession);
        User A2A = r13.A2A(userSession);
        boolean z4 = !r13.A5v();
        C247733gp A1T = r13.A1T();
        if (A1T == null || (str2 = A1T.A0d) == null) {
            z = false;
        } else {
            z = 00l.A0d(str2, 002.A0D(A01.A03.getUsername(), '@'), false);
        }
        ArrayList A06 = C254423sS.A06(r13);
        ArrayList arrayList = new ArrayList(0Yv.A1E(A06, 10));
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            arrayList.add(((PeopleTag) it.next()).A07().getId());
        }
        boolean A0u = 00k.A0u(arrayList, AnonymousClass3ZA.A00(A01));
        List BRs = r13.BRs();
        if (BRs != null) {
            z2 = BRs.contains(AnonymousClass3ZA.A00(A01));
        } else {
            z2 = false;
        }
        ArrayList A05 = C254423sS.A05(r13);
        if (!(A05 instanceof Collection) || !A05.isEmpty()) {
            Iterator it2 = A05.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C46292DTv dTv = (C46292DTv) it2.next();
                C74546Pwf Bbg = dTv.Bbg();
                if (Bbg != null) {
                    featuredProductPermissionStatus = Bbg.BzM();
                } else {
                    featuredProductPermissionStatus = null;
                }
                if (featuredProductPermissionStatus == FeaturedProductPermissionStatus.APPROVED) {
                    ProductDetailsProductItemDictIntf Bfu = dTv.Bfu();
                    if (Bfu == null || (BRo = Bfu.BRo()) == null) {
                        str = null;
                    } else {
                        str = AnonymousClass3ZA.A00(BRo);
                    }
                    if (0qQ.A0K(str, AnonymousClass3ZA.A00(A01))) {
                        z3 = true;
                        break;
                    }
                }
            }
            if (!0qQ.A0K(A2A, A01) || z3 || !z4) {
                return false;
            }
            if ((z || A0u || z2) && A00(userSession)) {
                return true;
            }
            return false;
        }
        z3 = false;
        return !0qQ.A0K(A2A, A01) ? false : false;
    }

    public static final boolean A01(UserSession userSession, 1Xj r7) {
        String str;
        Object obj;
        String str2;
        ProductDetailsProductItemDictIntf Bfu;
        User BRo;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        Iterator it = C254423sS.A05(r7).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C74546Pwf Bbg = ((C46292DTv) obj).Bbg();
            if (Bbg != null) {
                featuredProductPermissionStatus = Bbg.BzM();
            } else {
                featuredProductPermissionStatus = null;
            }
            if (featuredProductPermissionStatus == FeaturedProductPermissionStatus.APPROVED) {
                break;
            }
        }
        C46292DTv dTv = (C46292DTv) obj;
        if (dTv == null || (Bfu = dTv.Bfu()) == null || (BRo = Bfu.BRo()) == null) {
            str2 = null;
        } else {
            str2 = AnonymousClass3ZA.A00(BRo);
        }
        String str3 = userSession.A06;
        if (dTv == null) {
            return false;
        }
        if (!0qQ.A0K(str3, str2)) {
            User A2A = r7.A2A(userSession);
            if (A2A != null) {
                str = A2A.getId();
            }
            if (0qQ.A0K(str3, str)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
