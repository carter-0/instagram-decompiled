package X;

import com.instagram.api.schemas.CreatorViewerSignalInfoImpl;
import com.instagram.api.schemas.CreatorViewerSignalType;
import java.io.IOException;

/* renamed from: X.CWr  reason: case insensitive filesystem */
public abstract class C44126CWr {
    public static CreatorViewerSignalInfoImpl parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            CreatorViewerSignalType creatorViewerSignalType = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("signal_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    creatorViewerSignalType = (CreatorViewerSignalType) CreatorViewerSignalType.A01.get(str);
                    if (creatorViewerSignalType == null) {
                        creatorViewerSignalType = CreatorViewerSignalType.UNRECOGNIZED;
                    }
                } else if ("text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (creatorViewerSignalType == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("signal_type", r8, "CreatorViewerSignalInfoImpl");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new CreatorViewerSignalInfoImpl(creatorViewerSignalType, str2);
            } else {
                AnonymousClass7TF.A1L("text", r8, "CreatorViewerSignalInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
