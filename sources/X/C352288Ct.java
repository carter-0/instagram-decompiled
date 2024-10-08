package X;

import android.view.View;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.pendingmedia.model.ClipInfo;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8Ct  reason: invalid class name and case insensitive filesystem */
public final class C352288Ct implements C3493580b {
    public final /* synthetic */ C352268Cr A00;

    public C352288Ct(C352268Cr r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        0Aj r2;
        String str;
        ClipInfo clipInfo;
        AnonymousClass80V r0 = AnonymousClass80V.VIDEO_TRIMMING;
        if (obj2 == r0) {
            0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.event.QuickCaptureEvent.LongVideoImportedFromGallery");
            C352268Cr r3 = this.A00;
            if (r3.A05) {
                Object value = r3.A0B.getValue();
                0qQ.A07(value);
                0nA.A0p((View) value, new C40827Ajx(r3));
                AnonymousClass8LU r4 = r3.A00;
                if (r4 == null) {
                    str = "delegate";
                } else {
                    AnonymousClass3Q2 r02 = r4.A0D;
                    if (!(r02 == null || (clipInfo = r02.A1N) == null)) {
                        r4.A0L(clipInfo.A07, clipInfo.A05);
                        AnonymousClass8LU.A0A(r4, clipInfo.A07);
                    }
                    r3.A02.DV9(r3);
                    27r A01 = 27p.A01(r3.A08);
                    C349307zv r1 = r3.A04;
                    str = MediaStreamTrack.VIDEO_TRACK_KIND;
                    if (r1 != null) {
                        double d = (double) r1.A07;
                        double d2 = (double) r1.A0H;
                        double d3 = (double) r1.A06;
                        String str2 = r3.A0A;
                        AnonymousClass29X r32 = A01.A0D;
                        0wc r9 = r32.A01;
                        r2 = r9.A00(r9.A00, "ig_camera_start_session");
                        if (r2.isSampled()) {
                            r2.AAJ("legacy_falco_event_name", "IG_CAMERA_START_TRIM_SESSION");
                            r2.AAJ("entity", "TRIM");
                            AnonymousClass283 r8 = r32.A04;
                            String str3 = r8.A0L;
                            if (str3 == null) {
                                str3 = "";
                            }
                            r2.AAJ("camera_session_id", str3);
                            r2.A8M(AnonymousClass9QA.A00.A00, "camera_destination");
                            r2.A8M(r8.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                            r2.A8k("event_type", 2);
                            r2.AAJ("module", str2);
                            r2.AAJ("session_start_reason", "manual");
                            r2.A8D("orignal_length", Double.valueOf(d));
                            r2.A8D("amount_trimmed_from_start", Double.valueOf(d2));
                            r2.A8D("amount_trimmed_from_end", Double.valueOf(d3));
                            r2.AAJ("composition_str_id", r8.A0M);
                            r2.A8M(r8.A0A, "composition_media_type");
                            r2.A8M(r8.A0C, "surface");
                            r2.AAe("camera_tools_struct", r32.A0N(0));
                            r2.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                            r2.AAJ("device_fold_orientation", C254483sY.A00);
                            r2.AAJ("device_fold_state", C254493sZ.A00);
                            r2.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                            r2.AAJ("device_aspect_ratio_category", C254473sX.A00);
                            r2.Cgf();
                            return;
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        } else if (obj == r0) {
            C352268Cr r33 = this.A00;
            if (r33.A05) {
                r33.A02.D48(r33);
                27r A012 = 27p.A01(r33.A08);
                C349307zv r12 = r33.A04;
                str = MediaStreamTrack.VIDEO_TRACK_KIND;
                if (r12 != null) {
                    double d4 = (double) r12.A07;
                    double d5 = (double) r12.A0J;
                    double d6 = (double) r12.A0I;
                    String str4 = r33.A0A;
                    AnonymousClass29Q r34 = A012.A07;
                    0wc r92 = r34.A01;
                    r2 = r92.A00(r92.A00, "ig_camera_end_session");
                    if (r2.isSampled()) {
                        r2.AAJ("entity", "TRIM");
                        r2.AAJ("legacy_falco_event_name", "IG_CAMERA_END_TRIM_SESSION");
                        AnonymousClass283 r82 = r34.A04;
                        String str5 = r82.A0L;
                        if (str5 == null) {
                            str5 = "";
                        }
                        r2.AAJ("camera_session_id", str5);
                        r2.A8M(AnonymousClass9QA.A00.A00, "camera_destination");
                        r2.A8M(r82.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                        r2.A8k("event_type", 2);
                        r2.AAJ("module", str4);
                        r2.AAJ("session_exit_reason", "done");
                        r2.A8D("orignal_length", Double.valueOf(d4));
                        r2.A8D("amount_trimmed_from_start", Double.valueOf(d5));
                        r2.A8D("amount_trimmed_from_end", Double.valueOf(d6));
                        r2.AAJ("composition_str_id", r82.A0M);
                        r2.A8M(r82.A0A, "composition_media_type");
                        r2.A8M(r82.A0C, "surface");
                        r2.AAe("camera_tools_struct", r34.A0N(0));
                        r2.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                        r2.AAJ("device_aspect_ratio_category", C254473sX.A00);
                        r2.AAJ("device_fold_orientation", C254483sY.A00);
                        r2.AAJ("device_fold_state", C254493sZ.A00);
                        r2.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                        r2.Cgf();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
