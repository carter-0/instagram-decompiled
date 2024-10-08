package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.GcI  reason: case insensitive filesystem */
public final class C52765GcI extends GAR implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "IntentAwareAdFeedController";
    public int A00 = -1;
    public int A01 = -1;
    public IntentAwareAdPivotState A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public final Bundle A0C;
    public final H50 A0D;
    public final UserSession A0E;
    public final JRI A0F;
    public final GAQ A0G;
    public final C233002un A0H;
    public final String A0I;
    public final Set A0J = DbS.A0y();
    public final Fragment A0K;
    public final 1Ng A0L;

    public final String getModuleName() {
        return "intent_aware_ad_feed_contextual_feed_controller";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public static final boolean A03(C52765GcI gcI) {
        AnonymousClass4I5 r4 = AnonymousClass59V.A00;
        if (r4.A01(Integer.valueOf(gcI.A01))) {
            if (182.A06(0Tu.A06, gcI.A0E, 36312887638230453L)) {
                return true;
            }
        }
        if (!r4.A02(Integer.valueOf(gcI.A01))) {
            return false;
        }
        if (182.A06(0Tu.A06, gcI.A0E, 36312887644194307L)) {
            return true;
        }
        return false;
    }

    public C52765GcI(Bundle bundle, Fragment fragment, UserSession userSession, JRI jri, GAQ gaq, C233012uo r8, String str) {
        C233002un r82;
        this.A0K = fragment;
        this.A0E = userSession;
        this.A0F = jri;
        this.A0I = str;
        this.A0G = gaq;
        this.A0C = bundle;
        this.A0L = AnonymousClass1Nd.A00(userSession);
        if (r8 instanceof C233002un) {
            r82 = (C233002un) r8;
        } else {
            r82 = null;
        }
        this.A0H = r82;
        this.A0D = new H50(this, 12);
    }

    public static final void A02(1E8 r11, C52765GcI gcI, String str, List list) {
        1Xj A022 = r11.A02(str);
        if (A022 != null) {
            list.add(A022);
            IntentAwareAdPivotState intentAwareAdPivotState = gcI.A02;
            if (intentAwareAdPivotState != null) {
                if (0qQ.A0K(intentAwareAdPivotState.A05, str)) {
                    if (182.A06(0Tu.A06, gcI.A0E, 36312887633053056L)) {
                        IntentAwareAdPivotState intentAwareAdPivotState2 = gcI.A02;
                        if (intentAwareAdPivotState2 != null) {
                            intentAwareAdPivotState2.A05 = "";
                            gcI.A0L.A00(new C240153Ju(A022, (1sy) null, (AnonymousClass34A) null, new SearchContext((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null), (HashMap) null));
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("intentAwareAdPivotState");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
