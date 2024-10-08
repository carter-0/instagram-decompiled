package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kvk  reason: case insensitive filesystem */
public abstract class C63363Kvk {
    public static CloseFriendsUserStoryTarget parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CloseFriendsUserStoryTarget closeFriendsUserStoryTarget = new CloseFriendsUserStoryTarget();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    closeFriendsUserStoryTarget.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("blacklisted_user_ids".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    closeFriendsUserStoryTarget.A01 = arrayList;
                }
                r4.A0z();
            }
            return closeFriendsUserStoryTarget;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
