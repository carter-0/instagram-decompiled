package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.SPm  reason: case insensitive filesystem */
public abstract class C11368SPm {
    public static CardDetails A01(CardDetails cardDetails, List list) {
        Object obj;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            CardDetails cardDetails2 = (CardDetails) obj;
            if (2PP.A00(cardDetails2.A0A, cardDetails.A0A) && 2PP.A00(cardDetails2.A04, cardDetails.A04) && 2PP.A00(cardDetails2.A03, cardDetails.A03)) {
                break;
            }
        }
        return (CardDetails) obj;
    }

    public static AutofillData A00(AutofillData autofillData, Set set) {
        C8684R0i r0i;
        Map unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
        AWR awr = new AWR(set, 0);
        if (unmodifiableMap instanceof R0v) {
            R0v r0v = (R0v) unmodifiableMap;
            r0i = new C8684R0i(C9734Rfs.A00(r0v.A00, awr), r0v.A01);
        } else {
            unmodifiableMap.getClass();
            r0i = new C8684R0i(awr, unmodifiableMap);
        }
        return new AutofillData((Map) r0i);
    }

    public static ArrayList A02(List list, Set set) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AutofillData autofillData = (AutofillData) it.next();
            Iterator A16 = DbV.A16(Collections.unmodifiableMap(autofillData.A00));
            A16.getClass();
            while (true) {
                if (!A16.hasNext()) {
                    break;
                }
                Object next = A16.next();
                if (A03((String) next, set)) {
                    if (next != null) {
                        A1C.add(autofillData);
                    }
                }
            }
        }
        return A1C;
    }

    public static boolean A03(String str, Set set) {
        if (set.contains(str)) {
            return true;
        }
        if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(str) && set.contains("cc-name")) {
            return true;
        }
        if ("family-name".equals(str) && set.contains("cc-family-name")) {
            return true;
        }
        if (!"given-name".equals(str) || !set.contains("cc-given-name")) {
            return false;
        }
        return true;
    }
}
