package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class IL3 implements JR4 {
    public final 0wc A00;
    public final UserSession A01;
    public final C57282IVr A02;
    public final C249763kK A03;
    public final String A04;
    public final AnonymousClass0iw A05;
    public final C228232l0 A06;

    public final /* synthetic */ void Ciu(List list) {
    }

    public final void Ck7(String str) {
        String str2;
        String str3;
        AnonymousClass3W1 r4;
        List list;
        C275544qW r2;
        AFI_TYPE afi_type;
        String str4 = str;
        0qQ.A0B(str4, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_ads_feedback_interface_response");
        if (A0e.isSampled()) {
            C57282IVr iVr = this.A02;
            C53263GlB glB = iVr.A06;
            LinkedHashMap A002 = A00(iVr, false);
            C53278GlQ glQ = glB.A01;
            if (glQ == null || (afi_type = glQ.A00) == null || (str2 = afi_type.A00) == null) {
                str2 = "";
            }
            long j = (long) iVr.A00;
            if (glQ == null || (list = glQ.A04) == null || (r2 = (C275544qW) 00k.A0J(list)) == null || (str3 = r2.Bid()) == null) {
                str3 = "";
            }
            String A012 = C56194HuN.A01(iVr.A04);
            A01(A0e, glB, this);
            String str5 = this.A04;
            A0e.AAJ("afi_id", str5);
            A0e.AAJ("afi_type", str2);
            C51969G9p.A1E(A0e, "ad_tracking_token", iVr.A05, A002);
            A0e.AAJ("trigger_source", A012);
            C51971G9r.A19(A0e, str3, str4);
            A02(A0e, this, j);
            A0e.Cgf();
            1Xj r5 = iVr.A02;
            if (r5 != null && (r4 = iVr.A03) != null) {
                this.A06.DUE(new C301165yf((C376459Ib) null, new C53251Gkz(AnonymousClass05K.A00, str5, iVr.A05, str2, str3, A012, str4, A002, j), "", ""), C233162v9.AFI, r5, r4);
            }
        }
    }

    public final void Cl2(String str) {
        String str2;
        String str3;
        AnonymousClass3W1 r4;
        List list;
        C275544qW r2;
        AFI_TYPE afi_type;
        String str4 = str;
        0qQ.A0B(str4, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_ads_feedback_interface_undo");
        if (A0e.isSampled()) {
            C57282IVr iVr = this.A02;
            C53263GlB glB = iVr.A06;
            LinkedHashMap A002 = A00(iVr, false);
            C53278GlQ glQ = glB.A01;
            if (glQ == null || (afi_type = glQ.A00) == null || (str2 = afi_type.A00) == null) {
                str2 = "";
            }
            long j = (long) iVr.A00;
            if (glQ == null || (list = glQ.A04) == null || (r2 = (C275544qW) 00k.A0J(list)) == null || (str3 = r2.Bid()) == null) {
                str3 = "";
            }
            String A012 = C56194HuN.A01(iVr.A04);
            A01(A0e, glB, this);
            String str5 = this.A04;
            A0e.AAJ("afi_id", str5);
            A0e.AAJ("afi_type", str2);
            C51969G9p.A1E(A0e, "ad_tracking_token", iVr.A05, A002);
            A0e.AAJ("trigger_source", A012);
            C51971G9r.A19(A0e, str3, str4);
            A02(A0e, this, j);
            A0e.Cgf();
            1Xj r5 = iVr.A02;
            if (r5 != null && (r4 = iVr.A03) != null) {
                this.A06.DUE(new C301165yf((C376459Ib) null, new C53251Gkz(AnonymousClass05K.A01, str5, iVr.A05, str2, str3, A012, str4, A002, j), "", ""), C233162v9.AFI, r5, r4);
            }
        }
    }

    public static final LinkedHashMap A00(C57282IVr iVr, boolean z) {
        LinkedHashMap A1H;
        String str;
        double d;
        double d2;
        HashMap hashMap;
        C53278GlQ glQ = iVr.A06.A01;
        if (glQ == null || (hashMap = glQ.A03) == null) {
            A1H = AnonymousClass7TE.A1H();
        } else {
            A1H = new LinkedHashMap(hashMap);
        }
        if (z) {
            long j = iVr.A01;
            if (j != -1) {
                d2 = (double) C51966G9m.A07(j);
                d = 0.001d;
            } else {
                d = 1.0d;
                d2 = (double) j;
            }
            A1H.put("ad_dwell_time", String.valueOf(d2 * d));
        }
        1Xj r0 = iVr.A02;
        if (r0 == null || (str = r0.A2T()) == null) {
            str = "";
        }
        A1H.put("ads_category", str);
        return A1H;
    }

    public static void A01(0Aj r2, C53263GlB glB, IL3 il3) {
        r2.A9F("ad_id", Long.valueOf(glB.A00));
        r2.A9F("ig_userid", Long.valueOf(Long.parseLong(il3.A01.A06)));
    }

    public final String AaG() {
        return this.A04;
    }

    public final void Chi() {
        String str;
        AFI_TYPE afi_type;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_ads_feedback_interface_dismiss");
        if (A0e.isSampled()) {
            C57282IVr iVr = this.A02;
            C53263GlB glB = iVr.A06;
            LinkedHashMap A002 = A00(iVr, false);
            A01(A0e, glB, this);
            A0e.AAJ("afi_id", this.A04);
            C53278GlQ glQ = glB.A01;
            if (glQ == null || (afi_type = glQ.A00) == null || (str = afi_type.A00) == null) {
                str = "";
            }
            A0e.AAJ("question_id", C56194HuN.A00(A0e, glQ, iVr, str, A002));
            A02(A0e, this, (long) iVr.A00);
            A0e.Cgf();
        }
    }

    public final void Cis() {
        String str;
        AFI_TYPE afi_type;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_ads_feedback_interface_impression");
        if (A0e.isSampled()) {
            C57282IVr iVr = this.A02;
            C53263GlB glB = iVr.A06;
            LinkedHashMap A002 = A00(iVr, true);
            A01(A0e, glB, this);
            A0e.AAJ("afi_id", this.A04);
            C53278GlQ glQ = glB.A01;
            if (glQ == null || (afi_type = glQ.A00) == null || (str = afi_type.A00) == null) {
                str = "";
            }
            A0e.AAJ("question_id", C56194HuN.A00(A0e, glQ, iVr, str, A002));
            A02(A0e, this, (long) iVr.A00);
            A0e.Cgf();
        }
    }

    public final void Ckv(long j) {
        String str;
        AFI_TYPE afi_type;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_ads_feedback_interface_timespent");
        if (A0e.isSampled()) {
            C57282IVr iVr = this.A02;
            C53263GlB glB = iVr.A06;
            LinkedHashMap A002 = A00(iVr, false);
            A01(A0e, glB, this);
            A0e.AAJ("afi_id", this.A04);
            C53278GlQ glQ = glB.A01;
            if (glQ == null || (afi_type = glQ.A00) == null || (str = afi_type.A00) == null) {
                str = "";
            }
            A0e.AAJ("question_id", C56194HuN.A00(A0e, glQ, iVr, str, A002));
            A02(A0e, this, (long) iVr.A00);
            C51974G9v.A0m(A0e, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r0 = r0.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IL3(X.AnonymousClass0iw r2, com.instagram.common.session.UserSession r3, X.C57282IVr r4, X.C228232l0 r5, X.C249763kK r6) {
        /*
            r1 = this;
            X.C51974G9v.A1P(r3, r6, r2, r4)
            r0 = 5
            X.0qQ.A0B(r5, r0)
            r1.<init>()
            r1.A01 = r3
            r1.A03 = r6
            r1.A05 = r2
            r1.A02 = r4
            r1.A06 = r5
            X.GlB r0 = r4.A06
            X.GlQ r0 = r0.A01
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x0020
        L_0x001e:
            java.lang.String r0 = ""
        L_0x0020:
            r1.A04 = r0
            X.0wc r0 = X.C51972G9s.A0a(r2, r3)
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IL3.<init>(X.0iw, com.instagram.common.session.UserSession, X.IVr, X.2l0, X.3kK):void");
    }

    public static void A02(0Aj r2, IL3 il3, long j) {
        r2.A9F("global_position", Long.valueOf(j));
        r2.AAJ("client_session_id", il3.A03.getSessionId());
    }
}
