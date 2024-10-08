package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary;

import X.00k;
import X.0nV;
import X.0qQ;
import X.0sl;
import X.136;
import X.19E;
import X.1Eo;
import X.1Ng;
import X.1wn;
import X.AnonymousClass12V;
import X.AnonymousClass1Nd;
import X.AnonymousClass4D7;
import X.AnonymousClass92W;
import X.C262224Cq;
import X.C295705ol;
import X.C295715om;
import X.C297145rH;
import X.C297155rI;
import X.C297165rJ;
import X.C297815sO;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryDatabase;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class ContentFilterDictionaryImpl implements C297145rH {
    public C295715om A00;
    public String A01;
    public boolean A02;
    public final 1Ng A03;
    public final 1wn A04;
    public final UserSession A05;
    public final 0nV A06;
    public final ContentFilterDictionaryDatabase A07;
    public final ContentFilterDictionarySyncManager A08;
    public final C295705ol A09;
    public final String A0A;
    public final Set A0B = new LinkedHashSet();
    public final C262224Cq A0C;
    public final 136 A0D;
    public final 136 A0E;
    public final boolean A0F;
    public volatile Set A0G = 0sl.A00;
    public volatile boolean A0H;

    public static final Set A00(Set set) {
        Set A0j;
        synchronized (set) {
            A0j = 00k.A0j(set);
        }
        return A0j;
    }

    public final void A04(AnonymousClass92W r2) {
        0qQ.A0B(r2, 0);
        synchronized (this) {
            Set A0j = 00k.A0j(this.A0G);
            A0j.add(r2);
            this.A0G = A0j;
        }
    }

    public final void A05(AnonymousClass92W r2) {
        0qQ.A0B(r2, 0);
        synchronized (this) {
            Set A0j = 00k.A0j(this.A0G);
            A0j.remove(r2);
            this.A0G = A0j;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.9Jg] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Bat(X.AnonymousClass4D7 r10, boolean r11) {
        /*
            r9 = this;
            r3 = 0
            boolean r0 = r10 instanceof X.C376769Jg
            if (r0 == 0) goto L_0x00bb
            r4 = r10
            X.9Jg r4 = (X.C376769Jg) r4
            int r0 = r4.A06
            if (r0 != r3) goto L_0x00bb
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bb
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r4.A05
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0064
            if (r0 == r2) goto L_0x0058
            if (r0 != r3) goto L_0x00c2
            java.lang.Object r8 = r4.A04
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r7 = r4.A03
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r4.A02
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r2 = r4.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r2 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r2
            X.0eS.A00(r1)
        L_0x0038:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r8.next()
            X.92W r0 = (X.AnonymousClass92W) r0
            r4.A01 = r2
            r4.A02 = r6
            r4.A03 = r7
            r4.A04 = r8
            r4.A00 = r3
            java.lang.Object r0 = r0.DWN(r2, r6, r7, r4)
            if (r0 != r5) goto L_0x0038
        L_0x0054:
            return r5
        L_0x0055:
            java.util.Set r0 = r2.A0B
            goto L_0x006f
        L_0x0058:
            java.lang.Object r7 = r4.A02
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r2 = r4.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r2 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r2
            X.0eS.A00(r1)
            goto L_0x0095
        L_0x0064:
            X.0eS.A00(r1)
            boolean r0 = r9.A0H
            if (r0 == 0) goto L_0x0079
            if (r11 != 0) goto L_0x0079
            java.util.Set r0 = r9.A0B
        L_0x006f:
            java.util.Set r0 = A00(r0)
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0078:
            return r1
        L_0x0079:
            java.util.Set r0 = r9.A0B
            java.util.Set r7 = A00(r0)
            r4.A01 = r9
            r4.A02 = r7
            r4.A00 = r2
            X.0nV r6 = r9.A06
            r2 = 0
            r1 = 3
            X.9KS r0 = new X.9KS
            r0.<init>((java.lang.Object) r9, (X.AnonymousClass4D7) r2, (int) r1)
            java.lang.Object r1 = X.1Eo.A00(r4, r6, r0)
            if (r1 == r5) goto L_0x0054
            r2 = r9
        L_0x0095:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0078
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ca
            java.util.Set r0 = r2.A0B
            java.util.Set r1 = A00(r0)
            java.util.Set r0 = X.00k.A0m(r1, r7)
            java.util.List r6 = X.00k.A0a(r0)
            java.util.Set r0 = X.00k.A0m(r7, r1)
            java.util.List r7 = X.00k.A0a(r0)
            java.util.Set r0 = r2.A0G
            java.util.Iterator r8 = r0.iterator()
            goto L_0x0038
        L_0x00bb:
            X.9Jg r4 = new X.9Jg
            r4.<init>(r9, r10, r3)
            goto L_0x0017
        L_0x00c2:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00ca:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl.Bat(X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 25
            boolean r0 = X.C66145MDx.A02(r3, r8)
            if (r0 == 0) goto L_0x0050
            r6 = r8
            X.MDx r6 = (X.C66145MDx) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0050
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r6.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r3) goto L_0x0059
            java.lang.Object r2 = r6.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r6.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r1
            X.0eS.A00(r5)
        L_0x002c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r2.next()
            X.92W r0 = (X.AnonymousClass92W) r0
            r6.A01 = r1
            r6.A02 = r2
            r6.A00 = r3
            java.lang.Object r0 = r0.D8i(r1, r6)
            if (r0 != r4) goto L_0x002c
            return r4
        L_0x0045:
            X.0eS.A00(r5)
            java.util.Set r0 = r7.A0G
            java.util.Iterator r2 = r0.iterator()
            r1 = r7
            goto L_0x002c
        L_0x0050:
            X.MDx r6 = new X.MDx
            r6.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x0056:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0059:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl.A01(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 24
            boolean r0 = X.C376709Ja.A00(r3, r8)
            if (r0 == 0) goto L_0x0050
            r6 = r8
            X.9Ja r6 = (X.C376709Ja) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0050
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r6.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r3) goto L_0x0059
            java.lang.Object r2 = r6.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r6.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r1
            X.0eS.A00(r5)
        L_0x002c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r2.next()
            X.92W r0 = (X.AnonymousClass92W) r0
            r6.A01 = r1
            r6.A02 = r2
            r6.A00 = r3
            java.lang.Object r0 = r0.D8k(r1, r6)
            if (r0 != r4) goto L_0x002c
            return r4
        L_0x0045:
            X.0eS.A00(r5)
            java.util.Set r0 = r7.A0G
            java.util.Iterator r2 = r0.iterator()
            r1 = r7
            goto L_0x002c
        L_0x0050:
            X.9Ja r6 = new X.9Ja
            r6.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x0056:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0059:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl.A02(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 25
            boolean r0 = X.C376709Ja.A00(r3, r8)
            if (r0 == 0) goto L_0x0050
            r6 = r8
            X.9Ja r6 = (X.C376709Ja) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0050
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r6.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r2 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r2) goto L_0x0062
            java.lang.Object r1 = r6.A02
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r6.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r3 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r3
            X.0eS.A00(r5)
        L_0x002c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r1.next()
            X.92W r0 = (X.AnonymousClass92W) r0
            r6.A01 = r3
            r6.A02 = r1
            r6.A00 = r2
            java.lang.Object r0 = r0.D8o(r3, r6)
            if (r0 != r4) goto L_0x002c
            return r4
        L_0x0045:
            X.0eS.A00(r5)
            java.util.Set r0 = r7.A0G
            java.util.Iterator r1 = r0.iterator()
            r3 = r7
            goto L_0x002c
        L_0x0050:
            X.9Ja r6 = new X.9Ja
            r6.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x0056:
            X.1Ng r2 = r3.A03
            java.lang.Class<X.5rJ> r1 = X.C297165rJ.class
            X.1wn r0 = r3.A04
            r2.A02(r0, r1)
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0062:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl.A03(X.4D7):java.lang.Object");
    }

    public final Object FL5(List list, List list2, AnonymousClass4D7 r6) {
        if (!this.A02 || this.A0F) {
            return new C297815sO(new Object());
        }
        return 1Eo.A00(r6, this.A06, new ContentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2(this, list, list2, (AnonymousClass4D7) null));
    }

    public /* synthetic */ ContentFilterDictionaryImpl(AnonymousClass12V r4, UserSession userSession, ContentFilterDictionaryDatabase contentFilterDictionaryDatabase, ContentFilterDictionarySyncManager contentFilterDictionarySyncManager, C295715om r8, C295705ol r9, String str, String str2, boolean z, boolean z2) {
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(contentFilterDictionarySyncManager, 2);
        0qQ.A0B(str, 3);
        0qQ.A0B(str2, 4);
        0qQ.A0B(r9, 6);
        0qQ.A0B(r8, 7);
        0qQ.A0B(contentFilterDictionaryDatabase, 9);
        0qQ.A0B(r4, 10);
        0qQ.A0B(A002, 11);
        this.A05 = userSession;
        this.A08 = contentFilterDictionarySyncManager;
        this.A0A = str;
        this.A01 = str2;
        this.A02 = z;
        this.A09 = r9;
        this.A00 = r8;
        this.A0F = z2;
        this.A07 = contentFilterDictionaryDatabase;
        this.A03 = A002;
        0nV CO6 = r4.CO6(548458267, 3);
        this.A06 = CO6;
        this.A0C = 19E.A02(CO6);
        this.A0E = new 136();
        this.A0D = new 136();
        C297155rI r1 = new C297155rI(this);
        this.A04 = r1;
        A002.A01(r1, C297165rJ.class);
    }
}
