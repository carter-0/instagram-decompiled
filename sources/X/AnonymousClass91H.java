package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductArtsLabelsDictIntf;
import com.instagram.api.schemas.ProductDiscountsDict;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.api.schemas.TextWithEntitiesBlockDictIntf;
import com.instagram.api.schemas.UntaggableReasonIntf;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.91H  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass91H {
    public static Map A00(ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        String str;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        String str4;
        TreeUpdaterJNI treeUpdaterJNI9;
        TreeUpdaterJNI treeUpdaterJNI10;
        TreeUpdaterJNI treeUpdaterJNI11;
        TreeUpdaterJNI treeUpdaterJNI12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList3 = null;
        if (productDetailsProductItemDictIntf.AaF() != null) {
            ProductAffiliateInformationDict AaF = productDetailsProductItemDictIntf.AaF();
            if (AaF != null) {
                treeUpdaterJNI12 = AaF.FHC();
            } else {
                treeUpdaterJNI12 = null;
            }
            linkedHashMap.put(C273654mx.A00(1440), treeUpdaterJNI12);
        }
        if (productDetailsProductItemDictIntf.AcW() != null) {
            ProductArtsLabelsDictIntf AcW = productDetailsProductItemDictIntf.AcW();
            if (AcW != null) {
                treeUpdaterJNI11 = AcW.FHC();
            } else {
                treeUpdaterJNI11 = null;
            }
            linkedHashMap.put("arts_labels", treeUpdaterJNI11);
        }
        if (productDetailsProductItemDictIntf.Akf() != null) {
            linkedHashMap.put(C273654mx.A00(2130), productDetailsProductItemDictIntf.Akf());
        }
        if (productDetailsProductItemDictIntf.Al2() != null) {
            linkedHashMap.put(C273654mx.A00(2134), productDetailsProductItemDictIntf.Al2());
        }
        if (productDetailsProductItemDictIntf.Al3() != null) {
            linkedHashMap.put(C273654mx.A00(2135), productDetailsProductItemDictIntf.Al3());
        }
        if (productDetailsProductItemDictIntf.An4() != null) {
            ProductCheckoutPropertiesIntf An4 = productDetailsProductItemDictIntf.An4();
            if (An4 != null) {
                treeUpdaterJNI10 = An4.FHC();
            } else {
                treeUpdaterJNI10 = null;
            }
            linkedHashMap.put(C273654mx.A00(613), treeUpdaterJNI10);
        }
        if (productDetailsProductItemDictIntf.An5() != null) {
            ProductCheckoutPropertiesIntf An5 = productDetailsProductItemDictIntf.An5();
            if (An5 != null) {
                treeUpdaterJNI9 = An5.FHC();
            } else {
                treeUpdaterJNI9 = null;
            }
            linkedHashMap.put(C273654mx.A00(2154), treeUpdaterJNI9);
        }
        if (productDetailsProductItemDictIntf.An8() != null) {
            CheckoutStyle An8 = productDetailsProductItemDictIntf.An8();
            if (An8 != null) {
                str4 = An8.A00;
            } else {
                str4 = null;
            }
            linkedHashMap.put(AnonymousClass000.A00(1166), str4);
        }
        if (productDetailsProductItemDictIntf.ApV() != null) {
            CommerceReviewStatisticsDictIntf ApV = productDetailsProductItemDictIntf.ApV();
            if (ApV != null) {
                treeUpdaterJNI8 = ApV.FHC();
            } else {
                treeUpdaterJNI8 = null;
            }
            linkedHashMap.put(C273654mx.A00(2190), treeUpdaterJNI8);
        }
        if (productDetailsProductItemDictIntf.getCompoundProductId() != null) {
            linkedHashMap.put(C273654mx.A00(2192), productDetailsProductItemDictIntf.getCompoundProductId());
        }
        if (productDetailsProductItemDictIntf.getCurrentPrice() != null) {
            linkedHashMap.put(AnonymousClass000.A00(277), productDetailsProductItemDictIntf.getCurrentPrice());
        }
        if (productDetailsProductItemDictIntf.getCurrentPriceAmount() != null) {
            linkedHashMap.put(C273654mx.A00(2230), productDetailsProductItemDictIntf.getCurrentPriceAmount());
        }
        if (productDetailsProductItemDictIntf.getCurrentPriceStripped() != null) {
            linkedHashMap.put(C273654mx.A00(2231), productDetailsProductItemDictIntf.getCurrentPriceStripped());
        }
        if (productDetailsProductItemDictIntf.getDebugInfo() != null) {
            linkedHashMap.put(C273654mx.A00(646), productDetailsProductItemDictIntf.getDebugInfo());
        }
        if (productDetailsProductItemDictIntf.getDescription() != null) {
            linkedHashMap.put(DevServerEntity.COLUMN_DESCRIPTION, productDetailsProductItemDictIntf.getDescription());
        }
        if (productDetailsProductItemDictIntf.Axu() != null) {
            ProductDiscountsDict Axu = productDetailsProductItemDictIntf.Axu();
            if (Axu != null) {
                treeUpdaterJNI7 = Axu.FHC();
            } else {
                treeUpdaterJNI7 = null;
            }
            linkedHashMap.put(C273654mx.A00(2282), treeUpdaterJNI7);
        }
        if (productDetailsProductItemDictIntf.getExternalUrl() != null) {
            linkedHashMap.put("external_url", productDetailsProductItemDictIntf.getExternalUrl());
        }
        if (productDetailsProductItemDictIntf.getFullPrice() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1380), productDetailsProductItemDictIntf.getFullPrice());
        }
        if (productDetailsProductItemDictIntf.getFullPriceAmount() != null) {
            linkedHashMap.put(C273654mx.A00(2401), productDetailsProductItemDictIntf.getFullPriceAmount());
        }
        if (productDetailsProductItemDictIntf.getFullPriceStripped() != null) {
            linkedHashMap.put(C273654mx.A00(708), productDetailsProductItemDictIntf.getFullPriceStripped());
        }
        if (productDetailsProductItemDictIntf.BCN() != null) {
            linkedHashMap.put(C273654mx.A00(2441), productDetailsProductItemDictIntf.BCN());
        }
        if (productDetailsProductItemDictIntf.BCR() != null) {
            linkedHashMap.put(AnonymousClass000.A00(1405), productDetailsProductItemDictIntf.BCR());
        }
        if (productDetailsProductItemDictIntf.BFA() != null) {
            linkedHashMap.put(C273654mx.A00(2817), productDetailsProductItemDictIntf.BFA());
        }
        if (productDetailsProductItemDictIntf.BHy() != null) {
            linkedHashMap.put("instance_id", productDetailsProductItemDictIntf.BHy());
        }
        if (productDetailsProductItemDictIntf.BI1() != null) {
            linkedHashMap.put(C273654mx.A00(2889), productDetailsProductItemDictIntf.BI1());
        }
        if (productDetailsProductItemDictIntf.CSe() != null) {
            linkedHashMap.put(C273654mx.A00(2917), productDetailsProductItemDictIntf.CSe());
        }
        if (productDetailsProductItemDictIntf.CVG() != null) {
            linkedHashMap.put("is_in_stock", productDetailsProductItemDictIntf.CVG());
        }
        if (productDetailsProductItemDictIntf.CWl() != null) {
            linkedHashMap.put(C273654mx.A00(2930), productDetailsProductItemDictIntf.CWl());
        }
        if (productDetailsProductItemDictIntf.BLh() != null) {
            ProductLaunchInformation BLh = productDetailsProductItemDictIntf.BLh();
            if (BLh != null) {
                treeUpdaterJNI6 = BLh.FHC();
            } else {
                treeUpdaterJNI6 = null;
            }
            linkedHashMap.put(C273654mx.A00(795), treeUpdaterJNI6);
        }
        if (productDetailsProductItemDictIntf.BOj() != null) {
            LoyaltyToplineInfoDict BOj = productDetailsProductItemDictIntf.BOj();
            if (BOj != null) {
                treeUpdaterJNI5 = BOj.FHC();
            } else {
                treeUpdaterJNI5 = null;
            }
            linkedHashMap.put(C273654mx.A00(806), treeUpdaterJNI5);
        }
        if (productDetailsProductItemDictIntf.BOr() != null) {
            ProductImageContainer BOr = productDetailsProductItemDictIntf.BOr();
            if (BOr != null) {
                treeUpdaterJNI4 = BOr.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            linkedHashMap.put(C273654mx.A00(807), treeUpdaterJNI4);
        }
        if (productDetailsProductItemDictIntf.getMainImageId() != null) {
            linkedHashMap.put(C273654mx.A00(2999), productDetailsProductItemDictIntf.getMainImageId());
        }
        User BRo = productDetailsProductItemDictIntf.BRo();
        if (BRo != null) {
            linkedHashMap.put("merchant", BRo.A08());
        }
        if (productDetailsProductItemDictIntf.getName() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, productDetailsProductItemDictIntf.getName());
        }
        if (productDetailsProductItemDictIntf.BbZ() != null) {
            linkedHashMap.put(AnonymousClass000.A00(3734), productDetailsProductItemDictIntf.BbZ());
        }
        if (productDetailsProductItemDictIntf.getPrice() != null) {
            linkedHashMap.put("price", productDetailsProductItemDictIntf.getPrice());
        }
        if (productDetailsProductItemDictIntf.Bfv() != null) {
            ProductReviewStatus Bfv = productDetailsProductItemDictIntf.Bfv();
            if (Bfv != null) {
                str3 = Bfv.A00;
            } else {
                str3 = null;
            }
            linkedHashMap.put(C273654mx.A00(3153), str3);
        }
        if (productDetailsProductItemDictIntf.getProductId() != null) {
            linkedHashMap.put("product_id", productDetailsProductItemDictIntf.getProductId());
        }
        if (productDetailsProductItemDictIntf.BgH() != null) {
            List<ProductImageContainer> BgH = productDetailsProductItemDictIntf.BgH();
            if (BgH != null) {
                arrayList2 = new ArrayList();
                for (ProductImageContainer productImageContainer : BgH) {
                    if (productImageContainer != null) {
                        arrayList2.add(productImageContainer.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            linkedHashMap.put(C273654mx.A00(3154), arrayList2);
        }
        if (productDetailsProductItemDictIntf.BkF() != null) {
            linkedHashMap.put(C273654mx.A00(912), productDetailsProductItemDictIntf.BkF());
        }
        if (productDetailsProductItemDictIntf.getRetailerId() != null) {
            linkedHashMap.put(C273654mx.A00(385), productDetailsProductItemDictIntf.getRetailerId());
        }
        if (productDetailsProductItemDictIntf.BoK() != null) {
            ProductReviewStatus BoK = productDetailsProductItemDictIntf.BoK();
            if (BoK != null) {
                str2 = BoK.A00;
            } else {
                str2 = null;
            }
            linkedHashMap.put(C273654mx.A00(185), str2);
        }
        if (productDetailsProductItemDictIntf.BoR() != null) {
            List<TextWithEntitiesBlockDictIntf> BoR = productDetailsProductItemDictIntf.BoR();
            if (BoR != null) {
                arrayList = new ArrayList();
                for (TextWithEntitiesBlockDictIntf textWithEntitiesBlockDictIntf : BoR) {
                    if (textWithEntitiesBlockDictIntf != null) {
                        arrayList.add(textWithEntitiesBlockDictIntf.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put(C273654mx.A00(3274), arrayList);
        }
        if (productDetailsProductItemDictIntf.Bs8() != null) {
            SellerBadgeDictIntf Bs8 = productDetailsProductItemDictIntf.Bs8();
            if (Bs8 != null) {
                treeUpdaterJNI3 = Bs8.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put(C273654mx.A00(3301), treeUpdaterJNI3);
        }
        if (productDetailsProductItemDictIntf.Bwi() != null) {
            XFBsizeCalibrationScore Bwi = productDetailsProductItemDictIntf.Bwi();
            if (Bwi != null) {
                str = Bwi.A00;
            } else {
                str = null;
            }
            linkedHashMap.put(C273654mx.A00(3352), str);
        }
        if (productDetailsProductItemDictIntf.Bwj() != null) {
            linkedHashMap.put(C273654mx.A00(3353), productDetailsProductItemDictIntf.Bwj());
        }
        if (productDetailsProductItemDictIntf.C6z() != null) {
            ProductImageContainer C6z = productDetailsProductItemDictIntf.C6z();
            if (C6z != null) {
                treeUpdaterJNI2 = C6z.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("thumbnail_image", treeUpdaterJNI2);
        }
        if (productDetailsProductItemDictIntf.CB1() != null) {
            linkedHashMap.put(C273654mx.A00(3448), productDetailsProductItemDictIntf.CB1());
        }
        if (productDetailsProductItemDictIntf.CBw() != null) {
            UntaggableReasonIntf CBw = productDetailsProductItemDictIntf.CBw();
            if (CBw != null) {
                treeUpdaterJNI = CBw.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put(C273654mx.A00(418), treeUpdaterJNI);
        }
        if (productDetailsProductItemDictIntf.CDZ() != null) {
            List<ProductVariantPossibleValueDictIntf> CDZ = productDetailsProductItemDictIntf.CDZ();
            if (CDZ != null) {
                arrayList3 = new ArrayList();
                for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : CDZ) {
                    if (productVariantPossibleValueDictIntf != null) {
                        arrayList3.add(productVariantPossibleValueDictIntf.FHC());
                    }
                }
            }
            linkedHashMap.put(C273654mx.A00(3473), arrayList3);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
