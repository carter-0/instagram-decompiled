package com.instagram.aistudio.deeplink;

import X.0KC;
import X.0Tu;
import X.0qQ;
import X.182;
import X.1Ln;
import X.AnonymousClass0t1;
import X.AnonymousClass6W8;
import X.AnonymousClass7TG;
import X.DbT;
import X.LTH;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class AiSettingsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.instagram.aistudio.deeplink.AiSettingsUrlHandlerActivity, android.app.Activity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        String string;
        AnonymousClass7TG.A1O(userSession, bundle2);
        AnonymousClass0t1.A01.A01(userSession);
        if (182.A06(0Tu.A05, userSession, 36324076020707063L) && (string = bundle2.getString("original_url")) != null) {
            Uri A09 = DbT.A09(string);
            String queryParameter = A09.getQueryParameter("persona_id");
            if (queryParameter == null || queryParameter.length() == 0) {
                0KC.A0E("AiSettingsUrlHandlerActivity", "Persona id is invalid");
                return;
            }
            String queryParameter2 = A09.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            1Ln A00 = LTH.A00(new LTH(userSession));
            if (DbT.A1Y(A00)) {
                A00.A0l("thread_view_edit_ai_confirmation_admin_text_clicked");
                A00.Cgf();
            }
            if (0qQ.A0K(queryParameter2, "in_thread_admin_text")) {
                1Ln A002 = LTH.A00(new LTH(userSession));
                if (DbT.A1Y(A002)) {
                    A002.A0l("thread_view_edit_ai_confirmation_admin_text_clicked");
                    A002.Cgf();
                }
            }
            Bundle bundle3 = new Bundle(0);
            bundle3.putString("persona_id", queryParameter);
            AnonymousClass6W8.A03(this, bundle3, userSession, ModalActivity.class, "AI_SETTINGS").A0C(this);
        }
        finish();
    }
}
