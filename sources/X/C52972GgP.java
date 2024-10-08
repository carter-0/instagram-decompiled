package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService;
import java.util.Collection;
import java.util.List;

/* renamed from: X.GgP  reason: case insensitive filesystem */
public final class C52972GgP extends C361478gI {
    public C54626HLj A00;
    public HQ2 A01;
    public HQ3 A02;
    public C56146HtY A03;
    public JMS A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final Application A09;
    public final FoaUserSession A0A;
    public final C56515Hzm A0B;
    public final I44 A0C;
    public final I25 A0D;
    public final ImagineGenerationImageRepository A0E;
    public final C56007HrE A0F;
    public final C56150Htc A0G;
    public final 01W A0H;
    public final 05G A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final AnonymousClass0Ud A0N;
    public final AnonymousClass0Ud A0O;
    public final AnonymousClass0Ud A0P;
    public final AnonymousClass0Ud A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final ImagineNetworkService A0T;
    public final MetaAIFeedbackNetworkService A0U;
    public final Integer A0V;
    public final List A0W;
    public final AnonymousClass0r6 A0X;
    public final 05G A0Y;
    public final String[] A0Z;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0071, code lost:
        if (X.182.A06(X.0Tu.A05, X.C56316HwT.A00(r6.A0A), 36325836958610712L) == false) goto L_0x0073;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52972GgP(android.app.Application r30, com.meta.foa.session.FoaUserSession r31, X.I44 r32, X.I25 r33, X.C56150Htc r34, X.AnonymousClass0r6 r35) {
        /*
            r29 = this;
            r5 = 1
            r7 = r30
            X.0qQ.A0B(r7, r5)
            r4 = r31
            r3 = r32
            r2 = r33
            r1 = r34
            r0 = r35
            X.C51974G9v.A1S(r4, r1, r3, r2, r0)
            r6 = r29
            r6.<init>(r7)
            r6.A09 = r7
            r6.A0A = r4
            r6.A0G = r1
            r6.A0C = r3
            r6.A0D = r2
            r6.A0X = r0
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2130903061(0x7f030015, float:1.741293E38)
            java.lang.String[] r8 = r1.getStringArray(r0)
            X.0qQ.A07(r8)
            r6.A0Z = r8
            int r7 = r8.length
            java.util.ArrayList r4 = X.DbS.A0v(r7)
            r25 = 0
            r3 = 0
        L_0x003c:
            if (r3 >= r7) goto L_0x0055
            r2 = r8[r3]
            java.lang.String r1 = "^("
            java.lang.String r0 = "\\b).*$"
            java.lang.String r2 = X.002.A0g(r1, r2, r0)
            X.Nmz r1 = X.C69517Nmz.IGNORE_CASE
            X.11S r0 = new X.11S
            r0.<init>(r2, r1)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x003c
        L_0x0055:
            r6.A0W = r4
            X.Htc r0 = r6.A0G
            X.HMY r14 = r0.A01
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0073
            com.meta.foa.session.FoaUserSession r0 = r6.A0A
            com.instagram.common.session.UserSession r3 = X.C56316HwT.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325836958610712(0x810e2800163518, double:3.035943792805651E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L_0x0074
        L_0x0073:
            r4 = 0
        L_0x0074:
            r6.A0R = r4
            r3 = 0
            X.Htc r7 = r6.A0G
            boolean r8 = r7.A0L
            r6.A0S = r8
            int r0 = r7.A00
            r6.A08 = r0
            java.lang.Integer r0 = r7.A08
            r6.A0V = r0
            android.app.Application r2 = r6.A09
            com.meta.foa.session.FoaUserSession r1 = r6.A0A
            X.Nky r0 = r7.A02
            com.meta.metaai.imagine.service.ImagineNetworkService r15 = new com.meta.metaai.imagine.service.ImagineNetworkService
            r15.<init>(r2, r1, r0)
            r6.A0T = r15
            android.app.Application r1 = r6.A09
            com.meta.foa.session.FoaUserSession r0 = r6.A0A
            com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService r7 = new com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService
            r7.<init>(r1, r0)
            r6.A0U = r7
            android.app.Application r12 = r6.A09
            X.6oS r19 = X.C318116oQ.A00(r6)
            X.Htc r0 = r6.A0G
            java.lang.Integer r10 = r0.A07
            X.I25 r13 = r6.A0D
            boolean r9 = r0.A0O
            boolean r2 = r0.A0P
            X.7K7 r1 = r0.A04
            if (r1 == 0) goto L_0x01bc
            java.lang.String r1 = r1.A01
        L_0x00b3:
            boolean r0 = r0.A0J
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r11 = new com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository
            r20 = r9
            r21 = r2
            r22 = r4
            r23 = r8
            r24 = r0
            r16 = r7
            r17 = r10
            r18 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6.A0E = r11
            android.app.Application r1 = r6.A09
            X.6oS r21 = X.C318116oQ.A00(r6)
            X.I25 r0 = r6.A0D
            X.HrE r7 = new X.HrE
            r16 = r7
            r17 = r1
            r18 = r0
            r19 = r14
            r20 = r15
            r16.<init>(r17, r18, r19, r20, r21)
            r6.A0F = r7
            X.02z r0 = X.106.A01(r3)
            r6.A0L = r0
            X.Htc r0 = r6.A0G
            X.7K7 r0 = r0.A04
            if (r0 == 0) goto L_0x01b9
            boolean r0 = r0.A04
        L_0x00f3:
            X.I1q r22 = new X.I1q
            r23 = r3
            r24 = r3
            r26 = r25
            r27 = r25
            r28 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28)
            X.02z r0 = X.DbS.A10(r22)
            r6.A0K = r0
            r6.A0Q = r0
            X.01W r0 = new X.01W
            r0.<init>()
            r6.A0H = r0
            X.HIL r10 = X.HIL.A00
            X.02z r0 = X.106.A01(r10)
            r6.A0J = r0
            r6.A0P = r0
            X.HIB r9 = X.HIB.A00
            X.02z r0 = X.106.A01(r9)
            r6.A0Y = r0
            r6.A0O = r0
            X.I1I r0 = X.I1I.A00
            X.02z r0 = X.106.A01(r0)
            r6.A0I = r0
            r6.A0N = r0
            X.02z r2 = X.C51970G9q.A10(r25)
            r6.A0M = r2
            com.meta.foa.session.FoaUserSession r8 = r6.A0A
            X.Htc r1 = r6.A0G
            X.Hzm r0 = new X.Hzm
            r0.<init>(r8, r1)
            r6.A0B = r0
            r6.A06 = r5
            java.lang.String r0 = "suggested"
            r6.A05 = r0
            X.HLj r0 = X.C54626HLj.PRE_GEN
            r6.A00 = r0
            X.Icy r0 = X.C57571Icy.A00
            r6.A04 = r0
            r6.A01 = r9
            r6.A02 = r10
            X.6oS r5 = X.C318116oQ.A00(r6)
            r1 = 37
            X.ImS r0 = new X.ImS
            r0.<init>((java.lang.Object) r6, (X.AnonymousClass4D7) r3, (int) r1)
            X.19B r8 = X.19B.A00
            X.6oS r5 = X.C51967G9n.A0M(r6, r8, r0, r5)
            r1 = 38
            X.ImS r0 = new X.ImS
            r0.<init>((java.lang.Object) r6, (X.AnonymousClass4D7) r3, (int) r1)
            X.1Eo.A05(r8, r0, r5)
            X.Htc r0 = r6.A0G
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x018c
            X.6oS r5 = X.C318116oQ.A00(r6)
            r1 = 39
            X.ImS r0 = new X.ImS
            r0.<init>((java.lang.Object) r6, (X.AnonymousClass4D7) r3, (int) r1)
            X.1Eo.A05(r8, r0, r5)
            X.0Ud r1 = r7.A07
            r0 = 40
            X.JFy r0 = X.C59346JFy.A00(r6, r0)
            r6.A07(r0, r1)
        L_0x018c:
            X.0Ud r1 = r11.A0F
            r0 = 41
            X.JFy r0 = X.C59346JFy.A00(r6, r0)
            r6.A07(r0, r1)
            X.0Ud r1 = r11.A0E
            r0 = 42
            X.JFy r0 = X.C59346JFy.A00(r6, r0)
            r6.A07(r0, r1)
            if (r4 == 0) goto L_0x01ad
            r0 = 43
            X.JFy r0 = X.C59346JFy.A00(r6, r0)
            r6.A07(r0, r2)
        L_0x01ad:
            X.0r6 r1 = r6.A0X
            r0 = 44
            X.JFy r0 = X.C59346JFy.A00(r6, r0)
            r6.A07(r0, r1)
            return
        L_0x01b9:
            r0 = 1
            goto L_0x00f3
        L_0x01bc:
            r1 = r3
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52972GgP.<init>(android.app.Application, com.meta.foa.session.FoaUserSession, X.I44, X.I25, X.Htc, X.0r6):void");
    }

    public static String A01(String str) {
        char upperCase = Character.toUpperCase(str.charAt(0));
        String substring = str.substring(1);
        0qQ.A07(substring);
        return 002.A0D(substring, upperCase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r14.A01 != X.AnonymousClass05K.A0N) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C52972GgP r13, X.C56146HtY r14, X.C56565I1t r15, boolean r16, boolean r17) {
        /*
            r12 = r13
            X.Htc r0 = r13.A0G
            boolean r0 = r0.A0N
            r9 = 1
            r11 = r14
            if (r0 == 0) goto L_0x0027
            if (r17 != 0) goto L_0x0027
            X.I44 r2 = r13.A0C
            java.lang.String r4 = r13.A05
            boolean r0 = r13.A0R
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r1 = r14.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r7 = 1
            if (r1 == r0) goto L_0x001b
        L_0x001a:
            r7 = 0
        L_0x001b:
            r5 = 0
            boolean r8 = r14.A0D
            r6 = 0
            X.0qQ.A0B(r4, r6)
            java.lang.String r3 = "imagine_media_tap"
            X.I44.A00(r2, r3, r4, r5, r6, r7, r8)
        L_0x0027:
            X.I44 r4 = r13.A0C
            java.lang.String r6 = r13.A05
            boolean r0 = r13.A0R
            if (r0 == 0) goto L_0x0058
            java.lang.Integer r1 = r14.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0058
        L_0x0035:
            r10 = 0
            X.0qQ.A0B(r6, r10)
            java.lang.String r5 = "media_creation_finish"
            r7 = 0
            r8 = r16
            X.I44.A00(r4, r5, r6, r7, r8, r9, r10)
            X.HLj r0 = X.C54626HLj.DONE
            r13.A00 = r0
            X.6oS r1 = X.C318116oQ.A00(r13)
            X.4CZ r0 = X.AnonymousClass12W.A01
            r14 = 6
            X.MGG r9 = new X.MGG
            r10 = r15
            r13 = r7
            r15 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.1Eo.A05(r0, r9, r1)
            return
        L_0x0058:
            r9 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52972GgP.A04(X.GgP, X.HtY, X.I1t, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f7, code lost:
        if (r15 != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010a, code lost:
        if (r0.A01 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0112, code lost:
        if (r9.A01 == null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0140, code lost:
        if (r1 != false) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C52972GgP r24, X.C57570Icx r25, X.C56565I1t r26, java.lang.String r27, java.lang.String r28) {
        /*
            r4 = 1
            r8 = r24
            r8.A06 = r4
            java.lang.String r7 = X.DbV.A12(r27)
            boolean r6 = r8.A0R
            r9 = r26
            if (r6 == 0) goto L_0x0029
            X.05G r0 = r8.A0M
            boolean r0 = X.DbX.A1b(r0)
            if (r0 == 0) goto L_0x0029
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r0 = r8.A0E
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0029
            r2 = 0
            X.HII r1 = new X.HII
            r0 = r28
            r1.<init>(r9, r7, r0, r2)
            A03(r8, r1)
        L_0x0028:
            return
        L_0x0029:
            X.I44 r3 = r8.A0C
            java.lang.String r2 = r8.A05
            if (r6 == 0) goto L_0x0152
            boolean r0 = A08(r8, r7)
            if (r0 == 0) goto L_0x0152
        L_0x0035:
            r11 = 0
            X.0qQ.A0B(r2, r11)
            java.lang.String r1 = "model_request_sent"
            r0 = 0
            X.I44.A01(r3, r1, r2, r4)
            int r1 = r7.length()
            if (r1 == 0) goto L_0x0028
            boolean r1 = X.00l.A0W(r7)
            if (r1 != 0) goto L_0x0028
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r5 = r8.A0E
            X.I87 r1 = r5.A04
            android.util.LruCache r1 = r1.A00
            r1.evictAll()
            X.HrE r3 = r8.A0F
            X.0Ud r1 = r3.A07
            java.lang.Object r1 = r1.getValue()
            X.Hss r1 = (X.C56105Hss) r1
            if (r1 == 0) goto L_0x014f
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.HtY r1 = r1.A02
            X.I1k r4 = new X.I1k
            r4.<init>(r0, r1, r2, r7)
        L_0x0069:
            r3.A00()
            r14 = r25
            if (r25 == 0) goto L_0x014c
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            java.lang.String r13 = r14.A04
            java.lang.String r10 = r14.A05
            java.lang.String r3 = r14.A07
            java.lang.String r2 = r14.A06
            X.Htc r1 = r8.A0G
            X.HMY r15 = r1.A01
            X.HMY r1 = X.HMY.SQUARE
            if (r15 != r1) goto L_0x0148
            X.0eP r26 = com.meta.metaai.imagine.service.ImagineNetworkService.A08
        L_0x0084:
            X.KhO r14 = r14.A01
            X.KhO r1 = X.C62532KhO.MEMU
            if (r14 != r1) goto L_0x0144
            java.lang.Integer r16 = X.AnonymousClass05K.A0N
        L_0x008c:
            java.lang.String r18 = ""
            X.HtY r1 = new X.HtY
            r20 = r0
            r21 = r0
            r24 = r0
            r25 = r0
            r27 = r11
            r19 = r10
            r22 = r3
            r23 = r2
            r15 = r12
            r17 = r13
            r13 = r1
            r14 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.I1k r2 = new X.I1k
            r2.<init>(r0, r1, r12, r7)
        L_0x00ad:
            X.I1k[] r1 = new X.C56556I1k[]{r2, r4}
            java.util.List r10 = X.C51967G9n.A0s(r1)
            int r3 = r8.A08
            int r1 = r10.size()
            int r14 = r3 - r1
            X.HtB r12 = new X.HtB
            r12.<init>(r7, r10, r3, r11)
            X.Htc r3 = r8.A0G
            boolean r10 = r3.A0Q
            X.HI9 r1 = new X.HI9
            r15 = r1
            r16 = r12
            r17 = r9
            r18 = r28
            r19 = r10
            r20 = r11
            r15.<init>(r16, r17, r18, r19, r20)
            A02(r8, r1, r11)
            java.lang.String r11 = r8.A05
            java.lang.String r1 = "suggested"
            boolean r15 = X.0qQ.A0K(r11, r1)
            X.0Ud r1 = r5.A0E
            java.lang.Object r1 = r1.getValue()
            X.HtB r1 = (X.C56123HtB) r1
            if (r1 == 0) goto L_0x00ed
            java.lang.String r0 = r1.A01
        L_0x00ed:
            boolean r0 = r7.equals(r0)
            if (r10 == 0) goto L_0x00f9
            if (r0 == 0) goto L_0x00f9
            r20 = 1
            if (r15 == 0) goto L_0x00fb
        L_0x00f9:
            r20 = 0
        L_0x00fb:
            X.Nky r1 = r3.A02
            X.Nky r0 = X.C69416Nky.A0S
            boolean r11 = X.AnonymousClass7TF.A1W(r1, r0)
            X.7K7 r0 = r3.A04
            if (r0 == 0) goto L_0x010c
            java.lang.String r0 = r0.A01
            r10 = 1
            if (r0 != 0) goto L_0x010d
        L_0x010c:
            r10 = 0
        L_0x010d:
            if (r9 == 0) goto L_0x0114
            java.lang.String r0 = r9.A01
            r1 = 1
            if (r0 != 0) goto L_0x0115
        L_0x0114:
            r1 = 0
        L_0x0115:
            if (r11 == 0) goto L_0x0142
            if (r10 == 0) goto L_0x013f
            boolean r0 = r8.A07
        L_0x011b:
            if (r2 != 0) goto L_0x011e
            r2 = r4
        L_0x011e:
            if (r14 <= 0) goto L_0x013a
            boolean r4 = r3.A0J
            boolean r3 = r8.A0S
            r1 = 14
            X.J6n r13 = X.C59105J6n.A02(r8, r1)
            r10 = r2
            r11 = r7
            r12 = r28
            r16 = r6
            r17 = r3
            r18 = r0
            r19 = r4
            r9 = r5
            r9.A03(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x013a:
            X.HLj r0 = X.C54626HLj.POST_GEN
            r8.A00 = r0
            return
        L_0x013f:
            r0 = 1
            if (r1 == 0) goto L_0x011b
        L_0x0142:
            r0 = 0
            goto L_0x011b
        L_0x0144:
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            goto L_0x008c
        L_0x0148:
            X.0eP r26 = com.meta.metaai.imagine.service.ImagineNetworkService.A07
            goto L_0x0084
        L_0x014c:
            r2 = r0
            goto L_0x00ad
        L_0x014f:
            r4 = r0
            goto L_0x0069
        L_0x0152:
            r4 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52972GgP.A05(X.GgP, X.Icx, X.I1t, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r1.A03 == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06(java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            r5 = 0
            r4 = r11
            if (r11 == 0) goto L_0x0038
            java.lang.String r1 = X.DbV.A12(r11)
        L_0x0008:
            if (r12 == 0) goto L_0x0036
            java.lang.String r0 = X.DbV.A12(r12)
        L_0x000e:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0015
            r5 = r12
        L_0x0015:
            X.05G r2 = r10.A0K
            X.Htc r0 = r10.A0G
            X.7K7 r1 = r0.A04
            if (r1 == 0) goto L_0x0022
            boolean r0 = r1.A03
            r6 = 1
            if (r0 != 0) goto L_0x0031
        L_0x0022:
            r6 = 0
            if (r1 != 0) goto L_0x0031
            r8 = 0
            r9 = 1
        L_0x0027:
            X.I1q r3 = new X.I1q
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.FIA(r3)
            return
        L_0x0031:
            boolean r8 = r1.A02
            boolean r9 = r1.A04
            goto L_0x0027
        L_0x0036:
            r0 = r5
            goto L_0x000e
        L_0x0038:
            r1 = r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52972GgP.A06(java.lang.String, java.lang.String, boolean):void");
    }

    private final void A07(0sL r8, AnonymousClass0r6 r9) {
        AnonymousClass0r6 r2 = r9;
        AnonymousClass7TE.A1Z(new MHK((Object) r2, (Object) r8, (Object) this, (AnonymousClass4D7) null, 38), C318116oQ.A00(this));
    }

    public static final boolean A08(C52972GgP ggP, String str) {
        if (str != null) {
            List<11S> list = ggP.A0W;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (11S A082 : list) {
                    if (A082.A08(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: X.LFv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.LFv] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r0 != null) goto L_0x0077;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C356888Vp A00(X.C52972GgP r30, X.C56146HtY r31, X.C56565I1t r32, java.lang.String r33, java.lang.String r34, boolean r35) {
        /*
            r8 = r33
            r9 = 0
            r0 = r32
            if (r32 == 0) goto L_0x00cf
            java.lang.String r5 = r0.A04
            if (r5 == 0) goto L_0x00cf
            java.lang.String r4 = r0.A02
            if (r4 == 0) goto L_0x00cf
            java.lang.String r3 = r0.A01
            java.lang.Long r1 = r0.A00
            long r15 = X.DbY.A04(r1)
            boolean r2 = r0.A06
            java.lang.String r1 = r0.A03
            X.LG4 r18 = new X.LG4
            r10 = r18
            r11 = r5
            r12 = r4
            r13 = r3
            r14 = r1
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r17)
        L_0x0028:
            r1 = r31
            java.lang.String r2 = r1.A04
            r19 = r2
            if (r33 != 0) goto L_0x0032
            java.lang.String r8 = r1.A0A
        L_0x0032:
            java.lang.String r2 = r1.A0A
            r17 = r2
            java.lang.String r15 = r1.A05
            java.lang.String r14 = r1.A07
            java.lang.String r13 = r1.A08
            java.lang.Integer r11 = r1.A02
            X.0eP r2 = r1.A0C
            int r32 = X.C51970G9q.A0B(r2)
            int r33 = X.C51969G9p.A0A(r2)
            java.lang.Integer r10 = r1.A01
            r2 = r30
            X.Htc r2 = r2.A0G
            java.lang.String r7 = r2.A0A
            java.lang.String r6 = r1.A09
            java.lang.String r5 = r1.A0B
            if (r0 == 0) goto L_0x005a
            java.lang.String r4 = r0.A05
            if (r4 != 0) goto L_0x005c
        L_0x005a:
            java.lang.String r4 = r1.A06
        L_0x005c:
            X.Hst r12 = r1.A00
            r2 = 1
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = r0.A05
            if (r1 == 0) goto L_0x006b
            boolean r1 = X.00l.A0W(r1)
            if (r1 == 0) goto L_0x0077
        L_0x006b:
            if (r12 == 0) goto L_0x00a1
            java.lang.String r1 = r12.A02
            boolean r1 = X.00l.A0W(r1)
            if (r1 != 0) goto L_0x00a1
            if (r0 == 0) goto L_0x00cc
        L_0x0077:
            java.lang.String r1 = r0.A05
            if (r1 == 0) goto L_0x00cc
            boolean r1 = X.C51966G9m.A1X(r1)
            if (r1 != r2) goto L_0x00cc
            java.lang.Integer r3 = X.AnonymousClass05K.A01
        L_0x0083:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r3 != r1) goto L_0x00c7
            if (r0 == 0) goto L_0x00a1
            java.lang.String r2 = r0.A05
        L_0x008b:
            if (r2 == 0) goto L_0x00a1
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r3 != r1) goto L_0x00c5
            if (r12 == 0) goto L_0x00c5
            java.lang.String r0 = r12.A00
        L_0x0095:
            if (r3 != r1) goto L_0x009b
            if (r12 == 0) goto L_0x009b
            java.lang.String r9 = r12.A01
        L_0x009b:
            X.LFv r1 = new X.LFv
            r1.<init>(r3, r2, r0, r9)
            r9 = r1
        L_0x00a1:
            X.8Vp r16 = new X.8Vp
            r31 = r34
            r34 = r35
            r28 = r6
            r29 = r5
            r30 = r4
            r24 = r15
            r25 = r14
            r26 = r13
            r27 = r7
            r20 = r10
            r21 = r19
            r22 = r8
            r23 = r17
            r17 = r9
            r19 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r16
        L_0x00c5:
            r0 = r9
            goto L_0x0095
        L_0x00c7:
            if (r12 == 0) goto L_0x00a1
            java.lang.String r2 = r12.A02
            goto L_0x008b
        L_0x00cc:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x0083
        L_0x00cf:
            r18 = r9
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52972GgP.A00(X.GgP, X.HtY, X.I1t, java.lang.String, java.lang.String, boolean):X.8Vp");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r4 = (X.HI9) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C52972GgP r3, X.HQ2 r4, boolean r5) {
        /*
            X.01W r2 = r3.A0H
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0019
            java.lang.Object r0 = r2.A0O()
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x0019
            r2.removeFirst()
        L_0x0019:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x002b
            if (r5 == 0) goto L_0x002b
            X.JMS r1 = r3.A04
            X.HI8 r0 = new X.HI8
            r0.<init>(r1)
            r2.addFirst(r0)
        L_0x002b:
            r2.addFirst(r4)
            X.05G r1 = r3.A0Y
        L_0x0030:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIY(r0, r4)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r4 instanceof X.HI9
            if (r0 == 0) goto L_0x004c
            X.HI9 r4 = (X.HI9) r4
            X.HtB r0 = r4.A00
            if (r0 == 0) goto L_0x004c
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r4.A02
            r0 = 0
            r3.A06(r2, r1, r0)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52972GgP.A02(X.GgP, X.HQ2, boolean):void");
    }

    public static final void A03(C52972GgP ggP, HQ3 hq3) {
        05G r1 = ggP.A0J;
        do {
        } while (!r1.AIY(r1.getValue(), hq3));
    }

    public final void A0E() {
        String str;
        0eP r18;
        C56565I1t i1t;
        C56150Htc htc = this.A0G;
        if (htc.A0P) {
            ImagineGenerationImageRepository imagineGenerationImageRepository = this.A0E;
            AnonymousClass0eM r7 = imagineGenerationImageRepository.A0B;
            if (((GVF) r7.getValue()).A01 != null) {
                String str2 = null;
                if (AnonymousClass7TF.A1V(((GVF) r7.getValue()).A00)) {
                    A03(this, new HIH((C56146HtY) null, false));
                    ((GVF) r7.getValue()).A00 = null;
                    return;
                }
                C56123HtB htB = (C56123HtB) imagineGenerationImageRepository.A0E.getValue();
                A03(this, HIK.A00);
                if (!imagineGenerationImageRepository.A0H) {
                    i1t = null;
                } else {
                    i1t = ((GVF) r7.getValue()).A02;
                }
                A02(this, new HI9(htB, i1t, (String) null, htc.A0Q, false), true);
                if (htB != null) {
                    str2 = htB.A01;
                }
                A06(str2, (String) null, false);
                GVF gvf = (GVF) r7.getValue();
                gvf.A00 = null;
                gvf.A01 = null;
                gvf.A02 = null;
                return;
            }
        }
        int intValue = this.A0V.intValue();
        if (intValue == 0) {
            A03(this, HIK.A00);
            C58106ImS.A03(this, C318116oQ.A00(this), 40);
            AnonymousClass7K7 r4 = htc.A04;
            if (!(r4 == null || (str = r4.A01) == null)) {
                if (str.length() > 0) {
                    str = A01(str);
                }
                if (!(str == null || str.length() == 0)) {
                    String str3 = r4.A00;
                    A05(this, (C57570Icx) null, (C56565I1t) null, str, str3);
                    A06(str, str3, false);
                    return;
                }
            }
            A02(this, new HI8(C57571Icy.A00), false);
        } else if (intValue == 1 || intValue == 2) {
            C56139HtR htR = htc.A03;
            if (htR != null) {
                String str4 = htR.A01;
                String str5 = htR.A02;
                String str6 = htR.A03;
                boolean z = htR.A04;
                if (str6 == null) {
                    str6 = "";
                }
                Integer num = AnonymousClass05K.A01;
                if (htc.A01 == HMY.SQUARE) {
                    r18 = ImagineNetworkService.A08;
                } else {
                    r18 = ImagineNetworkService.A07;
                }
                A03(this, new HIH(new C56146HtY((C56106Hst) null, num, AnonymousClass05K.A00, str5, str4, str6, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, r18, false), z));
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0276, code lost:
        if (r5.A02.A01 != X.AnonymousClass05K.A0N) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0142, code lost:
        if (r6.A01 != X.AnonymousClass05K.A0N) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bc, code lost:
        if (r13.A0S != false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c6, code lost:
        if (r8 == false) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0226  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.HQ1 r20, boolean r21) {
        /*
            r19 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C54528HHp
            r13 = r19
            if (r0 == 0) goto L_0x0044
            X.HHp r3 = (X.C54528HHp) r3
            X.HsE r6 = r3.A00
            X.I44 r5 = r13.A0C
            r2 = 1
            java.lang.String r1 = "suggestion_tile_tap"
            java.lang.String r0 = "suggested"
            r4 = 0
            r3 = 0
            X.I44.A01(r5, r1, r0, r2)
            java.util.List r0 = r6.A00
            java.lang.Object r0 = X.00k.A0I(r0)
            X.HtM r0 = (X.C56134HtM) r0
            java.lang.String r0 = r0.A03
            java.lang.String r2 = X.AnonymousClass7TF.A0j(r0)
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0030
            java.lang.String r2 = A01(r2)
        L_0x0030:
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r0 = r13.A0E
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x003d
            r13.A06(r2, r4, r3)
            A05(r13, r4, r4, r2, r4)
        L_0x003c:
            return
        L_0x003d:
            X.HII r1 = new X.HII
            r1.<init>(r4, r2, r4, r3)
            goto L_0x0170
        L_0x0044:
            boolean r0 = r3 instanceof X.C54529HHq
            if (r0 == 0) goto L_0x00b2
            X.HHq r3 = (X.C54529HHq) r3
            X.Icx r5 = r3.A00
            X.I44 r8 = r13.A0C
            X.KhO r7 = r5.A01
            X.KhO r3 = X.C62532KhO.MEMU
            r6 = 0
            boolean r2 = X.AnonymousClass7TF.A1W(r7, r3)
            java.lang.String r1 = "suggestion_tile_tap"
            java.lang.String r0 = "suggested"
            r4 = 0
            X.I44.A01(r8, r1, r0, r2)
            r13.A05 = r0
            X.KhO r0 = X.C62532KhO.IMAGINE
            if (r7 != r0) goto L_0x0078
            java.lang.String r1 = r5.A05
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0071
            java.lang.String r1 = A01(r1)
        L_0x0071:
            r13.A06(r1, r4, r6)
            A05(r13, r4, r4, r1, r4)
            return
        L_0x0078:
            if (r7 != r3) goto L_0x003c
            X.I1t r3 = r5.A02
            java.lang.String r0 = r5.A05
            java.lang.String r2 = X.AnonymousClass7TF.A0j(r0)
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x008c
            java.lang.String r2 = A01(r2)
        L_0x008c:
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r0 = r13.A0E
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00ab
            r13.A06(r2, r4, r6)
            java.lang.String r0 = r5.A06
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = r5.A07
            if (r0 == 0) goto L_0x00a9
            X.Htc r0 = r13.A0G
            java.lang.Integer r1 = r0.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00a9
        L_0x00a5:
            A05(r13, r5, r3, r2, r4)
            return
        L_0x00a9:
            r5 = 0
            goto L_0x00a5
        L_0x00ab:
            X.HII r1 = new X.HII
            r1.<init>(r3, r2, r4, r6)
            goto L_0x0170
        L_0x00b2:
            boolean r0 = r3 instanceof X.C54536HHx
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "user_generated"
            r13.A05 = r0
            X.HHx r3 = (X.C54536HHx) r3
            java.lang.CharSequence r0 = r3.A01
            java.lang.String r4 = r0.toString()
            java.lang.String r2 = r3.A02
            X.I1t r1 = r3.A00
            r0 = 0
            A05(r13, r0, r1, r4, r2)
            return
        L_0x00cb:
            boolean r0 = r3 instanceof X.C54530HHr
            if (r0 == 0) goto L_0x00fd
            X.HHr r3 = (X.C54530HHr) r3
            boolean r3 = r3.A00
            X.I44 r2 = r13.A0C
            java.lang.String r1 = "suggestion_tile_impression"
            java.lang.String r0 = "suggested"
            X.I44.A01(r2, r1, r0, r3)
        L_0x00dc:
            X.I25 r3 = r13.A0D
            java.lang.String r1 = "rendered"
            com.facebook.quicklog.QuickPerformanceLogger r2 = r3.A00
            if (r2 == 0) goto L_0x00ea
            r0 = 325715894(0x136a07b6, float:2.9538754E-27)
            r2.markerPoint(r0, r1)
        L_0x00ea:
            r3.A05(r1)
            r1 = 2
            if (r2 == 0) goto L_0x003c
            r0 = 325715839(0x136a077f, float:2.9538648E-27)
            r2.markerEnd(r0, r1)
            r0 = 325715894(0x136a07b6, float:2.9538754E-27)
            r2.markerEnd(r0, r1)
            return
        L_0x00fd:
            boolean r0 = r3 instanceof X.C54526HHn
            if (r0 == 0) goto L_0x0119
            X.HHn r3 = (X.C54526HHn) r3
            java.lang.Integer r1 = r3.A00
            X.I44 r3 = r13.A0C
            java.lang.String r2 = r13.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r0 = "imagine_media_impression"
            X.I44.A01(r3, r0, r2, r1)
            goto L_0x00dc
        L_0x0119:
            boolean r0 = r3 instanceof X.C54522HHj
            if (r0 == 0) goto L_0x0174
            X.HHj r3 = (X.C54522HHj) r3
            X.HtY r6 = r3.A00
            java.lang.String r0 = r6.A04
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 == 0) goto L_0x003c
            java.lang.Integer r1 = r6.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0134
            X.HrE r0 = r13.A0F
            r0.A00()
        L_0x0134:
            X.I44 r7 = r13.A0C
            java.lang.String r3 = r13.A05
            boolean r0 = r13.A0R
            r5 = 0
            if (r0 == 0) goto L_0x0144
            java.lang.Integer r2 = r6.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1 = 1
            if (r2 == r0) goto L_0x0145
        L_0x0144:
            r1 = 0
        L_0x0145:
            X.0qQ.A0B(r3, r5)
            java.lang.String r0 = "imagine_media_tap"
            X.I44.A01(r7, r0, r3, r1)
            X.01W r1 = r7.A03
            java.lang.String r0 = X.C51972G9s.A0n()
            r1.add(r0)
            X.Hzd r4 = r7.A02
            X.Htc r0 = r7.A01
            X.Nky r0 = r0.A02
            X.XSJ r3 = X.XXv.A00(r0)
            X.HOe r2 = X.C54673HOe.EDIT
            X.0qQ.A0B(r3, r5)
            java.lang.String r1 = "open_intent"
            r0 = 0
            X.C56507Hzd.A00(r2, r3, r4, r1, r0)
            X.HIH r1 = new X.HIH
            r1.<init>(r6, r5)
        L_0x0170:
            A03(r13, r1)
            return
        L_0x0174:
            boolean r0 = r3 instanceof X.C54534HHv
            if (r0 == 0) goto L_0x024d
            X.HHv r3 = (X.C54534HHv) r3
            java.lang.CharSequence r9 = r3.A00
            java.lang.String r2 = r3.A01
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.String r4 = X.DbV.A12(r0)
            X.05G r0 = r13.A0K
            java.lang.Object r0 = r0.getValue()
            X.I1q r0 = (X.C56562I1q) r0
            java.lang.String r0 = r0.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.DbV.A12(r0)
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x003c
            X.Htc r7 = r13.A0G
            X.7K7 r0 = r7.A04
            if (r0 == 0) goto L_0x024a
            java.lang.String r0 = r0.A01
        L_0x01a6:
            r6 = 1
            r3 = 0
            if (r0 == 0) goto L_0x023d
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x023d
        L_0x01b0:
            r0 = 0
        L_0x01b1:
            r13.A07 = r0
            boolean r0 = A08(r13, r4)
            if (r0 != 0) goto L_0x01be
            boolean r0 = r13.A0S
            r8 = 0
            if (r0 == 0) goto L_0x01bf
        L_0x01be:
            r8 = 1
        L_0x01bf:
            X.05G r1 = r13.A0M
            boolean r5 = r13.A0R
            if (r5 == 0) goto L_0x01c8
            r0 = 1
            if (r8 != 0) goto L_0x01c9
        L_0x01c8:
            r0 = 0
        L_0x01c9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.FIA(r0)
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r13.A06(r0, r2, r6)
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x01ed
            X.I44 r2 = r13.A0C
            java.lang.String r1 = r13.A05
            if (r5 == 0) goto L_0x023b
            if (r8 == 0) goto L_0x023b
        L_0x01e3:
            X.0qQ.A0B(r1, r3)
            java.lang.String r0 = "begin_typing"
            X.I44.A01(r2, r0, r1, r6)
            r13.A06 = r3
        L_0x01ed:
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x003c
            if (r5 == 0) goto L_0x020f
            if (r8 == 0) goto L_0x0211
            X.HQ2 r0 = r13.A01
            boolean r2 = r0 instanceof X.HIA
            java.lang.String r0 = X.DbV.A12(r4)
            int r1 = r0.length()
            r0 = 7
            if (r1 < r0) goto L_0x020c
            if (r2 != 0) goto L_0x003c
            X.HIA r1 = X.HIA.A00
        L_0x0208:
            A02(r13, r1, r3)
            return
        L_0x020c:
            if (r2 == 0) goto L_0x003c
            goto L_0x0233
        L_0x020f:
            if (r8 != 0) goto L_0x003c
        L_0x0211:
            X.HQ2 r0 = r13.A01
            boolean r2 = r0 instanceof X.HID
            java.lang.String r0 = X.DbV.A12(r4)
            int r1 = r0.length()
            r0 = 7
            if (r1 < r0) goto L_0x0226
            X.05G r0 = r13.A0L
            r0.FIA(r4)
            return
        L_0x0226:
            if (r2 != 0) goto L_0x022e
            int r0 = r4.length()
            if (r0 != 0) goto L_0x003c
        L_0x022e:
            X.HrE r0 = r13.A0F
            r0.A00()
        L_0x0233:
            X.JMS r0 = r13.A04
            X.HI8 r1 = new X.HI8
            r1.<init>(r0)
            goto L_0x0208
        L_0x023b:
            r6 = 0
            goto L_0x01e3
        L_0x023d:
            boolean r0 = r13.A07
            if (r0 != 0) goto L_0x0247
            int r0 = r4.length()
            if (r0 > r6) goto L_0x01b0
        L_0x0247:
            r0 = 1
            goto L_0x01b1
        L_0x024a:
            r0 = 0
            goto L_0x01a6
        L_0x024d:
            boolean r0 = r3 instanceof X.C54537HHy
            r5 = r21
            if (r0 == 0) goto L_0x025f
            X.HHy r3 = (X.C54537HHy) r3
            X.I1t r2 = r3.A01
            X.HtY r1 = r3.A00
            boolean r0 = r3.A02
            A04(r13, r1, r2, r0, r5)
            return
        L_0x025f:
            boolean r0 = r3 instanceof X.C54524HHl
            if (r0 == 0) goto L_0x02b1
            X.HHl r3 = (X.C54524HHl) r3
            X.Hss r5 = r3.A00
            X.I44 r6 = r13.A0C
            java.lang.String r8 = r13.A05
            boolean r0 = r13.A0R
            if (r0 == 0) goto L_0x0278
            X.HtY r0 = r5.A02
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r11 = 1
            if (r1 == r0) goto L_0x0279
        L_0x0278:
            r11 = 0
        L_0x0279:
            X.HrE r0 = r13.A0F
            int r0 = r0.A00
            java.lang.String r9 = java.lang.String.valueOf(r0)
            r4 = 0
            r10 = 0
            X.0qQ.A0B(r8, r10)
            java.lang.String r7 = "imagine_media_tap"
            r12 = r10
            X.I44.A00(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r2 = r13.A05
            X.HtY r0 = r5.A02
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            X.0qQ.A0B(r2, r10)
            java.lang.String r0 = "media_creation_finish"
            X.I44.A01(r6, r0, r2, r1)
            X.6oS r3 = X.C318116oQ.A00(r13)
            X.4CZ r2 = X.AnonymousClass12W.A01
            r1 = 24
            X.ImP r0 = new X.ImP
            r0.<init>(r13, r5, r4, r1)
            X.1Eo.A05(r2, r0, r3)
            return
        L_0x02b1:
            boolean r0 = r3 instanceof X.C54527HHo
            if (r0 == 0) goto L_0x02c0
            X.HHo r3 = (X.C54527HHo) r3
            X.HtY r0 = r3.A00
            X.HIG r1 = new X.HIG
            r1.<init>(r0)
            goto L_0x0170
        L_0x02c0:
            boolean r0 = r3 instanceof X.HI3
            if (r0 == 0) goto L_0x02dc
            X.I44 r0 = r13.A0C
            X.Hzd r4 = r0.A02
            X.Htc r0 = r0.A01
            X.Nky r0 = r0.A02
            X.XSJ r3 = X.XXv.A00(r0)
            X.HOe r2 = X.C54673HOe.CREATE
            X.DbY.A1S(r3, r2)
            java.lang.String r1 = "feedback_menu_click"
            r0 = 0
            X.C56507Hzd.A00(r2, r3, r4, r1, r0)
            return
        L_0x02dc:
            boolean r0 = r3 instanceof X.C54538HHz
            r9 = 1
            if (r0 == 0) goto L_0x03ba
            X.HHz r3 = (X.C54538HHz) r3
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0365
            X.Hzm r2 = r13.A0B
            X.HOC r1 = X.HOC.GENERATED
            java.lang.String r0 = "download_button_click"
            X.C56515Hzm.A00(r1, r2, r0)
        L_0x02f0:
            android.app.Application r9 = r13.A0D()
            java.lang.String r11 = r3.A02
            java.lang.String r1 = r3.A03
            java.lang.Integer r3 = r3.A01
            java.lang.String r0 = "Imagine_"
            java.lang.String r7 = X.002.A0R(r0, r11)
            r5 = 1
            X.AnonymousClass7TF.A1B(r11, r5, r1)
            r6 = 3
            X.AnonymousClass7TF.A1D(r3, r6, r7)
            r0 = 208(0xd0, float:2.91E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.Object r4 = r9.getSystemService(r0)
            r0 = 990(0x3de, float:1.387E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r4, r0)
            android.app.DownloadManager r4 = (android.app.DownloadManager) r4
            r8 = 0
            android.net.Uri r2 = X.DbT.A09(r1)
            java.lang.String r10 = r2.getScheme()
            java.lang.String r0 = "data"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x037b
            java.lang.Long.parseLong(r11)
            r0 = 8
            X.Iwl r4 = new X.Iwl
            r4.<init>(r7, r9, r0)
            android.content.res.Resources r0 = r9.getResources()
            r0.getDisplayMetrics()
            X.1TS r3 = X.C226722hk.A01()
            android.content.res.Resources r2 = X.AnonymousClass7TF.A0A(r9)
            X.2he r1 = X.AnonymousClass6QK.A01(r1)
            r0 = 0
            X.2hl r1 = r3.A02(r2, r8, r1, r0)
            java.lang.String r0 = "ImagineNetworkService"
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A01(r0)
            X.1TY r2 = r3.A01(r1, r0)
            X.Gks r1 = new X.Gks
            r1.<init>(r4)
            X.1Lf r0 = X.1Lf.A01
            r2.A06(r1, r0)
            return
        L_0x0365:
            X.I44 r4 = r13.A0C
            java.lang.String r2 = r13.A05
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0370
            r9 = 0
        L_0x0370:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r0 = "download_button_click"
            X.I44.A01(r4, r0, r2, r9)
            goto L_0x02f0
        L_0x037b:
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "http"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0393
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x003c
        L_0x0393:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r3 != r0) goto L_0x03b7
            java.lang.String r0 = ".mp4"
        L_0x0399:
            android.app.DownloadManager$Request r3 = new android.app.DownloadManager$Request
            r3.<init>(r2)
            android.app.DownloadManager$Request r2 = r3.setTitle(r7)
            java.lang.String r1 = android.os.Environment.DIRECTORY_PICTURES
            java.lang.String r0 = X.002.A0R(r7, r0)
            android.app.DownloadManager$Request r0 = r2.setDestinationInExternalPublicDir(r1, r0)
            android.app.DownloadManager$Request r0 = r0.setAllowedNetworkTypes(r6)
            r0.setNotificationVisibility(r5)
            r4.enqueue(r3)
            return
        L_0x03b7:
            java.lang.String r0 = ".jpg"
            goto L_0x0399
        L_0x03ba:
            boolean r0 = r3 instanceof X.HI6
            if (r0 == 0) goto L_0x03c8
            X.6oS r1 = X.C318116oQ.A00(r13)
            r0 = 40
            X.C58106ImS.A03(r13, r1, r0)
            return
        L_0x03c8:
            boolean r0 = r3 instanceof X.C54535HHw
            if (r0 == 0) goto L_0x0418
            X.HHw r3 = (X.C54535HHw) r3
            java.lang.String r4 = r3.A00
            java.lang.String r15 = r3.A01
            if (r21 == 0) goto L_0x0409
            X.Hzm r0 = r13.A0B
            X.Hzd r5 = r0.A02
            X.Htc r0 = r0.A01
            X.Nky r0 = r0.A02
            X.XSJ r3 = X.XXv.A00(r0)
            X.HOe r2 = X.C54673HOe.EDIT
        L_0x03e2:
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.String r1 = "feedback_submitted"
            java.lang.String r0 = "thumbs_up"
            X.C56507Hzd.A00(r2, r3, r5, r1, r0)
            X.HMN r14 = X.HMN.GOOD_CHIP
            X.6oS r0 = X.C318116oQ.A00(r13)
            r17 = 0
            r18 = 21
            X.MGN r12 = new X.MGN
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.AnonymousClass7TE.A1Z(r12, r0)
            X.05G r1 = r13.A0I
            X.I1K r0 = X.I1K.A00
            r1.Epw(r0)
            return
        L_0x0409:
            X.I44 r0 = r13.A0C
            X.Hzd r5 = r0.A02
            X.Htc r0 = r0.A01
            X.Nky r0 = r0.A02
            X.XSJ r3 = X.XXv.A00(r0)
            X.HOe r2 = X.C54673HOe.CREATE
            goto L_0x03e2
        L_0x0418:
            boolean r0 = r3 instanceof X.C54532HHt
            if (r0 == 0) goto L_0x0456
            X.I44 r4 = r13.A0C
            java.lang.String r6 = r13.A05
            boolean r0 = r13.A0R
            if (r0 == 0) goto L_0x0454
            r0 = r3
            X.HHt r0 = (X.C54532HHt) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0454
        L_0x042b:
            X.HrE r0 = r13.A0F
            int r0 = r0.A00
            java.lang.String r7 = java.lang.String.valueOf(r0)
            r8 = 0
            X.0qQ.A0B(r6, r8)
            java.lang.String r5 = "imagine_media_impression"
            r10 = r8
            X.I44.A00(r4, r5, r6, r7, r8, r9, r10)
            X.I25 r1 = r13.A0D
            X.HHt r3 = (X.C54532HHt) r3
            int r3 = r3.A00
            java.lang.String r0 = "rendered"
            com.facebook.quicklog.QuickPerformanceLogger r2 = r1.A00
            if (r2 == 0) goto L_0x003c
            r1 = 325725822(0x136a2e7e, float:2.9557875E-27)
            r2.markerPoint(r1, r3, r0)
            r0 = 2
            r2.markerEnd(r1, r3, r0)
            return
        L_0x0454:
            r9 = 0
            goto L_0x042b
        L_0x0456:
            boolean r0 = r3 instanceof X.C54531HHs
            if (r0 == 0) goto L_0x046d
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r0 = r13.A0E
            X.HHs r3 = (X.C54531HHs) r3
            java.lang.String r2 = r3.A01
            android.graphics.Bitmap r1 = r3.A00
            X.Dba.A0j(r9, r2, r1)
            X.I87 r0 = r0.A04
            android.util.LruCache r0 = r0.A00
            r0.put(r2, r1)
            return
        L_0x046d:
            boolean r0 = r3 instanceof X.C54533HHu
            if (r0 == 0) goto L_0x047b
            X.HHu r3 = (X.C54533HHu) r3
            X.Hsu r1 = r3.A00
            boolean r0 = r3.A01
            r13.A0G(r1, r0)
            return
        L_0x047b:
            boolean r0 = r3 instanceof X.C54525HHm
            if (r0 == 0) goto L_0x003c
            X.HHm r3 = (X.C54525HHm) r3
            X.HtY r0 = r3.A00
            r13.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52972GgP.A0F(X.HQ1, boolean):void");
    }

    public final void A0G(C56107Hsu hsu, boolean z) {
        C56507Hzd hzd;
        XSJ A002;
        C54673HOe hOe;
        if (z) {
            C56515Hzm hzm = this.A0B;
            hzd = hzm.A02;
            A002 = XXv.A00(hzm.A01.A02);
            hOe = C54673HOe.EDIT;
        } else {
            I44 i44 = this.A0C;
            hzd = i44.A02;
            A002 = XXv.A00(i44.A01.A02);
            hOe = C54673HOe.CREATE;
        }
        0qQ.A0B(A002, 0);
        C56507Hzd.A00(hOe, A002, hzd, "negative_feedback_click", (String) null);
        A03(this, new HIN(hsu));
    }

    public final boolean A0H() {
        I44.A01(this.A0C, "back_button_tap", "suggested", false);
        if (!(this.A01 instanceof HI8)) {
            01W r2 = this.A0H;
            if (!r2.isEmpty()) {
                if (r2.size() == 1 || (this.A01 instanceof HI8)) {
                    A03(this, HIJ.A00);
                    return true;
                }
                r2.removeFirst();
                Object A0P2 = r2.A0P();
                if ((A0P2 instanceof HID) || (A0P2 instanceof HIA) || (A0P2 instanceof HIC)) {
                    A06((String) null, (String) null, false);
                    r2.removeFirst();
                }
                if (DbT.A1b(r2)) {
                    HQ2 hq2 = (HQ2) r2.removeFirst();
                    if (A0P2 instanceof HI8) {
                        this.A0F.A00();
                        A06((String) null, (String) null, false);
                    }
                    if (hq2 instanceof HI8) {
                        this.A07 = false;
                        List list = this.A0E.A0A;
                        if (!AnonymousClass7TE.A1b(list)) {
                            if (!AnonymousClass7TE.A1b(list)) {
                                C58106ImS.A03(this, C318116oQ.A00(this), 40);
                            }
                            hq2 = new HI8(this.A04);
                        }
                    }
                    A02(this, hq2, false);
                }
                return true;
            }
        }
        A03(this, HIJ.A00);
        return false;
    }
}
