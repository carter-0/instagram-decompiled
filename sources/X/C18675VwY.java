package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VwY  reason: case insensitive filesystem */
public abstract class C18675VwY {
    public static UNH parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            C15068UNl uNl = null;
            UNI uni = null;
            UNL unl = null;
            C15069UNm uNm = null;
            Long l = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("metadata_multi_comment_card_payload_v1".equals(A17)) {
                    uNl = C16848V8d.parseFromJson(r8);
                } else if ("metadata_payload_v1".equals(A17)) {
                    uni = C16833V7o.parseFromJson(r8);
                } else if ("metadata_photo_card_payload_v1".equals(A17)) {
                    unl = C16838V7t.parseFromJson(r8);
                } else if ("metadata_single_comment_card_payload_v1".equals(A17)) {
                    uNm = C16850V8f.parseFromJson(r8);
                } else if ("option_value".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r8);
                }
                r8.A0z();
            }
            return new UNH(uni, unl, uNl, uNm, l);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A01(17Z r3, C21024XAd xAd) {
        if (xAd != null) {
            r3.A0q(AppStateModule.APP_STATE_BACKGROUND);
            UNF F6d = xAd.F6d();
            r3.A0c();
            Float f = F6d.A00;
            if (f != null) {
                r3.A0O("alpha", f.floatValue());
            }
            Integer num = F6d.A01;
            if (num != null) {
                r3.A0P("blur_radius_px", num.intValue());
            }
            String str = F6d.A02;
            if (str != null) {
                r3.A0R("bottom_color", str);
            }
            String str2 = F6d.A03;
            if (str2 != null) {
                r3.A0R("top_color", str2);
            }
            r3.A0Z();
        }
    }

    public static void A00(17Z r4, UNH unh) {
        r4.A0c();
        XAS xas = unh.A02;
        if (xas != null) {
            r4.A0q("metadata_multi_comment_card_payload_v1");
            C15068UNl FDV = xas.FDV();
            r4.A0c();
            A01(r4, FDV.A00);
            List list = FDV.A01;
            if (list != null) {
                Iterator A0s = C41845B3m.A0s(r4, "comments", list);
                while (A0s.hasNext()) {
                    C21030XAj xAj = (C21030XAj) A0s.next();
                    if (xAj != null) {
                        C18115Vlj.A00(r4, xAj.F6e());
                    }
                }
                r4.A0Y();
            }
            r4.A0Z();
        }
        UNI uni = unh.A00;
        if (uni != null) {
            r4.A0q("metadata_payload_v1");
            r4.A0c();
            A01(r4, uni.A00);
            String str = uni.A03;
            if (str != null) {
                r4.A0R(DevServerEntity.COLUMN_DESCRIPTION, str);
            }
            List list2 = uni.A06;
            if (list2 != null) {
                Iterator A0s2 = C41845B3m.A0s(r4, "metadata_items", list2);
                while (A0s2.hasNext()) {
                    C21032XAl xAl = (C21032XAl) A0s2.next();
                    if (xAl != null) {
                        C18117Vll.A00(r4, xAl.F6k());
                    }
                }
                r4.A0Y();
            }
            String str2 = uni.A04;
            if (str2 != null) {
                r4.A0R("separator_color", str2);
            }
            C13988Tno.A1G(r4, uni.A05);
            XAX xax = uni.A02;
            if (xax != null) {
                r4.A0q("thumbnail");
                C18118Vlm.A00(r4, xax.F6l());
            }
            C21032XAl xAl2 = uni.A01;
            if (xAl2 != null) {
                r4.A0q(DialogModule.KEY_TITLE);
                C18117Vll.A00(r4, xAl2.F6k());
            }
            r4.A0Z();
        }
        UNL unl = unh.A01;
        if (unl != null) {
            r4.A0q("metadata_photo_card_payload_v1");
            r4.A0c();
            XAQ xaq = unl.A02;
            if (xaq != null) {
                r4.A0q("animation");
                UNK F6g = xaq.F6g();
                r4.A0c();
                Integer num = F6g.A00;
                if (num != null) {
                    r4.A0P(Location.SPEED, num.intValue());
                }
                Integer num2 = F6g.A01;
                if (num2 != null) {
                    r4.A0P("startLagMs", num2.intValue());
                }
                r4.A0Z();
            }
            A01(r4, unl.A01);
            XAP xap = unl.A00;
            if (xap != null) {
                r4.A0q("badge");
                UNE F6b = xap.F6b();
                r4.A0c();
                Integer num3 = F6b.A00;
                if (num3 != null) {
                    r4.A0P("location", num3.intValue());
                }
                Integer num4 = F6b.A01;
                if (num4 != null) {
                    r4.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, num4.intValue());
                }
                r4.A0Z();
            }
            List list3 = unl.A03;
            if (list3 != null) {
                Iterator A0s3 = C41845B3m.A0s(r4, "photos", list3);
                while (A0s3.hasNext()) {
                    C21035XAo xAo = (C21035XAo) A0s3.next();
                    if (xAo != null) {
                        UNJ F6i = xAo.F6i();
                        r4.A0c();
                        String str3 = F6i.A04;
                        if (str3 != null) {
                            r4.A0R("border_color", str3);
                        }
                        Float f = F6i.A00;
                        if (f != null) {
                            r4.A0O("border_width_float", f.floatValue());
                        }
                        Float f2 = F6i.A01;
                        if (f2 != null) {
                            r4.A0O("corner_radius", f2.floatValue());
                        }
                        Integer num5 = F6i.A02;
                        if (num5 != null) {
                            r4.A0P(IgReactMediaPickerNativeModule.HEIGHT, num5.intValue());
                        }
                        String str4 = F6i.A05;
                        if (str4 != null) {
                            r4.A0R("url", str4);
                        }
                        Integer num6 = F6i.A03;
                        if (num6 != null) {
                            r4.A0P(IgReactMediaPickerNativeModule.WIDTH, num6.intValue());
                        }
                        r4.A0Z();
                    }
                }
                r4.A0Y();
            }
            r4.A0Z();
        }
        C21027XAg xAg = unh.A03;
        if (xAg != null) {
            r4.A0q("metadata_single_comment_card_payload_v1");
            C15069UNm FDW = xAg.FDW();
            r4.A0c();
            A01(r4, FDW.A00);
            C21030XAj xAj2 = FDW.A01;
            if (xAj2 != null) {
                r4.A0q(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                C18115Vlj.A00(r4, xAj2.F6e());
            }
            C21032XAl xAl3 = FDW.A02;
            if (xAl3 != null) {
                r4.A0q("page_name");
                C18117Vll.A00(r4, xAl3.F6k());
            }
            XAX xax2 = FDW.A03;
            if (xax2 != null) {
                r4.A0q("thumbnail");
                C18118Vlm.A00(r4, xax2.F6l());
            }
            r4.A0Z();
        }
        Long l = unh.A04;
        if (l != null) {
            r4.A0Q("option_value", l.longValue());
        }
        r4.A0Z();
    }
}
