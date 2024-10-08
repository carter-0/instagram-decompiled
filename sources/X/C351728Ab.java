package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;

/* renamed from: X.8Ab  reason: invalid class name and case insensitive filesystem */
public final class C351728Ab extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public C351728Ab(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r3, 3);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Context context = this.A00;
        UserSession userSession = this.A02;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        context.getApplicationContext();
        C351738Ad r2 = (C351738Ad) userSession.A01(C351738Ad.class, new C66297MMg(userSession, 39));
        return new StoryDraftsCreationViewModel(this.A01, userSession, new C351798Al(new C351778Aj(r2), new C351768Ah(r2), new AnonymousClass8Ai(r2), new C351788Ak(r2)));
    }
}
