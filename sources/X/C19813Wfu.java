package X;

import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wfu  reason: case insensitive filesystem */
public final class C19813Wfu implements XAF {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ V43 A01;
    public final /* synthetic */ 1WW A02;

    public final /* bridge */ /* synthetic */ Object DTf(C17678Vc9 vc9, Object obj, int i) {
        if (i == 1) {
            Bundle bundle = new Bundle();
            bundle.putString("DynamicFlowPlugin.extraFlowId", "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
            AnonymousClass35B.A00().A01();
            UserSession userSession = this.A00;
            V43 v43 = this.A01;
            C15310UaH uaH = v43.A03;
            int i2 = 2131968361;
            if (uaH.A00 == uaH.A01 - 1) {
                i2 = 2131960992;
            }
            C47490E4u e4u = new C47490E4u();
            DbU.A1D(bundle, userSession);
            bundle.putBoolean(AnonymousClass000.A00(3094), true);
            bundle.putBoolean(AnonymousClass000.A00(3093), false);
            bundle.putBoolean(AnonymousClass000.A00(3096), false);
            bundle.putInt(AnonymousClass000.A00(3095), i2);
            e4u.setArguments(bundle);
            0s1 A0C = DbW.A0C(v43.A03);
            String obj2 = V1b.ADD_PROFILE_PICTURE.toString();
            A0C.A0I(obj2);
            A0C.A0C(e4u, obj2, R.id.content_panel);
            A0C.A00();
        }
        return this.A01;
    }

    public C19813Wfu(UserSession userSession, V43 v43, 1WW r3) {
        this.A02 = r3;
        this.A00 = userSession;
        this.A01 = v43;
    }
}
