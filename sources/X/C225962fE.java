package X;

import java.io.StringWriter;

/* renamed from: X.2fE  reason: invalid class name and case insensitive filesystem */
public final class C225962fE implements 1NF {
    public final /* bridge */ /* synthetic */ String END(Object obj) {
        AnonymousClass46T r9 = (AnonymousClass46T) obj;
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (r9.A00 != null) {
            16P.A03(A0A, "responses");
            for (C45418Cvy cvy : r9.A00) {
                if (cvy != null) {
                    A0A.A0c();
                    A0A.A0Q("timestamp", cvy.A01);
                    String str = cvy.A03;
                    if (str != null) {
                        A0A.A0R("media_id", str);
                    }
                    String str2 = cvy.A04;
                    if (str2 != null) {
                        A0A.A0R("quiz_id", str2);
                    }
                    A0A.A0P("answer", cvy.A00);
                    String str3 = cvy.A05;
                    if (str3 != null) {
                        A0A.A0R(AnonymousClass000.A00(755), str3);
                    }
                    String str4 = cvy.A02;
                    if (str4 != null) {
                        A0A.A0R(AnonymousClass000.A00(321), str4);
                    }
                    String str5 = cvy.A06;
                    if (str5 != null) {
                        A0A.A0R("tray_session_id", str5);
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
        return C45120Cqe.parseFromJson(16P.A00(str));
    }
}
