package X;

import android.os.Bundle;
import com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.Hb2  reason: case insensitive filesystem */
public abstract class C55031Hb2 {
    public static final Bundle A00(UserSession userSession, 1Xj r7, IntentAwareAdPivotState intentAwareAdPivotState, AnonymousClass3DY r9, C54077Gz1 gz1) {
        String str;
        String str2;
        Bundle A0a = AnonymousClass7TE.A0a();
        1Xj r3 = gz1.A04;
        if (r3 != null && r3.CcK() && AnonymousClass59V.A00.A01(Integer.valueOf(gz1.A00))) {
            A0a.putString("contextual_feed_seed_ad_tracking_token", C231122qu.A0F(userSession, r3));
        }
        int i = gz1.A00;
        String A00 = AnonymousClass000.A00(274);
        String str3 = null;
        if (i == 7) {
            ContextualAdResponseOrganicInfoImpl contextualAdResponseOrganicInfoImpl = gz1.A02;
            if (contextualAdResponseOrganicInfoImpl != null) {
                str = contextualAdResponseOrganicInfoImpl.A01;
            } else {
                str = null;
            }
            A0a.putString(A00, str);
            ContextualAdResponseOrganicInfoImpl contextualAdResponseOrganicInfoImpl2 = gz1.A02;
            if (contextualAdResponseOrganicInfoImpl2 != null) {
                str2 = contextualAdResponseOrganicInfoImpl2.A00;
            } else {
                str2 = null;
            }
            A0a.putString(AnonymousClass000.A00(571), str2);
        } else {
            A0a.putString(A00, gz1.A00().A02);
        }
        A0a.putParcelable(AnonymousClass000.A00(570), intentAwareAdPivotState);
        A0a.putInt("contextual_feed_ad_pivot_type", gz1.A00);
        C42049BFc bFc = gz1.A03;
        if (bFc != null) {
            str3 = bFc.A04;
        }
        A0a.putString("contextual_feed_category_hash_id", str3);
        A0a.putInt("contextual_feed_multi_ad_unit_chaining_position", new C233472vm(gz1.A01()).A09());
        A0a.putString("contextual_feed_multi_ad_unit_id", gz1.getId());
        A0a.putString("contextual_feed_inventory_source", gz1.A0A);
        A0a.putString("contextual_feed_individual_ad_media_id", r7.getId());
        if (r7.CcK()) {
            A0a.putString("contextual_feed_individual_ad_tracking_token", C231122qu.A0F(userSession, r7));
            A0a.putString("contextual_feed_individual_ad_ad_id", C231122qu.A07(userSession, r7));
        }
        if (r9 != null) {
            A0a.putString("contextual_feed_trigger_type_name", r9.name());
        }
        return A0a;
    }
}
