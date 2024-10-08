package X;

import android.content.Context;
import java.util.Date;
import java.util.EnumMap;

/* renamed from: X.Hcv  reason: case insensitive filesystem */
public abstract class C55147Hcv {
    public static final String A00(Context context, int i, int i2) {
        String A0u;
        long j = ((long) i) * 1000;
        Date date = new Date(j);
        Class<C247743gq> cls = C247743gq.class;
        EnumMap enumMap = new EnumMap(cls);
        1G0.A0G(new Date(System.currentTimeMillis()), date, enumMap);
        enumMap.get(C247743gq.HOURS);
        C247743gq r10 = C247743gq.MINUTES;
        int A01 = DbX.A01((Number) enumMap.get(r10));
        C247743gq r7 = C247743gq.SECONDS;
        int A012 = DbX.A01((Number) enumMap.get(r7));
        Date date2 = new Date(System.currentTimeMillis());
        Date date3 = new Date(j + (((long) i2) * 1000));
        EnumMap enumMap2 = new EnumMap(cls);
        1G0.A0G(date2, date3, enumMap2);
        int A0A = AnonymousClass7TG.A0A((Number) enumMap2.get(r10));
        int A0A2 = AnonymousClass7TG.A0A((Number) enumMap2.get(r7));
        if (A0A > 0 || A0A2 > 0) {
            if (A01 <= 0) {
                A01 = 0;
            }
            A0u = DbV.A0u(context, Integer.valueOf(A01), Integer.valueOf(A012), 2131964315);
        } else {
            A0u = context.getString(2131964316);
        }
        0qQ.A07(A0u);
        return A0u;
    }
}
