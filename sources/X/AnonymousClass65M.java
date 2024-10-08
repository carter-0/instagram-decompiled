package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;

/* renamed from: X.65M  reason: invalid class name */
public final class AnonymousClass65M implements 2LV {
    public final Class BTf() {
        return CryptoContextHolder.class;
    }

    public final long CAr() {
        long j = CryptoContextHolder.sMcfTypeId;
        if (j != 0) {
            return j;
        }
        long nativeGetMcfTypeId = CryptoContextHolder.nativeGetMcfTypeId();
        CryptoContextHolder.sMcfTypeId = nativeGetMcfTypeId;
        return nativeGetMcfTypeId;
    }

    public final /* bridge */ /* synthetic */ Object AJq(McfReference mcfReference) {
        return CryptoContextHolder.createFromMcfType(mcfReference);
    }
}
