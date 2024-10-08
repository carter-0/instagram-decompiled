package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.search.common.analytics.SearchContext;

public final class UYF extends C272124k8 {
    public final /* synthetic */ C267664bz A00;
    public final /* synthetic */ AnonymousClass3BQ A01;
    public final /* synthetic */ C230222pE A02;
    public final /* synthetic */ AnonymousClass32A A03;
    public final /* synthetic */ AnonymousClass3N3 A04;
    public final /* synthetic */ C14437TwL A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UYF(C267664bz r1, UserSession userSession, AnonymousClass3BQ r3, C230222pE r4, AnonymousClass32A r5, AnonymousClass3N3 r6, C14437TwL twL) {
        super(userSession);
        this.A05 = twL;
        this.A00 = r1;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A032 = AnonymousClass0fD.A03(890565646);
        C270194gL r13 = (C270194gL) obj;
        int A033 = AnonymousClass0fD.A03(891810700);
        AnonymousClass7TG.A1N(userSession, r13);
        super.A06(userSession, r13);
        1OP r0 = 1OP.$redex_init_class;
        ReelStore A034 = ReelStore.A03(userSession);
        0qQ.A07(A034);
        Reel A0G = A034.A0G(r13);
        C14437TwL twL = this.A05;
        C267664bz r3 = this.A00;
        AnonymousClass3N3 r8 = this.A04;
        C14437TwL.A01(r3, A0G, this.A01, this.A02, this.A03, r8, (SearchContext) null, twL);
        AnonymousClass0fD.A0A(-1710134439, A033);
        AnonymousClass0fD.A0A(1283495732, A032);
    }
}
