package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.93X  reason: invalid class name */
public abstract class AnonymousClass93X {
    public static final List A00(UserSession userSession, String str, List list) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(list, 1);
        0qQ.A0B(str, 2);
        if ((182.A06(0Tu.A05, userSession, 36318509745838272L) && AnonymousClass5M0.A02(str).A02()) || (!1KU.A09(userSession) && !AnonymousClass5M0.A02(str).A00())) {
            return list;
        }
        List singletonList = Collections.singletonList(C295365o2.ORGANIC);
        0qQ.A07(singletonList);
        return A01(userSession, str, list, singletonList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r18 == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02bc, code lost:
        r12 = "is prefetch";
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (X.0qQ.A0K(r11, "feed_timeline") != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a2, code lost:
        r3 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a4, code lost:
        if (r17 == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00af, code lost:
        if (X.182.A06(r3, r8, 36318509744593072L) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b1, code lost:
        if (r7 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bc, code lost:
        if (X.182.A06(r3, r8, 36318509744658609L) == false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00be, code lost:
        if (r4 == false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0100, code lost:
        if (r12.equals(r0) != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010c, code lost:
        if (r12.equals(r0) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x010e, code lost:
        r0 = X.1KU.A0A(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0132, code lost:
        r0 = X.182.A06(r3, r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0136, code lost:
        if (r0 == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0146, code lost:
        if (X.182.A06(r3, r8, 36318509744396461L) == false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0148, code lost:
        if (r7 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0153, code lost:
        if (X.182.A06(r3, r8, 36318509744461998L) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0155, code lost:
        if (r4 == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(com.instagram.common.session.UserSession r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            r2 = 0
            r7 = 0
            r9 = r12
            int r0 = r12.length()
            r8 = r11
            if (r0 != 0) goto L_0x015d
            r0 = 0
        L_0x000b:
            r5 = 0
            r11 = r13
            r10 = r14
            r14 = r16
            r13 = r17
            if (r0 == 0) goto L_0x001a
            java.lang.String r12 = "should exclude from sync flow"
        L_0x0016:
            A02(r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        L_0x001a:
            java.lang.String r3 = "clips_viewer_clips_tab"
            boolean r0 = r12.equals(r3)
            if (r0 != 0) goto L_0x0027
            if (r19 != 0) goto L_0x0027
            r1 = 1
            if (r18 != 0) goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            boolean r0 = X.1KU.A09(r8)
            if (r0 == 0) goto L_0x0159
            if (r1 != 0) goto L_0x0159
            boolean r1 = X.0qQ.A0K(r11, r3)
            if (r15 == 0) goto L_0x007f
            if (r1 != 0) goto L_0x0041
            java.lang.String r0 = "feed_timeline"
            boolean r0 = X.0qQ.A0K(r11, r0)
            r4 = 0
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            r4 = 1
        L_0x0042:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318509744527535(0x81077e001818af, double:3.031310033115127E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0059
            if (r16 != 0) goto L_0x006e
            if (r4 == 0) goto L_0x0059
            boolean r0 = r12.equals(r3)
            if (r0 != 0) goto L_0x006e
        L_0x0059:
            r0 = 36318509744330924(0x81077e001518ac, double:3.0313100329907894E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0070
            if (r16 != 0) goto L_0x006e
            if (r4 == 0) goto L_0x0070
            boolean r0 = r12.equals(r3)
            if (r0 != 0) goto L_0x0070
        L_0x006e:
            r5 = 1
        L_0x006f:
            return r5
        L_0x0070:
            r0 = 36318509744527535(0x81077e001818af, double:3.031310033115127E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x006f
            java.lang.String r12 = "is prefetch"
            goto L_0x02bf
        L_0x007f:
            boolean r0 = r12.equals(r3)
            if (r0 == 0) goto L_0x008a
            if (r1 != 0) goto L_0x0089
            if (r16 == 0) goto L_0x008a
        L_0x0089:
            r7 = 1
        L_0x008a:
            boolean r0 = X.0qQ.A0K(r11, r3)
            r4 = 1
            r1 = r0 ^ 1
            boolean r0 = r12.equals(r3)
            if (r0 != 0) goto L_0x013a
            if (r1 != 0) goto L_0x009b
            if (r16 == 0) goto L_0x013a
        L_0x009b:
            int r0 = r12.hashCode()
            switch(r0) {
                case -1782849828: goto L_0x0123;
                case -1605077561: goto L_0x0113;
                case -1173934446: goto L_0x0106;
                case -893240619: goto L_0x0103;
                case -464728503: goto L_0x00fa;
                case -245756598: goto L_0x00f7;
                case -39744821: goto L_0x00e7;
                case 132014642: goto L_0x00e4;
                case 1310132869: goto L_0x00d4;
                case 1794301627: goto L_0x00c4;
                case 1978956600: goto L_0x00c1;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            X.0Tu r3 = X.0Tu.A05
            if (r17 == 0) goto L_0x013d
            r0 = 36318509744593072(0x81077e001918b0, double:3.031310033156573E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 == 0) goto L_0x00b3
            if (r7 != 0) goto L_0x006e
        L_0x00b3:
            r0 = 36318509744658609(0x81077e001a18b1, double:3.0313100331980187E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 == 0) goto L_0x02bc
            if (r4 == 0) goto L_0x02bc
            goto L_0x006e
        L_0x00c1:
            java.lang.String r0 = "clips_viewer_feed_sa_multi_ads_watch_and_browse"
            goto L_0x0108
        L_0x00c4:
            java.lang.String r0 = "clips_viewer_feed_timeline_feed_of_ads"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00a2
            X.0Tu r3 = X.0Tu.A06
            r0 = 36321992962025354(0x810aa90009278a, double:3.033512833886539E-306)
            goto L_0x0132
        L_0x00d4:
            java.lang.String r0 = "clips_viewer_feed_timeline_tall_video_watch_and_browse_with_chaining"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00a2
            X.0Tu r3 = X.0Tu.A06
            r0 = 36321992962156428(0x810aa9000b278c, double:3.0335128339694305E-306)
            goto L_0x0132
        L_0x00e4:
            java.lang.String r0 = "clips_viewer_direct_ad_feed_of_ads"
            goto L_0x00fc
        L_0x00e7:
            java.lang.String r0 = "clips_viewer_feed_timeline_watch_and_browse_with_chaining"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00a2
            X.0Tu r3 = X.0Tu.A06
            r0 = 36321992962090891(0x810aa9000a278b, double:3.0335128339279846E-306)
            goto L_0x0132
        L_0x00f7:
            java.lang.String r0 = "clips_viewer_feed_multi_ads_ad_chain"
            goto L_0x0108
        L_0x00fa:
            java.lang.String r0 = "clips_viewer_explore_grid_ad_feed_of_ads"
        L_0x00fc:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x006e
            goto L_0x00a2
        L_0x0103:
            java.lang.String r0 = "clips_viewer_feed_pae_multi_ads_ad_chain"
            goto L_0x0108
        L_0x0106:
            java.lang.String r0 = "clips_viewer_feed_pae_multi_ads_watch_and_browse"
        L_0x0108:
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00a2
            boolean r0 = X.1KU.A0A(r8)
            goto L_0x0136
        L_0x0113:
            java.lang.String r0 = "clips_viewer_clips_multi_ads_feed_of_ads"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00a2
            X.0Tu r3 = X.0Tu.A06
            r0 = 36319239891328069(0x810828003c1c45, double:3.03177178089185E-306)
            goto L_0x0132
        L_0x0123:
            java.lang.String r0 = "clips_viewer_clips_pae_multi_ads_feed_of_ads"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00a2
            X.0Tu r3 = X.0Tu.A06
            r0 = 36319239891393606(0x810828003d1c46, double:3.031771780933296E-306)
        L_0x0132:
            boolean r0 = X.182.A06(r3, r8, r0)
        L_0x0136:
            if (r0 == 0) goto L_0x00a2
            goto L_0x006e
        L_0x013a:
            r4 = 0
            goto L_0x009b
        L_0x013d:
            r0 = 36318509744396461(0x81077e001618ad, double:3.031310033032235E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 == 0) goto L_0x014a
            if (r7 != 0) goto L_0x006e
        L_0x014a:
            r0 = 36318509744461998(0x81077e001718ae, double:3.031310033073681E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 == 0) goto L_0x006f
            if (r4 == 0) goto L_0x006f
            goto L_0x006e
        L_0x0159:
            java.lang.String r12 = "sync flow disabled"
            goto L_0x0016
        L_0x015d:
            X.0Tu r3 = X.0Tu.A06
            r0 = 36881459698598265(0x83077e00220179, double:3.387321850886974E-306)
            java.lang.String r1 = X.182.A04(r3, r11, r0)
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r1 = X.00l.A0R(r1, r0, r2)
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0181:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = X.00l.A0B(r0)
            java.lang.String r0 = r0.toString()
            r4.add(r0)
            goto L_0x0181
        L_0x0199:
            java.lang.String r1 = "clips_viewer_direct_ad_feed_of_ads"
            java.lang.String r0 = "clips_viewer_explore_grid_ad_feed_of_ads"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r6 = X.0sr.A1P(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x01ae:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r1 = r4.next()
            boolean r0 = r6.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ae
            r5.add(r1)
            goto L_0x01ae
        L_0x01c4:
            r0 = 36319239891328069(0x810828003c1c45, double:3.03177178089185E-306)
            boolean r0 = X.182.A06(r3, r11, r0)
            if (r0 == 0) goto L_0x01f1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r5.iterator()
        L_0x01d8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01f0
            java.lang.Object r1 = r4.next()
            java.lang.String r0 = "clips_viewer_clips_multi_ads_feed_of_ads"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01d8
            r6.add(r1)
            goto L_0x01d8
        L_0x01f0:
            r5 = r6
        L_0x01f1:
            r0 = 36319239891393606(0x810828003d1c46, double:3.031771780933296E-306)
            boolean r0 = X.182.A06(r3, r11, r0)
            if (r0 == 0) goto L_0x021e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r5.iterator()
        L_0x0205:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x021d
            java.lang.Object r1 = r4.next()
            java.lang.String r0 = "clips_viewer_clips_pae_multi_ads_feed_of_ads"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0205
            r6.add(r1)
            goto L_0x0205
        L_0x021d:
            r5 = r6
        L_0x021e:
            r0 = 36321992962025354(0x810aa90009278a, double:3.033512833886539E-306)
            boolean r0 = X.182.A06(r3, r11, r0)
            if (r0 == 0) goto L_0x024b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r5.iterator()
        L_0x0232:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x024a
            java.lang.Object r1 = r4.next()
            java.lang.String r0 = "clips_viewer_feed_timeline_feed_of_ads"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0232
            r6.add(r1)
            goto L_0x0232
        L_0x024a:
            r5 = r6
        L_0x024b:
            boolean r0 = X.1KU.A0A(r11)
            if (r0 == 0) goto L_0x0289
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x025a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0288
            java.lang.Object r4 = r5.next()
            java.lang.String r0 = "clips_viewer_feed_pae_multi_ads_ad_chain"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x025a
            java.lang.String r0 = "clips_viewer_feed_multi_ads_ad_chain"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x025a
            java.lang.String r0 = "clips_viewer_feed_pae_multi_ads_watch_and_browse"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x025a
            java.lang.String r0 = "clips_viewer_feed_sa_multi_ads_watch_and_browse"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x025a
            r1.add(r4)
            goto L_0x025a
        L_0x0288:
            r5 = r1
        L_0x0289:
            r0 = 36321992962156428(0x810aa9000b278c, double:3.0335128339694305E-306)
            boolean r0 = X.182.A06(r3, r11, r0)
            if (r0 == 0) goto L_0x02b6
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r5.iterator()
        L_0x029d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02b5
            java.lang.Object r1 = r3.next()
            java.lang.String r0 = "clips_viewer_feed_timeline_tall_video_watch_and_browse_with_chaining"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x029d
            r4.add(r1)
            goto L_0x029d
        L_0x02b5:
            r5 = r4
        L_0x02b6:
            boolean r0 = r5.contains(r12)
            goto L_0x000b
        L_0x02bc:
            java.lang.String r12 = "is prefetch"
            r15 = r2
        L_0x02bf:
            A02(r8, r9, r10, r11, r12, r13, r14, r15)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass93X.A03(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):boolean");
    }

    public static final List A01(UserSession userSession, String str, List list, List list2) {
        C295365o2 r8;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C267324bN r4 = (C267324bN) next;
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, userSession, 36318509745707198L) && (r8 = r4.A01) != C295365o2.ORGANIC && !GDZ.A01(r8)) {
                0wj r7 = 0wj.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("None organic or ad type is delivered and got filtered out, currentContainerModule ");
                sb.append(str);
                sb.append(", ClipsItemType ");
                sb.append(r8);
                r7.AEf(sb.toString(), 817895520).report();
            }
            if (182.A06(r5, userSession, 36318509745772735L)) {
                C295365o2 r1 = r4.A01;
                if (!list2.contains(r1) && r1 != C295365o2.PREVIEW) {
                }
            } else if (!list2.contains(r4.A01)) {
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    public static final void A02(UserSession userSession, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        if (182.A06(0Tu.A05, userSession, 36318509744658609L) && !str.equals("clips_viewer_clips_tab")) {
            0f9 AEf = 0wj.A01.AEf(002.A0u("Headload sync flow is not enabled for module ", str, ", subReason: ", str4), 817895520);
            AEf.ABR("isHeadLoad", z);
            AEf.ABQ("maxId", str2);
            AEf.ABQ("currentModule", str);
            AEf.ABR("isCheckForRequest", z2);
            AEf.ABQ("responseContainerModule", str3);
            AEf.ABR("isPrefetch", z3);
            AEf.report();
        }
    }
}
