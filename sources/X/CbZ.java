package X;

import java.io.IOException;

public abstract class CbZ {
    public static C42062BFp parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Integer num = null;
            Float f = null;
            String str = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("font_size".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r10);
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
                AnonymousClass7TF.A1L("count", r10, "PollCreateModeStickerTallyImpl");
            } else if (f == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("font_size", r10, "PollCreateModeStickerTallyImpl");
            } else if (str != null || !(r10 instanceof 0c9)) {
                return new C42062BFp(str, num.intValue(), f.floatValue());
            } else {
                AnonymousClass7TF.A1L("text", r10, "PollCreateModeStickerTallyImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
