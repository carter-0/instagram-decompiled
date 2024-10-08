package X;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public abstract class Q45 {
    public static final String A00(AnonymousClass6Tm r10) {
        String str;
        try {
            Object A03 = r10.A03(0);
            0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
            Object A032 = r10.A03(1);
            0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            Object A00 = r10.A00();
            0qQ.A0C(A00, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list = (List) A00;
            String str2 = (String) DbT.A0q(r10, "null cannot be cast to non-null type kotlin.String", 3);
            String str3 = (String) DbT.A0q(r10, "null cannot be cast to non-null type kotlin.String", 4);
            1Zj r1 = new 1Zj(str3, ByteBuffer.wrap(Base64.decode((String) A03, 0)));
            int[] A0x = 00k.A0x((List) A032);
            0qQ.A0B(str2, 0);
            String A002 = r1.A00(str2, A0x);
            if (A002 == null) {
                return null;
            }
            String[] A1b = DbU.A1b(DbW.A0o(str3, "_"), 0);
            String str4 = A1b[0];
            if (A1b.length > 1) {
                str = A1b[1];
            } else {
                str = "";
            }
            Locale locale = new Locale(str4, str);
            String[] A1b2 = DbU.A1b(list, 0);
            Object[] copyOf = Arrays.copyOf(A1b2, A1b2.length);
            return Pxg.A0v(A002, locale, copyOf, copyOf.length);
        } catch (Exception e) {
            Object A033 = r10.A03(0);
            0qQ.A0C(A033, "null cannot be cast to non-null type kotlin.String");
            String str5 = (String) DbT.A0q(r10, "null cannot be cast to non-null type kotlin.String", 3);
            String A14 = 002.A14("Error when evaluating ", (String) DbT.A0q(r10, "null cannot be cast to non-null type kotlin.String", 4), " fbt {", str5, "} (", (String) A033, ')');
            0qQ.A0B(A14, 1);
            throw new Exception(A14, e);
        }
    }
}
