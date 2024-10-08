package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2rp  reason: invalid class name and case insensitive filesystem */
public final class C231532rp {
    public final Map A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Set A04 = 0sc.A07(new C231542rq[]{C231542rq.MEDIA_HEADER, C231542rq.AD_CTA, C231542rq.COALESCED_HEADER, C231542rq.COALESCED_FOOTER, C231542rq.MEDIA_UFI, C231542rq.FULL_HEIGHT_SINGLE_MEDIA, C231542rq.HYBRID_FULL_HEIGHT_SINGLE_MEDIA, C231542rq.CAROUSEL_CONTENT, C231542rq.COALESCED_MEDIA});

    public static final boolean A00(C231572rt r1, String str) {
        if (0qQ.A0K(r1, C231582ru.A00)) {
            return true;
        }
        if (0qQ.A0K(r1, C231562rs.A00)) {
            return str.equals("feed_timeline");
        }
        if (r1 instanceof C232592tz) {
            return ((C232592tz) r1).A00.contains(str);
        }
        return false;
    }

    public static final boolean A01(C231532rp r2, String str) {
        Collection<C231572rt> values = r2.A00.values();
        if (values == null || !values.isEmpty()) {
            for (C231572rt A002 : values) {
                if (A00(A002, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A02(C231532rp r2, String str) {
        Collection<C231572rt> values = r2.A01.values();
        if (values == null || !values.isEmpty()) {
            for (C231572rt A002 : values) {
                if (A00(A002, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017d, code lost:
        r0 = X.C231522ro.A00(r14, X.182.A04(r6, r8, r0), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x022a, code lost:
        r0 = X.C231522ro.A00(r14, X.182.A04(r3, r7, r0), r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C231532rp(X.C231522ro r14) {
        /*
            r13 = this;
            r13.<init>()
            X.2rq r4 = X.C231542rq.MEDIA_HEADER
            r3 = 0
            X.2rq r5 = X.C231542rq.AD_CTA
            X.2rq r6 = X.C231542rq.COALESCED_HEADER
            X.2rq r7 = X.C231542rq.COALESCED_FOOTER
            X.2rq r8 = X.C231542rq.MEDIA_UFI
            X.2rq r9 = X.C231542rq.FULL_HEIGHT_SINGLE_MEDIA
            X.2rq r10 = X.C231542rq.HYBRID_FULL_HEIGHT_SINGLE_MEDIA
            X.2rq r11 = X.C231542rq.CAROUSEL_CONTENT
            X.2rq r12 = X.C231542rq.COALESCED_MEDIA
            X.2rq[] r0 = new X.C231542rq[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}
            java.util.Set r0 = X.0sc.A07(r0)
            r13.A04 = r0
            X.2rr[] r10 = X.C231552rr.values()
            int r9 = r10.length
            int r0 = X.0se.A0L(r9)
            r2 = 16
            if (r0 >= r2) goto L_0x002f
            r0 = 16
        L_0x002f:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r0)
            r7 = 0
        L_0x0035:
            if (r7 >= r9) goto L_0x007d
            r6 = r10[r7]
            X.0qQ.A0B(r6, r3)
            int r1 = r6.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x006d
            r0 = 2
            if (r1 == r0) goto L_0x0063
            if (r1 != r3) goto L_0x0077
            com.instagram.common.session.UserSession r5 = r14.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36880175506456875(0x8306530051012b, double:3.386509722605732E-306)
        L_0x0051:
            java.lang.String r1 = X.182.A04(r4, r5, r0)
            java.lang.String r0 = r6.name()
            X.2rt r0 = X.C231522ro.A00(r14, r1, r0)
            r8.put(r6, r0)
            int r7 = r7 + 1
            goto L_0x0035
        L_0x0063:
            com.instagram.common.session.UserSession r5 = r14.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36880175506850095(0x8306530057012f, double:3.386509722854406E-306)
            goto L_0x0051
        L_0x006d:
            com.instagram.common.session.UserSession r5 = r14.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36880175506194728(0x830653004d0128, double:3.386509722439949E-306)
            goto L_0x0051
        L_0x0077:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x007d:
            r13.A00 = r8
            X.2rr[] r9 = X.C231552rr.values()
            int r8 = r9.length
            int r0 = X.0se.A0L(r8)
            if (r0 >= r2) goto L_0x008c
            r0 = 16
        L_0x008c:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r0)
        L_0x0091:
            if (r3 >= r8) goto L_0x00da
            r6 = r9[r3]
            r4 = 0
            X.0qQ.A0B(r6, r4)
            int r1 = r6.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x00ca
            r0 = 2
            if (r1 == r0) goto L_0x00c0
            if (r1 != r4) goto L_0x00d4
            com.instagram.common.session.UserSession r5 = r14.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36880175510323512(0x830653008c0138, double:3.386509725051009E-306)
        L_0x00ae:
            java.lang.String r1 = X.182.A04(r4, r5, r0)
            java.lang.String r0 = r6.name()
            X.2rt r0 = X.C231522ro.A00(r14, r1, r0)
            r7.put(r6, r0)
            int r3 = r3 + 1
            goto L_0x0091
        L_0x00c0:
            com.instagram.common.session.UserSession r5 = r14.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36880175506915632(0x83065300580130, double:3.386509722895852E-306)
            goto L_0x00ae
        L_0x00ca:
            com.instagram.common.session.UserSession r5 = r14.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36886343074513602(0x830bef000502c2, double:3.3904101174796093E-306)
            goto L_0x00ae
        L_0x00d4:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00da:
            r13.A01 = r7
            java.util.Set r1 = r13.A04
            r4 = 10
            int r0 = X.0Yv.A1E(r1, r4)
            int r0 = X.0se.A0L(r0)
            if (r0 >= r2) goto L_0x00ec
            r0 = 16
        L_0x00ec:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.util.Iterator r9 = r1.iterator()
        L_0x00f5:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x019d
            java.lang.Object r3 = r9.next()
            r7 = r3
            X.2rq r7 = (X.C231542rq) r7
            r0 = 0
            X.0qQ.A0B(r7, r0)
            int r0 = r7.ordinal()
            switch(r0) {
                case 0: goto L_0x011c;
                case 1: goto L_0x0112;
                case 2: goto L_0x010d;
                case 3: goto L_0x0126;
                case 4: goto L_0x0130;
                case 5: goto L_0x013a;
                case 6: goto L_0x0157;
                case 7: goto L_0x0161;
                case 8: goto L_0x010d;
                case 9: goto L_0x0186;
                default: goto L_0x010d;
            }
        L_0x010d:
            r0 = 0
        L_0x010e:
            r5.put(r3, r0)
            goto L_0x00f5
        L_0x0112:
            com.instagram.common.session.UserSession r8 = r14.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36880175507177777(0x830653005c0131, double:3.3865097230616333E-306)
            goto L_0x018f
        L_0x011c:
            com.instagram.common.session.UserSession r8 = r14.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36880175506587949(0x8306530053012d, double:3.386509722688624E-306)
            goto L_0x018f
        L_0x0126:
            com.instagram.common.session.UserSession r8 = r14.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36886343075627719(0x830bef001602c7, double:3.3904101181841814E-306)
            goto L_0x018f
        L_0x0130:
            com.instagram.common.session.UserSession r8 = r14.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36880175506653486(0x8306530054012e, double:3.3865097227300696E-306)
            goto L_0x018f
        L_0x013a:
            com.instagram.common.session.UserSession r8 = r14.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36886343074644676(0x830bef000702c4, double:3.390410117562501E-306)
            java.lang.String r0 = X.182.A04(r6, r8, r0)
            java.lang.String r7 = r7.name()
            X.2rt r0 = X.C231522ro.A00(r14, r0, r7)
            if (r0 != 0) goto L_0x010e
            r0 = 36880175506522412(0x8306530052012c, double:3.386509722647178E-306)
            goto L_0x017d
        L_0x0157:
            com.instagram.common.session.UserSession r8 = r14.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36880175507308851(0x830653005e0133, double:3.386509723144525E-306)
            goto L_0x018f
        L_0x0161:
            com.instagram.common.session.UserSession r8 = r14.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36886343074579139(0x830bef000602c3, double:3.390410117521055E-306)
            java.lang.String r0 = X.182.A04(r6, r8, r0)
            java.lang.String r7 = r7.name()
            X.2rt r0 = X.C231522ro.A00(r14, r0, r7)
            if (r0 != 0) goto L_0x010e
            r0 = 36880175507374388(0x830653005f0134, double:3.386509723185971E-306)
        L_0x017d:
            java.lang.String r0 = X.182.A04(r6, r8, r0)
            X.2rt r0 = X.C231522ro.A00(r14, r0, r7)
            goto L_0x010e
        L_0x0186:
            com.instagram.common.session.UserSession r8 = r14.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36886343075562182(0x830bef001502c6, double:3.3904101181427355E-306)
        L_0x018f:
            java.lang.String r1 = X.182.A04(r6, r8, r0)
            java.lang.String r0 = r7.name()
            X.2rt r0 = X.C231522ro.A00(r14, r1, r0)
            goto L_0x010e
        L_0x019d:
            r13.A02 = r5
            java.util.Set r1 = r13.A04
            int r0 = X.0Yv.A1E(r1, r4)
            int r0 = X.0se.A0L(r0)
            if (r0 >= r2) goto L_0x01ad
            r0 = 16
        L_0x01ad:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.util.Iterator r8 = r1.iterator()
        L_0x01b6:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0249
            java.lang.Object r4 = r8.next()
            r6 = r4
            X.2rq r6 = (X.C231542rq) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            int r0 = r6.ordinal()
            switch(r0) {
                case 0: goto L_0x0204;
                case 1: goto L_0x01d3;
                case 2: goto L_0x01f0;
                case 3: goto L_0x01ce;
                case 4: goto L_0x01fa;
                case 5: goto L_0x020e;
                case 6: goto L_0x01ce;
                case 7: goto L_0x01ce;
                case 8: goto L_0x0233;
                default: goto L_0x01ce;
            }
        L_0x01ce:
            r0 = 0
        L_0x01cf:
            r5.put(r4, r0)
            goto L_0x01b6
        L_0x01d3:
            com.instagram.common.session.UserSession r7 = r14.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36886343074448065(0x830bef000402c1, double:3.3904101174381635E-306)
            java.lang.String r0 = X.182.A04(r3, r7, r0)
            java.lang.String r2 = r6.name()
            X.2rt r0 = X.C231522ro.A00(r14, r0, r2)
            if (r0 != 0) goto L_0x01cf
            r0 = 36880175507243314(0x830653005d0132, double:3.386509723103079E-306)
            goto L_0x022a
        L_0x01f0:
            com.instagram.common.session.UserSession r3 = r14.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36886343074185919(0x830bef000002bf, double:3.390410117272381E-306)
            goto L_0x023c
        L_0x01fa:
            com.instagram.common.session.UserSession r3 = r14.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36880175507570998(0x83065300620136, double:3.386509723310308E-306)
            goto L_0x023c
        L_0x0204:
            com.instagram.common.session.UserSession r3 = r14.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36880175507505461(0x83065300610135, double:3.386509723268862E-306)
            goto L_0x023c
        L_0x020e:
            com.instagram.common.session.UserSession r7 = r14.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36886343075431109(0x830bef001302c5, double:3.3904101180598445E-306)
            java.lang.String r0 = X.182.A04(r3, r7, r0)
            java.lang.String r2 = r6.name()
            X.2rt r0 = X.C231522ro.A00(r14, r0, r2)
            if (r0 != 0) goto L_0x01cf
            r0 = 36880175509537079(0x83065300800137, double:3.3865097245536654E-306)
        L_0x022a:
            java.lang.String r0 = X.182.A04(r3, r7, r0)
            X.2rt r0 = X.C231522ro.A00(r14, r0, r2)
            goto L_0x01cf
        L_0x0233:
            com.instagram.common.session.UserSession r3 = r14.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36880175510454585(0x830653008e0139, double:3.3865097251339E-306)
        L_0x023c:
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            java.lang.String r0 = r6.name()
            X.2rt r0 = X.C231522ro.A00(r14, r1, r0)
            goto L_0x01cf
        L_0x0249:
            r13.A03 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231532rp.<init>(X.2ro):void");
    }
}
