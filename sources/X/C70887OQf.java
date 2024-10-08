package X;

import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.OQf  reason: case insensitive filesystem */
public abstract class C70887OQf {
    public static final PrivacyMediaOverlayViewModel A00(C254703su r8) {
        String str;
        C277994w4 BQf;
        C277994w4 BQf2;
        1Xj r0 = r8.A0s;
        C278034w8 r1 = null;
        if (r0 == null || (BQf2 = r0.BQf()) == null) {
            str = null;
        } else {
            str = BQf2.getTitle();
        }
        1Xj r02 = r8.A0s;
        if (!(r02 == null || (BQf = r02.BQf()) == null)) {
            r1 = BQf.BE7();
        }
        return new PrivacyMediaOverlayViewModel(Integer.valueOf(C69760Nrj.A00(r1)), AnonymousClass05K.A00, (String) null, (String) null, str, (String) null, 0, false);
    }

    public static final boolean A01(C254703su r1) {
        C277994w4 BQf;
        1Xj r0;
        C277994w4 BQf2;
        1Xj r02 = r1.A0s;
        if (r02 == null || (BQf = r02.BQf()) == null || BQf.getTitle() == null || (r0 = r1.A0s) == null || (BQf2 = r0.BQf()) == null || BQf2.BE7() == null) {
            return false;
        }
        return true;
    }
}
