package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class UZA extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "OverflowBottomSheetFragment";
    public SpannableStringBuilder A00;
    public View A01;
    public Boolean A02;
    public boolean A03;
    public RecyclerView A04;
    public AnonymousClass0wW A05;
    public UserSession A06;
    public final C67804Mv8 A07 = new C67804Mv8();
    public final List A08 = new ArrayList();
    public final AnonymousClass03Q A09 = new C14309Ttj(this, 2);

    public final String getModuleName() {
        return AnonymousClass000.A00(2574);
    }

    public final AnonymousClass0wW getSession() {
        return this.A05;
    }

    public final C227842k3 getStatusBarType() {
        return C227842k3.PERSIST;
    }

    public static void A00(UZA uza) {
        if (uza.isAdded() && !uza.mRemoving) {
            List<C17685VcG> list = uza.A08;
            if (!list.isEmpty() || uza.A00 != null) {
                ViewGroup viewGroup = (ViewGroup) uza.getLayoutInflater().inflate(R.layout.feed_action_sheet_header, (ViewGroup) null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
                for (C17685VcG A002 : list) {
                    View inflate = uza.getLayoutInflater().inflate(R.layout.bottomsheet_action_button, (ViewGroup) null);
                    inflate.setLayoutParams(layoutParams);
                    viewGroup.addView(inflate);
                    Us7 us7 = new Us7(inflate);
                    VI8.A00(us7, A002);
                    uza.requireActivity();
                    us7.A00.setVisibility(0);
                }
                if (uza.A03) {
                    ViewGroup A0C = DbU.A0C(uza.A01, R.id.custom_header_view);
                    A0C.addView(viewGroup);
                    A0C.setVisibility(0);
                    ViewStub A0D = DbU.A0D(uza.A01, R.id.action_sheet_nav_bar_divider);
                    A0D.inflate();
                    if (uza.A00 != null) {
                        DbU.A0D(uza.A01, R.id.action_sheet_simple_header).inflate();
                        TextView A0G = DbU.A0G(uza.A01, R.id.action_sheet_subheader_text_view);
                        A0G.setText(uza.A00);
                        A0G.setVisibility(0);
                        A0D.setVisibility(8);
                        DbT.A1F(uza.A01, R.id.action_sheet_header_divider, 8);
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-862439467);
        UZA.super.onCreate(bundle);
        this.A05 = DbS.A0T(C227642jf.A01(this));
        this.A06 = DbX.A0U(this);
        this.A03 = true;
        AnonymousClass0fD.A09(-102739591, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1364455264);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.action_sheet_fragment);
        AnonymousClass0fD.A09(-956975763, A022);
        return A0C;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(637398760);
        UZA.super.onPause();
        this.A03 = false;
        AnonymousClass0fD.A09(1254530472, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1939472676);
        super.onResume();
        if (!this.A03) {
            2eQ.A06(this.A04, 500);
        }
        AnonymousClass0fD.A09(-44898454, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = view;
        Boolean bool = this.A02;
        if (bool != null) {
            view.setFitsSystemWindows(bool.booleanValue());
        }
        Boolean bool2 = this.A02;
        if (bool2 != null && bool2.booleanValue()) {
            AnonymousClass03j.A00(this.A01, this.A09);
        }
        C67804Mv8 mv8 = this.A07;
        mv8.A01 = C52180GHw.A01(this.A01.getContext(), this.A06);
        this.A04 = DbX.A0K(view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, false);
        this.A04.setAdapter(mv8);
        this.A04.setLayoutManager(linearLayoutManager);
        A00(this);
    }
}
