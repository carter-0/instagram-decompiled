package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.api.schemas.OpenCarouselSubmissionState;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class IS5 implements AnonymousClass3YT {
    public final UserSession A00;

    public IS5(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean Et3(1Xj r6, AnonymousClass3W1 r7, int i) {
        AnonymousClass7TF.A1B(r6, 0, r7);
        if (r7.A2k || r6.A57()) {
            r7.A2k = true;
            return false;
        }
        int A0q = r6.A0q();
        OpenCarouselSubmissionState BYK = r6.A0C.BYK();
        if (BYK == null) {
            return false;
        }
        if ((BYK != OpenCarouselSubmissionState.A07 && BYK != OpenCarouselSubmissionState.A09) || A0q <= 0) {
            return false;
        }
        if (182.A06(0Tu.A05, this.A00, 2342163288483831967L)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean EtS() {
        return false;
    }

    public final Integer BEK() {
        return Integer.valueOf(R.drawable.instagram_collage_pano_outline_24);
    }

    public final /* synthetic */ List Bqk(1Xj r2, AnonymousClass3W1 r3) {
        return null;
    }

    public final CharSequence C4o(Context context, UserSession userSession, 1Xj r6, AnonymousClass3W1 r7) {
        AnonymousClass7TG.A1N(context, r6);
        String A0d = DbY.A0d(context.getResources(), r6.A0q(), R.plurals.open_carousel_review_media_cta_label);
        0qQ.A07(A0d);
        return A0d;
    }

    public final /* synthetic */ boolean Et2(UserSession userSession, 1Xj r3) {
        return false;
    }

    public final /* synthetic */ String BSq(Context context, 1Xj r3, AnonymousClass3W1 r4) {
        return null;
    }

    public final /* synthetic */ boolean Et1(UserSession userSession, 1Xj r3, AnonymousClass3W1 r4) {
        return false;
    }

    public final /* synthetic */ CharSequence Bqi(Context context, UserSession userSession, 1Xj r4, AnonymousClass4DU r5, AnonymousClass3W1 r6) {
        return null;
    }
}
