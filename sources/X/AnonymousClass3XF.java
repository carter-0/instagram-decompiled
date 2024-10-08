package X;

import android.view.Choreographer;
import com.facebook.litho.ComponentTree;

/* renamed from: X.3XF  reason: invalid class name */
public final class AnonymousClass3XF implements Choreographer.FrameCallback {
    public final /* synthetic */ AnonymousClass3XE A00;

    public AnonymousClass3XF(AnonymousClass3XE r1) {
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        AnonymousClass3XE r3 = this.A00;
        String str = (String) r3.A03.getAndSet("");
        if (r3.A02.getAndSet(0) > 0) {
            ComponentTree componentTree = r3.A05;
            if (str == null) {
                str = 002.A0g("<cls>", componentTree.A0V.A01.getClass().getName(), "</cls>");
            }
            componentTree.A0R(true, str);
        }
    }
}
