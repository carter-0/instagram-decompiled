package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

public final class K7H extends AnonymousClass4DH implements C268594df, C273494mf {
    public static final C71392co A08 = C71392co.A00();
    public static final String __redex_internal_original_name = "ReelPicsPleaseMediaSelectionFragment";
    public ViewGroup A00;
    public IgdsBottomButtonLayout A01;
    public L7U A02;
    public K6V A03;
    public String A04;
    public View A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final MT1 A07 = new C65772LzQ(this, 2);

    public final int AqL() {
        return -1;
    }

    public final int C8P() {
        return 0;
    }

    public final float CMx() {
        return 0.7f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onAttachFragment(Fragment fragment) {
        K6V k6v;
        0qQ.A0B(fragment, 0);
        if ((fragment instanceof K6V) && (k6v = (K6V) fragment) != null) {
            MT1 mt1 = this.A07;
            k6v.A01 = mt1;
            LPF lpf = k6v.A00;
            if (lpf != null) {
                lpf.A02 = mt1;
            }
            k6v.setDayNightMode(this.dayNightMode);
        }
    }

    public final void onBottomSheetClosed() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A04 != null) {
            ViewGroup A0C = DbU.A0C(view, R.id.media_picker_root_container);
            this.A00 = A0C;
            if (A0C != null) {
                0nA.A0r(A0C, new C65946M5j(this));
            }
            Context context = view.getContext();
            String A16 = AnonymousClass7TE.A16(context, 2131965902);
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.description_text);
            AnonymousClass0eM r5 = this.A06;
            1Av A0h = DbX.A0h(r5);
            0s0 r9 = A0h.A4V;
            AnonymousClass0YZ[] r6 = 1Av.A8a;
            boolean A1a = AnonymousClass7TG.A1a(A0h, r9, r6, 129);
            int i = 2131965901;
            if (A1a) {
                i = 2131965900;
            }
            SpannableStringBuilder A0B = DbZ.A0B(DbW.A0h(context, this.A04, i), A16);
            if (!A1a) {
                AnonymousClass7TF.A1J(A0h, r9, r6, 129, true);
            }
            C62146Kaz kaz = new C62146Kaz(this, context.getColor(R.color.default_cta_dominant_color));
            0qQ.A0A(A0B);
            AnonymousClass7AV.A05(A0B, kaz, A16);
            A0R.setMovementMethod(AnonymousClass6LK.A00);
            A0R.setText(A0B);
            this.A05 = view.requireViewById(R.id.bottom_container);
            0lg A0L = AnonymousClass7TF.A0L(r5, 0);
            K6V k6v = new K6V();
            k6v.setArguments(DbV.A0A(A0L));
            k6v.setDayNightMode(this.dayNightMode);
            0s1 A0C2 = DbW.A0C(this);
            A0C2.A0A(k6v, R.id.fragment_container);
            A0C2.A00();
            this.A03 = k6v;
            IgdsBottomButtonLayout A0c = DbT.A0c(view, R.id.send_bottom_button);
            A0c.setPrimaryActionOnClickListener(new LY3((Object) this, 46));
            this.A01 = A0c;
        }
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final boolean CPc() {
        K6V k6v = this.A03;
        if (k6v != null) {
            return k6v.CPd();
        }
        0qQ.A0F("currentFragment");
        throw AnonymousClass00P.createAndThrow();
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

    public final boolean isScrolledToTop() {
        K6V k6v = this.A03;
        if (k6v != null) {
            return k6v.isScrolledToTop();
        }
        0qQ.A0F("currentFragment");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        View view = this.A05;
        if (view != null) {
            view.setTranslationY((float) ((-i) - i2));
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final int AhP(Context context) {
        return ViewConfiguration.get(getThemedContext()).getScaledTouchSlop();
    }

    public final /* synthetic */ float CoU() {
        return 0.7f;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(39983382);
        K7H.super.onCreate(bundle);
        this.A04 = requireArguments().getString(C273654mx.A00(1358));
        AnonymousClass0fD.A09(466752222, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1613420643);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.pics_please_media_selection_fragment, viewGroup, false);
        AnonymousClass0fD.A09(76258420, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-473751042);
        this.A01 = null;
        this.A00 = null;
        this.A05 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-396107049, A022);
    }
}
