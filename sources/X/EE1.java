package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import java.io.IOException;
import java.util.ArrayList;

public final class EE1 extends C252233om {
    public final /* synthetic */ EEM A00;

    public EE1(EEM eem) {
        this.A00 = eem;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C49512Ewr ewr;
        EEM eem = this.A00;
        CallerContext callerContext = EEM.A0B;
        if (i2 == -1 && intent != null && i == intent.getIntExtra("argument_requested_code", -1)) {
            boolean booleanExtra = intent.getBooleanExtra("result_action_positive", false);
            String stringExtra = intent.getStringExtra("argument_access_token");
            if (booleanExtra) {
                if (stringExtra != null) {
                    Bundle bundleExtra = intent.getBundleExtra("argument_client_extras_bundle");
                    if (bundleExtra == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    } else if (!(bundleExtra.getString("extra_cal_fb_user_id") == null || bundleExtra.getStringArrayList("extra_cal_usernames") == null || bundleExtra.getStringArray("extra_cal_usernames_with_metadata") == null)) {
                        09i.A0A.A07(DbX.A0C(stringExtra));
                        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("extra_cal_usernames");
                        stringArrayList.getClass();
                        String[] stringArray = bundleExtra.getStringArray("extra_cal_usernames_with_metadata");
                        stringArray.getClass();
                        ArrayList A0v = DbS.A0v(r2);
                        for (String A002 : stringArray) {
                            try {
                                ewr = C49113Epc.parseFromJson(16P.A00(A002));
                            } catch (IOException unused) {
                                ewr = null;
                            }
                            A0v.add(ewr);
                        }
                        EEM.A06(eem, bundleExtra.getString("extra_cal_tos_version"), stringExtra, stringArrayList, A0v, true, bundleExtra.getBoolean("extra_cal_force_signup_with_fb_after_cp_claiming"));
                        return;
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else if (stringExtra == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (intent.getBundleExtra("argument_client_extras_bundle") == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            EEM.A03(eem);
        }
    }
}
