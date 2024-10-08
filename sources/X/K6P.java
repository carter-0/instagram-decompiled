package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.XDTTextPostAppAccountPrivacyOptions;
import com.instagram.common.session.UserSession;

public final class K6P extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "NewUserActivationPrivacyFragment";
    public C60068Jew A00;
    public C60068Jew A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "new_user_activation_privacy";
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public static final C62646Kk8 A00(K6P k6p) {
        C60068Jew jew = k6p.A01;
        if (jew == null) {
            0qQ.A0F("publicRadioButton");
            throw AnonymousClass00P.createAndThrow();
        } else if (jew.isChecked()) {
            return C62646Kk8.PUBLIC;
        } else {
            return C62646Kk8.PRIVATE;
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
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
        AnonymousClass0eM r0 = this.A02;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        String A0p = JTT.A0p(r0);
        LT4.A03(C62662KkO.BACK, A00(this), C62656KkI.PRIVACY_SELECTION, A0l, A0p);
        return false;
    }

    public final void onBottomSheetClosed() {
        AnonymousClass0eM r0 = this.A02;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        String A0p = JTT.A0p(r0);
        LT4.A03(C62662KkO.EXIT, A00(this), C62656KkI.PRIVACY_SELECTION, A0l, A0p);
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
        int A022 = AnonymousClass0fD.A02(-2015504169);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.new_user_activation_privacy, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.next_button);
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.footer_text);
        ViewGroup A0E = DbS.A0E(inflate, R.id.privacy_radio_group);
        0eE r0 = AnonymousClass0t1.A01;
        AnonymousClass0eM r6 = this.A02;
        boolean A1W = AnonymousClass7TF.A1W(DbX.A0l(r0, r6).A03.BFf(), XDTTextPostAppAccountPrivacyOptions.PRIVATE);
        C60068Jew jew = new C60068Jew(requireContext());
        this.A01 = jew;
        jew.setTitleText(2131975339);
        C60068Jew jew2 = this.A01;
        if (jew2 != null) {
            jew2.setSubTitleText(2131975338);
            C60068Jew jew3 = this.A01;
            if (jew3 != null) {
                jew3.setChecked(!A1W);
                C60068Jew jew4 = this.A01;
                if (jew4 != null) {
                    jew4.setTag("public");
                    C60068Jew jew5 = this.A01;
                    if (jew5 != null) {
                        jew5.setLeftIcon(R.drawable.instagram_globe_pano_outline_24);
                        C60068Jew jew6 = this.A01;
                        if (jew6 != null) {
                            A0E.addView(jew6, 0);
                            C60068Jew jew7 = new C60068Jew(requireContext());
                            this.A00 = jew7;
                            jew7.setTitleText(2131975337);
                            C60068Jew jew8 = this.A00;
                            if (jew8 != null) {
                                jew8.setSubTitleText(2131975336);
                                C60068Jew jew9 = this.A00;
                                if (jew9 != null) {
                                    jew9.setChecked(A1W);
                                    C60068Jew jew10 = this.A00;
                                    if (jew10 != null) {
                                        jew10.setTag("private");
                                        C60068Jew jew11 = this.A00;
                                        if (jew11 != null) {
                                            jew11.setLeftIcon(R.drawable.instagram_lock_pano_outline_24);
                                            C60068Jew jew12 = this.A00;
                                            if (jew12 != null) {
                                                A0E.addView(jew12, 1);
                                                C60068Jew jew13 = this.A01;
                                                if (jew13 != null) {
                                                    LYB.A00(jew13, 60, this);
                                                    C60068Jew jew14 = this.A00;
                                                    if (jew14 != null) {
                                                        LYB.A00(jew14, 61, this);
                                                        UserSession A0l = AnonymousClass7TE.A0l(r6);
                                                        String A0p = JTT.A0p(r6);
                                                        C62656KkI kkI = C62656KkI.PRIVACY_SELECTION;
                                                        LT4.A02(C62640Kk2.A02, A00(this), kkI, A0l, A0p);
                                                        DbX.A1G(A0d, C48791EkE.A00(requireContext(), AnonymousClass7TE.A0l(r6), AnonymousClass7TE.A16(requireContext(), 2131975335), new ExS(AnonymousClass7TE.A16(requireContext(), 2131964889), "https://help.instagram.com/788669719351544", C59917Jbg.A00(this, 7))));
                                                        LYB.A00(findViewById, 63, this);
                                                        AnonymousClass0fD.A09(-1070320502, A022);
                                                        return inflate;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            0qQ.A0F("privateRadioButton");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
            }
        }
        0qQ.A0F("publicRadioButton");
        throw AnonymousClass00P.createAndThrow();
    }
}
