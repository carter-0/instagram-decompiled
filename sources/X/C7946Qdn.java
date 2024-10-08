package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Qdn  reason: case insensitive filesystem */
public final class C7946Qdn extends C9595RdZ {
    public final C11185SEl A00;
    public final C11354SOn A01;
    public final SRW A02;
    public final C10748RxS A03;
    public final UserSession A04;
    public final AnonymousClass3Q2 A05;

    public final double A00() {
        int i;
        String str;
        C10565RuK ruK;
        String str2;
        C11185SEl sEl = this.A00;
        if (sEl != null) {
            if (C11185SEl.A00(sEl)) {
                sEl.A01.flowStart(sEl.A00, "CALCULATE_MOS", false);
            }
            AnonymousClass3Q2 r6 = this.A05;
            Integer num = r6.A1T.A06;
            if (C11185SEl.A00(sEl)) {
                1QP r5 = sEl.A01;
                long j = sEl.A00;
                if (num != null) {
                    str2 = C273764n9.A00(num);
                } else {
                    str2 = null;
                }
                r5.flowAnnotate(j, "transcode_type", str2);
            }
            String A012 = C59906JbV.A01(this.A04, r6);
            if (C11185SEl.A00(sEl)) {
                sEl.A01.flowAnnotate(sEl.A00, "ingest_surface", A012);
            }
        }
        C11354SOn sOn = this.A01;
        C10748RxS rxS = this.A03;
        SRW srw = this.A02;
        AnonymousClass7TF.A1B(sOn, 0, srw);
        boolean z = srw.A02;
        C8907RFa rFa = C8907RFa.CODEC_VIDEO_HEVC;
        String str3 = srw.A01;
        boolean z2 = false;
        if (str3 != null) {
            try {
                if (C8907RFa.valueOf(str3) == rFa) {
                    z2 = true;
                }
            } catch (Exception unused) {
            }
        }
        C8907RFa rFa2 = C8907RFa.CODEC_VIDEO_AV1;
        boolean z3 = false;
        if (str3 != null) {
            try {
                if (C8907RFa.valueOf(str3) == rFa2) {
                    z3 = true;
                }
            } catch (Exception unused2) {
            }
        }
        int i2 = srw.A07;
        if (i2 <= 1) {
            i2 = sOn.A08;
        }
        int i3 = srw.A06;
        if (i3 <= 1) {
            i3 = sOn.A06;
        }
        int i4 = (int) srw.A0H;
        int i5 = i4;
        if (rxS != null) {
            i = rxS.A00;
        } else {
            i = -1;
        }
        int i6 = srw.A0D;
        int i7 = srw.A0B;
        int i8 = (int) srw.A0I;
        if (i2 <= 1) {
            i2 = 815;
        }
        if (i3 <= 1) {
            i3 = 1112;
        }
        if (i4 <= 1) {
            i5 = 1300588;
        }
        if (i <= 1) {
            i = 30;
        }
        if (i6 <= 1) {
            i6 = 815;
        }
        if (i7 <= 1) {
            i7 = 1112;
        }
        if (i8 <= 1) {
            i8 = 1300588;
        }
        if (sEl != null && C11185SEl.A00(sEl)) {
            1QP r3 = sEl.A01;
            long j2 = sEl.A00;
            r3.flowAnnotate(j2, "feature_is_target_hdr", z);
            r3.flowAnnotate(j2, "feature_is_passthrough_upload", false);
            r3.flowAnnotate(j2, "feature_is_target_codec_hevc", z2);
            r3.flowAnnotate(j2, "feature_is_target_codec_av1", z3);
            r3.flowAnnotate(j2, "feature_source_width", i2);
            r3.flowAnnotate(j2, "feature_source_height", i3);
            r3.flowAnnotate(j2, "feature_source_bitrate_bps", i5);
            r3.flowAnnotate(j2, "feature_source_frame_rate", i);
            r3.flowAnnotate(j2, "feature_target_width", i6);
            r3.flowAnnotate(j2, "feature_target_height", i7);
            r3.flowAnnotate(j2, "feature_target_bitrate_bps", i8);
            r3.flowAnnotate(j2, "feature_ar_class_v2", 50);
            r3.flowAnnotate(j2, "feature_keyframe_size", 15000);
            r3.flowAnnotate(j2, "feature_partial_frame_size", 1800);
        }
        UserSession userSession = this.A04;
        0Tu r52 = 0Tu.A05;
        double A002 = 182.A00(r52, userSession, 37164798688887129L);
        double A003 = 182.A00(r52, userSession, 37164798689345888L);
        182.A00(r52, userSession, 37164798689411425L);
        double A004 = 182.A00(r52, userSession, 37164798689280351L);
        double A005 = 182.A00(r52, userSession, 37164798689214814L);
        double A006 = 182.A00(r52, userSession, 37164798689018203L);
        double A007 = 182.A00(r52, userSession, 37164798689083740L);
        double A008 = 182.A00(r52, userSession, 37164798689608036L);
        double A009 = 182.A00(r52, userSession, 37164798689476962L);
        double A0010 = 182.A00(r52, userSession, 37164798689542499L);
        double A0011 = 182.A00(r52, userSession, 37164798688952666L);
        double A0012 = 182.A00(r52, userSession, 37164798689149277L);
        if (i3 <= 1 || i2 <= 1 || i5 <= 1 || i <= 1 || i8 <= 1 || i7 <= 1 || i6 <= 1) {
            str = "UPLOAD_MOS_CALC_FAILURE_INVALID_FEATURES";
            ruK = new C10565RuK(this, str, -1.0d);
        } else {
            if (i3 >= i2) {
                i3 = i2;
            }
            if (i7 >= i6) {
                i7 = i6;
            }
            double d = (double) i3;
            double d2 = (double) i8;
            double log = A002 + (A005 * Math.log(d)) + (A006 * Math.log(50.0d)) + (A007 * Math.log(d2)) + (A008 * Math.log(15000.0d)) + (A009 * Math.log(1800.0d)) + (A0010 * Math.log((double) i)) + (A0012 * ((d * 1.0d) / ((double) i7))) + (A0011 * ((((double) i5) * 1.0d) / d2));
            double d3 = 0.0d;
            if (!z) {
                A003 = 0.0d;
            }
            double d4 = log + A003 + 0.0d;
            if (z2 || z3) {
                d3 = A004;
            }
            double d5 = d4 + d3;
            if (d5 <= 10.0d || d5 >= 100.0d) {
                str = "UPLOAD_MOS_CALC_FAILURE_MOS_OUT_OF_BOUNDS";
                ruK = new C10565RuK(this, str, -1.0d);
            } else {
                ruK = new C10565RuK(this, (String) null, d5);
            }
        }
        if (sEl != null) {
            double d6 = ruK.A00;
            if (C11185SEl.A00(sEl)) {
                sEl.A01.flowAnnotate(sEl.A00, "unified_upload_mos_score", d6);
            }
        }
        String str4 = ruK.A01;
        if (str4 != null) {
            if (sEl != null && C11185SEl.A00(sEl)) {
                1QP r32 = sEl.A01;
                long j3 = sEl.A00;
                r32.flowAnnotate(j3, "failure_type", str4);
                r32.flowEndFail(j3, str4, "");
            }
        } else if (sEl != null && C11185SEl.A00(sEl)) {
            sEl.A01.flowEndSuccess(sEl.A00);
        }
        return ruK.A00;
    }

    public C7946Qdn(C11185SEl sEl, C11354SOn sOn, SRW srw, C10748RxS rxS, UserSession userSession, AnonymousClass3Q2 r6) {
        this.A04 = userSession;
        this.A01 = sOn;
        this.A03 = rxS;
        this.A02 = srw;
        this.A05 = r6;
        this.A00 = sEl;
    }
}
