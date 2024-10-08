package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import instagram.features.stories.fragment.ReelViewerFragment;

public final class IZY implements C273494mf {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ AnonymousClass6Z5 A02;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public IZY(FragmentActivity fragmentActivity, C255773uh r2, AnonymousClass6Z5 r3) {
        this.A02 = r3;
        this.A00 = fragmentActivity;
        this.A01 = r2;
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

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetClosed() {
        String str;
        AnonymousClass6Z5 r8 = this.A02;
        AnonymousClass3E6 r1 = r8.A0A;
        if (r1 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            r1.A9Y(r8.A14);
            UserSession userSession = r8.A09;
            str = "userSession";
            if (userSession != null) {
                if (AnonymousClass7TE.A0q(userSession).getBoolean(AnonymousClass000.A00(3215), false)) {
                    UserSession userSession2 = r8.A09;
                    if (userSession2 != null) {
                        if (!AnonymousClass7TE.A0q(userSession2).getBoolean("has_seen_highlights_nux_dialog", false)) {
                            C273384mU r7 = r8.A17;
                            ((ReelViewerFragment) r7).A2o = true;
                            FragmentActivity fragmentActivity = this.A00;
                            UserSession userSession3 = r8.A09;
                            if (userSession3 != null) {
                                C310096aQ r0 = r8.A0h;
                                if (r0 == null) {
                                    str = "reelProfileOpener";
                                } else {
                                    C55784HnJ hnJ = new C55784HnJ(fragmentActivity, userSession3, r7, r0);
                                    ImageUrl A06 = this.A01.A06();
                                    if (A06 != null) {
                                        AnonymousClass4DU r6 = r8.A15;
                                        FragmentActivity fragmentActivity2 = hnJ.A00;
                                        C358248ab A0X = DbS.A0X(fragmentActivity2);
                                        A0X.A0j(new C244303ay(A06, r6.getModuleName(), DbS.A02(fragmentActivity2, 100), DbS.A02(fragmentActivity2, 4), fragmentActivity2.getColor(2Yu.A0C(fragmentActivity2)), DbS.A02(fragmentActivity2, 2), AnonymousClass7TF.A03(fragmentActivity2, R.attr.igds_color_stroke), fragmentActivity2.getColor(R.color.fds_transparent), false));
                                        A0X.A09(2131963434);
                                        A0X.A08(2131963433);
                                        C56719I8z.A01(A0X, hnJ, 34, 2131963435);
                                        A0X.A0H(C56719I8z.A00(hnJ, 33), 2131960992);
                                        A0X.A0f(new I9B(hnJ, 5));
                                        DbT.A1V(A0X);
                                        DbX.A1V(AnonymousClass7TE.A0q(hnJ.A01), "has_seen_highlights_nux_dialog", true);
                                        return;
                                    }
                                    throw AnonymousClass7TE.A0y();
                                }
                            }
                        }
                    }
                }
                G9w.A1O(r8);
                return;
            }
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
}
