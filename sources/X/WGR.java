package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;

public final class WGR implements CallerContextable {
    public static final String __redex_internal_original_name = "SecondaryBottomSheetController";
    public final UserSession A00;
    public final C18747Vzh A01;
    public final MediaMapFragment A02;

    public WGR(UserSession userSession, MediaMapFragment mediaMapFragment) {
        this.A02 = mediaMapFragment;
        this.A00 = userSession;
        this.A01 = new C18747Vzh(userSession);
    }
}
