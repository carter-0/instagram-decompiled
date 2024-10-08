package X;

import com.facebook.cameracore.mediapipeline.dataproviders.javascriptmodules.implementation.JavascriptModulesDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class ARY implements C41792B0w {
    public final ArrayList AEY(C371698yt r5) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(r5.A03(AnonymousClass7TE.A1D(Arrays.asList(new C371628yi[]{C371678yq.A01, C372008zW.A01}))));
        0KC.A0O("AREngineService", "Configuration size: %d", AnonymousClass7TF.A1b(A1C.size()));
        C371628yi r1 = C380929ak.A02;
        if (C371698yt.A01(r5, r1)) {
            A1C.add(new JavascriptModulesDataProviderConfigurationHybrid((C380929ak) r5.A02(r1)));
        }
        for (C39674A4o serviceMessageChannelHybrid : 00k.A0X(Collections.unmodifiableMap(r5.A00).values())) {
            A1C.add(new ServiceMessageChannelHybrid(serviceMessageChannelHybrid));
        }
        return A1C;
    }
}
