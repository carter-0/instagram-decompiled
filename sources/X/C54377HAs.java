package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.Set;

/* renamed from: X.HAs  reason: case insensitive filesystem */
public final class C54377HAs extends GAR implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "AdsChainingFeedController";
    public IntentAwareAdPivotState A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04 = true;
    public final Bundle A05;
    public final C55438Hhi A06;
    public final IY1 A07;
    public final UserSession A08;
    public final JRI A09;
    public final GAQ A0A;
    public final String A0B;
    public final Set A0C = DbS.A0y();

    public C54377HAs(Bundle bundle, UserSession userSession, JRI jri, GAQ gaq, C233012uo r6, String str) {
        IY1 iy1;
        this.A08 = userSession;
        this.A09 = jri;
        this.A05 = bundle;
        this.A0B = str;
        this.A0A = gaq;
        if (r6 instanceof IY1) {
            iy1 = (IY1) r6;
        } else {
            iy1 = null;
        }
        this.A07 = iy1;
        this.A06 = new C55438Hhi(this);
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final String getModuleName() {
        return this.A0B;
    }
}
