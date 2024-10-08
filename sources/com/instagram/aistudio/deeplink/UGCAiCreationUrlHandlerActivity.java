package com.instagram.aistudio.deeplink;

import X.0Tu;
import X.0qQ;
import X.182;
import X.AnonymousClass000;
import X.AnonymousClass0t1;
import X.AnonymousClass6W8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273654mx;
import X.DbT;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.modal.ModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class UGCAiCreationUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.aistudio.deeplink.UGCAiCreationUrlHandlerActivity, android.app.Activity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        String string;
        Class<ModalActivity> cls;
        String str;
        AnonymousClass6W8 A03;
        AnonymousClass7TG.A1O(userSession, bundle2);
        AnonymousClass0t1.A01.A01(userSession);
        if (182.A06(0Tu.A05, userSession, 36324076020707063L) && (string = bundle2.getString("original_url")) != null) {
            Uri A09 = DbT.A09(string);
            if ("ugc_quick_create".equals(A09.getAuthority())) {
                String queryParameter = A09.getQueryParameter(DevServerEntity.COLUMN_DESCRIPTION);
                String queryParameter2 = A09.getQueryParameter("campaign_id");
                String queryParameter3 = A09.getQueryParameter("condition");
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("AiStudioArgumentKeys.creation_entry_point", AnonymousClass000.A00(1263));
                if (queryParameter == null) {
                    A03 = AnonymousClass6W8.A03(this, A0a, userSession, ModalActivity.class, "AI_CREATION_CUSTOM_AI");
                } else {
                    A0a.putString("AiStudioArgumentKeys.creation_ai_description", queryParameter);
                    if (queryParameter2 != null) {
                        A0a.putString("AiStudioArgumentKeys.creation_ai_campaign_id", queryParameter2);
                    }
                    if (queryParameter3 != null) {
                        A0a.putString("AiStudioArgumentKeys.creation_ai_condition", queryParameter3);
                    }
                    A0a.putString(AnonymousClass000.A00(868), A09.getQueryParameter("template_id"));
                    A03 = AnonymousClass6W8.A03(this, A0a, userSession, ModalActivity.class, C273654mx.A00(1181));
                }
            } else {
                String queryParameter4 = A09.getQueryParameter("has_personas");
                Bundle A0a2 = AnonymousClass7TE.A0a();
                boolean A0K = 0qQ.A0K(queryParameter4, "True");
                String queryParameter5 = A09.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                if (A0K) {
                    A0a2.putString("your_ais_entry_point", queryParameter5);
                    cls = ModalActivity.class;
                    str = "YOUR_AIS";
                } else {
                    A0a2.putString("AiStudioArgumentKeys.creation_entry_point", queryParameter5);
                    cls = ModalActivity.class;
                    if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36330204939305483L)) {
                        A03 = AnonymousClass6W8.A03(this, A0a2, userSession, cls, "AI_CREATION_CUSTOM_AI");
                        A03.A08();
                    } else {
                        str = "AI_CREATION_TEMPLATES";
                    }
                }
                A03 = AnonymousClass6W8.A03(this, A0a2, userSession, cls, str);
            }
            A03.A0C(this);
        }
        finish();
    }
}
