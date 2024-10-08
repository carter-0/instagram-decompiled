package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.E1l  reason: case insensitive filesystem */
public final class C47417E1l extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ActionSheetFragment";
    public View A00;
    public TextView A01;
    public boolean A02;
    public RecyclerView A03;
    public AnonymousClass0wW A04;
    public final C46835DmB A05 = new C46835DmB();

    public final String getModuleName() {
        return AnonymousClass000.A00(2574);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = view;
        this.A03 = DbX.A0K(view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, false);
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.A05);
            RecyclerView recyclerView2 = this.A03;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(linearLayoutManager);
                return;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final C227842k3 getStatusBarType() {
        return C227842k3.PERSIST;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-697543618);
        C47417E1l.super.onCreate(bundle);
        this.A04 = DbX.A0T(this);
        this.A02 = true;
        AnonymousClass0fD.A09(-1373500174, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2068645825);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.action_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1794132875, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(366275168);
        C47417E1l.super.onPause();
        this.A02 = false;
        AnonymousClass0fD.A09(-1000883304, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(285494348);
        super.onResume();
        AnonymousClass0fD.A09(-891348585, A022);
    }
}
