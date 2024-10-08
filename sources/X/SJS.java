package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class SJS {
    public static final SJS A01 = new SJS();
    public final AtomicReference A00 = new AtomicReference();

    public final int hashCode() {
        return Pxf.A08((Object) null);
    }

    public final boolean A01() {
        AtomicReference atomicReference = this.A00;
        if (atomicReference.get() != null) {
            return AnonymousClass7TE.A1a(atomicReference.get());
        }
        boolean A1R = AnonymousClass7TF.A1R(SU6.A00((Context) SO3.A00().A01(Context.class), "com.google.mlkit.dynamite.text.latin"));
        atomicReference.set(Boolean.valueOf(A1R));
        return A1R;
    }

    public final boolean equals(Object obj) {
        if (obj == this || (obj instanceof SJS)) {
            return true;
        }
        return false;
    }

    public final String A00() {
        if (true != A01()) {
            return "play-services-mlkit-text-recognition";
        }
        return "text-recognition";
    }
}
