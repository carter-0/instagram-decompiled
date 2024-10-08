package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2rm  reason: invalid class name and case insensitive filesystem */
public final class C231502rm {
    public final float A00;
    public final 2Sd A01;
    public final UserSession A02;
    public final C231592rv A03;
    public final C231532rp A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final 0rQ A0X;
    public final Map A0Y;
    public final Map A0Z;
    public final Map A0a;

    public final C231592rv A00(1Xj r4, C231542rq r5, String str) {
        C231592rv r0;
        0qQ.A0B(str, 1);
        if (A03(r4, r5, str)) {
            r0 = (C231592rv) this.A0Z.get(r5);
            if (r0 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Row type: ");
                sb.append(r5);
                sb.append(" has no associated litho item type");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            r0 = (C231592rv) this.A0a.get(r5);
            if (r0 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Row type: ");
                sb2.append(r5);
                sb2.append(" has no associated non-litho item type");
                throw new IllegalStateException(sb2.toString());
            }
        }
        return r0;
    }

    public final C231592rv A01(1Xj r2, String str) {
        0qQ.A0B(str, 1);
        if (A03(r2, C231542rq.FULL_HEIGHT_SINGLE_MEDIA, str)) {
            return C231592rv.LITHO_FULL_HEIGHT_SINGLE_MEDIA;
        }
        if (this.A0X.A04() || !A03(r2, C231542rq.HYBRID_FULL_HEIGHT_SINGLE_MEDIA, str)) {
            return C231592rv.FULL_HEIGHT_SINGLE_MEDIA;
        }
        return C231592rv.LITHO_HYBRID_FULL_HEIGHT_SINGLE_MEDIA;
    }

    public final Integer A02(C231542rq r4, String str) {
        Boolean valueOf;
        boolean A022;
        0qQ.A0B(str, 1);
        C231532rp r2 = this.A04;
        if (r4 != C231542rq.MEDIA_CONTENT) {
            if (r2.A04.contains(r4)) {
                valueOf = Boolean.valueOf(C231532rp.A00((C231572rt) r2.A02.get(r4), str));
                A022 = C231532rp.A00((C231572rt) r2.A03.get(r4), str);
            }
            return AnonymousClass05K.A0C;
        }
        valueOf = Boolean.valueOf(C231532rp.A01(r2, str));
        A022 = C231532rp.A02(r2, str);
        Boolean valueOf2 = Boolean.valueOf(A022);
        boolean booleanValue = valueOf.booleanValue();
        boolean booleanValue2 = valueOf2.booleanValue();
        if (booleanValue) {
            if (booleanValue2) {
                return AnonymousClass05K.A00;
            }
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0C;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.2rr] */
    /* JADX WARNING: type inference failed for: r7v3, types: [X.2rr] */
    /* JADX WARNING: type inference failed for: r7v4, types: [X.2rr] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.1Xj r6, X.C231542rq r7, java.lang.String r8) {
        /*
            r5 = this;
            r4 = 0
            r0 = 1
            X.0qQ.A0B(r8, r0)
            r3 = 2
            X.2rp r2 = r5.A04
            X.2rq r0 = X.C231542rq.MEDIA_CONTENT
            if (r7 == r0) goto L_0x002a
            java.util.Set r0 = r2.A04
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L_0x002a
            java.lang.Integer r1 = r5.A02(r7, r8)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2 = 0
            if (r1 != r0) goto L_0x001e
            return r4
        L_0x001e:
            boolean r0 = r6.CcK()
            if (r0 == 0) goto L_0x0028
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0046
        L_0x0028:
            r2 = 1
            return r2
        L_0x002a:
            r0 = 8
            int r1 = r7.ordinal()
            if (r1 == r0) goto L_0x004e
            boolean r0 = r6.CcK()
            if (r1 == r3) goto L_0x0047
            if (r0 != 0) goto L_0x004b
            java.util.Map r0 = r2.A02
        L_0x003c:
            java.lang.Object r0 = r0.get(r7)
            X.2rt r0 = (X.C231572rt) r0
        L_0x0042:
            boolean r2 = X.C231532rp.A00(r0, r8)
        L_0x0046:
            return r2
        L_0x0047:
            if (r0 != 0) goto L_0x004b
            r0 = 0
            goto L_0x0042
        L_0x004b:
            java.util.Map r0 = r2.A03
            goto L_0x003c
        L_0x004e:
            boolean r0 = r6.CeS()
            if (r0 != 0) goto L_0x006e
            boolean r0 = r6.A5Y()
            if (r0 != 0) goto L_0x006e
            boolean r0 = r6.A4r()
            if (r0 == 0) goto L_0x006b
            X.2rr r7 = X.C231552rr.IMAGE_WITH_MUSIC
        L_0x0062:
            boolean r0 = r6.CcK()
            if (r0 == 0) goto L_0x0071
            java.util.Map r0 = r2.A01
            goto L_0x003c
        L_0x006b:
            X.2rr r7 = X.C231552rr.IMAGE
            goto L_0x0062
        L_0x006e:
            X.2rr r7 = X.C231552rr.VIDEO
            goto L_0x0062
        L_0x0071:
            java.util.Map r0 = r2.A00
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231502rm.A03(X.1Xj, X.2rq, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x019a, code lost:
        if (java.lang.Boolean.valueOf(X.182.A06(r4, r3.A02, 36323393122675846L)).booleanValue() != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x01c8, code lost:
        if (java.lang.Boolean.valueOf(X.182.A06(r4, r3.A02, 36323393121365115L)).booleanValue() != false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0236, code lost:
        if (java.lang.Boolean.valueOf(X.182.A06(r4, r3.A02, 36323393121430652L)).booleanValue() != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x032f, code lost:
        if (java.lang.Boolean.valueOf(X.182.A06(r4, r3.A02, 36323393121823871L)).booleanValue() != false) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0371, code lost:
        if (java.lang.Boolean.valueOf(X.182.A06(r4, r3.A02, 36326249274029722L)).booleanValue() != false) goto L_0x0373;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C231502rm(com.instagram.common.session.UserSession r31) {
        /*
            r30 = this;
            r3 = r30
            r3.<init>()
            r2 = r31
            r3.A02 = r2
            X.0rQ r0 = X.C231512rn.A00(r2)
            r3.A0X = r0
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.2ro r1 = new X.2ro
            r1.<init>(r2)
            X.2rp r0 = new X.2rp
            r0.<init>(r1)
            r3.A04 = r0
            r19 = 10
            X.2rq r7 = X.C231542rq.MEDIA_UFI
            X.2rv r1 = X.C231592rv.LITHO_MEDIA_UFI
            X.0eP r18 = new X.0eP
            r0 = r18
            r0.<init>(r7, r1)
            r5 = 0
            X.2rq r6 = X.C231542rq.MEDIA_HEADER
            X.2rv r1 = X.C231592rv.LITHO_MEDIA_HEADER
            X.0eP r17 = new X.0eP
            r0 = r17
            r0.<init>(r6, r1)
            X.2rq r4 = X.C231542rq.AD_CTA
            X.2rv r1 = X.C231592rv.LITHO_AD_CTA
            X.0eP r16 = new X.0eP
            r0 = r16
            r0.<init>(r4, r1)
            X.2rq r1 = X.C231542rq.COALESCED_MEDIA
            X.2rv r0 = X.C231592rv.LITHO_COALESCED_MEDIA
            X.0eP r15 = new X.0eP
            r15.<init>(r1, r0)
            X.2rq r1 = X.C231542rq.COALESCED_HEADER
            X.2rv r0 = X.C231592rv.LITHO_COALESCED_HEADER
            X.0eP r14 = new X.0eP
            r14.<init>(r1, r0)
            X.2rq r1 = X.C231542rq.COALESCED_FOOTER
            X.2rv r0 = X.C231592rv.LITHO_COALESCED_FOOTER
            X.0eP r13 = new X.0eP
            r13.<init>(r1, r0)
            X.2rq r2 = X.C231542rq.FULL_HEIGHT_SINGLE_MEDIA
            X.2rv r0 = X.C231592rv.LITHO_FULL_HEIGHT_SINGLE_MEDIA
            X.0eP r12 = new X.0eP
            r12.<init>(r2, r0)
            X.2rq r1 = X.C231542rq.HYBRID_FULL_HEIGHT_SINGLE_MEDIA
            X.2rv r0 = X.C231592rv.LITHO_HYBRID_FULL_HEIGHT_SINGLE_MEDIA
            X.0eP r11 = new X.0eP
            r11.<init>(r1, r0)
            X.2rq r1 = X.C231542rq.MEDIA_CONTENT
            X.2rv r0 = X.C231592rv.LITHO_MEDIA_CONTENT
            X.0eP r9 = new X.0eP
            r9.<init>(r1, r0)
            X.2rq r10 = X.C231542rq.CAROUSEL_CONTENT
            X.2rv r8 = X.C231592rv.LITHO_CAROUSEL_CONTENT
            X.0eP r0 = new X.0eP
            r0.<init>(r10, r8)
            r27 = r11
            r28 = r9
            r29 = r0
            r23 = r15
            r24 = r14
            r25 = r13
            r26 = r12
            r20 = r18
            r21 = r17
            r22 = r16
            X.0eP[] r0 = new X.0eP[]{r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            java.util.LinkedHashMap r9 = X.0Yt.A06(r0)
            r3.A0Z = r9
            X.2rv r0 = X.C231592rv.MEDIA_UFI
            X.0eP r8 = new X.0eP
            r8.<init>(r7, r0)
            X.2rv r0 = X.C231592rv.MEDIA_HEADER
            X.0eP r7 = new X.0eP
            r7.<init>(r6, r0)
            X.2rv r0 = X.C231592rv.AD_CTA
            X.0eP r6 = new X.0eP
            r6.<init>(r4, r0)
            X.2rv r0 = X.C231592rv.FULL_HEIGHT_SINGLE_MEDIA
            X.0eP r4 = new X.0eP
            r4.<init>(r2, r0)
            X.2rv r0 = X.C231592rv.MEDIA_CONTENT
            X.0eP r2 = new X.0eP
            r2.<init>(r1, r0)
            X.2rv r1 = X.C231592rv.CAROUSEL_CONTENT
            X.0eP r0 = new X.0eP
            r0.<init>(r10, r1)
            r13 = r4
            r14 = r2
            r15 = r0
            r10 = r8
            r11 = r7
            r12 = r6
            X.0eP[] r0 = new X.0eP[]{r10, r11, r12, r13, r14, r15}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            r3.A0a = r0
            java.util.Set r2 = r9.entrySet()
            r0 = r19
            int r0 = X.0Yv.A1E(r2, r0)
            int r1 = X.0se.A0L(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x00ee
            r1 = 16
        L_0x00ee:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x00f7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010f
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r4.put(r0, r1)
            goto L_0x00f7
        L_0x010f:
            r3.A0Y = r4
            r1 = 24
            X.9L2 r0 = new X.9L2
            r0.<init>(r3, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A06 = r0
            r1 = 25
            X.9L2 r0 = new X.9L2
            r0.<init>(r3, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A07 = r0
            r1 = 26
            X.9L2 r0 = new X.9L2
            r0.<init>(r3, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A08 = r0
            r1 = 23
            X.9L2 r0 = new X.9L2
            r0.<init>(r3, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A05 = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            X.0Tu r4 = X.0Tu.A05
            r0 = 36317225550222211(0x81065300261383, double:3.0304979034654046E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0S = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225550746503(0x810653002e1387, double:3.030497903796969E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0W = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225557300150(0x810653009213b6, double:3.030497907941522E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x019c
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36323393122675846(0x810bef001d2c86, double:3.034398301119904E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x019d
        L_0x019c:
            r0 = 1
        L_0x019d:
            r3.A0D = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225554678686(0x810653006a139e, double:3.0304979062836974E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01ca
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36323393121365115(0x810bef00092c7b, double:3.034398300290993E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x01cb
        L_0x01ca:
            r0 = 1
        L_0x01cb:
            r3.A0J = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225551664015(0x810653003c138f, double:3.030497904377207E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0G = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225552188308(0x81065300441394, double:3.030497904708772E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0I = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 37161650482446511(0x840653004600af, double:3.564515630830332E-306)
            double r0 = X.182.A00(r4, r2, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r1 = r0.doubleValue()
            float r0 = (float) r1
            r3.A00 = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225551795088(0x810653003e1390, double:3.0304979044600984E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0238
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36323393121430652(0x810bef000a2c7c, double:3.0343983003324386E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x0239
        L_0x0238:
            r0 = 1
        L_0x0239:
            r3.A0R = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225554023320(0x81065300601398, double:3.030497905869241E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x043f
            X.3aS r0 = X.C243983aS.A00
        L_0x0252:
            r3.A01 = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225554219929(0x81065300631399, double:3.0304979059935776E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0F = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225554285466(0x8106530064139a, double:3.0304979060350235E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0P = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225554875296(0x810653006d13a0, double:3.0304979064080343E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0M = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225554940833(0x810653006e13a1, double:3.03049790644948E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0Q = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225554613149(0x8106530069139d, double:3.0304979062422515E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0K = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225557365687(0x810653009313b7, double:3.0304979079829676E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0L = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225555006370(0x810653006f13a2, double:3.030497906490926E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A09 = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225555071907(0x810653007013a3, double:3.030497906532372E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0H = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 2342160234768831396(0x20810653007113a4, double:4.063233386343487E-152)
            X.182.A06(r4, r2, r0)
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225555989424(0x810653007e13b0, double:3.0304979071126134E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0331
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36323393121823871(0x810bef00102c7f, double:3.034398300581112E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x0332
        L_0x0331:
            r0 = 1
        L_0x0332:
            r3.A0N = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225555792813(0x810653007b13ad, double:3.030497906988276E-306)
            X.182.A06(r4, r2, r0)
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225556317106(0x810653008313b2, double:3.030497907319841E-306)
            X.182.A06(r4, r2, r0)
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225555202981(0x810653007213a5, double:3.0304979066152636E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0373
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36326249274029722(0x810e880000369a, double:3.036204542736894E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x0374
        L_0x0373:
            r0 = 1
        L_0x0374:
            r3.A0T = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36326150489847356(0x810e710001363c, double:3.0361420712221936E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x043b
            X.2rv r0 = X.C231592rv.LITHO_MEDIA_BLOKS_BANNER
        L_0x038d:
            r3.A03 = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36326339468342995(0x810e9d000036d3, double:3.036261581983791E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0U = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225555858350(0x810653007c13ae, double:3.0304979070297216E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x03ce
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36323393121692797(0x810bef000e2c7d, double:3.03439830049822E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03cf
        L_0x03ce:
            r5 = 1
        L_0x03cf:
            r3.A0C = r5
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225555923887(0x810653007d13af, double:3.0304979070711675E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0O = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225556710323(0x810653008913b3, double:3.030497907568513E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0E = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36317225556841396(0x810653008b13b4, double:3.030497907651404E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0B = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36323393122348164(0x810bef00182c84, double:3.034398300912677E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0V = r0
            com.instagram.common.session.UserSession r2 = r3.A02
            r0 = 36323393122610309(0x810bef001c2c85, double:3.0343983010784584E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r3.A0A = r0
            return
        L_0x043b:
            X.2rv r0 = X.C231592rv.MEDIA_BLOKS_BANNER
            goto L_0x038d
        L_0x043f:
            r0 = 0
            goto L_0x0252
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231502rm.<init>(com.instagram.common.session.UserSession):void");
    }
}
