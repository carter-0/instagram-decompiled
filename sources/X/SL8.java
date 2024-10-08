package X;

import android.view.autofill.AutofillValue;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public abstract class SL8 {
    public static final Set A00;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(C66580MXl.A12(0sr.A1M(new String[]{"https://checkout.us.shopifycs.com/", "https://checkout.shopifycs.com/"})));
        0qQ.A07(unmodifiableSet);
        A00 = unmodifiableSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0106, code lost:
        if (r1.equals(r3) == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010e, code lost:
        if (r2 == r3.intValue()) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018e, code lost:
        r4 = android.view.autofill.AutofillValue.forList(r5);
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.util.SparseArray A00(X.Q8n r17, X.1yd r18, java.util.Map r19, java.util.Set r20, java.util.Set r21) {
        /*
            r12 = r18
            r11 = r20
            r10 = r21
            X.C51974G9v.A1M(r11, r10, r12)
            android.util.SparseArray r9 = X.Pxe.A0L()
            r1 = r17
            if (r17 == 0) goto L_0x01a9
            r21 = r19
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x01a9
            java.util.List r0 = r1.A0A
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.ArrayList r4 = X.DbV.A15(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x0027:
            boolean r0 = r13.hasNext()
            r14 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.Object r5 = r13.next()
            r1 = r5
            X.Q8n r1 = (X.Q8n) r1
            X.0qQ.A0A(r1)
            java.lang.String r7 = X.SB2.A00(r1, r12, r11, r14)
            android.view.autofill.AutofillValue r6 = r1.A04
            r0 = r21
            java.lang.Object r8 = r0.get(r7)
            int r0 = r1.A02
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 != 0) goto L_0x005b
            com.instagram.common.session.UserSession r3 = r12.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322860549352032(0x810b7300452a60, double:3.0340614996054237E-306)
            boolean r0 = X.DbY.A1Z(r2, r3, r0)
            if (r0 != 0) goto L_0x0027
        L_0x005b:
            if (r7 == 0) goto L_0x0027
            r0 = r21
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x0027
            if (r8 == 0) goto L_0x0027
            if (r6 == 0) goto L_0x0027
            r4.add(r5)
            goto L_0x0027
        L_0x006d:
            java.util.ArrayList r20 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r19 = r4.iterator()
        L_0x0075:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r13 = r19.next()
            X.Q8n r13 = (X.Q8n) r13
            X.0qQ.A0A(r13)
            java.lang.String r8 = X.SB2.A00(r13, r12, r11, r14)
            android.view.autofill.AutofillValue r1 = r13.A04
            if (r8 == 0) goto L_0x01a4
            r0 = r21
            java.lang.String r15 = X.DbU.A0r(r8, r0)
            r4 = 0
            if (r1 == 0) goto L_0x0192
            if (r15 == 0) goto L_0x0192
            boolean r0 = r1.isList()
            if (r0 == 0) goto L_0x016f
            int r0 = r1.getListValue()
            java.lang.CharSequence[] r7 = r13.A08
            if (r7 == 0) goto L_0x0192
            int r6 = r7.length
            if (r0 >= r6) goto L_0x0192
            r0 = r7[r0]
            r5 = 0
            if (r0 != 0) goto L_0x00b5
            X.0qQ.A04(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b5:
            boolean r0 = r10.contains(r8)
            if (r0 == 0) goto L_0x0192
        L_0x00bb:
            if (r5 >= r6) goto L_0x0192
            r0 = r7[r5]
            java.lang.String r3 = r0.toString()
            r16 = 1
            boolean r0 = r15.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x0110
            java.lang.String r0 = "cc-exp-month"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e2
            java.lang.Integer r0 = X.SPn.A01(r3)
            if (r0 == 0) goto L_0x016c
            int r2 = r0.intValue()
            java.lang.Integer r3 = X.Pxf.A0Z(r15)     // Catch:{ NumberFormatException -> 0x0169 }
            goto L_0x0108
        L_0x00e2:
            java.lang.String r0 = "cc-exp-year"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x016c
            int r2 = java.lang.Integer.parseInt(r15)     // Catch:{ NumberFormatException -> 0x016c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x016c }
            if (r1 == 0) goto L_0x016c
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r0) goto L_0x016c
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r2 > r0) goto L_0x016c
            int r2 = r2 % 100
            java.lang.Integer r3 = X.SPn.A01(r3)
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0110
        L_0x0108:
            if (r3 == 0) goto L_0x0169
            int r0 = r3.intValue()
            if (r2 != r0) goto L_0x0169
        L_0x0110:
            if (r16 != 0) goto L_0x018e
            r0 = r7[r5]
            java.lang.String r3 = r0.toString()
            r2 = 1
            boolean r0 = r15.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0126
            r18 = 1
        L_0x0121:
            if (r18 != 0) goto L_0x018e
            int r5 = r5 + 1
            goto L_0x00bb
        L_0x0126:
            java.lang.String r0 = "cc-exp-month"
            boolean r0 = r0.equals(r8)
            r18 = 0
            if (r0 == 0) goto L_0x0121
            int r1 = java.lang.Integer.parseInt(r15)     // Catch:{ NumberFormatException -> 0x0121 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0121 }
            if (r0 == 0) goto L_0x0121
            r0 = 12
            if (r1 > r0) goto L_0x0121
            if (r1 < r2) goto L_0x0121
            java.text.DateFormatSymbols r0 = new java.text.DateFormatSymbols     // Catch:{  }
            r0.<init>()     // Catch:{  }
            java.lang.String[] r17 = r0.getMonths()     // Catch:{  }
            java.lang.String[] r16 = r0.getShortMonths()     // Catch:{  }
            if (r17 == 0) goto L_0x0159
            int r0 = r1 - r2
            r0 = r17[r0]     // Catch:{  }
            boolean r0 = X.0qQ.A0K(r0, r3)     // Catch:{  }
            if (r0 != 0) goto L_0x0166
        L_0x0159:
            if (r16 == 0) goto L_0x0165
            int r1 = r1 - r2
            r0 = r16[r1]     // Catch:{  }
            boolean r0 = X.0qQ.A0K(r0, r3)     // Catch:{  }
            if (r0 == 0) goto L_0x0165
            goto L_0x0166
        L_0x0165:
            r2 = 0
        L_0x0166:
            r18 = r2
            goto L_0x0121
        L_0x0169:
            r16 = 0
            goto L_0x0110
        L_0x016c:
            r16 = 0
            goto L_0x0110
        L_0x016f:
            boolean r0 = r1.isText()
            if (r0 == 0) goto L_0x0192
            java.lang.CharSequence r0 = r1.getTextValue()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0189
            boolean r0 = r10.contains(r8)
            if (r0 == 0) goto L_0x0192
        L_0x0189:
            android.view.autofill.AutofillValue r4 = android.view.autofill.AutofillValue.forText(r15)
            goto L_0x0192
        L_0x018e:
            android.view.autofill.AutofillValue r4 = android.view.autofill.AutofillValue.forList(r5)
        L_0x0192:
            if (r4 == 0) goto L_0x01a2
            int r0 = r13.A01
            r9.put(r0, r4)
            X.0gF r1 = X.C60340gF.A00
        L_0x019b:
            r0 = r20
            r0.add(r1)
            goto L_0x0075
        L_0x01a2:
            r1 = r14
            goto L_0x019b
        L_0x01a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01a9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SL8.A00(X.Q8n, X.1yd, java.util.Map, java.util.Set, java.util.Set):android.util.SparseArray");
    }

    public static final LinkedHashMap A01(Q8n q8n, 1yd r8, Set set) {
        String A02;
        Object obj;
        Object obj2;
        Object obj3;
        String valueOf;
        String str;
        Object obj4;
        AnonymousClass7TG.A1O(set, r8);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (q8n != null) {
            Iterator A0h = JTQ.A0h(q8n.A0A);
            while (A0h.hasNext()) {
                Q8n q8n2 = (Q8n) A0h.next();
                AutofillValue autofillValue = q8n2.A04;
                String A002 = SB2.A00(q8n2, r8, set, (Set) null);
                if (!(A002 == null || autofillValue == null)) {
                    if (autofillValue.isText()) {
                        if (SDK.A0B.contains(A002) && (obj4 = SDK.A00.get(A002)) != null) {
                            A1H.put(obj4, autofillValue.getTextValue().toString());
                        }
                        CharSequence textValue = autofillValue.getTextValue();
                        0qQ.A07(textValue);
                        if (textValue.length() != 0) {
                            0eP A03 = SPn.A03(autofillValue.getTextValue().toString());
                            if (!(A03 == null || (obj2 = A03.A00) == null || (obj3 = A03.A01) == null)) {
                                if ("cc-exp".equals(A002)) {
                                    A1H.put("cc-exp-month", String.valueOf(AnonymousClass7TE.A0M(obj2)));
                                    valueOf = String.valueOf(obj3);
                                    str = "cc-exp-year";
                                } else if ("ml-cc-exp".equals(A002)) {
                                    A1H.put("ml-cc-exp-month", String.valueOf(AnonymousClass7TE.A0M(obj2)));
                                    valueOf = String.valueOf(obj3);
                                    str = "ml-cc-exp-year";
                                }
                                A1H.put(str, valueOf);
                            }
                            if (SPn.A02(A002, autofillValue.getTextValue().toString()) != null) {
                                A02 = autofillValue.getTextValue().toString();
                            }
                        }
                    } else if (autofillValue.isList()) {
                        int listValue = autofillValue.getListValue();
                        CharSequence[] charSequenceArr = q8n2.A08;
                        if (charSequenceArr != null && listValue < charSequenceArr.length) {
                            if (SDK.A0B.contains(A002) && (obj = SDK.A00.get(A002)) != null) {
                                A1H.put(obj, charSequenceArr[listValue].toString());
                            }
                            A02 = SPn.A02(A002, charSequenceArr[listValue].toString());
                            if (A02 == null) {
                                if ("cc-exp-month".equals(A002)) {
                                    if (listValue > 0) {
                                        if (listValue <= 12) {
                                            A02 = StringFormatUtil.formatStrLocaleSafe("%02d", Integer.valueOf(listValue));
                                            if (A02 == null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    A1H.put(A002, A02);
                }
            }
            String A0r = DbS.A0r("cc-number", A1H);
            if (00k.A0u(A00, q8n.A06) && A0r != null) {
                A1H.put("cc-number", RUM.A00(A0r));
            }
        }
        return A1H;
    }
}
