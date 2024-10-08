package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository;
import com.instagram.clips.drafts.model.datasource.ClipsImportDraftDataSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.72M  reason: invalid class name */
public final class AnonymousClass72M extends C228042kh {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public AnonymousClass72M(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        Application application = fragmentActivity.getApplication();
        0qQ.A07(application);
        UserSession userSession = this.A01;
        1Av A002 = 1Au.A00(userSession);
        Context applicationContext = fragmentActivity.getApplication().getApplicationContext();
        0qQ.A07(applicationContext);
        2Nn A003 = 2Nm.A00(applicationContext, userSession);
        2MU r1 = ClipsDraftPreviewItemRepository.A09;
        Application application2 = fragmentActivity.getApplication();
        0qQ.A07(application2);
        ClipsDraftPreviewItemRepository A004 = r1.A00(application2, userSession);
        Context applicationContext2 = fragmentActivity.getApplication().getApplicationContext();
        0qQ.A07(applicationContext2);
        ClipsImportDraftDataSource clipsImportDraftDataSource = new ClipsImportDraftDataSource(userSession, applicationContext2);
        return new AnonymousClass72N(application, A004, new ClipsNetworkImportDraftRepository(applicationContext2, 2MV.A00(applicationContext2, userSession), clipsImportDraftDataSource, userSession, AnonymousClass72R.A00(applicationContext2, userSession), 2Nm.A00(applicationContext2, userSession)), userSession, AnonymousClass72U.A00(fragmentActivity, userSession), A003, A002);
    }
}
