package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.UcM  reason: case insensitive filesystem */
public final class C15410UcM extends C361158fl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C15410UcM(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void A04(C268654dm r6) {
        switch (this.A00) {
            case 0:
                WT9.A01(C15414UcQ.A00, C18137VmD.A01((UserSession) this.A03), "launch_posm_1_from_native_failed");
                return;
            case 1:
                C15390Ubt ubt = (C15390Ubt) this.A03;
                W35 w35 = ubt.A03;
                if (w35 == null) {
                    DbS.A12();
                    throw AnonymousClass00P.createAndThrow();
                }
                0xI A002 = W35.A00(w35, "onboarding_navigation_request_completed");
                A002.A0B("network_end_time", C51968G9o.A0u());
                A002.A0C("network_result", "failure");
                W35.A05(A002, w35);
                IgdsBottomButtonLayout igdsBottomButtonLayout = ubt.A01;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
                }
                C59689JTv.A0F((Context) this.A01, "in_app_sign_up_failed", 2131969835);
                return;
            default:
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        String str;
        int i;
        switch (this.A00) {
            case 0:
                C46620Di0 A0Q = DbV.A0Q(obj);
                UserSession userSession = (UserSession) this.A03;
                WT9.A01(C15414UcQ.A00, C18137VmD.A01(userSession), "launch_posm_1_from_native_success");
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                switch (AnonymousClass7TE.A0M(this.A02)) {
                    case 0:
                        str = "promote_prevalidation";
                        break;
                    case 1:
                        i = 351;
                        break;
                    case 2:
                        i = 497;
                        break;
                    case 3:
                        str = "pro2pro_promote_ad_account_linking";
                        break;
                    default:
                        i = 744;
                        break;
                }
                str = AnonymousClass000.A00(i);
                C48382Edd.A00(C229382nI.A01((SparseArray) null, fragmentActivity, new 0xG(str), userSession), A0Q);
                return;
            case 1:
                C46620Di0 A0Q2 = DbV.A0Q(obj);
                C15390Ubt ubt = (C15390Ubt) this.A03;
                W35 w35 = ubt.A03;
                if (w35 == null) {
                    DbS.A12();
                    throw AnonymousClass00P.createAndThrow();
                }
                0xI A002 = W35.A00(w35, "onboarding_navigation_request_completed");
                A002.A0B("network_end_time", C51968G9o.A0u());
                A002.A0C("network_result", RealtimeConstants.SEND_SUCCESS);
                W35.A05(A002, w35);
                C48382Edd.A00((C229382nI) this.A02, A0Q2);
                IgdsBottomButtonLayout igdsBottomButtonLayout = ubt.A01;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
