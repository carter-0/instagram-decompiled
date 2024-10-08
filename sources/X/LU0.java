package X;

import android.content.DialogInterface;
import android.webkit.GeolocationPermissions;
import com.instagram.common.session.UserSession;

public final class LU0 implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public LU0(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = str;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
                ((GeolocationPermissions.Callback) this.A02).invoke(this.A03, false, false);
                return;
            case 1:
                C64370Lam.A01(C368278sM.DECLINE, (UserSession) this.A02, this.A03, (String) null);
                C66461MSp mSp = (C66461MSp) this.A01;
                if (mSp != null) {
                    mSp.afterSelection(false);
                    return;
                }
                return;
            default:
                UserSession userSession = ((LDA) this.A02).A00;
                String str = this.A03;
                0qQ.A0B(str, 1);
                FG9.A00(userSession, "upsell_screen_dismissed", str);
                C66520MUy mUy = (C66520MUy) this.A01;
                if (mUy != null) {
                    mUy.getDismissAction();
                    return;
                }
                return;
        }
    }
}
