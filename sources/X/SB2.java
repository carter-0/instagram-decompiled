package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

public abstract class SB2 {
    public static final Map A00 = 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("NAME_FULL", PublicKeyCredentialControllerUtility.JSON_KEY_NAME), AnonymousClass7TE.A1L("NAME_FIRST", "given-name"), AnonymousClass7TE.A1L("NAME_LAST", "family-name"), AnonymousClass7TE.A1L("EMAIL_ADDRESS", "email"), AnonymousClass7TE.A1L("ADDRESS_HOME_LINE1", "address-line1"), AnonymousClass7TE.A1L("ADDRESS_HOME_LINE2", "address-line2"), AnonymousClass7TE.A1L("ADDRESS_HOME_STATE", "address-level1"), AnonymousClass7TE.A1L("ADDRESS_HOME_CITY", "address-level2"), AnonymousClass7TE.A1L("ADDRESS_HOME_ZIP", "postal-code"), AnonymousClass7TE.A1L("PHONE_HOME_WHOLE_NUMBER", "tel"), AnonymousClass7TE.A1L("CREDIT_CARD_NAME_FULL", "cc-name"), AnonymousClass7TE.A1L("CREDIT_CARD_NUMBER", "cc-number"), AnonymousClass7TE.A1L("CREDIT_CARD_EXP_MONTH", "cc-exp-month"), AnonymousClass7TE.A1L("CREDIT_CARD_EXP_DATE_2_DIGIT_YEAR", "cc-exp-year"), AnonymousClass7TE.A1L("CREDIT_CARD_EXP_4_DIGIT_YEAR", "cc-exp-year"), AnonymousClass7TE.A1L("CREDIT_CARD_VERIFICATION_CODE", "cc-csc")});

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0293, code lost:
        if (X.Pxh.A1X(r0, r12) != false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010e, code lost:
        if (X.SDK.A09.contains(r5) != false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r5 != null) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0121 A[EDGE_INSN: B:271:0x0121->B:71:0x0121 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.Q8n r15, X.1yd r16, java.util.Set r17, java.util.Set r18) {
        /*
            r3 = r15
            r2 = r16
            r4 = r17
            X.AnonymousClass7TG.A1T(r15, r4, r2)
            java.lang.String[] r7 = r15.A09
            if (r7 == 0) goto L_0x0020
            int r6 = r7.length
            if (r6 == 0) goto L_0x0020
            r1 = 0
        L_0x0010:
            r5 = r7[r1]
            boolean r0 = r4.contains(r5)
            if (r0 == 0) goto L_0x001b
            if (r5 == 0) goto L_0x0020
        L_0x001a:
            return r5
        L_0x001b:
            int r1 = r1 + 1
            if (r1 >= r6) goto L_0x0020
            goto L_0x0010
        L_0x0020:
            java.lang.CharSequence r0 = r15.A05
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = X.Pxj.A0s(r0)
            java.lang.String r0 = "MM/YY"
            boolean r0 = r0.equals(r1)
            java.lang.String r5 = "cc-exp"
            if (r0 == 0) goto L_0x003d
            boolean r0 = r4.contains(r5)
            if (r0 == 0) goto L_0x003d
            return r5
        L_0x003d:
            android.view.ViewStructure$HtmlInfo r0 = r15.A03
            r8 = 0
            if (r0 == 0) goto L_0x00c5
            java.util.List r7 = r0.getAttributes()
            if (r7 == 0) goto L_0x00c5
            java.util.Iterator r6 = r7.iterator()
        L_0x004c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r5 = r6.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r1 = r5.first
            java.lang.String r0 = "label"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r5.second
            java.lang.String r0 = (java.lang.String) r0
            X.0qQ.A0A(r0)
            java.lang.String r1 = X.Pxj.A0s(r0)
            java.lang.String r0 = "MM/YY"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            java.lang.String r5 = "cc-exp"
            boolean r0 = r4.contains(r5)
            if (r0 == 0) goto L_0x004c
        L_0x007d:
            if (r5 == 0) goto L_0x00c5
            return r5
        L_0x0080:
            java.util.Iterator r7 = r7.iterator()
        L_0x0084:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r6 = r7.next()
            r5 = r6
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r1 = r5.first
            java.lang.String r0 = "ua-autofill-hints"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r5.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0084
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0084
            java.util.Map r1 = A00
            java.lang.Object r0 = r5.second
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = X.00k.A0u(r4, r0)
            if (r0 == 0) goto L_0x0084
        L_0x00b6:
            android.util.Pair r6 = (android.util.Pair) r6
            if (r6 == 0) goto L_0x00c5
            java.util.Map r1 = A00
            java.lang.Object r0 = r6.second
            java.lang.String r5 = X.DbU.A0r(r0, r1)
            goto L_0x007d
        L_0x00c3:
            r6 = r8
            goto L_0x00b6
        L_0x00c5:
            com.instagram.common.session.UserSession r5 = r2.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36873380867276812(0x8300250043000c, double:3.382212765428444E-306)
            java.lang.String r1 = X.Pxe.A0w(r4, r5, r0)
            int r0 = r1.length()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.String r6 = "V1"
            if (r0 != 0) goto L_0x00ec
            java.lang.String r5 = X.DbV.A12(r1)
            java.lang.String r4 = "ML"
            if (r5 != 0) goto L_0x0379
            r0 = 0
        L_0x00e7:
            java.lang.String r1 = "V1_ML"
            if (r0 == 0) goto L_0x036e
            r6 = r4
        L_0x00ec:
            java.lang.String r0 = "ML"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0110
            java.lang.String r0 = "V1_ML"
            boolean r0 = r6.equals(r0)
            java.lang.String r5 = X.STI.A00(r15, r2)
            if (r0 == 0) goto L_0x001a
            if (r5 == 0) goto L_0x0110
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0110
            java.util.Set r0 = X.SDK.A09
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x001a
        L_0x0110:
            X.0eM r0 = X.STI.A0C
            android.view.ViewStructure$HtmlInfo r0 = r15.A03
            r5 = 0
            if (r0 == 0) goto L_0x011d
            java.util.List r0 = r0.getAttributes()
            if (r0 != 0) goto L_0x0131
        L_0x011d:
            java.lang.CharSequence r0 = r15.A05
            if (r0 != 0) goto L_0x0131
        L_0x0121:
            r1 = r18
            if (r18 == 0) goto L_0x001a
            if (r5 == 0) goto L_0x001a
            int r0 = r5.length()
            if (r0 == 0) goto L_0x001a
            r1.add(r5)
            return r5
        L_0x0131:
            java.lang.String r11 = "html_input_name"
            java.lang.String r6 = ""
            X.0eP r2 = X.AnonymousClass7TE.A1L(r11, r6)
            java.lang.String r10 = "html_input_id"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r10, r6)
            java.lang.String r9 = "html_placeholder"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r9, r6)
            java.lang.String r8 = "html_label"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r8, r6, r2, r1, r0)
            java.util.LinkedHashMap r7 = X.0Yt.A07(r0)
            java.lang.CharSequence r0 = r15.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.DbV.A12(r0)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = X.DbT.A12(r1, r0)
            java.lang.String r0 = X.STI.A02(r0)
            r7.put(r9, r0)
            X.0eP r4 = X.AnonymousClass7TE.A1L(r11, r6)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r10, r6)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r9, r6)
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r8, r6, r4, r2, r0)
            java.util.LinkedHashMap r2 = X.0Yt.A07(r0)
            java.lang.CharSequence r0 = r15.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.DbV.A12(r0)
            java.lang.String r0 = X.DbT.A12(r1, r0)
            r2.put(r9, r0)
            android.view.ViewStructure$HtmlInfo r0 = r15.A03
            if (r0 == 0) goto L_0x023c
            java.util.List r0 = r0.getAttributes()
            if (r0 == 0) goto L_0x023c
            java.util.Iterator r13 = r0.iterator()
            if (r13 == 0) goto L_0x023c
        L_0x019b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x023c
            java.lang.Object r4 = r13.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r6 = r4.first
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x019b
            int r12 = r6.hashCode()
            r0 = 3355(0xd1b, float:4.701E-42)
            if (r12 == r0) goto L_0x0212
            r0 = 3373707(0x337a8b, float:4.72757E-39)
            if (r12 == r0) goto L_0x01e8
            r0 = 102727412(0x61f7ef4, float:2.9997847E-35)
            if (r12 != r0) goto L_0x019b
            java.lang.String r0 = "label"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x019b
            java.lang.Object r0 = r4.second
            X.0qQ.A06(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.DbV.A12(r0)
            java.lang.String r0 = X.DbT.A12(r1, r0)
            r2.put(r8, r0)
            java.lang.Object r0 = r4.second
            X.0qQ.A06(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.STI.A02(r0)
            r7.put(r8, r0)
            goto L_0x019b
        L_0x01e8:
            java.lang.String r0 = "name"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x019b
            java.lang.Object r0 = r4.second
            X.0qQ.A06(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.DbV.A12(r0)
            java.lang.String r0 = X.DbT.A12(r1, r0)
            r2.put(r11, r0)
            java.lang.Object r0 = r4.second
            X.0qQ.A06(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.STI.A02(r0)
            r7.put(r11, r0)
            goto L_0x019b
        L_0x0212:
            java.lang.String r0 = "id"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x019b
            java.lang.Object r0 = r4.second
            X.0qQ.A06(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.DbV.A12(r0)
            java.lang.String r0 = X.DbT.A12(r1, r0)
            r2.put(r10, r0)
            java.lang.Object r0 = r4.second
            X.0qQ.A06(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.STI.A02(r0)
            r7.put(r10, r0)
            goto L_0x019b
        L_0x023c:
            X.0eM r17 = X.STI.A08
            java.lang.Object r0 = r17.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r6 = "cc-number"
            java.lang.Object r12 = r0.get(r6)
            java.lang.String r16 = "Required value was null."
            if (r12 == 0) goto L_0x03d9
            X.11S r12 = (X.11S) r12
            X.0eM r4 = X.STI.A07
            java.lang.Object r1 = X.Pxj.A0m(r6, r4)
            if (r1 == 0) goto L_0x03d4
            X.11S r1 = (X.11S) r1
            java.lang.Object r0 = r2.get(r11)
            if (r0 == 0) goto L_0x03cf
            boolean r0 = X.Pxh.A1X(r0, r12)
            if (r0 != 0) goto L_0x0295
            java.lang.Object r0 = r2.get(r10)
            if (r0 == 0) goto L_0x03ca
            boolean r0 = X.Pxh.A1X(r0, r12)
            if (r0 != 0) goto L_0x0295
            java.lang.Object r0 = r2.get(r9)
            if (r0 == 0) goto L_0x03c5
            boolean r0 = X.Pxh.A1X(r0, r12)
            if (r0 != 0) goto L_0x0295
            int r13 = r15.A00
            r0 = 1
            if (r13 == r0) goto L_0x0289
            r0 = 3
            if (r13 == r0) goto L_0x0289
            r0 = 4
            if (r13 != r0) goto L_0x02c6
        L_0x0289:
            java.lang.Object r0 = r2.get(r8)
            if (r0 == 0) goto L_0x03c0
            boolean r0 = X.Pxh.A1X(r0, r12)
            if (r0 == 0) goto L_0x02c6
        L_0x0295:
            java.lang.Object r0 = r2.get(r11)
            if (r0 == 0) goto L_0x03bb
            boolean r0 = X.Pxh.A1X(r0, r1)
            if (r0 != 0) goto L_0x02c6
            java.lang.Object r0 = r2.get(r10)
            if (r0 == 0) goto L_0x03b6
            boolean r0 = X.Pxh.A1X(r0, r1)
            if (r0 != 0) goto L_0x02c6
            java.lang.Object r0 = r2.get(r9)
            if (r0 == 0) goto L_0x03b1
            boolean r0 = X.Pxh.A1X(r0, r1)
            if (r0 != 0) goto L_0x02c6
            java.lang.Object r0 = r2.get(r8)
            if (r0 == 0) goto L_0x03ac
            boolean r0 = X.Pxh.A1X(r0, r1)
            if (r0 != 0) goto L_0x02c6
            r5 = r6
        L_0x02c6:
            r2 = 1
            if (r5 == 0) goto L_0x02cf
            int r0 = r5.length()
            if (r0 != 0) goto L_0x0121
        L_0x02cf:
            java.lang.Object r0 = r17.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r15 = X.DbV.A16(r0)
        L_0x02d9:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0121
            java.lang.String r1 = X.AnonymousClass7TE.A18(r15)
            boolean r0 = X.0qQ.A0K(r1, r6)
            if (r0 != 0) goto L_0x02d9
            java.lang.Object r0 = r17.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r13 = r0.get(r1)
            if (r13 == 0) goto L_0x03a7
            X.11S r13 = (X.11S) r13
            java.lang.Object r12 = X.Pxj.A0m(r1, r4)
            X.11S r12 = (X.11S) r12
            java.lang.Object r0 = r7.get(r11)
            if (r0 == 0) goto L_0x03a2
            boolean r0 = X.Pxh.A1X(r0, r13)
            if (r0 != 0) goto L_0x0337
            java.lang.Object r0 = r7.get(r10)
            if (r0 == 0) goto L_0x039d
            boolean r0 = X.Pxh.A1X(r0, r13)
            if (r0 != 0) goto L_0x0337
            java.lang.Object r0 = r7.get(r9)
            if (r0 == 0) goto L_0x0398
            boolean r0 = X.Pxh.A1X(r0, r13)
            if (r0 != 0) goto L_0x0337
            int r14 = r3.A00
            if (r14 == r2) goto L_0x032b
            r0 = 3
            if (r14 == r0) goto L_0x032b
            r0 = 4
            if (r14 != r0) goto L_0x02d9
        L_0x032b:
            java.lang.Object r0 = r7.get(r8)
            if (r0 == 0) goto L_0x0393
            boolean r0 = X.Pxh.A1X(r0, r13)
            if (r0 == 0) goto L_0x02d9
        L_0x0337:
            if (r12 == 0) goto L_0x036b
            java.lang.Object r0 = r7.get(r11)
            if (r0 == 0) goto L_0x038e
            boolean r0 = X.Pxh.A1X(r0, r12)
            if (r0 == r2) goto L_0x02d9
            java.lang.Object r0 = r7.get(r10)
            if (r0 == 0) goto L_0x0389
            boolean r0 = X.Pxh.A1X(r0, r12)
            if (r0 == r2) goto L_0x02d9
            java.lang.Object r0 = r7.get(r9)
            if (r0 == 0) goto L_0x0384
            boolean r0 = X.Pxh.A1X(r0, r12)
            if (r0 == r2) goto L_0x02d9
            java.lang.Object r0 = r7.get(r8)
            if (r0 == 0) goto L_0x037f
            boolean r0 = X.Pxh.A1X(r0, r12)
            if (r0 != r2) goto L_0x036b
            goto L_0x02d9
        L_0x036b:
            r5 = r1
            goto L_0x0121
        L_0x036e:
            if (r5 == 0) goto L_0x00ec
            boolean r0 = r5.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00ec
            r6 = r1
            goto L_0x00ec
        L_0x0379:
            boolean r0 = r5.equalsIgnoreCase(r4)
            goto L_0x00e7
        L_0x037f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0384:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0389:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x038e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0393:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0398:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x039d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x03d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SB2.A00(X.Q8n, X.1yd, java.util.Set, java.util.Set):java.lang.String");
    }
}
