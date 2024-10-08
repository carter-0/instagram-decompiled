package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.H1f  reason: case insensitive filesystem */
public final class C54161H1f extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "AchievementsListFragment";
    public NestedScrollView A00;
    public RecyclerView A01;
    public C53428GoK A02;
    public JO1 A03;
    public C55620Hkf A04;
    public SpinnerImageView A05;
    public String A06;
    public String A07;
    public List A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "achievements_list_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0xx A0J = DbV.A0J(this);
        C66165MGc mGc = new C66165MGc(this, view, (AnonymousClass4D7) null, 41);
        19B r2 = 19B.A00;
        1Eo.A05(r2, mGc, A0J);
        1Eo.A05(r2, new C58102ImO(this, (AnonymousClass4D7) null, 0), DbV.A0J(this));
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
        NestedScrollView nestedScrollView = this.A00;
        if (nestedScrollView == null || !nestedScrollView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C54161H1f() {
        C58683Ivs ivs = new C58683Ivs(this, 25);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58683Ivs(new C58683Ivs(this, 26), 27));
        this.A09 = DbS.A0I(new C58683Ivs(A002, 28), ivs, new MMY(48, A002, (Object) null), DbS.A0z(C53041GhZ.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        ArrayList<String> arrayList;
        int A022 = AnonymousClass0fD.A02(-1421598702);
        C54161H1f.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("mediaId");
        } else {
            str = null;
        }
        this.A07 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            arrayList = bundle3.getStringArrayList("achievementIds");
        } else {
            arrayList = null;
        }
        this.A08 = arrayList;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str2 = bundle4.getString("entryPoint");
        }
        this.A06 = str2;
        List list = this.A08;
        if (list != null) {
            C53041GhZ ghZ = (C53041GhZ) this.A09.getValue();
            C53428GoK goK = this.A02;
            String str3 = this.A07;
            if (goK != null) {
                ghZ.A00(goK);
                AnonymousClass7TE.A1Z(new C58104ImQ(goK, ghZ, (AnonymousClass4D7) null, 0), C318116oQ.A00(ghZ));
            } else {
                C318136oS A002 = C318116oQ.A00(ghZ);
                C66174MGl mGl = new C66174MGl((Object) ghZ, (Object) list, str3, (AnonymousClass4D7) null, 28);
                19B r3 = 19B.A00;
                1Eo.A05(r3, new C58102ImO(ghZ, (AnonymousClass4D7) null, 12), C51967G9n.A0M(ghZ, r3, new C58102ImO(ghZ, (AnonymousClass4D7) null, 11), C51967G9n.A0M(ghZ, r3, mGl, A002)));
            }
        }
        AnonymousClass0fD.A09(831885155, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1617327435);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_achievements_list, viewGroup, false);
        this.A00 = (NestedScrollView) inflate.requireViewById(R.id.achievements_scrollview);
        this.A05 = (SpinnerImageView) inflate.requireViewById(R.id.achievements_loading_indicator);
        AnonymousClass0fD.A09(-1907931398, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1392614936);
        super.onDestroyView();
        this.A00 = null;
        this.A05 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(197372988, A022);
    }
}
