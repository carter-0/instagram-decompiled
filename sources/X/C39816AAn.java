package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.AAn  reason: case insensitive filesystem */
public abstract class C39816AAn {
    public static AnonymousClass9JM parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            AnonymousClass9JM r1 = new AnonymousClass9JM();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (TraceFieldType.ContentType.equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r6);
                    0qQ.A0B(A0l, 0);
                    r1.A03 = A0l;
                } else if ("content_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r6);
                    0qQ.A0B(A0l2, 0);
                    r1.A01 = A0l2;
                } else if (C39829ABa.A00(10, 8, 119).equals(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r6);
                } else if (AnonymousClass000.A00(1224).equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r6);
                } else if ("segment_index".equals(A17)) {
                    r1.A00 = AnonymousClass7TF.A0X(r6);
                } else if (AnonymousClass000.A00(195).equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r6);
                }
                r6.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(AnonymousClass9JM r4, 17Z r5) {
        r5.A0c();
        String str = r4.A03;
        if (str != null) {
            r5.A0R(TraceFieldType.ContentType, str);
        }
        String str2 = r4.A01;
        if (str2 != null) {
            r5.A0R("content_id", str2);
        }
        String str3 = r4.A05;
        if (str3 != null) {
            r5.A0R(C39829ABa.A00(10, 8, 119), str3);
        }
        String str4 = r4.A02;
        if (str4 != null) {
            r5.A0R(AnonymousClass000.A00(1224), str4);
        }
        Number number = (Number) r4.A00;
        if (number != null) {
            r5.A0P("segment_index", number.intValue());
        }
        String str5 = r4.A04;
        if (str5 != null) {
            r5.A0R(AnonymousClass000.A00(195), str5);
        }
        r5.A0Z();
    }
}
