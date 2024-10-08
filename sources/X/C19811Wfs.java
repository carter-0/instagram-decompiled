package X;

import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wfs  reason: case insensitive filesystem */
public final class C19811Wfs implements XAF {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ V43 A01;
    public final /* synthetic */ 1WW A02;

    public final /* bridge */ /* synthetic */ Object DTf(C17678Vc9 vc9, Object obj, int i) {
        if (i != 1) {
            return null;
        }
        int i2 = -1;
        int i3 = -1;
        V43 v43 = this.A01;
        String str = v43.A06;
        C15310UaH uaH = v43.A03;
        if (uaH.A00 == uaH.A01 - 1) {
            i2 = 2131960992;
            i3 = 6;
        }
        C15289UZu A002 = VFR.A00(str, 2131969995, i3, 3, i2, 2131969991, 2131969992);
        A002.mArguments.getClass();
        AnonymousClass0Dg.A00(A002.mArguments, this.A00);
        Bundle bundle = A002.mArguments;
        0qQ.A0B(bundle, 0);
        bundle.putString("DynamicFlowPlugin.extraFlowId", "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
        0s1 A0C = DbW.A0C(v43.A03);
        String obj2 = V1b.ADD_BIO.toString();
        A0C.A0I(obj2);
        A0C.A0D(A002, obj2, R.id.content_panel);
        A0C.A00();
        return null;
    }

    public C19811Wfs(UserSession userSession, V43 v43, 1WW r3) {
        this.A02 = r3;
        this.A01 = v43;
        this.A00 = userSession;
    }
}
