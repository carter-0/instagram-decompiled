package X;

import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class W05 {
    public static final AnonymousClass0iw A0B = new WPP();
    public 0xF A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public final UserSession A09;
    public final 1Q9 A0A = 1Q9.A01("ig_local");

    public W05(UserSession userSession) {
        this.A09 = userSession;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01d3, code lost:
        r2.Cgf();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r11 = this;
            java.lang.String r3 = r11.A04
            if (r3 == 0) goto L_0x01d8
            int r0 = r3.hashCode()
            switch(r0) {
                case -1573164919: goto L_0x001f;
                case 120623625: goto L_0x0082;
                case 305513999: goto L_0x014d;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 0
            r11.A04 = r0
            r11.A07 = r0
            r11.A01 = r0
            r11.A02 = r0
            r11.A03 = r0
            r11.A05 = r0
            r11.A06 = r0
            r11.A08 = r0
            r11.A00 = r0
            return
        L_0x001f:
            java.lang.String r0 = "start_step"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            com.instagram.common.session.UserSession r1 = r11.A09
            X.0iw r0 = A0B
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r0 = "ig_local_start_step"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x000b
            java.lang.String r1 = r11.A06
            java.lang.String r0 = "mLocationID cannot be null"
            X.17k.A07(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r1)
            java.lang.String r0 = "location_id"
            r2.A9F(r0, r1)
            java.lang.String r1 = r11.A07
            java.lang.String r0 = "mStep cannot be null"
            X.17k.A07(r1, r0)
            X.DbS.A1H(r2, r1)
            X.1Q9 r3 = r11.A0A
            java.lang.String r1 = r3.A05()
            java.lang.String r0 = "waterfall_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r11.A05
            java.lang.String r0 = "fb_page_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = r11.A02
            X.DbS.A1N(r2, r0)
            long r0 = r3.A03()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "start_time"
            r2.A9F(r0, r1)
            java.util.List r1 = r11.A08
            java.lang.String r0 = "available_options"
            r2.AAe(r0, r1)
            goto L_0x01d3
        L_0x0082:
            java.lang.String r0 = "impression"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            com.instagram.common.session.UserSession r1 = r11.A09
            X.0iw r0 = A0B
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r0 = "ig_local_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x000b
            java.lang.String r1 = r11.A01
            java.lang.String r0 = "component"
            r2.AAJ(r0, r1)
            java.lang.String r0 = r11.A07
            X.DbS.A1H(r2, r0)
            X.1Q9 r4 = r11.A0A
            java.lang.String r1 = r4.A05()
            java.lang.String r0 = "waterfall_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r11.A06
            java.lang.String r0 = "location_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r11.A05
            java.lang.String r0 = "fb_page_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = r11.A02
            X.DbS.A1N(r2, r0)
            X.0xF r9 = r11.A00
            if (r9 == 0) goto L_0x0116
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r5 = "available_media"
            java.util.ArrayList r10 = r9.A06(r5)
            if (r10 == 0) goto L_0x00f8
            r7 = 0
            java.util.Iterator r3 = r10.iterator()
        L_0x00df:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r0 = r3.next()
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.String r0 = r0.toString()
            r6.put(r1, r0)
            r0 = 1
            long r7 = r7 + r0
            goto L_0x00df
        L_0x00f8:
            java.lang.String r3 = "profile_id"
            java.lang.String r0 = r9.A05(r3)
            if (r10 == 0) goto L_0x0116
            if (r0 == 0) goto L_0x0116
            X.UG6 r1 = new X.UG6
            r1.<init>()
            java.lang.Long r0 = X.DbV.A0q(r0)
            r1.A05(r3, r0)
            r1.A08(r5, r6)
            java.lang.String r0 = "extra_data"
            r2.AAK(r1, r0)
        L_0x0116:
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            long r4 = r4.A03()
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r0 = 1256(0x4e8, float:1.76E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            long r6 = r6 - r4
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.String r0 = "elapsed_time"
            r2.A9F(r0, r1)
            java.lang.String r0 = "start_time"
            r2.A9F(r0, r3)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            r0 = 3161(0xc59, float:4.43E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A7p(r0, r1)
            goto L_0x01d3
        L_0x014d:
            java.lang.String r0 = "fetch_data"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            com.instagram.common.session.UserSession r1 = r11.A09
            X.0iw r0 = A0B
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r0 = "ig_local_fetch_data"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            X.1Q9 r6 = r11.A0A
            long r4 = r6.A03()
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x000b
            java.lang.String r1 = r11.A06
            java.lang.String r0 = "mLocationID cannot be null"
            X.17k.A07(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r1)
            java.lang.String r0 = "location_id"
            r2.A9F(r0, r1)
            java.lang.String r1 = r11.A07
            java.lang.String r0 = "mStep cannot be null"
            X.17k.A07(r1, r0)
            X.DbS.A1H(r2, r1)
            java.lang.String r1 = r6.A05()
            java.lang.String r0 = "waterfall_id"
            r2.AAJ(r0, r1)
            long r0 = r6.A03()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "start_time"
            r2.A9F(r0, r1)
            long r7 = r7 - r4
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.String r0 = "elapsed_time"
            r2.A9F(r0, r1)
            r0 = 1256(0x4e8, float:1.76E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r3)
            java.lang.String r1 = r11.A05
            if (r1 == 0) goto L_0x01c3
            java.lang.String r0 = "fb_page_id"
            r2.AAJ(r0, r1)
        L_0x01c3:
            java.lang.String r0 = r11.A02
            if (r0 == 0) goto L_0x01ca
            X.DbS.A1N(r2, r0)
        L_0x01ca:
            java.lang.String r1 = r11.A01
            if (r1 == 0) goto L_0x01d3
            java.lang.String r0 = "component"
            r2.AAJ(r0, r1)
        L_0x01d3:
            r2.Cgf()
            goto L_0x000b
        L_0x01d8:
            X.1Q9 r2 = r11.A0A
            java.lang.String r1 = "ig_local"
            java.lang.String r0 = "_"
            java.lang.String r0 = X.002.A0g(r1, r0, r3)
            X.0xI r2 = r2.A04(r0)
            java.lang.String r1 = r11.A07
            if (r1 == 0) goto L_0x01ef
            java.lang.String r0 = "step"
            r2.A0C(r0, r1)
        L_0x01ef:
            java.lang.String r1 = r11.A01
            if (r1 == 0) goto L_0x01f8
            java.lang.String r0 = "component"
            r2.A0C(r0, r1)
        L_0x01f8:
            java.lang.String r1 = r11.A05
            if (r1 == 0) goto L_0x0201
            java.lang.String r0 = "fb_page_id"
            r2.A0C(r0, r1)
        L_0x0201:
            java.util.List r1 = r11.A08
            if (r1 == 0) goto L_0x020a
            java.lang.String r0 = "available_options"
            r2.A0D(r0, r1)
        L_0x020a:
            X.0xF r1 = r11.A00
            if (r1 == 0) goto L_0x0213
            java.lang.String r0 = "extra_data"
            r2.A05(r1, r0)
        L_0x0213:
            java.lang.String r1 = r11.A06
            if (r1 == 0) goto L_0x021c
            java.lang.String r0 = "location_id"
            r2.A0C(r0, r1)
        L_0x021c:
            java.lang.String r1 = r11.A03
            if (r1 == 0) goto L_0x0225
            java.lang.String r0 = "error_message"
            r2.A0C(r0, r1)
        L_0x0225:
            java.lang.String r1 = r11.A02
            if (r1 == 0) goto L_0x022e
            java.lang.String r0 = "entry_point"
            r2.A0C(r0, r1)
        L_0x022e:
            com.instagram.common.session.UserSession r0 = r11.A09
            X.DbU.A1R(r2, r0)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W05.A01():void");
    }

    public final void A02(0xF r5, 0xF r6, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(A0B, this.A09), "ig_local_action");
        if (A0e.isSampled()) {
            A0e.AAJ("location_id", str4);
            DbS.A1H(A0e, str);
            DbS.A1J(A0e, str2);
            if (str3 != null) {
                A0e.AAJ("component", str3);
            }
            if (map != null) {
                A0e.A9H("available_options", map);
            }
            if (r5 != null) {
                0bb r2 = new 0bb();
                r2.A06("tab", r5.A05("tab"));
                A0e.AAK(r2, "selected_values");
            }
            if (r6 != null) {
                0bb r22 = new 0bb();
                r22.A05("profile_id", r6.A04("profile_id"));
                A0e.AAK(r22, "extra_data");
            }
            if (str5 != null) {
                A0e.AAJ("fb_page_id", str5);
            }
            if (str6 != null) {
                C51965G9l.A1I(A0e, str6);
            }
            A0e.Cgf();
        }
    }

    public static String A00(0lg r2) {
        0xE A002;
        int size;
        2cc A003 = C71342cb.A00(r2);
        String str = A003.A05;
        if (str == null || (A002 = 2cc.A00(A003, str)) == null || (size = A002.Ezt().A01.size()) <= 0) {
            return null;
        }
        AnalyticsEventDebugInfo analyticsEventDebugInfo = ((AnalyticsEventEntry) A002.Ezt().A01.get(size - 1)).A00;
        if (analyticsEventDebugInfo == null || analyticsEventDebugInfo.A01.size() <= 0) {
            return null;
        }
        return String.valueOf(((AnalyticsEventEntry) analyticsEventDebugInfo.A01.get(0)).A01);
    }
}
