package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8O0  reason: invalid class name */
public final class AnonymousClass8O0 implements AnonymousClass8O1 {
    public final /* synthetic */ AnonymousClass8BA A00;

    public AnonymousClass8O0(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final void Cht(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        28t r4;
        AnonymousClass8BA r2 = this.A00;
        if (r2.A14.A01() == C365758nd.A07) {
            r4 = 28t.A06;
        } else {
            r4 = 28t.A05;
        }
        UserSession userSession = r2.A0v;
        0qQ.A0B(userSession, 0);
        AnonymousClass29Q r5 = 27p.A01(userSession).A07;
        0wc r22 = r5.A01;
        0Aj A002 = r22.A00(r22.A00, "ig_camera_end_session");
        if (r5.A0P() && A002.isSampled()) {
            A002.AAJ("entity", "DOODLE");
            A002.AAJ("legacy_falco_event_name", "IG_CAMERA_END_DOODLE_SESSION");
            AnonymousClass283 r23 = r5.A04;
            String str = r23.A0L;
            if (str == null) {
                str = "";
            }
            A002.AAJ("camera_session_id", str);
            A002.A8M(r5.A0J(), "camera_destination");
            int i7 = 2;
            A002.A8k("event_type", 2);
            if (r23.A01 != 2) {
                i7 = 1;
            }
            A002.A8k("camera_position", Integer.valueOf(i7));
            A002.A8M(r5.A0I(), "capture_type");
            A002.A8M(r23.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A8M(r4, "media_type");
            A002.AAJ("module", 27x.A08.getModuleName());
            A002.A8M(r23.A0C, "surface");
            A002.A9F("doodle_color_count", Long.valueOf((long) i));
            A002.A9F("doodle_max_brush_size", Long.valueOf((long) i2));
            A002.A9F("doodle_size_count", Long.valueOf((long) i3));
            A002.A9F("doodle_stroke_count", Long.valueOf((long) i4));
            A002.A9F("doodle_style_count", Long.valueOf((long) i5));
            A002.A9F("doodle_undo_count", Long.valueOf((long) i6));
            A002.AAJ("discovery_session_id", r23.A0O);
            A002.AAJ("search_session_id", r23.A0P);
            A002.AAJ("composition_str_id", r23.A0M);
            A002.A8M(r4, "composition_media_type");
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.A9F("capture_format_index", 0L);
            A002.AAJ("device_aspect_ratio_category", C254473sX.A00);
            A002.AAJ("device_fold_orientation", C254483sY.A00);
            A002.AAJ("device_fold_state", C254493sZ.A00);
            A002.A7p("device_is_in_multi_window_mode", C254503sa.A00);
            A002.Cgf();
        }
    }

    public final void CkX() {
        UserSession userSession = this.A00.A0v;
        0qQ.A0B(userSession, 0);
        AnonymousClass29X r4 = 27p.A01(userSession).A0D;
        0wc r2 = r4.A01;
        0Aj A002 = r2.A00(r2.A00, "ig_camera_start_session");
        if (r4.A0P() && A002.isSampled()) {
            A002.AAJ("legacy_falco_event_name", "IG_CAMERA_START_DOODLE_SESSION");
            A002.AAJ("entity", "DOODLE");
            AnonymousClass283 r3 = r4.A04;
            String str = r3.A0L;
            if (str == null) {
                str = "";
            }
            A002.AAJ("camera_session_id", str);
            A002.A8M(r4.A0J(), "camera_destination");
            int i = 2;
            if (r3.A01 != 2) {
                i = 1;
            }
            A002.A8k("camera_position", Integer.valueOf(i));
            A002.A8M(r4.A0I(), "capture_type");
            A002.A8M(r3.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A8k("event_type", 2);
            A002.A8M(r3.A0A, "media_type");
            A002.AAJ("module", 27x.A08.getModuleName());
            A002.A8M(r3.A0C, "surface");
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.AAJ("device_fold_orientation", C254483sY.A00);
            A002.AAJ("device_fold_state", C254493sZ.A00);
            A002.A7p("device_is_in_multi_window_mode", C254503sa.A00);
            A002.AAJ("device_aspect_ratio_category", C254473sX.A00);
            A002.Cgf();
        }
    }
}
