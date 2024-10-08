package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Tm  reason: invalid class name and case insensitive filesystem */
public final class C379349Tm implements C41830B2l {
    public String A00;
    public String A01;
    public String A02;
    public ArrayList A03 = AnonymousClass7TE.A1C();
    public ArrayList A04 = AnonymousClass7TE.A1C();
    public final 28D A05;
    public final AnonymousClass8JL A06;
    public final UserSession A07;
    public final AnonymousClass823 A08;
    public final C379339Tl A09;
    public final MusicAssetModel A0A;
    public final Long A0B;
    public final Long A0C;
    public final Long A0D;
    public final String A0E;

    public static void A01(0Aj r3, Long l, String str, List list) {
        r3.A8M(28t.A06, "media_type");
        r3.AAJ("module", "ClipsCaptureControllerImpl");
        r3.A8M(C59725JVj.PRE_CAPTURE, "surface");
        r3.AAe("applied_effect_ids", list);
        r3.A8M((AnonymousClass0Ac) null, "media_source");
        r3.AAJ("artist_name", str);
        r3.A9F("audio_asset_id", l);
    }

    public final void DnG() {
    }

    public final void DnH() {
    }

    public final void DnI() {
        B3b b3b;
        AnonymousClass8JL C2k;
        AnonymousClass9UD A002 = A00(this.A06);
        if (A002 != null) {
            UserSession userSession = this.A07;
            String str = this.A01;
            String str2 = this.A00;
            String str3 = this.A02;
            Long l = this.A0B;
            Long l2 = this.A0C;
            ArrayList arrayList = this.A03;
            String str4 = this.A0E;
            ArrayList arrayList2 = this.A04;
            28D r10 = this.A05;
            AnonymousClass7TF.A1G(arrayList, 7, arrayList2);
            C697329a r11 = 27p.A01(userSession).A0G;
            0Aj A0e = AnonymousClass7TE.A0e(r11.A01, "ig_camera_ui_tool_impression");
            if (A0e.isSampled()) {
                A0e.A8M(AnonymousClass80P.SETTING_PRELOAD, "tool_type");
                A0e.AAJ("legacy_falco_event_name", "IG_CAMERA_PRELOAD_SETTINGS_TOAST_IMPRESSION");
                String str5 = r11.A04.A0L;
                if (str5 == null) {
                    str5 = "";
                }
                A0e.AAJ("camera_session_id", str5);
                A0e.A8M(C279294yP.CLIPS, "camera_destination");
                A0e.AAJ("camera_session_id", str4);
                A0e.AAe("camera_tools", arrayList);
                A0e.A8M(C360948fP.CLIPS, "capture_type");
                A0e.A8M(r10, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                AnonymousClass7TE.A1W(A0e, "event_type", 1);
                A01(A0e, l, str2, arrayList2);
                A0e.A9F("audio_cluster_id", l2);
                A0e.AAJ("audio_type", str);
                A0e.AAJ("song_name", str3);
                A0e.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A0e.A8M(A002, "preload_settings_toast_type");
                A0e.Cgf();
            }
        }
        C353498Hw r2 = this.A09.A00;
        if (r2.A1W.Ats() == AnonymousClass80X.PRE_CAPTURE) {
            AnonymousClass8I2 r22 = r2.A1j;
            Object value = r22.A04.getValue();
            if ((value instanceof B3b) && (b3b = (B3b) value) != null && (C2k = b3b.C2k()) != null && C2k == AnonymousClass8JL.RECENTLY_WATCHED) {
                r22.A02.A00();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0109, code lost:
        if (r7 != null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x025b, code lost:
        if (r6 != null) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x025f, code lost:
        if (r6 != null) goto L_0x0243;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DnJ() {
        /*
            r18 = this;
            r0 = r18
            X.8JL r1 = r0.A06
            r17 = r1
            int r1 = r17.ordinal()
            switch(r1) {
                case 0: goto L_0x01f2;
                case 1: goto L_0x01f2;
                case 2: goto L_0x01eb;
                case 3: goto L_0x0120;
                case 4: goto L_0x00e7;
                case 5: goto L_0x00c9;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.9Tl r1 = r0.A09
            X.8Hw r3 = r1.A00
            X.80U r1 = r3.A1W
            X.80X r2 = r1.Ats()
            X.80X r1 = X.AnonymousClass80X.PRE_CAPTURE
            if (r2 != r1) goto L_0x0020
            X.8I2 r1 = r3.A1j
            r1.A00()
        L_0x0020:
            X.823 r1 = r0.A08
            X.8Xk r2 = r1.A00()
            r1 = 1
            r2.A04(r1)
            r1 = r17
            X.9UD r4 = r0.A00(r1)
            if (r4 == 0) goto L_0x00c8
            com.instagram.common.session.UserSession r1 = r0.A07
            java.lang.String r8 = r0.A01
            java.lang.String r10 = r0.A00
            java.lang.String r7 = r0.A02
            java.lang.Long r9 = r0.A0B
            java.lang.Long r6 = r0.A0C
            java.util.ArrayList r13 = r0.A03
            java.lang.String r14 = r0.A0E
            java.util.ArrayList r5 = r0.A04
            X.28D r11 = r0.A05
            java.lang.Long r3 = r0.A0D
            r0 = 7
            X.AnonymousClass7TF.A1G(r13, r0, r5)
            X.27r r0 = X.27p.A01(r1)
            X.29Z r12 = r0.A0F
            X.0wc r1 = r12.A01
            java.lang.String r0 = "ig_camera_ui_tool_click"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00c8
            if (r14 == 0) goto L_0x00c8
            X.80P r1 = X.AnonymousClass80P.SETTING_PRELOAD
            java.lang.String r0 = "tool_type"
            r2.A8M(r1, r0)
            java.lang.String r1 = "IG_CAMERA_PRELOAD_SETTINGS_TOAST_TAP"
            java.lang.String r0 = "legacy_falco_event_name"
            r2.AAJ(r0, r1)
            X.283 r0 = r12.A04
            java.lang.String r0 = r0.A0L
            if (r0 != 0) goto L_0x0078
            java.lang.String r0 = ""
        L_0x0078:
            java.lang.String r12 = "camera_session_id"
            r2.AAJ(r12, r0)
            X.4yP r1 = X.C279294yP.CLIPS
            java.lang.String r0 = "camera_destination"
            r2.A8M(r1, r0)
            r2.AAJ(r12, r14)
            java.lang.String r0 = "camera_tools"
            r2.AAe(r0, r13)
            X.8fP r1 = X.C360948fP.CLIPS
            java.lang.String r0 = "capture_type"
            r2.A8M(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.A8M(r11, r0)
            r1 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            A01(r2, r9, r10, r5)
            java.lang.String r0 = "audio_cluster_id"
            r2.A9F(r0, r6)
            java.lang.String r0 = "audio_type"
            r2.AAJ(r0, r8)
            java.lang.String r0 = "song_name"
            r2.AAJ(r0, r7)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "preload_settings_toast_type"
            r2.A8M(r4, r0)
            java.lang.String r0 = "media_id"
            r2.A9F(r0, r3)
            r2.Cgf()
        L_0x00c8:
            return
        L_0x00c9:
            X.9Tl r3 = r0.A09
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            X.293 r2 = X.293.A02
            java.lang.String r1 = "entry_point"
            r4.putSerializable(r1, r2)
            X.8Hw r1 = r3.A00
            com.instagram.common.session.UserSession r3 = r1.A1D
            android.content.Context r2 = r1.A11
            X.4DH r1 = r1.A1B
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            X.C55253Hei.A00(r1, r2, r4, r3)
            goto L_0x000d
        L_0x00e7:
            X.9Tl r4 = r0.A09
            X.9cw r1 = r4.A03
            if (r1 == 0) goto L_0x00f5
            X.9cx r1 = r1.A00
            if (r1 == 0) goto L_0x00f5
            X.1Xj r7 = r1.A02
            if (r7 != 0) goto L_0x010b
        L_0x00f5:
            X.8Hw r2 = r4.A00
            X.80D r1 = r2.A1P
            X.9Qn r3 = r1.A13
            if (r3 == 0) goto L_0x000d
            com.instagram.common.session.UserSession r1 = r2.A1D
            X.1E8 r2 = X.1E7.A00(r1)
            java.lang.String r1 = r3.A0E
            X.1Xj r7 = r2.A02(r1)
            if (r7 == 0) goto L_0x000d
        L_0x010b:
            X.8Hw r1 = r4.A00
            com.instagram.common.session.UserSession r6 = r1.A1D
            X.4DH r3 = r1.A1B
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.28D r4 = r1.A16
            X.293 r5 = X.293.A02
            r8 = 0
            r9 = 0
            X.C55274Hf3.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x000d
        L_0x0120:
            X.9Tl r6 = r0.A09
            X.8Hw r5 = r6.A00
            android.content.Context r9 = r5.A11
            X.B3Z r4 = r6.A01
            r14 = 0
            if (r4 == 0) goto L_0x01e8
            com.instagram.music.common.config.MusicAttributionConfig r1 = r4.BUm()
            if (r1 == 0) goto L_0x01e8
            com.instagram.music.common.model.MusicAssetModel r2 = r1.A02
        L_0x0133:
            X.B3a r1 = r6.A02
            if (r1 == 0) goto L_0x01e0
            java.lang.String r15 = r1.B05()
            java.lang.String r13 = r1.B01()
            com.instagram.common.typedurl.ImageUrl r12 = r1.B0H()
            java.lang.String r16 = r1.getEffectId()
            java.lang.String r11 = r1.B00()
            java.lang.Boolean r14 = r1.B0E()
        L_0x014f:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            if (r2 == 0) goto L_0x0177
            java.lang.String r1 = r2.A0G
            if (r1 == 0) goto L_0x01dd
            r1 = 2131955594(0x7f130f8a, float:1.954772E38)
            java.lang.String r1 = r9.getString(r1)
        L_0x0160:
            java.lang.String r8 = r2.A0D
            X.0qQ.A0A(r1)
            X.0qQ.A0A(r8)
            com.instagram.common.typedurl.ImageUrl r7 = r2.A03
            X.0qQ.A07(r7)
            X.8JL r3 = X.AnonymousClass8JL.AUDIO
            com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem r2 = new com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem
            r2.<init>(r3, r7, r1, r8)
            r10.add(r2)
        L_0x0177:
            if (r15 == 0) goto L_0x018f
            if (r13 == 0) goto L_0x018f
            if (r12 == 0) goto L_0x018f
            X.8JL r1 = X.AnonymousClass8JL.EFFECT
            com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem r2 = new com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem
            r2.<init>(r1, r12, r15, r13)
            r1 = r16
            r2.A02 = r1
            r2.A01 = r11
            r2.A00 = r14
            r10.add(r2)
        L_0x018f:
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L_0x000d
            com.instagram.common.session.UserSession r8 = r5.A1D
            X.E61 r3 = new X.E61
            r3.<init>()
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = r8.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r7.putString(r1, r2)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r10)
            r1 = 2085(0x825, float:2.922E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r7.putParcelableArrayList(r1, r2)
            r3.setArguments(r7)
            X.7Pr r2 = new X.7Pr
            r2.<init>(r8)
            r1 = 2131955595(0x7f130f8b, float:1.9547722E38)
            java.lang.String r1 = r9.getString(r1)
            r2.A0d = r1
            r2.A0T = r3
            X.7Pu r2 = r2.A00()
            X.A8y r1 = new X.A8y
            r1.<init>(r6, r5, r4, r2)
            r3.A00 = r1
            X.4DH r1 = r5.A1B
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            r2.A02(r1, r3)
            goto L_0x000d
        L_0x01dd:
            java.lang.String r1 = r2.A0I
            goto L_0x0160
        L_0x01e0:
            r15 = r14
            r13 = r14
            r12 = r14
            r16 = r14
            r11 = r14
            goto L_0x014f
        L_0x01e8:
            r2 = r14
            goto L_0x0133
        L_0x01eb:
            X.9Tl r1 = r0.A09
            r1.A01()
            goto L_0x000d
        L_0x01f2:
            X.9Tl r5 = r0.A09
            X.8Hw r4 = r5.A00
            X.8A2 r6 = r4.A1h
            X.28D r1 = r4.A16
            java.lang.String r2 = r1.name()
            java.lang.String r1 = "_sticky_toast"
            java.lang.String r8 = X.002.A0R(r2, r1)
            com.instagram.common.session.UserSession r2 = r4.A1D
            X.27r r1 = X.27p.A01(r2)
            X.4yP r1 = r1.A0J()
            java.lang.String r9 = java.lang.String.valueOf(r1)
            java.lang.String r10 = X.AnonymousClass7TF.A0g(r2)
            X.80U r1 = r4.A1W
            X.80X r7 = r1.Ats()
            r11 = 0
            r12 = 0
            r6.A08(r7, r8, r9, r10, r11, r12)
            X.27r r1 = X.27p.A01(r2)
            X.29I r7 = r1.A02
            X.B3Z r6 = r5.A01
            if (r6 == 0) goto L_0x025a
            com.instagram.music.common.config.MusicAttributionConfig r1 = r6.BUm()
            if (r1 == 0) goto L_0x025a
            com.instagram.music.common.model.MusicAssetModel r1 = r1.A02
            if (r1 == 0) goto L_0x025a
            java.lang.String r3 = r1.A0E
        L_0x0237:
            com.instagram.music.common.config.MusicAttributionConfig r1 = r6.BUm()
            if (r1 == 0) goto L_0x025e
            com.instagram.music.common.model.MusicAssetModel r1 = r1.A02
            if (r1 == 0) goto L_0x025e
            java.lang.String r2 = r1.A0B
        L_0x0243:
            com.instagram.music.common.config.MusicAttributionConfig r1 = r6.BUm()
            if (r1 == 0) goto L_0x024f
            com.instagram.music.common.model.MusicAssetModel r1 = r1.A02
            if (r1 == 0) goto L_0x024f
            java.lang.String r11 = r1.A0I
        L_0x024f:
            r7.A04(r3, r2, r11)
            X.C379339Tl.A00(r5)
            X.C353498Hw.A0e(r4)
            goto L_0x000d
        L_0x025a:
            r3 = r11
            if (r6 == 0) goto L_0x025e
            goto L_0x0237
        L_0x025e:
            r2 = r11
            if (r6 == 0) goto L_0x024f
            goto L_0x0243
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C379349Tm.DnJ():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C379349Tm(X.AnonymousClass8JL r3, com.instagram.common.session.UserSession r4, X.AnonymousClass823 r5, X.C379339Tl r6, com.instagram.music.common.model.MusicAssetModel r7, java.lang.Long r8, java.lang.String r9, java.lang.String r10) {
        /*
            r2 = this;
            r2.<init>()
            r2.A06 = r3
            r2.A08 = r5
            r2.A07 = r4
            r2.A0A = r7
            r2.A09 = r6
            r2.A0D = r8
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.A04 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.A03 = r0
            r0 = 0
            if (r7 == 0) goto L_0x006e
            java.lang.String r1 = r7.A0E
            if (r1 == 0) goto L_0x006e
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r1)
        L_0x0026:
            r2.A0B = r1
            if (r7 == 0) goto L_0x0032
            java.lang.String r1 = r7.A0B
            if (r1 == 0) goto L_0x0032
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r1)
        L_0x0032:
            r2.A0C = r0
            java.lang.String r0 = X.AnonymousClass7TF.A0g(r4)
            r2.A0E = r0
            X.27r r0 = X.27p.A01(r4)
            X.283 r0 = r0.A04
            X.28D r0 = r0.A09
            X.0qQ.A07(r0)
            r2.A05 = r0
            if (r7 == 0) goto L_0x0057
            java.lang.String r0 = r7.A0G
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "original_sounds"
            r2.A01 = r0
            r2.A00 = r10
            java.lang.String r0 = "Original Audio"
        L_0x0055:
            r2.A02 = r0
        L_0x0057:
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0070;
                case 2: goto L_0x007c;
                case 3: goto L_0x0075;
                case 4: goto L_0x0083;
                case 5: goto L_0x0083;
                case 6: goto L_0x0083;
                default: goto L_0x005e;
            }
        L_0x005e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0063:
            java.lang.String r0 = "licensed_music"
            r2.A01 = r0
            java.lang.String r0 = r7.A0D
            r2.A00 = r0
            java.lang.String r0 = r7.A0I
            goto L_0x0055
        L_0x006e:
            r1 = r0
            goto L_0x0026
        L_0x0070:
            java.util.ArrayList r1 = r2.A03
            X.80P r0 = X.AnonymousClass80P.MUSIC_SELECTOR
            goto L_0x0080
        L_0x0075:
            java.util.ArrayList r1 = r2.A03
            X.80P r0 = X.AnonymousClass80P.MUSIC_SELECTOR
            r1.add(r0)
        L_0x007c:
            java.util.ArrayList r1 = r2.A03
            X.80P r0 = X.AnonymousClass80P.EFFECT_SELECTOR
        L_0x0080:
            r1.add(r0)
        L_0x0083:
            if (r9 == 0) goto L_0x008e
            java.util.ArrayList r1 = r2.A04
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r9)
            r1.add(r0)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C379349Tm.<init>(X.8JL, com.instagram.common.session.UserSession, X.823, X.9Tl, com.instagram.music.common.model.MusicAssetModel, java.lang.Long, java.lang.String, java.lang.String):void");
    }

    private final AnonymousClass9UD A00(AnonymousClass8JL r5) {
        switch (r5.ordinal()) {
            case 0:
            case 1:
                return AnonymousClass9UD.SUGGESTED_AUDIO;
            case 2:
                return AnonymousClass9UD.SUGGESTED_AR_EFFECTS;
            case 3:
                return AnonymousClass9UD.SUGGESTED_AUDIO_AND_AR_EFFECTS;
            case 4:
                return AnonymousClass9UD.SUGGESTED_TEMPLATES;
            case 5:
                return AnonymousClass9UD.BROWSE_TEMPLATES;
            default:
                String simpleName = getClass().getSimpleName();
                0qQ.A07(simpleName);
                0kD.A07(simpleName, AnonymousClass7TG.A0m(r5, "Suggested Camera Settings not supported: ", AnonymousClass7TE.A1A()), (Throwable) null);
                return null;
        }
    }
}
