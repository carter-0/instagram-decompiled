package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public abstract class RVZ {
    public static final void A00(2SO r11, 0sP r12) {
        C62320sa r6 = C11145SCa.A00;
        long currentTimeMillis = System.currentTimeMillis();
        if (r11.compareTo(2SN.A00()) >= 0) {
            Set set = 2SN.A00;
            if (!set.isEmpty()) {
                ArrayList<2SM> arrayList = null;
                for (Object next : set) {
                    String[] strArr = ((2SM) next).A00;
                    if (03t.A0O("Litho.DebugInfo", strArr) || 03t.A0O("*", strArr)) {
                        if (arrayList == null) {
                            arrayList = AnonymousClass7TE.A1C();
                        }
                        arrayList.add(next);
                    }
                }
                if (arrayList == null) {
                    arrayList = 0sn.A00;
                }
                if (AnonymousClass7TE.A1b(arrayList)) {
                    LinkedHashMap A1H = AnonymousClass7TE.A1H();
                    r12.invoke(A1H);
                    A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "ZeroAlphaComponent");
                    PzP pzP = new PzP(currentTimeMillis, "Litho.DebugInfo", (String) r6.invoke(), A1H);
                    for (2SM A00 : arrayList) {
                        A00.A00(pzP);
                    }
                }
            }
        }
    }
}
