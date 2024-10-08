package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.android.R;
import java.util.List;

public final class E2J extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "UhlAccountSelectionFragment";
    public AnonymousClass0aP A00;
    public String A01;
    public List A02;
    public boolean A03;

    public final void configureActionBar(2da r2) {
        r2.Eu4(true);
    }

    public final String getModuleName() {
        return "UniversalHackLock";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(455602489);
        E2J.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = 09i.A0A.A02(bundle2);
            this.A02 = bundle2.getParcelableArrayList("UHL_ACCOUNT_SELECTION_ACCOUNTS");
            this.A01 = bundle2.getString("ARG_UHL_ACCOUNT_SELECTION_GET_HELP_LINK", "");
            this.A03 = bundle2.getBoolean("ARG_UHL_ACCOUNT_SELECTION_SHOW_AS_MODAL");
        }
        AnonymousClass0fD.A09(-1120831615, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-118435830);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.uhl_multiple_account_selection);
        ((AbsListView) A0C.requireViewById(R.id.uhl_multiple_account_list)).setAdapter(new C46708Dje(getContext(), this, this, this.A02));
        FP3.A00(A0C.requireViewById(R.id.uhl_multiple_account_get_help), 18, this);
        AnonymousClass0fD.A09(-1899986450, A022);
        return A0C;
    }
}
