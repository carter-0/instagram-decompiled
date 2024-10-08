package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.S2q  reason: case insensitive filesystem */
public final class C10958S2q {
    public C13501TbS A00;
    public C13792Th7 A01;
    public List A02;
    public boolean A03;
    public final Activity A04;

    public final void A00(AuthorizationResponse authorizationResponse) {
        C13792Th7 th7 = this.A01;
        this.A03 = false;
        if (th7 != null) {
            th7.stop();
        }
        C13501TbS tbS = this.A00;
        if (tbS != null) {
            Intent A09 = DbS.A09();
            String.format("Spotify auth completing. The response is in EXTRA with key '%s'", new Object[]{PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE});
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, authorizationResponse);
            A09.putExtra(C66579MXk.A00(552), A0a);
            Dba.A0k((Activity) tbS, A09);
            this.A00 = null;
            return;
        }
        Log.w("Spotify Auth Client", "Can't deliver the Spotify Auth response. The listener is null");
    }

    public C10958S2q(Activity activity) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A02 = A1C;
        this.A04 = activity;
        A1C.add(new Object());
        A1C.add(new C12817T8h());
    }
}
