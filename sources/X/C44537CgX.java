package X;

import com.instagram.api.schemas.ThreadHeaderContextType;
import java.io.IOException;

/* renamed from: X.CgX  reason: case insensitive filesystem */
public abstract class C44537CgX {
    public static C42121BHz parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            ThreadHeaderContextType threadHeaderContextType = null;
            String str2 = null;
            BI1 bi1 = null;
            String str3 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("context_info".equals(A17)) {
                    bi1 = C44538CgY.parseFromJson(r10);
                } else if ("context_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    threadHeaderContextType = (ThreadHeaderContextType) ThreadHeaderContextType.A01.get(str);
                    if (threadHeaderContextType == null) {
                        threadHeaderContextType = ThreadHeaderContextType.UNRECOGNIZED;
                    }
                } else if ("text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("text_compact".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (threadHeaderContextType == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("context_type", r10, "ThreadHeaderContextImpl");
            } else if (str2 != null || !(r10 instanceof 0c9)) {
                return new C42121BHz(bi1, threadHeaderContextType, str2, str3);
            } else {
                AnonymousClass7TF.A1L("text", r10, "ThreadHeaderContextImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
