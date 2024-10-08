package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.devxagent.gen.DevXAgentCallStartParams;

/* renamed from: X.Omf  reason: case insensitive filesystem */
public final class C71544Omf implements 2LV {
    public final Class BTf() {
        return DevXAgentCallStartParams.class;
    }

    public final long CAr() {
        long j = DevXAgentCallStartParams.sMcfTypeId;
        if (j != 0) {
            return j;
        }
        long nativeGetMcfTypeId = DevXAgentCallStartParams.nativeGetMcfTypeId();
        DevXAgentCallStartParams.sMcfTypeId = nativeGetMcfTypeId;
        return nativeGetMcfTypeId;
    }

    public final /* bridge */ /* synthetic */ Object AJq(McfReference mcfReference) {
        return DevXAgentCallStartParams.createFromMcfType(mcfReference);
    }
}
