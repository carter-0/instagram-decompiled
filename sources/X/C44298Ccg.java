package X;

import com.instagram.api.schemas.RIXUTextLinkImpl;
import java.io.IOException;

/* renamed from: X.Ccg  reason: case insensitive filesystem */
public abstract class C44298Ccg {
    public static RIXUTextLinkImpl parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("end".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if (C41845B3m.A17(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("start".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r7);
                } else if (C41845B3m.A1C(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            return new RIXUTextLinkImpl(num, num2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
