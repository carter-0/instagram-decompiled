package X;

import java.io.StringWriter;

/* renamed from: X.2fI  reason: invalid class name and case insensitive filesystem */
public final class C225982fI implements 1NF {
    public final /* bridge */ /* synthetic */ String END(Object obj) {
        AnonymousClass47F r7 = (AnonymousClass47F) obj;
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (r7.A00 != null) {
            16P.A03(A0A, AnonymousClass000.A00(3142));
            for (C45360Cv2 cv2 : r7.A00) {
                if (cv2 != null) {
                    A0A.A0c();
                    String str = cv2.A01;
                    if (str != null) {
                        A0A.A0R(C273654mx.A00(261), str);
                    }
                    String str2 = cv2.A02;
                    if (str2 != null) {
                        A0A.A0R("source_media_id", str2);
                    }
                    Boolean bool = cv2.A00;
                    if (bool != null) {
                        A0A.A0S(AnonymousClass000.A00(311), bool.booleanValue());
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
        return C45119Cqd.parseFromJson(16P.A00(str));
    }
}
