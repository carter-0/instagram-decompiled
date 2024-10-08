package X;

import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadataImpl;
import java.io.IOException;

/* renamed from: X.Cgi  reason: case insensitive filesystem */
public abstract class C44548Cgi {
    public static BI4 parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            TrackMetadataImpl trackMetadataImpl = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            TrackDataImpl trackDataImpl = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("metadata".equals(A17)) {
                    trackMetadataImpl = D0F.parseFromJson(r7);
                } else if ("track".equals(A17)) {
                    trackDataImpl = AnonymousClass3UP.parseFromJson(r7);
                }
                r7.A0z();
            }
            if (trackMetadataImpl == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("metadata", r7, "TrackSchemaImpl");
            } else if (trackDataImpl != null || !(r7 instanceof 0c9)) {
                return new BI4(trackDataImpl, trackMetadataImpl);
            } else {
                AnonymousClass7TF.A1L("track", r7, "TrackSchemaImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
