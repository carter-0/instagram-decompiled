package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class K4V extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SeriesSelectionSheetFragment";
    public ViewGroup A00;
    public RecyclerView A01;
    public MSV A02;
    public View A03;
    public ViewGroup A04;
    public C323716xz A05;
    public C63642L1e A06;
    public final C60411Jl4 A07 = new 2Rw();
    public final AnonymousClass0eM A08 = C227642jf.A01(this);

    public final void A01(Integer num) {
        String str;
        if (this.mView == null) {
            this.A06 = new C63642L1e(num);
            return;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            A00(false);
            if (intValue != 2) {
                ViewGroup viewGroup = this.A00;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                    RecyclerView recyclerView = this.A01;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                        return;
                    }
                    str = "recyclerView";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            } else {
                ViewGroup viewGroup2 = this.A00;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
            }
            str = "errorStateContainer";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        A00(true);
        ViewGroup viewGroup3 = this.A00;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(8);
        }
        str = "errorStateContainer";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
            return;
        }
        str = "recyclerView";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "selection_sheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = DbZ.A0F(view, R.id.recycler_view);
        this.A04 = DbS.A0E(view, R.id.loading_state_container);
        this.A00 = DbS.A0E(view, R.id.error_state_container);
        this.A05 = C63297Kug.A00(requireContext(), true);
        View requireViewById = view.requireViewById(R.id.loading_spinner);
        C323716xz r0 = this.A05;
        if (r0 == null) {
            str = "spinnerDrawable";
        } else {
            requireViewById.setBackground(r0);
            this.A03 = requireViewById;
            LY6.A01(view.findViewById(R.id.retry), 6, this);
            RecyclerView recyclerView = this.A01;
            str = "recyclerView";
            if (recyclerView != null) {
                recyclerView.setAdapter(this.A07);
                RecyclerView recyclerView2 = this.A01;
                if (recyclerView2 != null) {
                    DbU.A15(getContext(), recyclerView2, 1, false);
                    C63642L1e l1e = this.A06;
                    if (l1e != null) {
                        A01(l1e.A00);
                    }
                    this.A06 = null;
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A00(boolean z) {
        C323716xz r1 = this.A05;
        if (z) {
            if (r1 != null) {
                r1.A02(true);
                C323716xz r12 = this.A05;
                if (r12 != null) {
                    r12.A01(1.0f);
                    ViewGroup viewGroup = this.A04;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                        RecyclerView recyclerView = this.A01;
                        if (recyclerView != null) {
                            recyclerView.setVisibility(8);
                            return;
                        }
                        0qQ.A0F("recyclerView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            0qQ.A0F("spinnerDrawable");
            throw AnonymousClass00P.createAndThrow();
        }
        if (r1 != null) {
            r1.A02(false);
            ViewGroup viewGroup2 = this.A04;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                RecyclerView recyclerView2 = this.A01;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                    return;
                }
                0qQ.A0F("recyclerView");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F("spinnerDrawable");
        throw AnonymousClass00P.createAndThrow();
        0qQ.A0F("loadingStateContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-500470524);
        K4V.super.onCreate(bundle);
        AnonymousClass0fD.A09(-1712917613, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(550330760);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.selection_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(852497860, A022);
        return inflate;
    }
}
