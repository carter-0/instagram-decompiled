package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* renamed from: X.R7o  reason: case insensitive filesystem */
public final class C8750R7o extends C272124k8 {
    public final /* synthetic */ C13919TlL A00;
    public final /* synthetic */ LiveLocationSession A01;
    public final /* synthetic */ C327307Ag A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8750R7o(C13919TlL tlL, LiveLocationSession liveLocationSession, UserSession userSession, C327307Ag r4) {
        super(userSession);
        this.A00 = tlL;
        this.A01 = liveLocationSession;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(649815780);
        int A032 = AnonymousClass0fD.A03(-1054116313);
        C327307Ag r2 = this.A02;
        ((Executor) r2.A02.getValue()).execute(new C12923TDm(this.A00));
        AnonymousClass0fD.A0A(-1121956636, A032);
        AnonymousClass0fD.A0A(1783265786, A03);
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(193907942);
        C8744R7i r7i = (C8744R7i) obj;
        int A032 = AnonymousClass0fD.A03(667527701);
        0qQ.A0B(r7i, 1);
        C10293Rpr rpr = r7i.A00;
        if (rpr != null) {
            str = rpr.A00;
        } else {
            str = null;
        }
        boolean A0K = 0qQ.A0K(str, "404");
        C13919TlL tlL = this.A00;
        if (A0K) {
            String str2 = this.A01.A02;
            0qQ.A07(str2);
            tlL.onError(new TRR(str2));
        } else {
            tlL.onSuccess();
        }
        AnonymousClass0fD.A0A(204507420, A032);
        AnonymousClass0fD.A0A(616945530, A03);
    }
}
