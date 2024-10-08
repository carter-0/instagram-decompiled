package X;

import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.List;

public final class WZU implements C46202DQe {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WZU(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void Doh(List list) {
        C47173Dro dro;
        UserDetailFragment userDetailFragment;
        C47173Dro dro2;
        if (this.A00 != 0) {
            if (list != null && (dro2 = (C47173Dro) 00k.A0J(list)) != null) {
                C322936we r5 = (C322936we) this.A02;
                AnonymousClass1Nd.A00(r5.A0A).A00(new C321926uy((Reel) this.A01, dro2.A01, true));
                userDetailFragment = r5.A0C;
            } else {
                return;
            }
        } else if (list != null && (dro = (C47173Dro) 00k.A0J(list)) != null) {
            C19491Wad wad = (C19491Wad) this.A02;
            Reel reel = (Reel) this.A01;
            Reel A0F = 1OP.A05(wad.A02).A0F(dro);
            if (A0F != null) {
                reel = A0F;
            }
            C19491Wad.A00(reel, wad, dro.A01, true);
            userDetailFragment = wad.A04;
        } else {
            return;
        }
        C59689JTv.A07(userDetailFragment.requireContext(), 2131963424);
    }
}
