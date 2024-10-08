package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* renamed from: X.NUz  reason: case insensitive filesystem */
public final class C68739NUz extends NJT implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A0D;
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeEnterCodeFragment";
    public C62320sa A00 = new C73908Plj(this, 46);
    public final C319956rV A01 = NJT.A01(this, 34);
    public final C319956rV A02;
    public final C319956rV A03;
    public final C319956rV A04;
    public final C319956rV A05;
    public final C319956rV A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final C319956rV A0A;
    public final C252213ok A0B;
    public final AnonymousClass3E6 A0C;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        super.configureActionBar(r3);
        r3.ART(true);
        r3.setIsLoading(false);
    }

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
        double d;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((IgdsHeadline) AnonymousClass7TF.A0F(requireView(), R.id.enter_code_headline)).setHeadline(2131961667);
        this.A0C.A9Y(this.A0B);
        ViewGroup A0I = DbX.A0I(view, R.id.container);
        AnonymousClass0eM r3 = this.A07;
        if (!C66582MXn.A1Y(r3) || !AnonymousClass65A.A02(C66581MXm.A0S(r3), 36315949952274243L)) {
            d = 0.75d;
        } else {
            d = 0.85d;
        }
        C71145Oe2.A05(A0I, this, d);
        if (C66582MXn.A1Y(r3)) {
            C51969G9p.A1M(C66940MfZ.A01(this.A05, this, A0D, 5));
        }
    }

    static {
        Class<C68739NUz> cls = C68739NUz.class;
        A0D = new AnonymousClass0YZ[]{C66580MXl.A16(cls, "actionBar", "getActionBar()Lcom/instagram/actionbar/ActionBarService;"), C66580MXl.A16(cls, "bottomButtons", "getBottomButtons()Lcom/instagram/igds/components/bottombutton/IgdsBottomButtonLayout;"), C66580MXl.A16(cls, "confirmationCodeEditText", "getConfirmationCodeEditText()Lcom/instagram/ui/widget/edittext/ConfirmationCodeEditText;"), C66580MXl.A16(cls, "errorText", "getErrorText()Landroid/widget/TextView;"), C66580MXl.A16(cls, "descriptionText", "getDescriptionText()Landroid/widget/TextView;"), C66580MXl.A16(cls, "loadingSpinner", "getLoadingSpinner()Landroid/view/View;"), C66580MXl.A16(cls, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;")};
    }

    public static final ConfirmationCodeEditText A0B(C68739NUz nUz) {
        return (ConfirmationCodeEditText) C66940MfZ.A01(nUz.A0A, nUz, A0D, 2);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.NUz, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void afterOnViewCreated() {
        String str;
        AnonymousClass0eM r3 = this.A08;
        DbZ.A1C(this, new MGY(this, (AnonymousClass4D7) null, 44), ((C67712MtR) r3.getValue()).A0B);
        DbZ.A1C(this, new MG9(this, (AnonymousClass4D7) null, 30), ((C67712MtR) r3.getValue()).A0E);
        Dba.A15(this, ((C67712MtR) r3.getValue()).A01, new C74193PqZ(this, 39), 27);
        NJT.A07((C3021461u) C66940MfZ.A01(this.A02, this, A0D, 1), this, 22);
        C71273OhE.A00(A0B(this), this, 2);
        A0B(this).setImportantForAutofill(8);
        A0B(this).setOnEditorActionListener(C71481OlW.A00);
        A0B(this).requestFocus();
        0nA.A0R(A0B(this));
        boolean A1Z = AnonymousClass7TF.A1Z(this.A09);
        Integer A012 = C71145Oe2.A01(this);
        boolean A1Y = C66582MXn.A1Y(this.A07);
        C68714NUa nUa = ((C67712MtR) r3.getValue()).A06;
        if (A1Z) {
            str = "DB_DROP";
        } else {
            str = "NORMAL_RESTORE";
        }
        C68714NUa.A05(nUa, str);
        nUa.A0B("OTC_ENTER_PIN_IMPRESSION");
        nUa.A0D("RESTORE_TYPE", "OTC");
        nUa.A0C("INTERVAL", AnonymousClass7TG.A0A(A012));
        nUa.A0E("IS_OTC_V2", A1Y);
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
        return NJT.A09(this.A06, this, A0D, 6);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, X.NUz, java.lang.Object] */
    public C68739NUz() {
        C73908Plj plj = new C73908Plj(this, 45);
        C73908Plj plj2 = new C73908Plj(this, 42);
        0eO r6 = 0eO.A02;
        AnonymousClass0eM A002 = C73908Plj.A00(plj2, r6, 43);
        this.A08 = DbS.A0I(new C73908Plj(A002, 44), plj, new C73664Phd(49, A002, (Object) null), DbS.A0z(C67712MtR.class));
        this.A07 = C73908Plj.A00(this, r6, 38);
        this.A0C = AnonymousClass3E4.A01(this, false, false);
        this.A0B = new C72237Oz5(this, 1);
        this.A09 = AnonymousClass1YB.A00(new C73908Plj(this, 47));
        this.A02 = NJT.A01(this, 35);
        this.A0A = NJT.A01(this, 36);
        this.A04 = NJT.A01(this, 39);
        this.A03 = NJT.A01(this, 37);
        this.A05 = NJT.A01(this, 40);
        this.A06 = NJT.A01(this, 41);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1940959709);
        C68739NUz.super.onCreate(bundle);
        if (!C66582MXn.A1Y(this.A07)) {
            ((C67712MtR) this.A08.getValue()).A0E(false);
        }
        06F.A00(this, "resendRequestKey", new C59110J6s(this, 14));
        AnonymousClass0fD.A09(1476212315, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-615040536);
        0qQ.A0B(layoutInflater, 0);
        C68739NUz.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_enter_code_fragment, viewGroup, false);
        AnonymousClass0fD.A09(794323178, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-776952603);
        super.onDestroy();
        C67712MtR mtR = (C67712MtR) this.A08.getValue();
        PU8.A00(mtR.A02, mtR.A03, mtR, 7);
        AnonymousClass0fD.A09(2091554187, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-830986116);
        super.onDestroyView();
        this.A0C.EEH(this.A0B);
        AnonymousClass0fD.A09(175449511, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1919346047);
        C68739NUz.super.onStart();
        JTP.A18(this, this.A0C);
        AnonymousClass0fD.A09(1456513993, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1739979542);
        C68739NUz.super.onStop();
        this.A0C.onStop();
        AnonymousClass0fD.A09(1508875835, A022);
    }
}
