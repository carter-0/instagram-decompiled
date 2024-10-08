package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;

/* renamed from: X.ERl  reason: case insensitive filesystem */
public final class C48022ERl extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DataSaverNetworkOptionsFragment";
    public UserSession A00;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131957406);
    }

    public final String getModuleName() {
        return "data_saver_network_options";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(744448440);
        super.onCreate(bundle);
        this.A00 = DbX.A0V(this);
        AnonymousClass0fD.A09(1415919697, A02);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(1663779351);
        super.onResume();
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        DbV.A1V("0", getString(2131957401), A1C2);
        DbV.A1V(RealtimeSubscription.GRAPHQL_MQTT_VERSION, getString(2131957405), A1C2);
        DbV.A1V("2", getString(2131957404), A1C2);
        ES7 targetFragment = getTargetFragment();
        if (targetFragment != null) {
            ES7 es7 = targetFragment;
            0qQ.A0A(es7);
            UserSession userSession = es7.A00;
            if (userSession != null) {
                DbU.A1F(new FQU(this, 5), String.valueOf(1Q3.A00(userSession).A00()), A1C, A1C2);
                setItems(A1C);
                AnonymousClass0fD.A09(1244429355, A02);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }
}
