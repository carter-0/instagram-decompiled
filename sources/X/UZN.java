package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class UZN extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteSearchAddressFragment";
    public EditText A00;
    public RecyclerView A01;
    public WGU A02;
    public C17325VRe A03;
    public C14794U9o A04;
    public X3O A05;
    public final TextWatcher A06 = new W7b(this, 7);
    public final WOX A07 = new WOX(this);
    public final C17956Vin A08 = new C17956Vin();
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        C13992Tns.A0r(r2, 2131970325);
    }

    public final String getModuleName() {
        return "promote_search_address";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EditText A0E = DbU.A0E(view, R.id.search_bar_edit_text);
        this.A00 = A0E;
        String str = "searchEditText";
        if (A0E != null) {
            A0E.setHint(2131970325);
            EditText editText = this.A00;
            if (editText != null) {
                editText.addTextChangedListener(this.A06);
                EditText editText2 = this.A00;
                if (editText2 != null) {
                    WBB.A01(editText2, 55, this);
                    this.A01 = DbZ.A0F(view, R.id.typeahead_recycler_view);
                    C14794U9o u9o = new C14794U9o(this.A07);
                    this.A04 = u9o;
                    RecyclerView recyclerView = this.A01;
                    if (recyclerView == null) {
                        str = "addressTypeaheadRecyclerView";
                    } else {
                        recyclerView.setAdapter(u9o);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, androidx.fragment.app.Fragment, X.UZN] */
    public final void onCreate(Bundle bundle) {
        C17325VRe vRe;
        int A022 = AnonymousClass0fD.A02(-1519717030);
        UZN.super.onCreate(bundle);
        AnonymousClass0eM r1 = this.A09;
        this.A02 = JTU.A0D(r1);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            vRe = new C17325VRe(activity, this, AnonymousClass7TE.A0l(r1));
        } else {
            vRe = null;
        }
        this.A03 = vRe;
        AnonymousClass0fD.A09(1466500603, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1936267091);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_search_address, viewGroup, false);
        AnonymousClass0fD.A09(-394619300, A022);
        return inflate;
    }
}
