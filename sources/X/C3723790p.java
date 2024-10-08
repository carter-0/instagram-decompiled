package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Map;

/* renamed from: X.90p  reason: invalid class name and case insensitive filesystem */
public final class C3723790p {
    public long A00 = -1;
    public Context A01;
    public C228232l0 A02;
    public Boolean A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07 = "discover/topical_explore/";
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public Map A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final UserSession A0L;

    public static final void A00(1Fa r4, C3723790p r5) {
        Context context;
        UserSession userSession = r5.A0L;
        if (182.A06(0Tu.A05, userSession, 36315902698262179L) && (context = r5.A01) != null) {
            1G2.A00(context, r4, userSession, new 1Cn(context), false);
        }
    }

    public final 1OC A01() {
        String str;
        Map AUH;
        Integer num;
        Map map;
        Location lastLocation;
        String str2 = this.A08;
        if (str2 != null) {
            UserSession userSession = this.A0L;
            String str3 = null;
            1NY r3 = new 1NY(userSession, -2);
            r3.A08(AnonymousClass05K.A0N);
            r3.A0A(this.A07);
            Class<C3723990r> cls = C3723990r.class;
            r3.A0O((15p) null, C3723890q.class, cls, false);
            r3.A9m(Py2.A01(9, 10, 6), this.A0A);
            if (this.A0I) {
                str = "true";
            } else {
                str = "false";
            }
            r3.A9m("is_prefetch", str);
            r3.A9m("timezone_offset", String.valueOf(1G0.A00()));
            r3.A9m("reels_configuration", C226412gl.A00(userSession).A01);
            C3722790e.A00(userSession);
            0qQ.A0B("guide_id", 0);
            C3722790e.A00(userSession);
            0qQ.A0B("guide_enabled_on_page", 0);
            r3.A0G("module", this.A0C);
            if (!this.A0J) {
                str3 = this.A0E;
            }
            r3.A0G("cluster_id", str3);
            r3.A0G(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, this.A0D);
            r3.A0G("paging_token", this.A06);
            r3.A0E("is_nonpersonalized_explore", this.A03);
            r3.A0G("session_paging_token", this.A0B);
            C3724090s.A06(r3, this.A09);
            1Wr r8 = 1Wr.A00;
            if (!(r8 == null || (lastLocation = r8.getLastLocation(userSession, 10800000, 50000.0f, "ExploreTopicalFeedNetworkHelper")) == null)) {
                r3.A9m("lat", String.valueOf(lastLocation.getLatitude()));
                r3.A9m("lng", String.valueOf(lastLocation.getLongitude()));
            }
            if (182.A06(0Tu.A05, userSession, 36319295722036328L) && (map = this.A0F) != null && (!map.isEmpty())) {
                r3.A9m("ad_and_netego_request_information", AnonymousClass4LV.A00(map));
            }
            if (this.A0I) {
                if (this.A0H) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
                r3.A09 = num;
            } else {
                r3.A06 = 1CE.A04;
            }
            if (!this.A0H || this.A0K) {
                r3.A0A = str2;
                r3.A07(AnonymousClass05K.A01);
            }
            r3.A01 = this.A00;
            r3.A0H("is_ptr", this.A0J);
            r3.A0H("is_auto_refresh", this.A0G);
            Integer num2 = this.A04;
            if (num2 != null) {
                r3.A0A = str2;
                r3.A07 = num2;
                r3.A02 = new 1NS(new 0bH(userSession), cls);
            }
            Long l = this.A05;
            if (l != null) {
                r3.A00 = l.longValue();
            }
            A00(r3, this);
            C228232l0 r1 = this.A02;
            if (!(r1 == null || (AUH = r1.AUH(this.A07)) == null)) {
                for (Map.Entry entry : AUH.entrySet()) {
                    r3.A9m((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return r3.A0M();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final 1OC A02() {
        UserSession userSession = this.A0L;
        1NY r3 = new 1NY(userSession, -2);
        r3.A08(AnonymousClass05K.A0N);
        r3.A0A(this.A07);
        r3.A02 = new 1NS(new 0bH(userSession), C3723990r.class);
        r3.A0A = this.A08;
        r3.A07(AnonymousClass05K.A0C);
        r3.A01 = this.A00;
        A00(r3, this);
        return r3.A0M();
    }

    public C3723790p(UserSession userSession) {
        this.A0L = userSession;
    }
}
