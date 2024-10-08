package X;

import android.app.Activity;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.INt  reason: case insensitive filesystem */
public final class C57079INt implements 27S {
    public final /* synthetic */ UserDetailFragment A00;

    public C57079INt(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        throw AnonymousClass7TE.A11("userId");
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1333583424);
        int A032 = AnonymousClass0fD.A03(664691178);
        Activity rootActivity = this.A00.getRootActivity();
        if (!rootActivity.isFinishing()) {
            AnonymousClass37D A0i = DbT.A0i(rootActivity);
            if (A0i != null) {
                AnonymousClass37F r2 = (AnonymousClass37F) A0i;
                if (r2.A0g) {
                    A0i.A0Q(new HFZ(1, rootActivity, this));
                    if (!r2.A0b) {
                        A0i.A0B();
                    }
                }
            }
            rootActivity.onBackPressed();
        }
        AnonymousClass0fD.A0A(2071869336, A032);
        AnonymousClass0fD.A0A(1768357135, A03);
    }
}
