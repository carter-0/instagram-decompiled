package X;

import android.view.View;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.FtU  reason: case insensitive filesystem */
public final /* synthetic */ class C51398FtU implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserDetailFragment A01;

    public /* synthetic */ C51398FtU(View view, UserDetailFragment userDetailFragment) {
        this.A01 = userDetailFragment;
        this.A00 = view;
    }

    public final void run() {
        UserDetailFragment userDetailFragment = this.A01;
        View view = this.A00;
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(userDetailFragment.requireActivity(), 2131961993);
        A0e.A03(view);
        A0e.A02();
        A0e.A00().A07(userDetailFragment.A0I);
    }
}
