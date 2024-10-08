package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.common.session.UserSession;

/* renamed from: X.UbW  reason: case insensitive filesystem */
public final class C15378UbW extends AnonymousClass4DH implements C273414mX {
    public static final String __redex_internal_original_name = "PromoteAbandonmentCouponBottomSheetFragment";
    public WGU A00;
    public C18641Vvg A01;
    public VMW A02;
    public PromoteData A03;
    public UserSession A04;
    public Integer A05 = AnonymousClass05K.A00;

    public final void Cyf() {
    }

    public final String getModuleName() {
        return "promote_abandonment_coupon_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        PromoteEnrollCouponInfo.PromoteEnrollCouponStatus promoteEnrollCouponStatus;
        View.OnClickListener wbh;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        PromoteData promoteData = this.A03;
        PromoteEnrollCouponInfo.PromoteEnrollCouponStatus promoteEnrollCouponStatus2 = null;
        if (promoteData != null) {
            PromoteEnrollCouponInfo promoteEnrollCouponInfo = promoteData.A0t;
            this.A05 = AnonymousClass05K.A00;
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.abandonment_coupon_bottom_sheet_title);
            Resources A052 = DbV.A05(this);
            PromoteData promoteData2 = this.A03;
            if (promoteData2 != null) {
                PromoteEnrollCouponInfo promoteEnrollCouponInfo2 = promoteData2.A0t;
                if (promoteEnrollCouponInfo2 != null) {
                    str = promoteEnrollCouponInfo2.A0A;
                } else {
                    str = null;
                }
                DbY.A0y(A052, A0R, str, 2131970101);
                DbU.A1A(DbV.A05(this), AnonymousClass7TG.A0R(view, R.id.abandonment_coupon_bottom_sheet_body), 2131970100);
                View A0G = AnonymousClass7TF.A0G(view, R.id.abandonment_coupon_discard_button_row);
                TextView A0R2 = AnonymousClass7TG.A0R(A0G, R.id.promote_bottom_sheet_button_text);
                DbU.A1A(DbV.A05(this), A0R2, 2131970099);
                DbT.A17(requireContext(), A0R2, 2Yu.A03(getContext()));
                C18887WAz.A00(A0G, 67, this);
                A0G.setClickable(true);
                View A0G2 = AnonymousClass7TF.A0G(view, R.id.abandonment_coupon_use_credit_button_row);
                DbU.A1A(DbV.A05(this), AnonymousClass7TG.A0R(A0G2, R.id.promote_bottom_sheet_button_text), 2131970102);
                if (promoteEnrollCouponInfo != null) {
                    promoteEnrollCouponStatus = promoteEnrollCouponInfo.A00();
                } else {
                    promoteEnrollCouponStatus = null;
                }
                if (promoteEnrollCouponStatus == PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.ACTIVE_IMPRESSION) {
                    wbh = new WB4(7, promoteEnrollCouponInfo, A0G2, this);
                } else {
                    if (promoteEnrollCouponInfo != null) {
                        promoteEnrollCouponStatus2 = promoteEnrollCouponInfo.A00();
                    }
                    if (promoteEnrollCouponStatus2 == PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.HAS_ENROLLED) {
                        wbh = new WBH(54, (Object) A0G2, (Object) this);
                    }
                    A0G2.setClickable(true);
                    return;
                }
                AnonymousClass0fU.A00(wbh, A0G2);
                A0G2.setClickable(true);
                return;
            }
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cyc() {
        int intValue = this.A05.intValue();
        if (intValue == 0) {
            return;
        }
        if (intValue == 1) {
            C13990Tnq.A0h();
            UZM uzm = new UZM();
            Bundle bundle = new Bundle();
            bundle.putSerializable("step", C16678UzE.OBJECTIVE);
            bundle.putBoolean("is_enter_flow_nux", true);
            uzm.setArguments(bundle);
            VMW vmw = this.A02;
            if (vmw != null) {
                C15321UaT uaT = vmw.A00;
                if (uaT.getActivity() != null) {
                    FragmentActivity requireActivity = uaT.requireActivity();
                    PromoteData promoteData = uaT.A0A;
                    if (promoteData == null) {
                        0qQ.A0F("promoteData");
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        DbY.A14(uzm, requireActivity, promoteData.A0y);
                    }
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A04;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, androidx.fragment.app.Fragment, X.UbW] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(878636089);
        C15378UbW.super.onCreate(bundle);
        PromoteData A002 = XAI.A00(this);
        this.A03 = A002;
        UserSession userSession = A002.A0y;
        this.A04 = userSession;
        if (userSession != null) {
            this.A01 = new C18641Vvg(requireContext(), this, userSession);
            UserSession userSession2 = this.A04;
            if (userSession2 != null) {
                this.A00 = WGU.A00(userSession2);
                AnonymousClass0fD.A09(885827478, A022);
                return;
            }
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1035887036);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_abandonment_coupon_bottom_sheet_view, false);
        AnonymousClass0fD.A09(831946522, A022);
        return A0D;
    }
}
