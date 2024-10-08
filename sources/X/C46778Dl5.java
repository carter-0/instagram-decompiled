package X;

import com.instagram.model.business.ProfileAddressData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Dl5  reason: case insensitive filesystem */
public final class C46778Dl5 extends 2YL {
    public final 05G A00;
    public final List A01;

    public C46778Dl5(List list) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = DbS.A10(list);
    }

    public final void A00(ProfileAddressData profileAddressData) {
        ArrayList A0S;
        String str = profileAddressData.A06;
        if (!0qQ.A0K(str, "primary") || !A02()) {
            05G r2 = this.A00;
            0sn r3 = (Collection) r2.getValue();
            if (r3 == null) {
                r3 = 0sn.A00;
            }
            if (0qQ.A0K(str, "primary")) {
                A0S = 00k.A0S(r3, AnonymousClass7TE.A1I(profileAddressData));
            } else {
                A0S = 00k.A0S(AnonymousClass7TE.A1I(new ProfileAddressData(profileAddressData.A00, profileAddressData.A01, 002.A0O("new:", profileAddressData.hashCode()), profileAddressData.A03, profileAddressData.A04, profileAddressData.A05, profileAddressData.A08, profileAddressData.A07)), r3);
            }
            r2.Epw(A0S);
        }
    }

    public final void A01(ProfileAddressData profileAddressData) {
        String str = profileAddressData.A06;
        05G r5 = this.A00;
        List<ProfileAddressData> list = (List) r5.getValue();
        if (list != null) {
            int i = 0;
            for (ProfileAddressData profileAddressData2 : list) {
                if (!0qQ.A0K(profileAddressData2.A06, str)) {
                    i++;
                } else if (i != -1) {
                    ArrayList A1D = AnonymousClass7TE.A1D(list);
                    A1D.set(i, profileAddressData);
                    r5.Epw(A1D);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean A02() {
        List<ProfileAddressData> list = (List) this.A00.getValue();
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            for (ProfileAddressData profileAddressData : list) {
                if (0qQ.A0K(profileAddressData.A06, "primary")) {
                    return true;
                }
            }
        }
        return false;
    }
}
