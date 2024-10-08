package X;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Dk  reason: invalid class name and case insensitive filesystem */
public abstract class C375399Dk {
    public static final C375409Dl A00 = new Object();

    public static void A00(C375379Di r9) {
        C375189Cp r5;
        ArrayList arrayList = new ArrayList();
        for (List it : r9.A03.values()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C375369Dh r6 = (C375369Dh) it2.next();
                    int ordinal = r6.A01.ordinal();
                    if (ordinal == 1) {
                        r5 = C375189Cp.A03;
                    } else if (ordinal == 2) {
                        r5 = C375189Cp.A02;
                    } else if (ordinal == 3) {
                        r5 = C375189Cp.A01;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    int i = r6.A00;
                    String str = r6.A05;
                    if (str.startsWith("type.googleapis.com/google.crypto.")) {
                        str = str.substring(34);
                    }
                    arrayList.add(new C39792A9n(r5, str, r6.A02.name(), i));
                }
            }
        }
        C375369Dh r0 = r9.A00;
        if (r0 != null) {
            int i2 = r0.A00;
            if (Integer.valueOf(i2) != null) {
                try {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((C39792A9n) it3.next()).A00 == i2) {
                        }
                    }
                    throw new GeneralSecurityException("primary key ID is not present in entries");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
