package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7xl  reason: invalid class name and case insensitive filesystem */
public final class C348027xl implements AnonymousClass82L, AnonymousClass82I {
    public String A00;
    public String A01;
    public final AnonymousClass82W A02;
    public final UserSession A03;
    public final C357638Yz A04;
    public final C352888Fl A05;
    public final AnonymousClass8DO A06;
    public final String A07;

    public C348027xl(AnonymousClass82W r2, UserSession userSession, C357638Yz r4, C352888Fl r5, AnonymousClass8DO r6, String str) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r6, 4);
        0qQ.A0B(str, 5);
        0qQ.A0B(r4, 6);
        this.A02 = r2;
        this.A03 = userSession;
        this.A05 = r5;
        this.A06 = r6;
        this.A07 = str;
        this.A04 = r4;
    }

    public final void DE9(int i) {
        String str;
        String str2;
        CameraAREffect cameraAREffect = this.A02.A00().A05.A09;
        if (i > 0 && cameraAREffect != null && (str = cameraAREffect.A0K) != null && (str2 = this.A00) != null && !str2.equals(this.A01)) {
            this.A01 = str2;
            UserSession userSession = this.A03;
            0qQ.A07(str);
            String str3 = cameraAREffect.A0M;
            0qQ.A07(str3);
            Integer A0N = this.A05.A0N();
            AnonymousClass8DO r2 = this.A06;
            C59725JVj jVj = C59725JVj.PRE_CAPTURE;
            String str4 = this.A07;
            0qQ.A0B(this.A04.A08(), 8);
            if (r2.B09(str) == null) {
                0kD.A07("CameraLoggerHelper", 002.A0R("Could not find effect position for effectId: ", str), (Throwable) null);
                0KC.A0O("CameraLoggerHelper", "logFaceDetected() effectPosition not found, effectId=", new Object[]{str});
                return;
            }
            int A032 = C59895JbK.A03(A0N);
            29Z r7 = 27p.A01(userSession).A0F;
            0wc r22 = r7.A01;
            0Aj A002 = r22.A00(r22.A00, "ig_camera_ui_tool_click");
            if (A002.isSampled()) {
                List singletonList = Collections.singletonList(00y.A0n(10, str));
                0qQ.A07(singletonList);
                List singletonList2 = Collections.singletonList(00y.A0n(10, str3));
                0qQ.A07(singletonList2);
                int i2 = 2;
                if (A032 != 2) {
                    i2 = 1;
                }
                A002.A8M(AnonymousClass80P.FACE_DETECTOR, "tool_type");
                A002.AAJ("legacy_falco_event_name", "IG_CAMERA_FACE_DETECTED");
                AnonymousClass283 r6 = r7.A04;
                String str5 = r6.A0L;
                if (str5 == null) {
                    str5 = "";
                }
                A002.AAJ("camera_session_id", str5);
                A002.AAe("applied_effect_ids", singletonList);
                A002.AAe("applied_effect_instance_ids", singletonList2);
                A002.A8M(r7.A0J(), "camera_destination");
                A002.A8k("camera_position", Integer.valueOf(i2));
                A002.A8M(r7.A0I(), "capture_type");
                A002.A9F("capture_format_index", 0L);
                A002.A8M(r6.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A002.A8k("event_type", 2);
                A002.A8M(28t.A04, "media_type");
                A002.AAJ("module", str4);
                A002.A8M(jVj, "surface");
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.Cgf();
            }
        }
    }

    public final void Csw(String str) {
        this.A00 = str;
    }
}
