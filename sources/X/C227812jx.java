package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.2jx  reason: invalid class name and case insensitive filesystem */
public abstract class C227812jx extends AnonymousClass4DH implements AnonymousClass4DV {
    public static final String SAVED_STATE_USE_RECYCLERVIEW = "USE_RECYCLERVIEW";
    public static final String __redex_internal_original_name = "IgListFragmentCompat";
    public C231272rL mAdapter;
    public C231402rc mAdapterDataObserver;
    public View mEmptyView;
    public C238133Ar mScrollingViewProxy;
    public boolean mShouldRestoreDefaultTheme = true;
    public Boolean mUseRecyclerView;

    public Boolean getUseRecyclerViewFromQE() {
        return null;
    }

    public void onListViewCreated(ListView listView) {
    }

    public void onRecyclerViewCreated(RecyclerView recyclerView) {
    }

    private C238133Ar initializeScrollingView() {
        C238133Ar r0 = this.mScrollingViewProxy;
        if (r0 != null) {
            return r0;
        }
        View view = this.mView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(16908298);
            if (viewGroup == null) {
                viewGroup = (ViewGroup) this.mView.findViewById(R.id.recycler_view);
            }
            C238133Ar A00 = C238103Ao.A00(viewGroup);
            if (A00.CWN()) {
                this.mUseRecyclerView = false;
            } else {
                this.mUseRecyclerView = true;
                onRecyclerViewCreated((RecyclerView) viewGroup);
            }
            C231272rL r1 = this.mAdapter;
            if (r1 != null && A00.AZK() == null) {
                A00.ENw(r1);
            }
            return A00;
        }
        throw new IllegalStateException("Cannot initialize scrolling view. Fragment not created yet or destroyed already");
    }

    public C231272rL getAdapter() {
        C238133Ar r1 = this.mScrollingViewProxy;
        C231272rL r0 = this.mAdapter;
        if (r0 != null || r1 == null) {
            return r0;
        }
        C231272rL AZK = r1.AZK();
        this.mAdapter = AZK;
        return AZK;
    }

    public View getEmptyView() {
        return this.mEmptyView;
    }

    public final C238133Ar getScrollingViewProxy() {
        C238133Ar r0 = this.mScrollingViewProxy;
        if (r0 != null) {
            return r0;
        }
        C238133Ar initializeScrollingView = initializeScrollingView();
        this.mScrollingViewProxy = initializeScrollingView;
        return initializeScrollingView;
    }

    public boolean getShouldRestoreDefaultTheme() {
        return this.mShouldRestoreDefaultTheme;
    }

    public void hideEmptyView() {
        View view = this.mEmptyView;
        C238133Ar r1 = this.mScrollingViewProxy;
        if (r1 != null && view != null && view.getVisibility() == 0) {
            view.setVisibility(8);
            r1.CEd().setVisibility(0);
        }
    }

    public final boolean isUsingRecyclerView() {
        Boolean bool = this.mUseRecyclerView;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("To call this method, implement getUseRecyclerViewFromQE()");
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1899922399);
        0lq.A02("IgListFragmentCompat.onCreate");
        try {
            C227812jx.super.onCreate(bundle);
            if (bundle == null || !bundle.containsKey(SAVED_STATE_USE_RECYCLERVIEW)) {
                this.mUseRecyclerView = getUseRecyclerViewFromQE();
            } else {
                this.mUseRecyclerView = Boolean.valueOf(bundle.getBoolean(SAVED_STATE_USE_RECYCLERVIEW));
            }
        } finally {
            0lq.A01();
            AnonymousClass0fD.A09(1618656787, A02);
        }
    }

    public final C238133Ar optScrollingViewProxy() {
        return this.mScrollingViewProxy;
    }

    public final void setAdapter(C231272rL r2) {
        this.mAdapter = r2;
        C238133Ar r0 = this.mScrollingViewProxy;
        if (r0 != null) {
            r0.ENw(r2);
        }
        if (r2 instanceof 2Rw) {
            AnonymousClass3D3 r02 = new AnonymousClass3D3(this, r2);
            this.mAdapterDataObserver = r02;
            ((2Rw) r2).registerAdapterDataObserver(r02);
        }
    }

    public final void setEmptyViewForRecyclerView(View view) {
        C238133Ar r1 = this.mScrollingViewProxy;
        if (r1 == null) {
            throw new IllegalStateException("View hasn't been created yet");
        } else if (!r1.CWN()) {
            ViewParent parent = r1.CEd().getParent();
            if (parent instanceof ViewGroup) {
                this.mEmptyView = view;
                view.setVisibility(8);
                ((ViewGroup) parent).addView(this.mEmptyView);
                return;
            }
            throw new IllegalStateException("Cannot support empty view if RecyclerView doesn't have a ViewGroup parent");
        }
    }

    public void showEmptyView() {
        View view = this.mEmptyView;
        C238133Ar r2 = this.mScrollingViewProxy;
        if (r2 != null && view != null && view.getVisibility() == 8) {
            view.setVisibility(0);
            r2.CEd().setVisibility(8);
        }
    }

    public void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        super.afterOnCreateView(layoutInflater, viewGroup, bundle, view);
        if (view != null) {
            this.mScrollingViewProxy = initializeScrollingView();
            View findViewById = view.findViewById(16908292);
            C238133Ar r1 = this.mScrollingViewProxy;
            if (r1.CWN()) {
                ((AdapterView) r1.CEd()).setEmptyView(findViewById);
            }
            this.mEmptyView = findViewById;
        }
    }

    public final RecyclerView getRecyclerView() {
        C238133Ar scrollingViewProxy = getScrollingViewProxy();
        if (!scrollingViewProxy.CWN()) {
            return (RecyclerView) scrollingViewProxy.CEd();
        }
        throw new IllegalStateException("view is ListView");
    }

    public void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(832726903);
        super.onDestroyView();
        C238133Ar r0 = this.mScrollingViewProxy;
        if (r0 != null) {
            r0.AHq();
            this.mScrollingViewProxy.ENw((C231272rL) null);
            this.mScrollingViewProxy = null;
        }
        this.mEmptyView = null;
        AnonymousClass0fD.A09(-778606502, A02);
    }

    public void onDetach() {
        int A02 = AnonymousClass0fD.A02(362850148);
        C227812jx.super.onDetach();
        AnonymousClass0fD.A09(2138233040, A02);
    }

    public void onResume() {
        int A02 = AnonymousClass0fD.A02(-1304108535);
        super.onResume();
        setColorBackgroundDrawable();
        this.mShouldRestoreDefaultTheme = true;
        AnonymousClass0fD.A09(-480400389, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Boolean bool = this.mUseRecyclerView;
        if (bool != null) {
            bundle.putBoolean(SAVED_STATE_USE_RECYCLERVIEW, bool.booleanValue());
        }
    }

    public void setColorBackgroundDrawable() {
        requireActivity().getWindow().setBackgroundDrawable(new ColorDrawable(2Yu.A0F(getContext(), 16842801)));
    }

    public void onAttach(Context context) {
        C227812jx.super.onAttach(context);
    }

    public void setShouldRestoreDefaultTheme(boolean z) {
        this.mShouldRestoreDefaultTheme = z;
    }
}
