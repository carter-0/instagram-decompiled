package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.model.LeadGenConditionalAnswerInfo;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.LeadGenTrustSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.W3g  reason: case insensitive filesystem */
public final class C18809W3g {
    public static final C18809W3g A00 = new Object();

    public static final C15027UKg A00(C18027Vk5 vk5) {
        Integer num;
        C45385CvR cvR = vk5.A00.A03;
        if (cvR == null) {
            return null;
        }
        String str = vk5.A00().A01;
        ImageUrl imageUrl = vk5.A00().A00;
        String str2 = cvR.A03;
        if (str2 == null) {
            str2 = "";
        }
        C266444Yx A01 = W33.A01(str2);
        List A0a = 00k.A0a(cvR.A00);
        if (cvR.A02 == C16643Uyf.LIST_STYLE) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        return new C15027UKg(A01, imageUrl, (ImageUrl) null, num, str, A0a, 0, 0, false);
    }

    public static final String A02(Bundle bundle) {
        C16534Uwe uwe;
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString(Pxd.A00(216));
        if (string == null || string.length() == 0) {
            String string2 = bundle.getString(Pxd.A00(217));
            if (string2 == null || string2.length() == 0) {
                return null;
            }
            uwe = C16534Uwe.SHORT_ANSWER;
        } else {
            uwe = C16534Uwe.MULTIPLE_CHOICE;
        }
        return uwe.toString();
    }

    public static final boolean A05(C18027Vk5 vk5) {
        C16595Uxp uxp;
        C249803kO A0J = C66580MXl.A0J(vk5.A01().A00);
        while (A0J.hasNext()) {
            C17740Vd9 vd9 = (C17740Vd9) A0J.next();
            C16676UzC uzC = vd9.A0B;
            C16595Uxp[] values = C16595Uxp.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    uxp = C16595Uxp.A0X;
                    break;
                }
                uxp = values[i];
                if (uxp.A00 == uzC) {
                    break;
                }
                i++;
            }
            if (uxp == C16595Uxp.A06 && vd9.A0D == C16662Uyy.CONDITIONAL_ANSWER) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        r0 = r0.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x0029
            com.instagram.leadgen.core.model.LeadGenTrustSignal r0 = r3.A02
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x002a
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x002a
            int r1 = r0.intValue()
        L_0x0015:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r0 = r3.A03
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0023
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0028
        L_0x0023:
            r0 = 50000(0xc350, float:7.0065E-41)
            if (r1 < r0) goto L_0x0029
        L_0x0028:
            r2 = 1
        L_0x0029:
            return r2
        L_0x002a:
            r1 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18809W3g.A09(com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload A0A(X.C17695VcQ r18) {
        /*
            r17 = this;
            r8 = 0
            r3 = r18
            if (r18 == 0) goto L_0x00d5
            X.UyO r0 = r3.A09
            if (r0 == 0) goto L_0x00f8
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x00f4
            r0 = 2
            if (r1 != r0) goto L_0x00f8
            java.lang.Integer r14 = X.AnonymousClass05K.A00
        L_0x0015:
            X.Uy7 r4 = X.C16611Uy7.A06
            X.VSN r2 = r3.A01
            if (r2 == 0) goto L_0x00f0
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r2.A01
        L_0x0023:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r9 = A01(r4, r1, r0)
            X.Uy7 r4 = X.C16611Uy7.A08
            X.VSP r2 = r3.A03
            if (r2 == 0) goto L_0x00ec
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r2.A01
        L_0x0035:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r10 = A01(r4, r1, r0)
            X.Uy7 r4 = X.C16611Uy7.A0D
            X.VSU r2 = r3.A08
            if (r2 == 0) goto L_0x00e8
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r2.A01
        L_0x0047:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r6 = A01(r4, r1, r0)
            X.Uy7 r4 = X.C16611Uy7.A0C
            X.VST r2 = r3.A07
            if (r2 == 0) goto L_0x00e4
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r2.A01
        L_0x0059:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r5 = A01(r4, r1, r0)
            X.Uy7 r4 = X.C16611Uy7.A05
            X.VSM r2 = r3.A00
            if (r2 == 0) goto L_0x00e1
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r2.A01
        L_0x006b:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r11 = A01(r4, r1, r0)
            X.Uy7 r4 = X.C16611Uy7.A0A
            X.VSR r2 = r3.A05
            if (r2 == 0) goto L_0x00de
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r2.A01
        L_0x007d:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r4 = A01(r4, r1, r0)
            X.Uy7 r7 = X.C16611Uy7.A07
            X.VSO r2 = r3.A02
            if (r2 == 0) goto L_0x00db
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r2.A01
        L_0x008f:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r12 = A01(r7, r1, r0)
            X.Uy7 r7 = X.C16611Uy7.A09
            X.VSQ r2 = r3.A04
            if (r2 == 0) goto L_0x00d8
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r2.A01
        L_0x00a1:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r13 = A01(r7, r1, r0)
            X.Uy7 r2 = X.C16611Uy7.A0B
            X.VSS r1 = r3.A06
            if (r1 == 0) goto L_0x00d6
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r8 = r1.A01
        L_0x00b3:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r0 = A01(r2, r0, r8)
            com.instagram.leadgen.core.model.LeadGenTrustSignal[] r1 = new com.instagram.leadgen.core.model.LeadGenTrustSignal[]{r4, r6, r5, r0}
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r2 = X.03t.A0I(r1)
            r1 = 10
            X.WqD r0 = new X.WqD
            r0.<init>(r1)
            java.util.List r16 = X.00k.A0g(r2, r0)
            java.lang.String r15 = r3.A0A
            com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r8 = new com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00d5:
            return r8
        L_0x00d6:
            r0 = r8
            goto L_0x00b3
        L_0x00d8:
            r1 = r8
            r0 = r8
            goto L_0x00a1
        L_0x00db:
            r1 = r8
            r0 = r8
            goto L_0x008f
        L_0x00de:
            r1 = r8
            r0 = r8
            goto L_0x007d
        L_0x00e1:
            r1 = r8
            r0 = r8
            goto L_0x006b
        L_0x00e4:
            r1 = r8
            r0 = r8
            goto L_0x0059
        L_0x00e8:
            r1 = r8
            r0 = r8
            goto L_0x0047
        L_0x00ec:
            r1 = r8
            r0 = r8
            goto L_0x0035
        L_0x00f0:
            r1 = r8
            r0 = r8
            goto L_0x0023
        L_0x00f4:
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            goto L_0x0015
        L_0x00f8:
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18809W3g.A0A(X.VcQ):com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload");
    }

    public static final LeadGenTrustSignal A01(C16611Uy7 uy7, Integer num, String str) {
        if (num != null) {
            return new LeadGenTrustSignal(uy7, str, num.intValue());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0165, code lost:
        if (X.C51966G9m.A1X(r8) != true) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0187, code lost:
        if (r47 == false) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A03(com.instagram.common.session.UserSession r44, java.util.List r45, boolean r46, boolean r47, boolean r48) {
        /*
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r45 == 0) goto L_0x01c7
            java.util.Iterator r15 = r45.iterator()
        L_0x000b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01c7
            java.lang.Object r2 = r15.next()
            X.Vd9 r2 = (X.C17740Vd9) r2
            X.Uyy r1 = r2.A0D
            X.Uyy r0 = X.C16662Uyy.CONDITIONAL_ANSWER
            r24 = 0
            r9 = 0
            r7 = 1
            if (r1 == r0) goto L_0x0047
            X.UzC r10 = r2.A0B
            X.Uxp[] r5 = X.C16595Uxp.values()
            int r3 = r5.length
            r1 = 0
        L_0x0029:
            if (r1 >= r3) goto L_0x0034
            r4 = r5[r1]
            X.UzC r0 = r4.A00
            if (r0 == r10) goto L_0x0036
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0034:
            X.Uxp r4 = X.C16595Uxp.A0X
        L_0x0036:
            X.Uxp[] r8 = X.C16595Uxp.values()
            int r5 = r8.length
            r3 = 0
        L_0x003c:
            if (r3 >= r5) goto L_0x00db
            r1 = r8[r3]
            X.UzC r0 = r1.A00
            if (r0 == r10) goto L_0x00dd
            int r3 = r3 + 1
            goto L_0x003c
        L_0x0047:
            java.lang.String r4 = r2.A0G
            if (r4 == 0) goto L_0x00d7
            java.lang.String r3 = r2.A0F
            if (r3 == 0) goto L_0x00d7
            java.lang.String r10 = r2.A0E
            X.Uxp r23 = X.C16595Uxp.A06
            com.google.common.collect.ImmutableList r1 = r2.A02
            if (r1 != 0) goto L_0x0059
            X.0sn r1 = X.0sn.A00
        L_0x0059:
            java.lang.String r8 = r2.A05
            X.Uyg r0 = r2.A0C
            if (r0 == 0) goto L_0x00d4
            java.lang.String r30 = r0.toString()
        L_0x0063:
            com.google.common.collect.ImmutableList r5 = r2.A09
            java.util.Map r38 = A04(r5)
            java.lang.String r28 = ""
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r22 = new com.instagram.leadgen.core.model.LeadGenFormBaseQuestion
            r25 = r10
            r26 = r4
            r27 = r3
            r29 = r8
            r31 = r24
            r32 = r24
            r33 = r24
            r34 = r1
            r35 = r24
            r36 = r24
            r37 = r24
            r39 = r9
            r40 = r9
            r41 = r9
            r42 = r9
            r43 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion[] r1 = new com.instagram.leadgen.core.model.LeadGenFormBaseQuestion[]{r22}
            java.util.ArrayList r3 = X.0sr.A1M(r1)
            com.google.common.collect.ImmutableList r1 = r2.A0A
            if (r1 == 0) goto L_0x01c2
            java.util.Iterator r5 = r1.iterator()
        L_0x00a0:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x01c2
            java.lang.Object r1 = r5.next()
            X.VSm r1 = (X.C17359VSm) r1
            java.lang.String r4 = r1.A01
            if (r4 == 0) goto L_0x00a0
            java.lang.String r2 = r1.A00
            if (r2 == 0) goto L_0x00a0
            X.0sn r34 = X.0sn.A00
            if (r0 == 0) goto L_0x00d1
            java.lang.String r30 = r0.toString()
        L_0x00bc:
            X.0sm r38 = X.0Yt.A0E()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = new com.instagram.leadgen.core.model.LeadGenFormBaseQuestion
            r22 = r1
            r26 = r4
            r27 = r2
            r41 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r3.add(r1)
            goto L_0x00a0
        L_0x00d1:
            r30 = r24
            goto L_0x00bc
        L_0x00d4:
            r30 = r24
            goto L_0x0063
        L_0x00d7:
            X.0sn r3 = X.0sn.A00
            goto L_0x01c2
        L_0x00db:
            X.Uxp r1 = X.C16595Uxp.A0X
        L_0x00dd:
            java.lang.String r5 = ""
            if (r48 == 0) goto L_0x00eb
            java.util.List r0 = r2.A0I
            java.lang.Object r3 = X.00k.A0J(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x00f8
        L_0x00eb:
            com.google.common.collect.ImmutableList r0 = r2.A02
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r3 = X.00k.A0J(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x00f8
        L_0x00f7:
            r3 = r5
        L_0x00f8:
            X.Uxp r0 = X.C16595Uxp.A0O
            if (r1 == r0) goto L_0x0104
            X.Uxp r0 = X.C16595Uxp.A0B
            if (r1 == r0) goto L_0x0104
            X.Uxp r0 = X.C16595Uxp.A0L
            if (r1 != r0) goto L_0x0137
        L_0x0104:
            boolean r0 = X.0mp.A0A(r3)
            if (r0 == 0) goto L_0x0137
            if (r44 == 0) goto L_0x0137
            r0 = r46 ^ 1
            if (r0 == 0) goto L_0x0137
            if (r3 == 0) goto L_0x0133
            X.0eM r0 = X.0mp.A09
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            java.lang.String r8 = r0.pattern()
            X.0qQ.A07(r8)
            X.Nmz r1 = X.C69517Nmz.IGNORE_CASE
            X.11S r0 = new X.11S
            r0.<init>(r8, r1)
            java.lang.String r0 = r0.A00(r3, r5)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0133
            r5 = r0
        L_0x0133:
            java.lang.String r3 = X.DbV.A12(r5)
        L_0x0137:
            java.lang.String r5 = r2.A0G
            if (r5 == 0) goto L_0x00d7
            java.lang.String r1 = r2.A0F
            if (r1 == 0) goto L_0x00d7
            boolean r0 = r2.A0J
            r37 = r0 ^ 1
            java.lang.String r14 = r2.A0E
            com.google.common.collect.ImmutableList r0 = r2.A01
            if (r0 != 0) goto L_0x014b
            X.0sn r0 = X.0sn.A00
        L_0x014b:
            com.google.common.collect.ImmutableList r13 = r2.A00
            com.google.common.collect.ImmutableList r8 = r2.A02
            if (r8 == 0) goto L_0x0167
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L_0x0167
            java.lang.Object r8 = X.00k.A0O(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0167
            boolean r8 = X.C51966G9m.A1X(r8)
            r36 = 1
            if (r8 == r7) goto L_0x0169
        L_0x0167:
            r36 = 0
        L_0x0169:
            java.lang.String r12 = r2.A05
            X.Uyg r7 = r2.A0C
            if (r7 == 0) goto L_0x0173
            java.lang.String r24 = r7.toString()
        L_0x0173:
            java.text.SimpleDateFormat r7 = X.W33.A04
            X.Uxp r7 = X.C16595Uxp.A0P
            if (r4 == r7) goto L_0x0185
            X.Uxp r7 = X.C16595Uxp.A0a
            if (r4 == r7) goto L_0x0185
            X.Uxp r7 = X.C16595Uxp.A0Z
            if (r4 == r7) goto L_0x0185
            X.Uxp r7 = X.C16595Uxp.A0Q
            if (r4 != r7) goto L_0x0189
        L_0x0185:
            r34 = 1
            if (r47 != 0) goto L_0x018b
        L_0x0189:
            r34 = 0
        L_0x018b:
            com.google.common.collect.ImmutableList r11 = r2.A04
            java.lang.String r10 = r2.A06
            int r8 = r2.A08
            java.lang.String r7 = r2.A0H
            com.google.common.collect.ImmutableList r2 = r2.A03
            r18 = 0
            X.0sm r32 = X.0Yt.A0E()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r16 = new com.instagram.leadgen.core.model.LeadGenFormBaseQuestion
            r23 = r12
            r25 = r10
            r26 = r18
            r27 = r7
            r28 = r0
            r29 = r13
            r30 = r11
            r31 = r2
            r33 = r8
            r35 = r9
            r20 = r5
            r21 = r1
            r22 = r3
            r19 = r14
            r17 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            java.util.List r3 = X.AnonymousClass7TE.A1I(r16)
        L_0x01c2:
            r6.addAll(r3)
            goto L_0x000b
        L_0x01c7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18809W3g.A03(com.instagram.common.session.UserSession, java.util.List, boolean, boolean, boolean):java.util.ArrayList");
    }

    public static final Map A04(List list) {
        ArrayList arrayList;
        if (list == null || list.isEmpty()) {
            return 0Yt.A0E();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17358VSl vSl = (C17358VSl) it.next();
            String str = vSl.A01;
            if (str != null) {
                ImmutableList immutableList = vSl.A00;
                if (immutableList != null) {
                    arrayList = AnonymousClass7TG.A0r(immutableList);
                    Iterator it2 = immutableList.iterator();
                    while (it2.hasNext()) {
                        String str2 = ((C17358VSl) it2.next()).A01;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList.add(str2);
                    }
                } else {
                    arrayList = 0sn.A00;
                }
                linkedHashMap.put(str, new LeadGenConditionalAnswerInfo(arrayList, A04(immutableList)));
            }
        }
        return linkedHashMap;
    }

    public static final boolean A06(C18027Vk5 vk5) {
        LeadGenFormBaseQuestion leadGenFormBaseQuestion;
        List list;
        if (vk5 == null || (leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) 00k.A0O(A03((UserSession) null, vk5.A01().A00, false, false, false), 0)) == null || (list = leadGenFormBaseQuestion.A0C) == null || list.isEmpty() || vk5.A00.A07 == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A07(X.C18027Vk5 r4) {
        /*
            X.Cuu r0 = r4.A01()
            com.google.common.collect.ImmutableList r0 = r0.A00
            r4 = 1
            if (r0 == 0) goto L_0x0027
            java.util.Iterator r3 = r0.iterator()
        L_0x000d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Vd9 r0 = (X.C17740Vd9) r0
            X.UzC r1 = r0.A0B
            X.UzC r0 = X.C16676UzC.STORE_LOOKUP
            if (r1 == r0) goto L_0x0024
            X.UzC r0 = X.C16676UzC.STORE_LOOKUP_WITH_TYPEAHEAD
            if (r1 != r0) goto L_0x000d
        L_0x0024:
            if (r2 == 0) goto L_0x0027
            return r4
        L_0x0027:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18809W3g.A07(X.Vk5):boolean");
    }

    public static final boolean A08(C18027Vk5 vk5, boolean z) {
        if (A06(vk5) || vk5.A02()) {
            return true;
        }
        C45433CwD cwD = vk5.A00;
        if (cwD.A00 != null || A05(vk5) || A07(vk5)) {
            return true;
        }
        Iterator it = vk5.A01().A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C17740Vd9) next).A0B == C16676UzC.DATE_TIME) {
                if (next != null) {
                    return true;
                }
            }
        }
        if (cwD.A0A != null || z) {
            return true;
        }
        C249803kO A0J = C66580MXl.A0J(vk5.A01().A00);
        while (A0J.hasNext()) {
            C17740Vd9 vd9 = (C17740Vd9) A0J.next();
            0qQ.A0A(vd9);
            ImmutableList immutableList = vd9.A03;
            if (immutableList != null && !immutableList.isEmpty() && vd9.A0H != null && vd9.A08 > 0) {
                return true;
            }
        }
        return false;
    }
}
