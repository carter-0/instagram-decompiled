package X;

import android.os.Handler;

/* renamed from: X.63v  reason: invalid class name */
public final class AnonymousClass63v implements AnonymousClass69D {
    public final /* synthetic */ AnonymousClass63T A00;

    public AnonymousClass63v(AnonymousClass63T r1) {
        this.A00 = r1;
    }

    public final void Cxi(boolean z) {
        Handler handler = this.A00.A06;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
