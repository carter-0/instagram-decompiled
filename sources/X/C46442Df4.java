package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Df4  reason: case insensitive filesystem */
public final class C46442Df4 extends 1P0 {
    public final /* synthetic */ C320106rm A00;
    public final /* synthetic */ C3250870z A01;

    public C46442Df4(C320106rm r1, C3250870z r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-1041308756);
        C320106rm r1 = this.A00;
        r1.A0E("fetch_request_fail");
        r1.A00.A01();
        C3250870z r12 = this.A01;
        C3250870z.A01(r12, 16916327);
        r12.A08.A0L(C322496vv.Closed);
        AnonymousClass0fD.A0A(-301642148, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(968632944);
        this.A01.A08.A0L(C322496vv.Loading);
        AnonymousClass0fD.A0A(2045449603, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(510050867);
        C46417Dee dee = (C46417Dee) obj;
        int A0D = AnonymousClass7TG.A0D(dee, -1822011219);
        C320106rm r1 = this.A00;
        r1.A0E("fetch_request_end");
        C46329Dbx.A00(r1);
        C3250870z r5 = this.A01;
        C3250870z.A01(r5, 16915493);
        if (!dee.A00().isEmpty()) {
            UserDetailFragment userDetailFragment = r5.A07;
            userDetailFragment.A11(dee.A00());
            r5.A08.A0L(C322496vv.Open);
            0Aj A0e = AnonymousClass7TE.A0e(r5.A04, "self_profile_chaining_unit_impression");
            DbS.A1K(A0e, userDetailFragment.getModuleName());
            AnonymousClass7TH.A0V(A0e);
        } else {
            r5.A08.A0L(C322496vv.Closed);
        }
        AnonymousClass0fD.A0A(-475605609, A0D);
        AnonymousClass0fD.A0A(-761019767, A03);
    }
}
