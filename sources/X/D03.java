package X;

import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import java.io.IOException;

public abstract class D03 {
    public static BHY parseFromJson(16F r32) {
        String str;
        String str2;
        16F r2 = r32;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Float f = null;
            Float f2 = null;
            String str8 = null;
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str9 = null;
            String str10 = null;
            Float f3 = null;
            UpcomingEventStickerSource upcomingEventStickerSource = null;
            Float f4 = null;
            Integer num5 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
            String str11 = null;
            UpcomingEventImpl upcomingEventImpl = null;
            UpcomingEventMediaImpl upcomingEventMediaImpl = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                if (C41846B3n.A1a(r2, A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if (C41845B3m.A1X(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("consumption_disabled_reason".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if (C41845B3m.A1Z(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if (C41845B3m.A1S(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if (C41845B3m.A1R(A0q)) {
                    f = AnonymousClass7TF.A0U(r2);
                } else if (C41845B3m.A1G(A0q)) {
                    f2 = AnonymousClass7TF.A0U(r2);
                } else if (C41845B3m.A17(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if ("is_consumption_disabled".equals(A0q)) {
                    bool = AnonymousClass7TF.A0S(r2);
                } else if (C41845B3m.A1T(A0q)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1M(A0q)) {
                    num2 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1N(A0q)) {
                    num3 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1P(A0q)) {
                    num4 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1J(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r2.A1P();
                    }
                } else if (C41845B3m.A1O(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r2.A1P();
                    }
                } else if (C41845B3m.A1K(A0q)) {
                    f3 = C41846B3n.A0f(r2);
                } else if ("source".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                    upcomingEventStickerSource = (UpcomingEventStickerSource) UpcomingEventStickerSource.A01.get(str2);
                    if (upcomingEventStickerSource == null) {
                        upcomingEventStickerSource = UpcomingEventStickerSource.UNRECOGNIZED;
                    }
                } else if (C41845B3m.A1U(A0q)) {
                    f4 = C41846B3n.A0f(r2);
                } else if (C41845B3m.A1a(A0q)) {
                    num5 = AnonymousClass7TF.A0X(r2);
                } else if (C41845B3m.A1b(A0q)) {
                    subscriptionStickerDict = D06.parseFromJson(r2);
                } else if (C41845B3m.A1I(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    stickerTraySurface = C45628Cze.A01(str);
                } else if ("thumbnail_url".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r2.A1P();
                    }
                } else if ("upcoming_event".equals(A0q)) {
                    upcomingEventImpl = C45712D2l.parseFromJson(r2);
                } else if ("upcoming_event_media".equals(A0q)) {
                    upcomingEventMediaImpl = C45694D1t.parseFromJson(r2);
                } else if (C41845B3m.A1F(A0q)) {
                    f5 = C41846B3n.A0f(r2);
                } else if (C41845B3m.A15(A0q)) {
                    f6 = C41846B3n.A0f(r2);
                } else if (C41845B3m.A16(A0q)) {
                    f7 = C41846B3n.A0f(r2);
                } else {
                    f8 = C41847B3o.A11(r2, f8, A0q);
                }
                r2.A0z();
            }
            return new BHY(stickerTraySurface, subscriptionStickerDict, upcomingEventStickerSource, upcomingEventMediaImpl, upcomingEventImpl, bool, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, BHY bhy) {
        r2.A0c();
        C41846B3n.A13(r2, bhy.A0J);
        C41846B3n.A16(r2, bhy.A0K);
        String str = bhy.A0L;
        if (str != null) {
            r2.A0R("consumption_disabled_reason", str);
        }
        C41846B3n.A17(r2, bhy.A0M);
        C41846B3n.A15(r2, bhy.A0N);
        C41846B3n.A0w(r2, bhy.A06);
        C41846B3n.A0u(r2, bhy.A07);
        C41846B3n.A0y(r2, bhy.A0O);
        Boolean bool = bhy.A05;
        if (bool != null) {
            r2.A0S("is_consumption_disabled", bool.booleanValue());
        }
        C41846B3n.A0o(r2, bhy.A0E);
        C41846B3n.A0l(r2, bhy.A0F);
        C41846B3n.A0m(r2, bhy.A0G);
        C41846B3n.A0n(r2, bhy.A0H);
        C41846B3n.A11(r2, bhy.A0P);
        C41846B3n.A12(r2, bhy.A0Q);
        C41846B3n.A0v(r2, bhy.A08);
        UpcomingEventStickerSource upcomingEventStickerSource = bhy.A02;
        if (upcomingEventStickerSource != null) {
            r2.A0R("source", upcomingEventStickerSource.A00);
        }
        C41846B3n.A0x(r2, bhy.A09);
        C41846B3n.A0p(r2, bhy.A0I);
        C41846B3n.A0k(r2, bhy.A01);
        C41846B3n.A0j(r2, bhy.A00);
        String str2 = bhy.A0R;
        if (str2 != null) {
            r2.A0R("thumbnail_url", str2);
        }
        UpcomingEvent upcomingEvent = bhy.A04;
        if (upcomingEvent != null) {
            C45712D2l.A00(r2, upcomingEvent.FGz(C41846B3n.A0T(r2, "upcoming_event")));
        }
        UpcomingEventMedia upcomingEventMedia = bhy.A03;
        if (upcomingEventMedia != null) {
            r2.A0q("upcoming_event_media");
            C45694D1t.A00(r2, upcomingEventMedia.FG4());
        }
        C41846B3n.A0t(r2, bhy.A0A);
        C41846B3n.A0q(r2, bhy.A0B);
        C41846B3n.A0r(r2, bhy.A0C);
        C41846B3n.A0s(r2, bhy.A0D);
        r2.A0Z();
    }
}
