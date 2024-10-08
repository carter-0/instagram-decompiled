package com.instagram.video.live.mvvm.model.datasource.api;

import X.0qQ;
import X.15p;
import X.1NY;
import X.AnonymousClass0r6;
import X.AnonymousClass7TG;
import X.C334247ax;
import X.C334257ay;
import X.DbT;
import com.instagram.common.session.UserSession;

public final class IgLiveViewerListApi {
    public final UserSession A00;

    public IgLiveViewerListApi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final AnonymousClass0r6 A00(String str) {
        0qQ.A0B(str, 0);
        1NY A0b = AnonymousClass7TG.A0b(this.A00);
        A0b.A0K("live/%s/get_viewer_list/", new Object[]{str});
        return DbT.A0R((15p) null, A0b, C334247ax.class, C334257ay.class, true).A03(479941114);
    }
}
