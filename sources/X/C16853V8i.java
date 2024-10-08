package X;

import java.io.IOException;

/* renamed from: X.V8i  reason: case insensitive filesystem */
public abstract class C16853V8i {
    public static C15070UNn parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("cooldown".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("key".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("cooldown", r10, "ZeroCarrierSignalUrlConfig");
            } else if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("key", r10, "ZeroCarrierSignalUrlConfig");
            } else if (str2 != null || !(r10 instanceof 0c9)) {
                return new C15070UNn(num.intValue(), str, str2);
            } else {
                AnonymousClass7TF.A1L("url", r10, "ZeroCarrierSignalUrlConfig");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
