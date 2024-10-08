package X;

import android.util.SparseArray;
import com.instagram.business.promote.activity.PromoteActivity;

/* renamed from: X.UcK  reason: case insensitive filesystem */
public final class C15408UcK extends C361158fl {
    public final int A00;
    public final Object A01;

    public C15408UcK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A04(C268654dm r5) {
        PromoteActivity promoteActivity;
        switch (this.A00) {
            case 0:
                promoteActivity = (PromoteActivity) this.A01;
                WT9.A01(C15414UcQ.A00, C18137VmD.A00(promoteActivity), "launch_bfa_from_native_failed");
                C13990Tnq.A0M(promoteActivity.A07).A0R(C16678UzE.OBJECTIVE.toString(), "initial_fetch");
                PromoteActivity.A03(promoteActivity);
                break;
            case 1:
                promoteActivity = (PromoteActivity) this.A01;
                PromoteActivity.A03(promoteActivity);
                WT9.A01(C15414UcQ.A00, C18137VmD.A00(promoteActivity), "launch_posm_2_from_native_failed");
                break;
            default:
                return;
        }
        PromoteActivity.A04(promoteActivity);
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        PromoteActivity promoteActivity;
        C229382nI A012;
        int i = this.A00;
        C46620Di0 A0Q = DbV.A0Q(obj);
        switch (i) {
            case 0:
                promoteActivity = (PromoteActivity) this.A01;
                WT9.A01(C15414UcQ.A00, C18137VmD.A00(promoteActivity), "launch_bfa_from_native_success");
                C13990Tnq.A0M(promoteActivity.A07).A0R(C16678UzE.OBJECTIVE.toString(), "initial_fetch");
                break;
            case 1:
                promoteActivity = (PromoteActivity) this.A01;
                WT9.A01(C15414UcQ.A00, C18137VmD.A00(promoteActivity), "launch_posm_2_from_native_success");
                promoteActivity.A03 = true;
                break;
            default:
                A012 = (C229382nI) this.A01;
                break;
        }
        PromoteActivity.A03(promoteActivity);
        A012 = C229382nI.A01((SparseArray) null, promoteActivity, new 0xG("promoted_posts"), AnonymousClass7TE.A0l(promoteActivity.A0A));
        C48382Edd.A00(A012, A0Q);
    }
}
