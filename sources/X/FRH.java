package X;

import android.os.Bundle;
import com.bloks.foa.core.lifecycles.impl.NativeLifecycleCallback$NativeCallback;

public final class FRH implements C51893G6j {
    public final NativeLifecycleCallback$NativeCallback A00;
    public final Integer A01 = AnonymousClass05K.A01;

    public final Integer CAj() {
        return this.A01;
    }

    public final void Ezo(String str, Bundle bundle) {
        bundle.putParcelable(str, this.A00);
    }

    public FRH(NativeLifecycleCallback$NativeCallback nativeLifecycleCallback$NativeCallback) {
        this.A00 = nativeLifecycleCallback$NativeCallback;
    }
}
