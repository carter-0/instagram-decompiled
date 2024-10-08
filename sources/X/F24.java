package X;

import android.content.Context;
import com.instagram.profile.fragment.UserDetailTabController;

public final class F24 {
    public final /* synthetic */ FOW A00;
    public final /* synthetic */ boolean A01;

    public F24(FOW fow, boolean z) {
        this.A00 = fow;
        this.A01 = z;
    }

    public final void A00() {
        boolean z = !this.A01;
        FOW fow = this.A00;
        C49789F6x.A00((Context) fow.A03, (F12) fow.A06, z);
        C51028FnK fnK = (C51028FnK) fow.A04;
        fnK.A05.A1A(z);
        UserDetailTabController userDetailTabController = fnK.A04;
        if (userDetailTabController != null) {
            userDetailTabController.A0F();
        }
    }
}
