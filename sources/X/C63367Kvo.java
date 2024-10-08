package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.pendingmedia.model.GroupUserStoryTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kvo  reason: case insensitive filesystem */
public abstract class C63367Kvo {
    public static GroupUserStoryTarget parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            GroupUserStoryTarget groupUserStoryTarget = new GroupUserStoryTarget();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    groupUserStoryTarget.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("group_members".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            PendingRecipient parseFromJson = C330927Ou.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    groupUserStoryTarget.A03 = arrayList;
                } else if ("display_name".equals(A17)) {
                    groupUserStoryTarget.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("thread_key".equals(A17)) {
                    groupUserStoryTarget.A00 = C254733sx.parseFromJson(r4);
                }
                r4.A0z();
            }
            return groupUserStoryTarget;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
