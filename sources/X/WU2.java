package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import java.util.HashSet;

public final class WU2 implements C250603lj {
    public final MediaMapFragment A00;
    public final HashSet A01 = new HashSet();

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        MediaMapPinPreview mediaMapPinPreview = (MediaMapPinPreview) r6.A03;
        if (r7.CEk(r6) == AnonymousClass05K.A00) {
            HashSet hashSet = this.A01;
            if (!hashSet.contains(mediaMapPinPreview.A01)) {
                hashSet.add(mediaMapPinPreview.A01);
                MediaMapFragment mediaMapFragment = this.A00;
                int A0M = AnonymousClass7TE.A0M(r6.A04);
                W3Q w3q = mediaMapFragment.A0F;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(w3q.A01, w3q.A03), C273654mx.A00(309));
                if (A0e.isSampled()) {
                    A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_ID, mediaMapPinPreview.A01);
                    C51965G9l.A1I(A0e, mediaMapPinPreview.A01);
                    A0e.AAJ("position", C320166rs.A01(A0M / 3, A0M % 3));
                    G9w.A17(A0e);
                }
            }
        }
    }

    public WU2(MediaMapFragment mediaMapFragment) {
        this.A00 = mediaMapFragment;
    }
}
