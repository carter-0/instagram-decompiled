package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wfy  reason: case insensitive filesystem */
public final class C19817Wfy implements XAF {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ V43 A02;
    public final /* synthetic */ 1WW A03;

    public C19817Wfy(FragmentActivity fragmentActivity, UserSession userSession, V43 v43, 1WW r4) {
        this.A03 = r4;
        this.A02 = v43;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.WNI, java.lang.Object, X.4bz] */
    public final /* bridge */ /* synthetic */ Object DTf(C17678Vc9 vc9, Object obj, int i) {
        V43 v43 = this.A02;
        UserSession userSession = this.A01;
        int A002 = VFS.A00(DbT.A0j(userSession));
        if (A002 > 0) {
            C15310UaH uaH = new C15310UaH();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_number_of_steps", A002);
            DbU.A1D(bundle, userSession);
            uaH.setArguments(bundle);
            v43.A03 = uaH;
            uaH.mArguments.getClass();
            Bundle bundle2 = uaH.mArguments;
            0qQ.A0B(bundle2, 0);
            bundle2.putString("DynamicFlowPlugin.extraFlowId", "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
            C309516Yo r2 = new C309516Yo(this.A00, userSession);
            v43.A00 = r2;
            r2.A0E(uaH);
            String obj2 = V1b.ENTRY_POINT.toString();
            r2.A0A = obj2;
            r2.A0C = obj2;
            String str = userSession.A06;
            ? obj3 = new Object();
            obj3.A00 = str;
            r2.A07 = obj3;
            r2.A07();
            return null;
        }
        throw new IllegalStateException("Number of steps must be greater than 0.");
    }
}
