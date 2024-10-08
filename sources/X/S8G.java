package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewStructure;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import kotlin.enums.EnumEntries;

public abstract class S8G {
    public static final void A00(Context context, Bundle bundle, Q8n q8n, C270254gR r51, boolean z) {
        boolean z2;
        boolean z3;
        CharSequence charSequence;
        int length;
        QOv qOv;
        Set set;
        0sn A1C;
        int length2;
        Set set2 = SDK.A0A;
        0qQ.A08(set2);
        C270254gR r47 = r51;
        1yd r0 = r47.A04;
        1yd r45 = r0;
        Q8n q8n2 = q8n;
        1yd r1 = r0;
        LinkedHashMap A01 = SL8.A01(q8n2, r1, set2);
        Set set3 = SDK.A0F;
        0qQ.A08(set3);
        LinkedHashMap A04 = 0Yt.A04(SL8.A01(q8n2, r1, set3), A01);
        C10860RzL rzL = r47.A00;
        0qQ.A0B(rzL, 0);
        rzL.A03.A00 = A04;
        if (A04.containsKey("cc-exp") || (A04.containsKey("cc-exp-month") && A04.containsKey("cc-exp-year"))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!A04.containsKey("cc-number") || !z2 || !A04.containsKey("cc-csc")) {
            z3 = false;
        } else {
            z3 = C11391SRf.A03(C11391SRf.A01(DbS.A0r("cc-number", A04), DbS.A0r("cc-csc", A04), DbS.A0r("cc-exp", A04), DbS.A0r("cc-exp-month", A04), DbS.A0r("cc-exp-year", A04)));
        }
        1yd r3 = r45;
        0qQ.A0B(r3, 0);
        boolean z4 = z;
        if (RUU.A00(rzL, r3, z4) && (qOv = (QOv) rzL.A03.A01) != null && qOv.A00.size() < 100) {
            Map map = (Map) rzL.A05.A02;
            0qQ.A0B(map, 0);
            EnumEntries<C21243XQo> enumEntries = C21243XQo.A00;
            ArrayList A0r = AnonymousClass7TG.A0r(enumEntries);
            for (C21243XQo xQo : enumEntries) {
                long currentTimeMillis = System.currentTimeMillis();
                if (A04.isEmpty()) {
                    A1C = 0sn.A00;
                } else {
                    int ordinal = xQo.ordinal();
                    if (ordinal == 2) {
                        set = set2;
                    } else if (ordinal == 1) {
                        set = SDK.A03;
                    } else if (ordinal == 0) {
                        set = SDK.A08;
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    0qQ.A08(set);
                    A1C = AnonymousClass7TE.A1C();
                    for (Object next : set) {
                        String A11 = DbT.A11(next, map);
                        String A0r2 = DbS.A0r(next, A04);
                        if (!(A0r2 == null || A0r2.length() == 0)) {
                            if (A11 == null || (length2 = A11.length()) == 0 || (length2 > 0 && !A11.equals(A0r2))) {
                                A1C.add(next);
                            }
                        }
                    }
                }
                A0r.add(new C66709MbG(xQo, (List) A1C, currentTimeMillis));
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Object next2 : A0r) {
                if (((List) ((C66709MbG) next2).A03).size() >= 2) {
                    A1C2.add(next2);
                }
            }
            if (!A1C2.isEmpty()) {
                ArrayList A1D = AnonymousClass7TE.A1D(A1C2);
                A1D.addAll(qOv.A00);
                rzL.A03.A01 = new QOv(A1D, z3);
            }
        }
        rzL.A05.A01 = new C7607QOp(Pxf.A0i("cc-number", A01), Pxf.A0i("cc-csc", A01), Pxf.A0i("cc-exp-month", A01), Pxf.A0i("cc-exp-year", A01), Pxf.A0i("cc-exp", A01), 0);
        rzL.A05.A03 = new C7607QOp(Pxf.A0i("cc-number", A01), Pxf.A0i("ml-cc-csc", A01), Pxf.A0i("ml-cc-exp-month", A01), Pxf.A0i("ml-cc-exp-year", A01), Pxf.A0i("ml-cc-exp", A01), 0);
        rzL.A05.A04 = new C7607QOp(Pxf.A0i("raw-cc-number", A01), Pxf.A0i("raw-cc-csc", A01), Pxf.A0i("raw-cc-exp-month", A01), Pxf.A0i("raw-cc-exp-year", A01), Pxf.A0i("raw-cc-exp", A01), 0);
        QP6 qp6 = rzL.A05;
        String A0r3 = DbS.A0r("given-name", A01);
        String A0r4 = DbS.A0r("family-name", A01);
        String A0r5 = DbS.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A01);
        if ((A0r3 != null && A0r3.length() != 0) || (A0r4 != null && A0r4.length() != 0)) {
            String str = A0r3;
            String str2 = A0r4;
            if (A0r3 == null) {
                str = "";
            }
            if (A0r4 == null) {
                str2 = "";
            }
            A0r5 = DbV.A12(C66580MXl.A10(str, str2));
        } else if (!(A0r5 == null || (length = A0r5.length()) == 0)) {
            A0r3 = A0r5;
            int A05 = 00l.A05(A0r5, ' ', length - 1);
            if (A05 > 0) {
                A0r3 = C51967G9n.A0q(A0r5, 0, A05);
                A0r4 = C66580MXl.A0z(A0r5, A05 + 1);
            } else {
                A0r4 = null;
            }
        }
        qp6.A00 = new QOt(Pxf.A0i("email", A01), A0r3, A0r4, A0r5, Pxf.A0i("address-line1", A01), Pxf.A0i("address-line2", A01), Pxf.A0i("address-line3", A01), Pxf.A0i("address-level1", A01), Pxf.A0i("address-level2", A01), Pxf.A0i("address-level3", A01), Pxf.A0i("address-level4", A01), Pxf.A0i("postal-code", A01), Pxf.A0i("street-address", A01), Pxf.A0i("tel", A01), Pxf.A0i("tel-area-code", A01), Pxf.A0i("tel-country-code", A01), Pxf.A0i("tel-local", A01), Pxf.A0i("tel-local-prefix", A01), Pxf.A0i("tel-local-suffix", A01), Pxf.A0i("tel-national", A01), Pxf.A0i("country", A01), Pxf.A0i("country-name", A01), 1);
        QP6 qp62 = rzL.A05;
        String str3 = qp62.A05;
        String str4 = qp62.A06;
        QOt qOt = (QOt) qp62.A00;
        Map map2 = (Map) qp62.A02;
        0qQ.A0B(str3, 0);
        0qQ.A0B(map2, 6);
        rzL.A07 = new QP6(qOt, (C7607QOp) qp62.A01, (C7607QOp) qp62.A04, (C7607QOp) qp62.A03, str3, str4, map2);
        QP6 qp63 = rzL.A05;
        String str5 = qp63.A05;
        String str6 = qp63.A06;
        QOt qOt2 = (QOt) qp63.A00;
        Map map3 = (Map) qp63.A02;
        0qQ.A0B(str5, 0);
        0qQ.A0B(map3, 6);
        rzL.A04 = new QP6(qOt2, (C7607QOp) qp63.A01, (C7607QOp) qp63.A04, (C7607QOp) qp63.A03, str5, str6, map3);
        QP6 qp64 = rzL.A05;
        qp64.A02 = 0Yt.A04((Map) qp64.A02, A04);
        C11290SJq sJq = r47.A01;
        Context context2 = context;
        AnonymousClass7TF.A1C(context2, 0, sJq);
        if (RUU.A00(rzL, r45, z4)) {
            Map map4 = (Map) rzL.A05.A02;
            CharSequence charSequence2 = (CharSequence) map4.get("raw-cc-number");
            if ((charSequence2 != null && charSequence2.length() != 0) || ((charSequence = (CharSequence) map4.get("cc-number")) != null && charSequence.length() != 0)) {
                ((AutofillManager) context2.getSystemService(AutofillManager.class)).cancel();
                Bundle bundle2 = bundle;
                sJq.A01(bundle2, new C53388GnK((Long) null, (Map) null, 511), AnonymousClass05K.A0Y, "AUTOFILL_MANAGER_CANCEL_SUCCESS");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.Rz7, java.lang.Object] */
    public static final void A01(Q8n q8n, C270254gR r25) {
        LinkedHashMap A1H;
        String str;
        String str2;
        int length;
        C270254gR r1 = r25;
        QP6 qp6 = r1.A00.A06;
        1yd r7 = r1.A04;
        Set set = SL8.A00;
        0qQ.A0B(r7, 1);
        Q8n q8n2 = q8n;
        if (q8n == null) {
            A1H = null;
        } else {
            boolean z = false;
            A1H = AnonymousClass7TE.A1H();
            Iterator A0h = JTQ.A0h(q8n2.A0A);
            while (A0h.hasNext()) {
                Q8n q8n3 = (Q8n) A0h.next();
                AutofillValue autofillValue = q8n3.A04;
                Set set2 = SDK.A0A;
                0qQ.A08(set2);
                String A00 = SB2.A00(q8n3, r7, set2, (Set) null);
                if (q8n3.A00 > 0) {
                    int i = q8n3.A01;
                    String str3 = null;
                    boolean z2 = false;
                    boolean z3 = false;
                    int i2 = 0;
                    if (A00 != null) {
                        str3 = A00;
                    }
                    String str4 = null;
                    ViewStructure.HtmlInfo htmlInfo = q8n3.A03;
                    if (htmlInfo != null) {
                        HashMap A1E = AnonymousClass7TE.A1E();
                        List<Pair<String, String>> attributes = htmlInfo.getAttributes();
                        if (attributes != null) {
                            for (Pair next : attributes) {
                                A1E.put(next.first, next.second);
                            }
                        }
                        if (!A1E.isEmpty()) {
                            String[] strArr = q8n3.A09;
                            if (strArr == null || (length = strArr.length) <= 0) {
                                str = null;
                            } else {
                                str = (String) 0sr.A1P(Arrays.copyOf(strArr, length)).stream().collect(Collectors.joining(" "));
                            }
                            CharSequence charSequence = q8n3.A05;
                            if (charSequence != null) {
                                str4 = charSequence.toString();
                            }
                            String A0r = DbS.A0r("label", A1E);
                            String A0r2 = DbS.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A1E);
                            String A0r3 = DbS.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A1E);
                            String A0r4 = DbS.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A1E);
                            String A0r5 = DbS.A0r("ua-autofill-hints", A1E);
                            if (A0r5 == null || A0r5.length() == 0) {
                                str2 = "Failed";
                            } else {
                                str2 = "Succeeded";
                            }
                            AutofillValue autofillValue2 = q8n3.A04;
                            if (autofillValue2 != null && autofillValue2.isText()) {
                                CharSequence textValue = autofillValue2.getTextValue();
                                0qQ.A07(textValue);
                                if (textValue.length() != 0) {
                                    int length2 = textValue.length();
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < length2) {
                                            if (!Character.isDigit(textValue.charAt(i3)) && textValue.charAt(i3) != ' ') {
                                                break;
                                            }
                                            i3++;
                                        } else {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    i2 = textValue.length();
                                }
                                if (C11098S9z.A01(new 11S(" ").A00(textValue.toString(), ""))) {
                                    z3 = true;
                                }
                            }
                            ? obj = new Object();
                            obj.A04 = str;
                            obj.A0A = str4;
                            obj.A03 = str2;
                            obj.A09 = null;
                            obj.A07 = A0r2;
                            obj.A05 = A0r3;
                            obj.A06 = A0r4;
                            obj.A01 = A0r5;
                            obj.A08 = A0r;
                            obj.A0D = z3;
                            obj.A00 = i2;
                            obj.A0B = z2;
                            obj.A0C = z3;
                            obj.A02 = str3;
                            A1H.putIfAbsent(Integer.valueOf(i), obj);
                        }
                    }
                    if (autofillValue != null && autofillValue.isText() && C11098S9z.A01(Pxj.A0s(autofillValue.getTextValue().toString()))) {
                        z = true;
                    }
                }
            }
            if (!z || !(!A1H.isEmpty())) {
                A1H = null;
            }
        }
        qp6.A01 = A1H;
    }
}
