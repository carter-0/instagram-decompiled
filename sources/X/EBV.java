package X;

import com.instagram.profile.fragment.UserDetailFragment;

public final class EBV extends 1P0 {
    public final /* synthetic */ UserDetailFragment A00;

    public EBV(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(334030854);
        0qQ.A0B(this.A00.A0I, 0);
        02m.A0p.markerPoint(962534132, "pro_dash_query_end");
        AnonymousClass0fD.A0A(-572574880, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1411386911);
        AnonymousClass371 r8 = (AnonymousClass371) obj;
        int A032 = AnonymousClass0fD.A03(-204351122);
        UserDetailFragment userDetailFragment = this.A00;
        String str = ((C46419Deg) r8.FH3()).A01;
        String str2 = ((C46419Deg) r8.FH3()).A00;
        boolean z = ((C46419Deg) r8.FH3()).A02;
        C322486vu r0 = userDetailFragment.A0z.A0P;
        r0.A0M = str;
        r0.A0L = str2;
        r0.A0P = z;
        AnonymousClass0fD.A0A(1621476427, A032);
        AnonymousClass0fD.A0A(-133574936, A03);
    }
}
