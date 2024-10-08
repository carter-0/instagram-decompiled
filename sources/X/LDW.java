package X;

import com.instagram.common.session.UserSession;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;

public final class LDW {
    public MediaKitEntryPoint A00 = MediaKitEntryPoint.UNKNOWN;
    public String A01;
    public String A02 = "";
    public final UserSession A03;

    public final void A00(MediaKitEntryPoint mediaKitEntryPoint) {
        0qQ.A0B(mediaKitEntryPoint, 0);
        this.A02 = "";
        this.A01 = null;
        this.A00 = mediaKitEntryPoint;
        this.A02 = AnonymousClass7TF.A0b();
    }

    public LDW(UserSession userSession) {
        this.A03 = userSession;
    }
}
