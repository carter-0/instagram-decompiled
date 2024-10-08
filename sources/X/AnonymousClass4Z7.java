package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4Z7  reason: invalid class name */
public final class AnonymousClass4Z7 extends 1P0 {
    public final /* synthetic */ AnonymousClass4Z5 A00;
    public final /* synthetic */ 1KS A01;

    public AnonymousClass4Z7(AnonymousClass4Z5 r1, 1KS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1450916993);
        AnonymousClass4Z7.super.onStart();
        C638918c.A01(C61170le.A00).A0G();
        AnonymousClass0fD.A0A(-1023039689, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-645130341);
        AnonymousClass3HO r9 = (AnonymousClass3HO) obj;
        int A032 = AnonymousClass0fD.A03(-551054691);
        0qQ.A0B(r9, 0);
        C638918c.A01(C61170le.A00).A0H();
        1KS r7 = this.A01;
        UserSession userSession = r7.A03;
        if (182.A06(0Tu.A05, 1NM.A00(userSession).A00, 36325867022660919L)) {
            AnonymousClass4Z5 r3 = this.A00;
            C239753Ia A002 = r9.FH3();
            1E4.A00(userSession);
            1KS.A02(r3, A002, r7, -1, r9.CPt());
        }
        AnonymousClass0fD.A0A(-1234526842, A032);
        AnonymousClass0fD.A0A(411488225, A03);
    }
}
