package com.instagram.debug.devoptions.sandboxselector;

import X.0eS;
import X.0sL;
import X.1XQ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import com.instagram.debug.devoptions.sandboxselector.IgServerHealth;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.DevServerApi$checkServerConnectionHealth$2", f = "DevServerApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DevServerApi$checkServerConnectionHealth$2 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object L$0;
    public int label;

    public DevServerApi$checkServerConnectionHealth$2(AnonymousClass4D7 r2) {
        super(2, r2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.debug.devoptions.sandboxselector.DevServerApi$checkServerConnectionHealth$2] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r3) {
        ? devServerApi$checkServerConnectionHealth$2 = new DevServerApi$checkServerConnectionHealth$2(r3);
        devServerApi$checkServerConnectionHealth$2.L$0 = obj;
        return devServerApi$checkServerConnectionHealth$2;
    }

    public final Object invoke(IgServerHealthCheckResponse igServerHealthCheckResponse, AnonymousClass4D7 r4) {
        DevServerApi$checkServerConnectionHealth$2 devServerApi$checkServerConnectionHealth$2 = new DevServerApi$checkServerConnectionHealth$2(r4);
        devServerApi$checkServerConnectionHealth$2.L$0 = igServerHealthCheckResponse;
        return devServerApi$checkServerConnectionHealth$2.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            0eS.A00(obj);
            int i = ((1XQ) this.L$0).mStatusCode;
            if (i == 200) {
                return IgServerHealth.Healthy.INSTANCE;
            }
            return new IgServerHealth.Unhealthy(IgServerHealth.Unhealthy.UnhealthyReason.Companion.fromHttpStatusCode(i));
        }
        throw AnonymousClass7TE.A0x();
    }
}
