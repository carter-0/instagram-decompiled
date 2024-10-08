package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.9y8  reason: invalid class name and case insensitive filesystem */
public abstract class C394449y8 {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.82d, java.lang.Object] */
    public static C3498682d parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    obj.A04 = 1aC.A00(r5, false);
                } else if ("original_media_id".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r5);
                } else if (C273654mx.A00(2928).equals(A17)) {
                    obj.A08 = r5.A0d();
                } else if (C273654mx.A00(340).equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r5);
                } else if ("media_duration".equals(A17)) {
                    obj.A03 = r5.A1D();
                } else if ("container_width".equals(A17)) {
                    obj.A02 = r5.A1D();
                } else if ("container_height".equals(A17)) {
                    obj.A01 = r5.A1D();
                } else if (C273654mx.A00(46).equals(A17)) {
                    obj.A00 = (float) r5.A0U();
                } else if (C273654mx.A00(325).equals(A17)) {
                    obj.A09 = r5.A0d();
                } else if (C273654mx.A00(2423).equals(A17)) {
                    obj.A07 = r5.A0d();
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
