package X;

import com.instagram.api.schemas.RIXUCoverElementMetadataType;
import java.io.IOException;

/* renamed from: X.Nrd  reason: case insensitive filesystem */
public abstract class C69754Nrd {
    public static C61080JwI parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            RIXUCoverElementMetadataType rIXUCoverElementMetadataType = null;
            while (r4.A1J() != 16L.A09) {
                if ("metadata_type".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    rIXUCoverElementMetadataType = (RIXUCoverElementMetadataType) RIXUCoverElementMetadataType.A01.get(str);
                    if (rIXUCoverElementMetadataType == null) {
                        rIXUCoverElementMetadataType = RIXUCoverElementMetadataType.UNRECOGNIZED;
                    }
                }
                r4.A0z();
            }
            return new C61080JwI((Object) rIXUCoverElementMetadataType, 19);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
