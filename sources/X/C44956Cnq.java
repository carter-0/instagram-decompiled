package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cnq  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44956Cnq {
    public static Map A00(AnonymousClass3IK r5) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r5.AYa() != null) {
            A1H.put("action_type", r5.AYa());
        }
        ArrayList arrayList2 = null;
        if (r5.AZ5() != null) {
            List<ImageUrl> AZ5 = r5.AZ5();
            if (AZ5 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (ImageUrl url : AZ5) {
                    String url2 = url.getUrl();
                    if (url2 != null) {
                        arrayList.add(url2);
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("ad_images", arrayList);
        }
        if (r5.AhQ() != null) {
            A1H.put("bottomsheet_variant", r5.AhQ());
        }
        if (r5.AiZ() != null) {
            A1H.put("business_name", r5.AiZ());
        }
        if (r5.Air() != null) {
            A1H.put("button_text", r5.Air());
        }
        if (r5.AtE() != null) {
            A1H.put("cta_destination", r5.AtE());
        }
        if (r5.Ay1() != null) {
            A1H.put("dismiss_text", r5.Ay1());
        }
        if (r5.B3N() != null) {
            A1H.put("extra_data_token", r5.B3N());
        }
        if (r5.B3Q() != null) {
            A1H.put("extra_logging_info", r5.B3Q());
        }
        if (r5.B9V() != null) {
            A1H.put("global_position", r5.B9V());
        }
        if (r5.BAu() != null) {
            A1H.put("has_dismiss", r5.BAu());
        }
        if (r5.BEO() != null) {
            ImageUrl BEO = r5.BEO();
            if (BEO != null) {
                str = BEO.getUrl();
            } else {
                str = null;
            }
            A1H.put("icon_url", str);
        }
        if (r5.getId() != null) {
            C41845B3m.A0x(r5.getId(), A1H);
        }
        if (r5.BJN() != null) {
            C67241sS BJN = r5.BJN();
            if (BJN != null) {
                treeUpdaterJNI = BJN.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("item_client_gap_rules", treeUpdaterJNI);
        }
        if (r5.BRr() != null) {
            A1H.put("merchant_id", r5.BRr());
        }
        if (r5.getMessage() != null) {
            A1H.put(DialogModule.KEY_MESSAGE, r5.getMessage());
        }
        if (r5.BVu() != null) {
            A1H.put("netego_variant", r5.BVu());
        }
        if (r5.getProductId() != null) {
            A1H.put("product_id", r5.getProductId());
        }
        if (r5.BjT() != null) {
            A1H.put(AnonymousClass000.A00(752), r5.BjT());
        }
        if (r5.BjV() != null) {
            A1H.put(AnonymousClass000.A00(359), r5.BjV());
        }
        if (r5.getTitle() != null) {
            C41845B3m.A12(r5.getTitle(), A1H);
        }
        if (r5.C8X() != null) {
            List<ImageUrl> C8X = r5.C8X();
            if (C8X != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (ImageUrl url3 : C8X) {
                    String url4 = url3.getUrl();
                    if (url4 != null) {
                        arrayList2.add(url4);
                    }
                }
            }
            A1H.put("topic_images", arrayList2);
        }
        if (r5.C9L() != null) {
            A1H.put("tracking_token", r5.C9L());
        }
        if (r5.CEm() != null) {
            A1H.put("view_state_item_type", r5.CEm());
        }
        return 0Yt.A0B(A1H);
    }
}
