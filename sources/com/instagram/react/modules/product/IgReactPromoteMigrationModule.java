package com.instagram.react.modules.product;

import X.17k;
import X.QZK;
import X.XA9;
import X.XAI;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeIGPromoteMigrationReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

@ReactModule(name = "IGPromoteMigrationReactModule")
public class IgReactPromoteMigrationModule extends NativeIGPromoteMigrationReactModuleSpec {
    public static final String MODULE_NAME = "IGPromoteMigrationReactModule";

    public String getName() {
        return "IGPromoteMigrationReactModule";
    }

    public void postDataFromCreateEditAudienceScreen(double d, String str) {
        if (!TextUtils.isEmpty(str)) {
            17k.A0G(getCurrentActivity() instanceof PromoteActivity, "module must be managed by PromoteActivity to get current PromoteState");
            PromoteData Bhh = ((XAI) getCurrentActivity()).Bhh();
            PromoteState Bhj = ((XA9) getCurrentActivity()).Bhj();
            Bhj.A09(Bhh, str);
            Bhj.A0C(false);
        }
    }

    public void postDataFromDestinationWebsiteScreen(double d, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            17k.A0G(getCurrentActivity() instanceof PromoteActivity, "module must be managed by PromoteActivity to get current PromoteState");
            PromoteData Bhh = ((XAI) getCurrentActivity()).Bhh();
            ((XA9) getCurrentActivity()).Bhj().A04(XIGIGBoostDestination.WEBSITE_CLICK, Bhh);
            Bhh.A0b = XIGIGBoostCallToAction.valueOf(str2);
            Bhh.A1I = str;
        }
    }

    public IgReactPromoteMigrationModule(QZK qzk) {
        super(qzk);
    }
}
