package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class MYR extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IgRecyclerFragment";
    public AnonymousClass2t9 adapter;
    public OIC config;
    public C3253572b errorEmptyStateBindings;
    public OBB layoutProvider;
    public C3253572b loadingBindings;
    public JXP loadingState = JXP.LOADED;
    public RecyclerView recyclerView;
    public RefreshableNestedScrollingParent refreshableNestedScrollingParent;

    public final void addOnScrollListener(C249403jg r2) {
        0qQ.A0B(r2, 0);
        getRecyclerView().A15(r2);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.OID] */
    public final OID configBuilder(0sP r2) {
        0qQ.A0B(r2, 0);
        ? obj = new Object();
        r2.invoke(obj);
        return obj;
    }

    public abstract Collection getDefinitions();

    public abstract OID getRecyclerConfigBuilder();

    public final boolean isModelClass(int i, Class... clsArr) {
        0qQ.A0B(clsArr, 1);
        return getAdapter().A09(i, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    public void onViewCreated(View view, Bundle bundle) {
        AnonymousClass3AR r1;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        OIC oic = this.config;
        if (oic != null) {
            if (oic.A08) {
                view.setPadding(0, 2Yu.A0G(view.getContext(), R.attr.actionBarHeight), 0, 0);
            }
            AnonymousClass2tC A00 = AnonymousClass2t9.A00(requireActivity());
            A00.A0C.addAll(getAllDefinitions());
            OIC oic2 = this.config;
            if (oic2 != null) {
                if (oic2.A0C) {
                    A00.A0A = true;
                }
                setAdapter(A00.A00());
                RecyclerView recyclerView2 = getRecyclerView();
                OIC oic3 = this.config;
                if (oic3 != null) {
                    C252553pI r12 = oic3.A01;
                    if (r12 == null) {
                        r12 = new LinearLayoutManager(recyclerView2.getContext(), 1, false);
                    }
                    recyclerView2.setLayoutManager(r12);
                    recyclerView2.setAdapter(getAdapter());
                    OIC oic4 = this.config;
                    if (oic4 != null) {
                        if (oic4.A0B) {
                            recyclerView2.setItemAnimator((AnonymousClass3AS) null);
                        }
                        OIC oic5 = this.config;
                        if (oic5 != null) {
                            if (oic5.A09) {
                                AnonymousClass3AS r13 = recyclerView2.A0C;
                                if ((r13 instanceof AnonymousClass3AR) && (r1 = (AnonymousClass3AR) r13) != null) {
                                    r1.A00 = false;
                                }
                            }
                            if (oic5.A0A) {
                                recyclerView2.A0S = true;
                            }
                            AnonymousClass3B3 r0 = oic5.A00;
                            if (r0 != null) {
                                recyclerView2.A11(r0);
                            }
                            if (isPullToRefreshEnabled()) {
                                RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = (RefreshableNestedScrollingParent) view.findViewById(R.id.refreshable_container);
                                refreshableNestedScrollingParent2.A07 = new PRN(this, 0);
                                this.refreshableNestedScrollingParent = refreshableNestedScrollingParent2;
                            }
                            OIC oic6 = this.config;
                            if (oic6 != null) {
                                C3253572b r3 = oic6.A05;
                                if (r3 == null) {
                                    r3 = new C3253572b();
                                    requireContext().getColor(2Yu.A0H(getContext(), R.attr.igds_color_secondary_background));
                                }
                                this.loadingBindings = r3;
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("config");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void removeOnScrollListener(C249403jg r2) {
        0qQ.A0B(r2, 0);
        getRecyclerView().A16(r2);
    }

    public final void setAdapter(AnonymousClass2t9 r2) {
        0qQ.A0B(r2, 0);
        this.adapter = r2;
    }

    public final void setLoadingBindings(C3253572b r2) {
        0qQ.A0B(r2, 0);
        this.loadingBindings = r2;
    }

    public final void toUnit(Object obj) {
    }

    private final boolean getShowFetchRetryView() {
        OIC oic = this.config;
        if (oic != null) {
            return AnonymousClass7TF.A1V(oic.A07);
        }
        0qQ.A0F("config");
        throw AnonymousClass00P.createAndThrow();
    }

    private final boolean isPullToRefreshEnabled() {
        OIC oic = this.config;
        if (oic != null) {
            return AnonymousClass7TF.A1V(oic.A06);
        }
        0qQ.A0F("config");
        throw AnonymousClass00P.createAndThrow();
    }

    private final boolean isPullingToRefresh() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.refreshableNestedScrollingParent;
        if (refreshableNestedScrollingParent2 != null) {
            return refreshableNestedScrollingParent2.A0B;
        }
        return false;
    }

    public final void A0B(List list) {
        updateUi(JXP.LOADED, list);
    }

    public final void finishRefreshing() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.refreshableNestedScrollingParent;
        if (refreshableNestedScrollingParent2 != null) {
            refreshableNestedScrollingParent2.setRefreshing(false);
        }
    }

    public final AnonymousClass2t9 getAdapter() {
        AnonymousClass2t9 r0 = this.adapter;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C3253572b getErrorEmptyStateBindings() {
        return this.errorEmptyStateBindings;
    }

    public final C3253572b getLoadingBindings() {
        C3253572b r0 = this.loadingBindings;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("loadingBindings");
        throw AnonymousClass00P.createAndThrow();
    }

    public final JXP getLoadingState() {
        return this.loadingState;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            return recyclerView2;
        }
        C66580MXl.A19();
        throw AnonymousClass00P.createAndThrow();
    }

    public final RefreshableNestedScrollingParent getRefreshableNestedScrollingParent() {
        return this.refreshableNestedScrollingParent;
    }

    private final Collection getAllDefinitions() {
        ArrayList A0U = 00k.A0U(getDefinitions());
        if (getShowFetchRetryView()) {
            if (!(A0U instanceof Collection) || !A0U.isEmpty()) {
                Iterator it = A0U.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next() instanceof C68571NNs) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            OIC oic = this.config;
            if (oic != null) {
                C62320sa r1 = oic.A07;
                0qQ.A0A(r1);
                if (this.config != null) {
                    A0U.add(new C68571NNs(r1));
                }
            }
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        if (this.config != null) {
            if (!(A0U instanceof Collection) || !A0U.isEmpty()) {
                Iterator it2 = A0U.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof C68569NNq) {
                        return A0U;
                    }
                }
            }
            A0U.add(new Object());
            return A0U;
        }
        0qQ.A0F("config");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void notifyItemChanged(int i) {
        getAdapter().notifyItemChanged(i);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1651739160);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        OID recyclerConfigBuilder = getRecyclerConfigBuilder();
        OBB obb = recyclerConfigBuilder.A02;
        C62320sa r15 = recyclerConfigBuilder.A06;
        C62320sa r13 = recyclerConfigBuilder.A07;
        boolean z = recyclerConfigBuilder.A08;
        AnonymousClass3B3 r11 = recyclerConfigBuilder.A00;
        boolean z2 = recyclerConfigBuilder.A09;
        C3253572b r9 = recyclerConfigBuilder.A05;
        C3253572b r8 = recyclerConfigBuilder.A03;
        C3253572b r3 = recyclerConfigBuilder.A04;
        boolean z3 = recyclerConfigBuilder.A0C;
        boolean z4 = recyclerConfigBuilder.A0A;
        boolean z5 = recyclerConfigBuilder.A0B;
        boolean z6 = z;
        boolean z7 = z2;
        C62320sa r16 = r15;
        C62320sa r17 = r13;
        OBB obb2 = obb;
        C3253572b r132 = r9;
        AnonymousClass3B3 r10 = r11;
        C252553pI r112 = recyclerConfigBuilder.A01;
        OIC oic = new OIC(r10, r112, obb2, r132, r8, r3, r16, r17, z6, z7, z3, z4, z5);
        this.config = oic;
        OBB obb3 = oic.A02;
        if (obb3 == null) {
            C62320sa r0 = oic.A06;
            int i = R.layout.ig_recycler_fragment;
            if (r0 != null) {
                i = R.layout.ig_refreshable_recycler_fragment;
            }
            obb3 = new OBB(i, R.id.recycler_view);
        }
        this.layoutProvider = obb3;
        View inflate = layoutInflater2.inflate(obb3.A00, viewGroup, false);
        OBB obb4 = this.layoutProvider;
        if (obb4 == null) {
            0qQ.A0F("layoutProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        this.recyclerView = DbZ.A0F(inflate, obb4.A01);
        AnonymousClass0fD.A09(898111261, A02);
        return inflate;
    }

    public final void updateUi(JXP jxp, List list) {
        C320156rr r0;
        Object npa;
        AnonymousClass7TG.A1N(jxp, list);
        if (this.config != null) {
            if (isPullingToRefresh() && (jxp == JXP.LOADED || jxp == JXP.ERROR)) {
                finishRefreshing();
            }
            OIC oic = this.config;
            if (oic != null) {
                this.loadingState = jxp;
                C3253572b r4 = oic.A03;
                C3253572b r3 = oic.A04;
                ArrayList A1D = AnonymousClass7TE.A1D(list);
                if (!getShowFetchRetryView() || jxp != JXP.ERROR) {
                    if (this.config != null) {
                        if (jxp == JXP.LOADING) {
                            r4 = getLoadingBindings();
                            r0 = C320156rr.LOADING;
                        } else {
                            if (r4 != null && jxp == JXP.LOADED && A1D.isEmpty()) {
                                r0 = C320156rr.EMPTY;
                            }
                            JTR.A1L(getAdapter(), A1D);
                            return;
                        }
                        npa = new NPA(r4, r0);
                    }
                } else if (!list.isEmpty() || r3 == null) {
                    npa = new Object();
                } else {
                    npa = new NPA(r3, C320156rr.ERROR);
                }
                A1D.add(npa);
                JTR.A1L(getAdapter(), A1D);
                return;
            }
        }
        0qQ.A0F("config");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setErrorEmptyStateBindings(C3253572b r1) {
        this.errorEmptyStateBindings = r1;
    }
}
