package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: X.7wr  reason: invalid class name and case insensitive filesystem */
public final class C347467wr {
    public boolean A00;
    public final AnonymousClass4HW A01 = new AnonymousClass4HW(AnonymousClass4HU.A00);
    public final UserSession A02;

    public final void A00() {
        AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.AOJ(1411648610, 3));
        C376909Ju r2 = new C376909Ju(this, (AnonymousClass4D7) null, 5);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A022);
    }

    public final void A01(boolean z) {
        String str;
        UserSession userSession = this.A02;
        0xY AR4 = C347757xK.A00(userSession).A00.AR4();
        boolean z2 = z;
        AR4.E5T(AnonymousClass000.A00(4386), z2);
        AR4.apply();
        AnonymousClass1Nd.A00(userSession).A05(new C64652Lfe(z2));
        if (z) {
            str = "ON";
        } else {
            str = "OFF";
        }
        AnonymousClass0K0 r5 = GraphQlCallInput.A02;
        String obj = UUID.randomUUID().toString();
        0Df A022 = r5.A02();
        0Df.A00(A022, obj, "client_mutation_id");
        0Df.A00(A022, str, "setting");
        2IS r6 = new 2IS();
        2IS r52 = new 2IS();
        r6.A00.A02().A0E(A022, "data");
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "SetThreadsUserPreferredCrosspostSetting", r6.getParamsCopy(), r52.getParamsCopy(), C42688Bgl.class, true, (PandoRealtimeInfoJNI) null, 64, (String) null, "xcxp_set_threads_feed_crosspost_user_preference", new ArrayList());
        AnonymousClass19S A023 = 19E.A02(AnonymousClass12T.A00.AOJ(1411648610, 3));
        1Eo.A05(19B.A00, new C58104ImQ(pandoGraphQLRequest, this, (AnonymousClass4D7) null, 30), A023);
        2D6 A002 = 2D5.A00(userSession);
        if (!z && !A002.A0D(A002.A01)) {
            0xY AR42 = A002.A04.AR4();
            AR42.E5c("PREFERENCE_THREADS_FEED_CROSSPOST_SETTING_LAST_DISABLED_SECONDS", System.currentTimeMillis() / 1000);
            AR42.apply();
        }
        A002.A01 = System.currentTimeMillis();
    }

    public final boolean A02() {
        MXB CGy;
        C347427wn r0 = (C347427wn) C347397wk.A00(this.A02).A02.getValue();
        if (r0 == null || (CGy = r0.CGy()) == null || CGy.getId() == null) {
            return false;
        }
        return true;
    }

    public C347467wr(UserSession userSession) {
        this.A02 = userSession;
    }
}
