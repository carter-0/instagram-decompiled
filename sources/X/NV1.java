package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

public final class NV1 extends NJT implements C273494mf, C252213ok {
    public static final /* synthetic */ AnonymousClass0YZ[] A09 = {C66580MXl.A16(NV1.class, "actionBar", "getActionBar()Lcom/instagram/actionbar/ActionBarService;")};
    public static final String __redex_internal_original_name = "EncryptedBackupsPinSetupFragment";
    public IgTextView A00;
    public C69261NiN A01;
    public IgdsHeadline A02;
    public ConfirmationCodeEditText A03;
    public C62320sa A04 = new C73926Pm6(this, 5);
    public NestedScrollView A05;
    public final C319956rV A06 = NJT.A02(this, 49);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;

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
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A05 = (NestedScrollView) view.requireViewById(R.id.container);
        this.A02 = (IgdsHeadline) view.requireViewById(R.id.headline);
        this.A00 = DbT.A0a(view, R.id.error_text);
        ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) view.requireViewById(R.id.confirmation_code_edit_text);
        this.A03 = confirmationCodeEditText;
        if (confirmationCodeEditText != null) {
            confirmationCodeEditText.A07 = true;
            confirmationCodeEditText.setImportantForAutofill(8);
            ConfirmationCodeEditText confirmationCodeEditText2 = this.A03;
            if (confirmationCodeEditText2 != null) {
                confirmationCodeEditText2.setAutofillHints(new String[]{"notApplicable"});
                ConfirmationCodeEditText confirmationCodeEditText3 = this.A03;
                if (confirmationCodeEditText3 != null) {
                    confirmationCodeEditText3.A05((Integer) null, 6, false, false);
                    ConfirmationCodeEditText confirmationCodeEditText4 = this.A03;
                    if (confirmationCodeEditText4 != null) {
                        C71273OhE.A00(confirmationCodeEditText4, this, 4);
                        ConfirmationCodeEditText confirmationCodeEditText5 = this.A03;
                        if (confirmationCodeEditText5 != null) {
                            confirmationCodeEditText5.requestFocus();
                            ConfirmationCodeEditText confirmationCodeEditText6 = this.A03;
                            if (confirmationCodeEditText6 != null) {
                                0nA.A0R(confirmationCodeEditText6);
                                NJT.A04(view, this);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("confirmationCode");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DMr(int i, boolean z) {
        NestedScrollView nestedScrollView = this.A05;
        if (nestedScrollView == null) {
            0qQ.A0F("scrollView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            0nA.A0X(nestedScrollView, i);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.NV1] */
    public final void afterOnViewCreated() {
        AnonymousClass0eM r4 = this.A08;
        Dba.A15(this, ((C67716MtV) r4.getValue()).A01, new C74193PqZ(this, 45), 30);
        DbZ.A1C(this, new MGY(this, (AnonymousClass4D7) null, 48), ((C67716MtV) r4.getValue()).A0I);
        DbZ.A1C(this, new C66162MFz(this, (AnonymousClass4D7) null, 36), new MC9(((C67716MtV) r4.getValue()).A0H, 42));
        C67716MtV mtV = (C67716MtV) r4.getValue();
        NUN nun = mtV.A08;
        nun.A0D("ENTRY_POINT", C69894Ntw.A00(mtV.A0C));
        nun.A0B("CREATE_PIN_IMPRESSION");
        DbZ.A1C(this, new C66162MFz(this, (AnonymousClass4D7) null, 37), ((C67716MtV) r4.getValue()).A0G);
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
        NestedScrollView nestedScrollView = this.A05;
        if (nestedScrollView != null) {
            return !JTP.A1Y(nestedScrollView);
        }
        0qQ.A0F("scrollView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, java.lang.Object, X.NV1] */
    public NV1() {
        C73926Pm6 pm6 = new C73926Pm6(this, 4);
        AnonymousClass0eM A012 = C73926Pm6.A01(new C73926Pm6(this, 1), 0eO.A02, 2);
        this.A08 = DbS.A0I(new C73926Pm6(A012, 3), pm6, C73915Plq.A00(A012, (Object) null, 6), DbS.A0z(C67716MtV.class));
        this.A07 = C73926Pm6.A00(this, 0);
    }

    public static final void A0B(NV1 nv1, boolean z) {
        if (C71145Oe2.A08(nv1)) {
            C331157Pu A0f = C66582MXn.A0f(nv1);
            if (A0f != null) {
                A0f.A0P(z);
                return;
            }
            return;
        }
        ((2dZ) C66940MfZ.A01(nv1.A06, nv1, A09, 0)).setIsLoading(z);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1956841816);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.encrypted_backups_pin_setup_layout, false);
        AnonymousClass0fD.A09(-1370002499, A022);
        return A0D;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1070350063);
        NV1.super.onPause();
        AnonymousClass0eM r1 = this.A07;
        ((AnonymousClass3E6) r1.getValue()).onStop();
        ((AnonymousClass3E6) r1.getValue()).EEH(this);
        AnonymousClass0fD.A09(155108474, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1997478129);
        super.onResume();
        AnonymousClass0eM r1 = this.A07;
        JTP.A17(this, (AnonymousClass3E6) r1.getValue());
        ((AnonymousClass3E6) r1.getValue()).A9Y(this);
        AnonymousClass0fD.A09(-608492520, A022);
    }
}
