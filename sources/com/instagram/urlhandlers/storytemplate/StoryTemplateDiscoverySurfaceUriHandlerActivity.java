package com.instagram.urlhandlers.storytemplate;

import X.0qQ;
import X.AnonymousClass7TE;
import X.DbU;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class StoryTemplateDiscoverySurfaceUriHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.urlhandlers.storytemplate.StoryTemplateDiscoverySurfaceUriHandlerActivity, android.app.Activity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        DbU.A0w(this, AnonymousClass7TE.A0a(), userSession, ModalActivity.class, "story_template_discovery_surface");
    }
}
