package X;

import java.io.StringWriter;

/* renamed from: X.4yL  reason: invalid class name and case insensitive filesystem */
public final class C279264yL implements 1NF {
    public final /* bridge */ /* synthetic */ String END(Object obj) {
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        C18184Vmy.A00(A0A, (C17731Vd0) obj);
        A0A.close();
        return stringWriter.toString();
    }

    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        return C18184Vmy.parseFromJson(16P.A00(str));
    }
}
