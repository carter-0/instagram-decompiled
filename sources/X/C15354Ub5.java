package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ub5  reason: case insensitive filesystem */
public final class C15354Ub5 extends AnonymousClass4DH implements AnonymousClass4DU, C273494mf, C20954X6h {
    public static final String __redex_internal_original_name = "CombinedTagsListFragment";
    public Fragment A00;
    public 1Xj A01;
    public C16293UsB A02;
    public C17644Vba A03;
    public XCE A04;
    public String A05;
    public String A06;
    public IgSegmentedTabLayout A07;
    public String A08;
    public final Map A09 = new EnumMap(C16553Ux0.class);
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final C19222WQc A0B = new C19222WQc(this, 2);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C16553Ux0 ux0;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewPager A0F = AnonymousClass7TF.A0F(view, R.id.view_pager);
        A0F.A0J(new UFP(this, this));
        IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) view.requireViewById(R.id.view_switcher);
        this.A07 = igSegmentedTabLayout;
        String str = "segmentedTabLayout";
        if (igSegmentedTabLayout != null) {
            DbT.A16(requireContext(), igSegmentedTabLayout, 2Yu.A02(requireContext()));
            0hq childFragmentManager = getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            IgSegmentedTabLayout igSegmentedTabLayout2 = this.A07;
            if (igSegmentedTabLayout2 != null) {
                this.A02 = new C16293UsB(childFragmentManager, A0F, this, igSegmentedTabLayout2);
                1Xj r1 = this.A01;
                if (r1 != null) {
                    ArrayList arrayList = new ArrayList();
                    AnonymousClass0eM r2 = this.A0A;
                    UpcomingEvent A27 = r1.A27(AnonymousClass7TE.A0l(r2));
                    if (A27 == null || !C18810W3l.A0B(A27)) {
                        ux0 = C16553Ux0.UPCOMING_EVENT;
                    } else {
                        ux0 = C16553Ux0.SCHEDULED_LIVE;
                    }
                    if (C243203Xv.A00(AnonymousClass7TE.A0l(r2), r1)) {
                        arrayList.add(ux0);
                        this.A09.put(ux0, "upcoming_event");
                    }
                    r2.getValue();
                    int i = 0;
                    1Xj r12 = this.A01;
                    if (r12 != null && r12.A4u() && !r12.A6T(AnonymousClass7TE.A0l(r2))) {
                        C16553Ux0 ux02 = C16553Ux0.PRODUCTS;
                        arrayList.add(ux02);
                        this.A09.put(ux02, "products");
                    }
                    1Xj r0 = this.A01;
                    if (r0 != null && r0.A4s()) {
                        C16553Ux0 ux03 = C16553Ux0.PEOPLE;
                        arrayList.add(ux03);
                        this.A09.put(ux03, AnonymousClass000.A00(2563));
                    }
                    if (arrayList.size() == 1) {
                        IgSegmentedTabLayout igSegmentedTabLayout3 = this.A07;
                        if (igSegmentedTabLayout3 != null) {
                            igSegmentedTabLayout3.setVisibility(8);
                        }
                    }
                    C16293UsB usB = this.A02;
                    if (usB == null) {
                        str = "tabFragmentPagerAdapter";
                    } else {
                        if (arrayList.contains(ux0)) {
                            i = arrayList.indexOf(ux0);
                        }
                        usB.A00(arrayList, i);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        ArrayList A3E;
        String id;
        UpcomingEvent A27;
        C16553Ux0 ux0 = (C16553Ux0) obj;
        int A022 = DbU.A02(ux0, 0);
        if (A022 == 1) {
            Fragment fragment = this.A00;
            if (fragment != null) {
                return fragment;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (A022 == 0) {
            C249713kF.A00.A0T();
            UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
            1Xj r5 = this.A01;
            if (r5 != null) {
                String str = this.A06;
                Bundle bundle = new Bundle();
                bundle.putString("media_id", r5.getId());
                bundle.putSerializable("media_type", r5.BR7());
                bundle.putString("prior_module", getModuleName());
                bundle.putBoolean(AnonymousClass000.A00(4005), false);
                if (r5.A3E() == null) {
                    A3E = new ArrayList();
                } else {
                    A3E = r5.A3E();
                }
                bundle.putParcelableArrayList(AnonymousClass000.A00(800), new ArrayList(A3E));
                DbU.A1D(bundle, A0l);
                bundle.putString("shopping_session_id", str);
                E6X e6x = new E6X();
                e6x.setArguments(bundle);
                return e6x;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (A022 == 2 || A022 == 3) {
            C63468KxX.A00();
            AnonymousClass0eM r3 = this.A0A;
            0qQ.A0B(r3.getValue(), 0);
            UserSession A0l2 = AnonymousClass7TE.A0l(r3);
            1Xj r0 = this.A01;
            if (r0 == null || (id = r0.getId()) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String str2 = this.A05;
            if (str2 == null) {
                0qQ.A0F("priorModule");
                throw AnonymousClass00P.createAndThrow();
            }
            1Xj r2 = this.A01;
            if (r2 != null && (A27 = r2.A27(AnonymousClass7TE.A0l(r3))) != null) {
                return C17114VIk.A00(A0l2, this.A04, A27, id, str2, AnonymousClass000.A00(799), false, false, false);
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            throw C66582MXn.A0k(ux0, "Invalid tabModel: ", new StringBuilder());
        }
    }

    public final /* bridge */ /* synthetic */ C49627Ezk C3n(Object obj) {
        C16553Ux0 ux0 = (C16553Ux0) obj;
        0qQ.A0B(ux0, 0);
        return new C49627Ezk((Drawable) null, requireContext().getString(ux0.A00), (CharSequence) null, -1, false);
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

    public final String getModuleName() {
        String str = this.A05;
        if (str != null) {
            return str;
        }
        0qQ.A0F("priorModule");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
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
        C16293UsB usB = this.A02;
        if (usB == null) {
            0qQ.A0F("tabFragmentPagerAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        C273494mf item = usB.getItem(usB.A01.getSelectedIndex());
        0qQ.A07(item);
        0qQ.A0C(item, AnonymousClass000.A00(7));
        return item.isScrolledToTop();
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C273494mf r0 = this.A00;
        if (r0 != null) {
            r0.onBottomSheetPositionChanged(i, i2);
        }
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
        int i;
        int A022 = AnonymousClass0fD.A02(1419511357);
        C15354Ub5.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A06 = bundle2.getString("shopping_session_id");
            this.A05 = JTP.A0m(bundle2, "prior_module_name");
            this.A08 = bundle2.getString("prior_submodule_name");
            1sy serializable = bundle2.getSerializable("media_surface");
            String string = bundle2.getString("media_id");
            AnonymousClass0eM r1 = this.A0A;
            1Xj A023 = DbX.A0d(r1).A02(string);
            if (A023 == null) {
                DbX.A10(getActivity(), AnonymousClass37D.A00);
                i = 1461099480;
            } else {
                this.A01 = A023;
                if (A023.A4u() && !A023.A6T(AnonymousClass7TE.A0l(r1))) {
                    this.A00 = C249713kF.A00.A0T().A0F(AnonymousClass7TE.A0l(r1), A023, this, serializable, new C19643Wd6(this), (C16560UxC) null, (Integer) null, (String) null, this.A06, this.A08, (List) null);
                }
                DbX.A0R(r1).A01(this.A0B, C323956yN.class);
                i = 574548398;
            }
            AnonymousClass0fD.A09(i, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1447992272, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(28907566);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.combined_tags_list_fragment, false);
        AnonymousClass0fD.A09(-1616040887, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1527862475);
        super.onDestroy();
        DbX.A0R(this.A0A).A02(this.A0B, C323956yN.class);
        AnonymousClass0fD.A09(-293487461, A022);
    }
}
