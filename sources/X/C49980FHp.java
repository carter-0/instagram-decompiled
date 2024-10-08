package X;

import android.app.Dialog;
import android.content.DialogInterface;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.FHp  reason: case insensitive filesystem */
public final /* synthetic */ class C49980FHp implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C49980FHp(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserDetailFragment userDetailFragment = this.A00;
        Dialog dialog = userDetailFragment.mTopAccountInsightsDialog;
        if (dialog != null) {
            dialog.dismiss();
            if (C66591pU.A01.A00 != null) {
                Dbb.A12(new C273374mT(), userDetailFragment.requireActivity(), userDetailFragment.A0I);
            } else {
                0qQ.A0F("fragmentFactory");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }
}
