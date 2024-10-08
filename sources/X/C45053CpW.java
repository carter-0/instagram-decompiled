package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.IOException;
import org.webrtc.EglBase14Impl;

/* renamed from: X.CpW  reason: case insensitive filesystem */
public abstract class C45053CpW {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Cvm] */
    public static C45406Cvm parseFromJson(16F r7) {
        Integer num;
        String str;
        0qQ.A0B(r7, 0);
        try {
            ? obj = new Object();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (C273654mx.A00(286).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r7);
                    Integer[] A00 = AnonymousClass05K.A00(29);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "account";
                                    break;
                                case 2:
                                    str = "product_details";
                                    break;
                                case 3:
                                    str = "bloks";
                                    break;
                                case 4:
                                    str = "checkout_button";
                                    break;
                                case 5:
                                    str = "details";
                                    break;
                                case 6:
                                    str = "external_link";
                                    break;
                                case 7:
                                    str = "button";
                                    break;
                                case 8:
                                    str = AnonymousClass000.A00(4843);
                                    break;
                                case 9:
                                    str = "ig_funded_incentive";
                                    break;
                                case 10:
                                    str = "launch_countdown_button";
                                    break;
                                case 11:
                                    str = "link";
                                    break;
                                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                                    str = "loading";
                                    break;
                                case 13:
                                    str = "media";
                                    break;
                                case 14:
                                    str = C66579MXk.A00(36);
                                    break;
                                case 15:
                                    str = "products";
                                    break;
                                case 16:
                                    str = DevServerEntity.COLUMN_DESCRIPTION;
                                    break;
                                case 17:
                                    str = AnonymousClass000.A00(5130);
                                    break;
                                case EglBase14Impl.EGLExt_SDK_VERSION:
                                    str = "sandboxed_shop_banner";
                                    break;
                                case 19:
                                    str = "set_reminder_and_save_button";
                                    break;
                                case 20:
                                    str = "seller_badge";
                                    break;
                                case 21:
                                    str = "shipping_returns";
                                    break;
                                case 22:
                                    str = "shop";
                                    break;
                                case 23:
                                    str = "text";
                                    break;
                                case 24:
                                    str = "try_in_ar";
                                    break;
                                case 25:
                                    str = AnonymousClass000.A00(5366);
                                    break;
                                case 26:
                                    str = AnonymousClass000.A00(4202);
                                    break;
                                case 27:
                                    str = "restock_reminder";
                                    break;
                                case 28:
                                    str = "featured_product_permission";
                                    break;
                                default:
                                    str = "about_this_shop";
                                    break;
                            }
                            if (!str.equals(A0l)) {
                                i++;
                            }
                        } else {
                            num = null;
                        }
                    }
                    obj.A02 = num;
                } else if ("section_type".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r7);
                } else if ("layout_content".equals(A17)) {
                    obj.A00 = C45030Cp8.parseFromJson(r7);
                } else if ("spacing".equals(A17)) {
                    obj.A01 = C45055CpY.parseFromJson(r7);
                } else if ("requires_all_variants_selected".equals(A17)) {
                    obj.A04 = r7.A0d();
                }
                r7.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
