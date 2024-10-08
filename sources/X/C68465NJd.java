package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.NJd  reason: case insensitive filesystem */
public final class C68465NJd extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "DirectPollMessageDetailsFragment";
    public int A00;
    public int A01;
    public 0hq A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass06Q A07 = new C71495Olk(this, 1);
    public final String A08 = "direct_poll_message_details";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final void onAttachFragment(Fragment fragment) {
        0qQ.A0B(fragment, 0);
        if (fragment instanceof NJC) {
            ((NJC) fragment).A03 = new O75(this);
        }
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0lg A0X = DbT.A0X(this.A06);
        String str2 = this.A03;
        if (str2 == null) {
            str = "threadId";
        } else {
            DirectThreadKey A0e = C66581MXm.A0e(str2);
            String str3 = this.A04;
            if (str3 == null) {
                str = "pollId";
            } else {
                boolean z = this.A05;
                0qQ.A0B(A0X, 0);
                NJC njc = new NJC();
                Bundle A0A = DbV.A0A(A0X);
                A0A.putString("DirectPollMessageVotingFragment_poll_id", str3);
                A0A.putParcelable("DirectPollMessageVotingFragment_thread_key", A0e);
                A0A.putBoolean("DirectPollMessageVotingFragment_is_msys", z);
                njc.setArguments(A0A);
                0hq childFragmentManager = getChildFragmentManager();
                this.A02 = childFragmentManager;
                if (childFragmentManager != null) {
                    0s1 r1 = new 0s1(childFragmentManager);
                    r1.A0A(njc, R.id.fragment_container);
                    r1.A0K();
                    0hq r12 = this.A02;
                    if (r12 != null) {
                        r12.A0s(this.A07);
                        return;
                    }
                }
                0qQ.A0F("childFragMan");
                throw AnonymousClass00P.createAndThrow();
            }
        }
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
        return this.A08;
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

    public final boolean isScrolledToTop() {
        0hq r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("childFragMan");
            throw AnonymousClass00P.createAndThrow();
        }
        C74393Pu9 A0P = r1.A0P(R.id.fragment_container);
        if (A0P instanceof C74393Pu9) {
            return A0P.isScrolledToTop();
        }
        return true;
    }

    public final boolean onBackPressed() {
        0hq r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("childFragMan");
            throw AnonymousClass00P.createAndThrow();
        } else if (r1.A0M() <= 0) {
            return false;
        } else {
            r1.A0c();
            return true;
        }
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        if (!this.mRemoving) {
            0hq r1 = this.A02;
            if (r1 == null) {
                0qQ.A0F("childFragMan");
                throw AnonymousClass00P.createAndThrow();
            }
            C74393Pu9 A0P = r1.A0P(R.id.fragment_container);
            if (A0P instanceof C74393Pu9) {
                A0P.onBottomSheetPositionChanged(i, i2);
            }
        }
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
        int A022 = AnonymousClass0fD.A02(-1067927769);
        C68465NJd.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("DirectPollMessageDetailsFragment_thread_key");
        if (string != null) {
            this.A03 = string;
            this.A04 = requireArguments.getString("DirectPollMessageDetailsFragment_poll_id", "");
            this.A05 = requireArguments.getBoolean("DirectPollMessageDetailsFragment_is_msys", false);
            AnonymousClass0fD.A09(290792754, A022);
            return;
        }
        IllegalArgumentException A0w = AnonymousClass7TE.A0w("thread key can't be null");
        AnonymousClass0fD.A09(-2008749432, A022);
        throw A0w;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(412469802);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_poll_message_details, viewGroup, false);
        AnonymousClass0fD.A09(-1172696635, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1680359230);
        super.onDestroyView();
        0hq r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("childFragMan");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A0F.remove(this.A07);
        AnonymousClass0fD.A09(1157380762, A022);
    }
}
