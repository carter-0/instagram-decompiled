package X;

import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6d2  reason: invalid class name and case insensitive filesystem */
public final class C311656d2 implements C311666d3 {
    public final /* synthetic */ ReelViewerFragment A00;

    public final void Ds9(C255773uh r10, C250973mM r11, C309426Yf r12, String str, String str2, String str3) {
        C250973mM r3 = r11;
        r11.getClass();
        C255773uh r2 = r10;
        if (C297785sK.A0l(r11)) {
            C310016aI r1 = this.A00.A0p;
            r10.getClass();
            r1.A0C(r10, r11, AnonymousClass05K.A0C);
        }
        C310096aQ r0 = this.A00.A1I;
        r10.getClass();
        r12.getClass();
        User user = r10.A0i;
        r0.A02(HLF.BRAND, r2, r3, r12, user, str3, str2, false);
    }

    public C311656d2(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void DsD() {
        ReelViewerFragment.A0I(this.A00, false);
    }
}
