package com.instagram.urlhandlers.directmanagefolders;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C309516Yo;
import X.C68457NIv;
import X.C68459NIx;
import X.DbS;
import X.DbV;
import X.Dba;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class DirectManageFoldersUriHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        Uri parse;
        C309516Yo A0B;
        Fragment nIv;
        AnonymousClass7TG.A1O(userSession, bundle2);
        String A0m = DbS.A0m(bundle2);
        if (A0m != null && (parse = Uri.parse(A0m)) != null) {
            String queryParameter = parse.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (queryParameter == null) {
                queryParameter = "unknown";
            }
            String host = parse.getHost();
            if (host != null) {
                int hashCode = host.hashCode();
                if (hashCode != 1886617835) {
                    if (hashCode == 2021369105 && host.equals("create_folder")) {
                        AnonymousClass7TE.A0a().putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
                        A0B = Dba.A0B(this, userSession);
                        A0B.A08();
                        nIv = new C68459NIx();
                    } else {
                        return;
                    }
                } else if (host.equals("manage_folders")) {
                    A0B = Dba.A0B(this, userSession);
                    A0B.A08();
                    nIv = new C68457NIv();
                    nIv.setArguments(DbV.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter));
                } else {
                    return;
                }
                A0B.A0D(nIv);
                A0B.A04();
            }
        }
    }
}
