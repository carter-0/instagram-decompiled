package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.8fz  reason: invalid class name and case insensitive filesystem */
public abstract class C361288fz {
    /* JADX WARNING: type inference failed for: r7v0, types: [X.8g3, java.lang.Object] */
    public static final ClipsDraftRepository A00(Activity activity, UserSession userSession) {
        0qQ.A0B(activity, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        Application application = activity.getApplication();
        0qQ.A07(application);
        ClipsDraftLocalDataSource A00 = 2MV.A00(application, userSession);
        Context applicationContext = activity.getApplicationContext();
        0qQ.A0A(applicationContext);
        0qQ.A0B(applicationContext, 0);
        2Nn A002 = 2Nm.A00(applicationContext, userSession);
        PendingMediaStore A003 = 28K.A00(userSession);
        C361308g1 A004 = C361298g0.A00(applicationContext, userSession);
        C361318g2 r8 = new C361318g2(28K.A00(userSession));
        return new ClipsDraftRepository(applicationContext, A004, A00, userSession2, new Object(), r8, A003, A002, 1Au.A00(userSession2), 182.A06(0Tu.A05, userSession, 36324084610838304L));
    }
}
