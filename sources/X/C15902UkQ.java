package X;

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

/* renamed from: X.UkQ  reason: case insensitive filesystem */
public final class C15902UkQ extends C230622pv {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final UpcomingEvent A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C15902UkQ(AnonymousClass0iw r2, UserSession userSession, UpcomingEvent upcomingEvent, String str, String str2, String str3) {
        0qQ.A0B(userSession, 2);
        this.A03 = str;
        this.A01 = userSession;
        this.A02 = upcomingEvent;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        long j2;
        String str;
        List<ProductWrapperIntf> Bga;
        Long l;
        String productId;
        User BRo;
        ProductCollection Aoo;
        Long A10;
        UserSession userSession = this.A01;
        String str2 = this.A04;
        AnonymousClass0iw r4 = this.A00;
        UpcomingEvent upcomingEvent = this.A02;
        String str3 = this.A03;
        String str4 = this.A05;
        Double valueOf = Double.valueOf(((double) j) / 1000.0d);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), C273654mx.A00(2886));
        if (A0e.isSampled()) {
            DbS.A1J(A0e, "upcoming_event_sheet_time_spent");
            String id = upcomingEvent.getId();
            if (id == null || (A10 = AnonymousClass7TE.A10(id)) == null) {
                j2 = 0;
            } else {
                j2 = A10.longValue();
            }
            A0e.A9F(C273654mx.A00(419), Long.valueOf(j2));
            C51965G9l.A1I(A0e, str3);
            A0e.AAJ("source_of_action", str4);
            A0e.A8D("event_sheet_time_spent", valueOf);
            C51965G9l.A1L(A0e, C310306am.A02(userSession, str3));
            A0e.A9F("ad_campaign_id", C310306am.A01(userSession, str3));
            C51965G9l.A1D(A0e, C310306am.A00(userSession, str3));
            C51973G9u.A14(A0e, "prior_module", str2);
            A0e.AAJ(C273654mx.A00(194), C17115VIl.A00(upcomingEvent));
            UpcomingEventLiveMetadata BNJ = upcomingEvent.BNJ();
            if (BNJ != null) {
                ScheduledLiveProductsMetadataIntf Btm = BNJ.Btm();
                ArrayList arrayList = null;
                if (Btm == null || (Aoo = Btm.Aoo()) == null) {
                    str = null;
                } else {
                    str = Aoo.Aoi();
                }
                A0e.AAJ("collection_id", str);
                ScheduledLiveProductsMetadataIntf Btm2 = BNJ.Btm();
                if (!(Btm2 == null || (BRo = Btm2.BRo()) == null)) {
                    A0e.A9F("merchant_id", C263944Ny.A00(AnonymousClass3ZA.A00(BRo)).A00);
                }
                ScheduledLiveProductsMetadataIntf Btm3 = BNJ.Btm();
                if (!(Btm3 == null || (Bga = Btm3.Bga()) == null)) {
                    ArrayList A0p = AnonymousClass7TF.A0p(Bga);
                    for (ProductWrapperIntf Bg5 : Bga) {
                        ProductDetailsProductItemDictIntf Bg52 = Bg5.Bg5();
                        if (Bg52 == null || (productId = Bg52.getProductId()) == null) {
                            l = null;
                        } else {
                            l = 00y.A0n(10, productId);
                        }
                        A0p.add(l);
                    }
                    arrayList = A0p;
                }
                A0e.AAe("product_ids", arrayList);
                A0e.A7p(C273654mx.A00(2426), Boolean.valueOf(C18810W3l.A06(upcomingEvent)));
            }
            A0e.Cgf();
        }
    }
}
