package com.facebook.fbreact.billingptt;

import X.0qQ;
import X.AnonymousClass2E0;
import X.AnonymousClass7TE;
import X.C10784Ry5;
import X.C11246SHg;
import X.C12492SvO;
import X.C12495SvR;
import X.C13045TJb;
import X.C13904TjR;
import X.C51974G9v;
import X.QZK;
import X.RVC;
import com.facebook.fbreact.specs.NativeBillingPTTSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@ReactModule(name = "BillingPTT")
public final class ReactBillingPTT extends NativeBillingPTTSpec {
    public static final RVC Companion = new Object();
    public static final String NAME = "BillingPTT";

    public String getName() {
        return "BillingPTT";
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.RsP, java.lang.Object] */
    public void getPTT(String str, ReadableMap readableMap, ReadableMap readableMap2, String str2, String str3, C13904TjR tjR) {
        String string;
        0qQ.A0B(str, 0);
        String str4 = str3;
        C51974G9v.A1P(readableMap, readableMap2, str2, str4);
        C13904TjR tjR2 = tjR;
        0qQ.A0B(tjR2, 5);
        C11246SHg A02 = AnonymousClass2E0.A04().A02(C12492SvO.A00, new C10784Ry5(str4, (String) null, (String) null, (String) null, str2, (Map) null), C12495SvR.A00);
        HashMap A1E = AnonymousClass7TE.A1E();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.CKI()) {
            String Crc = keySetIterator.Crc();
            if (readableMap2.hasKey(Crc)) {
                string = readableMap2.getString(Crc);
            } else {
                string = readableMap.getString(Crc);
            }
            A1E.put(Crc, String.valueOf(string));
        }
        Set keySet = readableMap2.toHashMap().keySet();
        ? obj = new Object();
        obj.A00 = A1E;
        obj.A01 = keySet;
        AnonymousClass2E0.A06().A00.A03.execute(new C13045TJb(tjR2, obj, A02, str));
    }

    public Map getTypedExportedConstants() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("version", 1);
        return A1E;
    }

    public ReactBillingPTT(QZK qzk) {
        super(qzk);
    }
}
