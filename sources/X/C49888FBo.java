package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchMetaAIResponse;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.FBo  reason: case insensitive filesystem */
public final class C49888FBo {
    public static final AnonymousClass2hV A0C = new FT0(1);
    public C290645fe A00;
    public C290865g5 A01 = null;
    public C46737DkQ A02;
    public OKM A03;
    public C49474EwF A04 = new C49474EwF(AnonymousClass7TE.A1C(), new 04u());
    public ArrayList A05 = AnonymousClass7TE.A1C();
    public final UserSession A06;
    public final HashSet A07 = AnonymousClass7TE.A1F();
    public final HashSet A08 = AnonymousClass7TE.A1F();
    public final C49542Exd A09;
    public final HashSet A0A = AnonymousClass7TE.A1F();
    public final HashSet A0B = AnonymousClass7TE.A1F();

    public final ArrayList A00(boolean z) {
        this.A08.clear();
        this.A07.clear();
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        C49474EwF ewF = this.A04;
        ArrayList A0v = DbS.A0v(size + ewF.A00.size());
        if (z) {
            A03(A0v, arrayList);
            arrayList = ewF.A00;
        }
        A03(A0v, arrayList);
        return A0v;
    }

    public final void A02(String str, String str2, String str3) {
        Integer num;
        ArrayList arrayList = this.A05;
        arrayList.clear();
        HashSet hashSet = this.A0B;
        hashSet.clear();
        HashSet hashSet2 = this.A0A;
        hashSet2.clear();
        if (this.A00 != null) {
            String str4 = str;
            if (!TextUtils.isEmpty(str)) {
                OKM okm = this.A03;
                if (!(okm == null || (num = okm.A00) == null)) {
                    okm.A01.cacheQueryStart(num.intValue(), "banyan");
                }
                C290865g5 A022 = this.A00.A02(str3, str2, str4, hashSet, hashSet2);
                this.A01 = A022;
                arrayList.addAll(A022.A02);
                if (okm != null) {
                    okm.A00(false, this.A01.A02.size());
                }
                UserSession userSession = this.A06;
                0Tu r3 = 0Tu.A05;
                if (182.A06(r3, userSession, 36321997256468366L) && str3.equals("direct_user_search_nullstate")) {
                    arrayList.addAll(this.A00.A02((String) null, C273654mx.A00(2255), str4, hashSet, hashSet2).A02);
                }
                C49542Exd exd = this.A09;
                04u r2 = new 04u();
                04u r7 = new 04u();
                exd.A02.AVA(str, r2, r7);
                HashSet A1F = AnonymousClass7TE.A1F();
                ArrayList A0v = DbS.A0v(r2.size() + r7.size());
                Iterator it = r2.iterator();
                while (it.hasNext()) {
                    2Eq r1 = (2Eq) it.next();
                    A1F.add(r1.BJy().A00);
                    A0v.add(r1);
                }
                Iterator it2 = r7.iterator();
                while (it2.hasNext()) {
                    2Eq r12 = (2Eq) it2.next();
                    if (!A1F.contains(r12.BJy().A00)) {
                        A0v.add(r12);
                    }
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it3 = A0v.iterator();
                while (it3.hasNext()) {
                    2Eq r5 = (2Eq) it3.next();
                    if (r5.C6a() != 29 || r5.BHS() == 0) {
                        A1C.add(r5);
                    }
                }
                UserSession userSession2 = exd.A01;
                if (!182.A06(r3, userSession2, 36325145469530771L)) {
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    Iterator it4 = A1C.iterator();
                    while (it4.hasNext()) {
                        2Eq r13 = (2Eq) it4.next();
                        if (!AnonymousClass48O.A06(Integer.valueOf(r13.C6a()))) {
                            A1C2.add(r13);
                        }
                    }
                    A1C = A1C2;
                }
                Collections.sort(A1C, new C51566FwC((Object) exd, 5));
                ArrayList A0v2 = DbS.A0v(Math.min(50, A1C.size()));
                HashSet A1F2 = AnonymousClass7TE.A1F();
                Iterator it5 = A1C.iterator();
                int i = 0;
                while (it5.hasNext()) {
                    AnonymousClass2Ep r22 = (AnonymousClass2Ep) it5.next();
                    if (i > 50) {
                        break;
                    } else if (!r22.CVr()) {
                        DirectShareTarget A002 = C46503Dg6.A00(exd.A00, userSession2, r22);
                        if (!A002.A0P()) {
                            A0v2.add(A002);
                            A1F2.add(r22.BJy().A00);
                            i++;
                        }
                    }
                }
                this.A04 = new C49474EwF(A0v2, A1F2);
            }
        }
    }

    public C49888FBo(Context context, C290645fe r5, UserSession userSession, 2Dm r7) {
        this.A06 = userSession;
        this.A00 = r5;
        if (r5 == null) {
            Dbb.A1O(userSession, new EHN(this, 5));
        }
        this.A09 = new C49542Exd(context, userSession, r7);
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36320416708632973L)) {
            this.A03 = C69969Nv9.A00(userSession);
        }
    }

    public final List A01(List list, String str) {
        ArrayList A002 = A00(AnonymousClass7TE.A1b(list));
        if (list.isEmpty()) {
            return A002;
        }
        ArrayList A0v = DbS.A0v(DbT.A01(list, A002.size()));
        A0v.addAll(A002);
        A03(A0v, list);
        UserSession userSession = this.A06;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36325785417561323L) || 182.A06(r2, userSession, 36325785417626860L)) {
            HashSet A1F = AnonymousClass7TE.A1F();
            Iterator it = A0v.iterator();
            while (it.hasNext()) {
                DirectSearchResult directSearchResult = (DirectSearchResult) it.next();
                if (directSearchResult instanceof DirectShareTarget) {
                    A1F.add(((DirectShareTarget) directSearchResult).A09());
                }
            }
            if (!A1F.isEmpty()) {
                boolean A062 = 182.A06(r2, userSession, 36325785417561323L);
                ArrayList A1C = AnonymousClass7TE.A1C();
                if (A062) {
                    boolean A063 = 182.A06(r2, userSession, 36325785417692397L);
                    17i A003 = 17h.A00(userSession);
                    if (!A063) {
                        User user = (User) A003.A02.get(str);
                        if (user != null) {
                            DirectShareTarget directShareTarget = new DirectShareTarget(user);
                            if (!A1F.contains(directShareTarget.A09())) {
                                A1C.add(directShareTarget);
                                A1F.add(directShareTarget.A09());
                            }
                        }
                    } else {
                        Iterator A0u = AnonymousClass7TF.A0u(A003.A01);
                        while (A0u.hasNext()) {
                            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                            String A13 = DbT.A13(A1J);
                            User user2 = (User) A1J.getValue();
                            if (!(user2 == null || A13 == null || !A13.toLowerCase(Locale.getDefault()).startsWith(str.toLowerCase(Locale.getDefault())))) {
                                DirectShareTarget directShareTarget2 = new DirectShareTarget(user2);
                                if (!A1F.contains(directShareTarget2.A09())) {
                                    A1C.add(directShareTarget2);
                                    A1F.add(directShareTarget2.A09());
                                }
                            }
                        }
                    }
                }
                boolean A064 = 182.A06(r2, userSession, 36325785417626860L);
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                if (A064) {
                    Iterator it2 = A0v.iterator();
                    while (it2.hasNext()) {
                        DirectSearchResult directSearchResult2 = (DirectSearchResult) it2.next();
                        if (directSearchResult2 instanceof DirectShareTarget) {
                            DirectShareTarget directShareTarget3 = (DirectShareTarget) directSearchResult2;
                            if (directShareTarget3.A0M()) {
                                for (PendingRecipient pendingRecipient : DbT.A14(directShareTarget3)) {
                                    if (pendingRecipient.A0f.toLowerCase(Locale.getDefault()).startsWith(str.toLowerCase(Locale.getDefault())) && pendingRecipient.A0O) {
                                        DirectShareTarget directShareTarget4 = new DirectShareTarget(pendingRecipient);
                                        if (!A1F.contains(directShareTarget4.A09())) {
                                            A1C2.add(directShareTarget4);
                                            A1F.add(directShareTarget4.A09());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList A1C3 = AnonymousClass7TE.A1C();
                A1C3.addAll(A1C2);
                A1C3.addAll(A1C);
                if (!A1C3.isEmpty()) {
                    User A0j = DbT.A0j(userSession);
                    if (182.A06(r2, userSession, 36325785417757934L) && !A0j.isVerified()) {
                        ArrayList A1C4 = AnonymousClass7TE.A1C();
                        Iterator it3 = A1C3.iterator();
                        while (it3.hasNext()) {
                            DirectSearchResult directSearchResult3 = (DirectSearchResult) it3.next();
                            if ((directSearchResult3 instanceof DirectShareTarget) && !((DirectShareTarget) directSearchResult3).A0V()) {
                                A1C4.add(directSearchResult3);
                            }
                        }
                        A1C3 = A1C4;
                    }
                    ArrayList A1C5 = AnonymousClass7TE.A1C();
                    A1C5.addAll(A0v);
                    A1C5.addAll(A1C3);
                    return A1C5;
                }
            }
        }
        return A0v;
    }

    public final void A03(ArrayList arrayList, List list) {
        HashSet A1F = AnonymousClass7TE.A1F();
        HashSet A1F2 = AnonymousClass7TE.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectSearchResult directSearchResult = (DirectSearchResult) it.next();
            if (directSearchResult instanceof DirectShareTarget) {
                DirectShareTarget directShareTarget = (DirectShareTarget) directSearchResult;
                if (!directShareTarget.A0S) {
                    Object apply = A0C.apply(directShareTarget);
                    String A082 = directShareTarget.A08();
                    if (directShareTarget.A07 != 2EN.A04 && (directShareTarget.A04 == null || this.A07.contains(A082))) {
                        if (!this.A08.contains(apply) && !this.A07.contains(A082)) {
                            if (apply != null) {
                                arrayList.add(directSearchResult);
                                A1F.add(apply);
                            } else if (A082 != null) {
                                if (!directShareTarget.A0R && directShareTarget.A0Q.isEmpty()) {
                                }
                            }
                        }
                    }
                    arrayList.add(directSearchResult);
                    A1F2.add(A082);
                }
            } else if (!(directSearchResult instanceof DirectMessageSearchMessage) && !(directSearchResult instanceof DirectMessageSearchThread) && !(directSearchResult instanceof DirectSearchResharedContent) && !(directSearchResult instanceof DirectSearchPrompt) && !(directSearchResult instanceof DirectSearchMetaAIResponse)) {
            }
            arrayList.add(directSearchResult);
        }
        this.A08.addAll(A1F);
        this.A07.addAll(A1F2);
    }
}
