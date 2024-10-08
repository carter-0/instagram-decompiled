package X;

import java.io.IOException;

/* renamed from: X.Cdf  reason: case insensitive filesystem */
public abstract class C44359Cdf {
    public static BGS parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("end".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("start".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r10);
                } else if ("text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("end", r10, "SingleTokenTranscriptionData");
            } else if (num2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("start", r10, "SingleTokenTranscriptionData");
            } else if (str != null || !(r10 instanceof 0c9)) {
                return new BGS(num.intValue(), num2.intValue(), str);
            } else {
                AnonymousClass7TF.A1L("text", r10, "SingleTokenTranscriptionData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
