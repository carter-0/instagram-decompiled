package X;

import java.io.IOException;

/* renamed from: X.55J  reason: invalid class name */
public abstract class AnonymousClass55J {
    public static C376599Ip parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("text".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("timestamp".equals(A0q)) {
                    l = Long.valueOf(r8.A0y());
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("text", "DirectSnippetMetadata");
            } else if (l != null || !(r8 instanceof 0c9)) {
                return new C376599Ip(str, l.longValue());
            } else {
                ((0c9) r8).A03.A00("timestamp", "DirectSnippetMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
