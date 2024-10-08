package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.91l  reason: invalid class name and case insensitive filesystem */
public final class C3725791l {
    public final 0wc A00;

    public static final void A00(C3725791l r2, String str, String str2, String str3, Map map) {
        0wc r22 = r2.A00;
        0Aj A002 = r22.A00(r22.A00, "direct_in_thread_ctd_banner");
        if (A002.isSampled()) {
            A002.AAJ("action", str);
            A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            List singletonList = Collections.singletonList(str3);
            0qQ.A07(singletonList);
            A002.AAe(C66579MXk.A00(39), singletonList);
            A002.A9H("extra_client_data", map);
            A002.Cgf();
        }
    }

    public final void A01(String str, String str2, String str3, String str4) {
        A00(this, "direct_in_thread_ctd_banner_cta_click", str, str2, 0Yt.A06(new 0eP[]{new 0eP("cta_type", str3), new 0eP("media_id", str4)}));
    }

    public C3725791l(AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}
