package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.K7k  reason: case insensitive filesystem */
public final class C61435K7k extends AnonymousClass4DH implements C273504mg, C273494mf {
    public static final String __redex_internal_original_name = "GreenscreenMiniGalleryFragment";
    public C60084JfQ A00;
    public ViewPager A01;
    public AnonymousClass37D A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;
    public final int A05 = 200;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final String getModuleName() {
        return "ig_camera_greenscreen_gallery";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewPager requireViewById = view.requireViewById(R.id.greenscreen_category_view_pager);
        requireViewById.setAdapter(this.A00);
        requireViewById.A0J(new FR9(this, 0));
        this.A01 = requireViewById;
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A03, 0), 36327627958663752L)) {
            ((TabLayout) view.requireViewById(R.id.greenscreen_tab_layout)).setSelectedTabIndicator((Drawable) null);
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
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

    public final int getExtraDragSpace() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
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

    public final boolean isScrolledToBottom() {
        08m r2;
        ViewPager viewPager = this.A01;
        if (viewPager != null) {
            r2 = viewPager.getAdapter();
        } else {
            r2 = null;
        }
        0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.ar.core.discovery.greenscreengallery.ui.GreenscreenGalleryCategoryPageAdapter");
        C60084JfQ jfQ = (C60084JfQ) r2;
        AnonymousClass4DH r1 = (AnonymousClass4DH) jfQ.A01.get(jfQ.A00);
        if (r1 instanceof K80) {
            return !((MYR) r1).getRecyclerView().canScrollVertically(1);
        }
        return false;
    }

    public final boolean isScrolledToTop() {
        08m r2;
        ViewPager viewPager = this.A01;
        if (viewPager != null) {
            r2 = viewPager.getAdapter();
        } else {
            r2 = null;
        }
        0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.ar.core.discovery.greenscreengallery.ui.GreenscreenGalleryCategoryPageAdapter");
        C60084JfQ jfQ = (C60084JfQ) r2;
        AnonymousClass4DH r1 = (AnonymousClass4DH) jfQ.A01.get(jfQ.A00);
        if (r1 instanceof K80) {
            return !JTP.A1Y(((MYR) r1).getRecyclerView());
        }
        if (r1 instanceof C74568PxH) {
            return ((C74568PxH) r1).isScrolledToTop();
        }
        return false;
    }

    public final void onBottomSheetClosed() {
        05G r2 = ((C3507486a) this.A04.getValue()).A06;
        if (r2.getValue() == C3507586b.OPEN) {
            r2.Epw(C3507586b.CLOSED);
        }
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        AnonymousClass37D r0 = this.A02;
        if (r0 != null) {
            JTP.A1W(((C3507486a) this.A04.getValue()).A05, r0.A08() - i);
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C61435K7k() {
        0Yh A0z = DbS.A0z(C3507486a.class);
        this.A04 = DbS.A0I(new MMI(this, 26), new MMI(this, 27), new MMZ(33, (Object) null, (Object) this), A0z);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(802928976);
        0qQ.A0B(layoutInflater, 0);
        C61435K7k.super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentActivity requireActivity = requireActivity();
        this.A02 = DbT.A0i(requireActivity);
        0hq childFragmentManager = getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        UserSession A0l = AnonymousClass7TE.A0l(this.A03);
        AnonymousClass0eM r2 = this.A04;
        this.A00 = new C60084JfQ(requireActivity, childFragmentManager, (C3507486a) r2.getValue(), A0l);
        AnonymousClass37D r1 = this.A02;
        if (r1 != null) {
            r1.A0V(true);
        }
        ((C3507486a) r2.getValue()).A06.Epw(C3507586b.OPEN);
        View inflate = layoutInflater.inflate(R.layout.greenscreen_gallery_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(1796914721, A022);
        return inflate;
    }
}
