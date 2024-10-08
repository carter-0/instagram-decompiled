package X;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Fid  reason: case insensitive filesystem */
public final class C50797Fid implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        RectF rectF;
        UserDetailFragment userDetailFragment = this.A00;
        FragmentActivity activity = userDetailFragment.getActivity();
        if (userDetailFragment instanceof UserDetailFragment) {
            0qQ.A0C(userDetailFragment, "null cannot be cast to non-null type com.instagram.arlink.intf.NametagLauncherAnimationAnchorProvider");
            View view = userDetailFragment.A11.A01;
            if (view != null) {
                rectF = new RectF();
                0nA.A0L(rectF, view);
                DbW.A0W(activity, C343547qO.A00(rectF, EWD.PROFILE_NUX_DIALOG, false), this.A01, TransparentModalActivity.class, "nametag").A0C(activity);
            }
        }
        rectF = null;
        DbW.A0W(activity, C343547qO.A00(rectF, EWD.PROFILE_NUX_DIALOG, false), this.A01, TransparentModalActivity.class, "nametag").A0C(activity);
    }

    public C50797Fid(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
