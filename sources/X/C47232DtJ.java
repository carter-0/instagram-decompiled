package X;

import com.instagram.model.business.ProfileAddressData;

/* renamed from: X.DtJ  reason: case insensitive filesystem */
public final class C47232DtJ extends AnonymousClass0T0 implements C232262tL {
    public final ProfileAddressData A00;

    public C47232DtJ(ProfileAddressData profileAddressData) {
        0qQ.A0B(profileAddressData, 1);
        this.A00 = profileAddressData;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C47232DtJ) && 0qQ.A0K(this.A00, ((C47232DtJ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        ProfileAddressData profileAddressData = this.A00;
        String str = profileAddressData.A06;
        if (str == null) {
            return 002.A0O("hash:", profileAddressData.hashCode());
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C47232DtJ dtJ = (C47232DtJ) obj;
        0qQ.A0B(dtJ, 0);
        ProfileAddressData profileAddressData = this.A00;
        ProfileAddressData profileAddressData2 = dtJ.A00;
        0qQ.A0B(profileAddressData2, 0);
        if (!0qQ.A0K(profileAddressData.A06, profileAddressData2.A06) || !0qQ.A0K(profileAddressData.A03, profileAddressData2.A03) || !0qQ.A0K(profileAddressData.A04, profileAddressData2.A04) || !0qQ.A0K(profileAddressData.A05, profileAddressData2.A05) || !0qQ.A0K(profileAddressData.A08, profileAddressData2.A08) || !0qQ.A0J(profileAddressData.A00, profileAddressData2.A00) || !0qQ.A0J(profileAddressData.A01, profileAddressData2.A01) || !0qQ.A0K(profileAddressData.A07, profileAddressData2.A07)) {
            return false;
        }
        return true;
    }
}
