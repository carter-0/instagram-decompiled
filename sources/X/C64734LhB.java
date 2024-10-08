package X;

import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationPluginImpl;
import java.util.Map;

/* renamed from: X.LhB  reason: case insensitive filesystem */
public final class C64734LhB implements 1DN {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ LocationPluginImpl A01;
    public final /* synthetic */ C66494MTx A02;
    public final /* synthetic */ C16530Uwa A03;
    public final /* synthetic */ MSX A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String[] A06;

    public C64734LhB(UserSession userSession, LocationPluginImpl locationPluginImpl, C66494MTx mTx, C16530Uwa uwa, MSX msx, String str, String[] strArr) {
        this.A01 = locationPluginImpl;
        this.A06 = strArr;
        this.A02 = mTx;
        this.A00 = userSession;
        this.A05 = str;
        this.A03 = uwa;
        this.A04 = msx;
    }

    public final void DWm(Map map) {
        C346927vz A012 = 1DL.A01(map, this.A06);
        this.A02.DWl(A012);
        LocationPluginImpl locationPluginImpl = this.A01;
        UserSession userSession = this.A00;
        String str = this.A05;
        LocationPluginImpl.A05(userSession, str, this.A03.name(), map);
        if (A012 == C346927vz.GRANTED) {
            LocationPluginImpl.A03(userSession, locationPluginImpl, this.A04, str);
        }
    }
}
