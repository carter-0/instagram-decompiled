package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.WdX  reason: case insensitive filesystem */
public final class C19669WdX implements X59 {
    public final /* synthetic */ C353438Hq A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C19669WdX(C353438Hq r1, String str, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = str;
    }

    public final void Dba(C18078Vl7 vl7) {
        Long l;
        Long l2;
        V4W v4w;
        C59725JVj jVj;
        HO5 ho5;
        UUR uur;
        UUO uuo;
        C18078Vl7 vl72 = vl7;
        0qQ.A0B(vl72, 0);
        W2Q w2q = vl72.A09;
        V1V v1v = null;
        if (w2q != null) {
            l = w2q.A07;
        } else {
            l = null;
        }
        XBm xBm = vl72.A0B;
        ULY CE1 = xBm.CE1();
        UL4 Add = xBm.Add();
        C353438Hq r10 = this.A00;
        UserSession userSession = r10.A08;
        boolean z = this.A02;
        if (w2q != null) {
            l2 = ((UUO) w2q).A05.A01();
        } else {
            l2 = null;
        }
        W2Q w2q2 = vl72.A09;
        if (!(w2q2 instanceof UUO) || (uuo = (UUO) w2q2) == null) {
            v4w = null;
        } else {
            v4w = uuo.A05;
        }
        if ((v4w instanceof UUR) && (uur = (UUR) v4w) != null) {
            v1v = uur.A03();
        }
        String A05 = C346587vQ.A0C.A05();
        String str = this.A01;
        boolean A0Y = r10.A09.A0Y();
        if (z) {
            jVj = C59725JVj.POST_CAPTURE;
        } else if (A0Y) {
            jVj = C59725JVj.VIDEO_CAPTURE;
        } else {
            jVj = C59725JVj.PRE_CAPTURE;
        }
        AnonymousClass29Q r7 = 27p.A01(userSession).A07;
        String str2 = C62918KoW.A01;
        HO4 ho4 = null;
        if (str2 != null) {
            ho5 = C56570I2a.A01(str2);
        } else {
            ho5 = null;
        }
        String str3 = C62918KoW.A03;
        if (str3 != null) {
            ho4 = C56570I2a.A00(str3);
        }
        String str4 = C62918KoW.A02;
        String str5 = C62918KoW.A00;
        0bb r4 = new 0bb();
        r4.A05(TraceFieldType.Bitrate, Long.valueOf((long) CE1.A00));
        ULY.A00(r4, CE1);
        r4.A05("start_time_ms", l);
        r4.A05("end_time_ms", C51968G9o.A0u());
        0bb r2 = new 0bb();
        r2.A05(TraceFieldType.Bitrate, Long.valueOf((long) Add.A00));
        r2.A05("sample_rate", Long.valueOf((long) Add.A02));
        r2.A05("channels", Long.valueOf((long) Add.A01));
        r2.A06("codec_profile", "AAC");
        r2.A05("start_time_ms", l);
        r2.A05("end_time_ms", C51968G9o.A0u());
        AnonymousClass283 r11 = r7.A04;
        if (r11.A0L != null) {
            0Aj A0e = AnonymousClass7TE.A0e(r7.A01, AnonymousClass000.A00(4859));
            if (A0e.isSampled()) {
                A0e.AAJ("entity", AnonymousClass000.A00(4400));
                A0e.A8M(r11.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A0e.A8k("camera_position", 4);
                A0e.A8M(C279294yP.STORY, "camera_destination");
                A0e.A8M(jVj, "surface");
                String str6 = r11.A0L;
                if (str6 == null) {
                    str6 = "";
                }
                A0e.AAJ("camera_session_id", str6);
                A0e.A8M(ho5, "device_type");
                A0e.A8M(ho4, "device_build_type");
                A0e.AAJ("soc_version", str4);
                A0e.AAJ("build_flavor", str5);
                A0e.A9F(AnonymousClass000.A00(4524), l2);
                A0e.A8M(v1v, AnonymousClass000.A00(803));
                A0e.AAJ(AnonymousClass000.A00(292), A05);
                A0e.AAJ(AnonymousClass000.A00(1391), str);
                A0e.AAK(r4, "glass_phone_video");
                A0e.AAK(r2, "glass_phone_audio");
                JTT.A18(A0e);
            }
        }
        r10.A01 = str;
    }
}
