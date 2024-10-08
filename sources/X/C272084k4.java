package X;

import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import java.io.IOException;

/* renamed from: X.4k4  reason: invalid class name and case insensitive filesystem */
public abstract class C272084k4 {
    public static DirectCountBasedReaction parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Boolean bool = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("emoji".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("count".equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                } else if ("is_viewer_reacted".equals(A0q)) {
                    bool = Boolean.valueOf(r10.A0d());
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("emoji", "DirectCountBasedReaction");
            } else if (num == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("count", "DirectCountBasedReaction");
            } else if (bool != null || !(r10 instanceof 0c9)) {
                return new DirectCountBasedReaction(str, num.intValue(), bool.booleanValue());
            } else {
                ((0c9) r10).A03.A00("is_viewer_reacted", "DirectCountBasedReaction");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
