package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.H8d  reason: case insensitive filesystem */
public final class C54331H8d extends C230372pW {
    public final 0xG A00;
    public final UserSession A01;

    private final void A00(C267324bN r7, AnonymousClass0iw r8, UserSession userSession) {
        Long l;
        1Xj r2 = r7.A02;
        if (r2 != null && r2.A0C.BFi() != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            String id = r2.getId();
            if (id != null) {
                A1E.put("post_igid", id);
            }
            String str = null;
            if (r2.A0C.BFi() != null) {
                AnonymousClass1eb BFi = r2.A0C.BFi();
                if (BFi != null) {
                    l = Long.valueOf(BFi.BEV());
                } else {
                    l = null;
                }
                A1E.put("product_id", String.valueOf(l));
            }
            User A2A = r2.A2A(userSession);
            0Aj A05 = C51974G9v.A05(r8, userSession);
            A05.AAJ("consumer_igid", userSession.A06);
            if (A2A != null) {
                str = A2A.getId();
            }
            C51969G9p.A1E(A05, "seller_igid", str, A1E);
            DbS.A1I(A05, "buyer_view_inquiry_cta");
            A05.Cgf();
        }
    }

    public C54331H8d(UserSession userSession, String str) {
        super(C51972G9s.A0b(userSession));
        this.A01 = userSession;
        this.A00 = DbS.A0O(str);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        A00(C51969G9p.A0g(obj), this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        A00(C51969G9p.A0g(obj), this.A00, this.A01);
    }
}
