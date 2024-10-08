package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

public abstract class A0I {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.A7m] */
    public static C39746A7m parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("images".equals(A17)) {
                    obj.A00 = A0F.parseFromJson(r3);
                } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A17)) {
                    obj.A01 = A0H.parseFromJson(r3);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    obj.A02 = A0J.parseFromJson(r3);
                } else if ("is_sticker".equals(A17)) {
                    obj.A03 = AnonymousClass7TF.A0S(r3);
                } else if ("expression_id".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
