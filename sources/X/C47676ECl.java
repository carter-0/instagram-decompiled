package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ECl  reason: case insensitive filesystem */
public final class C47676ECl extends 1P0 {
    public final /* synthetic */ FAK A00;

    public C47676ECl(FAK fak) {
        this.A00 = fak;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-35285632);
        DbZ.A0s(2131961936);
        AnonymousClass0fD.A0A(645294295, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-246074596);
        C46445Df7.A00(this.A00.A00.mView, false);
        AnonymousClass0fD.A0A(2027852007, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1071380075);
        C46445Df7.A00(this.A00.A00.mView, true);
        AnonymousClass0fD.A0A(1734531395, A03);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1254469947);
        Dw4 dw4 = (Dw4) obj;
        int A032 = AnonymousClass0fD.A03(-1480323978);
        FAK fak = this.A00;
        UserSession userSession = fak.A02;
        AnonymousClass1Nd.A00(userSession).A00(new Object());
        0eE r2 = AnonymousClass0t1.A01;
        r2.A01(userSession).A0Z();
        17h.A00(userSession).A03(r2.A01(userSession));
        C49952FGh.A05(fak.A00.requireContext(), dw4.A00, dw4.A01);
        AnonymousClass0fD.A0A(-199737143, A032);
        AnonymousClass0fD.A0A(1972172603, A03);
    }
}
