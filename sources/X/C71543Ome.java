package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.devxagent.gen.DevXAgentAppProxy;

/* renamed from: X.Ome  reason: case insensitive filesystem */
public final class C71543Ome implements 2LV {
    public final Class BTf() {
        return DevXAgentAppProxy.class;
    }

    public final long CAr() {
        long j = DevXAgentAppProxy.CProxy.sMcfTypeId;
        if (j != 0) {
            return j;
        }
        long nativeGetMcfTypeId = DevXAgentAppProxy.CProxy.nativeGetMcfTypeId();
        DevXAgentAppProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId;
        return nativeGetMcfTypeId;
    }

    public final /* bridge */ /* synthetic */ Object AJq(McfReference mcfReference) {
        return DevXAgentAppProxy.CProxy.createFromMcfType(mcfReference);
    }
}
