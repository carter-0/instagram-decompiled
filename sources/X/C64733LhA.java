package X;

import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationPluginImpl;
import java.util.Map;

/* renamed from: X.LhA  reason: case insensitive filesystem */
public final class C64733LhA implements 1DN {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ LocationPluginImpl A01;
    public final /* synthetic */ C66494MTx A02;
    public final /* synthetic */ C16530Uwa A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C64733LhA(UserSession userSession, LocationPluginImpl locationPluginImpl, C66494MTx mTx, C16530Uwa uwa, String str, boolean z) {
        this.A01 = locationPluginImpl;
        this.A05 = z;
        this.A02 = mTx;
        this.A00 = userSession;
        this.A04 = str;
        this.A03 = uwa;
    }

    public final void DWm(Map map) {
        String str;
        if (this.A05) {
            str = "android.permission.ACCESS_FINE_LOCATION";
        } else {
            str = "android.permission.ACCESS_COARSE_LOCATION";
        }
        C346927vz r1 = (C346927vz) map.get(str);
        C66494MTx mTx = this.A02;
        if (r1 == null) {
            r1 = C346927vz.DENIED;
        }
        mTx.DWl(r1);
        LocationPluginImpl.A05(this.A00, this.A04, this.A03.name(), map);
    }
}
