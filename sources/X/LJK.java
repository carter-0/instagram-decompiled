package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetailImpl;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public abstract class LJK {
    public static C61222JzF parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            C61224JzH jzH = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("destination".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("rich_destination".equals(A17)) {
                    jzH = C63332KvF.parseFromJson(r8);
                } else if ("rich_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (str != null || !(r8 instanceof 0c9)) {
                return new C61222JzF(jzH, str2, str);
            }
            AnonymousClass7TF.A1L("rich_text", r8, "DeepLinkText");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r5, C61222JzF jzF) {
        r5.A0c();
        String str = jzF.A01;
        if (str != null) {
            r5.A0R("destination", str);
        }
        C61224JzH jzH = jzF.A00;
        if (jzH != null) {
            r5.A0q("rich_destination");
            r5.A0c();
            C61223JzG jzG = jzH.A00;
            if (jzG != null) {
                r5.A0q("incentive");
                r5.A0c();
                IgFundedIncentive igFundedIncentive = jzG.A00;
                if (igFundedIncentive != null) {
                    r5.A0q("incentive_details");
                    r5.A0c();
                    IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType = igFundedIncentive.A02;
                    if (igFundedIncentiveBannerIconType != null) {
                        r5.A0R("banner_icon", igFundedIncentiveBannerIconType.A00);
                    }
                    Integer num = igFundedIncentive.A04;
                    if (num != null) {
                        r5.A0P("countdown_expiration_time", num.intValue());
                    }
                    Integer num2 = igFundedIncentive.A05;
                    if (num2 != null) {
                        r5.A0P("countdown_grace_period", num2.intValue());
                    }
                    String str2 = igFundedIncentive.A06;
                    if (str2 != null) {
                        r5.A0R(DevServerEntity.COLUMN_DESCRIPTION, str2);
                    }
                    List list = igFundedIncentive.A0B;
                    if (list != null) {
                        Iterator A0s = C41845B3m.A0s(r5, "details", list);
                        while (A0s.hasNext()) {
                            IgFundedIncentiveDetail igFundedIncentiveDetail = (IgFundedIncentiveDetail) A0s.next();
                            if (igFundedIncentiveDetail != null) {
                                IgFundedIncentiveDetailImpl FFX = igFundedIncentiveDetail.FFX();
                                r5.A0c();
                                String str3 = FFX.A00;
                                if (str3 != null) {
                                    r5.A0R(DevServerEntity.COLUMN_DESCRIPTION, str3);
                                }
                                String str4 = FFX.A01;
                                if (str4 != null) {
                                    r5.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str4);
                                }
                                r5.A0Z();
                            }
                        }
                        r5.A0Y();
                    }
                    IgFundedIncentiveBannerButton igFundedIncentiveBannerButton = igFundedIncentive.A00;
                    if (igFundedIncentiveBannerButton != null) {
                        r5.A0q("first_button");
                        LJL.A00(r5, igFundedIncentiveBannerButton);
                    }
                    r5.A0S("has_line_break", igFundedIncentive.A0C);
                    String str5 = igFundedIncentive.A07;
                    if (str5 != null) {
                        r5.A0R("incentive_id", str5);
                    }
                    r5.A0S("is_navigated_from_bottom_sheet", igFundedIncentive.A0D);
                    String str6 = igFundedIncentive.A08;
                    if (str6 != null) {
                        r5.A0R("nux_dialog_subtitle", str6);
                    }
                    String str7 = igFundedIncentive.A09;
                    if (str7 != null) {
                        r5.A0R("nux_dialog_title", str7);
                    }
                    IgFundedIncentiveNuxDisplayStyle igFundedIncentiveNuxDisplayStyle = igFundedIncentive.A03;
                    if (igFundedIncentiveNuxDisplayStyle != null) {
                        r5.A0R("nux_display_style", igFundedIncentiveNuxDisplayStyle.A00);
                    }
                    IgFundedIncentiveBannerButton igFundedIncentiveBannerButton2 = igFundedIncentive.A01;
                    if (igFundedIncentiveBannerButton2 != null) {
                        r5.A0q("second_button");
                        LJL.A00(r5, igFundedIncentiveBannerButton2);
                    }
                    r5.A0S("should_show_shop_eligible_items_button", igFundedIncentive.A0E);
                    String str8 = igFundedIncentive.A0A;
                    if (str8 != null) {
                        r5.A0R(DialogModule.KEY_TITLE, str8);
                    }
                    r5.A0Z();
                }
                r5.A0Z();
            }
            r5.A0Z();
        }
        String str9 = jzF.A02;
        if (str9 != null) {
            r5.A0R("rich_text", str9);
        }
        r5.A0Z();
    }
}
