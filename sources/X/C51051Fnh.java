package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fnh  reason: case insensitive filesystem */
public final class C51051Fnh implements G8B {
    public final int A00;
    public final Object A01;

    public C51051Fnh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A00() {
        C56541I0s A002;
        1YZ r0 = 1YZ.A02;
        if (r0 != null && (A002 = r0.A00()) != null) {
            FV7 fv7 = (FV7) this.A01;
            A002.A01(fv7.A04, fv7.A06, fv7.A07, fv7.A0C);
        }
    }

    public final void CyN() {
        switch (this.A00) {
            case 2:
                FV7.A02((FV7) this.A01, true);
                return;
            case 3:
                C49863FAf.A00((C49863FAf) this.A01, true);
                return;
            default:
                return;
        }
    }

    public final void D5S() {
    }

    public final void DED() {
        if (8 - this.A00 == 0) {
            ((0sP) this.A01).invoke(AnonymousClass7TE.A0u());
        }
    }

    public final void Doy() {
        if (2 - this.A00 == 0) {
            A00();
        }
    }

    public final void onCancel() {
        switch (this.A00) {
            case 0:
                ((C74385Pu1) this.A01).D0M(2);
                return;
            case 2:
                A00();
                return;
            default:
                return;
        }
    }

    public final void onSuccess() {
        1Wj r2;
        String str;
        switch (this.A00) {
            case 0:
            case 3:
                return;
            case 1:
                C72369P3i.A00((C72369P3i) this.A01);
                return;
            case 2:
                FV7 fv7 = (FV7) this.A01;
                FragmentActivity activity = fv7.A04.getActivity();
                AnonymousClass0iw r1 = fv7.A05;
                User user = fv7.A0C;
                UserSession userSession = fv7.A07;
                0xI A002 = 0xI.A00(r1, "report_user");
                A002.A0C("actor_id", userSession.A06);
                A002.A0C("action", "ACTION_BLOCK_UNBLOCK_USER");
                A002.A0C("target_id", user.getId());
                A002.A0C("follow_status", AnonymousClass7TF.A0j(user.B6o().toString()));
                C17119VIp.A00(activity, A002, userSession);
                DbU.A1R(A002, userSession);
                if (user.CPV() && (r2 = 1Wj.A00) != null) {
                    FragmentActivity fragmentActivity = fv7.A02;
                    if (user.CPm()) {
                        str = "2333587946872064";
                    } else {
                        str = "308597689866606";
                    }
                    r2.A03(userSession, fragmentActivity, str);
                    return;
                }
                return;
            case 4:
                DbT.A1I((Fragment) this.A01);
                return;
            case 5:
                C47437E2j e2j = (C47437E2j) this.A01;
                FragmentActivity activity2 = e2j.getActivity();
                if (activity2 != null && 1Wj.A00 != null) {
                    DcL.A00().A03(AnonymousClass7TE.A0l(e2j.A08), activity2, "1062958464864852");
                    return;
                }
                return;
            case 8:
                ((0sP) this.A01).invoke(AnonymousClass7TE.A0v());
                return;
            default:
                DbS.A1U(this.A01);
                return;
        }
    }
}
