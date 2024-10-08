package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.save.model.CollaborativeCollectionMetadata;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Vwn  reason: case insensitive filesystem */
public final class C18689Vwn {
    public static SavedCollection parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            SavedCollection savedCollection = new SavedCollection();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("collection_id".equals(A17)) {
                    savedCollection.A0F = AnonymousClass7TG.A0l(r5);
                } else if ("collection_name".equals(A17)) {
                    savedCollection.A0G = AnonymousClass7TG.A0l(r5);
                } else if ("collection_owner".equals(A17)) {
                    savedCollection.A08 = C41845B3m.A0a(r5, false);
                } else if ("collection_media_count".equals(A17)) {
                    savedCollection.A0E = AnonymousClass7TF.A0X(r5);
                } else if ("collection_locations_count".equals(A17)) {
                    savedCollection.A0D = AnonymousClass7TF.A0X(r5);
                } else if (C273654mx.A00(76).equals(A17)) {
                    savedCollection.A04 = 1Xj.A00(r5);
                } else if ("cover_image_thumbnail_url".equals(A17)) {
                    savedCollection.A01 = 16h.A00(r5);
                } else if ("privacy_mode".equals(A17)) {
                    CollectionPrivacyModeEnum collectionPrivacyModeEnum = (CollectionPrivacyModeEnum) CollectionPrivacyModeEnum.A01.get(AnonymousClass7TG.A0l(r5));
                    if (collectionPrivacyModeEnum == null) {
                        collectionPrivacyModeEnum = CollectionPrivacyModeEnum.UNRECOGNIZED;
                    }
                    savedCollection.A00 = collectionPrivacyModeEnum;
                } else if (AnonymousClass000.A00(72).equals(A17)) {
                    String A1Q = r5.A1Q();
                    Map map = C54665HMw.A02;
                    if (A1Q == null) {
                        str = "";
                    } else {
                        str = A1Q;
                    }
                    Object obj = map.get(str);
                    if (obj == null) {
                        0wb.A03("SavedCollectionType", 002.A0R("Can't parse type ", A1Q));
                        obj = C54665HMw.MEDIA;
                    }
                    savedCollection.A07 = (C54665HMw) obj;
                } else if ("cover_media_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1D(r5, arrayList);
                        }
                    }
                    savedCollection.A0L = arrayList;
                } else if ("cover_audio_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C17262VOp parseFromJson = VGA.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    savedCollection.A0J = arrayList;
                } else if ("product_cover_image_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            ProductImageContainerImpl parseFromJson2 = C275414q7.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    savedCollection.A0M = arrayList;
                } else if ("has_private_media".equals(A17)) {
                    savedCollection.A0C = AnonymousClass7TF.A0S(r5);
                } else if (AnonymousClass000.A00(1575).equals(A17)) {
                    savedCollection.A06 = (HMU) HMU.A01.get(r5.A1Q());
                } else if ("most_recent_saved_location".equals(A17)) {
                    savedCollection.A03 = C16928VBf.parseFromJson(r5);
                } else if ("contains_provided_media_id".equals(A17)) {
                    savedCollection.A09 = AnonymousClass7TF.A0S(r5);
                } else if ("enable_cover_placeholder".equals(A17)) {
                    savedCollection.A0A = AnonymousClass7TF.A0S(r5);
                } else if ("collab_meta".equals(A17)) {
                    savedCollection.A05 = VGB.parseFromJson(r5);
                } else if ("has_liked".equals(A17)) {
                    savedCollection.A0B = AnonymousClass7TF.A0S(r5);
                } else {
                    1XY.A01(r5, savedCollection, A17);
                }
                r5.A0z();
            }
            1Xj r0 = savedCollection.A04;
            if (r0 != null) {
                savedCollection.A0H = r0.getId();
            }
            Iterator it = savedCollection.A0L.iterator();
            while (it.hasNext()) {
                savedCollection.A0K.add(C51966G9m.A0t(it).getId());
            }
            return savedCollection;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r8, SavedCollection savedCollection) {
        r8.A0c();
        String str = savedCollection.A0F;
        if (str != null) {
            r8.A0R("collection_id", str);
        }
        String str2 = savedCollection.A0G;
        if (str2 != null) {
            r8.A0R("collection_name", str2);
        }
        if (savedCollection.A08 != null) {
            r8.A0q("collection_owner");
            User user = savedCollection.A08;
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r8, user);
        }
        Integer num = savedCollection.A0E;
        if (num != null) {
            r8.A0P("collection_media_count", num.intValue());
        }
        Integer num2 = savedCollection.A0D;
        if (num2 != null) {
            r8.A0P("collection_locations_count", num2.intValue());
        }
        if (savedCollection.A04 != null) {
            r8.A0q(C273654mx.A00(76));
            1Xj r1 = savedCollection.A04;
            1Xv r0 = 1Xj.A0h;
            1Xv.A07(r8, r1);
        }
        if (savedCollection.A01 != null) {
            r8.A0q("cover_image_thumbnail_url");
            16h.A01(r8, savedCollection.A01);
        }
        CollectionPrivacyModeEnum collectionPrivacyModeEnum = savedCollection.A00;
        if (collectionPrivacyModeEnum != null) {
            r8.A0R("privacy_mode", collectionPrivacyModeEnum.A00);
        }
        C54665HMw hMw = savedCollection.A07;
        if (hMw != null) {
            r8.A0R(AnonymousClass000.A00(72), hMw.A01);
        }
        if (savedCollection.A0L != null) {
            16P.A03(r8, "cover_media_list");
            Iterator it = savedCollection.A0L.iterator();
            while (it.hasNext()) {
                C41848B3p.A1O(r8, it);
            }
            r8.A0Y();
        }
        if (savedCollection.A0J != null) {
            16P.A03(r8, "cover_audio_list");
            for (C17262VOp vOp : savedCollection.A0J) {
                if (vOp != null) {
                    r8.A0c();
                    r8.A0q("thumbnail_uri");
                    16h.A01(r8, vOp.A00);
                    r8.A0Z();
                }
            }
            r8.A0Y();
        }
        if (savedCollection.A0M != null) {
            16P.A03(r8, "product_cover_image_list");
            for (ProductImageContainerImpl productImageContainerImpl : savedCollection.A0M) {
                if (productImageContainerImpl != null) {
                    C275414q7.A00(r8, productImageContainerImpl);
                }
            }
            r8.A0Y();
        }
        Boolean bool = savedCollection.A0C;
        if (bool != null) {
            r8.A0S("has_private_media", bool.booleanValue());
        }
        HMU hmu = savedCollection.A06;
        if (hmu != null) {
            r8.A0R(AnonymousClass000.A00(1575), hmu.A00);
        }
        if (savedCollection.A03 != null) {
            r8.A0q("most_recent_saved_location");
            MediaMapPin mediaMapPin = savedCollection.A03;
            r8.A0c();
            Double d = mediaMapPin.A0A;
            if (d != null) {
                r8.A0N("lat", d.doubleValue());
            }
            Double d2 = mediaMapPin.A0B;
            if (d2 != null) {
                r8.A0N("lng", d2.doubleValue());
            }
            if (mediaMapPin.A09 != null) {
                r8.A0q("location");
                AnonymousClass41Q.A00(r8, mediaMapPin.A09);
            }
            C41846B3n.A11(r8, mediaMapPin.A0D);
            if (mediaMapPin.A05 != null) {
                r8.A0q("thumbnail_url");
                16h.A01(r8, mediaMapPin.A05);
            }
            if (mediaMapPin.A06 != null) {
                r8.A0q("page_info");
                LocationPageInformation locationPageInformation = mediaMapPin.A06;
                r8.A0c();
                String str3 = locationPageInformation.A08;
                if (str3 != null) {
                    r8.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
                }
                String str4 = locationPageInformation.A09;
                if (str4 != null) {
                    r8.A0R("phone", str4);
                }
                String str5 = locationPageInformation.A0A;
                if (str5 != null) {
                    r8.A0R("website", str5);
                }
                String str6 = locationPageInformation.A06;
                if (str6 != null) {
                    r8.A0R("category", str6);
                }
                Integer num3 = locationPageInformation.A03;
                if (num3 != null) {
                    r8.A0P("price_range", num3.intValue());
                }
                String str7 = locationPageInformation.A05;
                if (str7 != null) {
                    r8.A0R("location_address", str7);
                }
                String str8 = locationPageInformation.A07;
                if (str8 != null) {
                    r8.A0R("location_city", str8);
                }
                Integer num4 = locationPageInformation.A04;
                if (num4 != null) {
                    r8.A0P("location_region", num4.intValue());
                }
                String str9 = locationPageInformation.A0B;
                if (str9 != null) {
                    r8.A0R("location_zip", str9);
                }
                if (locationPageInformation.A01 != null) {
                    r8.A0q("hours");
                    LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = locationPageInformation.A01;
                    r8.A0c();
                    String str10 = locationPageInfoPageOperationHourResponse.A03;
                    if (str10 != null) {
                        r8.A0R(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str10);
                    }
                    if (locationPageInfoPageOperationHourResponse.A04 != null) {
                        16P.A03(r8, "schedule");
                        for (LocationPageInfoPageOperationHour locationPageInfoPageOperationHour : locationPageInfoPageOperationHourResponse.A04) {
                            if (locationPageInfoPageOperationHour != null) {
                                r8.A0c();
                                String str11 = locationPageInfoPageOperationHour.A00;
                                if (str11 != null) {
                                    r8.A0R(AnonymousClass000.A00(1262), str11);
                                }
                                if (locationPageInfoPageOperationHour.A01 != null) {
                                    16P.A03(r8, "hours");
                                    Iterator it2 = locationPageInfoPageOperationHour.A01.iterator();
                                    while (it2.hasNext()) {
                                        C41846B3n.A18(r8, it2);
                                    }
                                    r8.A0Y();
                                }
                                1XY.A00(r8, locationPageInfoPageOperationHour);
                                r8.A0Z();
                            }
                        }
                        r8.A0Y();
                    }
                    String str12 = locationPageInfoPageOperationHourResponse.A01;
                    if (str12 != null) {
                        r8.A0R("current_status", str12);
                    }
                    String str13 = locationPageInfoPageOperationHourResponse.A02;
                    if (str13 != null) {
                        r8.A0R("hours_today", str13);
                    }
                    Boolean bool2 = locationPageInfoPageOperationHourResponse.A00;
                    if (bool2 != null) {
                        r8.A0S("is_open", bool2.booleanValue());
                    }
                    r8.A0Z();
                }
                if (locationPageInformation.A00 != null) {
                    r8.A0q("ig_business");
                    VN9 vn9 = locationPageInformation.A00;
                    r8.A0c();
                    if (vn9.A00 != null) {
                        r8.A0q("profile");
                        User user2 = vn9.A00;
                        Parcelable.Creator creator2 = User.CREATOR;
                        1aC.A08(r8, user2);
                    }
                    r8.A0Z();
                }
                r8.A0S("has_menu", locationPageInformation.A0C);
                Integer num5 = locationPageInformation.A02;
                if (num5 != null) {
                    r8.A0P("num_guides", num5.intValue());
                }
                r8.A0Z();
            }
            r8.A0Q("media_taken_at_seconds", mediaMapPin.A01);
            r8.A0P("rank", mediaMapPin.A00);
            if (mediaMapPin.A0E != null) {
                16P.A03(r8, AnonymousClass000.A00(740));
                Iterator it3 = mediaMapPin.A0E.iterator();
                while (it3.hasNext()) {
                    MediaMapPinPreview mediaMapPinPreview = (MediaMapPinPreview) it3.next();
                    if (mediaMapPinPreview != null) {
                        r8.A0c();
                        C41846B3n.A11(r8, mediaMapPinPreview.A01);
                        if (mediaMapPinPreview.A00 != null) {
                            r8.A0q("thumbnail_url");
                            16h.A01(r8, mediaMapPinPreview.A00);
                        }
                        r8.A0Z();
                    }
                }
                r8.A0Y();
            }
            String str14 = mediaMapPin.A0C;
            if (str14 != null) {
                r8.A0R("formatted_media_count", str14);
            }
            if (mediaMapPin.A04 != null) {
                r8.A0q("thumbnail_override");
                16h.A01(r8, mediaMapPin.A04);
            }
            if (mediaMapPin.A08 != null) {
                r8.A0q("story");
                AnonymousClass3HR.A00(r8, mediaMapPin.A08);
            }
            C16557Ux9 ux9 = mediaMapPin.A07;
            if (ux9 != null) {
                r8.A0R("pin_type", ux9.A00);
            }
            if (mediaMapPin.A03 != null) {
                r8.A0q("clip");
                C275974sH.A00(r8, mediaMapPin.A03);
            }
            r8.A0Z();
        }
        Boolean bool3 = savedCollection.A09;
        if (bool3 != null) {
            r8.A0S("contains_provided_media_id", bool3.booleanValue());
        }
        Boolean bool4 = savedCollection.A0A;
        if (bool4 != null) {
            r8.A0S("enable_cover_placeholder", bool4.booleanValue());
        }
        if (savedCollection.A05 != null) {
            r8.A0q("collab_meta");
            CollaborativeCollectionMetadata collaborativeCollectionMetadata = savedCollection.A05;
            r8.A0c();
            if (collaborativeCollectionMetadata.A02 != null) {
                16P.A03(r8, C273654mx.A00(280));
                Iterator it4 = collaborativeCollectionMetadata.A02.iterator();
                while (it4.hasNext()) {
                    User A0k = DbT.A0k(it4);
                    if (A0k != null) {
                        Parcelable.Creator creator3 = User.CREATOR;
                        1aC.A08(r8, A0k);
                    }
                }
                r8.A0Y();
            }
            String str15 = collaborativeCollectionMetadata.A01;
            if (str15 != null) {
                r8.A0R("social_context_subtitle", str15);
            }
            String str16 = collaborativeCollectionMetadata.A00;
            if (str16 != null) {
                r8.A0R("ig_thread_id", str16);
            }
            r8.A0Z();
        }
        Boolean bool5 = savedCollection.A0B;
        if (bool5 != null) {
            r8.A0S("has_liked", bool5.booleanValue());
        }
        1XY.A00(r8, savedCollection);
        r8.A0Z();
    }
}
