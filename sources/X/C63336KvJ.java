package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetailImpl;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KvJ  reason: case insensitive filesystem */
public abstract class C63336KvJ {
    public static IgFundedIncentive parseFromJson(16F r31) {
        String str;
        String str2;
        16F r5 = r31;
        0qQ.A0B(r5, 0);
        try {
            Boolean bool = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType = null;
            Integer num = null;
            Integer num2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            IgFundedIncentiveBannerButton igFundedIncentiveBannerButton = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            IgFundedIncentiveNuxDisplayStyle igFundedIncentiveNuxDisplayStyle = null;
            IgFundedIncentiveBannerButton igFundedIncentiveBannerButton2 = null;
            String str7 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("banner_icon".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                    igFundedIncentiveBannerIconType = (IgFundedIncentiveBannerIconType) IgFundedIncentiveBannerIconType.A01.get(str2);
                    if (igFundedIncentiveBannerIconType == null) {
                        igFundedIncentiveBannerIconType = IgFundedIncentiveBannerIconType.UNRECOGNIZED;
                    }
                } else if ("countdown_expiration_time".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("countdown_grace_period".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r5);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r5.A1P();
                    }
                } else if ("details".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            IgFundedIncentiveDetailImpl parseFromJson = C63334KvH.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("first_button".equals(A17)) {
                    igFundedIncentiveBannerButton = LJL.parseFromJson(r5);
                } else if ("has_line_break".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if ("incentive_id".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                } else if ("is_navigated_from_bottom_sheet".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r5);
                } else if ("nux_dialog_subtitle".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r5.A1P();
                    }
                } else if ("nux_dialog_title".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r5.A1P();
                    }
                } else if ("nux_display_style".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    igFundedIncentiveNuxDisplayStyle = (IgFundedIncentiveNuxDisplayStyle) IgFundedIncentiveNuxDisplayStyle.A01.get(str);
                    if (igFundedIncentiveNuxDisplayStyle == null) {
                        igFundedIncentiveNuxDisplayStyle = IgFundedIncentiveNuxDisplayStyle.UNRECOGNIZED;
                    }
                } else if ("second_button".equals(A17)) {
                    igFundedIncentiveBannerButton2 = LJL.parseFromJson(r5);
                } else if ("should_show_shop_eligible_items_button".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r5);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            if (str3 == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DevServerEntity.COLUMN_DESCRIPTION, r5, "IgFundedIncentive");
            } else if (bool == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_line_break", r5, "IgFundedIncentive");
            } else if (str4 == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("incentive_id", r5, "IgFundedIncentive");
            } else if (bool2 == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_navigated_from_bottom_sheet", r5, "IgFundedIncentive");
            } else if (igFundedIncentiveNuxDisplayStyle == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("nux_display_style", r5, "IgFundedIncentive");
            } else if (bool3 == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("should_show_shop_eligible_items_button", r5, "IgFundedIncentive");
            } else if (str7 != null || !(r5 instanceof 0c9)) {
                return new IgFundedIncentive(igFundedIncentiveBannerButton, igFundedIncentiveBannerButton2, igFundedIncentiveBannerIconType, igFundedIncentiveNuxDisplayStyle, num, num2, str3, str4, str5, str6, str7, arrayList, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r5, "IgFundedIncentive");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
