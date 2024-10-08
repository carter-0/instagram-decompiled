package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.2pR  reason: invalid class name and case insensitive filesystem */
public final class C230322pR implements C230332pS {
    public final C230282pK A00;

    public final /* bridge */ /* synthetic */ Object AGb(C254213s7 r11, Object obj, Object obj2, String str) {
        IntentAwareAdPivotState intentAwareAdPivotState;
        C53288Gla gla = (C53288Gla) obj;
        Integer num = (Integer) obj2;
        C230282pK r6 = this.A00;
        C54077Gz1 gz1 = null;
        if (gla != null) {
            gz1 = gla.A03;
        }
        if (gz1 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (gla == null || (intentAwareAdPivotState = gla.A01) == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (num != null) {
            int intValue = num.intValue();
            if (r11 != null) {
                1Xj A002 = ((C55923Hpk) gz1.A0B.get(intValue)).A00();
                0xI A003 = 0xI.A00(r6.A03, "instagram_ad_vpvd_imp");
                A003.A0C(Dbf.A02(21, 10, 84), r6.A04.getSessionId());
                A003.A0C("m_pk", A002.getId());
                A003.A08(Integer.valueOf(A002.BR7().A00), "m_t");
                A003.A0B("max_duration_ms", Long.valueOf(r11.A04));
                UserSession userSession = r6.A02;
                A003.A0C("ad_id", C231122qu.A07(userSession, A002));
                A003.A0C("tracking_token", C231122qu.A0F(userSession, A002));
                A003.A0C("container_module", "feed_timeline");
                A003.A0C("first_hscroll_item_ad_id", C231122qu.A07(userSession, ((C55923Hpk) 00k.A0I(gz1.A0B)).A00()));
                A003.A0B("sum_duration_ms", Long.valueOf(r11.A05));
                A003.A0B("hscroll_seed_ad_id", r6.A08(gz1));
                A003.A0B("hscroll_seed_media_id", C230282pK.A04(gz1));
                A003.A0B("hscroll_seed_media_author_igid", C230282pK.A03(gz1));
                A003.A0C("chaining_session_id", intentAwareAdPivotState.A0E);
                A003.A09("is_multi_ads", true);
                A003.A08(Integer.valueOf(gz1.A00), "multi_ads_type");
                A003.A0C("multi_ads_id", gz1.getId());
                A003.A08(num, "position_in_multi_ads_unit");
                A003.A0C("multi_ads_first_ad_id", C231122qu.A07(userSession, ((C55923Hpk) 00k.A0I(gz1.A0B)).A00()));
                return A003;
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final /* bridge */ /* synthetic */ 0xI AM0(Object obj) {
        0xI r2 = (0xI) obj;
        0qQ.A0B(r2, 0);
        return r2;
    }

    public C230322pR(C230282pK r1) {
        this.A00 = r1;
    }
}
