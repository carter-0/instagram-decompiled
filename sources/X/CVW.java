package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipChainType;
import java.io.IOException;

public abstract class CVW {
    public static BE4 parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Integer num = null;
            ClipChainType clipChainType = null;
            String str2 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("clip_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("clips_chain_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    clipChainType = (ClipChainType) ClipChainType.A01.get(str);
                    if (clipChainType == null) {
                        clipChainType = ClipChainType.UNRECOGNIZED;
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
            if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("clip_count", r10, "ClipChainMetadataDict");
            } else if (clipChainType == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("clips_chain_type", r10, "ClipChainMetadataDict");
            } else if (str2 != null || !(r10 instanceof 0c9)) {
                return new BE4(clipChainType, str2, num.intValue());
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r10, "ClipChainMetadataDict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
