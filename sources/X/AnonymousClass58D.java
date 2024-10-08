package X;

import java.io.StringWriter;

/* renamed from: X.58D  reason: invalid class name */
public final class AnonymousClass58D implements 1NF {
    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        0qQ.A0B(str, 0);
        A4U parseFromJson = AnonymousClass9V4.parseFromJson(16P.A00(str));
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public final /* bridge */ /* synthetic */ String END(Object obj) {
        A4U a4u = (A4U) obj;
        0qQ.A0B(a4u, 0);
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (a4u.A00 != null) {
            16P.A03(A0A, "signal_to_decision_maker");
            for (C39692A5i a5i : a4u.A00) {
                if (a5i != null) {
                    A0A.A0c();
                    String str = a5i.A01;
                    if (str != null) {
                        A0A.A0R("key", str);
                    }
                    String str2 = a5i.A00;
                    if (str2 != null) {
                        A0A.A0R("data", str2);
                    }
                    A0A.A0Z();
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
