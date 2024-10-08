package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.profile.fragment.ProfileMediaTabFragment;

/* renamed from: X.72A  reason: invalid class name */
public final class AnonymousClass72A {
    public final /* synthetic */ ProfileMediaTabFragment A00;

    public AnonymousClass72A(ProfileMediaTabFragment profileMediaTabFragment) {
        this.A00 = profileMediaTabFragment;
    }

    public final void A00() {
        C16129UpG upG;
        ProfileMediaTabFragment profileMediaTabFragment = this.A00;
        RecyclerView recyclerView = profileMediaTabFragment.mRecyclerView;
        if (recyclerView != null && recyclerView.A1E()) {
            recyclerView.post(new C20056WkG(this));
        } else if (!profileMediaTabFragment.A08 || (upG = profileMediaTabFragment.A01) == null) {
            profileMediaTabFragment.A02.A01();
        } else {
            upG.A01();
        }
    }
}
