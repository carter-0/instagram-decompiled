package X;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: X.4Pl  reason: invalid class name and case insensitive filesystem */
public final class C264324Pl {
    public final Handler A00;
    public final AnonymousClass4PC A01;

    public final void A00(C264344Pn r3) {
        this.A00.post(new C266334Ym(this, r3));
    }

    public final void A01(Object obj) {
        Handler handler = this.A00;
        SystemClock.elapsedRealtime();
        handler.post(new C266344Yn(this, obj));
    }

    public final void A02(String str) {
        this.A00.post(new AnonymousClass4YS(this, str));
    }

    public C264324Pl(Handler handler, AnonymousClass4PC r2) {
        handler.getClass();
        this.A00 = handler;
        this.A01 = r2;
    }
}
