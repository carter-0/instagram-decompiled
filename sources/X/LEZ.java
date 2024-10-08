package X;

import java.util.ArrayList;
import java.util.List;

public final class LEZ {
    public final /* synthetic */ C65073Lmt A00;

    public final void A00(L0W l0w, String str, float f) {
        ArrayList arrayList;
        AnonymousClass861 r1;
        List A0X;
        0eP r0;
        Float valueOf;
        0eP r02;
        0qQ.A0B(l0w, 1);
        C65073Lmt lmt = this.A00;
        AnonymousClass8RF r2 = lmt.A09;
        if (!(r2.A0E() instanceof C355828Rn)) {
            return;
        }
        if (l0w instanceof C61790KMe) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            float A002 = LIF.A00(f);
            C65073Lmt.A04(lmt, A1C, A002);
            if (DbT.A1b(A1C)) {
                lmt.A0A.A0B(A1C);
            }
            int i = 0;
            boolean A1R = AnonymousClass7TF.A1R((A002 > 0.0f ? 1 : (A002 == 0.0f ? 0 : -1)));
            C60407Jl0 jl0 = lmt.A02;
            if (jl0 != null) {
                for (Object next : jl0.A00) {
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C60964JuM juM = (C60964JuM) next;
                    if ((juM.A03 instanceof C61793KMh) && A1R != juM.A01) {
                        if (!A1R) {
                            juM.A00 = 0.0f;
                        }
                        juM.A01 = A1R;
                        C60407Jl0 jl02 = lmt.A02;
                        if (jl02 != null) {
                            jl02.notifyItemChanged(i);
                        }
                    }
                    i = i2;
                }
                AnonymousClass8RH A0E = r2.A0E();
                0qQ.A0C(A0E, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.edit.api.model.TimelineState.VolumeControls");
                C355828Rn r12 = (C355828Rn) A0E;
                r2.A0G(new C355828Rn(r12.A01, r12.A03, r12.A02, r12.A00, AnonymousClass7TF.A1Q((A002 > 0.0f ? 1 : (A002 == 0.0f ? 0 : -1)))));
                return;
            }
            0qQ.A0F("volumeSliderAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        if (l0w.equals(C61794KMi.A00)) {
            float A003 = LIF.A00(f);
            List<M1Y> A16 = JTO.A16(lmt.A08.A0K.A0S);
            arrayList = AnonymousClass7TF.A0p(A16);
            for (M1Y m1y : A16) {
                String str2 = m1y.A06;
                if (str2 != null) {
                    r02 = AnonymousClass7TE.A1L(str2, Float.valueOf(A003));
                } else {
                    r02 = null;
                }
                arrayList.add(r02);
            }
            r1 = lmt.A0A;
            A0X = 00k.A0X(arrayList);
        } else {
            if (l0w instanceof C61789KMd) {
                if (str != null) {
                    r1 = lmt.A0A;
                    valueOf = Float.valueOf(LIF.A00(f));
                } else {
                    lmt.A07.A01.A0F(LIF.A00(f));
                    return;
                }
            } else if (l0w.equals(C61791KMf.A00)) {
                r1 = lmt.A0A;
                valueOf = Float.valueOf(LIF.A00(f));
                str = "sound_effects";
            } else if (l0w.equals(C61792KMg.A00)) {
                float A004 = LIF.A00(f);
                List<C381709cC> A17 = JTO.A17(lmt.A08.A0K.A0h);
                arrayList = AnonymousClass7TF.A0p(A17);
                for (C381709cC A005 : A17) {
                    String A006 = A005.A00();
                    if (A006 != null) {
                        r0 = AnonymousClass7TE.A1L(A006, Float.valueOf(A004));
                    } else {
                        r0 = null;
                    }
                    arrayList.add(r0);
                }
                r1 = lmt.A0A;
                A0X = 00k.A0X(arrayList);
            } else if (l0w.equals(C61793KMh.A00)) {
                lmt.A06.A00(f);
                return;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            A0X = AnonymousClass7TE.A1I(AnonymousClass7TE.A1L(str, valueOf));
        }
        r1.A0B(A0X);
    }

    public final void A01(L0W l0w, String str, String str2, String str3, float f) {
        String str4;
        Long l;
        String str5;
        0qQ.A0B(l0w, 1);
        float f2 = f;
        if (l0w instanceof C61789KMd) {
            double d = (double) f2;
            29Z r6 = 27p.A01(this.A00.A05).A0F;
            0Aj A0d = JTR.A0d(r6);
            if (A0d.isSampled()) {
                JTO.A1O(AnonymousClass80P.MUSIC_BROWSER_VOLUME, A0d);
                JTO.A1T(A0d, "IG_CAMERA_CLIPS_AUDIO_BROWSER_VOLUME_CHANGE");
                AnonymousClass283 r1 = r6.A04;
                JTO.A1S(A0d, JTP.A0p(r1));
                JTS.A14(r1.A09, A0d);
                JTP.A1F(A0d);
                JTQ.A12(A0d, r6);
                AnonymousClass7TH.A0U(A0d);
                A0d.A8D("volume_value", Double.valueOf(d));
                JTO.A1P(28t.A06, A0d);
                AnonymousClass7TH.A0V(A0d);
            }
            str4 = C273654mx.A00(237);
        } else if (l0w instanceof C61790KMe) {
            C65073Lmt lmt = this.A00;
            27r A01 = 27p.A01(lmt.A05);
            double d2 = (double) f2;
            Integer A012 = C65073Lmt.A01(lmt);
            if (A012 != null) {
                l = C51969G9p.A0r(A012);
            } else {
                l = null;
            }
            29R r5 = A01.A09;
            1Ln A0N = JTO.A0N(r5);
            if (DbT.A1Y(A0N)) {
                A0N.A0t("IG_CAMERA_CLIPS_AUDIO_VIDEO_VOLUME_CHANGE");
                A0N.A0r("CLIPS_AUDIO_VIDEO_VOLUME_CHANGE");
                29R.A00(A0N, r5);
                JTQ.A1B(A0N, r5.A04);
                A0N.A0U();
                JTQ.A18(A0N, r5);
                JTQ.A1A(A0N);
                A0N.A0P("volume_value", Double.valueOf(d2));
                A0N.A0Q("segment_index", l);
                A0N.A0c(28t.A06);
                JTS.A1E(A0N);
            }
            str4 = "camera_audio";
        } else if (l0w.equals(C61791KMf.A00)) {
            27p.A01(this.A00.A05).A1Q(C59725JVj.POST_CAPTURE, "AUDIO_CONTROLS_SOUND_EFFECTS_VOLUME");
            str4 = "sound_effects";
        } else if (l0w.equals(C61794KMi.A00)) {
            str4 = "voice_over";
        } else if (l0w.equals(C61792KMg.A00)) {
            str4 = "video_sticker";
        } else if (l0w.equals(C61793KMh.A00)) {
            str4 = "voice_enhancement";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        29I r4 = 27p.A01(this.A00.A05).A02;
        AnonymousClass7TG.A1K(r4);
        int i = (f > 0.01f ? 1 : (f == 0.01f ? 0 : -1));
        StringBuilder A0n = AnonymousClass7TF.A0n("user_post_capture_volume_slider_adjusting_finished_");
        if (i < 0) {
            A0n.append(str4);
            str5 = "_zero";
        } else {
            A0n.append(str4);
            str5 = "_nonzero";
        }
        29I.A01(r4, AnonymousClass7TF.A0l(str5, A0n), str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public LEZ(C65073Lmt lmt) {
        this.A00 = lmt;
    }
}
