package X;

import com.instagram.common.session.UserSession;
import com.instagram.tagging.model.Tag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WbS  reason: case insensitive filesystem */
public final class C19542WbS implements X8a {
    public boolean A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final List A06;
    public final boolean A07;

    public final /* synthetic */ C14198Trd E38(String str, List list) {
        return VGD.A00(this, str);
    }

    public final void Dhi(UKV ukv) {
        this.A00 = ukv.A02;
    }

    public C19542WbS(UserSession userSession, List list, boolean z, boolean z2) {
        boolean z3;
        AnonymousClass7TG.A1O(userSession, list);
        this.A06 = list;
        this.A07 = z;
        0eO r1 = 0eO.A03;
        this.A05 = AnonymousClass0eN.A00(r1, new GA1(43, userSession, z2));
        this.A01 = C20695WxR.A00(userSession, r1, 40);
        0eO r12 = 0eO.A02;
        this.A02 = C20695WxR.A00(userSession, r12, 41);
        this.A04 = C20695WxR.A00(userSession, r12, 43);
        this.A03 = C20695WxR.A00(userSession, r12, 42);
        if (G9t.A1b(this.A04) || (!2R8.A00(userSession) && AnonymousClass7TF.A1Z(this.A03))) {
            z3 = false;
        } else {
            z3 = C14471Twt.A05.A00(userSession).A00();
        }
        this.A00 = z3;
    }

    private final ArrayList A00(List list) {
        ArrayList A0U = 00k.A0U(list);
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            List list2 = this.A06;
            String A012 = ((C66942Mfb) it.next()).A01();
            Iterator it2 = 00k.A0X(list2).iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (0qQ.A0K(((Tag) it2.next()).getId(), A012)) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return A0U;
    }

    public final C14198Trd E39() {
        return C14448TwW.A00();
    }

    public final C14198Trd E3A(String str, String str2, List list, List list2) {
        boolean A1b = C51973G9u.A1b(str, list, list2);
        boolean z = this.A07;
        C14207Trm trm = new C14207Trm(z, A1b, this.A00);
        C14440TwO twO = (C14440TwO) this.A05.getValue();
        if (twO != null) {
            trm.A06(A00(twO.A00(str)), str2);
        }
        if (!z) {
            AnonymousClass0eM r4 = this.A01;
            if (((C66942Mfb) r4.getValue()).A05(str)) {
                List list3 = this.A06;
                String A012 = ((C66942Mfb) r4.getValue()).A01();
                Iterator it = 00k.A0X(list3).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (0qQ.A0K(((Tag) it.next()).getId(), A012)) {
                            break;
                        }
                    } else {
                        Object value = r4.getValue();
                        C66966Mfz mfz = new C66966Mfz();
                        mfz.A09 = "client_side_matching";
                        mfz.A05 = "server_results";
                        trm.A03(mfz, value);
                        break;
                    }
                }
            }
        }
        if (G9t.A1b(this.A02)) {
            trm.A07(A00(list2), str2);
        }
        trm.A08(A00(list), str2);
        return trm.A01();
    }
}
