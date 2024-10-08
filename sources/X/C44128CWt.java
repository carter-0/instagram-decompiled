package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.CreatorViewerSignalDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalModelImpl;
import com.instagram.api.schemas.InspirationSignalType;
import java.io.IOException;

/* renamed from: X.CWt  reason: case insensitive filesystem */
public abstract class C44128CWt {
    public static CreatorViewerSignalModelImpl parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            CreatorViewerSignalDetailsImpl creatorViewerSignalDetailsImpl = null;
            InspirationSignalType inspirationSignalType = null;
            String str2 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("details".equals(A17)) {
                    creatorViewerSignalDetailsImpl = C44124CWp.parseFromJson(r10);
                } else if ("signal_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    inspirationSignalType = (InspirationSignalType) InspirationSignalType.A01.get(str);
                    if (inspirationSignalType == null) {
                        inspirationSignalType = InspirationSignalType.UNRECOGNIZED;
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (creatorViewerSignalDetailsImpl == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("details", r10, "CreatorViewerSignalModelImpl");
            } else if (inspirationSignalType == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("signal_type", r10, "CreatorViewerSignalModelImpl");
            } else if (str2 != null || !(r10 instanceof 0c9)) {
                return new CreatorViewerSignalModelImpl(creatorViewerSignalDetailsImpl, inspirationSignalType, str2);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r10, "CreatorViewerSignalModelImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
