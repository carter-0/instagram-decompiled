package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NKi  reason: case insensitive filesystem */
public final class C68489NKi extends C273374mT implements C268594df, C74476PvW {
    public static final String __redex_internal_original_name = "LoginActivityMapBottomSheetFragment";
    public C249703kE A00;
    public C70972OTt A01;

    public final int AhP(Context context) {
        return 0;
    }

    public final int AqL() {
        return -2;
    }

    public final View C4U() {
        return null;
    }

    public final int C8P() {
        return 0;
    }

    public final float CMx() {
        return 0.8f;
    }

    public final boolean CPc() {
        return false;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void CxT() {
    }

    public final void CxU(C70972OTt oTt) {
    }

    public final void D5X(C70972OTt oTt) {
    }

    public final void D91(C70972OTt oTt) {
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final String getModuleName() {
        return "loginactivity";
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final /* synthetic */ float CoU() {
        return 0.8f;
    }

    public final void afterOnResume() {
        super.afterOnResume();
        2eQ.A02(this.A00.itemView.findViewById(R.id.title_message));
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-55449004);
        C68489NKi.super.onCreate(bundle);
        this.A01 = C70972OTt.A00(requireArguments());
        AnonymousClass0fD.A09(263414155, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(488145231);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.login_activity_map_bottom_sheet);
        C67882MwQ A002 = ORR.A00(requireContext(), (ViewGroup) A0C, true);
        this.A00 = A002;
        ORR.A01(requireContext(), this.A01, this, A002, true);
        AnonymousClass0fD.A09(1650883144, A02);
        return A0C;
    }
}
