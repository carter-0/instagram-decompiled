package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.FWx  reason: case insensitive filesystem */
public final class C50292FWx implements 27S {
    public final /* synthetic */ UserDetailFragment A00;

    public C50292FWx(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        return Dc6.A02(this.A00, ((AnonymousClass3KA) obj).A01);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C48240EbL ebL;
        C324466zK r2;
        View view;
        UserDetailLaunchConfig userDetailLaunchConfig;
        int A03 = AnonymousClass0fD.A03(597827306);
        int A032 = AnonymousClass0fD.A03(-1380651116);
        FollowStatus followStatus = ((AnonymousClass3KA) obj).A00;
        int ordinal = followStatus.ordinal();
        boolean z = true;
        if (ordinal == 3) {
            UserDetailFragment userDetailFragment = this.A00;
            FAG fag = userDetailFragment.A0u;
            if (fag != null) {
                C46469DfX dfX = userDetailFragment.A32;
                CopyOnWriteArrayList copyOnWriteArrayList = fag.A00;
                synchronized (copyOnWriteArrayList) {
                    ebL = (C48240EbL) fag.A02.get();
                    Throwable th = (Throwable) fag.A01.get();
                    if (ebL == null && th == null) {
                        copyOnWriteArrayList.add(dfX);
                    }
                }
                if (ebL != null) {
                    dfX.A00(ebL.A00);
                }
            }
        } else if (ordinal == 4) {
            UserDetailFragment userDetailFragment2 = this.A00;
            userDetailFragment2.A0v.A01();
            User user = userDetailFragment2.A10.A03;
            if (user != null && (userDetailLaunchConfig = userDetailFragment2.A1E) != null && userDetailLaunchConfig.A0Y && !userDetailFragment2.A1o) {
                userDetailFragment2.A1o = true;
                if (C343547qO.A00 != null) {
                    user.getUsername();
                }
            }
            FragmentActivity activity = userDetailFragment2.getActivity();
            User user2 = userDetailFragment2.A10.A03;
            if (!(activity == null || 1Wj.A00 == null || user2 == null || !Boolean.FALSE.equals(user2.A0K()))) {
                DcL.A00().A00(activity, userDetailFragment2.A0I, "711162477494006", C70342O2u.A00(user2.getId()));
            }
            if (!(!userDetailFragment2.A1i || userDetailFragment2.A0M == null || (r2 = userDetailFragment2.A0O) == null || (view = r2.A02) == null || !userDetailFragment2.A1n)) {
                r2.A03(view);
            }
        }
        C323366xN r1 = this.A00.A11;
        if (followStatus != FollowStatus.A05) {
            z = false;
        }
        r1.A02(z);
        AnonymousClass0fD.A0A(-418258499, A032);
        AnonymousClass0fD.A0A(-284564577, A03);
    }
}
