package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.fx.access.constants.FxcalAccountType;
import java.io.IOException;
import kotlin.enums.EnumEntries;

/* renamed from: X.EmC  reason: case insensitive filesystem */
public abstract class C48912EmC {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.EaN, java.lang.Object] */
    public static C48181EaN parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("account_type".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    EnumEntries enumEntries = FxcalAccountType.A02;
                    0qQ.A0B(str, 0);
                    FxcalAccountType.A01.get(str);
                } else if ("fbid".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if (Dbq.A03().equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("first_name".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("last_name".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("profile_pic_url".equals(A17)) {
                    C41846B3n.A1A(r4);
                }
                r4.A0z();
            }
            return new Object();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
