package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.5PN  reason: invalid class name */
public final class AnonymousClass5PN extends 0Yg implements C62320sa {
    public static final AnonymousClass5PN A00 = new AnonymousClass5PN();

    public AnonymousClass5PN() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Choreographer choreographer;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            choreographer = Choreographer.getInstance();
        } else {
            AnonymousClass4CZ r0 = AnonymousClass12W.A00;
            choreographer = (Choreographer) C67351tA.A00(AnonymousClass12y.A00, new MEQ(1, (AnonymousClass4D7) null));
        }
        AnonymousClass5PM r1 = new AnonymousClass5PM(Handler.createAsync(Looper.getMainLooper()), choreographer);
        return AnonymousClass199.A02(r1, r1.A06);
    }
}
