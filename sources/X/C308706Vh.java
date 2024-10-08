package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6Vh  reason: invalid class name and case insensitive filesystem */
public final class C308706Vh implements C230422pb {
    public int A00 = -1;
    public int A01;
    public int A02 = -1;
    public String A03 = "empty";
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final C270424gi A06;
    public final C249763kK A07;
    public final HashSet A08 = new HashSet();
    public final ConcurrentHashMap A09 = new ConcurrentHashMap();
    public final ConcurrentHashMap A0A = new ConcurrentHashMap();
    public final ConcurrentHashMap A0B = new ConcurrentHashMap();

    public final /* bridge */ /* synthetic */ AnonymousClass9JO AUM(Object obj, Object obj2) {
        C255773uh r2 = (C255773uh) obj;
        0qQ.A0B(r2, 0);
        return C254373sN.A01(r2.A0b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e8, code lost:
        if (r12 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        if (r4 != null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
        if (r11 != X.C230472pg.ORGANIC) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C253533qw AUN(X.C230472pg r32, java.lang.Object r33, java.lang.Object r34, float r35, long r36, long r38) {
        /*
            r31 = this;
            r6 = r34
            r4 = r33
            X.3uh r4 = (X.C255773uh) r4
            X.6YY r6 = (X.AnonymousClass6YY) r6
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 1
            X.0qQ.A0B(r6, r0)
            r0 = 2
            r11 = r32
            X.0qQ.A0B(r11, r0)
            r2 = r31
            java.util.HashSet r3 = r2.A08
            java.lang.String r5 = r4.A0j
            boolean r0 = r3.contains(r5)
            r1 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            if (r0 != 0) goto L_0x00a6
            r3.add(r5)
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x0180
            boolean r0 = r4.A1P()
            if (r0 != 0) goto L_0x0180
            java.util.concurrent.ConcurrentHashMap r3 = r2.A09
            r3.put(r5, r7)
            java.util.concurrent.ConcurrentHashMap r8 = r2.A0B
            r8.put(r5, r7)
            int r0 = r2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r5, r0)
            java.lang.String r10 = r4.A0k
            java.lang.String r0 = r2.A03
            boolean r0 = X.0qQ.A0K(r10, r0)
            r9 = 1
            r0 = r0 ^ 1
            r7 = 0
            if (r0 == 0) goto L_0x0077
            r2.A02 = r7
            r2.A03 = r10
            X.4gi r3 = r2.A06
            X.3mM r0 = r6.A00
            com.instagram.model.reels.Reel r0 = r0.A0H
            int r6 = r3.CMG(r0)
            int r0 = r2.A00
            if (r0 == r1) goto L_0x0075
            java.util.concurrent.ConcurrentHashMap r3 = r2.A0A
            int r0 = r6 - r0
            int r0 = r0 - r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r10, r0)
        L_0x0075:
            r2.A00 = r6
        L_0x0077:
            X.1Xj r0 = r4.A0b
            if (r0 == 0) goto L_0x0178
            java.lang.String r6 = r0.getId()
            if (r6 == 0) goto L_0x0178
            com.instagram.common.session.UserSession r0 = r2.A04
            boolean r3 = X.1P7.A01(r0)
            X.4gi r0 = r2.A06
            if (r3 == 0) goto L_0x008e
            X.0qQ.A0B(r0, r9)
        L_0x008e:
            X.3mM r0 = r0.Bkz(r6)
            if (r0 == 0) goto L_0x0178
            boolean r0 = X.C297785sK.A0l(r0)
            if (r0 == 0) goto L_0x0178
            r2.A02 = r9
            r0 = 1
        L_0x009d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.put(r5, r0)
        L_0x00a4:
            r2.A01 = r7
        L_0x00a6:
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0A
            java.lang.String r12 = r4.A0k
            java.lang.Object r0 = r0.get(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0174
            int r23 = r0.intValue()
        L_0x00b6:
            java.util.concurrent.ConcurrentHashMap r0 = r2.A09
            java.lang.Object r0 = r0.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0170
            int r24 = r0.intValue()
        L_0x00c4:
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0B
            java.lang.Object r0 = r0.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x016c
            int r25 = r0.intValue()
        L_0x00d2:
            com.instagram.common.session.UserSession r3 = r2.A04
            boolean r7 = X.1P7.A01(r3)
            X.3mL r6 = r4.A0e
            X.3mL r0 = X.C250963mL.BRAND_SURVEY
            if (r7 == 0) goto L_0x0157
            if (r6 == r0) goto L_0x00ea
            X.2pg r0 = X.C230472pg.SPONSORED
            if (r11 != r0) goto L_0x0152
            java.lang.String r12 = r4.A0U(r3)
            if (r12 != 0) goto L_0x00ee
        L_0x00ea:
            r12 = r5
        L_0x00eb:
            X.0qQ.A07(r12)
        L_0x00ee:
            X.1Xj r4 = r4.A0b
            if (r4 == 0) goto L_0x00f8
            java.lang.String r14 = r4.getId()
            if (r14 != 0) goto L_0x00ff
        L_0x00f8:
            java.lang.String r14 = "n/a"
            r6 = 0
            r19 = 0
            if (r4 == 0) goto L_0x0125
        L_0x00ff:
            X.1Xy r0 = r4.A0C
            java.lang.String r6 = r0.BIl()
            boolean r0 = X.1P7.A01(r3)
            X.4gi r5 = r2.A06
            if (r0 == 0) goto L_0x0111
            r0 = 1
            X.0qQ.A0B(r5, r0)
        L_0x0111:
            X.3mM r0 = r5.Bkz(r14)
            if (r0 == 0) goto L_0x014f
            com.instagram.model.reels.Reel r0 = r0.A0H
            com.instagram.api.schemas.IntentAwareAdsInfo r0 = r0.A0B
            if (r0 == 0) goto L_0x014f
            java.lang.Integer r0 = r0.A02
            if (r0 == 0) goto L_0x014f
            int r19 = r0.intValue()
        L_0x0125:
            X.3kK r0 = r2.A07
            java.lang.String r13 = r0.getSessionId()
            X.4DU r0 = r2.A05
            java.lang.String r15 = r0.getModuleName()
            java.lang.String r16 = X.C254373sN.A06(r6)
            java.lang.String r17 = X.C254373sN.A03(r3, r4)
            int r26 = X.C254373sN.A00(r4)
            X.3qw r10 = new X.3qw
            r18 = r35
            r27 = r36
            r29 = r38
            r20 = r1
            r21 = r1
            r22 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29)
            return r10
        L_0x014f:
            r19 = 0
            goto L_0x0125
        L_0x0152:
            X.2pg r0 = X.C230472pg.ORGANIC
            if (r11 == r0) goto L_0x00eb
            goto L_0x00ea
        L_0x0157:
            if (r6 == r0) goto L_0x0161
            X.2pg r0 = X.C230472pg.SPONSORED
            if (r11 != r0) goto L_0x0166
            java.lang.String r5 = r4.A0U(r3)
        L_0x0161:
            r12 = r5
            X.0qQ.A07(r5)
            goto L_0x00ee
        L_0x0166:
            X.2pg r0 = X.C230472pg.ORGANIC
            if (r11 != r0) goto L_0x0161
            r5 = r12
            goto L_0x0161
        L_0x016c:
            r25 = -1
            goto L_0x00d2
        L_0x0170:
            r24 = -1
            goto L_0x00c4
        L_0x0174:
            r23 = -1
            goto L_0x00b6
        L_0x0178:
            int r0 = r2.A02
            int r0 = r0 + 1
            r2.A02 = r0
            goto L_0x009d
        L_0x0180:
            int r0 = r2.A01
            int r7 = r0 + 1
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308706Vh.AUN(X.2pg, java.lang.Object, java.lang.Object, float, long, long):X.3qw");
    }

    public C308706Vh(UserSession userSession, AnonymousClass4DU r3, C270424gi r4, C249763kK r5) {
        this.A04 = userSession;
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = r5;
    }
}
