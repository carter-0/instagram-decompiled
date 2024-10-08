package X;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.button.IgdsButton;

public final class K6N extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "NewUserActivationDisclosureFragment";
    public IgdsButton A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final 1wn A02 = C64698LgT.A00(this, 41);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "new_user_activation_disclosure";
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
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
        return DbS.A0T(this.A01);
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
        AnonymousClass0eM r0 = this.A01;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        String A0p = JTT.A0p(r0);
        LT4.A03(C62662KkO.BACK, (C62646Kk8) null, C62656KkI.HOW_IT_WORKS, A0l, A0p);
        return false;
    }

    public final void onBottomSheetClosed() {
        AnonymousClass0eM r0 = this.A01;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        String A0p = JTT.A0p(r0);
        LT4.A03(C62662KkO.EXIT, (C62646Kk8) null, C62656KkI.HOW_IT_WORKS, A0l, A0p);
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
        int A022 = AnonymousClass0fD.A02(-1199100325);
        K6N.super.onCreate(bundle);
        DbX.A0R(this.A01).A01(this.A02, C64647LfZ.class);
        AnonymousClass0fD.A09(-184769546, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Boolean A002;
        int A022 = AnonymousClass0fD.A02(82257324);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        AnonymousClass0eM r9 = this.A01;
        UserSession A0l = AnonymousClass7TE.A0l(r9);
        String A0p = JTT.A0p(r9);
        LT4.A02(C62640Kk2.A02, (C62646Kk8) null, C62656KkI.HOW_IT_WORKS, A0l, A0p);
        boolean z = false;
        View A0A = DbU.A0A(layoutInflater2, viewGroup, R.layout.new_user_activation_disclosure, false);
        SpannableString A003 = C48791EkE.A00(requireContext(), AnonymousClass7TE.A0l(r9), AnonymousClass7TE.A16(requireContext(), 2131975322), new ExS(AnonymousClass7TE.A16(requireContext(), 2131964889), "https://help.instagram.com/788669719351544", C59917Jbg.A00(this, 1)));
        SpannableString A004 = C48791EkE.A00(requireContext(), AnonymousClass7TE.A0l(r9), AnonymousClass7TE.A16(requireContext(), 2131975323), new ExS(AnonymousClass7TE.A16(requireContext(), 2131964889), "https://help.instagram.com/169559812696339", C59917Jbg.A00(this, 2)));
        SpannableString A005 = C48791EkE.A00(requireContext(), AnonymousClass7TE.A0l(r9), AnonymousClass7TE.A16(requireContext(), 2131975324), new ExS(AnonymousClass7TE.A16(requireContext(), 2131966453), C66579MXk.A00(35), C59917Jbg.A00(this, 3)), new ExS(AnonymousClass7TE.A16(requireContext(), 2131975351), "https://help.instagram.com/769983657850450", C59917Jbg.A00(this, 4)), new ExS(AnonymousClass7TE.A16(requireContext(), 2131966451), MYM.A00(9, 42, 92), C59917Jbg.A00(this, 5)), new ExS(AnonymousClass7TE.A16(requireContext(), 2131975350), "https://help.instagram.com/515230437301944", C59917Jbg.A00(this, 6)));
        ((IgdsBulletCell) A0A.requireViewById(R.id.bullet1)).setText((CharSequence) requireContext().getString(2131975327), (CharSequence) A003);
        ((IgdsBulletCell) A0A.requireViewById(R.id.bullet1)).setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
        ((IgdsBulletCell) A0A.requireViewById(R.id.bullet2)).setText((CharSequence) requireContext().getString(2131975328), (CharSequence) A004);
        ((IgdsBulletCell) A0A.requireViewById(R.id.bullet2)).setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
        ((IgdsBulletCell) A0A.requireViewById(R.id.bullet3)).setText((CharSequence) requireContext().getString(2131975329), (CharSequence) A005);
        ((IgdsBulletCell) A0A.requireViewById(R.id.bullet3)).setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
        this.A00 = (IgdsButton) A0A.findViewById(R.id.next_button);
        Bundle bundle2 = this.mArguments;
        if (!(bundle2 == null || (A002 = C311706d7.A00(bundle2, "is_private")) == null)) {
            z = A002.booleanValue();
        }
        IgdsButton igdsButton = this.A00;
        if (igdsButton == null) {
            0qQ.A0F("nextButton");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fU.A00(new LXJ(3, this, z), igdsButton);
        AnonymousClass0fD.A09(-1267695840, A022);
        return A0A;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1485576700);
        super.onDestroy();
        DbX.A0R(this.A01).A02(this.A02, C64647LfZ.class);
        AnonymousClass0fD.A09(395229865, A022);
    }
}
