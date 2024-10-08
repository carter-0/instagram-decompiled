package X;

import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AQ9 implements Y96 {
    public final int A00;
    public final Object A01;

    public AQ9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean ACL() {
        UserSession userSession;
        AtomicBoolean atomicBoolean;
        int i = this.A00;
        C3501083h r1 = IgVoltronModelLoader.Companion;
        switch (i) {
            case 1:
                atomicBoolean = r1.A00(((C21444Xaw) this.A01).A03).arePytorchLibrariesLoaded;
                break;
            case 3:
                userSession = (UserSession) this.A01;
                break;
            default:
                userSession = ((C21444Xaw) this.A01).A03;
                break;
        }
        atomicBoolean = r1.A00(userSession).areExecuTorchLibrariesLoaded;
        return atomicBoolean.get();
    }
}
