package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.ColorAtTextRangeDict;
import com.instagram.api.schemas.CommerceReviewStatisticsDict;
import com.instagram.api.schemas.Entity;
import com.instagram.api.schemas.EntityImpl;
import com.instagram.api.schemas.InlineStyleAtRangeDict;
import com.instagram.api.schemas.InstagramProductTaggabilityState;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.LoyaltyToplineInfoDictImpl;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductAffiliateInformationDictImpl;
import com.instagram.api.schemas.ProductArtsLabelInformationDict;
import com.instagram.api.schemas.ProductArtsLabelInformationDictImpl;
import com.instagram.api.schemas.ProductArtsLabelsDict;
import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.api.schemas.ProductDiscountInformationDictImpl;
import com.instagram.api.schemas.ProductDiscountsDict;
import com.instagram.api.schemas.ProductDiscountsDictImpl;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProductVariantPossibleValueDict;
import com.instagram.api.schemas.Range;
import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.api.schemas.SellerBadgeSurfaces;
import com.instagram.api.schemas.SellerBadgeType;
import com.instagram.api.schemas.TextWithEntitiesBlockDict;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4q6  reason: invalid class name and case insensitive filesystem */
public abstract class C275404q6 {
    public static ProductDetailsProductItemDict parseFromJson(16F r60) {
        String str;
        String str2;
        String str3;
        String str4;
        16F r9 = r60;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ProductAffiliateInformationDictImpl productAffiliateInformationDictImpl = null;
            ProductArtsLabelsDict productArtsLabelsDict = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            ProductCheckoutProperties productCheckoutProperties = null;
            ProductCheckoutProperties productCheckoutProperties2 = null;
            CheckoutStyle checkoutStyle = null;
            CommerceReviewStatisticsDict commerceReviewStatisticsDict = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            ProductDiscountsDictImpl productDiscountsDictImpl = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str15 = null;
            Long l = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            ProductLaunchInformationImpl productLaunchInformationImpl = null;
            LoyaltyToplineInfoDictImpl loyaltyToplineInfoDictImpl = null;
            ProductImageContainerImpl productImageContainerImpl = null;
            String str16 = null;
            User user = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            ProductReviewStatus productReviewStatus = null;
            String str20 = null;
            ArrayList arrayList = null;
            String str21 = null;
            String str22 = null;
            ProductReviewStatus productReviewStatus2 = null;
            ArrayList arrayList2 = null;
            SellerBadgeDict sellerBadgeDict = null;
            XFBsizeCalibrationScore xFBsizeCalibrationScore = null;
            Integer num = null;
            ProductImageContainerImpl productImageContainerImpl2 = null;
            String str23 = null;
            UntaggableReason untaggableReason = null;
            ArrayList arrayList3 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("affiliate_information".equals(A0q)) {
                    productAffiliateInformationDictImpl = C44254Cbp.parseFromJson(r9);
                } else if ("arts_labels".equals(A0q)) {
                    productArtsLabelsDict = C44258Cbt.parseFromJson(r9);
                } else if ("can_share_to_story".equals(A0q)) {
                    bool = Boolean.valueOf(r9.A0d());
                } else if ("can_viewer_see_rnr".equals(A0q)) {
                    bool2 = Boolean.valueOf(r9.A0d());
                } else if ("can_viewer_see_structured_attributes".equals(A0q)) {
                    bool3 = Boolean.valueOf(r9.A0d());
                } else if ("checkout_info".equals(A0q)) {
                    productCheckoutProperties = C45684D1j.parseFromJson(r9);
                } else if ("checkout_properties".equals(A0q)) {
                    productCheckoutProperties2 = C45684D1j.parseFromJson(r9);
                } else if ("checkout_style".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r9.A1P();
                    }
                    checkoutStyle = (CheckoutStyle) CheckoutStyle.A01.get(str4);
                    if (checkoutStyle == null) {
                        checkoutStyle = CheckoutStyle.UNRECOGNIZED;
                    }
                } else if ("commerce_review_statistics".equals(A0q)) {
                    commerceReviewStatisticsDict = CWE.parseFromJson(r9);
                } else if ("compound_product_id".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r9.A1P();
                    }
                } else if ("current_price".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r9.A1P();
                    }
                } else if ("current_price_amount".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r9.A1P();
                    }
                } else if ("current_price_stripped".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r9.A1P();
                    }
                } else if ("debug_info".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r9.A1P();
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r9.A1P();
                    }
                } else if ("discount_information".equals(A0q)) {
                    productDiscountsDictImpl = Cc0.parseFromJson(r9);
                } else if ("external_url".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r9.A1P();
                    }
                } else if ("full_price".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r9.A1P();
                    }
                } else if ("full_price_amount".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r9.A1P();
                    }
                } else if ("full_price_stripped".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r9.A1P();
                    }
                } else if ("has_variants".equals(A0q)) {
                    bool4 = Boolean.valueOf(r9.A0d());
                } else if ("has_viewer_saved".equals(A0q)) {
                    bool5 = Boolean.valueOf(r9.A0d());
                } else if ("ig_is_product_editable_on_mobile".equals(A0q)) {
                    bool6 = Boolean.valueOf(r9.A0d());
                } else if ("instance_id".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r9.A1P();
                    }
                } else if ("instantiation_timestamp".equals(A0q)) {
                    l = Long.valueOf(r9.A0y());
                } else if ("is_enabled_for_hpp".equals(A0q)) {
                    bool7 = Boolean.valueOf(r9.A0d());
                } else if ("is_in_stock".equals(A0q)) {
                    bool8 = Boolean.valueOf(r9.A0d());
                } else if ("is_low_stock".equals(A0q)) {
                    bool9 = Boolean.valueOf(r9.A0d());
                } else if ("launch_information".equals(A0q)) {
                    productLaunchInformationImpl = C44930CnN.parseFromJson(r9);
                } else if ("loyalty_info".equals(A0q)) {
                    loyaltyToplineInfoDictImpl = Ca3.parseFromJson(r9);
                } else if ("main_image".equals(A0q)) {
                    productImageContainerImpl = C275414q7.parseFromJson(r9);
                } else if ("main_image_id".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r9.A1P();
                    }
                } else if ("merchant".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r9, false);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str17 = null;
                    } else {
                        str17 = r9.A1P();
                    }
                } else if ("per_unit_price".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str18 = null;
                    } else {
                        str18 = r9.A1P();
                    }
                } else if ("price".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str19 = null;
                    } else {
                        str19 = r9.A1P();
                    }
                } else if ("product_appeal_review_status".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                    productReviewStatus = (ProductReviewStatus) ProductReviewStatus.A01.get(str3);
                    if (productReviewStatus == null) {
                        productReviewStatus = ProductReviewStatus.UNRECOGNIZED;
                    }
                } else if ("product_id".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str20 = null;
                    } else {
                        str20 = r9.A1P();
                    }
                } else if ("product_images".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            ProductImageContainerImpl parseFromJson = C275414q7.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("recommended_size".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str21 = null;
                    } else {
                        str21 = r9.A1P();
                    }
                } else if ("retailer_id".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str22 = null;
                    } else {
                        str22 = r9.A1P();
                    }
                } else if ("review_status".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                    productReviewStatus2 = (ProductReviewStatus) ProductReviewStatus.A01.get(str2);
                    if (productReviewStatus2 == null) {
                        productReviewStatus2 = ProductReviewStatus.UNRECOGNIZED;
                    }
                } else if ("rich_text_description".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            TextWithEntitiesBlockDict parseFromJson2 = C44534CgU.parseFromJson(r9);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("seller_badge".equals(A0q)) {
                    sellerBadgeDict = C44339CdL.parseFromJson(r9);
                } else if ("size_calibration_score".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    xFBsizeCalibrationScore = (XFBsizeCalibrationScore) XFBsizeCalibrationScore.A01.get(str);
                    if (xFBsizeCalibrationScore == null) {
                        xFBsizeCalibrationScore = XFBsizeCalibrationScore.UNRECOGNIZED;
                    }
                } else if ("size_calibration_score_num_reviews".equals(A0q)) {
                    num = Integer.valueOf(r9.A1D());
                } else if ("thumbnail_image".equals(A0q)) {
                    productImageContainerImpl2 = C275414q7.parseFromJson(r9);
                } else if ("uci_invalidation_code".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str23 = null;
                    } else {
                        str23 = r9.A1P();
                    }
                } else if ("untaggable_reason".equals(A0q)) {
                    untaggableReason = C44556Cgq.parseFromJson(r9);
                } else if ("variant_values".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            ProductVariantPossibleValueDict parseFromJson3 = C44276CcK.parseFromJson(r9);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                r9.A0z();
            }
            return new ProductDetailsProductItemDict(checkoutStyle, commerceReviewStatisticsDict, loyaltyToplineInfoDictImpl, productAffiliateInformationDictImpl, productArtsLabelsDict, productDiscountsDictImpl, productReviewStatus, productReviewStatus2, sellerBadgeDict, untaggableReason, xFBsizeCalibrationScore, productCheckoutProperties, productCheckoutProperties2, productImageContainerImpl, productImageContainerImpl2, productLaunchInformationImpl, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, l, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r7, ProductDetailsProductItemDict productDetailsProductItemDict) {
        r7.A0c();
        ProductAffiliateInformationDict productAffiliateInformationDict = productDetailsProductItemDict.A03;
        if (productAffiliateInformationDict != null) {
            r7.A0q("affiliate_information");
            ProductAffiliateInformationDictImpl F7m = productAffiliateInformationDict.F7m();
            r7.A0c();
            String str = F7m.A00;
            if (str != null) {
                r7.A0R("affiliate_campaign_id", str);
            }
            String str2 = F7m.A01;
            if (str2 != null) {
                r7.A0R("commission_rate", str2);
            }
            r7.A0Z();
        }
        ProductArtsLabelsDict productArtsLabelsDict = productDetailsProductItemDict.A04;
        if (productArtsLabelsDict != null) {
            r7.A0q("arts_labels");
            r7.A0c();
            List<ProductArtsLabelInformationDict> list = productArtsLabelsDict.A00;
            if (list != null) {
                16P.A03(r7, "labels");
                for (ProductArtsLabelInformationDict productArtsLabelInformationDict : list) {
                    if (productArtsLabelInformationDict != null) {
                        ProductArtsLabelInformationDictImpl F7n = productArtsLabelInformationDict.F7n();
                        r7.A0c();
                        String str3 = F7n.A00;
                        if (str3 != null) {
                            r7.A0R("label_display_value", str3);
                        }
                        String str4 = F7n.A01;
                        if (str4 != null) {
                            r7.A0R("label_type", str4);
                        }
                        r7.A0Z();
                    }
                }
                r7.A0Y();
            }
            r7.A0Z();
        }
        Boolean bool = productDetailsProductItemDict.A0H;
        if (bool != null) {
            r7.A0S("can_share_to_story", bool.booleanValue());
        }
        Boolean bool2 = productDetailsProductItemDict.A0I;
        if (bool2 != null) {
            r7.A0S("can_viewer_see_rnr", bool2.booleanValue());
        }
        Boolean bool3 = productDetailsProductItemDict.A0J;
        if (bool3 != null) {
            r7.A0S("can_viewer_see_structured_attributes", bool3.booleanValue());
        }
        ProductCheckoutProperties productCheckoutProperties = productDetailsProductItemDict.A0B;
        if (productCheckoutProperties != null) {
            r7.A0q("checkout_info");
            C45684D1j.A00(r7, productCheckoutProperties);
        }
        ProductCheckoutProperties productCheckoutProperties2 = productDetailsProductItemDict.A0C;
        if (productCheckoutProperties2 != null) {
            r7.A0q("checkout_properties");
            C45684D1j.A00(r7, productCheckoutProperties2);
        }
        CheckoutStyle checkoutStyle = productDetailsProductItemDict.A00;
        if (checkoutStyle != null) {
            r7.A0R("checkout_style", checkoutStyle.A00);
        }
        CommerceReviewStatisticsDict commerceReviewStatisticsDict = productDetailsProductItemDict.A01;
        if (commerceReviewStatisticsDict != null) {
            r7.A0q("commerce_review_statistics");
            r7.A0c();
            Float f = commerceReviewStatisticsDict.A00;
            if (f != null) {
                r7.A0O("average_rating", f.floatValue());
            }
            List<AdsRatingAndReviewStarType> list2 = commerceReviewStatisticsDict.A02;
            if (list2 != null) {
                16P.A03(r7, "rating_stars");
                for (AdsRatingAndReviewStarType adsRatingAndReviewStarType : list2) {
                    if (adsRatingAndReviewStarType != null) {
                        r7.A0t(adsRatingAndReviewStarType.A00);
                    }
                }
                r7.A0Y();
            }
            Integer num = commerceReviewStatisticsDict.A01;
            if (num != null) {
                r7.A0P("review_count", num.intValue());
            }
            r7.A0Z();
        }
        String str5 = productDetailsProductItemDict.A0S;
        if (str5 != null) {
            r7.A0R("compound_product_id", str5);
        }
        String str6 = productDetailsProductItemDict.A0T;
        if (str6 != null) {
            r7.A0R("current_price", str6);
        }
        String str7 = productDetailsProductItemDict.A0U;
        if (str7 != null) {
            r7.A0R("current_price_amount", str7);
        }
        String str8 = productDetailsProductItemDict.A0V;
        if (str8 != null) {
            r7.A0R("current_price_stripped", str8);
        }
        String str9 = productDetailsProductItemDict.A0W;
        if (str9 != null) {
            r7.A0R("debug_info", str9);
        }
        String str10 = productDetailsProductItemDict.A0X;
        if (str10 != null) {
            r7.A0R(DevServerEntity.COLUMN_DESCRIPTION, str10);
        }
        ProductDiscountsDict productDiscountsDict = productDetailsProductItemDict.A05;
        if (productDiscountsDict != null) {
            r7.A0q("discount_information");
            ProductDiscountsDictImpl F7t = productDiscountsDict.F7t();
            r7.A0c();
            List<ProductDiscountInformationDict> list3 = F7t.A00;
            if (list3 != null) {
                16P.A03(r7, "discounts");
                for (ProductDiscountInformationDict productDiscountInformationDict : list3) {
                    if (productDiscountInformationDict != null) {
                        ProductDiscountInformationDictImpl F7s = productDiscountInformationDict.F7s();
                        r7.A0c();
                        String str11 = F7s.A00;
                        if (str11 != null) {
                            r7.A0R("cta_text", str11);
                        }
                        String str12 = F7s.A01;
                        if (str12 != null) {
                            r7.A0R(DevServerEntity.COLUMN_DESCRIPTION, str12);
                        }
                        String str13 = F7s.A02;
                        if (str13 != null) {
                            r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str13);
                        }
                        String str14 = F7s.A03;
                        if (str14 != null) {
                            r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str14);
                        }
                        String str15 = F7s.A04;
                        if (str15 != null) {
                            r7.A0R("see_details_text", str15);
                        }
                        r7.A0Z();
                    }
                }
                r7.A0Y();
            }
            r7.A0Z();
        }
        String str16 = productDetailsProductItemDict.A0Y;
        if (str16 != null) {
            r7.A0R("external_url", str16);
        }
        String str17 = productDetailsProductItemDict.A0Z;
        if (str17 != null) {
            r7.A0R("full_price", str17);
        }
        String str18 = productDetailsProductItemDict.A0a;
        if (str18 != null) {
            r7.A0R("full_price_amount", str18);
        }
        String str19 = productDetailsProductItemDict.A0b;
        if (str19 != null) {
            r7.A0R("full_price_stripped", str19);
        }
        Boolean bool4 = productDetailsProductItemDict.A0K;
        if (bool4 != null) {
            r7.A0S("has_variants", bool4.booleanValue());
        }
        Boolean bool5 = productDetailsProductItemDict.A0L;
        if (bool5 != null) {
            r7.A0S("has_viewer_saved", bool5.booleanValue());
        }
        Boolean bool6 = productDetailsProductItemDict.A0M;
        if (bool6 != null) {
            r7.A0S("ig_is_product_editable_on_mobile", bool6.booleanValue());
        }
        String str20 = productDetailsProductItemDict.A0c;
        if (str20 != null) {
            r7.A0R("instance_id", str20);
        }
        Long l = productDetailsProductItemDict.A0R;
        if (l != null) {
            r7.A0Q("instantiation_timestamp", l.longValue());
        }
        Boolean bool7 = productDetailsProductItemDict.A0N;
        if (bool7 != null) {
            r7.A0S("is_enabled_for_hpp", bool7.booleanValue());
        }
        Boolean bool8 = productDetailsProductItemDict.A0O;
        if (bool8 != null) {
            r7.A0S("is_in_stock", bool8.booleanValue());
        }
        Boolean bool9 = productDetailsProductItemDict.A0P;
        if (bool9 != null) {
            r7.A0S("is_low_stock", bool9.booleanValue());
        }
        ProductLaunchInformation productLaunchInformation = productDetailsProductItemDict.A0F;
        if (productLaunchInformation != null) {
            r7.A0q("launch_information");
            ProductLaunchInformationImpl FFd = productLaunchInformation.FFd();
            r7.A0c();
            String str21 = FFd.A03;
            if (str21 != null) {
                r7.A0R("drops_campaign_id", str21);
            }
            Boolean bool10 = FFd.A00;
            if (bool10 != null) {
                r7.A0S("has_launched", bool10.booleanValue());
            }
            Boolean bool11 = FFd.A01;
            if (bool11 != null) {
                r7.A0S("is_ig_exclusive", bool11.booleanValue());
            }
            Long l2 = FFd.A02;
            if (l2 != null) {
                r7.A0Q("launch_date", l2.longValue());
            }
            r7.A0Z();
        }
        LoyaltyToplineInfoDict loyaltyToplineInfoDict = productDetailsProductItemDict.A02;
        if (loyaltyToplineInfoDict != null) {
            r7.A0q("loyalty_info");
            LoyaltyToplineInfoDictImpl F5f = loyaltyToplineInfoDict.F5f();
            r7.A0c();
            Boolean bool12 = F5f.A00;
            if (bool12 != null) {
                r7.A0S("is_viewer_connected", bool12.booleanValue());
            }
            String str22 = F5f.A01;
            if (str22 != null) {
                r7.A0R("loyalty_info_text", str22);
            }
            r7.A0Z();
        }
        ProductImageContainer productImageContainer = productDetailsProductItemDict.A0D;
        if (productImageContainer != null) {
            r7.A0q("main_image");
            C275414q7.A00(r7, productImageContainer.FFc());
        }
        String str23 = productDetailsProductItemDict.A0d;
        if (str23 != null) {
            r7.A0R("main_image_id", str23);
        }
        User user = productDetailsProductItemDict.A0G;
        if (user != null) {
            r7.A0q("merchant");
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r7, user);
        }
        String str24 = productDetailsProductItemDict.A0e;
        if (str24 != null) {
            r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str24);
        }
        String str25 = productDetailsProductItemDict.A0f;
        if (str25 != null) {
            r7.A0R("per_unit_price", str25);
        }
        String str26 = productDetailsProductItemDict.A0g;
        if (str26 != null) {
            r7.A0R("price", str26);
        }
        ProductReviewStatus productReviewStatus = productDetailsProductItemDict.A06;
        if (productReviewStatus != null) {
            r7.A0R("product_appeal_review_status", productReviewStatus.A00);
        }
        String str27 = productDetailsProductItemDict.A0h;
        if (str27 != null) {
            r7.A0R("product_id", str27);
        }
        List<ProductImageContainer> list4 = productDetailsProductItemDict.A0l;
        if (list4 != null) {
            16P.A03(r7, "product_images");
            for (ProductImageContainer productImageContainer2 : list4) {
                if (productImageContainer2 != null) {
                    C275414q7.A00(r7, productImageContainer2.FFc());
                }
            }
            r7.A0Y();
        }
        String str28 = productDetailsProductItemDict.A0i;
        if (str28 != null) {
            r7.A0R("recommended_size", str28);
        }
        String str29 = productDetailsProductItemDict.A0j;
        if (str29 != null) {
            r7.A0R("retailer_id", str29);
        }
        ProductReviewStatus productReviewStatus2 = productDetailsProductItemDict.A07;
        if (productReviewStatus2 != null) {
            r7.A0R("review_status", productReviewStatus2.A00);
        }
        List<TextWithEntitiesBlockDict> list5 = productDetailsProductItemDict.A0m;
        if (list5 != null) {
            16P.A03(r7, "rich_text_description");
            for (TextWithEntitiesBlockDict textWithEntitiesBlockDict : list5) {
                if (textWithEntitiesBlockDict != null) {
                    r7.A0c();
                    String str30 = textWithEntitiesBlockDict.A02;
                    if (str30 != null) {
                        r7.A0R("block_type", str30);
                    }
                    Integer num2 = textWithEntitiesBlockDict.A01;
                    if (num2 != null) {
                        r7.A0P("depth", num2.intValue());
                    }
                    TextWithEntities textWithEntities = textWithEntitiesBlockDict.A00;
                    if (textWithEntities != null) {
                        r7.A0q(AnonymousClass000.A00(4099));
                        r7.A0c();
                        List<ColorAtTextRangeDict> list6 = textWithEntities.A03;
                        if (list6 != null) {
                            16P.A03(r7, Pxd.A00(678));
                            for (ColorAtTextRangeDict colorAtTextRangeDict : list6) {
                                if (colorAtTextRangeDict != null) {
                                    r7.A0c();
                                    String str31 = colorAtTextRangeDict.A02;
                                    if (str31 != null) {
                                        r7.A0R("hex_rgb_color", str31);
                                    }
                                    String str32 = colorAtTextRangeDict.A03;
                                    if (str32 != null) {
                                        r7.A0R("hex_rgb_color_dark", str32);
                                    }
                                    Integer num3 = colorAtTextRangeDict.A00;
                                    if (num3 != null) {
                                        r7.A0P("length", num3.intValue());
                                    }
                                    Integer num4 = colorAtTextRangeDict.A01;
                                    if (num4 != null) {
                                        r7.A0P("offset", num4.intValue());
                                    }
                                    r7.A0Z();
                                }
                            }
                            r7.A0Y();
                        }
                        List<InlineStyleAtRangeDict> list7 = textWithEntities.A04;
                        if (list7 != null) {
                            16P.A03(r7, Pxd.A00(229));
                            for (InlineStyleAtRangeDict inlineStyleAtRangeDict : list7) {
                                if (inlineStyleAtRangeDict != null) {
                                    r7.A0c();
                                    Integer num5 = inlineStyleAtRangeDict.A00;
                                    if (num5 != null) {
                                        r7.A0P(Pxd.A00(228), num5.intValue());
                                    }
                                    Integer num6 = inlineStyleAtRangeDict.A01;
                                    if (num6 != null) {
                                        r7.A0P("length", num6.intValue());
                                    }
                                    Integer num7 = inlineStyleAtRangeDict.A02;
                                    if (num7 != null) {
                                        r7.A0P("offset", num7.intValue());
                                    }
                                    r7.A0Z();
                                }
                            }
                            r7.A0Y();
                        }
                        LinkAction linkAction = textWithEntities.A00;
                        if (linkAction != null) {
                            r7.A0R("link_action", linkAction.A00);
                        }
                        List<Range> list8 = textWithEntities.A05;
                        if (list8 != null) {
                            16P.A03(r7, "ranges");
                            for (Range range : list8) {
                                if (range != null) {
                                    r7.A0c();
                                    Entity entity = range.A00;
                                    if (entity != null) {
                                        r7.A0q("entity");
                                        EntityImpl F2k = entity.F2k();
                                        r7.A0c();
                                        String str33 = F2k.A00;
                                        if (str33 != null) {
                                            r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str33);
                                        }
                                        String str34 = F2k.A01;
                                        if (str34 != null) {
                                            r7.A0R("typename", str34);
                                        }
                                        String str35 = F2k.A02;
                                        if (str35 != null) {
                                            r7.A0R("url", str35);
                                        }
                                        r7.A0Z();
                                    }
                                    Integer num8 = range.A01;
                                    if (num8 != null) {
                                        r7.A0P("length", num8.intValue());
                                    }
                                    Integer num9 = range.A02;
                                    if (num9 != null) {
                                        r7.A0P("offset", num9.intValue());
                                    }
                                    r7.A0Z();
                                }
                            }
                            r7.A0Y();
                        }
                        String str36 = textWithEntities.A02;
                        if (str36 != null) {
                            r7.A0R("text", str36);
                        }
                        Long l3 = textWithEntities.A01;
                        if (l3 != null) {
                            r7.A0Q("timestamp", l3.longValue());
                        }
                        r7.A0Z();
                    }
                    r7.A0Z();
                }
            }
            r7.A0Y();
        }
        SellerBadgeDict sellerBadgeDict = productDetailsProductItemDict.A08;
        if (sellerBadgeDict != null) {
            r7.A0q("seller_badge");
            r7.A0c();
            String str37 = sellerBadgeDict.A01;
            if (str37 != null) {
                r7.A0R(DevServerEntity.COLUMN_DESCRIPTION, str37);
            }
            String str38 = sellerBadgeDict.A02;
            if (str38 != null) {
                r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str38);
            }
            List<SellerBadgeSurfaces> list9 = sellerBadgeDict.A03;
            if (list9 != null) {
                16P.A03(r7, "surfaces");
                for (SellerBadgeSurfaces sellerBadgeSurfaces : list9) {
                    if (sellerBadgeSurfaces != null) {
                        r7.A0t(sellerBadgeSurfaces.A00);
                    }
                }
                r7.A0Y();
            }
            SellerBadgeType sellerBadgeType = sellerBadgeDict.A00;
            if (sellerBadgeType != null) {
                r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, sellerBadgeType.A00);
            }
            r7.A0Z();
        }
        XFBsizeCalibrationScore xFBsizeCalibrationScore = productDetailsProductItemDict.A0A;
        if (xFBsizeCalibrationScore != null) {
            r7.A0R("size_calibration_score", xFBsizeCalibrationScore.A00);
        }
        Integer num10 = productDetailsProductItemDict.A0Q;
        if (num10 != null) {
            r7.A0P("size_calibration_score_num_reviews", num10.intValue());
        }
        ProductImageContainer productImageContainer3 = productDetailsProductItemDict.A0E;
        if (productImageContainer3 != null) {
            r7.A0q("thumbnail_image");
            C275414q7.A00(r7, productImageContainer3.FFc());
        }
        String str39 = productDetailsProductItemDict.A0k;
        if (str39 != null) {
            r7.A0R("uci_invalidation_code", str39);
        }
        UntaggableReason untaggableReason = productDetailsProductItemDict.A09;
        if (untaggableReason != null) {
            r7.A0q("untaggable_reason");
            r7.A0c();
            LinkWithText linkWithText = untaggableReason.A01;
            if (linkWithText != null) {
                r7.A0q("action");
                r7.A0c();
                String str40 = linkWithText.A00;
                if (str40 != null) {
                    r7.A0R("text", str40);
                }
                String str41 = linkWithText.A01;
                if (str41 != null) {
                    r7.A0R("url", str41);
                }
                r7.A0Z();
            }
            String str42 = untaggableReason.A03;
            if (str42 != null) {
                r7.A0R(DevServerEntity.COLUMN_DESCRIPTION, str42);
            }
            LinkWithText linkWithText2 = untaggableReason.A02;
            if (linkWithText2 != null) {
                r7.A0q("help_link");
                r7.A0c();
                String str43 = linkWithText2.A00;
                if (str43 != null) {
                    r7.A0R("text", str43);
                }
                String str44 = linkWithText2.A01;
                if (str44 != null) {
                    r7.A0R("url", str44);
                }
                r7.A0Z();
            }
            InstagramProductTaggabilityState instagramProductTaggabilityState = untaggableReason.A00;
            if (instagramProductTaggabilityState != null) {
                r7.A0R("taggability_state", instagramProductTaggabilityState.A00);
            }
            String str45 = untaggableReason.A04;
            if (str45 != null) {
                r7.A0R(DialogModule.KEY_TITLE, str45);
            }
            r7.A0Z();
        }
        List<ProductVariantPossibleValueDict> list10 = productDetailsProductItemDict.A0n;
        if (list10 != null) {
            16P.A03(r7, "variant_values");
            for (ProductVariantPossibleValueDict productVariantPossibleValueDict : list10) {
                if (productVariantPossibleValueDict != null) {
                    r7.A0c();
                    String str46 = productVariantPossibleValueDict.A01;
                    if (str46 != null) {
                        r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str46);
                    }
                    r7.A0S("is_preselected", productVariantPossibleValueDict.A05);
                    String str47 = productVariantPossibleValueDict.A02;
                    if (str47 != null) {
                        r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str47);
                    }
                    String str48 = productVariantPossibleValueDict.A03;
                    if (str48 != null) {
                        r7.A0R("normalized_value", str48);
                    }
                    String str49 = productVariantPossibleValueDict.A04;
                    if (str49 != null) {
                        r7.A0R(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str49);
                    }
                    ProductVariantVisualStyle productVariantVisualStyle = productVariantPossibleValueDict.A00;
                    if (productVariantVisualStyle != null) {
                        r7.A0R("visual_style", productVariantVisualStyle.A00);
                    }
                    r7.A0Z();
                }
            }
            r7.A0Y();
        }
        r7.A0Z();
    }
}
