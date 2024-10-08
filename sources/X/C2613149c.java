package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.49c  reason: invalid class name and case insensitive filesystem */
public final class C2613149c {
    public final Map A00;
    public final Map A01;
    public final Map A02;
    public final boolean A03;

    public static final void A00(C254253sB r10, C2613149c r11, String str, String str2, String str3, String str4, List list) {
        Long l;
        String str5;
        if (r10 == null) {
            r10 = (C254253sB) r11.A00.remove(str);
        }
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        ArrayList arrayList = new ArrayList(list);
        try {
            for (C2613049b r1 : r11.A01.values()) {
                AnonymousClass49Z r0 = r1.A01;
                String str6 = str4;
                if (str4 == null) {
                    str6 = r1.A02;
                }
                0qQ.A0B(str6, 0);
                AnonymousClass0kM r12 = new AnonymousClass0kM(r0.A00);
                r12.A01 = str6;
                r12.A01(0kJ.A05);
                0wc A002 = r12.A00();
                1Ln r3 = new 1Ln(A002.A00(A002.A00, "merlin_second_channel"), 337);
                if (r3.A00.isSampled()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C45367Cv9 cv9 = (C45367Cv9) it.next();
                        0bb r4 = new 0bb();
                        r4.A04("visibility", Double.valueOf((double) cv9.A00));
                        r4.A05("ts", Long.valueOf(cv9.A01));
                        int intValue = cv9.A02.intValue();
                        if (intValue == 0) {
                            str5 = "enter_visibility";
                        } else if (intValue == 1) {
                            str5 = "exit_visibility";
                        } else if (intValue == 2) {
                            str5 = "enter_coverage";
                        } else if (intValue != 3) {
                            str5 = "unknown";
                        } else {
                            str5 = "exit_coverage";
                        }
                        r4.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str5);
                        arrayList2.add(r4);
                    }
                    0bb r42 = new 0bb();
                    r42.A07("visibility_ts", arrayList2);
                    r3.A0R("origin", str2);
                    r3.A0R("entity_id", str);
                    r3.A0M(AnonymousClass2oW.UNKNOWN, "purpose");
                    r3.A0N(r42, C273654mx.A00(2306));
                    r3.A0R("visibility_detection_framework", str3);
                    if (r10 != null) {
                        if (!(r10 instanceof C57529IcH)) {
                            Class<?> cls = r10.getClass();
                            Map map = 0Yh.A03;
                            0qQ.A0B(cls, 1);
                            0KC.A0C("IgSecondChannelMerlinLoggerExtraDataAttacher", 002.A0R("Cannot attach extra data of type ", 0q1.A01(cls)));
                        } else {
                            C57529IcH icH = (C57529IcH) r10;
                            r3.A0R("tracking", (String) null);
                            r3.A00.A9H("two_measurement_debugging_fields", icH.A04);
                            r3.A0R("tracking_token", icH.A03);
                            0bb r43 = new 0bb();
                            r43.A06("multi_ads_id", icH.A01);
                            r43.A03("is_multi_ads", Boolean.valueOf(icH.A05));
                            r43.A06("surface", icH.A02);
                            Integer num = icH.A00;
                            if (num != null) {
                                l = Long.valueOf((long) num.intValue());
                            } else {
                                l = null;
                            }
                            r43.A05("multi_ads_type", l);
                            r3.A0N(r43, "ig_extra_payload");
                        }
                    }
                    r3.Cgf();
                }
            }
        } catch (Exception e) {
            0KC.A0C("SecondChannelMerlinManager", e.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if (r0 != null) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4 A[Catch:{ Exception -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c5 A[Catch:{ Exception -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e2 A[Catch:{ Exception -> 0x00d6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01(X.C53304Glq r17) {
        /*
            r16 = this;
            r10 = r16
            monitor-enter(r10)
            r6 = 0
            r2 = r17
            java.lang.String r12 = r2.A06     // Catch:{ all -> 0x0123 }
            java.lang.String r11 = r2.A04     // Catch:{ all -> 0x0123 }
            java.lang.Integer r3 = r2.A03     // Catch:{ all -> 0x0123 }
            long r0 = r2.A01     // Catch:{ all -> 0x0123 }
            float r4 = r2.A00     // Catch:{ all -> 0x0123 }
            X.Cv9 r5 = new X.Cv9     // Catch:{ all -> 0x0123 }
            r5.<init>(r3, r4, r0)     // Catch:{ all -> 0x0123 }
            boolean r0 = r10.A03     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x002b
            java.lang.String r13 = r2.A07     // Catch:{ all -> 0x0123 }
            java.util.List r15 = java.util.Collections.singletonList(r5)     // Catch:{ all -> 0x0123 }
            X.0qQ.A07(r15)     // Catch:{ all -> 0x0123 }
            X.3sB r9 = r2.A02     // Catch:{ all -> 0x0123 }
            java.lang.String r14 = r2.A05     // Catch:{ all -> 0x0123 }
            A00(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0123 }
            goto L_0x0121
        L_0x002b:
            X.3sB r9 = r2.A02     // Catch:{ all -> 0x0123 }
            r8 = 0
            r7 = 0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x00fa
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00fa
            java.util.Map r1 = r10.A00     // Catch:{ all -> 0x0123 }
            java.lang.Object r0 = r1.get(r11)     // Catch:{ all -> 0x0123 }
            X.3sB r0 = (X.C254253sB) r0     // Catch:{ all -> 0x0123 }
            if (r0 != 0) goto L_0x0044
            r0 = r9
        L_0x0044:
            if (r0 == 0) goto L_0x0049
            r1.put(r11, r0)     // Catch:{ all -> 0x0123 }
        L_0x0049:
            int r1 = r3.intValue()     // Catch:{ all -> 0x0123 }
            r0 = 1
            if (r1 == r6) goto L_0x0091
            if (r1 == r0) goto L_0x0079
            java.util.Map r3 = r10.A02     // Catch:{ all -> 0x0123 }
            boolean r0 = r3.containsKey(r11)     // Catch:{ all -> 0x0123 }
            if (r0 != 0) goto L_0x006d
            java.lang.String r1 = "SecondChannelMerlinManager"
            java.lang.String r0 = "Signal detected with no ENTER_VISIBILITY signal!"
            X.0KC.A0C(r1, r0)     // Catch:{ all -> 0x0123 }
            X.Cv9[] r0 = new X.C45367Cv9[]{r5}     // Catch:{ all -> 0x0123 }
            java.util.ArrayList r0 = X.0sr.A1M(r0)     // Catch:{ all -> 0x0123 }
            r3.put(r11, r0)     // Catch:{ all -> 0x0123 }
            goto L_0x00b5
        L_0x006d:
            java.lang.Object r0 = r3.get(r11)     // Catch:{ all -> 0x0123 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x00b5
            r0.add(r5)     // Catch:{ all -> 0x0123 }
            goto L_0x00b5
        L_0x0079:
            java.util.Map r3 = r10.A02     // Catch:{ all -> 0x0123 }
            boolean r0 = r3.containsKey(r11)     // Catch:{ all -> 0x0123 }
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "SecondChannelMerlinManager"
            java.lang.String r0 = "Signal detected with no ENTER_VISIBILITY signal!"
            X.0KC.A0C(r1, r0)     // Catch:{ all -> 0x0123 }
        L_0x0088:
            java.lang.Object r0 = r3.get(r11)     // Catch:{ all -> 0x0123 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x00b0
            goto L_0x00ad
        L_0x0091:
            java.util.Map r3 = r10.A02     // Catch:{ all -> 0x0123 }
            boolean r0 = r3.containsKey(r11)     // Catch:{ all -> 0x0123 }
            if (r0 != 0) goto L_0x00a5
            X.Cv9[] r0 = new X.C45367Cv9[]{r5}     // Catch:{ all -> 0x0123 }
            java.util.ArrayList r0 = X.0sr.A1M(r0)     // Catch:{ all -> 0x0123 }
            r3.put(r11, r0)     // Catch:{ all -> 0x0123 }
            goto L_0x00b5
        L_0x00a5:
            java.lang.Object r0 = r3.get(r11)     // Catch:{ all -> 0x0123 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x00b0
        L_0x00ad:
            r0.add(r5)     // Catch:{ all -> 0x0123 }
        L_0x00b0:
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            r8 = 1
        L_0x00b5:
            java.util.Map r0 = r10.A01     // Catch:{ Exception -> 0x00d6 }
            java.util.Collection r0 = r0.values()     // Catch:{ Exception -> 0x00d6 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x00d6 }
        L_0x00bf:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x00d6 }
            if (r0 == 0) goto L_0x00e0
            r4.next()     // Catch:{ Exception -> 0x00d6 }
            if (r12 != 0) goto L_0x00bf
            java.lang.String r1 = "MerlinSecondChannel"
            r0 = 1316(0x524, float:1.844E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ Exception -> 0x00d6 }
            X.0KC.A0C(r1, r0)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00bf
        L_0x00d6:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "SecondChannelMerlinManager"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x0123 }
        L_0x00e0:
            if (r8 == 0) goto L_0x0121
            java.lang.Object r0 = r3.get(r11)     // Catch:{ all -> 0x0123 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x00f6
            java.util.List r15 = X.00k.A0a(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r13 = r2.A07     // Catch:{ all -> 0x0123 }
            r9 = 0
            java.lang.String r14 = r2.A05     // Catch:{ all -> 0x0123 }
            A00(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0123 }
        L_0x00f6:
            r3.remove(r11)     // Catch:{ all -> 0x0123 }
            goto L_0x0121
        L_0x00fa:
            java.lang.String r2 = "SecondChannelMerlinManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0123 }
            r1.<init>()     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "Invalid percentage from raw signal: "
            r1.append(r0)     // Catch:{ all -> 0x0123 }
            if (r3 == 0) goto L_0x010d
            java.lang.String r0 = X.C55211He1.A00(r3)     // Catch:{ all -> 0x0123 }
            goto L_0x010f
        L_0x010d:
            java.lang.String r0 = "null"
        L_0x010f:
            r1.append(r0)     // Catch:{ all -> 0x0123 }
            r0 = 32
            r1.append(r0)     // Catch:{ all -> 0x0123 }
            r1.append(r4)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0123 }
            X.0KC.A0C(r2, r0)     // Catch:{ all -> 0x0123 }
        L_0x0121:
            monitor-exit(r10)
            return
        L_0x0123:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2613149c.A01(X.Glq):void");
    }

    public C2613149c(List list, boolean z) {
        this.A03 = z;
        this.A01 = new LinkedHashMap();
        this.A02 = new HashMap();
        this.A00 = new HashMap();
        for (Object next : list) {
            0qQ.A0B(next, 0);
            Map map = this.A01;
            Class<?> cls = next.getClass();
            if (!map.containsKey(new 0Yh(cls))) {
                map.put(new 0Yh(cls), next);
            }
        }
    }

    public C2613149c() {
        this(0sn.A00, false);
    }
}
