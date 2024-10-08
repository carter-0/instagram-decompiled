package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.9yZ  reason: invalid class name and case insensitive filesystem */
public abstract class C394719yZ {
    public static AnonymousClass82f parseFromJson(16F r31) {
        String A00;
        String A002;
        16F r10 = r31;
        0qQ.A0B(r10, 0);
        try {
            Integer num = null;
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Integer num2 = null;
            Float f = null;
            User user = null;
            User user2 = null;
            String str = null;
            Integer num3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Float f2 = null;
            1sP r21 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r12 = 16L.A09;
                A00 = C273654mx.A00(775);
                A002 = C273654mx.A00(120);
                if (A1J == r12) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r10, false);
                } else if (AnonymousClass000.A00(4807).equals(A17)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user2 = 1aC.A00(r10, false);
                } else if ("original_media_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("container_height".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("container_width".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r10);
                } else if (A002.equals(A17)) {
                    f = AnonymousClass7TF.A0V(r10);
                } else if ("media_duration".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r10);
                } else if (AnonymousClass000.A00(4596).equals(A17)) {
                    r21 = AnonymousClass1rc.parseFromJson(r10);
                } else if (A00.equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if ("is_video_transcoding_enabled".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r10);
                } else if ("full_screen_scale".equals(A17)) {
                    f2 = AnonymousClass7TF.A0V(r10);
                }
                r10.A0z();
            }
            if (user == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r10, "ClipsReshareViewModel");
            } else if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("original_media_id", r10, "ClipsReshareViewModel");
            } else if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("container_height", r10, "ClipsReshareViewModel");
            } else if (num2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("container_width", r10, "ClipsReshareViewModel");
            } else if (f == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r10, "ClipsReshareViewModel");
            } else if (num3 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_duration", r10, "ClipsReshareViewModel");
            } else if (bool == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, "ClipsReshareViewModel");
            } else if (bool2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_video_transcoding_enabled", r10, "ClipsReshareViewModel");
            } else if (f2 != null || !(r10 instanceof 0c9)) {
                return new AnonymousClass82f(r21, user, user2, str, f.floatValue(), f2.floatValue(), num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("full_screen_scale", r10, "ClipsReshareViewModel");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
