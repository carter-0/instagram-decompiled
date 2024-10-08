package X;

import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import java.io.StringWriter;

public abstract class LJ7 {
    public static final IGTVShoppingMetadata A00(String str) {
        if (str != null) {
            try {
                return LJ8.parseFromJson(16P.A00(str));
            } catch (Throwable th) {
                0wb.A06("IGTVShoppingMetadataConverter", "Failed to deserialize shopping metadata in IGTV draft. Did you forget to add a migration?", th);
            }
        }
        return null;
    }

    public static final String A01(IGTVShoppingMetadata iGTVShoppingMetadata) {
        if (iGTVShoppingMetadata != null) {
            try {
                StringWriter A0v = JTO.A0v();
                17W A0Q = JTO.A0Q(A0v);
                LJ8.A00(A0Q, iGTVShoppingMetadata);
                return JTP.A0n(A0Q, A0v);
            } catch (Throwable th) {
                0wb.A06("IGTVShoppingMetadataConverter", "Failed to serialize shopping metadata in IGTV draft. Did you forget to add a migration?", th);
            }
        }
        return null;
    }
}
