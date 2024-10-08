package X;

import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.common.session.UserSession;

public final class AQ8 implements Y96 {
    public final /* synthetic */ C354158Kw A00;

    public AQ8(C354158Kw r1) {
        this.A00 = r1;
    }

    public final boolean ACL() {
        C3501083h r2 = IgVoltronModelLoader.Companion;
        UserSession userSession = this.A00.A03;
        if (!r2.A00(userSession).arePytorchLibrariesLoaded.get() || !r2.A00(userSession).areSentencePieceLibrariesLoaded.get()) {
            return false;
        }
        return true;
    }
}
