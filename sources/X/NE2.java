package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy;

public final class NE2 extends ConnectFunnelProxy {
    public final /* synthetic */ OWf A00;

    public final McfReference createStructuredLoggerPointer() {
        return null;
    }

    public NE2(OWf oWf) {
        this.A00 = oWf;
    }

    public final String diskCachingCreateDirectory() {
        return 002.A0R("file://", AnonymousClass1F2.A00().AXT((1LJ) null, 2027409170).getPath());
    }

    public final boolean diskCachingIsEnabled() {
        return 182.A06(0Tu.A05, this.A00.A02, 2342166677212704112L);
    }
}
