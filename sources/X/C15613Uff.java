package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Uff  reason: case insensitive filesystem */
public final class C15613Uff extends 1P0 {
    public final UserSession A00;
    public final C324356z9 A01;
    public final C324586zZ A02;
    public final Dda A03;

    public C15613Uff(UserSession userSession, C324356z9 r2, C324586zZ r3, Dda dda) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = dda;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, 1022975439);
        this.A01.A03.A00(AnonymousClass05K.A01);
        C324586zZ r2 = this.A02;
        Throwable A012 = r5.A01();
        if (A012 == null) {
            A012 = new Throwable("Unknown error has occurred when fetching Profile Timeline via GraphQL");
        }
        r2.onFail(new C268664dn(A012));
        AnonymousClass0fD.A0A(-985270725, A0D);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1148347186);
        this.A02.onFinish();
        AnonymousClass0fD.A0A(781518849, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1950334214);
        this.A01.A03.A00(AnonymousClass05K.A00);
        this.A02.onStart();
        AnonymousClass0fD.A0A(-801077923, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(-589193703);
        AnonymousClass3JD r6 = (AnonymousClass3JD) obj;
        int A0D = AnonymousClass7TG.A0D(r6, -69311099);
        Dda dda = this.A03;
        if (dda != null) {
            dda.A0E("profile_on_data_bg");
            dda.A0E("profile_graphql_model_conversion_start");
        }
        C273664mz A002 = B6X.A00(r6, this.A00);
        if (dda != null) {
            dda.A0E("profile_graphql_model_conversion_end");
        }
        11Z.A02(new C20236Wna(this, A002));
        AnonymousClass0fD.A0A(-135476817, A0D);
        AnonymousClass0fD.A0A(-1143116848, A032);
    }
}
