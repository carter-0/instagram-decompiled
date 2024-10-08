package X;

import android.content.Context;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.instagram.common.session.UserSession;
import com.instagram.unifiedfilter.UnifiedFilterManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.LrU  reason: case insensitive filesystem */
public final class C65331LrU implements C66525MVd {
    public UserSession A00;
    public final Context A01;
    public final AtomicBoolean A02 = JTQ.A0k();
    public final AnonymousClass0eM A03;
    public final X98 A04;

    public final void A7D() {
    }

    public final EGLSurface ANO(Object obj) {
        return null;
    }

    public final void ECZ() {
    }

    public final void ErI(LNz lNz) {
        Surface surface = lNz.A00;
        UnifiedFilterManager unifiedFilterManager = (UnifiedFilterManager) this.A03.getValue();
        if (surface != null) {
            unifiedFilterManager.init(this.A00, this.A01.getAssets(), surface);
        } else {
            unifiedFilterManager.init(this.A00, this.A01.getAssets(), (Surface) null);
        }
        this.A02.set(true);
    }

    public final void AOs() {
        if (this.A02.compareAndSet(true, false)) {
            ((UnifiedFilterManager) this.A03.getValue()).cleanup();
        }
    }

    public final X98 Bnh() {
        return this.A04;
    }

    public C65331LrU(Context context, UserSession userSession) {
        this.A01 = context.getApplicationContext();
        this.A00 = userSession;
        0t0 A012 = AnonymousClass0eN.A01(new C20404Wqo(4));
        this.A03 = A012;
        this.A04 = new C65335Lra(A012);
    }
}
