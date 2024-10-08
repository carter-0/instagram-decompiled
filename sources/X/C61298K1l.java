package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.K1l  reason: case insensitive filesystem */
public final class C61298K1l extends C272124k8 {
    public final /* synthetic */ AnonymousClass3WZ A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass3W1 A02;
    public final /* synthetic */ Reel A03;
    public final /* synthetic */ AnonymousClass3N3 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61298K1l(UserSession userSession, AnonymousClass3WZ r2, 1Xj r3, AnonymousClass3W1 r4, Reel reel, AnonymousClass3N3 r6) {
        super(userSession);
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = reel;
    }

    public final void A05(C268654dm r6, UserSession userSession) {
        int A032 = AnonymousClass0fD.A03(1232970940);
        AnonymousClass3WZ.A00(this.A00, this.A01, (Boolean) null, JTP.A0r(this.A03));
        AnonymousClass0fD.A0A(-132357549, A032);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A032 = AnonymousClass0fD.A03(-29652686);
        C270194gL r9 = (C270194gL) obj;
        int A033 = AnonymousClass0fD.A03(-2129047807);
        AnonymousClass7TG.A1N(userSession, r9);
        super.A06(userSession, r9);
        1OP r0 = 1OP.$redex_init_class;
        ReelStore A034 = ReelStore.A03(userSession);
        0qQ.A07(A034);
        Reel A0G = A034.A0G(r9);
        AnonymousClass3WZ r4 = this.A00;
        AnonymousClass3WZ.A01(r4, this.A02, A0G, this.A04);
        String A0r = JTP.A0r(A0G);
        1Xj r2 = this.A01;
        C278114wI r1 = r9.A06;
        if (r1 == null) {
            r1 = C278114wI.UNKNOWN;
        }
        AnonymousClass3WZ.A00(r4, r2, Boolean.valueOf(AnonymousClass7TF.A1W(r1, C278114wI.ACTIVE)), A0r);
        AnonymousClass57Q r02 = r4.A06;
        if (r02 != null) {
            r02.A05(r2);
        }
        AnonymousClass0fD.A0A(1661765787, A033);
        AnonymousClass0fD.A0A(-635153119, A032);
    }
}
