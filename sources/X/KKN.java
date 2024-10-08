package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class KKN extends K5K implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "AlbumPickerLandingFragment";
    public C55716HmD A00;
    public KKM A01;
    public C361518gM A02;
    public KKO A03;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C331157Pu A002;
        ViewGroup viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C60321JjQ jjQ = this.A00;
        if (jjQ != null) {
            boolean A1a = DbW.A1a(bundle);
            Bundle bundle2 = this.mArguments;
            if (A1a) {
                jjQ.A06.Epw(C60321JjQ.A00(jjQ));
            }
            if (bundle2 != null && bundle2.getBoolean("has_album_picker_config", false)) {
                boolean z = bundle2.getBoolean("args_apc__meta_gallery_enabled");
                bundle2.getBoolean("args_is_photo_only");
                jjQ.A03.A01 = z;
            }
            Bundle A0A = DbV.A0A(AnonymousClass7TF.A0L(this.A01, 0));
            Fragment k5k = new K5K();
            k5k.setArguments(A0A);
            this.A01 = k5k;
            k5k.setDayNightMode(this.dayNightMode);
            0s1 A0C = DbW.A0C(this);
            KKM kkm = this.A01;
            if (kkm == null) {
                0qQ.A0F("albumPickerFragment");
            } else {
                A0C.A09(kkm, R.id.album_picker_child_fragment_container);
                A0C.A00();
                C60321JjQ jjQ2 = this.A00;
                if (jjQ2 != null) {
                    Dba.A16(getViewLifecycleOwner(), DbT.A0G(jjQ2.A06), new C58727Iwa(this, 42), 60);
                    Bundle bundle3 = this.mArguments;
                    if (bundle3 != null && bundle3.getBoolean("args_below_status_bar", false) && (A002 = C48943Emh.A00(DbX.A0i(this))) != null && (viewGroup = A002.A03.bottomSheetContainer) != null) {
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        if (iArr[1] < 0nA.A0A(requireContext())) {
                            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.topMargin = 0nA.A0A(requireContext()) - iArr[1];
                                }
                            } else {
                                marginLayoutParams = null;
                            }
                            viewGroup.setLayoutParams(marginLayoutParams);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C51965G9l.A15();
            }
        } else {
            C51965G9l.A15();
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(KKN kkn) {
        KKO kko = kkn.A03;
        if (kko != null) {
            0s1 A0C = DbW.A0C(kkn);
            int[] iArr = C331127Pr.A1X;
            A0C.A07(iArr[0], iArr[3], 0, 0);
            A0C.A03(kko);
            A0C.A00();
            kkn.A03 = null;
        }
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
        RecyclerView recyclerView;
        String str;
        KKO kko = this.A03;
        if (kko != null) {
            recyclerView = kko.A00;
            if (recyclerView == null) {
                str = "albumsRecyclerview";
            }
            return !JTP.A1Y(recyclerView);
        }
        KKM kkm = this.A01;
        if (kkm == null) {
            str = "albumPickerFragment";
        } else {
            recyclerView = kkm.A00;
            if (recyclerView == null) {
                str = "parentRecyclerview";
            }
            return !JTP.A1Y(recyclerView);
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2036535500);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.album_picker_landing_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(-438128147, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1414703791);
        KKN.super.onPause();
        C60321JjQ jjQ = this.A00;
        if (jjQ != null) {
            jjQ.A00 = null;
            jjQ.A03.A00.A08();
            AnonymousClass0fD.A09(-1146646924, A022);
            return;
        }
        C51965G9l.A15();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(728823698);
        super.onResume();
        C60321JjQ jjQ = this.A00;
        if (jjQ != null) {
            C64586LeU leU = jjQ.A03;
            leU.A00.A09();
            182.A06(0Tu.A05, leU.A03, 36322508357511394L);
            leU.A03();
            C60321JjQ jjQ2 = this.A00;
            if (jjQ2 != null) {
                jjQ2.A00 = this.A02;
                AnonymousClass0fD.A09(-1257622045, A022);
                return;
            }
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        C51965G9l.A15();
        throw AnonymousClass00P.createAndThrow();
    }
}
