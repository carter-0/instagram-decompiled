package X;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;

/* renamed from: X.Sp7  reason: case insensitive filesystem */
public final class C12208Sp7 implements Callback {
    public boolean A00 = false;
    public final int A01;
    public final C13568Tco A02;

    public final void invoke(Object... objArr) {
        if (!this.A00) {
            this.A02.invokeCallback(this.A01, Arguments.fromJavaArgs(objArr));
            this.A00 = true;
            return;
        }
        throw AnonymousClass7TE.A15("Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
    }

    public C12208Sp7(C13568Tco tco, int i) {
        this.A02 = tco;
        this.A01 = i;
    }
}
