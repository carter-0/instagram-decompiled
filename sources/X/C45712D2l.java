package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.EventPageNavigationMetadataImpl;
import com.instagram.api.schemas.EventVisibilityType;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.IGLocalEventDictImpl;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfoImpl;
import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import com.instagram.api.schemas.ScheduledLiveDiscountInfoImpl;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductWrapper;
import com.instagram.user.model.ScheduledLiveProductsMetadata;
import com.instagram.user.model.UpcomingDropCampaignEventMetadata;
import com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import com.instagram.user.model.UpcomingEventLiveMetadataImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D2l  reason: case insensitive filesystem */
public abstract class C45712D2l {
    public static UpcomingEventImpl parseFromJson(16F r27) {
        String str;
        16F r1 = r27;
        0qQ.A0B(r1, 0);
        try {
            Boolean bool = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            Long l = null;
            UpcomingDropCampaignEventMetadataImpl upcomingDropCampaignEventMetadataImpl = null;
            Long l2 = null;
            EventPageNavigationMetadataImpl eventPageNavigationMetadataImpl = null;
            String str2 = null;
            IGLocalEventDictImpl iGLocalEventDictImpl = null;
            Boolean bool2 = null;
            Long l3 = null;
            UpcomingEventLiveMetadataImpl upcomingEventLiveMetadataImpl = null;
            UpcomingEventMediaImpl upcomingEventMediaImpl = null;
            User user = null;
            String str3 = null;
            String str4 = null;
            UpcomingEventIDType upcomingEventIDType = null;
            while (r1.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r1);
                if ("drops_campaign_metadata".equals(A17)) {
                    upcomingDropCampaignEventMetadataImpl = C45140Cqy.parseFromJson(r1);
                } else if ("end_time".equals(A17)) {
                    l2 = AnonymousClass7TF.A0Z(r1);
                } else if ("event_page_metadata".equals(A17)) {
                    eventPageNavigationMetadataImpl = CXS.parseFromJson(r1);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                } else if ("ig_local_event_dict".equals(A17)) {
                    iGLocalEventDictImpl = CZA.parseFromJson(r1);
                } else if ("is_ig_local_event".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r1);
                } else if ("last_notification_time".equals(A17)) {
                    l3 = AnonymousClass7TF.A0Z(r1);
                } else if ("live_metadata".equals(A17)) {
                    upcomingEventLiveMetadataImpl = C45143Cr1.parseFromJson(r1);
                } else if (C41845B3m.A1D(A17)) {
                    upcomingEventMediaImpl = C45694D1t.parseFromJson(r1);
                } else if ("owner".equals(A17)) {
                    user = C41845B3m.A0a(r1, false);
                } else if ("reminder_enabled".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r1);
                } else if (TraceFieldType.StartTime.equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r1);
                } else if ("strong_id__".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("upcoming_event_id_type".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                    upcomingEventIDType = (UpcomingEventIDType) UpcomingEventIDType.A01.get(str);
                    if (upcomingEventIDType == null) {
                        upcomingEventIDType = UpcomingEventIDType.UNRECOGNIZED;
                    }
                }
                r1.A0z();
            }
            if (str2 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r1, "UpcomingEventImpl");
            } else if (bool == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("reminder_enabled", r1, "UpcomingEventImpl");
            } else if (l == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(TraceFieldType.StartTime, r1, "UpcomingEventImpl");
            } else if (str4 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r1, "UpcomingEventImpl");
            } else if (upcomingEventIDType != null || !(r1 instanceof 0c9)) {
                return new UpcomingEventImpl(eventPageNavigationMetadataImpl, iGLocalEventDictImpl, upcomingEventIDType, upcomingEventMediaImpl, upcomingDropCampaignEventMetadataImpl, upcomingEventLiveMetadataImpl, user, bool2, l2, l3, str2, str3, str4, l.longValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("upcoming_event_id_type", r1, "UpcomingEventImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r5, UpcomingEventImpl upcomingEventImpl) {
        r5.A0c();
        UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata = upcomingEventImpl.A05;
        if (upcomingDropCampaignEventMetadata != null) {
            r5.A0q("drops_campaign_metadata");
            UpcomingDropCampaignEventMetadataImpl FGx = upcomingDropCampaignEventMetadata.FGx(new 1hu((UserSession) null));
            r5.A0c();
            ProductCollection productCollection = FGx.A01;
            if (productCollection != null) {
                r5.A0q("collection_metadata");
                C45710D2j.A00(r5, productCollection.FGp(new 1hu((UserSession) null)));
            }
            UpcomingEventMedia upcomingEventMedia = FGx.A00;
            if (upcomingEventMedia != null) {
                r5.A0q("cover_media");
                C45694D1t.A00(r5, upcomingEventMedia.FG4());
            }
            String str = FGx.A03;
            if (str != null) {
                r5.A0R("drop_campaign_id", str);
            }
            String str2 = FGx.A04;
            if (str2 != null) {
                r5.A0R("launch_type_subtitle", str2);
            }
            User user = FGx.A02;
            if (user != null) {
                C41845B3m.A0w(r5, user, "merchant");
            }
            List list = FGx.A05;
            if (list != null) {
                Iterator A0s = C41845B3m.A0s(r5, "products", list);
                while (A0s.hasNext()) {
                    ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) A0s.next();
                    if (productDetailsProductItemDict != null) {
                        C275404q6.A00(r5, productDetailsProductItemDict);
                    }
                }
                r5.A0Y();
            }
            r5.A0Z();
        }
        Long l = upcomingEventImpl.A09;
        if (l != null) {
            r5.A0Q("end_time", l.longValue());
        }
        EventPageNavigationMetadata eventPageNavigationMetadata = upcomingEventImpl.A01;
        if (eventPageNavigationMetadata != null) {
            r5.A0q("event_page_metadata");
            EventPageNavigationMetadataImpl F2m = eventPageNavigationMetadata.F2m();
            r5.A0c();
            String str3 = F2m.A01;
            if (str3 != null) {
                r5.A0R(DevServerEntity.COLUMN_DESCRIPTION, str3);
            }
            Integer num = F2m.A00;
            if (num != null) {
                r5.A0P("reminder_count", num.intValue());
            }
            String str4 = F2m.A02;
            if (str4 != null) {
                r5.A0R("subtitle", str4);
            }
            r5.A0Z();
        }
        C41846B3n.A0y(r5, upcomingEventImpl.A0B);
        IGLocalEventDict iGLocalEventDict = upcomingEventImpl.A02;
        if (iGLocalEventDict != null) {
            r5.A0q("ig_local_event_dict");
            IGLocalEventDictImpl F4d = iGLocalEventDict.F4d();
            r5.A0c();
            String str5 = F4d.A01;
            if (str5 != null) {
                r5.A0R("ig_event_time_string", str5);
            }
            EventVisibilityType eventVisibilityType = F4d.A00;
            if (eventVisibilityType != null) {
                r5.A0R("ig_event_visibility", eventVisibilityType.A00);
            }
            r5.A0Z();
        }
        Boolean bool = upcomingEventImpl.A08;
        if (bool != null) {
            r5.A0S("is_ig_local_event", bool.booleanValue());
        }
        Long l2 = upcomingEventImpl.A0A;
        if (l2 != null) {
            r5.A0Q("last_notification_time", l2.longValue());
        }
        UpcomingEventLiveMetadata upcomingEventLiveMetadata = upcomingEventImpl.A06;
        if (upcomingEventLiveMetadata != null) {
            r5.A0q("live_metadata");
            UpcomingEventLiveMetadataImpl FH1 = upcomingEventLiveMetadata.FH1(new 1hu((UserSession) null));
            r5.A0c();
            String str6 = FH1.A03;
            if (str6 != null) {
                r5.A0R(TraceFieldType.BroadcastId, str6);
            }
            Boolean bool2 = FH1.A01;
            if (bool2 != null) {
                r5.A0S("is_broadcast_ended", bool2.booleanValue());
            }
            r5.A0S("is_scheduled_live", FH1.A05);
            r5.A0S("live_notifs_enabled", FH1.A06);
            String str7 = FH1.A04;
            if (str7 != null) {
                r5.A0R("post_live_media_id", str7);
            }
            ScheduledLiveProductsMetadata scheduledLiveProductsMetadata = FH1.A00;
            if (scheduledLiveProductsMetadata != null) {
                r5.A0q("shopping_info");
                r5.A0c();
                ScheduledLiveAffiliateInfo scheduledLiveAffiliateInfo = scheduledLiveProductsMetadata.A00;
                if (scheduledLiveAffiliateInfo != null) {
                    r5.A0q("affiliate_info");
                    ScheduledLiveAffiliateInfoImpl F8p = scheduledLiveAffiliateInfo.F8p();
                    r5.A0c();
                    String str8 = F8p.A00;
                    if (str8 != null) {
                        r5.A0R("disclosure_tag", str8);
                    }
                    r5.A0Z();
                }
                ProductCollection productCollection2 = scheduledLiveProductsMetadata.A02;
                if (productCollection2 != null) {
                    r5.A0q("collection_metadata");
                    C45710D2j.A00(r5, productCollection2.FGp(new 1hu((UserSession) null)));
                }
                ScheduledLiveDiscountInfo scheduledLiveDiscountInfo = scheduledLiveProductsMetadata.A01;
                if (scheduledLiveDiscountInfo != null) {
                    r5.A0q("discount_info");
                    ScheduledLiveDiscountInfoImpl F8q = scheduledLiveDiscountInfo.F8q();
                    r5.A0c();
                    String str9 = F8q.A01;
                    if (str9 != null) {
                        r5.A0R("discount_id", str9);
                    }
                    Boolean bool3 = F8q.A00;
                    if (bool3 != null) {
                        r5.A0S("is_auto_tagged", bool3.booleanValue());
                    }
                    r5.A0Z();
                }
                User user2 = scheduledLiveProductsMetadata.A03;
                if (user2 != null) {
                    C41845B3m.A0w(r5, user2, "merchant");
                }
                List list2 = scheduledLiveProductsMetadata.A04;
                if (list2 != null) {
                    Iterator A0s2 = C41845B3m.A0s(r5, "products", list2);
                    while (A0s2.hasNext()) {
                        ProductWrapper productWrapper = (ProductWrapper) A0s2.next();
                        if (productWrapper != null) {
                            C45711D2k.A00(r5, productWrapper);
                        }
                    }
                    r5.A0Y();
                }
                r5.A0Z();
            }
            Integer num2 = FH1.A02;
            if (num2 != null) {
                r5.A0P("visibility", num2.intValue());
            }
            r5.A0Z();
        }
        UpcomingEventMedia upcomingEventMedia2 = upcomingEventImpl.A04;
        if (upcomingEventMedia2 != null) {
            r5.A0q("media");
            C45694D1t.A00(r5, upcomingEventMedia2.FG4());
        }
        User user3 = upcomingEventImpl.A07;
        if (user3 != null) {
            C41845B3m.A0w(r5, user3, "owner");
        }
        r5.A0S("reminder_enabled", upcomingEventImpl.A0E);
        r5.A0Q(TraceFieldType.StartTime, upcomingEventImpl.A00);
        String str10 = upcomingEventImpl.A0C;
        if (str10 != null) {
            r5.A0R("strong_id__", str10);
        }
        C41846B3n.A10(r5, upcomingEventImpl.A0D);
        UpcomingEventIDType upcomingEventIDType = upcomingEventImpl.A03;
        if (upcomingEventIDType != null) {
            r5.A0R("upcoming_event_id_type", upcomingEventIDType.A00);
        }
        r5.A0Z();
    }
}
