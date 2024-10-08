package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetailImpl;
import java.io.IOException;

/* renamed from: X.KvH  reason: case insensitive filesystem */
public abstract class C63334KvH {
    public static IgFundedIncentiveDetailImpl parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DevServerEntity.COLUMN_DESCRIPTION, r8, "IgFundedIncentiveDetailImpl");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new IgFundedIncentiveDetailImpl(str, str2);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r8, "IgFundedIncentiveDetailImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
