package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Afd  reason: case insensitive filesystem */
public final class C40615Afd implements X59 {
    public final /* synthetic */ C353438Hq A00;

    public C40615Afd(C353438Hq r1) {
        this.A00 = r1;
    }

    public final void Dba(C18078Vl7 vl7) {
        Long l;
        V4W v4w;
        C59725JVj jVj;
        HO5 ho5;
        int i;
        UUR uur;
        UUO uuo;
        C18078Vl7 vl72 = vl7;
        0qQ.A0B(vl72, 0);
        C346587vQ r14 = C346587vQ.A0C;
        if (AnonymousClass7TF.A1Y(r14.A00(), true)) {
            C353438Hq r3 = this.A00;
            if (!0qQ.A0K(r3.A02, r14.A05())) {
                UserSession userSession = r3.A08;
                boolean A03 = r3.A03();
                boolean A0Y = r3.A09.A0Y();
                W2Q w2q = vl72.A09;
                V1V v1v = null;
                if (w2q != null) {
                    l = ((UUO) w2q).A05.A01();
                } else {
                    l = null;
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
                String A05 = r14.A05();
                if (A0Y) {
                    jVj = C59725JVj.VIDEO_CAPTURE;
                } else {
                    jVj = C59725JVj.PRE_CAPTURE;
                }
                AnonymousClass29X r1 = 27p.A01(userSession).A0D;
                String str = C62918KoW.A01;
                HO4 ho4 = null;
                if (str != null) {
                    ho5 = C56570I2a.A01(str);
                } else {
                    ho5 = null;
                }
                String str2 = C62918KoW.A03;
                if (str2 != null) {
                    ho4 = C56570I2a.A00(str2);
                }
                String str3 = C62918KoW.A02;
                String str4 = C62918KoW.A00;
                AnonymousClass283 r11 = r1.A04;
                if (r11.A0L != null) {
                    0Aj A0e = AnonymousClass7TE.A0e(r1.A01, "ig_camera_start_session");
                    if (A0e.isSampled()) {
                        if (A03) {
                            i = 4;
                        } else {
                            i = 2;
                            if (r11.A01 != 2) {
                                i = 1;
                            }
                        }
                        A0e.AAJ("entity", "SMART_GLASSES");
                        AnonymousClass7TE.A1V(A0e, r11);
                        AnonymousClass7TE.A1W(A0e, "camera_position", i);
                        A0e.A8M(C279294yP.STORY, "camera_destination");
                        A0e.A8M(jVj, "surface");
                        String str5 = r11.A0L;
                        if (str5 == null) {
                            str5 = "";
                        }
                        A0e.AAJ("camera_session_id", str5);
                        A0e.A8M(ho5, "device_type");
                        A0e.A8M(ho4, "device_build_type");
                        A0e.AAJ("soc_version", str3);
                        A0e.AAJ("build_flavor", str4);
                        A0e.A9F("battery_level_pct", l);
                        A0e.A8M(v1v, AnonymousClass000.A00(803));
                        AnonymousClass7TG.A1D(A0e, AnonymousClass000.A00(292), A05);
                    }
                }
                r3.A02 = r14.A05();
            }
        }
    }
}
