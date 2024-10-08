package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8X6  reason: invalid class name */
public final class AnonymousClass8X6 implements C3493580b {
    public final UserSession A00;

    public AnonymousClass8X6(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        0Aj r2;
        String str;
        AnonymousClass80V r8 = (AnonymousClass80V) obj;
        AnonymousClass80V r9 = (AnonymousClass80V) obj2;
        if (r8 != null && r8.ordinal() == 11 && (obj3 instanceof AnonymousClass8SD)) {
            AnonymousClass29T r4 = 27p.A01(this.A00).A0B;
            0wc r22 = r4.A01;
            0Aj A002 = r22.A00(r22.A00, "ig_camera_navigation");
            if (A002.isSampled()) {
                A002.AAJ("step", "POST_CAPTURE_EXIT_BUTTON");
                A002.AAJ("legacy_falco_event_name", "IG_CAMERA_TAP_POST_CAPTURE_EXIT_BUTTON");
                AnonymousClass283 r3 = r4.A04;
                String str2 = r3.A0L;
                if (str2 == null) {
                    str2 = "";
                }
                A002.AAJ("camera_session_id", str2);
                A002.A8M(r4.A0J(), "camera_destination");
                A002.AAe("camera_tools_struct", r4.A0N(0));
                A002.A8k("event_type", 2);
                A002.AAJ("module", 27x.A08.getModuleName());
                A002.A8M(r3.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A002.A8M(C59725JVj.POST_CAPTURE, "surface");
                A002.A8M(r3.A0A, "media_type");
                A002.A9F("capture_format_index", 0L);
                A002.A8M(r4.A0I(), "capture_type");
                A002.A8M(2AL.A03(r3.A00), "media_source");
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.Cgf();
            }
        }
        if (r9 != null) {
            int ordinal = r9.ordinal();
            if (ordinal != 39) {
                if (ordinal == 12 || ordinal == 13) {
                    if (obj3 instanceof C356168Sv) {
                        str = "button";
                    } else if (obj3 instanceof C356178Sw) {
                        str = "edit";
                    } else if (obj3 instanceof C356158Su) {
                        str = "gesture";
                    } else {
                        return;
                    }
                    AnonymousClass29X r6 = 27p.A01(this.A00).A0D;
                    0wc r23 = r6.A01;
                    r2 = r23.A00(r23.A00, "ig_camera_start_session");
                    if (!r6.A0P() || !r2.isSampled()) {
                        0kD.A07("IgCameraBaseFalcoLoggerImpl", "logStartTextSession(String entryPoint) cameraSession is null", (Throwable) null);
                        return;
                    }
                    r2.AAJ("legacy_falco_event_name", "IG_CAMERA_START_TEXT_SESSION");
                    r2.AAJ("entity", "TEXT");
                    AnonymousClass283 r32 = r6.A04;
                    String str3 = r32.A0L;
                    if (str3 == null) {
                        str3 = "";
                    }
                    r2.AAJ("camera_session_id", str3);
                    int i = 2;
                    r2.A8k("event_type", 2);
                    r2.A8M(r6.A0J(), "camera_destination");
                    if (r32.A01 != 2) {
                        i = 1;
                    }
                    r2.A8k("camera_position", Integer.valueOf(i));
                    r2.A8M(r6.A0I(), "capture_type");
                    r2.A8M(r32.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    r2.A9F("capture_format_index", 0L);
                    r2.A8M(28t.A04, "media_type");
                    r2.AAJ("module", 27x.A08.getModuleName());
                    r2.AAJ("session_entry_mode", str);
                    r2.A8M(r32.A0C, "surface");
                    r2.AAJ("discovery_session_id", r32.A0O);
                    r2.AAJ("search_session_id", r32.A0P);
                    r2.AAJ("composition_str_id", r32.A0M);
                    r2.A8M(r32.A0A, "composition_media_type");
                    r2.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    r2.A7p("is_panavision", Boolean.valueOf(r32.A0W));
                    r2.AAJ("device_fold_orientation", C254483sY.A00);
                    r2.AAJ("device_fold_state", C254493sZ.A00);
                    r2.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                    r2.AAJ("device_aspect_ratio_category", C254473sX.A00);
                } else {
                    return;
                }
            } else if (obj3 instanceof AnonymousClass8SL) {
                Integer num = ((AnonymousClass8SL) obj3).A00;
                if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) {
                    29Z r62 = 27p.A01(this.A00).A0F;
                    0wc r24 = r62.A01;
                    r2 = r24.A00(r24.A00, "ig_camera_ui_tool_click");
                    AnonymousClass283 r33 = r62.A04;
                    if (r33.A0L == null) {
                        0kD.A07("IgCameraBaseFalcoLoggerImpl", "logTapRecipientPickerButton() cameraSession is null", (Throwable) null);
                    }
                    if (r33.A0C == null) {
                        0kD.A07("IgCameraBaseFalcoLoggerImpl", "logTapRecipientPickerButton() surface is null", (Throwable) null);
                    }
                    if (r2.isSampled()) {
                        r2.A8M(AnonymousClass80P.RECIPIENT_PICKER, "tool_type");
                        r2.AAJ("legacy_falco_event_name", "IG_CAMERA_TAP_RECIPIENT_PICKER_BUTTON");
                        String str4 = r33.A0L;
                        if (str4 == null) {
                            str4 = "";
                        }
                        r2.AAJ("camera_session_id", str4);
                        r2.A8M(r62.A0J(), "camera_destination");
                        r2.A8M(r62.A0I(), "capture_type");
                        r2.A8M(r33.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                        int i2 = 2;
                        r2.A8k("event_type", 2);
                        r2.AAJ("module", 27x.A08.getModuleName());
                        if (r33.A01 != 2) {
                            i2 = 1;
                        }
                        r2.A8k("camera_position", Integer.valueOf(i2));
                        r2.A9F("capture_format_index", 0L);
                        r2.AAJ("discovery_session_id", r33.A0O);
                        r2.A8M(r33.A0A, "media_type");
                        r2.AAJ("search_session_id", r33.A0P);
                        r2.A8M(r33.A0C, "surface");
                        1QJ r42 = AnonymousClass1QI.A00;
                        r2.AAJ("nav_chain", r42.A02.A00);
                        r2.AAJ("source_media_id", (String) null);
                        r2.A7p("is_organic_product_tagging_eligible_user", Boolean.valueOf(C367088qA.A05(r62.A03, false)));
                        r2.AAJ("nav_chain", r42.A02.A00);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            r2.Cgf();
        }
    }
}
