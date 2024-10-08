package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

public final class NV0 extends NJT implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A0I;
    public static final String __redex_internal_original_name = "EncryptedBackupsPinRestoreFragment";
    public Dialog A00;
    public C62320sa A01 = new C73663Phc(this, 42);
    public boolean A02;
    public final long A03 = 150;
    public final C319956rV A04 = NJT.A02(this, 26);
    public final C319956rV A05;
    public final C319956rV A06;
    public final C319956rV A07;
    public final C319956rV A08;
    public final C319956rV A09;
    public final C319956rV A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final C319956rV A0E;
    public final C319956rV A0F;
    public final C252213ok A0G;
    public final AnonymousClass3E6 A0H;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        if (!C71145Oe2.A08(this)) {
            r2.Eu4(true);
            r2.ART(true);
            r2.setIsLoading(this.A02);
        }
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
        if (C71145Oe2.A08(this)) {
            ViewGroup A0I2 = DbX.A0I(view, R.id.container);
            AnonymousClass0eM r1 = this.A0B;
            if (!C66582MXn.A1Y(r1) || !AnonymousClass65A.A02(C66581MXm.A0S(r1), 36315949952274243L)) {
                d = 0.75d;
            } else {
                d = 0.85d;
            }
            C71145Oe2.A05(A0I2, this, d);
        }
        A0C(this).A05((Integer) null, 6, false, true);
        C71273OhE.A00(A0C(this), this, 3);
        A0C(this).A07 = true;
        A0C(this).setImportantForAutofill(8);
        A0C(this).setAutofillHints(new String[]{"notApplicable"});
        this.A0H.A9Y(this.A0G);
        2eS.A01(A0B(this));
        C3021761x.A00(A0B(this));
    }

    static {
        Class<NV0> cls = NV0.class;
        A0I = new AnonymousClass0YZ[]{C66580MXl.A16(cls, "actionBar", "getActionBar()Lcom/instagram/actionbar/ActionBarService;"), C66580MXl.A16(cls, "headline", "getHeadline()Lcom/instagram/igds/components/headline/IgdsHeadline;"), C66580MXl.A16(cls, "confirmationCode", "getConfirmationCode()Lcom/instagram/ui/widget/edittext/ConfirmationCodeEditText;"), C66580MXl.A16(cls, "bodyTextView", "getBodyTextView()Lcom/instagram/common/ui/base/IgTextView;"), C66580MXl.A16(cls, "errorTextView", "getErrorTextView()Lcom/instagram/common/ui/base/IgTextView;"), C66580MXl.A16(cls, "bottomActionContainer", "getBottomActionContainer()Landroid/view/ViewGroup;"), C66580MXl.A16(cls, "bottomActionButtonView", "getBottomActionButtonView()Lcom/instagram/common/ui/base/IgTextView;"), C66580MXl.A16(cls, "ctaLoadingSpinner", "getCtaLoadingSpinner()Lcom/instagram/ui/widget/spinner/SpinnerImageView;"), C66580MXl.A16(cls, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;")};
    }

    public static final IgTextView A0B(NV0 nv0) {
        return (IgTextView) C66940MfZ.A01(nv0.A0E, nv0, A0I, 6);
    }

    public static final ConfirmationCodeEditText A0C(NV0 nv0) {
        return (ConfirmationCodeEditText) C66940MfZ.A01(nv0.A0F, nv0, A0I, 2);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.NV0, X.NJT] */
    public final void afterOnViewCreated() {
        String str;
        C319956rV r4 = this.A09;
        AnonymousClass0YZ[] r3 = A0I;
        ((IgdsHeadline) C66940MfZ.A01(r4, this, r3, 1)).setHeadline((CharSequence) getString(2131969480));
        C66940MfZ.A00(r4, this, r3, 1).setVisibility(0);
        if (C71145Oe2.A09(this)) {
            configureActionBar((2dZ) C66940MfZ.A01(this.A04, this, r3, 0));
        }
        AnonymousClass0eM r5 = this.A0C;
        Dba.A15(this, ((C67714MtT) r5.getValue()).A01, new C74193PqZ(this, 44), 29);
        DbZ.A1C(this, new MGY(this, (AnonymousClass4D7) null, 46), ((C67714MtT) r5.getValue()).A0K);
        DbZ.A1C(this, new MGY(this, (AnonymousClass4D7) null, 47), ((C67714MtT) r5.getValue()).A0J);
        boolean A1Z = AnonymousClass7TF.A1Z(this.A0D);
        Integer A012 = C71145Oe2.A01(this);
        C68714NUa nUa = ((C67714MtT) r5.getValue()).A08;
        if (A1Z) {
            str = "DB_DROP";
        } else {
            str = "NORMAL_RESTORE";
        }
        C68714NUa.A05(nUa, str);
        nUa.A0B("PIN_RESTORE_IMPRESSION");
        nUa.A0D("RESTORE_TYPE", "PIN_CODE");
        nUa.A0C("INTERVAL", AnonymousClass7TG.A0A(A012));
        DbZ.A1C(this, new C66162MFz(this, (AnonymousClass4D7) null, 35), ((C67714MtT) r5.getValue()).A0I);
        C67714MtT mtT = (C67714MtT) r5.getValue();
        boolean A022 = AnonymousClass65A.A02(C66581MXm.A0S(mtT.A0E), 2342158959158497003L);
        05G r1 = mtT.A0M;
        if (A022) {
            r1.FIA(C69272NiY.Loading);
            C72203OyT oyT = mtT.A09;
            C72203OyT.A03(oyT, mtT.A0B);
            DbY.A19(mtT, new MG9(mtT, (AnonymousClass4D7) null, 31), oyT.A0O);
            return;
        }
        r1.FIA(C69272NiY.NoOtherRestoreMethodsAvailable);
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
        return NJT.A09(this.A0A, this, A0I, 8);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, java.lang.Object, X.NV0] */
    public NV0() {
        C73663Phc phc = new C73663Phc(this, 41);
        C73663Phc phc2 = new C73663Phc(this, 38);
        0eO r2 = 0eO.A02;
        AnonymousClass0eM A032 = NJT.A03(phc2, r2, 39);
        this.A0C = DbS.A0I(new C73663Phc(A032, 40), phc, C73915Plq.A00(A032, (Object) null, 4), DbS.A0z(C67714MtT.class));
        this.A09 = NJT.A02(this, 36);
        this.A0F = NJT.A02(this, 30);
        this.A05 = NJT.A02(this, 27);
        this.A08 = NJT.A02(this, 33);
        this.A06 = NJT.A02(this, 29);
        this.A0E = NJT.A02(this, 28);
        this.A07 = NJT.A02(this, 31);
        this.A0A = NJT.A02(this, 37);
        this.A0D = AnonymousClass1YB.A00(new C73663Phc(this, 43));
        this.A0H = AnonymousClass3E4.A01(this, false, false);
        this.A0G = new C72237Oz5(this, 2);
        this.A0B = NJT.A03(this, r2, 32);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-443297467);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.encrypted_backups_pin_restore_layout, false);
        AnonymousClass0fD.A09(-1477073254, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(293861481);
        super.onDestroyView();
        this.A0H.EEH(this.A0G);
        AnonymousClass0fD.A09(-407514786, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1888263426);
        super.onResume();
        A0C(this).postDelayed(new PV8(this), this.A03);
        AnonymousClass0fD.A09(-1582703722, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1380787998);
        NV0.super.onStart();
        JTP.A18(this, this.A0H);
        AnonymousClass0fD.A09(-1875045159, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1817240301);
        NV0.super.onStop();
        this.A0H.onStop();
        AnonymousClass0fD.A09(893561827, A022);
    }
}
