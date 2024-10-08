package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;

/* renamed from: X.9jO  reason: invalid class name and case insensitive filesystem */
public final class C385699jO extends C228042kh {
    public final Context A00;
    public final UserSession A01;
    public final String A02;

    public C385699jO(Context context, UserSession userSession, String str) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        String str = this.A02;
        1ud r0 = 1ua.A0G;
        Context context = this.A00;
        QuickSnapRepository A002 = C359048bt.A00(userSession, r0.A01(context, userSession));
        0qQ.A0B(userSession, 0);
        return new C60274JiV(userSession, C359088bz.A00(userSession), new QuickSnapArchiveRepository(new QuickSnapApi(userSession)), A002, new QuickSnapMediaSaver(context), str);
    }
}
