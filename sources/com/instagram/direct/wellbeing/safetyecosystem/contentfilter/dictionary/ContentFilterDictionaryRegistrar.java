package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary;

import X.0nV;
import X.0qQ;
import X.136;
import X.19B;
import X.19E;
import X.1Eo;
import X.1V8;
import X.1V9;
import X.1VA;
import X.1VC;
import X.AnonymousClass05K;
import X.AnonymousClass0lh;
import X.AnonymousClass12T;
import X.AnonymousClass12V;
import X.AnonymousClass4D7;
import X.AnonymousClass92R;
import X.AnonymousClass92V;
import X.AnonymousClass9KF;
import X.C262224Cq;
import X.C60960kU;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryDatabase;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryListLoader;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryPatternsLoader;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ContentFilterDictionaryRegistrar implements AnonymousClass0lh {
    public final AnonymousClass12V A00;
    public final UserSession A01;
    public final 0nV A02;
    public final 0nV A03;
    public final AnonymousClass92V A04;
    public final ContentFilterDictionaryDatabase A05;
    public final ContentFilterDictionarySyncManager A06;
    public final Map A07;
    public final Map A08;
    public final Set A09;
    public final Set A0A;
    public final ConcurrentHashMap A0B;
    public final ConcurrentHashMap A0C;
    public final ConcurrentHashMap A0D;
    public final ConcurrentHashMap A0E;
    public final C262224Cq A0F;
    public final 136 A0G;
    public final 136 A0H;

    public /* synthetic */ ContentFilterDictionaryRegistrar(UserSession userSession) {
        ContentFilterDictionarySyncManager contentFilterDictionarySyncManager = new ContentFilterDictionarySyncManager((AnonymousClass12V) null, (ContentFilterDictionaryListLoader) null, (ContentFilterDictionaryPatternsLoader) null, (DefaultConstructorMarker) null, 7);
        AnonymousClass92R r5 = ContentFilterDictionaryDatabase.A00;
        Class<ContentFilterDictionaryDatabase> cls = ContentFilterDictionaryDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (r5) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    Context context = C60960kU.A00;
                    0qQ.A07(context);
                    1VA A002 = 1V9.A00(context, cls, 1V8.A00(userSession, r5));
                    1VC.A00(A002, 266555918, 1438706234, false);
                    A002.A01();
                    igRoomDatabase = (IgRoomDatabase) A002.A00();
                    userSession.A04(cls, igRoomDatabase);
                }
            }
        }
        ContentFilterDictionaryDatabase contentFilterDictionaryDatabase = (ContentFilterDictionaryDatabase) igRoomDatabase;
        AnonymousClass12T r3 = AnonymousClass12T.A00;
        0qQ.A0B(contentFilterDictionaryDatabase, 3);
        0qQ.A0B(r3, 4);
        this.A01 = userSession;
        this.A06 = contentFilterDictionarySyncManager;
        this.A05 = contentFilterDictionaryDatabase;
        this.A00 = r3;
        this.A08 = new LinkedHashMap();
        this.A07 = new LinkedHashMap();
        this.A0A = new LinkedHashSet();
        this.A0D = new ConcurrentHashMap();
        this.A0B = new ConcurrentHashMap();
        this.A0E = new ConcurrentHashMap();
        this.A0C = new ConcurrentHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A09 = linkedHashSet;
        AnonymousClass92V r0 = new AnonymousClass92V(this);
        this.A04 = r0;
        linkedHashSet.add(r0);
        this.A0F = 19E.A02(r3.AOJ(1304292585, 3));
        this.A02 = r3.AOJ(1304292585, 3);
        this.A03 = r3.AOJ(1055497132, 3);
        this.A0H = new 136();
        this.A0G = new 136();
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r6, java.util.List r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 34
            boolean r0 = X.AnonymousClass9JX.A00(r3, r8)
            if (r0 == 0) goto L_0x004d
            r5 = r8
            X.9JX r5 = (X.AnonymousClass9JX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r2 = r5.A00
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L_0x002a
            if (r2 == r0) goto L_0x0038
            if (r2 != r1) goto L_0x0053
            X.0eS.A00(r4)
        L_0x0027:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x002a:
            X.0eS.A00(r4)
            r5.A01 = r6
            r5.A00 = r0
            java.lang.Object r4 = A01(r6, r7, r5)
            if (r4 != r3) goto L_0x003f
            return r3
        L_0x0038:
            java.lang.Object r6 = r5.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r6 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r6
            X.0eS.A00(r4)
        L_0x003f:
            java.util.Map r4 = (java.util.Map) r4
            r0 = 0
            r5.A01 = r0
            r5.A00 = r1
            java.lang.Object r0 = A02(r6, r4, r5)
            if (r0 != r3) goto L_0x0027
            return r3
        L_0x004d:
            X.9JX r5 = new X.9JX
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x0053:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar.A00(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.4D7, X.9Jg] */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (((X.C376769Jg) r4).A06 != 1) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5 A[Catch:{ all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010b A[Catch:{ all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0129 A[Catch:{ all -> 0x01aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r27, java.util.List r28, X.AnonymousClass4D7 r29) {
        /*
            r3 = r27
            r10 = 1
            r4 = r29
            boolean r0 = r4 instanceof X.C376769Jg
            if (r0 == 0) goto L_0x0011
            r0 = r4
            X.9Jg r0 = (X.C376769Jg) r0
            int r1 = r0.A06
            r0 = 1
            if (r1 == r10) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0041
            r9 = r4
            X.9Jg r9 = (X.C376769Jg) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0041
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0022:
            java.lang.Object r1 = r9.A05
            X.1Hj r7 = X.1Hj.A02
            int r0 = r9.A00
            r6 = 0
            if (r0 == 0) goto L_0x004f
            if (r0 != r10) goto L_0x0047
            java.lang.Object r5 = r9.A04
            X.136 r5 = (X.136) r5
            java.lang.Object r4 = r9.A03
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r7 = r9.A02
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r3 = r9.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r3 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r3
            X.0eS.A00(r1)
            goto L_0x0085
        L_0x0041:
            X.9Jg r9 = new X.9Jg
            r9.<init>(r3, r4, r10)
            goto L_0x0022
        L_0x0047:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x004f:
            X.0eS.A00(r1)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r2 = r28.iterator()
        L_0x0060:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r1 = r2.next()
            X.5ky r1 = (X.C293565ky) r1
            java.lang.String r0 = r1.A02
            r4.put(r0, r1)
            goto L_0x0060
        L_0x0072:
            X.136 r5 = r3.A0H
            r9.A01 = r3
            r9.A02 = r8
            r9.A03 = r4
            r9.A04 = r5
            r9.A00 = r10
            java.lang.Object r0 = X.136.A00(r9, r5)
            if (r0 == r7) goto L_0x01af
            r7 = r8
        L_0x0085:
            java.util.Set r1 = r4.keySet()     // Catch:{ all -> 0x01aa }
            java.util.Map r2 = r3.A08     // Catch:{ all -> 0x01aa }
            java.util.Set r0 = r2.keySet()     // Catch:{ all -> 0x01aa }
            java.util.Set r8 = X.00k.A0m(r1, r0)     // Catch:{ all -> 0x01aa }
            java.util.Set r1 = r2.keySet()     // Catch:{ all -> 0x01aa }
            java.util.Set r0 = r4.keySet()     // Catch:{ all -> 0x01aa }
            java.util.Set r18 = X.00k.A0m(r1, r0)     // Catch:{ all -> 0x01aa }
            java.util.Set r1 = r2.keySet()     // Catch:{ all -> 0x01aa }
            java.util.Set r0 = r4.keySet()     // Catch:{ all -> 0x01aa }
            java.util.Set r17 = X.00k.A0l(r1, r0)     // Catch:{ all -> 0x01aa }
            java.util.Iterator r16 = r8.iterator()     // Catch:{ all -> 0x01aa }
        L_0x00af:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0101
            java.lang.Object r10 = r16.next()     // Catch:{ all -> 0x01aa }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01aa }
            java.lang.Object r12 = r4.get(r10)     // Catch:{ all -> 0x01aa }
            X.5ky r12 = (X.C293565ky) r12     // Catch:{ all -> 0x01aa }
            if (r12 == 0) goto L_0x00af
            com.instagram.common.session.UserSession r0 = r3.A01     // Catch:{ all -> 0x01aa }
            r21 = r0
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager r0 = r3.A06     // Catch:{ all -> 0x01aa }
            r23 = r0
            java.lang.String r0 = r12.A02     // Catch:{ all -> 0x01aa }
            r19 = r0
            java.lang.String r15 = r12.A05     // Catch:{ all -> 0x01aa }
            boolean r14 = r12.A07     // Catch:{ all -> 0x01aa }
            X.5ol r13 = r12.A01     // Catch:{ all -> 0x01aa }
            X.5om r11 = r12.A00     // Catch:{ all -> 0x01aa }
            boolean r9 = r12.A08     // Catch:{ all -> 0x01aa }
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryDatabase r8 = r3.A05     // Catch:{ all -> 0x01aa }
            X.12V r0 = r3.A00     // Catch:{ all -> 0x01aa }
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r1 = new com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl     // Catch:{ all -> 0x01aa }
            r25 = r13
            r26 = r19
            r27 = r15
            r28 = r14
            r29 = r9
            r19 = r1
            r20 = r0
            r22 = r8
            r24 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x01aa }
            java.util.List r0 = r12.A06     // Catch:{ all -> 0x01aa }
            java.util.Set r0 = X.00k.A0k(r0)     // Catch:{ all -> 0x01aa }
            r7.put(r1, r0)     // Catch:{ all -> 0x01aa }
            r2.put(r10, r1)     // Catch:{ all -> 0x01aa }
            goto L_0x00af
        L_0x0101:
            java.util.Iterator r8 = r18.iterator()     // Catch:{ all -> 0x01aa }
        L_0x0105:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01aa }
            java.lang.Object r1 = r2.remove(r0)     // Catch:{ all -> 0x01aa }
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r1     // Catch:{ all -> 0x01aa }
            if (r1 == 0) goto L_0x0105
            X.0sl r0 = X.0sl.A00     // Catch:{ all -> 0x01aa }
            r7.put(r1, r0)     // Catch:{ all -> 0x01aa }
            goto L_0x0105
        L_0x011f:
            java.util.Iterator r12 = r17.iterator()     // Catch:{ all -> 0x01aa }
        L_0x0123:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01aa }
            java.lang.Object r9 = r4.get(r0)     // Catch:{ all -> 0x01aa }
            X.5ky r9 = (X.C293565ky) r9     // Catch:{ all -> 0x01aa }
            if (r9 == 0) goto L_0x0123
            java.lang.Object r8 = r2.get(r0)     // Catch:{ all -> 0x01aa }
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r8 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r8     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x0123
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet     // Catch:{ all -> 0x01aa }
            r11.<init>()     // Catch:{ all -> 0x01aa }
            java.util.concurrent.ConcurrentHashMap r0 = r3.A0E     // Catch:{ all -> 0x01aa }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x01aa }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0166
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01aa }
        L_0x0152:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0166
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01aa }
            X.92L r0 = (X.AnonymousClass92L) r0     // Catch:{ all -> 0x01aa }
            X.92I r0 = r0.And()     // Catch:{ all -> 0x01aa }
            r11.add(r0)     // Catch:{ all -> 0x01aa }
            goto L_0x0152
        L_0x0166:
            boolean r0 = r8.A02     // Catch:{ all -> 0x01aa }
            boolean r10 = r9.A07     // Catch:{ all -> 0x01aa }
            if (r0 != r10) goto L_0x0185
            X.5om r1 = r8.A00     // Catch:{ all -> 0x01aa }
            X.5om r0 = r9.A00     // Catch:{ all -> 0x01aa }
            if (r1 != r0) goto L_0x0185
            java.lang.String r1 = r8.A01     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = r9.A05     // Catch:{ all -> 0x01aa }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0185
            java.util.List r0 = r9.A06     // Catch:{ all -> 0x01aa }
            boolean r0 = r11.containsAll(r0)     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0185
            goto L_0x0198
        L_0x0185:
            r8.A02 = r10     // Catch:{ all -> 0x01aa }
            X.5om r0 = r9.A00     // Catch:{ all -> 0x01aa }
            r1 = 0
            X.0qQ.A0B(r0, r1)     // Catch:{ all -> 0x01aa }
            r8.A00 = r0     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = r9.A05     // Catch:{ all -> 0x01aa }
            X.0qQ.A0B(r0, r1)     // Catch:{ all -> 0x01aa }
            r8.A01 = r0     // Catch:{ all -> 0x01aa }
            r0 = 1
            goto L_0x0199
        L_0x0198:
            r0 = 0
        L_0x0199:
            if (r0 == 0) goto L_0x0123
            java.util.List r0 = r9.A06     // Catch:{ all -> 0x01aa }
            java.util.Set r0 = X.00k.A0k(r0)     // Catch:{ all -> 0x01aa }
            r7.put(r8, r0)     // Catch:{ all -> 0x01aa }
            goto L_0x0123
        L_0x01a6:
            r5.A05(r6)
            return r7
        L_0x01aa:
            r0 = move-exception
            r5.A05(r6)
            throw r0
        L_0x01af:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar.A01(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.5rK, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0126 A[Catch:{ all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01aa A[SYNTHETIC] */
    public static final java.lang.Object A02(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r14, java.util.Map r15, X.AnonymousClass4D7 r16) {
        /*
            r3 = r16
            boolean r0 = r3 instanceof X.C297175rK
            if (r0 == 0) goto L_0x0046
            r11 = r3
            X.5rK r11 = (X.C297175rK) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0046
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0014:
            java.lang.Object r1 = r11.A0A
            X.1Hj r10 = X.1Hj.A02
            int r0 = r11.A00
            r9 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 != r9) goto L_0x004c
            java.lang.Object r8 = r11.A09
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r11.A08
            X.136 r2 = (X.136) r2
            java.lang.Object r7 = r11.A07
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r3 = r11.A06
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r4 = r11.A05
            java.lang.Object r6 = r11.A04
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r11.A03
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r15 = r11.A02
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Object r14 = r11.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r14 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r14
            X.0eS.A00(r1)
            goto L_0x011c
        L_0x0046:
            X.5rK r11 = new X.5rK
            r11.<init>(r14, r3)
            goto L_0x0014
        L_0x004c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0054:
            X.0eS.A00(r1)
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.Set r0 = r15.keySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x0064:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01aa
            java.lang.Object r4 = r6.next()
            java.util.concurrent.ConcurrentHashMap r0 = r14.A0E
            java.lang.Object r3 = r0.get(r4)
            if (r3 != 0) goto L_0x0082
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.lang.Object r0 = r0.putIfAbsent(r4, r3)
            if (r0 == 0) goto L_0x0082
            r3 = r0
        L_0x0082:
            java.util.Set r3 = (java.util.Set) r3
            X.0qQ.A0A(r3)
            r0 = 10
            int r0 = X.0Yv.A1E(r3, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r0 = r1.next()
            X.92L r0 = (X.AnonymousClass92L) r0
            X.92I r0 = r0.And()
            r2.add(r0)
            goto L_0x0096
        L_0x00aa:
            java.util.Set r7 = X.00k.A0k(r2)
            java.lang.Object r2 = r15.get(r4)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            if (r2 == 0) goto L_0x0064
            java.util.Set r0 = X.00k.A0m(r7, r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r12 = r0.iterator()
        L_0x00c3:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r1 = r12.next()
            java.util.Map r0 = r14.A07
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x00c3
            r8.add(r0)
            goto L_0x00c3
        L_0x00d9:
            java.util.Set r0 = X.00k.A0m(r2, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x00e6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r14.A07
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x00e6
            r7.add(r0)
            goto L_0x00e6
        L_0x00fc:
            r3.removeAll(r8)
            X.136 r2 = r14.A0G
            r11.A01 = r14
            r11.A02 = r15
            r11.A03 = r5
            r11.A04 = r6
            r11.A05 = r4
            r11.A06 = r3
            r11.A07 = r7
            r11.A08 = r2
            r11.A09 = r8
            r11.A00 = r9
            java.lang.Object r0 = X.136.A00(r11, r2)
            if (r0 != r10) goto L_0x011c
            return r10
        L_0x011c:
            java.util.concurrent.ConcurrentHashMap r0 = r14.A0D     // Catch:{ all -> 0x01a2 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x01a2 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x013e
            r0.removeAll(r8)     // Catch:{ all -> 0x01a2 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x013e
            X.4Cq r12 = r14.A0F     // Catch:{ all -> 0x01a2 }
            r13 = 0
            r0 = 32
            X.MGt r1 = new X.MGt     // Catch:{ all -> 0x01a5 }
            r1.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r13, (int) r0)     // Catch:{ all -> 0x01a5 }
            X.19B r0 = X.19B.A00     // Catch:{ all -> 0x01a2 }
            X.1Eo.A05(r0, r1, r12)     // Catch:{ all -> 0x01a2 }
        L_0x013e:
            r0 = 0
            r2.A05(r0)
            java.util.Iterator r12 = r8.iterator()
        L_0x0146:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x016f
            java.lang.Object r2 = r12.next()
            java.util.concurrent.ConcurrentHashMap r0 = r14.A0C
            java.lang.Object r0 = r0.get(r2)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x015d
            r0.remove(r4)
        L_0x015d:
            java.util.concurrent.ConcurrentHashMap r1 = r14.A0B
            java.lang.Object r0 = r1.get(r2)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0146
            java.util.Set r0 = X.094.A03(r4, r0)
            r1.put(r2, r0)
            goto L_0x0146
        L_0x016f:
            r3.addAll(r7)
            java.util.Iterator r3 = r7.iterator()
        L_0x0176:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x019a
            java.lang.Object r2 = r3.next()
            java.util.concurrent.ConcurrentHashMap r0 = r14.A0C
            java.lang.Object r1 = r0.get(r2)
            if (r1 != 0) goto L_0x0194
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.lang.Object r0 = r0.putIfAbsent(r2, r1)
            if (r0 == 0) goto L_0x0194
            r1 = r0
        L_0x0194:
            java.util.Set r1 = (java.util.Set) r1
            r1.add(r4)
            goto L_0x0176
        L_0x019a:
            r5.addAll(r8)
            r5.addAll(r7)
            goto L_0x0064
        L_0x01a2:
            r0 = move-exception
            r13 = 0
            goto L_0x01a6
        L_0x01a5:
            r0 = move-exception
        L_0x01a6:
            r2.A05(r13)
            throw r0
        L_0x01aa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar.A02(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar, java.util.Map, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r7, X.AnonymousClass92L r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 16
            boolean r0 = X.AnonymousClass9JT.A00(r3, r9)
            if (r0 == 0) goto L_0x0069
            r4 = r9
            X.9JT r4 = (X.AnonymousClass9JT) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r5) goto L_0x0071
            X.0eS.A00(r1)
        L_0x0024:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r3 = new X.3Ih
            r3.<init>(r0)
            return r3
        L_0x002c:
            X.0eS.A00(r1)
            java.util.Map r1 = r6.A07
            X.92I r0 = r8.And()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x004d
            if (r7 == 0) goto L_0x004d
            java.util.concurrent.ConcurrentHashMap r0 = r6.A0C
            java.lang.Object r0 = r0.get(r8)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0058
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L_0x0058
        L_0x004d:
            X.A05 r0 = new X.A05
            r0.<init>()
            X.5sO r3 = new X.5sO
            r3.<init>(r0)
            return r3
        L_0x0058:
            X.0nV r2 = r6.A03
            r1 = 0
            X.9KU r0 = new X.9KU
            r0.<init>(r7, r6, r8, r1)
            r4.A00 = r5
            java.lang.Object r0 = X.1Eo.A00(r4, r2, r0)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x0069:
            r0 = 42
            X.9JT r4 = new X.9JT
            r4.<init>(r6, r9, r3, r0)
            goto L_0x0016
        L_0x0071:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar.A03(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl, X.92L, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass92L r8, X.AnonymousClass4D7 r9, boolean r10) {
        /*
            r7 = this;
            r3 = 26
            boolean r0 = X.C376709Ja.A00(r3, r9)
            if (r0 == 0) goto L_0x0087
            r6 = r9
            X.9Ja r6 = (X.C376709Ja) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0087
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 != r4) goto L_0x008d
            java.lang.Object r8 = r6.A02
            java.lang.Object r0 = r6.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r0 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r0
            X.0eS.A00(r1)
        L_0x002a:
            java.util.concurrent.ConcurrentHashMap r0 = r0.A0C
            java.lang.Object r1 = r0.get(r8)
            if (r1 != 0) goto L_0x0034
            X.0sl r1 = X.0sl.A00
        L_0x0034:
            X.3Ih r0 = new X.3Ih
            r0.<init>(r1)
            return r0
        L_0x003a:
            X.0eS.A00(r1)
            java.util.Map r1 = r7.A07
            X.92I r0 = r8.And()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x0054
            X.A05 r1 = new X.A05
            r1.<init>()
            X.5sO r0 = new X.5sO
            r0.<init>(r1)
            return r0
        L_0x0054:
            java.util.Set r0 = r7.A0A
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x006e
            if (r10 != 0) goto L_0x006e
            java.util.concurrent.ConcurrentHashMap r0 = r7.A0C
            java.lang.Object r1 = r0.get(r8)
            if (r1 != 0) goto L_0x0068
            X.0sl r1 = X.0sl.A00
        L_0x0068:
            X.3Ih r0 = new X.3Ih
            r0.<init>(r1)
            return r0
        L_0x006e:
            X.0nV r3 = r7.A02
            r2 = 0
            r1 = 47
            X.9KF r0 = new X.9KF
            r0.<init>(r7, r2, r1)
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r4
            java.lang.Object r0 = X.1Eo.A00(r6, r3, r0)
            if (r0 != r5) goto L_0x0085
            return r5
        L_0x0085:
            r0 = r7
            goto L_0x002a
        L_0x0087:
            X.9Ja r6 = new X.9Ja
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x008d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar.A04(X.92L, X.4D7, boolean):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        C262224Cq r3 = this.A0F;
        AnonymousClass9KF r2 = new AnonymousClass9KF(this, (AnonymousClass4D7) null, 48);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }
}
