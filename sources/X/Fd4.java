package X;

import android.content.Intent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.mainactivity.InstagramMainActivity;

public final class Fd4 implements MVB {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public Fd4(UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A00 = userSession;
        this.A01 = instagramMainActivity;
    }

    public final void onButtonClick(View view) {
        UserSession userSession = this.A00;
        InstagramMainActivity instagramMainActivity = this.A01;
        Intent intent = new Intent(instagramMainActivity, MediaCaptureActivity.class);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        AnonymousClass0b5.A00(instagramMainActivity, intent, 100);
    }
}
