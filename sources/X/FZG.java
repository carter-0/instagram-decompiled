package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity;

public final class FZG implements C262424Dq {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ IgFollowerShareToStoryUrlHandlerActivity A02;

    public FZG(Bundle bundle, UserSession userSession, IgFollowerShareToStoryUrlHandlerActivity igFollowerShareToStoryUrlHandlerActivity) {
        this.A02 = igFollowerShareToStoryUrlHandlerActivity;
        this.A01 = userSession;
        this.A00 = bundle;
    }

    public final void CyE(Bitmap bitmap) {
        IgFollowerShareToStoryUrlHandlerActivity igFollowerShareToStoryUrlHandlerActivity = this.A02;
        UserSession userSession = this.A01;
        Bundle bundle = this.A00;
        0qQ.A0A(bitmap);
        IgFollowerShareToStoryUrlHandlerActivity.A00(bitmap, bundle, userSession, igFollowerShareToStoryUrlHandlerActivity);
    }
}
