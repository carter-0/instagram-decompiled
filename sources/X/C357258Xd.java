package X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: X.8Xd  reason: invalid class name and case insensitive filesystem */
public final class C357258Xd extends ContentObserver {
    public final /* synthetic */ AnonymousClass8XZ A00;
    public final /* synthetic */ Runnable A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C357258Xd(Handler handler, AnonymousClass8XZ r2, Runnable runnable) {
        super(handler);
        this.A00 = r2;
        this.A01 = runnable;
    }

    public final void onChange(boolean z) {
        Handler handler = this.A00.A09;
        handler.removeCallbacksAndMessages((Object) null);
        handler.postDelayed(this.A01, 300);
    }
}
