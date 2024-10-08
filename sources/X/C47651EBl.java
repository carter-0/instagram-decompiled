package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.api.ReelsTrayQueryResponseImpl;

/* renamed from: X.EBl  reason: case insensitive filesystem */
public final class C47651EBl extends 1P0 {
    public final /* synthetic */ AnonymousClass4Z6 A00;
    public final /* synthetic */ 1KS A01;

    public C47651EBl(AnonymousClass4Z6 r1, 1KS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-906764007);
        C47651EBl.super.onStart();
        C638918c.A01(C61170le.A00).A0G();
        AnonymousClass0fD.A0A(-429687991, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        ReelsTrayQueryResponseImpl reelsTrayQueryResponseImpl;
        int A03 = AnonymousClass0fD.A03(-625789543);
        AnonymousClass3JC r9 = (AnonymousClass3JC) obj;
        int A0D = AnonymousClass7TG.A0D(r9, 1431024362);
        C638918c.A01(C61170le.A00).A0H();
        1KS r6 = this.A01;
        UserSession userSession = r6.A03;
        if (182.A06(0Tu.A05, 1NM.A00(userSession).A00, 36325867022660919L) && (reelsTrayQueryResponseImpl = (ReelsTrayQueryResponseImpl) r9.A01) != null) {
            AnonymousClass4Z6 r3 = this.A00;
            C239753Ia A002 = Co7.A00(reelsTrayQueryResponseImpl).FH3();
            1E4.A00(userSession);
            1KS.A02(r3, A002, r6, -1, r9.CPt());
        }
        AnonymousClass0fD.A0A(-786544813, A0D);
        AnonymousClass0fD.A0A(-1989209851, A03);
    }
}
