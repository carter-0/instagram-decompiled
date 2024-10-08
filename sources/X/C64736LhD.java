package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationPluginImpl;
import java.util.Map;

/* renamed from: X.LhD  reason: case insensitive filesystem */
public final class C64736LhD implements 1DN {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ LocationPluginImpl A02;
    public final /* synthetic */ C267874cM A03;
    public final /* synthetic */ C66494MTx A04;
    public final /* synthetic */ C16530Uwa A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public C64736LhD(Activity activity, UserSession userSession, LocationPluginImpl locationPluginImpl, C267874cM r4, C66494MTx mTx, C16530Uwa uwa, String str, String str2, boolean z) {
        this.A02 = locationPluginImpl;
        this.A08 = z;
        this.A04 = mTx;
        this.A01 = userSession;
        this.A06 = str;
        this.A05 = uwa;
        this.A00 = activity;
        this.A07 = str2;
        this.A03 = r4;
    }

    public final void DWm(Map map) {
        String str;
        boolean z = this.A08;
        boolean z2 = true;
        if (z) {
            str = "android.permission.ACCESS_FINE_LOCATION";
        } else {
            str = "android.permission.ACCESS_COARSE_LOCATION";
        }
        C346927vz r1 = (C346927vz) map.get(str);
        C66494MTx mTx = this.A04;
        if (r1 == null) {
            r1 = C346927vz.DENIED;
        }
        mTx.DWl(r1);
        if (map.get(str) != C346927vz.GRANTED) {
            z2 = false;
        }
        LocationPluginImpl locationPluginImpl = this.A02;
        UserSession userSession = this.A01;
        String str2 = this.A06;
        C16530Uwa uwa = this.A05;
        LocationPluginImpl.A05(userSession, str2, uwa.name(), map);
        Activity activity = this.A00;
        String str3 = this.A07;
        if (z2) {
            LocationPluginImpl.A00(activity, userSession, locationPluginImpl, uwa, "app_permission_grant", str3, z);
            LocationPluginImpl.A02(userSession, locationPluginImpl, this.A03, str2, false);
            return;
        }
        LocationPluginImpl.A00(activity, userSession, locationPluginImpl, uwa, "app_permission_deny", str3, z);
    }
}
