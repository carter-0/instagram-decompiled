package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;

/* renamed from: X.UtO  reason: case insensitive filesystem */
public final class C16349UtO extends VU1 {
    public final C16345UtK A00;
    public final UpcomingEventLiveMetadata A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C20698WxU((Object) this, 34));

    public final void A00(1Xj r9) {
        C16345UtK utK = this.A00;
        UpcomingEvent upcomingEvent = utK.A00;
        ((C310306am) this.A00.getValue()).A04(upcomingEvent, r9.getId(), "watch_igtv", utK.A02.getModuleName());
        String BeF = this.A01.BeF();
        if (BeF != null) {
            UserSession userSession = utK.A01;
            FragmentActivity fragmentActivity = utK.A00;
            C270634h3 r2 = new C270634h3(ClipsViewerSource.POST_LIVE, userSession);
            r2.A1C = 002.A0T(BeF, DbX.A0r(upcomingEvent.BZw()), '_');
            r2.A1S = true;
            C250563lf.A0Y(fragmentActivity, r2.A00(), userSession);
        }
    }

    public final void A01(1Xj r8) {
        C16345UtK utK = this.A00;
        ((C310306am) this.A00.getValue()).A04(utK.A00, r8.getId(), "start_live", utK.A02.getModuleName());
        C63468KxX.A00();
        FragmentActivity fragmentActivity = utK.A00;
        UserSession userSession = utK.A01;
        28D r3 = 28D.A5K;
        Bundle bundle = new Bundle();
        bundle.putParcelable("camera_configuration", C358098aM.A00(AnonymousClass80L.A00, new C358088aL[0]));
        bundle.putSerializable("camera_entry_point", r3);
        Dba.A0l(fragmentActivity, bundle, userSession, "attribution_quick_camera_fragment");
    }

    public final void A02(1Xj r6, MT8 mt8) {
        C16345UtK utK = this.A00;
        ((C310306am) this.A00.getValue()).A04(utK.A00, r6.getId(), "watch_igtv", utK.A02.getModuleName());
        String Ai3 = this.A01.Ai3();
        if (Ai3 != null) {
            VU2 vu2 = (VU2) this.A02.getValue();
            1OC A06 = LTC.A06(vu2.A01, Ai3, true);
            A06.A00 = new C61499KAe(15, mt8, vu2);
            1ES.A03(A06);
        }
    }

    public C16349UtO(C16345UtK utK, UpcomingEventLiveMetadata upcomingEventLiveMetadata) {
        super(utK);
        this.A00 = utK;
        this.A01 = upcomingEventLiveMetadata;
    }
}
