package X;

import java.io.StringWriter;

/* renamed from: X.7z5  reason: invalid class name and case insensitive filesystem */
public final class C348827z5 extends 0Yg implements 0sP {
    public static final C348827z5 A00 = new C348827z5();

    public C348827z5() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C64085LMd lMd = (C64085LMd) obj;
        0qQ.A0B(lMd, 0);
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        C18176Vmq.A00(A0A, lMd);
        A0A.close();
        String obj2 = stringWriter.toString();
        0qQ.A07(obj2);
        return obj2;
    }
}
