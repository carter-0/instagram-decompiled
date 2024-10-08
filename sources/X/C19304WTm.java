package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.WTm  reason: case insensitive filesystem */
public final class C19304WTm implements 0mK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19304WTm(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        C17971Vj8 vj8;
        AnonymousClass1O9 r4;
        1NY r3;
        C228602lw r2;
        Class cls;
        Class cls2;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                vj8 = (C17971Vj8) obj;
                0qQ.A0B(vj8, 0);
                if (!vj8.equals(C17971Vj8.A02)) {
                    C17971Vj8.A02 = vj8;
                    0mM r0 = (0mM) ((0rm) this.A01).A00;
                    if (r0 != null) {
                        r0.A00();
                    }
                    str = vj8.A01;
                    if (str != null) {
                        C17325VRe vRe = (C17325VRe) this.A02;
                        r2 = vRe.A00;
                        UserSession userSession = vRe.A01;
                        r4 = new AnonymousClass1O9();
                        r3 = DbU.A0N(userSession);
                        str2 = "ads/promote/address_location_typeahead/";
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                vj8 = (C17971Vj8) obj;
                0qQ.A0B(vj8, 0);
                if (!vj8.equals(C17971Vj8.A02)) {
                    C17971Vj8.A02 = vj8;
                    0mM r02 = (0mM) ((0rm) this.A01).A00;
                    if (r02 != null) {
                        r02.A00();
                    }
                    String str3 = vj8.A01;
                    if (str3 != null) {
                        C17325VRe vRe2 = (C17325VRe) this.A02;
                        r2 = vRe2.A00;
                        UserSession userSession2 = vRe2.A01;
                        r4 = new AnonymousClass1O9();
                        r3 = DbU.A0N(userSession2);
                        r3.A0A("ads/promote/interest_typeahead/");
                        r3.A9m("fb_auth_token", "");
                        r3.A9m("query", str3);
                        cls = UX8.class;
                        cls2 = C18158VmY.class;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                vj8 = (C17971Vj8) obj;
                0qQ.A0B(vj8, 0);
                if (!vj8.equals(C17971Vj8.A02)) {
                    C17971Vj8.A02 = vj8;
                    0mM r03 = (0mM) ((0rm) this.A01).A00;
                    if (r03 != null) {
                        r03.A00();
                    }
                    str = vj8.A01;
                    if (str != null) {
                        C17325VRe vRe3 = (C17325VRe) this.A02;
                        r2 = vRe3.A00;
                        UserSession userSession3 = vRe3.A01;
                        r4 = new AnonymousClass1O9();
                        r3 = DbU.A0N(userSession3);
                        str2 = "ads/promote/regional_location_typeahead/";
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                View A0O = C51969G9p.A0O(obj);
                DbW.A1K(((C55572Hjs) this.A01).A00);
                ((View.OnClickListener) this.A02).onClick(A0O);
                return;
        }
        r3.A0E = str2;
        r3.A9m("query", str);
        cls = UX9.class;
        cls2 = C18160Vma.class;
        r3.A0R(cls, cls2);
        r3.A00 = r4;
        1OC A0M = r3.A0M();
        A0M.A00 = vj8.A00;
        r2.schedule(A0M);
    }
}
