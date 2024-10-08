package X;

import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9EJ  reason: invalid class name */
public final class AnonymousClass9EJ {
    public static final long A00 = TimeUnit.MINUTES.toMillis(5);
    public static final AnonymousClass9EJ A01 = new Object();

    public static final void A00(Context context, UserSession userSession, String str, String str2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 4);
        String A04 = 0qv.A02.A04(context);
        if (A04 != null && A04.length() != 0) {
            String str3 = str;
            if (str3.length() > 0) {
                String str4 = str2;
                if (str4.length() > 0) {
                    2IS r5 = new 2IS();
                    2IS r4 = new 2IS();
                    r5.A04(Dbq.A05(208, 9, 16), A04);
                    r5.A04("qe_universe", str3);
                    r5.A04("param_name", str4);
                    r5.A02("default_value", false);
                    AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGFXGrowthLogExposureDeviceIdQEBoolParamMutation", r5.getParamsCopy(), r4.getParamsCopy(), C382979ep.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_growth_device_id_qe_bool_param_log_exposure", new ArrayList());
                    1vm.A01(userSession2).ATL(C40122ASn.A00, C40132ASx.A00, pandoGraphQLRequest);
                    return;
                }
                throw new IllegalStateException("paramName parameter can't be empty");
            }
            throw new IllegalStateException("qeUniverse parameter can't be empty");
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.9EK, X.11X] */
    public static final void A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A06, userSession, 36310409434824755L)) {
            1ES.A03(new AnonymousClass9EK(userSession));
        }
    }

    public static final void A02(UserSession userSession, AnonymousClass3JC r9) {
        String str;
        C250663lr optionalTreeField;
        if (!userSession.hasEnded()) {
            Object obj = r9.A01;
            if (obj == null) {
                0KC.A0C("FxExperimentationHelper", "Error: null response");
                str = AnonymousClass000.A00(460);
            } else {
                C250663lr r3 = (C250663lr) obj;
                if (r3 == null || (optionalTreeField = r3.getOptionalTreeField(0, "fx_linked_accounts", C296225pg.class, -1226620548)) == null) {
                    0KC.A0C("FxExperimentationHelper", "Error: getFxLinkedAccounts() returns null");
                    str = "FxLinkedAccounts in IGFxLinkedAccountsQueryResponse is null";
                } else {
                    0xa A03 = 1Al.A01(userSession).A03(1An.A1T);
                    optionalTreeField.getCoercedBooleanField(0, "linked_account_has_fx");
                    0xY AR4 = A03.AR4();
                    String str2 = userSession.A06;
                    AR4.E5T(002.A0R(str2, "_fx_experiment_linked_account_has_fx"), optionalTreeField.getCoercedBooleanField(0, "linked_account_has_fx"));
                    AR4.apply();
                    optionalTreeField.getCoercedBooleanField(1, "linked_account_has_fx_in_cl");
                    0xY AR42 = A03.AR4();
                    AR42.E5T(002.A0R(str2, "_fx_experiment_linked_account_has_fx_in_cl"), optionalTreeField.getCoercedBooleanField(1, "linked_account_has_fx_in_cl"));
                    AR42.apply();
                    optionalTreeField.getCoercedBooleanField(2, "cac_destination_migration_enabled");
                    0xY AR43 = A03.AR4();
                    AR43.E5T(002.A0R(str2, "_fx_experiment_cac_dest_migration_enabled"), optionalTreeField.getCoercedBooleanField(2, "cac_destination_migration_enabled"));
                    AR43.apply();
                    optionalTreeField.getCoercedBooleanField(3, "cac_creator_destination_migration_enabled");
                    0xY AR44 = A03.AR4();
                    AR44.E5T(002.A0R(str2, "_fx_experiment_cac_creator_dest_migration_enabled"), optionalTreeField.getCoercedBooleanField(3, "cac_creator_destination_migration_enabled"));
                    AR44.apply();
                    optionalTreeField.getCoercedBooleanField(4, "cac_destination_picker_enabled");
                    0xY AR45 = A03.AR4();
                    AR45.E5T(002.A0R(str2, "_fx_experiment_cac_dest_picker_enabled"), optionalTreeField.getCoercedBooleanField(4, "cac_destination_picker_enabled"));
                    AR45.apply();
                    optionalTreeField.getCoercedBooleanField(5, "should_delete_invalid_tokens_for_business_users");
                    0xY AR46 = A03.AR4();
                    AR46.E5T(002.A0R(str2, "_fx_experiment_should_delete_invalid_tokens_for_business_users"), optionalTreeField.getCoercedBooleanField(5, "should_delete_invalid_tokens_for_business_users"));
                    AR46.apply();
                    return;
                }
            }
            0wb.A03("FxExperimentationHelper", str);
        }
    }
}
