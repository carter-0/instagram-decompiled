package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8Hq  reason: invalid class name and case insensitive filesystem */
public final class C353438Hq extends C353418Hn {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public String A06;
    public final Context A07;
    public final UserSession A08;
    public final C352888Fl A09;
    public final C3508086k A0A;
    public final AnonymousClass8DD A0B;
    public final C3496881i A0C;

    public static final void A01(C18078Vl7 vl7, C353438Hq r17, Boolean bool, boolean z, boolean z2) {
        boolean z3;
        long j;
        Long l;
        V4W v4w;
        C59725JVj jVj;
        HO5 ho5;
        int i;
        UUR uur;
        UUO uuo;
        Long l2;
        Long l3;
        Boolean bool2 = bool;
        C353438Hq r6 = r17;
        boolean z4 = z2;
        if (0qQ.A0K(bool2, true)) {
            r6.A06(z4);
        }
        C18078Vl7 vl72 = vl7;
        W2Q w2q = vl72.A09;
        if (w2q != null && w2q.A0C) {
            w2q.A0C(false);
        }
        C346587vQ r0 = C346587vQ.A0C;
        String A052 = r0.A05();
        if (0qQ.A0K(r0.A00(), true) && !0qQ.A0K(A052, r6.A06)) {
            UserSession userSession = r6.A08;
            if (bool != null) {
                z3 = bool2.booleanValue();
            } else {
                z3 = false;
            }
            W2Q w2q2 = vl72.A09;
            long j2 = 0;
            if (w2q2 == null || (l3 = w2q2.A06) == null) {
                j = 0;
            } else {
                j = l3.longValue();
            }
            Long valueOf = Long.valueOf(j);
            if (!(w2q2 == null || (l2 = w2q2.A05) == null)) {
                j2 = l2.longValue();
            }
            Long valueOf2 = Long.valueOf(j2);
            V1V v1v = null;
            if (w2q2 != null) {
                l = ((UUO) w2q2).A05.A01();
            } else {
                l = null;
            }
            W2Q w2q3 = vl72.A09;
            if (!(w2q3 instanceof UUO) || (uuo = (UUO) w2q3) == null) {
                v4w = null;
            } else {
                v4w = uuo.A05;
            }
            if ((v4w instanceof UUR) && (uur = (UUR) v4w) != null) {
                v1v = uur.A03();
            }
            if (z2) {
                jVj = C59725JVj.POST_CAPTURE;
            } else {
                jVj = C59725JVj.PRE_CAPTURE;
            }
            AnonymousClass29Q r1 = 27p.A01(userSession).A07;
            Boolean valueOf3 = Boolean.valueOf(z);
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
            AnonymousClass283 r13 = r1.A04;
            if (r13.A0L != null) {
                0wc r2 = r1.A01;
                0Aj A002 = r2.A00(r2.A00, "ig_camera_end_session");
                if (A002.isSampled()) {
                    if (z3) {
                        i = 4;
                    } else {
                        i = 2;
                        if (r13.A01 != 2) {
                            i = 1;
                        }
                    }
                    A002.AAJ("entity", "SMART_GLASSES");
                    A002.A8M(r13.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A002.A8k("camera_position", Integer.valueOf(i));
                    A002.A8M(C279294yP.STORY, "camera_destination");
                    A002.A8M(jVj, "surface");
                    String str5 = r13.A0L;
                    if (str5 == null) {
                        str5 = "";
                    }
                    A002.AAJ("camera_session_id", str5);
                    A002.A8M(ho5, "device_type");
                    A002.A8M(ho4, "device_build_type");
                    A002.AAJ("soc_version", str3);
                    A002.AAJ("build_flavor", str4);
                    A002.A9F("battery_level_pct", l);
                    A002.A8M(v1v, AnonymousClass000.A00(803));
                    A002.A7p("is_captured_from_glasses", valueOf3);
                    A002.A9F("preview_total_time_ms", valueOf);
                    A002.A9F("capture_total_time_ms", valueOf2);
                    A002.AAJ(AnonymousClass000.A00(292), A052);
                    A002.AAJ("device_aspect_ratio_category", C254473sX.A00);
                    A002.AAJ("device_fold_orientation", C254483sY.A00);
                    A002.AAJ("device_fold_state", C254493sZ.A00);
                    A002.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                    A002.Cgf();
                }
            }
            r6.A06 = A052;
        }
        if (vl72.A0J) {
            vl72.A08(false);
        }
    }

    public static final W0T A00(C353438Hq r2) {
        C357488Yc A012 = C357488Yc.A03.A01(r2.A08);
        if (A012 != null) {
            return A012.A00();
        }
        return null;
    }

    public final void A04() {
        UserSession userSession = this.A08;
        Context context = this.A07;
        if (C362988ir.A01(context.getApplicationContext(), userSession)) {
            1pd.A00(C362988ir.A00()).A00(context, userSession, new C40615Afd(this), "GlassesStoryViewListenerSTART_STORY_DESINATION_WITH_SUP_CALLBACK");
        }
    }

    public final void A05() {
        UserSession userSession = this.A08;
        1Av A002 = 1Au.A00(userSession);
        0s0 r2 = A002.A5C;
        AnonymousClass0YZ[] r4 = 1Av.A8a;
        if (!((Boolean) r2.CDM(A002, r4[342])).booleanValue()) {
            C342057ny.A00(new C40819Ajp(this));
            1Av A003 = 1Au.A00(userSession);
            A003.A5C.Epx(A003, true, r4[342]);
            AnonymousClass29V r5 = 27p.A01(userSession).A0C;
            C279294yP r42 = C279294yP.STORY;
            0wc r22 = r5.A01;
            0Aj A004 = r22.A00(r22.A00, "ig_camera_nux");
            if (A004.isSampled()) {
                A004.AAJ("entity", "GLASSES_CAMERA");
                A004.AAJ("nux_step", "OPEN");
                AnonymousClass283 r23 = r5.A04;
                String str = r23.A0L;
                if (str == null) {
                    str = "";
                }
                A004.AAJ("camera_session_id", str);
                A004.A8M(r23.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A004.A8M(r42, "camera_destination");
                A004.Cgf();
            }
        }
    }

    public final void A06(boolean z) {
        String A072 = C346587vQ.A0C.A07();
        if (A072 != null && !A072.equals(this.A01)) {
            UserSession userSession = this.A08;
            Context context = this.A07;
            if (C362988ir.A01(context.getApplicationContext(), userSession)) {
                1pd.A00(C362988ir.A00()).A00(context, userSession, new C19669WdX(this, A072, z), "GlassesStoryViewListener_STREAM_ENDING_CALLBACK_ID");
            }
        }
    }

    public final void APG() {
        String str;
        AnonymousClass87G A0D;
        if (this.A03 == null) {
            AnonymousClass8DD r0 = this.A0B;
            if (r0 == null || (A0D = r0.A0D()) == null) {
                str = null;
            } else {
                str = A0D.getId();
            }
            this.A03 = str;
        }
        if (!this.A09.A0Y()) {
            C342057ny.A00(new C40814Ajk(this));
        }
        1pd.A00(C362988ir.A00()).A00(this.A07, this.A08, new C40614Afc(this), "sup:SupDelegate_GLASSES_PREVIEW_CALLBACK_ID");
        C342057ny.A00(new C40815Ajl(this));
    }

    public final void ARR() {
        C342057ny.A00(new C40816Ajm(this));
    }

    public final void DI7() {
        this.A09.A0Q();
        C340297l2 r0 = this.A0C.A02;
        if (r0 != null) {
            C41842B2x b2x = r0.A04;
            if (b2x != null) {
                b2x.D5c();
            }
            this.A00 = false;
        }
    }

    public final void DWr() {
        C340297l2 r1 = this.A0C.A02;
        if (r1 != null) {
            C340297l2.A05(C390989sA.A03, r1);
        }
        this.A00 = true;
        ARR();
    }

    public C353438Hq(Context context, UserSession userSession, C352888Fl r3, C3508086k r4, AnonymousClass8DD r5, C3496881i r6) {
        super(userSession, context);
        this.A08 = userSession;
        this.A07 = context;
        this.A0C = r6;
        this.A0B = r5;
        this.A09 = r3;
        this.A0A = r4;
    }

    public static final void A02(C18078Vl7 vl7, C353438Hq r3, boolean z) {
        Runnable ajo;
        if (!r3.A03()) {
            vl7.A06(C391639tP.PROMPT_GENERIC_ERROR);
            if (!r3.A09.A0Y()) {
                C310336ap r2 = new C310336ap();
                Context context = r3.A07;
                r2.A0D = context.getString(2131974304);
                r2.A0I = context.getString(2131974303);
                r2.A02();
                r2.A07(R.drawable.instagram_glasses_pano_outline_16);
                1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
                return;
            }
            return;
        }
        C352888Fl r1 = r3.A09;
        if (r1.A0Y()) {
            if (r1.A1I.A0i.A0A) {
                ajo = new C40817Ajn(r3);
            } else {
                vl7.A06(C391639tP.PROMPT_GENERIC_ERROR);
                return;
            }
        } else if (z) {
            vl7.A06(C391639tP.PHOTO_CAPTURED);
            C352888Fl.A09(r1);
            return;
        } else {
            ajo = new C40818Ajo(r3);
        }
        C342057ny.A00(ajo);
    }

    public final void Ds2() {
        if (!A03() || this.A00) {
            ARR();
        } else {
            DWr();
        }
    }
}
