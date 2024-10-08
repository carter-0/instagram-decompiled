package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.7IR  reason: invalid class name */
public final class AnonymousClass7IR {
    public final 0wc A00;
    public final UserSession A01;

    public AnonymousClass7IR(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A01(C254783t2 r5, Long l, String str) {
        String str2;
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_media_gallery_tap");
        if (A002.isSampled()) {
            if (r5 != null) {
                str2 = AnonymousClass4KK.A02(r5);
            } else {
                str2 = null;
            }
            A002.AAJ("open_thread_id", str2);
            A002.AAJ("media_type", str);
            A002.A9F("position_index", l);
            A002.AAJ("creation_session_id", (String) null);
            A002.Cgf();
        }
    }

    public final void A02(C254783t2 r4, 0sn r5, boolean z, boolean z2) {
        0qQ.A0B(r4, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_composer_tap_sticker");
        if (A002.isSampled()) {
            if (r5 == null) {
                r5 = 0sn.A00;
            }
            A002.AAe("recipient_ids", r5);
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, C66579MXk.A00(395));
            A002.A7p("is_reply_flow", Boolean.valueOf(z));
            A002.AAJ("open_thread_id", AnonymousClass4KK.A02(r4));
            A002.A9F("occamadillo_thread_id", AnonymousClass4KK.A01(r4));
            A002.A7p("is_e2ee", Boolean.valueOf(AnonymousClass6W3.A07(r4)));
            A002.A7p("is_bottom_sheet_thread", Boolean.valueOf(z2));
            A002.Cgf();
        }
    }

    public final void A00(XSV xsv, C254783t2 r6, Long l, String str, String str2, List list, List list2) {
        String str3;
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_composer_tap");
        if (A002.isSampled()) {
            A002.AAJ("target", str);
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
            A002.A8M(xsv, "thread_type");
            A002.A9F("num_images", l);
            A002.AAe("recipient_ids", list);
            A002.AAe("commands", list2);
            Boolean bool = null;
            if (r6 != null) {
                str3 = AnonymousClass4KK.A02(r6);
            } else {
                str3 = null;
            }
            A002.AAJ("open_thread_id", str3);
            if (r6 != null) {
                bool = Boolean.valueOf(AnonymousClass6W3.A07(r6));
            }
            A002.A7p("is_e2ee", bool);
            A002.Cgf();
        }
    }
}
