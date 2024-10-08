package X;

import java.io.StringWriter;
import java.util.HashMap;

/* renamed from: X.50K  reason: invalid class name */
public abstract class AnonymousClass50K {
    public static final HashMap A00(0Df r7) {
        int i = r7.A00;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String A0D = r7.A0D(i2);
            0qQ.A07(A0D);
            Object A0C = r7.A0C(i2);
            if (A0D.equals("extra") && (A0C instanceof 0Df)) {
                StringWriter stringWriter = new StringWriter();
                0Dd.A00().A04((AnonymousClass0Jz) A0C, stringWriter);
                A0C = stringWriter.toString();
            }
            hashMap.put(A0D, A0C);
        }
        return hashMap;
    }
}
