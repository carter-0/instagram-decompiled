package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.ECc  reason: case insensitive filesystem */
public final class C47668ECc extends 1P0 {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ 1Ng A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public C47668ECc(1P0 r1, 1Ng r2, UserSession userSession, User user, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = user;
        this.A05 = z2;
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A032 = AnonymousClass0fD.A03(-154058152);
        this.A00.onFail(r3);
        AnonymousClass0fD.A0A(-367739987, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1078675065);
        int A033 = AnonymousClass0fD.A03(-2118254998);
        this.A00.onSuccess(obj);
        AnonymousClass0fD.A0A(-908905883, A033);
        AnonymousClass0fD.A0A(1077100547, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(-84272435);
        int A033 = AnonymousClass0fD.A03(-794947327);
        boolean z = this.A04;
        if (z) {
            this.A03.A17(false);
        }
        boolean z2 = this.A05;
        if (z2) {
            User user = this.A03;
            user.A18(false);
            1OP.A05(this.A02).A0b(user, false);
        }
        this.A01.A00(new C2370736f(this.A03, z, z2, false, false));
        AnonymousClass0fD.A0A(1546081850, A033);
        AnonymousClass0fD.A0A(448065224, A032);
    }
}
