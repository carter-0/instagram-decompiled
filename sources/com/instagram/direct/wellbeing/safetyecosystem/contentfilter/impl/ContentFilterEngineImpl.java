package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl;

import X.00k;
import X.03t;
import X.0Tu;
import X.0eP;
import X.0nV;
import X.0qQ;
import X.136;
import X.182;
import X.19B;
import X.19E;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0lh;
import X.AnonymousClass12V;
import X.AnonymousClass4D7;
import X.AnonymousClass92I;
import X.AnonymousClass92L;
import X.AnonymousClass92W;
import X.AnonymousClass92Y;
import X.AnonymousClass92Z;
import X.AnonymousClass9K1;
import X.AnonymousClass9KF;
import X.AnonymousClass9KK;
import X.AnonymousClass9KP;
import X.AnonymousClass9LI;
import X.C262224Cq;
import X.C295715om;
import X.C60340gF;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ContentFilterEngineImpl implements AnonymousClass92W, AnonymousClass0lh {
    public static final Set A0C;
    public static final Set A0D;
    public static final Set A0E;
    public static final Set A0F;
    public AnonymousClass92Z A00;
    public final int A01;
    public final UserSession A02;
    public final AnonymousClass92Y A03;
    public final ContentFilterDictionaryRegistrar A04;
    public final Map A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 20));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 21));
    public final 136 A08;
    public final AnonymousClass12V A09;
    public final 0nV A0A;
    public final C262224Cq A0B;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.9Jg] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (X.136.A00(r6, r2) == r5) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (((X.C376769Jg) r13).A06 != 2) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r11, com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl r12, X.AnonymousClass4D7 r13) {
        /*
            r3 = 2
            boolean r0 = r13 instanceof X.C376769Jg
            if (r0 == 0) goto L_0x000d
            r0 = r13
            X.9Jg r0 = (X.C376769Jg) r0
            int r1 = r0.A06
            r0 = 1
            if (r1 == r3) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x003f
            r6 = r13
            X.9Jg r6 = (X.C376769Jg) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003f
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001e:
            java.lang.Object r1 = r6.A05
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            java.lang.String r10 = "strategy"
            r9 = 1
            r2 = 0
            r8 = 0
            if (r0 == 0) goto L_0x004d
            if (r0 != r9) goto L_0x0045
            java.lang.Object r2 = r6.A04
            X.136 r2 = (X.136) r2
            java.lang.Object r4 = r6.A03
            X.0rm r4 = (X.0rm) r4
            java.lang.Object r11 = r6.A02
            java.lang.Object r12 = r6.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl r12 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl) r12
            X.0eS.A00(r1)
            goto L_0x0089
        L_0x003f:
            X.9Jg r6 = new X.9Jg
            r6.<init>(r12, r13, r3)
            goto L_0x001e
        L_0x0045:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x004d:
            X.0eS.A00(r1)
            X.0rm r4 = new X.0rm
            r4.<init>()
            X.5om r0 = r11.A00
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x0106
            r0 = 3
            if (r1 == r0) goto L_0x00ab
            X.AdE r1 = new X.AdE
            r1.<init>()
        L_0x0065:
            r4.A00 = r1
            X.B2w r1 = (X.C41841B2w) r1
            java.util.Set r0 = r11.A0B
            java.util.Set r0 = com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl.A00(r0)
            java.util.List r0 = X.00k.A0a(r0)
            r1.EpX(r0)
            X.136 r2 = r12.A08
            r6.A01 = r12
            r6.A02 = r11
            r6.A03 = r4
            r6.A04 = r2
            r6.A00 = r9
            java.lang.Object r0 = X.136.A00(r6, r2)
            if (r0 != r5) goto L_0x0089
        L_0x0088:
            return r5
        L_0x0089:
            java.util.Map r1 = r12.A05     // Catch:{ all -> 0x010f }
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x010f }
            if (r0 != 0) goto L_0x0097
            X.0qQ.A0F(r10)     // Catch:{ all -> 0x010f }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x010f }
            throw r0     // Catch:{ all -> 0x010f }
        L_0x0097:
            X.B2w r0 = (X.C41841B2w) r0     // Catch:{ all -> 0x010f }
            r1.put(r11, r0)     // Catch:{ all -> 0x010f }
            r2.A05(r8)
            java.lang.Object r5 = r4.A00
            if (r5 != 0) goto L_0x0088
            X.0qQ.A0F(r10)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ab:
            java.lang.String r1 = r11.A0A
            X.0eM r0 = r12.A07
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00da
            com.instagram.common.session.UserSession r3 = r12.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 37159185168531551(0x840415001d005f, double:3.562956556383489E-306)
            double r0 = X.182.A00(r2, r3, r0)
            float r7 = (float) r0
            r0 = 36596235215440251(0x8204150022097b, double:3.206944739231038E-306)
        L_0x00cf:
            long r0 = X.182.A01(r2, r3, r0)
            int r2 = (int) r0
            X.AdF r1 = new X.AdF
            r1.<init>(r7, r2)
            goto L_0x0065
        L_0x00da:
            X.0eM r0 = r12.A06
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00fd
            com.instagram.common.session.UserSession r3 = r12.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 37159185168138334(0x8404150017005e, double:3.562956556134817E-306)
            double r0 = X.182.A00(r2, r3, r0)
            float r7 = (float) r0
            r0 = 36596235215374714(0x8204150021097a, double:3.206944739189592E-306)
            goto L_0x00cf
        L_0x00fd:
            r0 = 1065353216(0x3f800000, float:1.0)
            X.AdF r1 = new X.AdF
            r1.<init>(r0, r2)
            goto L_0x0065
        L_0x0106:
            java.lang.String r0 = r11.A0A
            X.WVc r1 = new X.WVc
            r1.<init>(r0)
            goto L_0x0065
        L_0x010f:
            r0 = move-exception
            r2.A05(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl.A00(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl, com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl, X.4D7):java.lang.Object");
    }

    public final 0eP A02(AnonymousClass92L r6, String str, boolean z) {
        Set set;
        0qQ.A0B(r6, 0);
        if (r6.And() == AnonymousClass92I.A05 && this.A00.A00(str)) {
            return new 0eP(true, "banned_unicode");
        }
        Set set2 = (Set) this.A04.A0B.get(r6);
        if (set2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : set2) {
                if (((ContentFilterDictionaryImpl) next).A00 != C295715om.A08) {
                    arrayList.add(next);
                }
            }
            set = 00k.A0k(arrayList);
        } else {
            set = null;
        }
        return A01(this, str, set, z);
    }

    public final Object DWN(ContentFilterDictionaryImpl contentFilterDictionaryImpl, List list, List list2, AnonymousClass4D7 r12) {
        return 1Eo.A00(r12, this.A0A, new AnonymousClass9KK(this, contentFilterDictionaryImpl, list, list2, (AnonymousClass4D7) null, 3));
    }

    static {
        String[] strArr = {"1437630789907337", "963543174336669", "924699208319756", "833039450621886", "236826591337859", "167244268788346", "165545552280417"};
        0qQ.A0B(strArr, 0);
        A0C = 03t.A0K(strArr);
        String[] strArr2 = {"339923028011723", "1169998560477470", "1002053244036451", "698788968100868", "562506825074455", "1056956421907175", "692454682076002", "471787574744924"};
        0qQ.A0B(strArr2, 0);
        A0F = 03t.A0K(strArr2);
        String[] strArr3 = {"1095241914368736", "689777082261575", "410898304182133", "683161379620227", "687512819191184", "309520564628050", "368904968607613"};
        0qQ.A0B(strArr3, 0);
        A0D = 03t.A0K(strArr3);
        String[] strArr4 = {"1128833187722909", "830268895086754", "477809040910462", "1732998953765487"};
        0qQ.A0B(strArr4, 0);
        A0E = 03t.A0K(strArr4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x01df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x001b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x001b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0eP A01(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl r23, java.lang.String r24, java.util.Set r25, boolean r26) {
        /*
            java.util.Locale r0 = java.util.Locale.ROOT
            X.0qQ.A08(r0)
            r1 = r24
            java.lang.String r22 = r1.toLowerCase(r0)
            X.0qQ.A07(r22)
            java.util.HashSet r21 = new java.util.HashSet
            r21.<init>()
            java.lang.String r5 = ""
            if (r25 == 0) goto L_0x0312
            java.util.Iterator r20 = r25.iterator()
        L_0x001b:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0312
            java.lang.Object r3 = r20.next()
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r3 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r3
            r4 = r23
            java.util.Map r0 = r4.A05
            java.lang.Object r6 = r0.get(r3)
            X.B2w r6 = (X.C41841B2w) r6
            if (r6 == 0) goto L_0x001b
            java.util.Set r0 = A0F
            java.lang.String r2 = r3.A0A
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0241
            com.instagram.common.session.UserSession r8 = r4.A02
            X.0Tu r7 = X.0Tu.A05
            r0 = 36314760237026075(0x81041500080b1b, double:3.028938829473149E-306)
        L_0x0046:
            boolean r0 = X.182.A06(r7, r8, r0)
        L_0x004a:
            if (r0 == 0) goto L_0x001b
        L_0x004c:
            X.02m r0 = X.02m.A0p
            r14 = 893660699(0x35442e1b, float:7.308278E-7)
            r0.markerStart(r14)
            java.util.Set r0 = A0C
            boolean r19 = r0.contains(r2)
            if (r19 == 0) goto L_0x0185
            boolean r0 = r21.isEmpty()
            if (r0 == 0) goto L_0x0185
            r13 = 0
            r18 = 1
            java.lang.String r17 = " "
            java.lang.String[] r1 = new java.lang.String[]{r17}
            r12 = 0
            r0 = r22
            java.util.List r7 = X.00l.A0R(r0, r1, r13)
            r11 = 10
            int r0 = X.0Yv.A1E(r7, r11)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r16 = r7.iterator()
        L_0x0081:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r8 = r16.next()
            java.lang.String r8 = (java.lang.String) r8
            X.0qQ.A0B(r8, r13)
            int r9 = r8.length()
            int r9 = r9 - r18
            r7 = 0
            r15 = 0
        L_0x0098:
            if (r7 > r9) goto L_0x00ba
            r0 = r9
            if (r15 != 0) goto L_0x009e
            r0 = r7
        L_0x009e:
            char r0 = r8.charAt(r0)
            X.11S r10 = X.C39628A2s.A04
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r10.A07(r0)
            if (r15 != 0) goto L_0x00b5
            if (r0 != 0) goto L_0x00b2
            r15 = 1
            goto L_0x0098
        L_0x00b2:
            int r7 = r7 + 1
            goto L_0x0098
        L_0x00b5:
            if (r0 == 0) goto L_0x00ba
            int r9 = r9 + -1
            goto L_0x0098
        L_0x00ba:
            int r0 = r9 + 1
            java.lang.CharSequence r0 = r8.subSequence(r7, r0)
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            goto L_0x0081
        L_0x00c8:
            r0 = r17
            java.lang.String r0 = X.00k.A0P(r0, r5, r5, r1, r12)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            char[] r9 = r0.toCharArray()
            X.0qQ.A07(r9)
            int r15 = r9.length
            r8 = 0
        L_0x00dc:
            if (r8 >= r15) goto L_0x00fa
            char r7 = r9[r8]
            java.util.Map r1 = X.C10119Rmv.A00
            java.lang.Character r0 = java.lang.Character.valueOf(r7)
            boolean r16 = r1.containsKey(r0)
            if (r16 == 0) goto L_0x00f6
            java.lang.Object r0 = r1.get(r0)
            r10.append(r0)
        L_0x00f3:
            int r8 = r8 + 1
            goto L_0x00dc
        L_0x00f6:
            r10.append(r7)
            goto L_0x00f3
        L_0x00fa:
            java.lang.String r1 = r10.toString()
            X.0qQ.A07(r1)
            X.11S r0 = X.C39628A2s.A04
            java.lang.String r1 = r0.A00(r1, r5)
            r10 = 1
            java.lang.String r9 = "$1"
            java.lang.String r0 = r9.toString()
            X.11S r7 = X.C39628A2s.A02
            java.lang.String r8 = r7.A00(r1, r0)
            r0 = 2
            java.lang.String r0 = X.00p.A0f(r9, r0)
            java.lang.String r7 = r7.A00(r1, r0)
            java.lang.String[] r0 = new java.lang.String[]{r17}
            java.util.List r1 = X.00l.A0R(r1, r0, r13)
            int r0 = X.0Yv.A1E(r1, r11)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            java.util.Iterator r16 = r1.iterator()
        L_0x0132:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0172
            java.lang.Object r11 = r16.next()
            java.lang.String r11 = (java.lang.String) r11
            java.util.Set r0 = X.C10119Rmv.A01
            java.util.Iterator r15 = r0.iterator()
        L_0x0144:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r0 = r15.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = X.00p.A0i(r11, r0, r10)
            if (r1 == 0) goto L_0x0144
            if (r11 == 0) goto L_0x0170
            int r1 = r11.length()
        L_0x015c:
            if (r0 == 0) goto L_0x016e
            int r0 = r0.length()
        L_0x0162:
            int r1 = r1 - r0
            java.lang.String r11 = r11.substring(r13, r1)
            X.0qQ.A07(r11)
        L_0x016a:
            r9.add(r11)
            goto L_0x0132
        L_0x016e:
            r0 = 0
            goto L_0x0162
        L_0x0170:
            r1 = 0
            goto L_0x015c
        L_0x0172:
            r0 = r17
            java.lang.String r0 = X.00k.A0P(r0, r5, r5, r9, r12)
            java.lang.String[] r0 = new java.lang.String[]{r8, r7, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            r0 = r21
            r0.addAll(r1)
        L_0x0185:
            r7 = 1
            r0 = r22
            java.util.List r10 = r6.AVM(r0, r7, r7)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x01b6
            if (r19 == 0) goto L_0x01b6
            java.util.Iterator r1 = r21.iterator()
            X.0qQ.A07(r1)
        L_0x019b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r0 = r1.next()
            X.0qQ.A07(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r10 = r6.AVM(r0, r7, r7)
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x019b
        L_0x01b6:
            java.lang.Object r0 = X.00k.A0J(r10)
            X.9J7 r0 = (X.AnonymousClass9J7) r0
            if (r0 == 0) goto L_0x01c2
            java.lang.String r1 = r0.A04
            if (r1 != 0) goto L_0x01c3
        L_0x01c2:
            r1 = r5
        L_0x01c3:
            int r9 = r22.length()
            if (r26 == 0) goto L_0x01ca
            r9 = -1
        L_0x01ca:
            boolean r0 = r10.isEmpty()
            r8 = r0 ^ 1
            if (r26 == 0) goto L_0x01e9
            java.util.Set r0 = r3.A0B
            r0.size()
        L_0x01d7:
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            X.0eP r1 = new X.0eP
            r1.<init>(r0, r2)
            return r1
        L_0x01e9:
            X.02m r3 = X.02m.A0p
            X.9s8 r0 = X.C390969s8.MATCH_ALGO
            java.lang.String r4 = X.AnonymousClass92Y.A00(r0)
            X.5om r0 = r6.C1X()
            java.lang.String r0 = X.AnonymousClass92Y.A00(r0)
            r3.markerAnnotate(r14, r4, r0)
            X.9s8 r0 = X.C390969s8.INPUT_LENGTH
            java.lang.String r0 = X.AnonymousClass92Y.A00(r0)
            r3.markerAnnotate(r14, r0, r9)
            X.9s8 r0 = X.C390969s8.NUM_OF_PATTERNS
            java.lang.String r4 = X.AnonymousClass92Y.A00(r0)
            int r0 = r6.BXV()
            r3.markerAnnotate(r14, r4, r0)
            X.9s8 r0 = X.C390969s8.NUM_OF_MATCHES
            java.lang.String r0 = X.AnonymousClass92Y.A00(r0)
            r3.markerAnnotate(r14, r0, r8)
            X.9s8 r0 = X.C390969s8.DICTIONARY_ID
            java.lang.String r0 = X.AnonymousClass92Y.A00(r0)
            r3.markerAnnotate(r14, r0, r2)
            X.9s8 r0 = X.C390969s8.MATCHED_PATTERN_NONEXACT
            java.lang.String r0 = X.AnonymousClass92Y.A00(r0)
            r3.markerAnnotate(r14, r0, r1)
            X.9s8 r0 = X.C390969s8.THREAD_TYPE
            java.lang.String r1 = X.AnonymousClass92Y.A00(r0)
            X.9rp r0 = X.C390779rp.OPEN
            java.lang.String r0 = X.AnonymousClass92Y.A00(r0)
            r3.markerAnnotate(r14, r1, r0)
            r0 = 2
            r3.markerEnd(r14, r0)
            goto L_0x01d7
        L_0x0241:
            java.util.Set r0 = A0D
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0254
            com.instagram.common.session.UserSession r8 = r4.A02
            X.0Tu r7 = X.0Tu.A05
            r0 = 36314760237091612(0x81041500090b1c, double:3.0289388295145947E-306)
            goto L_0x0046
        L_0x0254:
            java.util.Set r0 = A0E
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0267
            com.instagram.common.session.UserSession r8 = r4.A02
            X.0Tu r7 = X.0Tu.A05
            r0 = 36314760238205727(0x810415001a0b1f, double:3.0289388302191655E-306)
            goto L_0x0046
        L_0x0267:
            java.lang.String r0 = "972134933488349"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x027a
            com.instagram.common.session.UserSession r8 = r4.A02
            X.0Tu r7 = X.0Tu.A05
            r0 = 36314760237157149(0x810415000a0b1d, double:3.0289388295560405E-306)
            goto L_0x0046
        L_0x027a:
            java.lang.String r0 = "963543174336669"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x028d
            com.instagram.common.session.UserSession r8 = r4.A02
            X.0Tu r7 = X.0Tu.A05
            r0 = 36314760236829465(0x81041500050b19, double:3.028938829348812E-306)
            goto L_0x0046
        L_0x028d:
            java.lang.String r0 = "579018200364522"
            boolean r0 = X.0qQ.A0K(r2, r0)
            r9 = 0
            if (r0 != 0) goto L_0x001b
            X.0eM r0 = r4.A07
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x02d2
            com.instagram.common.session.UserSession r7 = r4.A02
            X.0Tu r8 = X.0Tu.A05
            r0 = 36596235215440251(0x8204150022097b, double:3.206944739231038E-306)
            X.182.A01(r8, r7, r0)
            X.0qQ.A0B(r7, r9)
            if (r26 == 0) goto L_0x02c1
            r0 = 36314760238795553(0x81041500230b21, double:3.028938830592174E-306)
            boolean r0 = X.182.A06(r8, r7, r0)
            if (r0 == 0) goto L_0x001b
        L_0x02c1:
            r0 = 36314760238271264(0x810415001b0b20, double:3.0289388302606113E-306)
            boolean r0 = X.182.A06(r8, r7, r0)
            if (r0 == 0) goto L_0x001b
            boolean r0 = X.F5l.A01(r7)
            goto L_0x004a
        L_0x02d2:
            X.0eM r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0304
            com.instagram.common.session.UserSession r8 = r4.A02
            X.0Tu r7 = X.0Tu.A05
            r0 = 36596235215374714(0x8204150021097a, double:3.206944739189592E-306)
            X.182.A01(r7, r8, r0)
            X.0qQ.A0B(r8, r9)
            if (r26 == 0) goto L_0x02fd
            r0 = 36314760238795553(0x81041500230b21, double:3.028938830592174E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x001b
        L_0x02fd:
            r0 = 36314760238074654(0x81041500180b1e, double:3.0289388301362744E-306)
            goto L_0x0046
        L_0x0304:
            X.5ol r1 = r3.A09
            X.5ol r0 = X.C295705ol.A06
            if (r1 == r0) goto L_0x004c
            X.5om r1 = r3.A00
            X.5om r0 = X.C295715om.A05
            if (r1 != r0) goto L_0x001b
            goto L_0x004c
        L_0x0312:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.0eP r1 = new X.0eP
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl.A01(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl, java.lang.String, java.util.Set, boolean):X.0eP");
    }

    public final Object D8i(ContentFilterDictionaryImpl contentFilterDictionaryImpl, AnonymousClass4D7 r6) {
        Object A002 = 1Eo.A00(r6, this.A0A, new AnonymousClass9KP((Object) this, (Object) contentFilterDictionaryImpl, (AnonymousClass4D7) null, 8));
        if (A002 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }

    public final Object D8k(ContentFilterDictionaryImpl contentFilterDictionaryImpl, AnonymousClass4D7 r6) {
        Object A002 = 1Eo.A00(r6, this.A0A, new AnonymousClass9K1((Object) contentFilterDictionaryImpl, (Object) this, (AnonymousClass4D7) null, 8));
        if (A002 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }

    public final Object D8o(ContentFilterDictionaryImpl contentFilterDictionaryImpl, AnonymousClass4D7 r6) {
        Object A002 = 1Eo.A00(r6, this.A0A, new AnonymousClass9K1((Object) contentFilterDictionaryImpl, (Object) this, (AnonymousClass4D7) null, 9));
        if (A002 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }

    public final void onSessionWillEnd() {
        ContentFilterDictionaryRegistrar contentFilterDictionaryRegistrar = this.A04;
        C262224Cq r2 = contentFilterDictionaryRegistrar.A0F;
        AnonymousClass9KP r0 = new AnonymousClass9KP((Object) contentFilterDictionaryRegistrar, (Object) this, (AnonymousClass4D7) null, 6);
        19B r4 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        1Eo.A03(num, r4, r0, r2);
        1Eo.A03(num, r4, new AnonymousClass9KF(this, (AnonymousClass4D7) null, 49), this.A0B);
    }

    public ContentFilterEngineImpl(AnonymousClass12V r5, UserSession userSession, AnonymousClass92Y r7, ContentFilterDictionaryRegistrar contentFilterDictionaryRegistrar) {
        this.A04 = contentFilterDictionaryRegistrar;
        this.A03 = r7;
        this.A09 = r5;
        this.A02 = userSession;
        C262224Cq r3 = contentFilterDictionaryRegistrar.A0F;
        AnonymousClass9KP r2 = new AnonymousClass9KP((Object) contentFilterDictionaryRegistrar, (Object) this, (AnonymousClass4D7) null, 4);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
        0nV AOJ = r5.AOJ(1182601864, 3);
        this.A0A = AOJ;
        this.A0B = 19E.A02(AOJ);
        0qQ.A0B(userSession, 0);
        this.A01 = (int) 182.A01(0Tu.A06, userSession, 36597978970065990L);
        this.A05 = new LinkedHashMap();
        this.A08 = new 136();
        this.A00 = new AnonymousClass92Z(userSession);
    }
}
