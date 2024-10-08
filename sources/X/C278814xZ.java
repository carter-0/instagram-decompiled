package X;

import com.instagram.pando.parsing.IgPandoServiceJNI;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4xZ  reason: invalid class name and case insensitive filesystem */
public final class C278814xZ implements C278804xY, 0lm {
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public final 1Dm A00;
    public volatile IgPandoServiceJNI A01;

    private IgPandoServiceJNI A00() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = IgPandoServiceJNI.create(this.A00.A00().consistencyService);
                }
            }
        }
        return this.A01;
    }

    public C278814xZ(1Dm r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C13758TgU createApiFrameworkParser(boolean z) {
        return A00().createApiFrameworkParser(z);
    }

    public final void onUserSessionWillEnd(@Deprecated boolean z) {
        A00();
    }
}
