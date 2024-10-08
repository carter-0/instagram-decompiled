package com.instagram.creator.agent.settings.deeplink;

import X.0KC;
import X.AnonymousClass6W8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273654mx;
import X.C71041OaE;
import X.DbY;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;
import com.instagram.user.model.User;

public final class CreatorAICreatorNuxUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.creator.agent.settings.deeplink.CreatorAICreatorNuxUrlHandlerActivity, android.app.Activity, com.instagram.urlhandler.UserSessionUrlHandlerActivity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, bundle2);
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        if (C71041OaE.A02(userSession)) {
            AnonymousClass6W8.A03(this, AnonymousClass7TG.A0P("creator_ai_creator_igid", A0Q.getId(), AnonymousClass7TE.A1L("creator_ai_entry_point_extra", "your_tools_creator_ai")), userSession, ModalActivity.class, "creator_ai_settings").A0A(this, 107);
            finish();
        }
        if (!C71041OaE.A01(userSession)) {
            0KC.A0E("CreatorAICreationNuxUrlHandlerActivity", "User is not eligible to create a creator ai");
        } else {
            AnonymousClass6W8 A03 = AnonymousClass6W8.A03(this, DbY.A0B("creator_ai_entry_point_extra", bundle2.getString("entryPoint")), this.A00, ModalActivity.class, C273654mx.A00(469));
            A03.A07 = false;
            A03.A0C(this);
        }
        finish();
    }
}
