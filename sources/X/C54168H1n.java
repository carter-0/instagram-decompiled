package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.feed.media.CreativeConfigIntf;
import java.util.List;

/* renamed from: X.H1n  reason: case insensitive filesystem */
public final class C54168H1n extends AnonymousClass4DH implements C273494mf, G9c {
    public static final String __redex_internal_original_name = "MagicModAttributionBottomSheetFragment";
    public GenAIToolInfoDictIntf A00;
    public C362088hK A01;
    public String A02;
    public 1Xj A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final Integer A05 = AnonymousClass05K.A05;
    public final String A06 = "magic_mod_attribution_bottom_sheet";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final Integer BkZ() {
        return this.A05;
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
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
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
        Throwable th;
        int i;
        String string;
        CreativeConfigIntf A0r;
        List B92;
        GenAIToolInfoDictIntf genAIToolInfoDictIntf;
        C362088hK r0;
        int A022 = AnonymousClass0fD.A02(1666501640);
        C54168H1n.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("args_media_id")) == null) {
            th = AnonymousClass7TE.A0y();
            i = -1780050570;
        } else {
            this.A02 = string;
            1E8 A0d = DbX.A0d(this.A04);
            String str = this.A02;
            if (str == null) {
                0qQ.A0F("mediaId");
                throw AnonymousClass00P.createAndThrow();
            }
            1Xj A023 = A0d.A02(str);
            this.A03 = A023;
            if (A023 == null || (A0r = C51966G9m.A0r(A023)) == null || (B92 = A0r.B92()) == null || (genAIToolInfoDictIntf = (GenAIToolInfoDictIntf) 00k.A0J(B92)) == null) {
                th = AnonymousClass7TE.A0w("Media does not have an applied gen AI tool");
                i = 1007252141;
            } else {
                this.A00 = genAIToolInfoDictIntf;
                int ordinal = genAIToolInfoDictIntf.C8A().ordinal();
                if (ordinal == 115) {
                    r0 = C362088hK.A0B;
                } else if (ordinal == 15) {
                    r0 = C362088hK.A09;
                } else {
                    th = AnonymousClass7TE.A0w("Non-magic mod camera tool provided");
                    i = -453660131;
                }
                this.A01 = r0;
                AnonymousClass0fD.A09(829405813, A022);
                return;
            }
        }
        AnonymousClass0fD.A09(i, A022);
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(436457953);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A03(C59342JFu.A00(this, 0), 1431122845), false, false);
        AnonymousClass0fD.A09(1819692332, A022);
        return A012;
    }
}
