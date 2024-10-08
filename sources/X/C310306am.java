package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.ProductWrapperIntf;
import com.instagram.user.model.ScheduledLiveProductsMetadataIntf;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6am  reason: invalid class name and case insensitive filesystem */
public final class C310306am {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;

    public C310306am(AnonymousClass0iw r2, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = r2;
    }

    public final void A04(UpcomingEvent upcomingEvent, String str, String str2, String str3) {
        long j;
        String str4;
        List<ProductWrapperIntf> Bga;
        Long l;
        String productId;
        User BRo;
        ProductCollection Aoo;
        Long A0n;
        0qQ.A0B(upcomingEvent, 0);
        UserSession userSession = this.A01;
        0wc A012 = AnonymousClass0kN.A01(this.A00, userSession);
        0Aj A002 = A012.A00(A012.A00, "instagram_upcoming_event_action");
        if (A002.isSampled()) {
            A002.AAJ("action", str2);
            String id = upcomingEvent.getId();
            if (id == null || (A0n = 00y.A0n(10, id)) == null) {
                j = 0;
            } else {
                j = A0n.longValue();
            }
            A002.A9F("upcoming_event_id", Long.valueOf(j));
            A002.AAJ("m_pk", str);
            A002.AAJ("source_of_action", str3);
            A002.AAJ("tracking_token", A02(userSession, str));
            A002.A9F("ad_campaign_id", A01(userSession, str));
            A002.A9F("ad_id", A00(userSession, str));
            A002.AAJ("prior_module", this.A02);
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.AAJ("upcoming_event_type", C17115VIl.A00(upcomingEvent));
            UpcomingEventLiveMetadata BNJ = upcomingEvent.BNJ();
            if (BNJ != null) {
                ScheduledLiveProductsMetadataIntf Btm = BNJ.Btm();
                ArrayList arrayList = null;
                if (Btm == null || (Aoo = Btm.Aoo()) == null) {
                    str4 = null;
                } else {
                    str4 = Aoo.Aoi();
                }
                A002.AAJ("collection_id", str4);
                ScheduledLiveProductsMetadataIntf Btm2 = BNJ.Btm();
                if (!(Btm2 == null || (BRo = Btm2.BRo()) == null)) {
                    A002.A9F("merchant_id", C263944Ny.A00(AnonymousClass3ZA.A00(BRo)).A00);
                }
                ScheduledLiveProductsMetadataIntf Btm3 = BNJ.Btm();
                if (!(Btm3 == null || (Bga = Btm3.Bga()) == null)) {
                    ArrayList arrayList2 = new ArrayList(0Yv.A1E(Bga, 10));
                    for (ProductWrapperIntf Bg5 : Bga) {
                        ProductDetailsProductItemDictIntf Bg52 = Bg5.Bg5();
                        if (Bg52 == null || (productId = Bg52.getProductId()) == null) {
                            l = null;
                        } else {
                            l = 00y.A0n(10, productId);
                        }
                        arrayList2.add(l);
                    }
                    arrayList = arrayList2;
                }
                A002.AAe("product_ids", arrayList);
                A002.A7p("has_event_started", Boolean.valueOf(C18810W3l.A06(upcomingEvent)));
            }
            A002.Cgf();
        }
    }

    public final void A05(String str, String str2) {
        Long l;
        Long l2 = null;
        if (str != null && 00l.A0d(str, "upcoming_event_reminder_type", false)) {
            Uri A03 = 0cp.A03(str);
            0qQ.A07(A03);
            String queryParameter = A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String queryParameter2 = A03.getQueryParameter("upcoming_event_id");
            if (queryParameter2 != null) {
                l = 00y.A0n(10, queryParameter2);
            } else {
                l = null;
            }
            String queryParameter3 = A03.getQueryParameter("upcoming_event_reminder_type");
            if (queryParameter3 != null) {
                l2 = 00y.A0n(10, queryParameter3);
            }
            A03(this, l, l2, queryParameter, str2, "push_notification", (String) null, (String) null);
        }
    }

    public static final void A03(C310306am r4, Long l, Long l2, String str, String str2, String str3, String str4, String str5) {
        long j;
        Long l3;
        UserSession userSession = r4.A01;
        0wc A012 = AnonymousClass0kN.A01(r4.A00, userSession);
        0Aj A002 = A012.A00(A012.A00, "instagram_upcoming_event_action");
        if (A002.isSampled()) {
            A002.AAJ("action", str2);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            A002.A9F("upcoming_event_id", Long.valueOf(j));
            A002.AAJ("m_pk", str);
            A002.A9F("notification_type", l2);
            A002.AAJ("source_of_action", str3);
            if (str5 == null) {
                str5 = A02(userSession, str);
            }
            A002.AAJ("tracking_token", str5);
            A002.A9F("ad_campaign_id", A01(userSession, str));
            if (str4 == null || (l3 = 00y.A0n(10, str4)) == null) {
                l3 = A00(userSession, str);
            }
            A002.A9F("ad_id", l3);
            A002.AAJ("prior_module", (String) null);
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.Cgf();
        }
    }

    public static final Long A00(UserSession userSession, String str) {
        String A07;
        1Xj A022 = 1E7.A00(userSession).A02(str);
        if (A022 == null || (A07 = C231122qu.A07(userSession, A022)) == null) {
            return null;
        }
        return 00y.A0n(10, A07);
    }

    public static final Long A01(UserSession userSession, String str) {
        String A2V;
        1Xj A022 = 1E7.A00(userSession).A02(str);
        if (A022 == null) {
            return null;
        }
        AnonymousClass3OA A002 = 1wN.A00(userSession).A00(A022);
        if (A002 != null) {
            A2V = A002.A0W;
        } else {
            A2V = A022.A2V();
        }
        if (A2V != null) {
            return 00y.A0n(10, A2V);
        }
        return null;
    }

    public static final String A02(UserSession userSession, String str) {
        1Xj A022 = 1E7.A00(userSession).A02(str);
        if (A022 == null) {
            return null;
        }
        String A06 = C231122qu.A06(userSession, A022);
        if (A06 == null) {
            return A022.A0C.getOrganicTrackingToken();
        }
        return A06;
    }
}
