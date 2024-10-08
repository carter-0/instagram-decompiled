package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class E6D extends AnonymousClass4DH implements C273494mf, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LikesListComposeFragment";
    public boolean A00;
    public final AnonymousClass0eM A01 = C51796G2f.A00(this, 44);
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C51796G2f.A00(this, 47);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C73654PhT(this, 3));
    public final AnonymousClass0eM A07;

    public final void configureActionBar(2da r5) {
        1Xj BPf;
        0qQ.A0B(r5, 0);
        if (AnonymousClass7TF.A1Z(this.A02)) {
            r5.Etr(false);
        }
        r5.Eom(((C46729DkI) this.A07.getValue()).A0E((Integer) null));
        r5.Eu4(true);
        1Xl A042 = ((C61079JwH) this.A01.getValue()).A04();
        if (A042 != null && (BPf = A042.BPf()) != null && C46342Dck.A01(AnonymousClass7TE.A0l(this.A05), BPf)) {
            C46342Dck.A00(requireContext(), new FP7(33, (Object) BPf, (Object) this), r5);
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = true;
        ExA exA = (ExA) this.A06.getValue();
        C61079JwH jwH = exA.A00;
        C62875Knp knp = (C62875Knp) jwH.A01;
        QP4 qp4 = (QP4) jwH.A00;
        if (qp4.A01 && (knp instanceof C69217NhX)) {
            C49303Esm.A00.A00(DbS.A0O(jwH.A02), exA.A01, ((C69217NhX) knp).A02, qp4.A00);
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

    public final String getModuleName() {
        return ((C61079JwH) this.A01.getValue()).A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
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
        return this.A00;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public E6D() {
        C73654PhT phT = new C73654PhT(this, 4);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73654PhT(new C73654PhT(this, 0), 1));
        this.A07 = DbS.A0I(new C73654PhT(A002, 2), phT, new C20614Wvv(28, (Object) null, A002), DbS.A0z(C46729DkI.class));
        this.A03 = C51796G2f.A00(this, 46);
        this.A02 = C51796G2f.A00(this, 45);
        this.A00 = true;
        this.A05 = C227642jf.A02(this);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-4329445);
        E6D.super.onCreate(bundle);
        2YL A0H = DbS.A0H(this.A07);
        AnonymousClass7TE.A1Z(new MG5(A0H, (AnonymousClass4D7) null, 49), C318116oQ.A00(A0H));
        ((C46329Dbx) this.A03.getValue()).A00.A04();
        AnonymousClass0fD.A09(450334097, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-356191613);
        ComposeView A0H = DbV.A0H(this, new C59346JFy(this, 11), -1202205501);
        AnonymousClass0fD.A09(1491791615, A022);
        return A0H;
    }
}
