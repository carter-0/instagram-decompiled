package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public final class UIW extends AnonymousClass763 implements Animatable {
    public boolean A00;
    public final C226492gu A01;

    public UIW(C226492gu r2) {
        super((Drawable) r2);
        this.A01 = r2;
    }

    public final boolean isRunning() {
        return this.A00;
    }

    public final void start() {
        this.A01.E2p();
        this.A00 = true;
    }

    public final void stop() {
        this.A01.pause();
        this.A00 = false;
    }
}
