package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.OnLifecycleEvent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class I9I implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener, AnonymousClass07Y {
    public DialogInterface A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final String A04;

    public I9I(AnonymousClass4DH r2, UserSession userSession, AnonymousClass4DU r4, String str) {
        0qQ.A0B(userSession, 3);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = userSession;
        this.A04 = str;
    }

    public final void onShow(DialogInterface dialogInterface) {
        0qQ.A0B(dialogInterface, 0);
        this.A00 = dialogInterface;
    }

    public final void A00(MXT mxt) {
        C14068TpH tpH;
        UserSession userSession = this.A02;
        AnonymousClass4DH r6 = this.A01;
        User CCd = mxt.CCd();
        0qQ.A07(CCd);
        String id = mxt.getId();
        if (id != null) {
            C270194gL Ahy = mxt.Ahy();
            C62429Kfe kfe = new C62429Kfe(4, new C57448Ias(0, mxt, this), this);
            FragmentActivity requireActivity = r6.requireActivity();
            if (Ahy != null) {
                id = Ahy.A0e;
                id.getClass();
                tpH = C14068TpH.LIVE;
            } else {
                tpH = C14068TpH.POST;
            }
            C71093OcF A012 = ORV.A01(requireActivity, r6, userSession, tpH, C16677UzD.MEDIA, id);
            A012.A01 = CCd;
            A012.A07(kfe);
            C71093OcF.A00((C331157Pu) null, A012);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    @OnLifecycleEvent(07T.ON_DESTROY)
    public final void destroyDialog() {
        DialogInterface dialogInterface = this.A00;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this.A00 = null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (0qQ.A0K(this.A00, dialogInterface)) {
            this.A00 = null;
        }
    }
}
