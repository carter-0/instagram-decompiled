package X;

import java.io.StringWriter;

/* renamed from: X.2fK  reason: invalid class name and case insensitive filesystem */
public final class C226002fK implements 1NF {
    public final /* bridge */ /* synthetic */ String END(Object obj) {
        AnonymousClass47G r6 = (AnonymousClass47G) obj;
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (r6.A00 != null) {
            16P.A03(A0A, AnonymousClass000.A00(3728));
            for (C45253CtG ctG : r6.A00) {
                if (ctG != null) {
                    A0A.A0c();
                    if (ctG.A00 != null) {
                        16P.A03(A0A, "media_ids");
                        for (String str : ctG.A00) {
                            if (str != null) {
                                A0A.A0t(str);
                            }
                        }
                        A0A.A0Y();
                    }
                    A0A.A0Z();
                }
            }
            A0A.A0Y();
        }
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }

    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        return CqV.parseFromJson(16P.A00(str));
    }
}
