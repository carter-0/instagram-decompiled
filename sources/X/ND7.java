package X;

import com.facebook.rsys.hdvideo.gen.HdVideoApi;
import com.facebook.rsys.hdvideo.gen.HdVideoProxy;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class ND7 extends HdVideoProxy {
    public final UserSession A00;
    public final 1Av A01;

    public final void onVideoQualityChanged(Map map) {
    }

    public final void setApi(HdVideoApi hdVideoApi) {
    }

    public final boolean getHdVideoUserPreference() {
        return this.A01.A22(this.A00);
    }

    public ND7(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = 1Au.A00(userSession);
    }
}
