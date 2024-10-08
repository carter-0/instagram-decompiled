package X;

import android.content.SharedPreferences;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

public final class RA9 extends 0ng {
    public final /* synthetic */ C7580QKv A00;
    public final /* synthetic */ QLA A01;

    public final void run() {
        C7580QKv qKv = this.A00;
        SharedPreferences sharedPreferences = 23d.A02;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("cross_app", (String) null);
            SharedPreferences sharedPreferences2 = 23d.A02;
            if (sharedPreferences2 != null) {
                String string2 = sharedPreferences2.getString(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, (String) null);
                SharedPreferences sharedPreferences3 = 23d.A02;
                if (sharedPreferences3 != null) {
                    String string3 = sharedPreferences3.getString("recent", (String) null);
                    C10860RzL rzL = qKv.A0b.A00;
                    S0F s0f = qKv.A0c;
                    C51972G9s.A1D(rzL, s0f);
                    C61084JwM jwM = rzL.A0M;
                    jwM.A00 = SKH.A01(s0f, string);
                    jwM.A01 = SKH.A01(s0f, string2);
                    jwM.A02 = SKH.A01(s0f, string3);
                    return;
                }
            }
        }
        0qQ.A0F("walletContactDataStore");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RA9(C7580QKv qKv, QLA qla) {
        super(2115235502);
        this.A00 = qKv;
        this.A01 = qla;
    }
}
