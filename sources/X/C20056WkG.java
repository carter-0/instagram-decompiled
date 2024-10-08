package X;

import com.instagram.profile.fragment.ProfileMediaTabFragment;

/* renamed from: X.WkG  reason: case insensitive filesystem */
public final /* synthetic */ class C20056WkG implements Runnable {
    public final /* synthetic */ AnonymousClass72A A00;

    public /* synthetic */ C20056WkG(AnonymousClass72A r1) {
        this.A00 = r1;
    }

    public final void run() {
        C16129UpG upG;
        ProfileMediaTabFragment profileMediaTabFragment = this.A00.A00;
        if (!profileMediaTabFragment.A08 || (upG = profileMediaTabFragment.A01) == null) {
            profileMediaTabFragment.A02.A01();
        } else {
            upG.A01();
        }
    }
}
