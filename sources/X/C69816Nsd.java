package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.business.promote.model.PromoteButtonAction;
import com.instagram.business.promote.model.PromoteButtonActionType;
import java.io.IOException;

/* renamed from: X.Nsd  reason: case insensitive filesystem */
public abstract class C69816Nsd {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.business.promote.model.PromoteButtonAction, java.lang.Object] */
    public static PromoteButtonAction parseFromJson(16F r8) {
        PromoteButtonActionType promoteButtonActionType;
        0qQ.A0B(r8, 0);
        try {
            ? obj = new Object();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("display_text".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r8);
                    0qQ.A0B(A0l, 0);
                    obj.A01 = A0l;
                } else if ("link".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r8);
                    0qQ.A0B(A0l2, 0);
                    obj.A02 = A0l2;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    String A1Q = r8.A1Q();
                    0qQ.A0B(A1Q, 0);
                    PromoteButtonActionType[] values = PromoteButtonActionType.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            promoteButtonActionType = null;
                            break;
                        }
                        promoteButtonActionType = values[i];
                        if (0qQ.A0K(promoteButtonActionType.toString(), A1Q)) {
                            break;
                        }
                        i++;
                    }
                    0qQ.A0B(promoteButtonActionType, 0);
                    obj.A00 = promoteButtonActionType;
                }
                r8.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
