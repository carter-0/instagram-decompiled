package X;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.NUy  reason: case insensitive filesystem */
public final class C68738NUy extends NJT implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A08;
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeWaitFragment";
    public CountDownTimer A00;
    public IgdsBottomButtonLayout A01;
    public C62320sa A02 = new C73663Phc(this, 12);
    public final C319956rV A03;
    public final C319956rV A04;
    public final C319956rV A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (IgdsBottomButtonLayout) view.requireViewById(R.id.bottom_buttons);
        C52810Gd2 gd2 = new C52810Gd2(this);
        this.A00 = gd2;
        gd2.start();
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A01;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A01;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setSecondaryActionText(getString(2131961668));
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A01;
        if (igdsBottomButtonLayout3 != null) {
            C71407Ok6.A02(igdsBottomButtonLayout3, this, 25);
            NJT.A07(igdsBottomButtonLayout3, this, 26);
        }
    }

    static {
        Class<C68738NUy> cls = C68738NUy.class;
        A08 = new AnonymousClass0YZ[]{C66580MXl.A16(cls, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;"), C66580MXl.A16(cls, "descriptionText", "getDescriptionText()Landroid/widget/TextView;"), C66580MXl.A16(cls, "loadingSpinner", "getLoadingSpinner()Landroid/view/View;")};
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.NUy, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void afterOnViewCreated() {
        AnonymousClass0eM r4 = this.A07;
        DbZ.A1C(this, new MGY(this, (AnonymousClass4D7) null, 45), ((C67711MtQ) r4.getValue()).A09);
        Dba.A15(this, ((C67711MtQ) r4.getValue()).A02, new C74193PqZ(this, 42), 28);
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
        return NJT.A08(this.A05, this, A08);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.NUy, java.lang.Object] */
    public C68738NUy() {
        0eO r2 = 0eO.A02;
        this.A06 = NJT.A03(this, r2, 5);
        C73663Phc phc = new C73663Phc(this, 11);
        AnonymousClass0eM A032 = NJT.A03(new C73663Phc(this, 8), r2, 9);
        this.A07 = DbS.A0I(new C73663Phc(A032, 10), phc, C73915Plq.A00(A032, (Object) null, 0), DbS.A0z(C67711MtQ.class));
        this.A05 = NJT.A02(this, 7);
        this.A03 = NJT.A02(this, 4);
        this.A04 = NJT.A02(this, 6);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1651144218);
        C68738NUy.super.onCreate(bundle);
        AnonymousClass0eM r5 = this.A07;
        C68714NUa nUa = ((C67711MtQ) r5.getValue()).A07;
        nUa.A0B("OTC_RESTORE_WAIT_IMPRESSION");
        nUa.A0E("IS_OTC_V2", true);
        C67711MtQ mtQ = (C67711MtQ) r5.getValue();
        PU8.A00(mtQ.A03, mtQ.A05, mtQ, 8);
        ((C67711MtQ) r5.getValue()).A0E(false);
        06F.A00(this, "resendRequestKey", new C59110J6s(this, 16));
        06F.A00(this, "back_press_key", new C59110J6s(this, 17));
        AnonymousClass0fD.A09(-1470916593, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(84811976);
        0qQ.A0B(layoutInflater, 0);
        C68738NUy.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_otc_wait_fragment, viewGroup, false);
        IgdsHeadline A0O = C66584MXp.A0O(inflate);
        A0O.setHeadline(2131961692);
        A0O.setImageResource(R.drawable.ig_illustrations_illo_one_time_code1_refresh);
        C71145Oe2.A05(DbX.A0I(inflate, R.id.container), this, NJT.A00(C66581MXm.A0S(this.A06)));
        AnonymousClass0fD.A09(638599278, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1112379578);
        super.onDestroy();
        C67711MtQ mtQ = (C67711MtQ) this.A07.getValue();
        1a8 r3 = mtQ.A05;
        PU8.A00(mtQ.A04, r3, mtQ, 9);
        1xN r2 = mtQ.A00;
        if (r2 == null) {
            0qQ.A0F("fetchPakeMessagesListener");
            throw AnonymousClass00P.createAndThrow();
        }
        PU8.A00(mtQ.A03, r3, r2, 11);
        AnonymousClass0fD.A09(514949207, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(114611585);
        super.onDestroyView();
        this.A01 = null;
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer == null) {
            0qQ.A0F("countDownTimer");
            throw AnonymousClass00P.createAndThrow();
        }
        countDownTimer.cancel();
        AnonymousClass0fD.A09(1009228823, A022);
    }
}
