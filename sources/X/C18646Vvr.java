package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.List;

/* renamed from: X.Vvr  reason: case insensitive filesystem */
public final class C18646Vvr {
    public static final C20998X8v A04 = new C66636Ma5(3);
    public static final C20998X8v A05 = new C66636Ma5(4);
    public static final C20998X8v A06 = new C66636Ma5(5);
    public static final C20980X7u A07 = new C14141Tqb(3);
    public static final C20980X7u A08 = new C14141Tqb(4);
    public static final C20980X7u A09 = new C14141Tqb(5);
    public final C14016ToI A00;
    public final C14016ToI A01;
    public final C14016ToI A02;
    public final UserSession A03;

    public final synchronized List A00() {
        01N A1H;
        A1H = 0jo.A1H();
        A1H.addAll(this.A02.A02());
        A1H.addAll(this.A00.A02());
        A1H.addAll(this.A01.A02());
        return 0jo.A1I(A1H);
    }

    public final synchronized void A01(Hashtag hashtag) {
        0qQ.A0B(hashtag, 0);
        this.A00.A04(hashtag);
    }

    public final synchronized void A02(C18072Vl0 vl0) {
        0qQ.A0B(vl0, 0);
        this.A02.A04(vl0);
    }

    public C18646Vvr(UserSession userSession) {
        this.A03 = userSession;
        this.A02 = new C14016ToI(userSession, A06, A09, 50);
        this.A00 = new C14016ToI(userSession, A04, A07, 50);
        this.A01 = new C14016ToI(userSession, A05, A08, 50);
    }
}
