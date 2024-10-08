package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.O0f  reason: case insensitive filesystem */
public abstract class C70275O0f {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.OLm, java.lang.Object] */
    public static C70791OLm parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("account_hcm_metadata".equals(A17)) {
                    obj.A00 = C69749NrY.parseFromJson(r4);
                } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A17)) {
                    obj.A04 = AnonymousClass3UP.parseFromJson(r4);
                } else if ("track_metadata".equals(A17)) {
                    obj.A05 = D0F.parseFromJson(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    obj.A06 = 1aC.A00(r4, false);
                } else if ("original_sound".equals(A17)) {
                    obj.A01 = 1dk.parseFromJson(r4);
                } else if ("threads_search_metadata".equals(A17)) {
                    obj.A03 = C274264nz.parseFromJson(r4);
                } else if ("places".equals(A17)) {
                    obj.A02 = C69753Nrc.parseFromJson(r4);
                } else if ("playlist_id".equals(A17)) {
                    obj.A07 = AnonymousClass7TF.A0Z(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
