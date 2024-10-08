package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.I4e  reason: case insensitive filesystem */
public final class C56605I4e {
    public final C53401GnY A00;
    public final UserSession A01;
    public final ConcurrentHashMap.KeySetView A02 = ConcurrentHashMap.newKeySet();
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new C58678Ivn(this, 37));

    public static final void A00(C56605I4e i4e, C55718HmF hmF, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2) {
        String str3;
        Long l;
        Long l2;
        String str4;
        String str5 = null;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                str3 = "AUTO";
            } else if (intValue == 1) {
                str3 = "USER";
            } else if (intValue == 2) {
                str3 = "PILL";
            } else {
                throw AnonymousClass7TE.A1K();
            }
        } else {
            str3 = null;
        }
        27r A012 = 27p.A01(i4e.A01);
        C53401GnY gnY = i4e.A00;
        String str6 = gnY.A03;
        if (num2 != null) {
            l = C51969G9p.A0r(num2);
        } else {
            l = null;
        }
        if (num3 != null) {
            l2 = C51969G9p.A0r(num3);
        } else {
            l2 = null;
        }
        if (hmF != null) {
            str4 = hmF.A02;
            str5 = hmF.A00;
        } else {
            str4 = null;
        }
        String str7 = gnY.A04;
        Number number = (Number) gnY.A02;
        29R r9 = A012.A09;
        0qQ.A0B(str6, 1);
        1Ln A08 = 1Ln.A08(r9.A01);
        C279294yP A0J = r9.A0J();
        if (DbT.A1Y(A08) && A0J != null) {
            A08.A0t("IG_CAMERA_ENTITY_TAP");
            A08.A0r(str);
            29R.A00(A08, r9);
            A08.A0a(A0J);
            AnonymousClass283 r92 = r9.A04;
            A08.A0b(r92.A09);
            A08.A0T();
            A08.A0U();
            A08.A0n(27x.A08.getModuleName());
            A08.A0c(r92.A0A);
            A08.A0R("composition_str_id", r92.A0M);
            A08.A0M(r92.A0A, "composition_media_type");
            AnonymousClass7TF.A18(A08);
            A08.A0R("magicmod_session_id", str6);
            if (str4 != null) {
                A08.A0R("genai_response_id", str4);
            }
            if (str5 != null) {
                A08.A0R("genai_content_id", str5);
            }
            String str8 = str2;
            if (str2 != null) {
                A08.A0R("genai_prompt", str8);
            }
            if (str3 != null) {
                A08.A0R("genai_generate_source", str3);
            }
            if (l != null) {
                A08.A0Q("prompt_pill_position", C51968G9o.A0v(l));
            }
            if (bool != null) {
                A08.A0O("magicmod_backdrop_default_segment_selected", Boolean.valueOf(bool.booleanValue()));
            }
            if (str7 != null) {
                A08.A0R(AnonymousClass000.A00(4432), str7);
            }
            if (number != null) {
                A08.A0Q(AnonymousClass000.A00(2581), C51968G9o.A0v(number));
            }
            if (l2 != null) {
                A08.A0Q("image_position", C51968G9o.A0v(l2));
            }
            A08.Cgf();
        }
    }

    public static final void A01(C56605I4e i4e, String str) {
        A00(i4e, (C55718HmF) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, str, (String) null);
    }

    public final void A03(int i, String str) {
        String str2 = str;
        0qQ.A0B(str, 1);
        int A022 = DbU.A02((C362088hK) this.A00.A01, 0);
        String str3 = "MAGIC_MOD_BACKDROP_PROMPT_PILL_TAP";
        if (A022 != 0) {
            if (A022 == 1) {
                str3 = "MAGIC_MOD_RESTYLE_PROMPT_PILL_TAP";
            } else if (A022 != 2) {
                throw AnonymousClass7TE.A1K();
            }
        }
        A00(this, (C55718HmF) null, (Boolean) null, (Integer) null, Integer.valueOf(i), (Integer) null, str3, str2);
    }

    public final void A05(C55718HmF hmF) {
        int A022 = DbU.A02((C362088hK) this.A00.A01, 0);
        String str = "MAGIC_MOD_BACKDROP_POST_GEN_CANCEL";
        if (A022 != 0) {
            if (A022 == 1) {
                str = "MAGIC_MOD_RESTYLE_POST_GEN_CANCEL";
            } else if (A022 != 2) {
                throw AnonymousClass7TE.A1K();
            }
        }
        A00(this, hmF, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, str, (String) null);
    }

    public final void A07(C55718HmF hmF, Integer num) {
        int A022 = DbU.A02((C362088hK) this.A00.A01, 0);
        String str = "MAGIC_MOD_BACKDROP_DONE";
        if (A022 != 0) {
            if (A022 == 1) {
                str = "MAGIC_MOD_RESTYLE_DONE";
            } else if (A022 != 2) {
                throw AnonymousClass7TE.A1K();
            }
        }
        A00(this, hmF, (Boolean) null, (Integer) null, (Integer) null, num, str, (String) null);
    }

    public final void A08(C55718HmF hmF, Integer num, String str) {
        int A022 = DbU.A02((C362088hK) this.A00.A01, 0);
        String str2 = "MAGIC_MOD_BACKDROP_GENERATE";
        if (A022 != 0) {
            if (A022 == 1) {
                str2 = "MAGIC_MOD_RESTYLE_GENERATE";
            } else if (A022 != 2) {
                throw AnonymousClass7TE.A1K();
            }
        }
        A00(this, hmF, (Boolean) null, num, (Integer) null, (Integer) null, str2, str);
    }

    public final void A09(C55718HmF hmF, String str) {
        int A022 = DbU.A02((C362088hK) this.A00.A01, 0);
        String str2 = "MAGIC_MOD_BACKDROP_PROMPT_POSTGEN_TAP";
        if (A022 != 0) {
            if (A022 == 1) {
                str2 = "MAGIC_MOD_RESTYLE_PROMPT_POSTGEN_TAP";
            } else if (A022 != 2) {
                throw AnonymousClass7TE.A1K();
            }
        }
        A00(this, hmF, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, str2, str);
    }

    public final void A0A(C55718HmF hmF, String str) {
        int A022 = DbU.A02((C362088hK) this.A00.A01, 0);
        String str2 = "MAGIC_MOD_BACKDROP_RETRY";
        if (A022 != 0) {
            if (A022 == 1) {
                str2 = "MAGIC_MOD_RESTYLE_RETRY";
            } else if (A022 != 2) {
                throw AnonymousClass7TE.A1K();
            }
        }
        A00(this, hmF, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, str2, str);
    }

    public final void A02() {
        int A022 = DbU.A02((C362088hK) this.A00.A01, 0);
        String str = "MAGIC_MOD_BACKDROP_CANCEL";
        if (A022 != 0) {
            if (A022 == 1) {
                str = "MAGIC_MOD_RESTYLE_CANCEL";
            } else if (A022 != 2) {
                throw AnonymousClass7TE.A1K();
            }
        }
        A01(this, str);
    }

    public final void A04(HPL hpl, int i) {
        C55772Hn7 hn7;
        String str;
        if (hpl instanceof H92) {
            hn7 = (C55772Hn7) this.A03.getValue();
            str = ((H92) hpl).A01;
        } else if (hpl instanceof H93) {
            hn7 = (C55772Hn7) this.A03.getValue();
            str = ((H93) hpl).A02;
        } else if (!(hpl instanceof H95)) {
            throw AnonymousClass7TE.A1K();
        } else {
            return;
        }
        0qQ.A0B(str, 0);
        ConcurrentHashMap.KeySetView keySetView = hn7.A03;
        Integer valueOf = Integer.valueOf(i);
        if (!keySetView.contains(valueOf)) {
            27r A012 = 27p.A01(hn7.A00);
            AnonymousClass80P A002 = C394969yz.A00(hn7.A01);
            String str2 = hn7.A02;
            Long A0j = DbS.A0j(i);
            0Aj A0e = AnonymousClass7TE.A0e(A012.A01, AnonymousClass000.A00(1430));
            AnonymousClass283 r9 = A012.A04;
            String str3 = r9.A0L;
            if (str3 != null && A012.A0P() && A0e.isSampled()) {
                A0e.A8M(A012.A0J(), "camera_destination");
                A0e.AAJ("camera_session_id", str3);
                AnonymousClass7TE.A1W(A0e, "entity_type", 32);
                DbW.A15(A0e, 27x.A08);
                C51965G9l.A1A(C59725JVj.POST_CAPTURE, A0e);
                A0e.AAJ("composition_str_id", r9.A0M);
                A0e.A8M(r9.A0A, "composition_media_type");
                A0e.AAe(AnonymousClass000.A00(1154), Collections.singletonList(C347027w9.GENAI_PROMPT_PILL));
                DbY.A1C(A0e);
                A0e.A8M(A002, "camera_tool");
                A0e.A9F("prompt_pill_position", A0j);
                A0e.AAJ("genai_prompt", str);
                A0e.AAJ("magicmod_session_id", str2);
                A0e.Cgf();
            }
            keySetView.add(valueOf);
        }
    }

    public final void A06(C55718HmF hmF, int i, boolean z) {
        if (z) {
            ConcurrentHashMap.KeySetView keySetView = this.A02;
            Integer valueOf = Integer.valueOf(i);
            if (!keySetView.contains(valueOf)) {
                keySetView.add(valueOf);
            } else {
                return;
            }
        }
        27r A012 = 27p.A01(this.A01);
        C53401GnY gnY = this.A00;
        AnonymousClass80P A002 = C394969yz.A00((C362088hK) gnY.A01);
        String str = gnY.A03;
        long j = (long) i;
        String str2 = hmF.A02;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = hmF.A00;
        if (str3 == null) {
            str3 = "";
        }
        0Aj A0e = AnonymousClass7TE.A0e(A012.A01, "ig_camera_genai_generated_impression");
        C279294yP A0J = A012.A0J();
        AnonymousClass283 r5 = A012.A04;
        String str4 = r5.A0L;
        if (A0e.isSampled() && A0J != null && str4 != null) {
            A0e.A8M(A0J, "camera_destination");
            A0e.AAJ("camera_session_id", str4);
            DbW.A15(A0e, 27x.A08);
            AnonymousClass7TE.A1W(A0e, "entity_type", 45);
            A0e.AAJ("genai_response_id", str2);
            A0e.AAJ("genai_content_id", str3);
            A0e.A9F("image_position", Long.valueOf(j));
            A0e.AAJ("magicmod_session_id", str);
            A0e.A8M(A002, "camera_tool");
            DbY.A1C(A0e);
            C51965G9l.A1A(C59725JVj.POST_CAPTURE, A0e);
            A0e.AAJ("composition_str_id", r5.A0M);
            A0e.A8M(r5.A0A, "composition_media_type");
            A0e.Cgf();
        }
    }

    public C56605I4e(C53401GnY gnY, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = gnY;
    }
}
