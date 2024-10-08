package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Afg  reason: case insensitive filesystem */
public final class C40618Afg implements X59 {
    public final int A00;
    public final Object A01;

    public C40618Afg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dba(C18078Vl7 vl7) {
        Boolean bool;
        Long l;
        V4W v4w;
        C59725JVj jVj;
        HO5 ho5;
        UUR uur;
        UUO uuo;
        switch (this.A00) {
            case 0:
                0qQ.A0B(vl7, 0);
                ((AnonymousClass9PE) this.A01).A00 = vl7;
                return;
            case 1:
                0qQ.A0B(vl7, 0);
                C353438Hq r1 = (C353438Hq) this.A01;
                W2Q w2q = vl7.A09;
                if (w2q != null) {
                    bool = Boolean.valueOf(w2q.A0C);
                } else {
                    bool = null;
                }
                C353438Hq.A01(vl7, r1, bool, false, false);
                return;
            default:
                0qQ.A0B(vl7, 0);
                C353438Hq r0 = (C353438Hq) this.A01;
                UserSession userSession = r0.A08;
                boolean A0Y = r0.A09.A0Y();
                W2Q w2q2 = vl7.A09;
                V1V v1v = null;
                if (w2q2 != null) {
                    l = ((UUO) w2q2).A05.A01();
                } else {
                    l = null;
                }
                W2Q w2q3 = vl7.A09;
                if (!(w2q3 instanceof UUO) || (uuo = (UUO) w2q3) == null) {
                    v4w = null;
                } else {
                    v4w = uuo.A05;
                }
                if ((v4w instanceof UUR) && (uur = (UUR) v4w) != null) {
                    v1v = uur.A03();
                }
                C346587vQ r02 = C346587vQ.A0C;
                String A05 = r02.A05();
                String A07 = r02.A07();
                if (A0Y) {
                    jVj = C59725JVj.VIDEO_CAPTURE;
                } else {
                    jVj = C59725JVj.PRE_CAPTURE;
                }
                AnonymousClass29X r12 = 27p.A01(userSession).A0D;
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
                AnonymousClass283 r11 = r12.A04;
                if (r11.A0L != null) {
                    0Aj A0e = AnonymousClass7TE.A0e(r12.A01, "ig_camera_start_session");
                    if (A0e.isSampled()) {
                        A0e.AAJ("entity", "SMART_GLASSES");
                        AnonymousClass7TE.A1V(A0e, r11);
                        AnonymousClass7TE.A1W(A0e, "camera_position", 4);
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
                        A0e.AAJ(AnonymousClass000.A00(292), A05);
                        AnonymousClass7TG.A1D(A0e, AnonymousClass000.A00(1391), A07);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
