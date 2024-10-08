package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;
import com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator;

/* renamed from: X.9jQ  reason: invalid class name and case insensitive filesystem */
public final class C385719jQ extends C228042kh {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final Integer A03;

    public C385719jQ(Context context, UserSession userSession, Integer num, int i) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = num;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 0);
        QuickSnapArchiveRepository quickSnapArchiveRepository = new QuickSnapArchiveRepository(new QuickSnapApi(userSession));
        1ud r0 = 1ua.A0G;
        Context context = this.A01;
        QuickSnapRepository A002 = C359048bt.A00(userSession, r0.A01(context, userSession));
        int i = this.A00;
        return new QuickSnapArchiveViewModel(userSession, 1Au.A00(userSession), quickSnapArchiveRepository, A002, new QuickSnapMediaSaver(context), new QuickSnapRecapVideoGenerator(context, i), this.A03, i);
    }
}
