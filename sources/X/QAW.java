package X;

import android.content.ComponentName;
import com.spotify.sdk.android.auth.AuthorizationRequest;

public final class QAW extends SVM {
    public final /* synthetic */ AuthorizationRequest A00;
    public final /* synthetic */ C12817T8h A01;

    public QAW(AuthorizationRequest authorizationRequest, C12817T8h t8h) {
        this.A01 = t8h;
        this.A00 = authorizationRequest;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C12817T8h t8h = this.A01;
        t8h.A02 = null;
        t8h.A01 = null;
    }
}
