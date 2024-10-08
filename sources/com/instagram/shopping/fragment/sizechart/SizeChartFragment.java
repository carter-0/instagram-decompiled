package com.instagram.shopping.fragment.sizechart;

import X.0nA;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13988Tno;
import X.C13990Tnq;
import X.C14806UAc;
import X.C17376VTd;
import X.C18517VtG;
import X.C227642jf;
import X.C252063oV;
import X.C255913uv;
import X.C273494mf;
import X.C320236s2;
import X.C51966G9m;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbX;
import X.EVS;
import X.JTO;
import X.JTP;
import X.U9m;
import X.UFK;
import X.VWZ;
import X.WB0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;
import com.instagram.model.shopping.sizechart.SizeChart;
import java.util.Iterator;
import java.util.List;

public final class SizeChartFragment extends AnonymousClass4DH implements C273494mf {
    public C17376VTd A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public RecyclerView mRowHeadersColumn;
    public View mTopLeftFixedSpace;
    public ViewPager mViewPager;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "instagram_shopping_sizing_chart";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((ConstraintLayout) view).setMaxHeight((int) (((float) C13990Tnq.A0A(this)) * 0.5f));
        View requireViewById = view.requireViewById(R.id.top_left_fixed_space);
        this.mTopLeftFixedSpace = requireViewById;
        0qQ.A07(requireViewById);
        this.mRowHeadersColumn = DbT.A0I(view, R.id.row_headers_column);
        this.mViewPager = view.requireViewById(R.id.size_chart_pager);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            C18517VtG vtG = new C18517VtG(requireContext(), (SizeChart) C320236s2.A00(bundle2, SizeChart.class, "size_chart_model"));
            List A1J = C51966G9m.A1J(vtG.A03);
            ViewPager viewPager = this.mViewPager;
            0qQ.A0A(viewPager);
            viewPager.setOffscreenPageLimit(C51966G9m.A06(A1J));
            ViewPager viewPager2 = this.mViewPager;
            0qQ.A0A(viewPager2);
            C17376VTd vTd = this.A00;
            if (vTd != null) {
                viewPager2.setAdapter(new UFK(vTd, A1J));
                int size = A1J.size();
                AnonymousClass7TG.A0R(view, R.id.bottom_sheet_title).setText(2131973914);
                ImageView A0J = DbX.A0J(view, R.id.bottom_sheet_back_button);
                A0J.setImageResource(R.drawable.instagram_arrow_back_24);
                A0J.setContentDescription(getString(2131953555));
                C13988Tno.A0q(requireContext(), A0J, 16843534);
                WB0.A00(A0J, 0, this);
                C255913uv r1 = (C255913uv) AnonymousClass7TF.A0F(view, R.id.bottom_sheet_page_indicator);
                int i = 8;
                if (size > 1) {
                    i = 0;
                }
                r1.setVisibility(i);
                if (size > 1) {
                    r1.A01(0, size);
                    ViewPager viewPager3 = this.mViewPager;
                    0qQ.A0A(viewPager3);
                    viewPager3.A0J(r1);
                }
                RecyclerView recyclerView = this.mRowHeadersColumn;
                0qQ.A0A(recyclerView);
                DbU.A15(requireContext(), recyclerView, 1, false);
                RecyclerView recyclerView2 = this.mRowHeadersColumn;
                0qQ.A0A(recyclerView2);
                VWZ vwz = vtG.A01;
                recyclerView2.A11(new C14806UAc(recyclerView2.getContext(), 1));
                recyclerView2.setAdapter(new U9m(vwz, 1));
                C17376VTd vTd2 = this.A00;
                if (vTd2 != null) {
                    RecyclerView recyclerView3 = this.mRowHeadersColumn;
                    0qQ.A0A(recyclerView3);
                    vTd2.A01.add(recyclerView3);
                    recyclerView3.A15(vTd2.A00);
                    0nA.A0V(requireViewById, vtG.A02.A00);
                    return;
                }
            }
            0qQ.A0F("verticalScrollSynchronizer");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        C17376VTd vTd = this.A00;
        if (vTd == null) {
            0qQ.A0F("verticalScrollSynchronizer");
            throw AnonymousClass00P.createAndThrow();
        }
        Iterator it = vTd.A01.iterator();
        while (it.hasNext()) {
            if (JTP.A1Y(JTO.A0H(it))) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1782694416);
        SizeChartFragment.super.onCreate(bundle);
        this.A00 = new C17376VTd();
        AnonymousClass0fD.A09(-482210495, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-329432954);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.size_chart, viewGroup, false);
        AnonymousClass0fD.A09(-1037321656, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(-1750033376);
        super.onDestroyView();
        C17376VTd vTd = this.A00;
        if (vTd == null) {
            0qQ.A0F("verticalScrollSynchronizer");
            throw AnonymousClass00P.createAndThrow();
        }
        RecyclerView recyclerView = this.mRowHeadersColumn;
        0qQ.A0A(recyclerView);
        vTd.A01.remove(recyclerView);
        recyclerView.A16(vTd.A00);
        SizeChartFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(212260780, A02);
    }
}
