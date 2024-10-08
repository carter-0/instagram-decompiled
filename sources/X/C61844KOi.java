package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KOi  reason: case insensitive filesystem */
public final class C61844KOi extends LSR {
    public K1L A00;
    public AnonymousClass3Q2 A01;
    public TaggingFeedMultiSelectState A02;
    public List A03 = AnonymousClass7TE.A1C();
    public List A04;
    public List A05;
    public final UserSession A06;
    public final LRK A07;
    public final String A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0iw A0B;

    public static final void A00(C61844KOi kOi, List list) {
        AnonymousClass3Q2 r1 = kOi.A01;
        if (r1 != null) {
            r1.A43 = AnonymousClass7TE.A1D(list);
        }
        05G r4 = kOi.A09;
        KO5 ko5 = (KO5) r4.getValue();
        r4.Epw(new KO5(ko5.A00, list, ko5.A02, ko5.A03));
    }

    public final void A0A() {
        AnonymousClass3Q2 r5;
        C61077JwF jwF = A06().A05;
        if (jwF != null && jwF.A01 != null) {
            UserSession userSession = this.A06;
            K1L k1l = this.A00;
            if ((C63447KxC.A00(userSession) || !(k1l == null || k1l.A01 == null)) && (r5 = this.A01) != null) {
                AnonymousClass0iw r13 = this.A0B;
                String str = this.A08;
                List list = this.A04;
                List list2 = this.A03;
                0qQ.A0B(list2, 5);
                String str2 = r5.A33;
                if (str2 != null) {
                    if (C367088qA.A03(userSession)) {
                        new LRC(userSession, (ArrayList) null, str, LTZ.A05(DbV.A14(str2)), "reels", r13).A01();
                    }
                    if (C63447KxC.A00(userSession)) {
                        if (!list2.isEmpty()) {
                            ArrayList A0r = AnonymousClass7TG.A0r(list2);
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                DbY.A1W(A0r, it);
                            }
                            ArrayList A1C = AnonymousClass7TE.A1C();
                            for (Object next : A0r) {
                                DbV.A1U(next, A1C, list.contains(next) ? 1 : 0);
                            }
                            list = 0Yv.A1F(0sr.A1P(new List[]{list, A1C}));
                        }
                        if (list.isEmpty()) {
                            r5.A43 = AnonymousClass7TE.A1C();
                            return;
                        }
                        ArrayList A052 = LTZ.A05(DbV.A14(str2));
                        ArrayList arrayList = null;
                        if (list instanceof ArrayList) {
                            arrayList = (ArrayList) list;
                        }
                        new LRC(r13, userSession, str, "reels", A052, arrayList).A01();
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61844KOi(AnonymousClass0iw r4, UserSession userSession, LRK lrk, String str) {
        super(lrk);
        C51974G9v.A1M(userSession, r4, str);
        this.A07 = lrk;
        this.A06 = userSession;
        this.A0B = r4;
        this.A08 = str;
        02z A10 = DbS.A10(new KO5((C61062Jw0) null, (List) null, false, false));
        this.A09 = A10;
        this.A0A = A10;
        0sn r0 = 0sn.A00;
        this.A05 = r0;
        this.A04 = r0;
    }
}
