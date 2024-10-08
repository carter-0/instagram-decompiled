package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class INM implements AnonymousClass1MK {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        I5N.A00 = null;
        C54113Gzi gzi = new C54113Gzi();
        DbZ.A1B(gzi, PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A02);
        try {
            C309516Yo A0M = DbS.A0M(this.A00, this.A01);
            A0M.A0A(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
            A0M.A0B((Bundle) null, gzi);
            A0M.A04();
        } catch (IllegalStateException e) {
            if (e.getMessage() != null) {
                e.getMessage();
            }
        }
    }

    public final void DJx(C226952iF r2, C254673sr r3) {
        I5N.A00 = null;
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public INM(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A02 = str;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
