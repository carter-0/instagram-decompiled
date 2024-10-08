package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.R7q  reason: case insensitive filesystem */
public final class C8752R7q extends C272124k8 {
    public final /* synthetic */ C13919TlL A00;
    public final /* synthetic */ LiveLocationSession A01;
    public final /* synthetic */ C327307Ag A02;
    public final /* synthetic */ Long A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8752R7q(C13919TlL tlL, LiveLocationSession liveLocationSession, UserSession userSession, C327307Ag r4, Long l) {
        super(userSession);
        this.A02 = r4;
        this.A00 = tlL;
        this.A01 = liveLocationSession;
        this.A03 = l;
    }

    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A032 = AnonymousClass0fD.A03(242951080);
        int A0D = AnonymousClass7TG.A0D(userSession, -40342564);
        C327307Ag r7 = this.A02;
        ((Executor) r7.A02.getValue()).execute(new TKO(this.A00, this.A01, userSession, r7, this.A03));
        AnonymousClass0fD.A0A(-336401227, A0D);
        AnonymousClass0fD.A0A(-1896782033, A032);
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int A032 = AnonymousClass0fD.A03(160655433);
        int A033 = AnonymousClass0fD.A03(1576756929);
        0qQ.A0B(userSession, 0);
        List<C327337Aj> list = this.A02.A01;
        LiveLocationSession liveLocationSession = this.A01;
        Long l = this.A03;
        for (C327337Aj DNu : list) {
            String str = liveLocationSession.A02;
            0qQ.A07(str);
            DNu.DNu(l.longValue(), str, false, userSession.A05);
        }
        this.A00.onSuccess();
        AnonymousClass0fD.A0A(-1793254028, A033);
        AnonymousClass0fD.A0A(-61951238, A032);
    }
}
