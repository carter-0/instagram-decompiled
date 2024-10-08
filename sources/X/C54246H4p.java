package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.H4p  reason: case insensitive filesystem */
public final class C54246H4p extends 1P0 {
    public final 1P0 A00;
    public final 1Xj A01;
    public final String A02 = "approve";
    public final /* synthetic */ C55835HoI A03;

    public C54246H4p(1P0 r2, 1Xj r3, C55835HoI hoI) {
        this.A03 = hoI;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(1985534818);
        C59689JTv.A0F(this.A03.A00.requireContext(), "people_tagging_modify_photos_of_you_failure", 2131969350);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onFail(r5);
        }
        AnonymousClass0fD.A0A(441072151, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(727615957);
        this.A03.A05.decrementAndGet();
        AnonymousClass0fD.A0A(1150987493, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-474743713);
        int A033 = AnonymousClass0fD.A03(-1780533028);
        C54246H4p.super.onSuccess(obj);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onSuccess(obj);
        }
        AnonymousClass0fD.A0A(595661695, A033);
        AnonymousClass0fD.A0A(1693726288, A032);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(-984012355);
        int A033 = AnonymousClass0fD.A03(-551539366);
        1Xj r3 = this.A01;
        boolean equals = this.A02.equals("approve");
        r3.A0C.Efg(Boolean.valueOf(equals));
        UserSession userSession = this.A03.A03;
        r3.AE7(userSession);
        if (equals) {
            AnonymousClass1Nd.A00(userSession).A00(new Object());
        }
        AnonymousClass0fD.A0A(-1986979828, A033);
        AnonymousClass0fD.A0A(-2065845023, A032);
    }
}
