package X;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.97w  reason: invalid class name and case insensitive filesystem */
public abstract class C3740297w {
    public static final AnonymousClass98B A00;
    public static final C3739897s A01 = new C3739897s(new AnonymousClass988(), AnonymousClass97N.class);
    public static final AnonymousClass987 A02;
    public static final AnonymousClass984 A03 = new AnonymousClass984(new C3740597z(), AnonymousClass981.class);
    public static final Map A04;
    public static final C3740497y A05;
    public static final Map A06;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.AesSivKey");
        A05 = A012;
        A02 = new AnonymousClass987(new AnonymousClass985(), A012);
        A00 = new AnonymousClass98B(new AnonymousClass989(), A012);
        HashMap hashMap = new HashMap();
        AnonymousClass98C r7 = AnonymousClass98C.A02;
        AnonymousClass98D r6 = AnonymousClass98D.RAW;
        hashMap.put(r7, r6);
        AnonymousClass98C r5 = AnonymousClass98C.A03;
        AnonymousClass98D r4 = AnonymousClass98D.TINK;
        hashMap.put(r5, r4);
        AnonymousClass98C r3 = AnonymousClass98C.A01;
        AnonymousClass98D r2 = AnonymousClass98D.CRUNCHY;
        hashMap.put(r3, r2);
        A06 = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(AnonymousClass98D.class);
        enumMap.put(r6, r7);
        enumMap.put(r4, r5);
        enumMap.put(r2, r3);
        enumMap.put(AnonymousClass98D.LEGACY, r3);
        A04 = Collections.unmodifiableMap(enumMap);
    }

    public static AnonymousClass98D A00(AnonymousClass98C r2) {
        Map map = A06;
        if (map.containsKey(r2)) {
            return (AnonymousClass98D) map.get(r2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to serialize variant: ");
        sb.append(r2);
        throw new GeneralSecurityException(sb.toString());
    }
}
