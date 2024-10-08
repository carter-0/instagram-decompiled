package com.instagram.avatars.suggestions;

import X.002;
import X.00p;
import X.032;
import X.0Tu;
import X.0qQ;
import X.182;
import X.AnonymousClass0r6;
import X.C301295yt;
import X.C301305yu;
import X.C59686JTs;
import X.C66557MWl;
import X.DbS;
import com.facebook.mantle.common.mantledatavalue.MantleDataValue;
import com.facebook.mantle.ig.IGMantle;
import com.instagram.common.session.UserSession;

public final class LexiconRecommendationProvider implements C66557MWl {
    public IGMantle A00;
    public boolean A01;
    public final int A02;
    public final MantleDataValue A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final AnonymousClass0r6 A08;
    public final boolean A09;

    public LexiconRecommendationProvider(UserSession userSession, Integer num, String str) {
        String str2;
        String str3;
        int A042;
        0Tu A0J = DbS.A0J(str, 3);
        String A043 = 182.A04(A0J, userSession, 36884934325174863L);
        if (182.A06(A0J, userSession, 36321984372090752L)) {
            str2 = 182.A04(A0J, userSession, 36884934325240400L);
        } else {
            str2 = "{\"nodes\":{\"0\":{\"nodeType\":109,\"parents\":[],\"staticParams\":{}},\"1\":{\"nodeType\":111,\"parents\":[0,2,3],\"staticParams\":{\"35\":{\"int_val\":3}}},\"2\":{\"nodeType\":102,\"parents\":[0],\"staticParams\":{\"1\":{\"str_val\":\"blocklist\"},\"2\":{\"str_val\":\"##model_name##\"},\"3\":{\"int_val\":##lexicon_version##},\"26\":{\"int_val\":1},\"34\":{\"int_val\":1}}},\"3\":{\"nodeType\":102,\"parents\":[0],\"staticParams\":{\"1\":{\"str_val\":\"lexicon\"},\"2\":{\"str_val\":\"##model_name##\"},\"3\":{\"int_val\":##lexicon_version##},\"26\":{\"int_val\":1},\"34\":{\"int_val\":6}}}}}";
        }
        0qQ.A0A(str2);
        if (182.A06(A0J, userSession, 36321984372090752L)) {
            str3 = 182.A04(A0J, userSession, 36884934325305937L);
        } else {
            str3 = "{\"nodes\":{\"0\":{\"nodeType\":109,\"parents\":[],\"staticParams\":{}},\"1\":{\"nodeType\":111,\"parents\":[0],\"staticParams\":{\"35\":{\"int_val\":3}}}}}";
        }
        0qQ.A0A(str3);
        032 A012 = C59686JTs.A01(userSession);
        boolean z = !182.A06(A0J, userSession, 36321984372025215L);
        if (num != null) {
            A042 = num.intValue();
        } else {
            A042 = DbS.A04(A0J, userSession, 36603459348927398L);
        }
        this.A04 = A043;
        this.A08 = A012;
        this.A09 = z;
        this.A02 = A042;
        this.A06 = str;
        C301295yt r0 = MantleDataValue.Companion;
        this.A03 = new MantleDataValue(C301305yu.STRING, (Object) 002.A0O("suggestions_cache_key_", A042));
        String A0g = 00p.A0g(00p.A0g(str2, "##model_name##", this.A06, false), "##lexicon_version##", String.valueOf(this.A02), false);
        this.A05 = A0g;
        this.A07 = z ? 00p.A0g(00p.A0g(str3, "##model_name##", this.A06, false), "##lexicon_version##", String.valueOf(this.A02), false) : A0g;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d9, code lost:
        r0.add(new X.C63961LFl(r3, X.AnonymousClass7TE.A19(r2, 1)));
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebook.mantle.ig.IGMantle r8, com.instagram.avatars.suggestions.LexiconRecommendationProvider r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 32
            boolean r0 = X.ME4.A03(r3, r11)
            if (r0 == 0) goto L_0x010a
            r7 = r11
            X.ME4 r7 = (X.ME4) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010a
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r7.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x00ed
            if (r0 != r5) goto L_0x0116
            X.0eS.A00(r2)
        L_0x0024:
            com.google.common.collect.ImmutableMap r2 = (com.google.common.collect.ImmutableMap) r2
            java.lang.String r1 = "lexicon_matching_avatars"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r2.get(r1)
            com.facebook.mantle.common.mantledatavalue.MantleDataValue r0 = (com.facebook.mantle.common.mantledatavalue.MantleDataValue) r0
            if (r0 == 0) goto L_0x0110
            java.lang.Object r2 = r0.value
            if (r2 == 0) goto L_0x00e7
            X.5yu r1 = r0.type
            X.5yu r0 = X.C301305yu.LIST_STRING
            if (r1 != r0) goto L_0x00e7
        L_0x0040:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0110
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r2.iterator()
        L_0x004c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0112
            java.lang.String r6 = X.AnonymousClass7TE.A18(r7)
            r4 = 0
            X.0qQ.A0B(r6, r4)
            char[] r2 = new char[r5]
            r1 = 58
            r2[r4] = r1
            r3 = 2
            java.util.List r2 = X.00l.A0Q(r6, r2, r3)
            int r1 = r2.size()
            if (r1 != r3) goto L_0x004c
            java.lang.String r3 = X.AnonymousClass7TE.A19(r2, r4)
            int r1 = r3.hashCode()
            switch(r1) {
                case 49: goto L_0x0077;
                case 50: goto L_0x0082;
                case 51: goto L_0x008d;
                case 52: goto L_0x0098;
                case 53: goto L_0x00a3;
                case 54: goto L_0x00ae;
                case 55: goto L_0x00b9;
                case 56: goto L_0x00c4;
                case 57: goto L_0x00cf;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x004c
        L_0x0077:
            java.lang.String r1 = "1"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x00d9
        L_0x0082:
            java.lang.String r1 = "2"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x00d9
        L_0x008d:
            java.lang.String r1 = "3"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x00d9
        L_0x0098:
            java.lang.String r1 = "4"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x00d9
        L_0x00a3:
            java.lang.String r1 = "5"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            goto L_0x00d9
        L_0x00ae:
            java.lang.String r1 = "6"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            goto L_0x00d9
        L_0x00b9:
            java.lang.String r1 = "7"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            goto L_0x00d9
        L_0x00c4:
            java.lang.String r1 = "8"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            java.lang.Integer r3 = X.AnonymousClass05K.A15
            goto L_0x00d9
        L_0x00cf:
            java.lang.String r1 = "9"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x004c
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
        L_0x00d9:
            java.lang.String r2 = X.AnonymousClass7TE.A19(r2, r5)
            X.LFl r1 = new X.LFl
            r1.<init>(r3, r2)
            r0.add(r1)
            goto L_0x004c
        L_0x00e7:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            goto L_0x0040
        L_0x00ed:
            X.0eS.A00(r2)
            java.lang.String r4 = r9.A04
            java.lang.String r3 = r9.A07
            boolean r2 = r9.A09
            com.facebook.mantle.common.mantledatavalue.MantleDataValue r1 = r9.A03
            r0 = 0
            com.google.common.collect.ImmutableMap r0 = X.C64140LPp.A00(r1, r10, r2, r0)
            com.google.common.util.concurrent.ListenableFuture r0 = r8.runMantleWithConfigStr(r4, r3, r0)
            r7.A00 = r5
            java.lang.Object r2 = X.C70357O3j.A00(r0, r7)
            if (r2 != r6) goto L_0x0024
            return r6
        L_0x010a:
            X.ME4 r7 = X.ME4.A00(r9, r11, r3)
            goto L_0x0016
        L_0x0110:
            X.0sn r0 = X.0sn.A00
        L_0x0112:
            return r0
        L_0x0113:
            X.0sn r0 = X.0sn.A00
            return r0
        L_0x0116:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.LexiconRecommendationProvider.A00(com.facebook.mantle.ig.IGMantle, com.instagram.avatars.suggestions.LexiconRecommendationProvider, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CN0(java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            r3 = 27
            boolean r0 = X.C66146MDy.A02(r3, r12)
            if (r0 == 0) goto L_0x0074
            r8 = r12
            X.MDy r8 = (X.C66146MDy) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0074
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r8.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r9 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 == r6) goto L_0x0046
            if (r0 != r9) goto L_0x007a
            java.lang.Object r0 = r8.A02
            com.facebook.mantle.ig.IGMantle r0 = (com.facebook.mantle.ig.IGMantle) r0
            java.lang.Object r4 = r8.A01
            com.instagram.avatars.suggestions.LexiconRecommendationProvider r4 = (com.instagram.avatars.suggestions.LexiconRecommendationProvider) r4
            X.0eS.A00(r5)
        L_0x002f:
            r4.A00 = r0
            r4.A01 = r6
            X.0sn r7 = X.0sn.A00
        L_0x0035:
            return r7
        L_0x0036:
            X.0eS.A00(r5)
            X.0r6 r0 = r10.A08
            X.C66146MDy.A00(r10, r11, r8, r6)
            java.lang.Object r5 = X.AnonymousClass10c.A04(r8, r0)
            if (r5 == r7) goto L_0x0035
            r4 = r10
            goto L_0x0051
        L_0x0046:
            java.lang.Object r11 = r8.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r4 = r8.A01
            com.instagram.avatars.suggestions.LexiconRecommendationProvider r4 = (com.instagram.avatars.suggestions.LexiconRecommendationProvider) r4
            X.0eS.A00(r5)
        L_0x0051:
            com.facebook.mantle.ig.IGMantle r5 = (com.facebook.mantle.ig.IGMantle) r5
            java.lang.String r1 = r4.A04
            java.lang.String r0 = "_init"
            java.lang.String r3 = X.002.A0R(r1, r0)
            java.lang.String r2 = r4.A05
            boolean r1 = r4.A09
            com.facebook.mantle.common.mantledatavalue.MantleDataValue r0 = r4.A03
            com.google.common.collect.ImmutableMap r0 = X.C64140LPp.A00(r0, r11, r1, r6)
            com.google.common.util.concurrent.ListenableFuture r0 = r5.runMantleWithConfigStr(r3, r2, r0)
            X.C66146MDy.A00(r4, r5, r8, r9)
            java.lang.Object r0 = X.C70357O3j.A00(r0, r8)
            if (r0 == r7) goto L_0x0035
            r0 = r5
            goto L_0x002f
        L_0x0074:
            X.MDy r8 = new X.MDy
            r8.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x007a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.LexiconRecommendationProvider.CN0(java.lang.String, X.4D7):java.lang.Object");
    }
}
