package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.KvI  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63335KvI {
    public static Map A00(IgFundedIncentiveIntf igFundedIncentiveIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (igFundedIncentiveIntf.AfB() != null) {
            IgFundedIncentiveBannerIconType AfB = igFundedIncentiveIntf.AfB();
            if (AfB != null) {
                str = AfB.A00;
            } else {
                str = null;
            }
            A1H.put("banner_icon", str);
        }
        if (igFundedIncentiveIntf.Ard() != null) {
            A1H.put("countdown_expiration_time", igFundedIncentiveIntf.Ard());
        }
        if (igFundedIncentiveIntf.Are() != null) {
            A1H.put("countdown_grace_period", igFundedIncentiveIntf.Are());
        }
        if (igFundedIncentiveIntf.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, igFundedIncentiveIntf.getDescription());
        }
        if (igFundedIncentiveIntf.Awm() != null) {
            List<IgFundedIncentiveDetail> Awm = igFundedIncentiveIntf.Awm();
            if (Awm != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (IgFundedIncentiveDetail igFundedIncentiveDetail : Awm) {
                    if (igFundedIncentiveDetail != null) {
                        arrayList.add(igFundedIncentiveDetail.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("details", arrayList);
        }
        if (igFundedIncentiveIntf.B62() != null) {
            IgFundedIncentiveBannerButtonIntf B62 = igFundedIncentiveIntf.B62();
            if (B62 != null) {
                treeUpdaterJNI = B62.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("first_button", treeUpdaterJNI);
        }
        igFundedIncentiveIntf.BBV();
        A1H.put("has_line_break", Boolean.valueOf(igFundedIncentiveIntf.BBV()));
        if (igFundedIncentiveIntf.BGl() != null) {
            A1H.put("incentive_id", igFundedIncentiveIntf.BGl());
        }
        igFundedIncentiveIntf.CY9();
        A1H.put("is_navigated_from_bottom_sheet", Boolean.valueOf(igFundedIncentiveIntf.CY9()));
        if (igFundedIncentiveIntf.BXa() != null) {
            A1H.put("nux_dialog_subtitle", igFundedIncentiveIntf.BXa());
        }
        if (igFundedIncentiveIntf.BXb() != null) {
            A1H.put("nux_dialog_title", igFundedIncentiveIntf.BXb());
        }
        if (igFundedIncentiveIntf.BXc() != null) {
            IgFundedIncentiveNuxDisplayStyle BXc = igFundedIncentiveIntf.BXc();
            0qQ.A0B(BXc, 0);
            A1H.put("nux_display_style", BXc.A00);
        }
        if (igFundedIncentiveIntf.BqQ() != null) {
            IgFundedIncentiveBannerButtonIntf BqQ = igFundedIncentiveIntf.BqQ();
            if (BqQ != null) {
                treeUpdaterJNI2 = BqQ.FHC();
            }
            A1H.put("second_button", treeUpdaterJNI2);
        }
        igFundedIncentiveIntf.Bum();
        A1H.put("should_show_shop_eligible_items_button", Boolean.valueOf(igFundedIncentiveIntf.Bum()));
        if (igFundedIncentiveIntf.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, igFundedIncentiveIntf.getTitle());
        }
        return 0Yt.A0B(A1H);
    }
}
