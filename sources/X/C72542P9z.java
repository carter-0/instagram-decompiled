package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(message = "legacy translation feature")
/* renamed from: X.P9z  reason: case insensitive filesystem */
public final class C72542P9z implements AnonymousClass7XO {
    public boolean A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = C73899Pla.A00(this, 19);
    public final 0wc A03;
    public final C333517Zg A04;
    public final AnonymousClass0eK A05;

    public C72542P9z(0wc r2, UserSession userSession, AnonymousClass0eK r4) {
        0qQ.A0B(r4, 3);
        this.A01 = userSession;
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = (C333517Zg) C66580MXl.A0s(r4);
    }

    public final SpannableString DkY(Context context, MessageIdentifier messageIdentifier, Integer num, int i) {
        0qQ.A0B(context, 0);
        0qQ.A0B(messageIdentifier, 1);
        int i2 = 2131959805;
        if (C51967G9n.A03(num, 2) != 2) {
            i2 = 2131959807;
        }
        String A0p = C51967G9n.A0p(context, i2);
        SpannableStringBuilder A0C = DbS.A0C(A0p);
        if (num != AnonymousClass05K.A0C) {
            AnonymousClass7AV.A05(A0C, new ELP(this, messageIdentifier, num, i), A0p);
        }
        SpannableString valueOf = SpannableString.valueOf(A0C);
        0qQ.A07(valueOf);
        return valueOf;
    }

    public final void Dry(MessageIdentifier messageIdentifier, Integer num) {
        0wc r2;
        HashMap A0e;
        String str;
        C333517Zg r6 = this.A04;
        C376179Gx r1 = C376179Gx.PSEUDO_TRANSLATE_THREAD_MESSAGES;
        if (!r6.AH1(r1)) {
            C69865NtT.A00(r1);
            return;
        }
        AnonymousClass7ZY BSN = r6.BSN();
        ArrayList BSC = BSN.BSC(messageIdentifier.A01);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = BSC.iterator();
        while (it.hasNext()) {
            AnonymousClass7LQ r12 = (AnonymousClass7LQ) it.next();
            if (num == AnonymousClass05K.A01 && r12.A0e.A0o() == null) {
                A1C.add(r12);
            } else {
                BSN.EdR(num, r12.A0e.A0h(), false);
            }
        }
        AnonymousClass7S7 C6l = r6.C6l();
        A00(C66580MXl.A0Z(C6l), A1C, false);
        String A09 = C66647MaG.A09(C6l.B8S());
        boolean CZ0 = C6l.CZ0();
        if (A09 != null) {
            if (num == AnonymousClass05K.A00) {
                r2 = this.A03;
                A0e = C66584MXp.A0e(A09, CZ0);
                str = "see_original_button_click";
            } else if (num == AnonymousClass05K.A01) {
                r2 = this.A03;
                A0e = C66584MXp.A0e(A09, CZ0);
                str = "see_translation_button_click";
            } else {
                return;
            }
            C69956Nuw.A00(r2, str, A0e);
        }
    }

    public final void A00(AnonymousClass7SD r11, List list, boolean z) {
        String str;
        C252733pa r5;
        ArrayList arrayList;
        C254793t3 r3;
        C333517Zg r2 = this.A04;
        C376179Gx r1 = C376179Gx.PSEUDO_TRANSLATE_THREAD_MESSAGES;
        if (!r2.AH1(r1)) {
            C69865NtT.A00(r1);
        } else if (list == null || !A01()) {
            UserSession userSession = this.A01;
            if (C69958Nuy.A00(userSession, r11)) {
                AnonymousClass7S7 C6l = r2.C6l();
                Map C6i = C6l.C6i();
                String str2 = null;
                if (C6i != null) {
                    str = DbT.A11(userSession.A06, C6i);
                } else {
                    str = null;
                }
                Map C6i2 = C6l.C6i();
                if (C6i2 != null) {
                    str2 = DbT.A11(C6l.BY8(), C6i2);
                }
                if (r11.A1C) {
                    if (!this.A00 && z) {
                        this.A00 = true;
                        if (str != null && str2 != null) {
                            AnonymousClass7ZY BSN = r2.BSN();
                            int itemCount = BSN.getItemCount();
                            r5 = (C252733pa) this.A02.getValue();
                            r3 = C6l.CBU();
                            ArrayList Bk1 = BSN.Bk1(itemCount);
                            arrayList = AnonymousClass7TF.A0p(Bk1);
                            Iterator it = Bk1.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((AnonymousClass7LQ) it.next()).A0e);
                            }
                        } else {
                            return;
                        }
                    } else if (list != null && str2 != null && str != null) {
                        r5 = (C252733pa) this.A02.getValue();
                        r3 = C6l.CBU();
                        arrayList = AnonymousClass7TF.A0p(list);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((AnonymousClass7LQ) it2.next()).A0e);
                        }
                    } else {
                        return;
                    }
                    AnonymousClass7TE.A1Z(new JVS(r3, arrayList, r5, str, str2, (AnonymousClass4D7) null, 6), r5.A01);
                }
            }
        }
    }

    public final boolean A01() {
        Map map;
        AnonymousClass170 BY7;
        C254763t0 A022;
        String str;
        C333517Zg r2 = this.A04;
        AnonymousClass7S7 C6l = r2.C6l();
        AnonymousClass7SD C6Q = C6l.C6Q();
        C376179Gx r1 = C376179Gx.PSEUDO_TRANSLATE_THREAD_MESSAGES;
        if (!r2.AH1(r1)) {
            C69865NtT.A00(r1);
        } else {
            UserSession userSession = this.A01;
            0qQ.A0A(C6Q);
            0qQ.A0B(C6Q, 1);
            if (C51965G9l.A1a(0Tu.A06, userSession, 36313918423042361L) && OPP.A00(C6Q)) {
                List list = C6Q.A0b;
                boolean A1Z = JTR.A1Z(userSession);
                User user = (User) 00k.A0J(list);
                if (user != null && (A1Z ^ user.A2L()) && (((map = C6Q.A0i) == null || map.size() == 0) && (BY7 = C6l.BY7()) != null)) {
                    C252733pa r5 = (C252733pa) this.A02.getValue();
                    C254793t3 CBU = C6l.CBU();
                    ArrayList Bk1 = r2.BSN().Bk1(20);
                    ArrayList A0p = AnonymousClass7TF.A0p(Bk1);
                    Iterator it = Bk1.iterator();
                    while (it.hasNext()) {
                        A0p.add(((AnonymousClass7LQ) it.next()).A0e);
                    }
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : A0p) {
                        if (((C254703su) next).A10 == 2FW.A1g) {
                            A1C.add(next);
                        }
                    }
                    ArrayList A0p2 = AnonymousClass7TF.A0p(A1C);
                    Iterator it2 = A1C.iterator();
                    while (it2.hasNext()) {
                        Object obj = C66580MXl.A0a(it2).A1T;
                        DbS.A1Y(obj);
                        A0p2.add(obj);
                    }
                    if (A0p2.isEmpty() || CBU == null || (A022 = C300965yF.A02(CBU)) == null || (str = A022.A00) == null) {
                        return true;
                    }
                    AnonymousClass7TE.A1Z(new C66148MEb(r5, CBU, A0p2, BY7, str, (AnonymousClass4D7) null, 2), r5.A01);
                    return true;
                }
            }
        }
        return false;
    }
}
