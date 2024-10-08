package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.ml.hashtag.IgContextualHashtagsProcessor;

/* renamed from: X.JfV  reason: case insensitive filesystem */
public final class C60089JfV extends C361478gI {
    public final IgContextualHashtagsProcessor A00;
    public final 05G A01 = C51967G9n.A0u();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60089JfV(Application application, UserSession userSession) {
        super(application);
        AnonymousClass7TG.A1O(application, userSession);
        this.A00 = new IgContextualHashtagsProcessor(DbT.A05(application), userSession);
    }
}
