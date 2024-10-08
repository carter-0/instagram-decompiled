package com.instagram.urlhandlers.channelsgatedcontent;

import X.0qQ;
import X.1bJ;
import X.AnonymousClass3U9;
import X.AnonymousClass6W8;
import X.AnonymousClass7TE;
import X.C66581MXm;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class DirectChannelsGatedContentUpsellUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.urlhandlers.channelsgatedcontent.DirectChannelsGatedContentUpsellUrlHandlerActivity, android.app.Activity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        int A02 = DbW.A02(1, userSession, bundle2);
        String A0m = DbS.A0m(bundle2);
        if (A0m == null) {
            A0m = "";
        }
        if (A0m.length() != 0) {
            Uri A09 = DbT.A09(A0m);
            if ("instagram".equalsIgnoreCase(A09.getScheme()) && "thread".equalsIgnoreCase(A09.getHost()) && DbV.A03(A09) == A02 && "show_gated_channel_content_upsell".equalsIgnoreCase(AnonymousClass7TE.A19(A09.getPathSegments(), 1))) {
                String str = DbT.A09(A0m).getPathSegments().get(0);
                0qQ.A07(str);
                AnonymousClass3U9 A0a = C66581MXm.A0a(1bJ.A00(userSession), str);
                if (A0a != null && !A0a.COP()) {
                    Bundle A0a2 = AnonymousClass7TE.A0a();
                    A0a2.putString("bottom_sheet_content_fragment", "direct_channels_gated_content_upsell");
                    A0a2.putBoolean("finish_host_activity_on_dismissed", true);
                    String str2 = DbT.A09(A0m).getPathSegments().get(0);
                    0qQ.A07(str2);
                    A0a2.putString("channel_thread_key", str2);
                    AnonymousClass6W8 A0b = DbS.A0b(this, A0a2, userSession, TransparentModalActivity.class, "bottom_sheet");
                    A0b.A0G = true;
                    A0b.A0J = ModalActivity.A08;
                    A0b.A0C(this);
                }
            }
        }
        finish();
    }
}
