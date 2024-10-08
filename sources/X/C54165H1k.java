package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import instagram.features.clips.viewer.recipesheet.RecipeSheetParams;
import java.util.List;

/* renamed from: X.H1k  reason: case insensitive filesystem */
public final class C54165H1k extends AnonymousClass4DH implements C273494mf, AnonymousClass08u {
    public static final String __redex_internal_original_name = "RecipeSheetFragment";
    public int A00;
    public 1Xj A01;
    public C331157Pu A02;
    public JQY A03;
    public RecipeSheetParams A04;
    public final List A05 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "recipe_sheet_parent";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        RecipeSheetParams recipeSheetParams = this.A04;
        if (recipeSheetParams != null) {
            bundle.putParcelable("arg_extra_params", recipeSheetParams);
        }
    }

    private final H1H A00() {
        UserSession A0l = AnonymousClass7TE.A0l(this.A06);
        RecipeSheetParams recipeSheetParams = this.A04;
        if (recipeSheetParams == null) {
            0qQ.A0F("params");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = recipeSheetParams.A01;
        int i2 = 2;
        String str = recipeSheetParams.A04;
        long j = recipeSheetParams.A02;
        boolean z = recipeSheetParams.A08;
        boolean z2 = recipeSheetParams.A07;
        String str2 = recipeSheetParams.A06;
        String str3 = recipeSheetParams.A05;
        String str4 = recipeSheetParams.A03;
        int i3 = recipeSheetParams.A00;
        if (i == 2) {
            AnonymousClass7TF.A1D(str, 0, str2);
        } else {
            i2 = 0;
            AnonymousClass7TF.A1D(str, 0, str2);
        }
        RecipeSheetParams recipeSheetParams2 = new RecipeSheetParams(str, str2, str3, str4, i3, i2, j, z, z2);
        0qQ.A0B(A0l, 0);
        H1H h1h = new H1H();
        Bundle A09 = DbY.A09(A0l);
        A09.putParcelable("arg_extra_params", recipeSheetParams2);
        h1h.setArguments(A09);
        h1h.A0C = this.A03;
        this.A05.add(AnonymousClass7TE.A1L(DbU.A0m(this, 2131971364), h1h));
        return h1h;
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
        return DbS.A0T(this.A06);
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

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0.canScrollVertically(-1) == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r1 == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isScrolledToTop() {
        /*
            r5 = this;
            java.util.List r2 = r5.A05
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x003e
            int r1 = r5.A00
            if (r1 < 0) goto L_0x003e
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x003e
            int r0 = r5.A00
            java.lang.Object r0 = r2.get(r0)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r4 = r0.A01
            X.H1H r4 = (X.H1H) r4
            if (r4 == 0) goto L_0x003e
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            r1 = -1
            r3 = 0
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.canScrollVertically(r1)
            r2 = 0
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r2 = 1
        L_0x002e:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            if (r0 == 0) goto L_0x0039
            boolean r1 = r0.canScrollVertically(r1)
            r0 = 0
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            if (r2 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x003f
        L_0x003e:
            r3 = 1
        L_0x003f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54165H1k.isScrolledToTop():boolean");
    }

    public final void onPageSelected(int i) {
        AnonymousClass37D r0;
        this.A00 = i;
        C331157Pu r02 = this.A02;
        if (r02 != null && (r0 = r02.A00) != null) {
            r0.A0V(true);
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
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-212869402);
        C54165H1k.super.onCreate(bundle);
        if (bundle == null) {
            bundle = requireArguments();
        }
        RecipeSheetParams recipeSheetParams = (RecipeSheetParams) bundle.getParcelable("arg_extra_params");
        if (recipeSheetParams != null) {
            this.A04 = recipeSheetParams;
            1E8 A0d = DbX.A0d(this.A06);
            RecipeSheetParams recipeSheetParams2 = this.A04;
            if (recipeSheetParams2 == null) {
                0qQ.A0F("params");
                throw AnonymousClass00P.createAndThrow();
            }
            1Xj A023 = A0d.A02(recipeSheetParams2.A04);
            if (A023 != null) {
                this.A01 = A023;
                AnonymousClass0fD.A09(-2072887919, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Media required.");
            i = -1772111628;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Params required.");
            i = 851143771;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View view;
        int A022 = AnonymousClass0fD.A02(888237105);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        List list = this.A05;
        list.clear();
        RecipeSheetParams recipeSheetParams = this.A04;
        if (recipeSheetParams != null) {
            ViewGroup viewGroup2 = viewGroup;
            if (recipeSheetParams.A01 != 2) {
                AnonymousClass0eM r0 = I76.A02;
                1Xj r02 = this.A01;
                if (r02 == null) {
                    str = "media";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                } else if (DbT.A1b(I76.A05(r02))) {
                    view = layoutInflater2.inflate(R.layout.recipe_sheet_parent_tabbed_fragment, viewGroup2, false);
                    A00();
                    UserSession A0l = AnonymousClass7TE.A0l(this.A06);
                    RecipeSheetParams recipeSheetParams2 = this.A04;
                    if (recipeSheetParams2 != null) {
                        String str2 = recipeSheetParams2.A04;
                        long j = recipeSheetParams2.A02;
                        boolean z = recipeSheetParams2.A08;
                        boolean z2 = recipeSheetParams2.A07;
                        String str3 = recipeSheetParams2.A06;
                        String str4 = recipeSheetParams2.A05;
                        String str5 = recipeSheetParams2.A03;
                        int i = recipeSheetParams2.A00;
                        AnonymousClass7TF.A1D(str2, 0, str3);
                        RecipeSheetParams recipeSheetParams3 = new RecipeSheetParams(str2, str3, str4, str5, i, 1, j, z, z2);
                        0qQ.A0B(A0l, 0);
                        H1H h1h = new H1H();
                        Bundle A09 = DbY.A09(A0l);
                        A09.putParcelable("arg_extra_params", recipeSheetParams3);
                        h1h.setArguments(A09);
                        h1h.A0C = this.A03;
                        list.add(AnonymousClass7TE.A1L(DbU.A0m(this, 2131971362), h1h));
                        0hq childFragmentManager = getChildFragmentManager();
                        0qQ.A07(childFragmentManager);
                        U83 u83 = new U83(childFragmentManager, list);
                        ViewPager A0F = AnonymousClass7TF.A0F(view, R.id.view_pager);
                        A0F.setAdapter(u83);
                        A0F.A0J(this);
                        ((TabLayout) AnonymousClass7TF.A0F(view, R.id.tabs)).setupWithViewPager(A0F);
                        AnonymousClass0fD.A09(1973095521, A022);
                        return view;
                    }
                }
            }
            view = layoutInflater2.inflate(R.layout.recipe_sheet_parent_tabless_fragment, viewGroup2, false);
            0s1 A0C = DbW.A0C(this);
            A0C.A09(A00(), R.id.content_frame);
            A0C.A00();
            0qQ.A0A(view);
            AnonymousClass0fD.A09(1973095521, A022);
            return view;
        }
        str = "params";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-476422876);
        super.onDestroyView();
        this.A05.clear();
        AnonymousClass0fD.A09(795096015, A022);
    }
}
