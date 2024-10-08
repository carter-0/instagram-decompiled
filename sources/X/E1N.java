package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

public final class E1N extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectInboxMessageSettingsFragment";
    public RecyclerView A00;
    public UserSession A01;
    public IgLinearLayout A02;
    public boolean A03;

    public final String getModuleName() {
        return "DIRECT_INBOX_BUSINESS_TOOLS";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, false);
        RecyclerView A0F = DbZ.A0F(view, R.id.direct_inbox_message_settings_recycler_view);
        0qQ.A0B(A0F, 0);
        this.A00 = A0F;
        A0F.setAdapter(new C46846DmN(this.A03));
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            IgLinearLayout igLinearLayout = (IgLinearLayout) view.findViewById(R.id.direct_inbox_message_settings_armadillo_title_container);
            0qQ.A0B(igLinearLayout, 0);
            this.A02 = igLinearLayout;
            if (this.A03) {
                TextView A0B = DbW.A0B(igLinearLayout, R.id.direct_inbox_message_setting_armadillo_title);
                IgLinearLayout igLinearLayout2 = this.A02;
                if (igLinearLayout2 != null) {
                    TextView A0B2 = DbW.A0B(igLinearLayout2, R.id.direct_inbox_message_setting_armadillo_subtitle);
                    DbT.A18(requireContext(), A0B, 2131959795);
                    DbT.A18(requireContext(), A0B2, 2131959794);
                    IgLinearLayout igLinearLayout3 = this.A02;
                    if (igLinearLayout3 != null) {
                        igLinearLayout3.setVisibility(0);
                        return;
                    }
                }
                str = "titleContainer";
            } else {
                return;
            }
        } else {
            str = "recyclerView";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1844826827);
        E1N.super.onCreate(bundle);
        UserSession A0V = DbX.A0V(this);
        0qQ.A0B(A0V, 0);
        this.A01 = A0V;
        AnonymousClass0fD.A09(1258873148, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(234145258);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_message_settings_panel, viewGroup, false);
        AnonymousClass0fD.A09(832282754, A022);
        return inflate;
    }
}
