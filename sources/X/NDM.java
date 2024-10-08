package X;

import com.facebook.rsys.moderator.gen.ModeratorApi;
import com.facebook.rsys.moderator.gen.ModeratorProxy;

public final class NDM extends ModeratorProxy {
    public ModeratorApi A00;

    public final void setApi(ModeratorApi moderatorApi) {
        0qQ.A0B(moderatorApi, 0);
        this.A00 = moderatorApi;
    }

    public final void userWasSoftMuted() {
    }
}
