package X;

import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class SI1 {
    public static final ArrayList A00(Map map) {
        ArrayList A0q = AnonymousClass7TF.A0q(map, 0);
        Iterator A15 = Pxg.A15(EmailAutofillData.A00);
        while (A15.hasNext()) {
            Object next = A15.next();
            List A13 = C66580MXl.A13(next, map);
            if (A13 != null) {
                for (Object next2 : A13) {
                    AnonymousClass7TG.A1O(next, next2);
                    BrowserExtensionsAutofillData browserExtensionsAutofillData = new BrowserExtensionsAutofillData();
                    browserExtensionsAutofillData.A00.put(next, next2);
                    A0q.add(browserExtensionsAutofillData);
                }
            }
        }
        return A0q;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData, java.lang.Object] */
    public final ArrayList A01(Map map) {
        Object obj;
        HashMap A0r = Pxf.A0r(map, 0);
        Iterator A15 = Pxg.A15(AddressAutofillData.A00);
        while (A15.hasNext()) {
            Object next = A15.next();
            0sn A13 = C66580MXl.A13(next, map);
            if (A13 == null) {
                A13 = 0sn.A00;
            }
            if (!A13.isEmpty() && (obj = A13.get(0)) != null) {
                A0r.put(next, obj);
            }
        }
        String A0r2 = DbS.A0r("address-line1", A0r);
        Object obj2 = A0r.get("street-address");
        if (A0r2 != null) {
            StringBuilder A16 = Pxe.A16(A0r2);
            String A0r3 = DbS.A0r("address-line2", A0r);
            if (!(A0r3 == null || A0r3.length() == 0)) {
                if (A16.length() > 0) {
                    A16.append(" ");
                }
                A16.append(A0r3);
            }
            String A0r4 = DbS.A0r("address-line3", A0r);
            if (!(A0r4 == null || A0r4.length() == 0)) {
                if (A16.length() > 0) {
                    A16.append(" ");
                }
                A16.append(A0r4);
            }
            A0r.put("street-address", A16.toString());
        } else if (obj2 != null) {
            A0r.put("address-line1", obj2);
            A0r.remove("address-line2");
            A0r.remove("address-line3");
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!A0r.isEmpty()) {
            ? obj3 = new Object();
            obj3.A00 = A0r;
            A1C.add(obj3);
        }
        return A1C;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData, java.lang.Object] */
    public final ArrayList A02(Map map) {
        Object obj;
        HashMap A0r = Pxf.A0r(map, 0);
        Iterator A15 = Pxg.A15(NameAutofillData.A00);
        while (A15.hasNext()) {
            Object next = A15.next();
            0sn A13 = C66580MXl.A13(next, map);
            if (A13 == null) {
                A13 = 0sn.A00;
            }
            if (!A13.isEmpty() && (obj = A13.get(0)) != null) {
                A0r.put(next, obj);
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!A0r.isEmpty()) {
            ? obj2 = new Object();
            obj2.A00 = A0r;
            A1C.add(obj2);
        }
        return A1C;
    }
}
