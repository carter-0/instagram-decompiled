package X;

import java.io.StringWriter;

/* renamed from: X.Mn0  reason: case insensitive filesystem */
public final class C67384Mn0 implements C363348jZ {
    public final /* bridge */ /* synthetic */ Object AOn(String str) {
        0qQ.A0B(str, 0);
        C67387Mn4 parseFromJson = C67386Mn3.parseFromJson(16P.A00(str));
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public final /* bridge */ /* synthetic */ String Ah7(Object obj) {
        C67387Mn4 mn4 = (C67387Mn4) obj;
        0qQ.A0B(mn4, 0);
        return mn4.A01.A04;
    }

    public final /* bridge */ /* synthetic */ String END(Object obj) {
        C67387Mn4 mn4 = (C67387Mn4) obj;
        0qQ.A0B(mn4, 0);
        StringWriter A0v = JTO.A0v();
        17W A0A = AnonymousClass15o.A00.A0A(A0v);
        C67386Mn3.A00(A0A, mn4);
        A0A.close();
        return DbT.A10(A0v);
    }
}
