package X;

import java.lang.ref.WeakReference;
import java.util.Queue;

/* renamed from: X.2q6  reason: invalid class name */
public final class AnonymousClass2q6 implements C61110lV {
    public WeakReference A00;
    public Queue A01;

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(125737015);
        Queue<1Ln> queue = this.A01;
        synchronized (queue) {
            try {
                for (1Ln r2 : queue) {
                    r2.A0R("spinner_outcome", "app_background");
                    r2.Cgf();
                }
                queue.clear();
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0fD.A0A(229346996, A03);
                    throw th;
                }
            }
        }
        if (this.A00.get() == null) {
            14i.A06(this);
        }
        AnonymousClass0fD.A0A(-1016606906, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(-138168952);
        if (this.A00.get() == null) {
            14i.A06(this);
        }
        AnonymousClass0fD.A0A(782321150, A03);
    }
}
