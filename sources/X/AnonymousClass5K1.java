package X;

import java.io.StringWriter;

/* renamed from: X.5K1  reason: invalid class name */
public final class AnonymousClass5K1 implements 1NF {
    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        0qQ.A0B(str, 0);
        C283955Jz parseFromJson = Ep4.parseFromJson(16P.A00(str));
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public final /* bridge */ /* synthetic */ String END(Object obj) {
        C283955Jz r5 = (C283955Jz) obj;
        0qQ.A0B(r5, 0);
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (r5.A00 != null) {
            16P.A03(A0A, "states");
            for (AnonymousClass4VB r0 : r5.A00) {
                if (r0 != null) {
                    AnonymousClass4VI.A00(A0A, r0);
                }
            }
            A0A.A0Y();
        }
        A0A.A0Z();
        A0A.close();
        String obj2 = stringWriter.toString();
        0qQ.A07(obj2);
        return obj2;
    }
}
