package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.ContentNotesRepository$deleteNote$1;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4JK  reason: invalid class name */
public final class AnonymousClass4JK extends C252733pa {
    public final UserSession A00;
    public final AnonymousClass4JM A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LM(this, 32));
    public final 05G A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0Ud A06;

    public static final void A00(UserSession userSession, 1Xj r9, User user) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r9, 1);
        1Xj A1e = r9.A1e(userSession);
        0sn A3b = A1e.A3b();
        if (A3b == null) {
            A3b = 0sn.A00;
        }
        ArrayList A0U = 00k.A0U(A3b);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!0qQ.A0K(((C2809354u) next).getUserId(), user.getId())) {
                arrayList.add(next);
            }
        }
        A1e.A4I(arrayList);
        1E7.A00(userSession).A01(A1e, true, false);
    }

    public static final boolean A01(UserSession userSession, 1Xj r4, User user) {
        List<C2809354u> A3b = r4.A1e(userSession).A3b();
        if (A3b == null) {
            return false;
        }
        if (!(A3b instanceof Collection) || !A3b.isEmpty()) {
            for (C2809354u userId : A3b) {
                if (0qQ.A0K(userId.getUserId(), user.getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A02(GPK gpk, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        int i;
        String str7 = str;
        0qQ.A0B(str7, 0);
        String str8 = str2;
        0qQ.A0B(str8, 1);
        String str9 = str3;
        0qQ.A0B(str9, 3);
        boolean A062 = 182.A06(0Tu.A05, this.A00, 36323650819075427L);
        C262224Cq r2 = this.A01;
        GPK gpk2 = gpk;
        Integer num3 = num;
        Integer num4 = num2;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if (A062) {
            i = 0;
        } else {
            i = 1;
        }
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, new C377009Ke(gpk2, this, num3, num4, str7, str8, str9, str10, str11, str12, (AnonymousClass4D7) null, i), r2);
    }

    public final void A03(GPK gpk, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = str;
        0qQ.A0B(str7, 0);
        int i = 1;
        String str8 = str2;
        0qQ.A0B(str8, 1);
        String str9 = str3;
        0qQ.A0B(str9, 3);
        boolean A062 = 182.A06(0Tu.A05, this.A00, 36323650819337575L);
        C262224Cq r1 = this.A01;
        if (!A062) {
            i = 2;
        }
        1Eo.A05(19B.A00, new C66158MFv(gpk, this, num, num2, str7, str8, str9, str4, str5, str6, (AnonymousClass4D7) null, i), r1);
    }

    public final void A04(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        0qQ.A0B(str, 0);
        String str8 = str2;
        0qQ.A0B(str8, 1);
        String str9 = str3;
        0qQ.A0B(str9, 2);
        C262224Cq r1 = this.A01;
        1Eo.A05(19B.A00, new ContentNotesRepository$deleteNote$1(this, num, str, str8, str9, str4, str5, str6, str7, (AnonymousClass4D7) null), r1);
    }

    public final boolean A05(String str, String str2) {
        Object obj;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        1Xj A002 = I2Z.A00(this.A00, str);
        if (A002 == null) {
            return false;
        }
        0sn A3b = A002.A3b();
        if (A3b == null) {
            A3b = 0sn.A00;
        }
        Iterator it = A3b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C2809354u) obj).getId(), str2)) {
                break;
            }
        }
        C2809354u r1 = (C2809354u) obj;
        if (r1 != null) {
            return 0qQ.A0K(r1.CF2(), true);
        }
        return false;
    }

    public AnonymousClass4JK(UserSession userSession, AnonymousClass4JM r5) {
        super("ContentNotes", AnonymousClass43D.A01(833760202, 3));
        this.A00 = userSession;
        this.A01 = r5;
        02z A012 = 106.A01(0Yt.A0E());
        this.A04 = A012;
        this.A05 = 10b.A03(A012);
        02z r0 = new 02z(0L);
        this.A03 = r0;
        this.A06 = 10b.A03(r0);
    }
}
