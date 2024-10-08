package X;

import android.content.Context;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

public final class IMM implements C270754hF {
    public final ClipsViewerSource A00;
    public final String A01;

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        return I2R.A01(this.A00, userSession, this.A01, (String) null);
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        return I2R.A01(this.A00, userSession, this.A01, str);
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public IMM(ClipsViewerSource clipsViewerSource, String str) {
        this.A01 = str;
        this.A00 = clipsViewerSource;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}
