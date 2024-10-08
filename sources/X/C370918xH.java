package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Map;

/* renamed from: X.8xH  reason: invalid class name and case insensitive filesystem */
public final class C370918xH {
    public final 0wc A00;

    public final void A00(String str, Map map, String str2) {
        0qQ.A0B(map, 2);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, AnonymousClass000.A00(3311));
        if (A002.isSampled()) {
            if (str2 != null) {
                map.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            }
            A002.AAJ("step", str);
            A002.AAJ("surface", "direct_nudge_android");
            A002.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "tags");
            A002.AAJ("entrypoint", "tag_direct");
            A002.A9H("extra_values", map);
            A002.Cgf();
        }
    }

    public C370918xH(AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}
