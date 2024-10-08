package X;

import java.io.StringWriter;
import java.util.Map;

/* renamed from: X.2f6  reason: invalid class name and case insensitive filesystem */
public final class C225902f6 implements 1NF {
    public final /* bridge */ /* synthetic */ String END(Object obj) {
        C253743rL r9 = (C253743rL) obj;
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (r9.A00 != null) {
            16P.A03(A0A, AnonymousClass000.A00(3732));
            for (C45414Cvu cvu : r9.A00) {
                if (cvu != null) {
                    A0A.A0c();
                    A0A.A0Q("creation_time", cvu.A00);
                    String str = cvu.A04;
                    if (str != null) {
                        A0A.A0R(AnonymousClass000.A00(3919), str);
                    }
                    String str2 = cvu.A03;
                    if (str2 != null) {
                        A0A.A0R(AnonymousClass000.A00(3909), str2);
                    }
                    String str3 = cvu.A02;
                    if (str3 != null) {
                        A0A.A0R("radio_type", str3);
                    }
                    Integer num = cvu.A01;
                    if (num != null) {
                        A0A.A0R(AnonymousClass000.A00(3920), C49125Epo.A00(num));
                    }
                    if (cvu.A05 != null) {
                        A0A.A0q("params");
                        A0A.A0c();
                        for (Map.Entry entry : cvu.A05.entrySet()) {
                            if (!16P.A04(A0A, entry)) {
                                A0A.A0t((String) entry.getValue());
                            }
                        }
                        A0A.A0Z();
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
        return C45125Cqj.parseFromJson(16P.A00(str));
    }
}
