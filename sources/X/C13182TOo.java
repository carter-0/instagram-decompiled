package X;

import com.facebook.react.uimanager.ViewManager;
import com.fbpay.ptt.impl.javacpp.ServerCertsVerifierImpl;
import java.util.Collections;
import java.util.Locale;

/* renamed from: X.TOo  reason: case insensitive filesystem */
public final class C13182TOo implements AnonymousClass0eK {
    public final int A00;

    public C13182TOo(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.A00) {
            case 0:
                return Locale.getDefault();
            case 1:
                return SSI.A02();
            case 2:
                return new C267704c4(Collections.emptyList());
            case 3:
                return new ViewManager((QZK) null);
            default:
                return new ServerCertsVerifierImpl();
        }
    }
}
