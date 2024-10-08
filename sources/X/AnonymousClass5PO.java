package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.5PO  reason: invalid class name */
public final class AnonymousClass5PO extends ThreadLocal {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        Choreographer instance = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            AnonymousClass5PM r1 = new AnonymousClass5PM(Handler.createAsync(myLooper), instance);
            return AnonymousClass199.A02(r1, r1.A06);
        }
        throw new IllegalStateException("no Looper on this thread");
    }
}
