package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

public final class ECW extends 1P0 {
    public final /* synthetic */ C320106rm A00;
    public final /* synthetic */ C322886wZ A01;
    public final /* synthetic */ String A02;

    public ECW(C320106rm r1, C322886wZ r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(1660765177);
        C320106rm r1 = this.A00;
        r1.A0E("fetch_request_fail");
        r1.A00.A01();
        this.A01.A03.A0L(C322496vv.Closed);
        AnonymousClass0fD.A0A(1658028097, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(147274567);
        this.A01.A03.A0L(C322496vv.Loading);
        AnonymousClass0fD.A0A(-88486284, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(-404109375);
        C46417Dee dee = (C46417Dee) obj;
        int A0D = AnonymousClass7TG.A0D(dee, 328515264);
        C320106rm r1 = this.A00;
        r1.A0E("fetch_request_end");
        C46329Dbx.A00(r1);
        C322886wZ r4 = this.A01;
        UserDetailFragment userDetailFragment = r4.A02;
        User user = userDetailFragment.A10.A03;
        if (user == null) {
            i = 1378816365;
        } else {
            user.A03.EPK(Boolean.valueOf(dee.A04));
            user.A03.EY2(Boolean.valueOf(dee.A06));
            if (dee.A00().isEmpty()) {
                r4.A03.A0L(C322496vv.Closed);
            } else {
                userDetailFragment.A11(dee.A00());
                r4.A03.A0L(C322496vv.Open);
                0Aj A0e = AnonymousClass7TE.A0e(r4.A00, "self_profile_chaining_unit_impression");
                DbS.A1K(A0e, this.A02);
                AnonymousClass7TH.A0V(A0e);
            }
            i = -2140006551;
        }
        AnonymousClass0fD.A0A(i, A0D);
        AnonymousClass0fD.A0A(-2136175907, A03);
    }
}
