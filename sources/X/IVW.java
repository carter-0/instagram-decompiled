package X;

import android.view.View;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaControlSurfaceEnum;
import com.instagram.common.session.UserSession;

public final class IVW implements MVB {
    public final /* synthetic */ MediaControlEventSourceEnum A00;
    public final /* synthetic */ C257873y6 A01;
    public final /* synthetic */ C2360832j A02;
    public final /* synthetic */ 1Xj A03;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public IVW(MediaControlEventSourceEnum mediaControlEventSourceEnum, C257873y6 r2, C2360832j r3, 1Xj r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = mediaControlEventSourceEnum;
        this.A01 = r2;
    }

    public final void onButtonClick(View view) {
        C2360832j r3 = this.A02;
        1Xj r8 = this.A03;
        MediaControlEventSourceEnum mediaControlEventSourceEnum = this.A00;
        C257873y6 r2 = this.A01;
        UserSession userSession = r3.A01;
        C54971Ha4.A00(mediaControlEventSourceEnum, MediaControlSurfaceEnum.UNCONNECTED_FEED, r3.A02, userSession, r8, r3.A04.getSessionId(), true);
        ((AnonymousClass942) r3.A05.getValue()).A00(r8, AnonymousClass05K.A0N);
        if (r2 != null) {
            r8.A0C.EWb(r2);
            r3.A03.AV9();
        }
    }
}
