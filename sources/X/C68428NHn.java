package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.NHn  reason: case insensitive filesystem */
public final class C68428NHn extends C272124k8 {
    public final /* synthetic */ C74551Pwk A00;
    public final /* synthetic */ 1cd A01;
    public final /* synthetic */ 1cX A02;
    public final /* synthetic */ DirectThreadKey A03;
    public final /* synthetic */ Boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68428NHn(UserSession userSession, C74551Pwk pwk, 1cd r3, 1cX r4, DirectThreadKey directThreadKey, Boolean bool) {
        super(userSession);
        this.A01 = r3;
        this.A00 = pwk;
        this.A04 = bool;
        this.A03 = directThreadKey;
        this.A02 = r4;
    }

    public final void A05(C268654dm r7, UserSession userSession) {
        int A032 = AnonymousClass0fD.A03(2048805019);
        C74551Pwk pwk = this.A00;
        C74551Pwk.A01(pwk);
        if (Boolean.TRUE.equals(this.A04)) {
            0qQ.A0B(r7, 0);
            C313746gw.A00(userSession).A0S(this.A03.A00, AnonymousClass000.A00(1797), C71115Od8.A01(r7, C70377O4e.A00).toString());
        }
        0qQ.A0B(r7, 0);
        pwk.DTM(C71115Od8.A01(r7, C70377O4e.A00), (String) null);
        AnonymousClass0fD.A0A(42129036, A032);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A032 = AnonymousClass0fD.A03(-1233250533);
        int A033 = AnonymousClass0fD.A03(-700453569);
        C74551Pwk.A02(this.A00);
        AnonymousClass0fD.A0A(-334550142, A033);
        AnonymousClass0fD.A0A(-867298333, A032);
    }
}
