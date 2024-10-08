package X;

import java.util.LinkedList;

/* renamed from: X.AQl  reason: case insensitive filesystem */
public final class C40081AQl implements C341737nR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C40081AQl(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onError(Throwable th) {
        if (this.A00 != 0) {
            C341647nI r0 = (C341647nI) this.A01;
            C341567nA r1 = r0.A03;
            long A0Q = AnonymousClass7TE.A0Q(this);
            r1.Cjw(new C382309dU(th), "recording_controller_error", "RecordingControllerImpl", r0.A04.A02(), "low", "Warmup", A0Q);
            ((C341737nR) this.A02).onError(th);
            return;
        }
        A9U a9u = (A9U) this.A01;
        synchronized (a9u) {
            a9u.A02 = true;
            C18091VlL.A01(a9u.A03, a9u.A04, th);
            while (true) {
                LinkedList linkedList = a9u.A05;
                if (!linkedList.isEmpty()) {
                    ((Runnable) linkedList.pop()).run();
                }
            }
        }
    }

    public final void onSuccess() {
        if (this.A00 != 0) {
            ((C341737nR) this.A02).onSuccess();
            return;
        }
        A9U a9u = (A9U) this.A01;
        synchronized (a9u) {
            int addAndGet = a9u.A06.addAndGet(1);
            if (a9u.A02) {
                Runnable runnable = (Runnable) this.A02;
                if (runnable != null) {
                    runnable.run();
                }
            } else if (!a9u.A01 || addAndGet != a9u.A00) {
                Object obj = this.A02;
                if (obj != null) {
                    a9u.A05.add(obj);
                }
            } else {
                Object obj2 = this.A02;
                if (obj2 != null) {
                    a9u.A05.add(obj2);
                }
                C18091VlL.A00(a9u.A03, a9u.A04);
            }
        }
    }
}
