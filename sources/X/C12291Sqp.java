package X;

import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.Systrace;
import java.lang.ref.WeakReference;

/* renamed from: X.Sqp  reason: case insensitive filesystem */
public final class C12291Sqp implements AnonymousClass0f6 {
    public final WeakReference A00;

    public final void Dsp() {
        CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.A00.get();
        if (catalystInstanceImpl != null) {
            ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
        }
    }

    public final void Dsr() {
        CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.A00.get();
        if (catalystInstanceImpl != null) {
            ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
        }
    }

    public C12291Sqp(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = C51965G9l.A0v(catalystInstanceImpl);
    }
}
