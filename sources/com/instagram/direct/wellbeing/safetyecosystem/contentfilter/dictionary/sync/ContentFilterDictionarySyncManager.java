package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync;

import X.0nV;
import X.0qQ;
import X.AnonymousClass12T;
import X.AnonymousClass12V;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ContentFilterDictionarySyncManager {
    public final 0nV A00;
    public final ContentFilterDictionaryListLoader A01;
    public final ContentFilterDictionaryPatternsLoader A02;

    public ContentFilterDictionarySyncManager() {
        this((AnonymousClass12V) null, (ContentFilterDictionaryListLoader) null, (ContentFilterDictionaryPatternsLoader) null, (DefaultConstructorMarker) null, 7);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r14, java.lang.String r15, java.lang.String r16, X.AnonymousClass4D7 r17) {
        /*
            r13 = this;
            r7 = r14
            r3 = 37
            r5 = r17
            boolean r0 = X.AnonymousClass9JX.A00(r3, r5)
            r8 = r13
            if (r0 == 0) goto L_0x010b
            r4 = r5
            X.9JX r4 = (X.AnonymousClass9JX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r6 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r1) goto L_0x0055
            if (r0 == r2) goto L_0x00d7
            if (r0 != r5) goto L_0x0112
            X.0eS.A00(r6)
        L_0x002e:
            return r6
        L_0x002f:
            X.0eS.A00(r6)
            java.lang.String r6 = "user_custom_dictionary_key"
            r9 = r15
            boolean r0 = r15.contentEquals(r6)
            if (r0 == 0) goto L_0x00f8
            r12 = 0
            X.0qQ.A0B(r14, r12)
            X.631 r0 = new X.631
            r0.<init>(r14)
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0095
            r4.A01 = r14
            r4.A00 = r1
            java.lang.Object r6 = A00(r14, r13, r4)
            if (r6 != r3) goto L_0x005c
            return r3
        L_0x0055:
            java.lang.Object r7 = r4.A01
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.0eS.A00(r6)
        L_0x005c:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x008b
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r2 = r6.A00
            X.9hV r2 = (X.C384549hV) r2
            java.util.List r1 = r2.A00
            r8 = 0
            X.0qQ.A0B(r7, r8)
            X.631 r0 = new X.631
            r0.<init>(r7)
            r0.A01(r1)
            java.util.List r4 = r2.A00
            java.lang.String r2 = "user_custom_dictionary_key"
            java.lang.String r3 = ""
            X.0sn r5 = X.0sn.A00
            X.9cF r1 = new X.9cF
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.3Ih r0 = new X.3Ih
            r0.<init>(r1)
            return r0
        L_0x008b:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002e
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0095:
            boolean r0 = X.C67015Mgo.A03(r14)
            if (r0 == 0) goto L_0x00ce
            X.631 r0 = new X.631
            r0.<init>(r14)
            X.61N r1 = r0.A03
            r0 = 4
            java.util.Map r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x00b3
            java.lang.String r1 = ""
        L_0x00b3:
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r8 = X.00l.A0R(r1, r0, r12)
            java.lang.String r7 = ""
        L_0x00bf:
            X.0sn r9 = X.0sn.A00
            X.9cF r5 = new X.9cF
            r10 = r9
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.3Ih r6 = new X.3Ih
            r6.<init>(r5)
            return r6
        L_0x00ce:
            r4.A00 = r2
            java.lang.Object r6 = A00(r14, r13, r4)
            if (r6 != r3) goto L_0x00da
            return r3
        L_0x00d7:
            X.0eS.A00(r6)
        L_0x00da:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ee
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r0 = r6.A00
            X.9hV r0 = (X.C384549hV) r0
            java.util.List r8 = r0.A00
            java.lang.String r6 = "user_custom_dictionary_key"
            java.lang.String r7 = ""
            r12 = 0
            goto L_0x00bf
        L_0x00ee:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002e
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00f8:
            X.0nV r0 = r13.A00
            r11 = 0
            X.9Kc r6 = new X.9Kc
            r10 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            r4.A00 = r5
            java.lang.Object r6 = X.1Eo.A00(r4, r0, r6)
            if (r6 != r3) goto L_0x002e
            return r3
        L_0x010b:
            X.9JX r4 = new X.9JX
            r4.<init>(r13, r5, r3)
            goto L_0x001a
        L_0x0112:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryListLoader, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryPatternsLoader, java.lang.Object] */
    public /* synthetic */ ContentFilterDictionarySyncManager(AnonymousClass12V r5, ContentFilterDictionaryListLoader contentFilterDictionaryListLoader, ContentFilterDictionaryPatternsLoader contentFilterDictionaryPatternsLoader, DefaultConstructorMarker defaultConstructorMarker, int i) {
        ? obj = new Object();
        ? obj2 = new Object();
        AnonymousClass12T r2 = AnonymousClass12T.A00;
        0qQ.A0B(r2, 3);
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = r2.CO6(1880389522, 3);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r8, com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 17
            boolean r0 = X.AnonymousClass9JT.A00(r3, r10)
            if (r0 == 0) goto L_0x0065
            r4 = r10
            X.9JT r4 = (X.AnonymousClass9JT) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0065
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r1 = r4.A00
            r7 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r7) goto L_0x0073
            X.0eS.A00(r0)
        L_0x0024:
            r6 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0037
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x006d
            X.A05 r0 = new X.A05
            r0.<init>()
            X.5sO r6 = new X.5sO
            r6.<init>(r0)
        L_0x0037:
            return r6
        L_0x0038:
            X.0eS.A00(r0)
            r5 = 0
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r8, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r2.A08(r0)
            java.lang.String r0 = "accounts/get_comment_filter_keywords/"
            r2.A0A(r0)
            java.lang.Class<X.9hV> r1 = X.C384549hV.class
            java.lang.Class<X.AAz> r0 = X.C39828AAz.class
            r3 = 0
            r2.A0O(r5, r1, r0, r3)
            X.1OC r2 = r2.A0M()
            r4.A00 = r7
            r1 = 1880389522(0x70147792, float:1.8379333E29)
            r0 = 3
            java.lang.Object r0 = r2.A02(r4, r1, r0, r3)
            if (r0 != r6) goto L_0x0024
            return r6
        L_0x0065:
            r0 = 42
            X.9JT r4 = new X.9JT
            r4.<init>(r9, r10, r3, r0)
            goto L_0x0016
        L_0x006d:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0073:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager.A00(com.instagram.common.session.UserSession, com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.common.session.UserSession r9, java.lang.String r10, java.util.List r11, X.AnonymousClass4D7 r12) {
        /*
            r8 = this;
            r4 = 29
            boolean r0 = X.ME7.A02(r4, r12)
            if (r0 == 0) goto L_0x00c9
            r3 = r12
            X.ME7 r3 = (X.ME7) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c9
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 == r6) goto L_0x0094
            if (r0 != r7) goto L_0x00d2
            X.0eS.A00(r1)
        L_0x0027:
            return r1
        L_0x0028:
            X.0eS.A00(r1)
            java.lang.String r0 = "user_custom_dictionary_key"
            boolean r0 = r10.contentEquals(r0)
            r5 = 0
            if (r0 == 0) goto L_0x00b7
            boolean r0 = X.C67015Mgo.A03(r9)
            if (r0 == 0) goto L_0x0051
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.0qQ.A0B(r11, r6)
            X.631 r0 = new X.631
            r0.<init>(r9)
            r0.A01(r11)
        L_0x0049:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
            return r1
        L_0x0051:
            r0 = -2
            X.1NY r7 = new X.1NY
            r7.<init>(r9, r0)
            r7.A04()
            r0 = 1068(0x42c, float:1.497E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0A(r0)
            java.lang.String r0 = "disable_during_creation"
            java.lang.String r1 = "true"
            r7.A9m(r0, r1)
            java.lang.String r0 = "soft_delete"
            r7.A9m(r0, r1)
            java.lang.String r1 = ", "
            java.lang.String r0 = ""
            java.lang.String r1 = X.00k.A0P(r1, r0, r0, r11, r5)
            java.lang.String r0 = "keywords"
            r7.A9m(r0, r1)
            java.lang.Class<X.1XP> r2 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            r0 = 0
            r7.A0O(r5, r2, r1, r0)
            X.1OC r1 = r7.A0M()
            r3.A00 = r6
            r0 = 1880389522(0x70147792, float:1.8379333E29)
            java.lang.Object r1 = r1.A00(r0, r3)
            if (r1 != r4) goto L_0x0097
            return r4
        L_0x0094:
            X.0eS.A00(r1)
        L_0x0097:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00a9
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00da
            X.A05 r0 = new X.A05
            r0.<init>()
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x00a9:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0049
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0027
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00b7:
            X.0nV r2 = r8.A00
            r1 = 13
            X.MEQ r0 = new X.MEQ
            r0.<init>(r1, r5)
            r3.A00 = r7
            java.lang.Object r1 = X.1Eo.A00(r3, r2, r0)
            if (r1 != r4) goto L_0x0027
            return r4
        L_0x00c9:
            r0 = 42
            X.ME7 r3 = new X.ME7
            r3.<init>(r8, r12, r4, r0)
            goto L_0x0016
        L_0x00d2:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00da:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager.A02(com.instagram.common.session.UserSession, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }
}
