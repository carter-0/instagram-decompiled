package X;

import java.io.StringWriter;

/* renamed from: X.7z3  reason: invalid class name and case insensitive filesystem */
public final class C348807z3 extends 0Yg implements 0sP {
    public static final C348807z3 A00 = new C348807z3();

    public C348807z3() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C346167ui r3 = (C346167ui) obj;
        0qQ.A0B(r3, 0);
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        C346157uh.A00(A0A, r3);
        A0A.close();
        String obj2 = stringWriter.toString();
        0qQ.A07(obj2);
        return obj2;
    }
}
