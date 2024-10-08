package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetailsImpl;
import com.instagram.api.schemas.FormattedStringImpl;
import java.io.IOException;

/* renamed from: X.CWv  reason: case insensitive filesystem */
public abstract class C44130CWv {
    public static CreatorViewerSignalPlainDetailsImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            FormattedStringImpl formattedStringImpl = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if (C41845B3m.A1L(A17)) {
                    formattedStringImpl = C44152CXr.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new CreatorViewerSignalPlainDetailsImpl(formattedStringImpl, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
