package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.HZt  reason: case insensitive filesystem */
public abstract class C54963HZt {
    public static void A00(0wc r4, C268654dm r5, String str) {
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(r4, AnonymousClass000.A00(3240));
        if (A0e.isSampled()) {
            int i = 0;
            AnonymousClass9JA r0 = (AnonymousClass9JA) r5.A00();
            Long l = null;
            if (r0 != null) {
                i = (Number) r0.A01;
                str2 = r0.A02;
            } else {
                Throwable A01 = r5.A01();
                if (A01 != null) {
                    if (A01 instanceof C69248NiA) {
                        C69248NiA niA = (C69248NiA) A01;
                        if (niA != null) {
                            i = Integer.valueOf(niA.A00);
                        } else {
                            i = null;
                        }
                    }
                    str2 = A01.getMessage();
                } else {
                    str2 = null;
                }
            }
            A0e.AAJ("surface_type", str);
            if (i != null) {
                l = C51969G9p.A0r(i);
            }
            A0e.A9F(TraceFieldType.ErrorCode, l);
            A0e.AAJ(AnonymousClass000.A00(599), str2);
            A0e.Cgf();
        }
    }
}
