package X;

import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Abo  reason: case insensitive filesystem */
public final class C40417Abo implements B25 {
    public final /* synthetic */ AnonymousClass8S5 A00;

    public C40417Abo(AnonymousClass8S5 r1) {
        this.A00 = r1;
    }

    public final void Cxh(C39889ADn aDn, C352218Cl r44) {
        Double d;
        Double d2;
        Long l;
        Long l2;
        ArrayList arrayList;
        Long l3;
        ArrayList A0B;
        Long l4;
        long j;
        long j2;
        Double d3 = null;
        C352218Cl r6 = r44;
        Float f = r6.A0O;
        if (f != null) {
            d = C364198l1.A00((double) f.floatValue());
        } else {
            d = null;
        }
        Long l5 = r6.A0W;
        if (l5 != null) {
            d2 = C364198l1.A00(((double) l5.longValue()) / 1.0E9d);
            if (d2 != null) {
                d3 = C364198l1.A00(-(Math.log(d2.doubleValue()) / C343597qT.A00));
            }
        } else {
            d2 = null;
        }
        Integer num = r6.A0T;
        if (num != null) {
            0qQ.A07(Collections.singletonList(Long.valueOf((long) num.intValue())));
        }
        Integer num2 = r6.A0S;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        j2 = 2;
                    } else if (intValue != 3) {
                        j2 = -1;
                    }
                }
                j2 = 1;
            } else {
                j2 = 0;
            }
            l = Long.valueOf(j2);
        } else {
            l = null;
        }
        Integer num3 = r6.A0V;
        Boolean bool = r6.A0N;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            l2 = Long.valueOf(j);
        } else {
            l2 = null;
        }
        Integer num4 = r6.A0U;
        AnonymousClass8l2 r3 = null;
        if (num4 != null) {
            int intValue2 = num4.intValue();
            if (intValue2 == 0 || intValue2 == 1) {
                r3 = AnonymousClass8l2.AUTO;
            } else if (intValue2 == 5) {
                r3 = AnonymousClass8l2.NIGHT;
            } else if (intValue2 == 17) {
                r3 = AnonymousClass8l2.HDR;
            }
        }
        AnonymousClass8S5 r5 = this.A00;
        29f r8 = 27p.A01(r5.A09).A0A;
        28t r7 = 28t.A05;
        C357638Yz r1 = r5.A0B;
        ArrayList A1D = AnonymousClass7TE.A1D((Collection) r1.A09.A00);
        C279284yO r12 = (C279284yO) r1.A08.A00;
        C59725JVj jVj = C59725JVj.CREATE;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        TargetViewSizeProvider targetViewSizeProvider = r5.A0K;
        String moduleName = r5.A0G.getModuleName();
        AnonymousClass831 r0 = (AnonymousClass831) r5.A0b.A0G.A02();
        if (r0 != null) {
            arrayList = 2AL.A0C(r0.A05());
        } else {
            arrayList = null;
        }
        0qQ.A0B(r12, 5);
        AnonymousClass283 r4 = r8.A04;
        r4.A0A = r7;
        boolean z = true;
        if (!29f.A06(r7, r12, A1D)) {
            String format = String.format("logCameraCapture() mediaType is not valid: entryPoint=%s mediaType=%d, captureFormat=%d, cameraSurface=%d cameraPosition=%d", Arrays.copyOf(new Object[]{r4.A09, 1L, 2, 4L, -1}, 5));
            0qQ.A07(format);
            l3 = null;
            0kD.A07("IgCameraBaseFalcoLoggerImpl", format, (Throwable) null);
        } else {
            l3 = null;
        }
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        ArrayList A1C5 = AnonymousClass7TE.A1C();
        if (!A1C.isEmpty() && A1C.size() == A1C2.size()) {
            int size = A1C.size();
            int i = 0;
            while (i < size) {
                String str = (String) 00k.A0O(A1C, i);
                if (str != null) {
                    l4 = AnonymousClass7TE.A10(str);
                } else {
                    l4 = null;
                }
                String str2 = (String) 00k.A0O(A1C2, i);
                if (str2 != null) {
                    l3 = AnonymousClass7TE.A10(str2);
                }
                if (!(l4 == null || l3 == null)) {
                    A1C4.add(l4);
                    A1C5.add(l3);
                }
                i++;
                l3 = null;
            }
        }
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(r8.A01, "ig_camera_capture"), 196);
        if (arrayList == null) {
            A0B = r8.A0N(0);
        } else {
            A0B = 2AL.A0B(arrayList);
        }
        String str3 = r4.A0L;
        if (r2.A00.isSampled() && str3 != null) {
            r2.A0S("applied_effect_ids", A1C4);
            r2.A0S("applied_effect_instance_ids", A1C5);
            r2.A0V(1);
            r2.A0R("camera_session_id", str3);
            r2.A0S("camera_tools", r8.A0O(A1D, (List) null, (List) null, false, false));
            r2.A0S("camera_tools_struct", A0B);
            r2.A0Q("capture_format_index", 0L);
            r2.A0M(r8.A0I(), "capture_type");
            r2.A0M(r4.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            r2.A0W(2);
            r2.A0c(r7);
            r2.A0n(moduleName);
            r2.A0M(jVj, "surface");
            r2.A0a(r12.A00);
            r2.A0M(C358168aT.A00(targetViewSizeProvider), "nine_sixteen_layout_config");
            r2.A0Q("media_id", (Long) null);
            r2.A0R("discovery_session_id", r4.A0O);
            r2.A00.A9H("effect_indices", 29f.A04(A1C, A1C3));
            r2.A0Q("audio_asset_id", (Long) null);
            r2.A0R("composition_str_id", r4.A0M);
            r2.A0M(r7, "composition_media_type");
            r2.A0S("preloaded_audio_asset_id", r8.A01);
            r2.A0S("preloaded_effect_id", r8.A02);
            r2.A0S("preloaded_media_id", r8.A03);
            r2.A0O("is_panavision", false);
            AnonymousClass7TF.A18(r2);
            r2.A0R("source_media_id", r8.A00);
            r2.A0N(2AL.A07(r8.A00, r8.A03), "system_info");
            r2.A0P("aperture", d);
            r2.A0P("exposure_time", d2);
            r2.A0P("shutter_speed", d3);
            r2.A0Q("flash_mode", l);
            if (num3 == null || num3.intValue() == 0) {
                z = false;
            }
            r2.A0O("did_zoom", Boolean.valueOf(z));
            r2.A0Q("flash_status", l2);
            r2.A0M(r3, "scene_mode");
            C342197oC r13 = r4.A06;
            if (r13 != null) {
                r2.A0M(r13, "folding_state");
            }
            r2.Cgf();
        }
        r5.A0S.A00().Cme(r6);
        r5.A0M.A02.A08(AnonymousClass05K.A00);
        ((AnonymousClass80T) r5.A0Z).A02.A04(new AnonymousClass8VP(C365808ni.A00, AnonymousClass7TE.A1I(new C365798nh(r6)), AnonymousClass7TE.A1I(aDn.A01())));
    }

    public final void Cxj(C39889ADn aDn, C349307zv r7) {
        AnonymousClass8S5 r2 = this.A00;
        r2.A0M.A02.A08(AnonymousClass05K.A00);
        List A1I = AnonymousClass7TE.A1I(new C365798nh(r7));
        AnonymousClass80U r3 = r2.A0Z;
        ((AnonymousClass80T) r3).A02.A04(new AnonymousClass8VP(C365808ni.A00, A1I, AnonymousClass7TE.A1I(aDn.A01())));
    }
}
