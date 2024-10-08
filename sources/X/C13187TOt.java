package X;

import android.content.Context;
import com.instagram.react.impl.IgReactPackage;

/* renamed from: X.TOt  reason: case insensitive filesystem */
public final class C13187TOt implements AnonymousClass0eK {
    public final int A00;
    public final Object A01;

    public C13187TOt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object get() {
        switch (this.A00) {
            case 0:
                return C9272RVx.A00((Context) this.A01);
            case 1:
                return AnonymousClass7TE.A0v();
            default:
                return SAV.A00(((IgReactPackage) this.A01).A00);
        }
    }
}
