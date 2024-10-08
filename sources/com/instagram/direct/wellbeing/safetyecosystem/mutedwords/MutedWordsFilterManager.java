package com.instagram.direct.wellbeing.safetyecosystem.mutedwords;

import X.02m;
import X.0Tu;
import X.0eP;
import X.0nV;
import X.0qQ;
import X.136;
import X.182;
import X.19B;
import X.19E;
import X.1Eo;
import X.1Ng;
import X.1wn;
import X.2Cy;
import X.2FW;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0lh;
import X.AnonymousClass0t1;
import X.AnonymousClass12T;
import X.AnonymousClass16x;
import X.AnonymousClass1Nd;
import X.AnonymousClass1p0;
import X.AnonymousClass4D7;
import X.AnonymousClass7FN;
import X.AnonymousClass92G;
import X.AnonymousClass92H;
import X.AnonymousClass92I;
import X.AnonymousClass92K;
import X.AnonymousClass9KM;
import X.AnonymousClass9VI;
import X.AnonymousClass9VJ;
import X.C254703su;
import X.C262224Cq;
import X.C297185rL;
import X.C370538wd;
import X.C3727092a;
import com.instagram.api.schemas.CreatorSegmentation;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class MutedWordsFilterManager implements AnonymousClass0lh {
    public ContentFilterDictionaryImpl A00;
    public boolean A01;
    public boolean A02;
    public final 1Ng A03;
    public final 1wn A04;
    public final UserSession A05;
    public final 0nV A06;
    public final ContentFilterEngineImpl A07;
    public final AnonymousClass1p0 A08;
    public final AnonymousClass92K A09;
    public final AnonymousClass92H A0A;
    public final AnonymousClass92G A0B;
    public final List A0C;
    public final Set A0D;
    public final Set A0E;
    public final AtomicBoolean A0F;
    public final C262224Cq A0G;
    public final 136 A0H;
    public final 136 A0I;
    public final 136 A0J;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.9Ji] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        r9 = r11.A0J;
        r4.A01 = r11;
        r4.A02 = r1;
        r4.A03 = r7;
        r4.A04 = r6;
        r4.A05 = r9;
        r4.A00 = 1;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (X.136.A00(r4, r9) != r3) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r11, java.util.Set r12, X.AnonymousClass4D7 r13) {
        /*
            r3 = 3
            boolean r0 = X.C376789Ji.A00(r3, r13)
            if (r0 == 0) goto L_0x00bc
            r4 = r13
            X.9Ji r4 = (X.C376789Ji) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bc
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r10 = r4.A06
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 2
            r8 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0040
            if (r0 == r8) goto L_0x002a
            if (r0 != r5) goto L_0x00c3
            X.0eS.A00(r10)
        L_0x0027:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x002a:
            java.lang.Object r9 = r4.A05
            X.136 r9 = (X.136) r9
            java.lang.Object r6 = r4.A04
            java.lang.Object r7 = r4.A03
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r1 = r4.A02
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r11 = r4.A01
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r11 = (com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager) r11
            X.0eS.A00(r10)
            goto L_0x0081
        L_0x0040:
            X.0eS.A00(r10)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r7 = r12.iterator()
        L_0x004c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r6 = r7.next()
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r6 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r6
            X.5ol r9 = r6.A09
            X.5rL r0 = X.C297185rL.$redex_init_class
            int r0 = r9.ordinal()
            if (r0 == r8) goto L_0x008d
            if (r0 != r5) goto L_0x004c
            java.util.Set r0 = r11.A0E
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x004c
            X.136 r9 = r11.A0J
            r4.A01 = r11
            r4.A02 = r1
            r4.A03 = r7
            r4.A04 = r6
            r4.A05 = r9
            r4.A00 = r8
            java.lang.Object r0 = X.136.A00(r4, r9)
            if (r0 != r3) goto L_0x0081
            return r3
        L_0x0081:
            java.util.Set r0 = r11.A0E     // Catch:{ all -> 0x00cb }
            r0.add(r6)     // Catch:{ all -> 0x00cb }
            r9.A05(r2)
            r1.add(r6)
            goto L_0x004c
        L_0x008d:
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r0 = r11.A00
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x004c
            r11.A00 = r6
            r1.add(r6)
            goto L_0x004c
        L_0x009b:
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r0 = r11.A00
            if (r0 == 0) goto L_0x00a4
            java.util.Set r0 = r0.A0B
            r0.size()
        L_0x00a4:
            java.util.Set r0 = r11.A0E
            r0.size()
            r4.A01 = r2
            r4.A02 = r2
            r4.A03 = r2
            r4.A04 = r2
            r4.A05 = r2
            r4.A00 = r5
            java.lang.Object r0 = A01(r11, r1, r4)
            if (r0 != r3) goto L_0x0027
            return r3
        L_0x00bc:
            X.9Ji r4 = new X.9Ji
            r4.<init>(r11, r13, r3)
            goto L_0x0015
        L_0x00c3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00cb:
            r0 = move-exception
            r9.A05(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager.A00(com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager, java.util.Set, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e9, code lost:
        r10 = new X.0eP(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0eP A04(com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r10, java.util.List r11) {
        /*
            r4 = 0
            com.instagram.common.session.UserSession r3 = r10.A05
            X.0Tu r2 = X.0Tu.A06
            r0 = 36314760238074654(0x81041500180b1e, double:3.0289388301362744E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x007d
            r0 = 36314760238271264(0x810415001b0b20, double:3.0289388302606113E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x007d
            java.util.Iterator r7 = r11.iterator()
            r6 = 0
        L_0x0020:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r5 = r7.next()
            X.3su r5 = (X.C254703su) r5
            java.lang.Object r0 = r5.A1T
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r3.A06
            boolean r0 = X.AnonymousClass7F3.A01(r5, r0)
            if (r0 != 0) goto L_0x0020
            X.2FW r1 = r5.A10
            X.2FW r0 = X.2FW.A1g
            if (r1 == r0) goto L_0x0065
            X.2FW r0 = X.2FW.A1T
            if (r1 != r0) goto L_0x0050
            java.lang.Object r0 = r5.A1T
            boolean r0 = r0 instanceof X.AnonymousClass7FN
            if (r0 == 0) goto L_0x0050
            X.7FN r0 = r5.A0Z
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = r0.A0A
            if (r0 != 0) goto L_0x0058
        L_0x0050:
            X.2FW r0 = X.2FW.A1y
            if (r1 != r0) goto L_0x0020
            java.lang.String r0 = r5.A1q
            if (r0 == 0) goto L_0x0020
        L_0x0058:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314760236895002(0x81041500060b1a, double:3.028938829390258E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0020
        L_0x0065:
            int r6 = r6 + 1
            java.lang.String r0 = A02(r5)
            X.9It r1 = r10.A05(r0, r4)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0020
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r1)
            return r2
        L_0x007d:
            r0 = 10
            int r0 = X.0Yv.A1E(r11, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            java.util.Iterator r1 = r11.iterator()
        L_0x008c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r1.next()
            X.3su r0 = (X.C254703su) r0
            java.lang.String r0 = A02(r0)
            r7.add(r0)
            goto L_0x008c
        L_0x00a0:
            int r0 = r11.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x01bc
            java.util.Set r0 = r10.A0D
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311925560116031(0x810181001f033f, double:3.027146168380909E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x00c3
            goto L_0x01bc
        L_0x00c3:
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl r6 = r10.A07
            X.92K r8 = r10.A09
            X.0qQ.A0B(r8, r4)
            r3 = 1
            java.util.Iterator r2 = r7.iterator()
        L_0x00cf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            X.92Z r0 = r6.A00
            boolean r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x00cf
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "banned_unicode"
        L_0x00e9:
            X.0eP r10 = new X.0eP
            r10.<init>(r1, r0)
        L_0x00ee:
            java.lang.Object r0 = r10.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            java.lang.Object r1 = r10.A01
            java.lang.String r1 = (java.lang.String) r1
            X.9It r0 = new X.9It
            r0.<init>((java.lang.String) r1, (int) r3, (boolean) r2)
            goto L_0x01c1
        L_0x0101:
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r0 = r6.A04
            java.util.concurrent.ConcurrentHashMap r0 = r0.A0B
            java.lang.Object r11 = r0.get(r8)
            java.util.Set r11 = (java.util.Set) r11
            r2 = 0
            if (r11 == 0) goto L_0x0152
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r11.iterator()
        L_0x0117:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x012e
            java.lang.Object r2 = r8.next()
            r0 = r2
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r0 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r0
            X.5om r1 = r0.A00
            X.5om r0 = X.C295715om.A08
            if (r1 != r0) goto L_0x0117
            r9.add(r2)
            goto L_0x0117
        L_0x012e:
            java.util.Set r10 = X.00k.A0k(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r11.iterator()
        L_0x013b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0154
            java.lang.Object r2 = r8.next()
            r0 = r2
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r0 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r0
            X.5om r1 = r0.A00
            X.5om r0 = X.C295715om.A08
            if (r1 == r0) goto L_0x013b
            r9.add(r2)
            goto L_0x013b
        L_0x0152:
            r10 = r2
            goto L_0x0158
        L_0x0154:
            java.util.Set r2 = X.00k.A0k(r9)
        L_0x0158:
            r1 = 19
            X.9LI r0 = new X.9LI
            r0.<init>(r7, r1)
            X.0t0 r9 = X.AnonymousClass0eN.A01(r0)
            if (r10 == 0) goto L_0x0190
            java.util.Iterator r8 = r10.iterator()
        L_0x0169:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0190
            java.lang.Object r0 = r8.next()
            java.util.Set r1 = java.util.Collections.singleton(r0)
            X.0qQ.A07(r1)
            java.lang.Object r0 = r9.getValue()
            java.lang.String r0 = (java.lang.String) r0
            X.0eP r10 = com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl.A01(r6, r0, r1, r4)
            java.lang.Object r0 = r10.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0169
            goto L_0x00ee
        L_0x0190:
            java.util.Iterator r1 = r7.iterator()
        L_0x0194:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            X.0eP r10 = com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl.A01(r6, r0, r2, r4)
            java.lang.Object r0 = r10.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0194
            goto L_0x00ee
        L_0x01b0:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = ""
            goto L_0x00e9
        L_0x01b8:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
        L_0x01bc:
            X.9It r0 = new X.9It
            r0.<init>()
        L_0x01c1:
            X.0eP r2 = new X.0eP
            r2.<init>(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager.A04(com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager, java.util.List):X.0eP");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A05, 36311925560116031L) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C376639It A05(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x001f
            java.util.Set r0 = r4.A0D
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0025
            com.instagram.common.session.UserSession r3 = r4.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311925560116031(0x810181001f033f, double:3.027146168380909E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0025
        L_0x001f:
            X.9It r3 = new X.9It
            r3.<init>()
            return r3
        L_0x0025:
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl r1 = r4.A07
            X.92K r0 = r4.A09
            X.0eP r1 = r1.A02(r0, r5, r6)
            java.lang.Object r0 = r1.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            java.lang.Object r1 = r1.A01
            java.lang.String r1 = (java.lang.String) r1
            r0 = 1
            X.9It r3 = new X.9It
            r3.<init>((java.lang.String) r1, (int) r0, (boolean) r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager.A05(java.lang.String, boolean):X.9It");
    }

    public /* synthetic */ MutedWordsFilterManager(UserSession userSession) {
        AnonymousClass92G r1 = new AnonymousClass92G(userSession);
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        AnonymousClass12T r4 = AnonymousClass12T.A00;
        AnonymousClass92H r0 = new AnonymousClass92H(userSession);
        this.A05 = userSession;
        this.A0B = r1;
        this.A03 = A002;
        this.A0A = r0;
        AnonymousClass92K r12 = new AnonymousClass92K(userSession, AnonymousClass92I.A05, this);
        this.A09 = r12;
        AnonymousClass1p0 r02 = AnonymousClass1p0.A00;
        if (r02 != null) {
            this.A07 = r02.A00(r12);
            AnonymousClass1p0 r03 = AnonymousClass1p0.A00;
            if (r03 != null) {
                this.A08 = r03;
                this.A0D = new LinkedHashSet();
                this.A0E = new LinkedHashSet();
                0nV AOJ = r4.AOJ(967036599, 3);
                this.A06 = AOJ;
                this.A0G = 19E.A02(AOJ);
                C3727092a r13 = new C3727092a(this);
                this.A04 = r13;
                this.A0I = new 136();
                this.A0J = new 136();
                this.A0H = new 136();
                this.A0F = new AtomicBoolean(false);
                this.A0C = new ArrayList();
                A002.A01(r13, 2Cy.class);
                if (182.A06(0Tu.A06, userSession, 36311925559788346L)) {
                    A06();
                    return;
                }
                return;
            }
        }
        0qQ.A0F("instance");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r12, java.util.Set r13, X.AnonymousClass4D7 r14) {
        /*
            r3 = 27
            boolean r0 = X.C376709Ja.A00(r3, r14)
            if (r0 == 0) goto L_0x008f
            r4 = r14
            X.9Ja r4 = (X.C376709Ja) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0087
            if (r0 != r3) goto L_0x0098
            java.lang.Object r2 = r4.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r12 = r4.A01
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r12 = (com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager) r12
            X.0eS.A00(r1)
        L_0x002c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r9 = r2.next()
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r9
            X.92G r1 = r12.A0B
            X.5ol r0 = r9.A09
            boolean r1 = r1.A00(r0)
            java.util.Set r0 = r12.A0D
            boolean r0 = r0.contains(r9)
            if (r1 == 0) goto L_0x005f
            if (r0 != 0) goto L_0x002c
            X.92K r1 = r12.A09
            r4.A01 = r12
            r4.A02 = r2
            r4.A00 = r3
            com.instagram.common.session.UserSession r0 = r1.A00
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r0 = X.AnonymousClass92M.A00(r0)
            java.lang.Object r0 = r0.A03(r9, r1, r4)
            if (r0 != r5) goto L_0x002c
            return r5
        L_0x005f:
            if (r0 == 0) goto L_0x002c
            X.92K r8 = r12.A09
            r0 = 0
            X.0qQ.A0B(r8, r0)
            com.instagram.common.session.UserSession r0 = r8.A00
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r7 = X.AnonymousClass92M.A00(r0)
            java.util.Map r1 = r7.A07
            X.92I r0 = r8.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x002c
            r10 = 0
            X.4Cq r1 = r7.A0F
            r11 = 11
            X.JUh r6 = new X.JUh
            r6.<init>(r7, r8, r9, r10, r11)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r6, r1)
            goto L_0x002c
        L_0x0087:
            X.0eS.A00(r1)
            java.util.Iterator r2 = r13.iterator()
            goto L_0x002c
        L_0x008f:
            X.9Ja r4 = new X.9Ja
            r4.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x0095:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0098:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager.A01(com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager, java.util.Set, X.4D7):java.lang.Object");
    }

    public static final String A02(C254703su r3) {
        String str;
        2FW r1 = r3.A10;
        C297185rL r0 = C297185rL.$redex_init_class;
        int ordinal = r1.ordinal();
        if (ordinal != 2) {
            if (ordinal != 22) {
                if (ordinal == 23) {
                    str = r3.A1q;
                }
                return "";
            }
            AnonymousClass7FN r02 = r3.A0Z;
            if (r02 == null) {
                return "";
            }
            str = r02.A0A;
            if (str == null) {
                return "";
            }
            return str;
        }
        Object obj = r3.A1T;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    public static final LinkedHashMap A03(MutedWordsFilterManager mutedWordsFilterManager, List list) {
        AnonymousClass92H r5 = mutedWordsFilterManager.A0A;
        02m.A0p.markerStart(390857972);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C370538wd r6 = (C370538wd) it.next();
            if (r6 != null) {
                List list2 = r6.A07;
                0qQ.A07(list2);
                0eP A042 = A04(mutedWordsFilterManager, list2);
                int intValue = ((Number) A042.A00).intValue();
                linkedHashMap.put(r6, A042.A01);
                i++;
                i2 += r6.A07.size();
                i3 += intValue;
            }
        }
        User user = mutedWordsFilterManager.A0B.A00;
        boolean A0K = 0qQ.A0K(user.A03.CXy(), true);
        boolean A2H = user.A2H();
        UserSession userSession = r5.A00;
        02m r52 = 02m.A0p;
        r52.markerAnnotate(390857972, AnonymousClass92H.A00(AnonymousClass9VI.NUM_OF_THREADS), i);
        r52.markerAnnotate(390857972, AnonymousClass92H.A00(AnonymousClass9VI.NUM_OF_SCANNED_MESSAGES), i3);
        r52.markerAnnotate(390857972, AnonymousClass92H.A00(AnonymousClass9VI.NUM_OF_MESSAGES), i2);
        r52.markerAnnotate(390857972, AnonymousClass92H.A00(AnonymousClass9VI.GLOBAL_DICTIONARIES_ENABLED), A0K);
        r52.markerAnnotate(390857972, AnonymousClass92H.A00(AnonymousClass9VI.CUSTOM_DICTIONARY_ENABLED), A2H);
        r52.markerAnnotate(390857972, AnonymousClass92H.A00(AnonymousClass9VI.THREAD_TYPE), AnonymousClass92H.A00(AnonymousClass9VJ.OPEN));
        AnonymousClass16x AsZ = AnonymousClass0t1.A01.A01(userSession).A03.AsZ();
        if (AsZ != null) {
            Boolean CQk = AsZ.CQk();
            if (CQk != null) {
                r52.markerAnnotate(390857972, AnonymousClass92H.A00(AnonymousClass9VI.IS_CREATOR), CQk.booleanValue());
            }
            CreatorSegmentation Ase = AsZ.Ase();
            if (Ase != null) {
                r52.markerAnnotate(390857972, AnonymousClass92H.A00(AnonymousClass9VI.CREATOR_SEGMENTATION), Ase.toString());
            }
        }
        r52.markerEnd(390857972, 2);
        return linkedHashMap;
    }

    public final void A06() {
        if (!this.A01 && !this.A02) {
            UserSession userSession = this.A05;
            0Tu r3 = 0Tu.A05;
            if (182.A06(r3, userSession, 2342154934771778354L) || 182.A06(0Tu.A06, userSession, 36311925558936371L) || 182.A06(r3, userSession, 36319196937722892L)) {
                C262224Cq r32 = this.A0G;
                AnonymousClass9KM r2 = new AnonymousClass9KM((Object) this, (AnonymousClass4D7) null, 12);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r32);
            }
        }
    }

    public final boolean A07() {
        UserSession userSession = this.A05;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 2342154934771778354L) || 182.A06(r2, userSession, 36311925558936371L)) {
            return true;
        }
        return false;
    }

    public final void onSessionWillEnd() {
        this.A03.A02(this.A04, 2Cy.class);
        C262224Cq r3 = this.A0G;
        AnonymousClass9KM r2 = new AnonymousClass9KM((Object) this, (AnonymousClass4D7) null, 11);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    public final boolean A08() {
        if (!A07()) {
            return false;
        }
        User user = this.A0B.A00;
        if (0qQ.A0K(user.A03.CXy(), true) || user.A2H()) {
            return true;
        }
        return false;
    }

    public final boolean A09() {
        if (!A08() || !this.A01 || !this.A0F.get()) {
            return false;
        }
        return true;
    }
}
