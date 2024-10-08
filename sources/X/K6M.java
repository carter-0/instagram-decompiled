package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.igeditseekbar.IgVerticalChunkySlider;

public final class K6M extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "ClipsAudioEnhanceFragment";
    public IgTextView A00;
    public IgVerticalChunkySlider A01;
    public IgTextView A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = DbS.A0I(MMB.A00(this, 3), MMB.A00(this, 0), C66291MMa.A00((Object) null, this, 4), DbS.A0z(AnonymousClass89Z.class));
    public final AnonymousClass0eM A05 = DbS.A0I(MMB.A00(this, 2), MMB.A00(this, 1), C66291MMa.A00((Object) null, this, 3), DbS.A0z(ClipsCreationViewModel.class));
    public final AnonymousClass0eM A06;
    public final String A07;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        float f;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((AnonymousClass89Z) this.A04.getValue()).A06(AnonymousClass05K.A15);
        AnonymousClass0eM r3 = this.A03;
        C60237Jhu jhu = (C60237Jhu) r3.getValue();
        UserSession userSession = jhu.A02;
        0Tu r6 = 0Tu.A06;
        if (182.A06(r6, userSession, 36330432572179069L)) {
            jhu.A00.AUy(new C64343LaI(jhu, 1), true);
        }
        C60237Jhu jhu2 = (C60237Jhu) r3.getValue();
        if (182.A06(r6, jhu2.A02, 36330432572179069L)) {
            jhu2.A01.A00();
        }
        IgVerticalChunkySlider igVerticalChunkySlider = (IgVerticalChunkySlider) view.findViewById(R.id.audio_enhance_slider);
        this.A01 = igVerticalChunkySlider;
        if (igVerticalChunkySlider != null) {
            C65761LzF.A01(igVerticalChunkySlider, this, 2);
            IgTextView A0X = JTO.A0X(view, R.id.done_button);
            this.A02 = A0X;
            if (A0X == null) {
                str = "doneButton";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            LY4.A01(A0X, 3, this);
            this.A00 = JTO.A0X(view, R.id.description);
            C60237Jhu jhu3 = (C60237Jhu) r3.getValue();
            IgVerticalChunkySlider igVerticalChunkySlider2 = this.A01;
            if (igVerticalChunkySlider2 != null) {
                C357618Yx r0 = (C357618Yx) jhu3.A03.A0b.getValue();
                if (r0 != null) {
                    f = r0.A00;
                } else {
                    f = 0.0f;
                }
                igVerticalChunkySlider2.setCurrentValue((int) (f * 100.0f));
                DbZ.A1C(this, new MG9(this, (AnonymousClass4D7) null, 13), jhu3.A06);
                return;
            }
        }
        str = "slider";
        0qQ.A0F(str);
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

    public final String getModuleName() {
        return this.A07;
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

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final boolean onBackPressed() {
        float f;
        27r A0g = C51971G9r.A0g(this.A06);
        A0g.A1Q(A0g.A04.A0C, "AUDIO_ENHANCE_DONE_BUTTON_TAP");
        C60237Jhu jhu = (C60237Jhu) this.A03.getValue();
        ClipsAudioStore clipsAudioStore = jhu.A03;
        Number number = (Number) jhu.A04.A0I.A02();
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        clipsAudioStore.A07(f);
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public K6M() {
        C41656Ay8 ay8 = new C41656Ay8(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, MMB.A00(MMB.A00(this, 4), 5));
        this.A03 = DbS.A0I(MMB.A00(A002, 6), ay8, C66291MMa.A00((Object) null, A002, 5), DbS.A0z(C60237Jhu.class));
        this.A07 = "clips_audio_enhance";
        this.A06 = C227642jf.A02(this);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-419878051);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_audio_enhance_fragment, viewGroup, false);
        AnonymousClass0fD.A09(582017020, A022);
        return inflate;
    }
}
